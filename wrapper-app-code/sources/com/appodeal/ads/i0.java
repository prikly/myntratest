package com.appodeal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.utils.Log;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.utils.IabUtils;
import org.json.JSONObject;

public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static String f16472a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f16473b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f16474c = false;

    /* renamed from: d  reason: collision with root package name */
    public static JSONObject f16475d = null;

    /* renamed from: e  reason: collision with root package name */
    public static int f16476e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f16477f = true;

    /* renamed from: g  reason: collision with root package name */
    public static Boolean f16478g;

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f16479h;

    public static void a(Context context, JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (!(context == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject("app_data")) == null)) {
            if (optJSONObject.has(IabUtils.KEY_STORE_URL)) {
                f16473b = optJSONObject.optString(IabUtils.KEY_STORE_URL, f16473b);
            } else {
                StringBuilder a2 = h0.a("https://play.google.com/store/apps/details?id=");
                a2.append(context.getPackageName());
                f16473b = a2.toString();
            }
            String optString = optJSONObject.optString("name");
            f16472a = optString;
            if (TextUtils.isEmpty(optString)) {
                try {
                    f16472a = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
                } catch (Exception e2) {
                    Log.log(e2);
                }
            }
            if (optJSONObject.has("paid")) {
                optJSONObject.optInt("paid");
            }
            optJSONObject.optString("publisher", "");
            if (optJSONObject.has(OSOutcomeConstants.OUTCOME_ID)) {
                String.valueOf(optJSONObject.optInt(OSOutcomeConstants.OUTCOME_ID));
            }
            f16475d = optJSONObject.optJSONObject("ext");
            f16476e = optJSONObject.optInt("ad_box_size");
            f16477f = optJSONObject.optBoolean("hr", true);
        }
        a(jSONObject);
        if (jSONObject != null) {
            f16474c = jSONObject.optBoolean("corona");
        }
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(Constants.FOR_KIDS)) {
            boolean a2 = a();
            f16479h = Boolean.valueOf(jSONObject.optBoolean(Constants.FOR_KIDS, false));
            if (a2 != a()) {
                r0.d();
            }
        }
    }

    public static boolean a() {
        Boolean bool = f16478g;
        if (bool == null && (bool = f16479h) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
