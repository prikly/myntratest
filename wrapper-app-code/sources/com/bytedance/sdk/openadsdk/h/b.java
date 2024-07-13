package com.bytedance.sdk.openadsdk.h;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.c;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.h.a.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* compiled from: StatsLogManager */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f1942a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f1943b = Executors.newFixedThreadPool(5);

    /* access modifiers changed from: private */
    public boolean g(com.bytedance.sdk.openadsdk.h.a.b bVar) {
        return bVar == null;
    }

    private b() {
    }

    public static b a() {
        if (f1942a == null) {
            synchronized (b.class) {
                if (f1942a == null) {
                    f1942a = new b();
                }
            }
        }
        return f1942a;
    }

    public void a(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (!g(bVar)) {
            bVar.a(System.currentTimeMillis() / 1000);
            m.i().a(new a() {
                public a a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    public void b(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (!g(bVar)) {
            bVar.a("express_ad_render");
            bVar.a(System.currentTimeMillis() / 1000);
            m.i().a(new a() {
                public a a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public boolean a(String str, int i) {
        c a2 = c.a(m.a());
        boolean z = false;
        int b2 = a2.b(str, 0);
        if ((b2 & 2) == 0 || (b2 & 1) != i) {
            z = true;
        }
        if (z) {
            a2.a(str, i + 2);
        }
        return z;
    }

    public void c(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (!g(bVar)) {
            this.f1943b.execute(new Runnable() {
                public void run() {
                    if (!b.this.g(bVar) && b.this.a(bVar.e(), 1)) {
                        bVar.a("reg_creative");
                        m.i().a(new a() {
                            public a a() throws Exception {
                                return bVar;
                            }
                        });
                    }
                }
            });
        }
    }

    public void d(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (!g(bVar)) {
            this.f1943b.execute(new Runnable() {
                public void run() {
                    if (!b.this.g(bVar) && b.this.a(bVar.e(), 0)) {
                        bVar.a("no_reg_creative");
                        m.i().a(new a() {
                            public a a() throws Exception {
                                return bVar;
                            }
                        });
                    }
                }
            });
        }
    }

    public void e(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (!g(bVar)) {
            bVar.a("load_icon_error");
            m.i().a(new a() {
                public a a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    public void f(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (!g(bVar)) {
            bVar.a("show_backup_endcard");
            bVar.a(System.currentTimeMillis() / 1000);
            m.i().a(new a() {
                public a a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            final com.bytedance.sdk.openadsdk.h.a.b b2 = com.bytedance.sdk.openadsdk.h.a.b.b().a("app_env").a(System.currentTimeMillis() / 1000).b(jSONObject.toString());
            m.i().a(new a() {
                public a a() throws Exception {
                    return b2;
                }
            });
        }
    }

    public void a(final String str) {
        m.i().a(new a() {
            public a a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.h.a.b.b().a("click_playable_test_tool").b(jSONObject.toString());
            }
        }, false);
    }

    public void b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_url", str);
        } catch (Throwable unused) {
        }
        final com.bytedance.sdk.openadsdk.h.a.b b2 = com.bytedance.sdk.openadsdk.h.a.b.b().a("close_playable_test_tool").b(jSONObject.toString());
        m.i().a(new a() {
            public a a() throws Exception {
                return b2;
            }
        }, false);
    }

    public void a(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_url", str);
            jSONObject.put("error_code", i);
            jSONObject.put("error_message", str2);
        } catch (Throwable unused) {
        }
        final com.bytedance.sdk.openadsdk.h.a.b b2 = com.bytedance.sdk.openadsdk.h.a.b.b().a("use_playable_test_tool_error").b(jSONObject.toString());
        m.i().a(new a() {
            public a a() throws Exception {
                return b2;
            }
        }, false);
    }

    public void a(long j, long j2, int i) {
        final long j3 = j2 - j;
        final long j4 = j;
        final long j5 = j2;
        final int i2 = i;
        m.i().a(new a() {
            public a a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j4);
                    jSONObject.put("endtime", j5);
                    jSONObject.put("start_type", i2);
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.h.a.b a2 = com.bytedance.sdk.openadsdk.h.a.b.b().a("general_label");
                return a2.h(j3 + "").b(jSONObject.toString());
            }
        }, false);
    }

    public void a(final String str, long j) {
        if (!com.bykv.vk.openvk.component.video.a.c.a.b()) {
            final long currentTimeMillis = System.currentTimeMillis() - j;
            m.i().a(new a() {
                public a a() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, currentTimeMillis);
                        jSONObject.put("method_name", str);
                    } catch (Throwable unused) {
                    }
                    return com.bytedance.sdk.openadsdk.h.a.b.b().a("log_mssdk_method_time_report").b(jSONObject.toString());
                }
            }, false);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            final com.bytedance.sdk.openadsdk.h.a.b b2 = com.bytedance.sdk.openadsdk.h.a.b.b().a(str).b(jSONObject.toString());
            m.i().a(new a() {
                public a a() throws Exception {
                    return b2;
                }
            }, false);
        }
    }

    public static void b() {
        try {
            JSONObject jSONObject = new JSONObject();
            long j = 0;
            File file = new File(CacheDirFactory.getRootDir());
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    long a2 = a(file2);
                    j += a2;
                    jSONObject.put(file2.getName(), a2);
                }
            }
            if (j >= 524288000) {
                final com.bytedance.sdk.openadsdk.h.a.b b2 = com.bytedance.sdk.openadsdk.h.a.b.b().a("disk_log").b(jSONObject.toString());
                m.i().a(new a() {
                    public a a() throws Exception {
                        return b2;
                    }
                }, false);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void c() {
        try {
            m.i().a(new a() {
                public a a() throws Exception {
                    return com.bytedance.sdk.openadsdk.h.a.b.b().a("bidding_get_creative");
                }
            }, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static long a(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        for (File a2 : file.listFiles()) {
            j += a(a2);
        }
        return j;
    }

    public void a(a aVar) {
        m.i().a(aVar, false);
    }
}
