package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.f.c;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.i.d;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.k;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.r;
import com.bytedance.sdk.openadsdk.core.u;
import com.bytedance.sdk.openadsdk.multipro.aidl.a;
import com.bytedance.sdk.openadsdk.multipro.aidl.b;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class TTAdSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    public static final long INIT_TIME = System.currentTimeMillis();

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f19350a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences.OnSharedPreferenceChangeListener f19351b;

    /* renamed from: c  reason: collision with root package name */
    private static final TTAdManager f19352c = new u();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static long f19353d = 0;

    public interface InitCallback {
        void fail(int i, String str);

        void success();
    }

    public static boolean isInitSuccess() {
        return k.e() == 1;
    }

    public static void init(final Context context, final TTAdConfig tTAdConfig, final InitCallback initCallback) {
        f19353d = SystemClock.elapsedRealtime();
        if (initCallback != null && !k.f1352d.contains(initCallback)) {
            k.f1352d.add(initCallback);
        }
        k.a(3);
        if (isInitSuccess()) {
            e();
        } else if (context == null && initCallback != null) {
            b((int) INIT_LOCAL_FAIL_CODE, "Context is null, please check. ");
        } else if (tTAdConfig != null || initCallback == null) {
            d(context, tTAdConfig);
            try {
                h.a(initCallback);
                try {
                    t.a(m.a(), "tt_ad_logo_txt");
                    if (isInitSuccess()) {
                        if (initCallback != null) {
                            e();
                        }
                    } else if (!tTAdConfig.isSupportMultiProcess()) {
                        b(context, tTAdConfig, initCallback);
                    } else {
                        a.a((b) new b() {
                            public void a() {
                                TTAdSdk.b(context, tTAdConfig, initCallback);
                            }
                        });
                        a.a(context).a();
                    }
                } catch (Throwable unused) {
                    if (initCallback != null) {
                        b((int) INIT_LOCAL_FAIL_CODE, "resources not found, if you use aab please call TTAdConfig.setPackageName");
                    }
                }
            } catch (Throwable unused2) {
                if (initCallback != null) {
                    b((int) INIT_LOCAL_FAIL_CODE, "Internal Error, setting exception. ");
                }
            }
        } else {
            b((int) INIT_LOCAL_FAIL_CODE, "TTAdConfig is null, please check.");
        }
    }

    /* access modifiers changed from: private */
    public static void b(final Context context, final TTAdConfig tTAdConfig, final InitCallback initCallback) {
        k.c().post(new Runnable() {
            public void run() {
                boolean z;
                try {
                    if (!TTAdSdk.isInitSuccess()) {
                        TTAdSdk.e(context, tTAdConfig);
                        TTAdSdk.f(context, tTAdConfig);
                        if (initCallback != null) {
                            TTAdSdk.e();
                        }
                        z = true;
                        TTAdSdk.b(context, SystemClock.elapsedRealtime() - TTAdSdk.f19353d, z, tTAdConfig);
                    } else if (initCallback != null) {
                        TTAdSdk.e();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    if (initCallback != null) {
                        TTAdSdk.b((int) TTAdSdk.INIT_LOCAL_FAIL_CODE, th.getMessage());
                    }
                    z = false;
                }
            }
        });
    }

    public static TTAdManager getAdManager() {
        com.bytedance.sdk.openadsdk.utils.u.m("getAdManager");
        return f19352c;
    }

    private static void c(final Context context, TTAdConfig tTAdConfig) {
        c();
        k.f1349a = tTAdConfig.isAsyncInit();
        f19352c.setAppId(tTAdConfig.getAppId()).setCoppa(tTAdConfig.getCoppa()).setGdpr(tTAdConfig.getGDPR()).setCcpa(tTAdConfig.getCcpa()).setName(tTAdConfig.getAppName()).setIconId(tTAdConfig.getAppIconId()).setPaid(tTAdConfig.isPaid()).setKeywords(tTAdConfig.getKeywords()).setData(tTAdConfig.getData()).setTitleBarTheme(tTAdConfig.getTitleBarTheme()).setAllowShowNotifiFromSDK(tTAdConfig.isAllowShowNotify()).isUseTextureView(tTAdConfig.isUseTextureView()).setNeedClearTaskReset(tTAdConfig.getNeedClearTaskReset()).debugLog(tTAdConfig.getDebugLog());
        try {
            if (tTAdConfig.isDebug()) {
                l.b();
                f19352c.openDebugMode();
                com.bytedance.sdk.openadsdk.utils.h.a();
                c.a();
            }
        } catch (Throwable unused) {
        }
        f.f1252a = d.b(context);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        AnonymousClass3 r0 = new SharedPreferences.OnSharedPreferenceChangeListener() {
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                if (f.f1253b.equals(str)) {
                    e.a((g) new g("onSharedPreferenceChanged") {
                        public void run() {
                            String b2 = d.b(context);
                            if ((TextUtils.isEmpty(b2) && !TextUtils.isEmpty(f.f1252a)) || !b2.equals(f.f1252a)) {
                                d.a((com.bytedance.sdk.openadsdk.core.i.b) m.h()).a(true);
                                f.f1252a = b2;
                            }
                        }
                    });
                }
            }
        };
        f19351b = r0;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(r0);
    }

    private static void c() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context a2 = m.a();
                if (a2 != null && (shortcutManager = (ShortcutManager) a2.getSystemService(ShortcutManager.class)) != null) {
                    h.d().a(shortcutManager.isRequestPinShortcutSupported());
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static void d(Context context, TTAdConfig tTAdConfig) {
        if (!TextUtils.isEmpty(tTAdConfig.getPackageName())) {
            t.a(tTAdConfig.getPackageName());
        }
        m.a(context);
        if (!tTAdConfig.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.b.b();
        }
        k.b();
    }

    /* access modifiers changed from: private */
    public static void e(Context context, TTAdConfig tTAdConfig) {
        if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
            e.b(-1);
            com.bytedance.sdk.openadsdk.multipro.d.a(context);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) e.a();
            com.bytedance.sdk.component.e.c.a.a(context).a(threadPoolExecutor);
            k.f1350b.set(true);
            if (tTAdConfig.isSupportMultiProcess()) {
                com.bytedance.sdk.openadsdk.multipro.b.a();
            }
            try {
                com.bytedance.sdk.component.adexpress.a.a.a.a().a(com.bytedance.sdk.openadsdk.d.a.a());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            updateAdConfig(tTAdConfig);
            c(context, tTAdConfig);
            k.a();
            com.bykv.vk.openvk.component.video.api.b.a(context, (String) null, threadPoolExecutor, k.c());
            com.bykv.vk.openvk.component.video.api.b.a(tTAdConfig.isSupportMultiProcess());
            com.bykv.vk.openvk.component.video.api.b.a(com.bytedance.sdk.openadsdk.i.d.a().b().e());
            if (Build.VERSION.SDK_INT < 23) {
                com.bykv.vk.openvk.component.video.a.a.a(context);
            }
            if (m.h().C()) {
                r.a();
            }
            NetworkTools.c(context);
        }
    }

    /* access modifiers changed from: private */
    public static void f(final Context context, final TTAdConfig tTAdConfig) {
        e.a(new g("init sync") {
            public void run() {
                f h2 = m.h();
                if (!h2.E()) {
                    synchronized (h2) {
                        if (!h2.E()) {
                            h2.a();
                            h2.a((Boolean) false);
                        }
                    }
                }
                com.bytedance.sdk.openadsdk.utils.e.f();
                k.a(context);
                e.a(true);
                e.a((com.bytedance.sdk.component.f.c) new com.bytedance.sdk.openadsdk.h.b.a());
                if (Build.VERSION.SDK_INT != 29 || !com.bytedance.sdk.openadsdk.utils.m.r()) {
                    com.bytedance.sdk.openadsdk.utils.e.a(context);
                }
                com.bytedance.sdk.openadsdk.utils.e.f(context);
                com.bytedance.sdk.openadsdk.utils.e.j(context);
                com.bytedance.sdk.openadsdk.utils.e.k(context);
            }
        }, 10, 5);
        k.c().post(new Runnable() {
            public void run() {
                if (!tTAdConfig.isSupportMultiProcess()) {
                    d.a((com.bytedance.sdk.openadsdk.core.i.b) m.h()).a(true);
                } else if (com.bytedance.sdk.component.utils.r.a(context)) {
                    d.a((com.bytedance.sdk.openadsdk.core.i.b) m.h()).a(true);
                    l.c("TTAdSdk", "Load setting in main process");
                }
                m.c().a();
                m.e().a();
                m.d().a();
            }
        });
        d();
    }

    private static void d() {
        e.b(new g("Disk Event") {
            public void run() {
                com.bytedance.sdk.openadsdk.h.b.b();
            }
        }, 5);
    }

    public static void updateAdConfig(TTAdConfig tTAdConfig) {
        if (tTAdConfig != null) {
            if (!TextUtils.isEmpty(tTAdConfig.getData())) {
                h.d().d(tTAdConfig.getData());
            }
            if (!TextUtils.isEmpty(tTAdConfig.getKeywords())) {
                h.d().c(tTAdConfig.getKeywords());
            }
        }
    }

    public static void setCoppa(int i) {
        com.bytedance.sdk.openadsdk.utils.u.m("setCoppa");
        if (i != getCoppa()) {
            f19352c.setCoppa(i);
            d.a((com.bytedance.sdk.openadsdk.core.i.b) m.h()).a(true);
        }
    }

    public static int getCoppa() {
        com.bytedance.sdk.openadsdk.utils.u.m("getCoppa");
        return f19352c.getCoppa();
    }

    public static void setGdpr(int i) {
        com.bytedance.sdk.openadsdk.utils.u.m("setGdpr");
        if (i != getGdpr()) {
            f19352c.setGdpr(i);
            d.a((com.bytedance.sdk.openadsdk.core.i.b) m.h()).a(true);
        }
    }

    public static int getGdpr() {
        com.bytedance.sdk.openadsdk.utils.u.m("getGdpr");
        return f19352c.getGdpr();
    }

    /* access modifiers changed from: private */
    public static void b(Context context, long j, boolean z, TTAdConfig tTAdConfig) {
        final Context context2 = context;
        final TTAdConfig tTAdConfig2 = tTAdConfig;
        final long j2 = j;
        final boolean z2 = z;
        e.a(new g("initMustBeCall") {
            public void run() {
                ApmHelper.initApm(context2, tTAdConfig2);
                if (m.h().F()) {
                    try {
                        boolean e2 = h.d().e();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j2);
                        jSONObject.put("is_async", true);
                        jSONObject.put("is_multi_process", tTAdConfig2.isSupportMultiProcess());
                        jSONObject.put("is_debug", tTAdConfig2.isDebug());
                        jSONObject.put("is_use_texture_view", tTAdConfig2.isUseTextureView());
                        jSONObject.put("is_activate_init", e2);
                        jSONObject.put("minSdkVersion", com.bytedance.sdk.openadsdk.utils.u.o(context2));
                        jSONObject.put("targetSdkVersion", com.bytedance.sdk.openadsdk.utils.u.n(context2));
                        jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                        jSONObject.put("is_success", z2);
                        h.d().b(false);
                        com.bytedance.sdk.openadsdk.h.b.a().a("pangle_sdk_init", jSONObject);
                        l.a("TTAdSdk", "pangle_sdk_init = ", jSONObject);
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }, 5);
    }

    /* access modifiers changed from: private */
    public static void e() {
        synchronized (k.f1352d) {
            k.a(1);
            for (InitCallback success : k.f1352d) {
                try {
                    success.success();
                } catch (Throwable unused) {
                }
            }
            k.f1352d.clear();
        }
    }

    /* access modifiers changed from: private */
    public static void b(int i, String str) {
        synchronized (k.f1352d) {
            k.a(2);
            for (InitCallback fail : k.f1352d) {
                try {
                    fail.fail(i, str);
                } catch (Throwable unused) {
                }
            }
            k.f1352d.clear();
        }
    }

    public static void setCCPA(int i) {
        com.bytedance.sdk.openadsdk.utils.u.m("setCCPA");
        if (i != getCCPA()) {
            h.d().f(i);
            d.a((com.bytedance.sdk.openadsdk.core.i.b) m.h()).a(true);
        }
    }

    public static int getCCPA() {
        com.bytedance.sdk.openadsdk.utils.u.m("getCCPA");
        return h.d().v();
    }

    public static void addInitCallback(InitCallback initCallback) {
        if (initCallback != null) {
            synchronized (k.f1352d) {
                if (isInitSuccess()) {
                    initCallback.success();
                } else if (k.e() == 2) {
                    initCallback.fail(INIT_LOCAL_FAIL_CODE, "Pangle Sdk initialization has failed before addPAGInitCallback");
                } else {
                    k.f1352d.add(initCallback);
                }
            }
        }
    }
}
