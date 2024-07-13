package com.bytedance.sdk.openadsdk.b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.d.e;
import com.bytedance.sdk.component.utils.h;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WebviewTimeTrack */
public class u {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f362a = "embeded_ad";
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public n f363b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f364c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Boolean f365d = false;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f366e = false;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f367f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public JSONArray f368g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public JSONArray f369h;

    protected u() {
    }

    public u(int i, String str, n nVar) {
        this.f362a = str;
        this.f363b = nVar;
        this.f367f = new JSONObject();
        this.f368g = new JSONArray();
        this.f369h = new JSONArray();
        a(this.f367f, "webview_source", (Object) Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    public void a(JSONArray jSONArray, Object obj) {
        if (jSONArray != null && jSONArray.length() < 10) {
            try {
                jSONArray.put(obj);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(JSONObject jSONObject, String str, Object obj) {
        a(jSONObject, str, obj, true);
    }

    /* access modifiers changed from: private */
    public void a(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            if (!z) {
                try {
                    if (jSONObject.has(str)) {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            jSONObject.put(str, obj);
        }
    }

    /* access modifiers changed from: private */
    public boolean q() {
        return this.f366e.booleanValue() || (this.f365d.booleanValue() && this.f364c.booleanValue());
    }

    public void a() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(jSONObject, "render_sequence", (Object) Integer.valueOf(uVar.f363b.q()));
                u.this.a(jSONObject, "webview_count", (Object) Integer.valueOf(e.a().e()));
                u.this.a(jSONObject, "available_cache_count", (Object) Integer.valueOf(e.a().d()));
                u uVar2 = u.this;
                uVar2.a(uVar2.f367f, "render_start", (Object) jSONObject);
            }
        });
    }

    public void a(final int i) {
        h.a().post(new Runnable() {
            public void run() {
                u.this.a(i, (String) null);
            }
        });
    }

    public void a(final int i, final String str) {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, "code", (Object) Integer.valueOf(i));
                String str = str;
                if (str != null) {
                    u.this.a(jSONObject, "msg", (Object) str);
                }
                u uVar = u.this;
                uVar.a(uVar.f367f, "render_error", (Object) jSONObject);
            }
        });
    }

    public void a(final String str) {
        h.a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                    u.this.a(jSONObject, "jsb", (Object) str);
                    u uVar = u.this;
                    uVar.a(uVar.f367f, "webview_jsb_start", (Object) jSONObject);
                }
            }
        });
    }

    public void a(String str, long j, long j2, int i) {
        final String str2 = str;
        final long j3 = j2;
        final long j4 = j;
        final int i2 = i;
        h.a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str2) && j3 >= j4) {
                    JSONObject jSONObject = new JSONObject();
                    u.this.a(jSONObject, "start_ts", (Object) Long.valueOf(j4));
                    u.this.a(jSONObject, "end_ts", (Object) Long.valueOf(j3));
                    u.this.a(jSONObject, "intercept_type", (Object) Integer.valueOf(i2));
                    u.this.a(jSONObject, "type", (Object) "intercept_html");
                    u.this.a(jSONObject, "url", (Object) str2);
                    u.this.a(jSONObject, IronSourceConstants.EVENTS_DURATION, (Object) Long.valueOf(j3 - j4));
                    u uVar = u.this;
                    uVar.a(uVar.f369h, (Object) jSONObject);
                }
            }
        });
    }

    public void a(final JSONObject jSONObject) {
        h.a().post(new Runnable() {
            public void run() {
                JSONObject jSONObject = jSONObject;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(System.currentTimeMillis()));
                u uVar = u.this;
                uVar.a(uVar.f367f, "webview_load_error", (Object) jSONObject);
            }
        });
    }

    public void a(boolean z) {
        this.f366e = Boolean.valueOf(z);
    }

    public void b() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, "render_success", (Object) jSONObject);
            }
        });
    }

    public void b(final int i) {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, "isWebViewCache", (Object) Integer.valueOf(i));
                u uVar = u.this;
                uVar.a(uVar.f367f, "before_webview_request", (Object) jSONObject);
            }
        });
    }

    public void b(final int i, final String str) {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, "code", (Object) Integer.valueOf(i));
                u uVar = u.this;
                uVar.a(uVar.f367f, str, (Object) jSONObject);
            }
        });
    }

    public void b(final String str) {
        h.a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                    u.this.a(jSONObject, "jsb", (Object) str);
                    u uVar = u.this;
                    uVar.a(uVar.f367f, "webview_jsb_end", (Object) jSONObject);
                }
            }
        });
    }

    public void b(String str, long j, long j2, int i) {
        final String str2 = str;
        final long j3 = j2;
        final long j4 = j;
        final int i2 = i;
        h.a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str2) && j3 >= j4) {
                    JSONObject jSONObject = new JSONObject();
                    u.this.a(jSONObject, "start_ts", (Object) Long.valueOf(j4));
                    u.this.a(jSONObject, "end_ts", (Object) Long.valueOf(j3));
                    u.this.a(jSONObject, "intercept_type", (Object) Integer.valueOf(i2));
                    u.this.a(jSONObject, "type", (Object) "intercept_js");
                    u.this.a(jSONObject, "url", (Object) str2);
                    u.this.a(jSONObject, IronSourceConstants.EVENTS_DURATION, (Object) Long.valueOf(j3 - j4));
                    u uVar = u.this;
                    uVar.a(uVar.f369h, (Object) jSONObject);
                }
            }
        });
    }

    public void b(final JSONObject jSONObject) {
        h.a().post(new Runnable() {
            public void run() {
                JSONObject jSONObject;
                if (u.this.f367f != null && (jSONObject = jSONObject) != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        u uVar = u.this;
                        uVar.a(uVar.f367f, next, jSONObject.opt(next));
                    }
                    Boolean unused = u.this.f365d = true;
                    u.this.m();
                }
            }
        });
    }

    public void c() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, "native_render_start", (Object) jSONObject);
            }
        });
    }

    public void c(final String str) {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, str, (Object) jSONObject);
            }
        });
    }

    public void d() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, "native_render_end", (Object) jSONObject);
            }
        });
    }

    public void d(final String str) {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, str, (Object) jSONObject);
            }
        });
    }

    public void e() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    public void e(final String str) {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, str, (Object) jSONObject);
            }
        });
    }

    public void f() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, "webview_load_success", (Object) jSONObject);
            }
        });
    }

    public void g() {
        h.a().post(new Runnable() {
            public void run() {
                u.this.a((JSONObject) null);
            }
        });
    }

    public void h() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, "native_endcard_show", (Object) jSONObject);
            }
        });
    }

    public void i() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, "native_endcard_close", (Object) jSONObject);
            }
        });
    }

    public void j() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, "type", (Object) "native_enterBackground");
                u uVar = u.this;
                uVar.a(uVar.f368g, (Object) jSONObject);
            }
        });
    }

    public void k() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, "type", (Object) "native_enterForeground");
                u uVar = u.this;
                uVar.a(uVar.f368g, (Object) jSONObject);
            }
        });
    }

    public void l() {
        this.f364c = true;
    }

    public void m() {
        h.a().post(new Runnable() {
            public void run() {
                if (u.this.q()) {
                    if (!(u.this.f368g == null || u.this.f368g.length() == 0)) {
                        try {
                            u.this.f367f.put("native_switchBackgroundAndForeground", u.this.f368g);
                        } catch (Exception unused) {
                        }
                    }
                    if (!(u.this.f369h == null || u.this.f369h.length() == 0)) {
                        try {
                            u.this.f367f.put("intercept_source", u.this.f369h);
                        } catch (Exception unused2) {
                        }
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("webview_time_track", u.this.f367f);
                    if (com.bytedance.sdk.openadsdk.core.h.d().s() && u.this.f367f != null) {
                        l.b("WebviewTimeTrack", u.this.f367f.toString());
                    }
                    e.c(m.a(), u.this.f363b, u.this.f362a, "webview_time_track", (Map<String, Object>) hashMap);
                }
            }
        });
    }

    public void n() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, "native_render_end", (Object) jSONObject);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                u.this.a(jSONObject2, "ts", (Object) Long.valueOf(currentTimeMillis2));
                u uVar2 = u.this;
                uVar2.a(uVar2.f367f, "render_success", (Object) jSONObject2);
            }
        });
    }

    public void o() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, "no_native_render", (Object) jSONObject);
            }
        });
    }

    public void p() {
        h.a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f367f, "render_failed", (Object) jSONObject);
            }
        });
    }
}
