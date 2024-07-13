package com.bytedance.sdk.openadsdk.core.h;

import android.content.Context;
import android.os.Looper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.mobsec.metasec.ov.PglMSConfig;
import com.bytedance.mobsec.metasec.ov.PglMSManager;
import com.bytedance.mobsec.metasec.ov.PglMSManagerUtils;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MSSdkImpl */
public class b implements a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f1218b = false;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f1219c = true;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public PglMSManager f1220a;

    /* renamed from: d  reason: collision with root package name */
    private volatile String f1221d = h.d().f();

    /* renamed from: e  reason: collision with root package name */
    private volatile String f1222e;

    public b() {
        Context a2 = m.a();
        this.f1222e = j.a(a2);
        f1218b = a(this.f1221d, this.f1222e);
    }

    private boolean a(String str, String str2) {
        try {
            l.c("mssdk", "Sdk.APP_ID: 1371\n appId: " + str + " \n MS_SDK_LICENCE:" + "6QsgjKNXt0ThHEOR/wpJGqVuDr4bHw6oKiicVF73p9+zvKfmlFZpi9d4zgrMWd9vbyPsZIdIHuN5cgNZGzmWdjdpJjlERMNPwKHauPaQbfRfY4VRpA5s7BaQ3NqhlpVXhpJcCGkhG0r8GX6Q1ys7HXrrwSLpidXsl992B79+GPi4GB9tgR1CtqsLFzcKbbd+/j76xqkGzAl1p2JxYeZswgj5c/Mg5K2bA7MquHtxWz4N1Tkj" + " \n did: " + str2 + " ");
            Context a2 = m.a();
            PglMSConfig build = new PglMSConfig.Builder("1371", str, "6QsgjKNXt0ThHEOR/wpJGqVuDr4bHw6oKiicVF73p9+zvKfmlFZpi9d4zgrMWd9vbyPsZIdIHuN5cgNZGzmWdjdpJjlERMNPwKHauPaQbfRfY4VRpA5s7BaQ3NqhlpVXhpJcCGkhG0r8GX6Q1ys7HXrrwSLpidXsl992B79+GPi4GB9tgR1CtqsLFzcKbbd+/j76xqkGzAl1p2JxYeZswgj5c/Mg5K2bA7MquHtxWz4N1Tkj", e()).setDeviceID(str2).setClientType(1).setOVRegionType(0).build();
            long currentTimeMillis = System.currentTimeMillis();
            PglMSManagerUtils.init(a2, build);
            com.bytedance.sdk.openadsdk.h.b.a().a(Constants.INIT, currentTimeMillis);
            d();
            if (this.f1220a != null) {
                this.f1220a.setDeviceID(str2);
            }
            l.c("mssdk", "init: 成功");
            return true;
        } catch (Throwable th) {
            l.c("mssdk", "init: 失败");
            l.b("MSSdkImpl", "appid 为空，初始化失败！或不包含mssdk模块", th);
            f();
            return false;
        }
    }

    private synchronized boolean c() {
        if (!f1218b && f1219c) {
            this.f1221d = h.d().f();
            this.f1222e = j.a(m.a());
            f1218b = a(this.f1221d, this.f1222e);
        }
        return f1218b;
    }

    private void d() {
        if (this.f1220a == null) {
            PglMSManager pglMSManager = PglMSManagerUtils.get("1371");
            this.f1220a = pglMSManager;
            if (pglMSManager != null) {
                pglMSManager.setCollectMode(e());
            }
        }
    }

    private int e() {
        int o = u.o();
        if (o == 4 || o == 5) {
            l.c("mssdk", "getCollectMode() PglMSConfig.COLLECT_MODE_TIKTOK_USEA");
            return 503;
        }
        l.c("mssdk", "getCollectMode() PglMSConfig.COLLECT_MODE_TIKTOK_NONUSEA");
        return 603;
    }

    public void a(final String str) {
        if (c()) {
            d();
            if (this.f1220a != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    e.a((g) new g("updateDid") {
                        public void run() {
                            if (b.this.f1220a != null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                b.this.f1220a.setDeviceID(str);
                                com.bytedance.sdk.openadsdk.h.b.a().a("setDeviceID", currentTimeMillis);
                            }
                        }
                    });
                } else {
                    this.f1220a.setDeviceID(str);
                }
                l.c("mssdk did: ", str);
            }
        }
    }

    public void b(String str) {
        if (c()) {
            d();
            if (this.f1220a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f1220a.report(str);
                com.bytedance.sdk.openadsdk.h.b.a().a("report", currentTimeMillis);
            }
        }
    }

    public String a() {
        if (!c()) {
            return "";
        }
        d();
        if (this.f1220a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String token = this.f1220a.getToken();
        com.bytedance.sdk.openadsdk.h.b.a().a("getToken", currentTimeMillis);
        l.c("mssdk", "secDeviceToken: " + token);
        return token;
    }

    public Map<String, String> a(String str, byte[] bArr) {
        if (!c()) {
            return new HashMap();
        }
        d();
        if (this.f1220a == null) {
            return new HashMap();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> featureHash = this.f1220a.getFeatureHash(str, bArr);
        com.bytedance.sdk.openadsdk.h.b.a().a("getFeatureHash", currentTimeMillis);
        return featureHash;
    }

    public String b() {
        try {
            Context a2 = m.a();
            return a(MessageDigest.getInstance("SHA1").digest(a2.getPackageManager().getPackageInfo(a2.getPackageName(), 64).signatures[0].toByteArray())).toUpperCase();
        } catch (Throwable unused) {
            return "0000000000000000000000000000000000000000";
        }
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[(bArr.length * 2)];
        for (byte b2 = 0; b2 < bArr.length; b2 = (byte) (b2 + 1)) {
            byte b3 = bArr[b2] & 255;
            int i = b2 * 2;
            cArr[i] = charArray[b3 >>> 4];
            cArr[i + 1] = charArray[b3 & Ascii.SI];
        }
        return new String(cArr);
    }

    private Class f() {
        Class<?> cls = null;
        try {
            cls = Class.forName("com.bytedance.mobsec.metasec.ov.PglMS");
            f1219c = true;
            l.c("mssdk", "class found");
            return cls;
        } catch (Throwable unused) {
            l.c("mssdk", "class not found ");
            f1219c = false;
            return cls;
        }
    }
}
