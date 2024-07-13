package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import io.bidmachine.core.Utils;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONObject;

class Debugger {
    private static final String DIR_NAME = "features";
    private static final String FILE_NAME = "DebugParameters.json";
    private static final String PARAMETER_CONSENT = "consent";
    private static final String PARAMETER_COPPA = "coppa";
    private static final String PARAMETER_ENDPOINT = "endpoint";
    private static final String PARAMETER_GDPR_STRING = "GDPRString";
    private static final String PARAMETER_LOGGING_ENABLED = "loggingEnabled";
    private static final String PARAMETER_SUBJECT_TO_GDPR = "subjectToGDPR";
    private static final String PARAMETER_TEST_MODE = "testMode";
    private static final String PARAMETER_US_PRIVACY_STRING = "usPrivacyString";
    private static final String TAG = "Debugger";

    Debugger() {
    }

    static void setup(Context context) {
        try {
            File file = new File(Utils.getCacheDir(context, DIR_NAME), FILE_NAME);
            if (file.exists()) {
                Log.d(TAG, "Debug file founded");
                JSONObject jSONObject = new JSONObject(Utils.streamToString(new FileInputStream(file)));
                if (jSONObject.has(PARAMETER_LOGGING_ENABLED)) {
                    BidMachine.setLoggingEnabled(jSONObject.optBoolean(PARAMETER_LOGGING_ENABLED));
                }
                if (jSONObject.has(PARAMETER_TEST_MODE)) {
                    BidMachine.setTestMode(jSONObject.optBoolean(PARAMETER_TEST_MODE));
                }
                if (jSONObject.has(PARAMETER_ENDPOINT)) {
                    String optString = jSONObject.optString(PARAMETER_ENDPOINT);
                    if (!TextUtils.isEmpty(optString) && Utils.isHttpUrl(optString)) {
                        BidMachine.setEndpoint(optString);
                    }
                }
                if (jSONObject.has(PARAMETER_COPPA)) {
                    BidMachine.setCoppa(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_COPPA)));
                }
                if (jSONObject.has(PARAMETER_US_PRIVACY_STRING)) {
                    BidMachine.setUSPrivacyString(jSONObject.optString(PARAMETER_US_PRIVACY_STRING));
                }
                if (jSONObject.has(PARAMETER_SUBJECT_TO_GDPR)) {
                    BidMachine.setSubjectToGDPR(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_SUBJECT_TO_GDPR)));
                }
                if (jSONObject.has(PARAMETER_CONSENT)) {
                    boolean optBoolean = jSONObject.optBoolean(PARAMETER_CONSENT);
                    String str = null;
                    if (jSONObject.has(PARAMETER_GDPR_STRING)) {
                        str = jSONObject.optString(PARAMETER_GDPR_STRING);
                    }
                    BidMachine.setConsentConfig(optBoolean, str);
                }
            }
        } catch (Throwable th) {
            Log.w(TAG, th);
        }
    }
}
