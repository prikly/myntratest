package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.w;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.o;
import com.bytedance.sdk.openadsdk.utils.m;
import com.bytedance.sdk.openadsdk.utils.v;
import com.com.bytedance.overseas.sdk.b.a;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: TTAdManagerImpl */
public class u implements TTAdManager {

    /* renamed from: f  reason: collision with root package name */
    private static final Map<Integer, String> f1547f = new HashMap<Integer, String>(12) {
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, "gaid");
            put(4, "apk-sign");
            put(5, "app_running_time");
            put(6, "vendor");
            put(7, "model");
            put(8, "user_agent_device");
            put(9, "user_agent_webview");
            put(10, "sys_compiling_time");
            put(11, "sec_did");
            put(12, "url");
            put(13, "X-Argus");
            put(14, "X-Ladon");
            put(15, "X-Khronos");
            put(16, "X-Gorgon");
            put(17, "pangle_m");
            put(18, "screen_height");
            put(19, "screen_width");
            put(20, "rom_version");
            put(21, "carrier_name");
            put(22, "os_version");
            put(23, "conn_type");
            put(24, "boot");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    String f1548a;

    /* renamed from: b  reason: collision with root package name */
    boolean f1549b = false;

    /* renamed from: c  reason: collision with root package name */
    boolean f1550c = false;

    /* renamed from: d  reason: collision with root package name */
    String f1551d = "com.union_test.internationad";

    /* renamed from: e  reason: collision with root package name */
    String f1552e = "5001121";

    /* renamed from: g  reason: collision with root package name */
    private int f1553g = 0;

    private void e(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f1548a)) {
            this.f1548a = str;
            try {
                JSONObject a2 = m.f().a(new JSONObject(str));
                if (a2 != null) {
                    o.a a3 = o.a.a(a2, (AdSlot) null, (com.bytedance.sdk.openadsdk.core.e.o) null);
                    if (a3.f1521d == 20000 && a3.f1525h != null && a3.f1525h.b().size() > 0) {
                        boolean z = false;
                        n nVar = a3.f1525h.b().get(0);
                        this.f1549b = com.bytedance.sdk.openadsdk.utils.u.d(nVar);
                        if (nVar.G() != null) {
                            z = true;
                        }
                        this.f1550c = z;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public u setAppId(String str) {
        h.d().a(str);
        return this;
    }

    /* renamed from: a */
    public u setPaid(boolean z) {
        h.d().c(z);
        return this;
    }

    /* renamed from: b */
    public u setName(String str) {
        h.d().b(str);
        return this;
    }

    /* renamed from: c */
    public u setKeywords(String str) {
        h.d().c(str);
        return this;
    }

    public TTAdNative createAdNative(Context context) {
        return new v(context);
    }

    /* renamed from: d */
    public u setData(String str) {
        h.d().d(str);
        return this;
    }

    public TTAdManager debugLog(int i) {
        this.f1553g = i;
        return this;
    }

    public String getBiddingToken() {
        return getBiddingToken((String) null);
    }

    public String getBiddingToken(String str) {
        int i;
        String str2 = str;
        com.bytedance.sdk.openadsdk.utils.u.n("getBiddingToken");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_init", TTAdSdk.isInitSuccess() ? 1 : 0);
            String e2 = m.h().e();
            String f2 = m.h().f();
            if (!(e2 == null || f2 == null)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(MediationMetaData.KEY_VERSION, e2);
                jSONObject3.put("param", f2);
                jSONObject2.put("abtest", jSONObject3);
            }
            jSONObject2.put("ad_sdk_version", "4.5.0.6");
            jSONObject2.put("package_name", com.bytedance.sdk.openadsdk.utils.u.d());
            jSONObject2.put("user_data", o.a(TextUtils.isEmpty(str2) ? null : new AdSlot.Builder().setCodeId(str2).build()));
            jSONObject2.put("ts", System.currentTimeMillis() / 1000);
            if (jSONObject2.toString().getBytes().length <= 2680) {
                f h2 = m.h();
                if (h2.p("gaid")) {
                    jSONObject2.put("gaid", a.a().b());
                }
                Context a2 = m.a();
                jSONObject2.put("apk-sign", s.a());
                jSONObject2.put("app_running_time", (System.currentTimeMillis() - TTAdSdk.INIT_TIME) / 1000);
                jSONObject2.put("vendor", Build.MANUFACTURER);
                jSONObject2.put("model", Build.MODEL);
                jSONObject2.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.u.a());
                jSONObject2.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.u.b());
                jSONObject2.put("sys_compiling_time", j.b(a2));
                jSONObject2.put("screen_height", v.d(a2));
                jSONObject2.put("screen_width", v.c(a2));
                jSONObject2.put("rom_version", m.a());
                jSONObject2.put("carrier_name", com.bytedance.sdk.openadsdk.utils.n.a());
                jSONObject2.put("os_version", Build.VERSION.RELEASE);
                jSONObject2.put("conn_type", com.bytedance.sdk.openadsdk.utils.u.p(a2));
                if (h2.p("boot")) {
                    jSONObject2.put("boot", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + "");
                }
                s.a(jSONObject2);
                i = f1547f.size();
            } else {
                i = 2;
            }
            while (i >= 1 && jSONObject2.toString().getBytes().length > 2680) {
                jSONObject2.remove(f1547f.get(Integer.valueOf(i)));
                i--;
            }
            jSONObject = com.bytedance.sdk.component.utils.a.a(jSONObject2);
            while (i >= 1 && jSONObject.toString().getBytes().length > 4096) {
                jSONObject2.remove(f1547f.get(Integer.valueOf(i)));
                jSONObject = com.bytedance.sdk.component.utils.a.a(jSONObject2);
                i--;
            }
            if (l.c()) {
                l.c("mssdk", "bidding token: " + jSONObject.toString() + "\nbidding token length: " + jSONObject.toString().getBytes().length);
            }
            e.a(str);
        } catch (Throwable unused) {
        }
        l.b("TTAdManagerImpl", "bidding token: " + jSONObject.toString());
        return jSONObject.toString();
    }

    public int getCcpa() {
        return h.d().v();
    }

    public int getCoppa() {
        return h.d().i();
    }

    public int getDebugLog() {
        return this.f1553g;
    }

    public int getGdpr() {
        return h.d().j();
    }

    public String getSDKVersion() {
        return "4.5.0.6";
    }

    public String getSupportRegion() {
        return "VA";
    }

    public boolean isExpressAd(String str, String str2) {
        if (m.h().h(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        e(str2);
        return this.f1550c;
    }

    public boolean isFullScreenVideoAd(String str, String str2) {
        if (m.h().i(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        e(str2);
        return this.f1549b;
    }

    public TTAdManager isUseTextureView(boolean z) {
        h.d().e(z);
        return this;
    }

    public boolean onlyVerityPlayable(String str, int i, String str2, String str3, String str4) {
        if (!this.f1551d.equals(m.a().getPackageName()) || !this.f1552e.equals(h.d().f()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Method a2 = w.a("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
            if (a2 != null) {
                a2.invoke((Object) null, new Object[]{str, Integer.valueOf(i), str2, str3, str4});
            }
        } catch (Throwable th) {
            l.b("TTAdManagerImpl", "reward component maybe not exist, pls check", th);
        }
        return true;
    }

    public TTAdManager openDebugMode() {
        l.b();
        com.bytedance.sdk.component.e.a.a();
        return this;
    }

    public void requestPermissionIfNecessary(Context context) {
    }

    public TTAdManager setAllowShowNotifiFromSDK(boolean z) {
        h.d().d(z);
        return this;
    }

    public TTAdManager setCcpa(int i) {
        h.d().f(i);
        return this;
    }

    public TTAdManager setCoppa(int i) {
        h.d().b(i);
        return this;
    }

    public TTAdManager setGdpr(int i) {
        h.d().c(i);
        return this;
    }

    public TTAdManager setIconId(int i) {
        h.d().a(i);
        return this;
    }

    public TTAdManager setNeedClearTaskReset(String[] strArr) {
        h.d().a(strArr);
        return this;
    }

    public TTAdManager setTitleBarTheme(int i) {
        h.d().e(i);
        return this;
    }

    public void showPrivacyProtection() {
        TTDelegateActivity.a();
    }
}
