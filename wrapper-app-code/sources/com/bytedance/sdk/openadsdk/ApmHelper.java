package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ApmHelper {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19307a = false;

    /* renamed from: b  reason: collision with root package name */
    private static String f19308b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f19309c;

    public static void initApm(Context context, TTAdConfig tTAdConfig) {
        if (!f19307a) {
            f h2 = m.h();
            boolean B = h2.B();
            f19309c = B;
            if (B && !TextUtils.isEmpty(h2.r())) {
                f19308b = tTAdConfig.getAppId();
                String[] strArr = {"com.bytedance.sdk", "com.com.bytedance.overseas.sdk", "com.pgl.sys.ces", "com.bykv.vk"};
                String a2 = j.a(context);
                String r = h2.r();
                try {
                    MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 4506, "4.5.0.6", strArr);
                    initSDK.config().setDeviceId(a2);
                    initSDK.setReportUrl(r);
                    initSDK.addTags("host_appid", f19308b);
                    initSDK.addTags("sdk_version", "4.5.0.6");
                    f19307a = true;
                    b(a2, r);
                } catch (Throwable unused) {
                    l.d("ApmHelper", "init Apm fail or not include Apm module");
                    f19307a = false;
                }
            }
        }
    }

    private static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            m.f().a(a(str), "https://" + str2 + "/monitor/collect/c/session?version_code=" + BuildConfig.VERSION_CODE + "&device_platform=android&aid=" + "10000001");
        }
    }

    private static void b(String str, String str2) {
        a(str, str2);
    }

    public static void reportPvFromBackGround() {
        if (f19309c) {
            a(j.a(m.a()), m.h().r());
        }
    }

    private static JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", "4.5.0.6");
            jSONObject3.put("host_app_id", f19308b);
            jSONObject2.putOpt(OSNotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM, jSONObject3);
            jSONObject2.put("os", APSAnalytics.OS_NAME);
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("channel", "release");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e2) {
            l.e("ApmHelper", e2.getMessage());
        }
        return jSONObject;
    }

    public static boolean isIsInit() {
        return f19307a;
    }
}
