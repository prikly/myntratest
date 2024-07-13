package com.appnext.ads;

import android.text.TextUtils;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.Random;
import org.json.JSONArray;

public final class c {
    public static String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            JSONArray jSONArray = new JSONArray(str);
            int nextInt = new Random(System.nanoTime()).nextInt(100);
            new StringBuilder("TemplateRandomizer percent ").append(nextInt);
            int i = 0;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                i += jSONArray.getJSONObject(i2).getInt(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
                if (nextInt < i) {
                    return jSONArray.getJSONObject(i2).getString(OSOutcomeConstants.OUTCOME_ID);
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }
}