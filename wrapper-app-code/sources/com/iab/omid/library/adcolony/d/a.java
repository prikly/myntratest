package com.iab.omid.library.adcolony.d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

public final class a {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static String c() {
        return APSAnalytics.OS_NAME;
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "deviceType", a());
        b.a(jSONObject, "osVersion", b());
        b.a(jSONObject, "os", c());
        return jSONObject;
    }
}
