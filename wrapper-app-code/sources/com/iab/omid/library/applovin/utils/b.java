package com.iab.omid.library.applovin.utils;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return APSAnalytics.OS_NAME;
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "deviceType", a());
        c.a(jSONObject, "osVersion", c());
        c.a(jSONObject, "os", b());
        return jSONObject;
    }
}
