package com.bytedance.sdk.openadsdk.b.b.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.c.b;
import com.bykv.vk.openvk.component.video.api.c.c;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.b.b.b.d;
import com.bytedance.sdk.openadsdk.b.b.b.e;
import com.bytedance.sdk.openadsdk.b.b.b.f;
import com.bytedance.sdk.openadsdk.b.b.b.g;
import com.bytedance.sdk.openadsdk.b.b.b.h;
import com.bytedance.sdk.openadsdk.b.b.b.i;
import com.bytedance.sdk.openadsdk.b.b.b.j;
import com.bytedance.sdk.openadsdk.b.b.b.k;
import com.bytedance.sdk.openadsdk.b.b.b.l;
import com.bytedance.sdk.openadsdk.b.b.b.m;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.utils.u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VideoEventManager */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<com.bykv.vk.openvk.component.video.api.b.a, o> f226a = Collections.synchronizedMap(new WeakHashMap());

    public static JSONObject a(n nVar, String str, int i, int i2) {
        b J;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i > 0) {
                jSONObject.put("play_type", String.valueOf(i));
            }
            if (!(nVar == null || (J = nVar.J()) == null)) {
                jSONObject.put("video_resolution", J.g());
                jSONObject.put("video_size", Long.valueOf(J.e()));
                jSONObject.put("video_url", J.i());
                jSONObject.put("player_type", i2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void a(com.bytedance.sdk.openadsdk.b.b.b.a<k> aVar) {
        a((com.bytedance.sdk.openadsdk.b.b.b.a) aVar, "load_video_start");
    }

    public static void b(com.bytedance.sdk.openadsdk.b.b.b.a<l> aVar) {
        a((com.bytedance.sdk.openadsdk.b.b.b.a) aVar, "load_video_success");
    }

    public static void c(com.bytedance.sdk.openadsdk.b.b.b.a<j> aVar) {
        a((com.bytedance.sdk.openadsdk.b.b.b.a) aVar, "load_video_error");
    }

    public static void d(com.bytedance.sdk.openadsdk.b.b.b.a<i> aVar) {
        a((com.bytedance.sdk.openadsdk.b.b.b.a) aVar, "load_video_cancel");
    }

    public static void a(n nVar, com.bykv.vk.openvk.component.video.api.b.a aVar, c cVar) {
        if (nVar != null && aVar != null && cVar != null) {
            String a2 = com.bytedance.sdk.openadsdk.utils.l.a();
            boolean z = true;
            int i = CacheDirFactory.getICacheDir(nVar.aD()).a(cVar) ? 1 : 2;
            f226a.put(aVar, new o(SystemClock.elapsedRealtime(), a2, i, cVar, nVar));
            com.bytedance.sdk.openadsdk.b.b.b.a aVar2 = new com.bytedance.sdk.openadsdk.b.b.b.a(nVar, u.a(nVar), a(nVar, a2, i, cVar.l()), null);
            if (cVar.l() != -1) {
                z = false;
            }
            aVar2.a(z);
            a(aVar2, "play_start");
        }
    }

    public static void a(Context context, com.bykv.vk.openvk.component.video.api.b.a aVar, o.a aVar2, com.bytedance.sdk.openadsdk.b.j jVar) {
        o oVar;
        if (context != null && aVar != null && aVar2 != null && (oVar = f226a.get(aVar)) != null) {
            c d2 = oVar.d();
            n e2 = oVar.e();
            if (d2 != null && e2 != null) {
                if (!aVar2.l()) {
                    a(e2, d2, aVar2);
                }
                h hVar = new h();
                hVar.a(aVar2.m() ? 1 : 0);
                hVar.b(CacheDirFactory.getICacheDir(e2.aD()).b(d2));
                hVar.a(SystemClock.elapsedRealtime() - oVar.a());
                com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e2, u.a(e2), a(e2, oVar.b(), oVar.c(), d2.l()), hVar);
                aVar3.a(aVar2.l());
                a(aVar3, "feed_play", jVar);
            }
        }
    }

    public static void a(com.bykv.vk.openvk.component.video.api.b.a aVar, o.a aVar2) {
        o oVar;
        if (aVar != null && aVar2 != null && (oVar = f226a.get(aVar)) != null) {
            c d2 = oVar.d();
            n e2 = oVar.e();
            if (d2 != null && e2 != null) {
                long a2 = aVar2.a();
                long c2 = aVar2.c();
                if (c2 > 0 && a2 > 0) {
                    g gVar = new g();
                    gVar.a(aVar2.b());
                    gVar.b(c2);
                    com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e2, u.a(e2), a(e2, oVar.b(), oVar.c(), d2.l()), gVar);
                    aVar3.a(aVar2.l());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, a2);
                        jSONObject.put("percent", aVar2.h());
                        a(aVar3, "feed_pause", jSONObject);
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    public static void b(com.bykv.vk.openvk.component.video.api.b.a aVar, o.a aVar2) {
        o oVar;
        if (aVar != null && aVar2 != null && (oVar = f226a.get(aVar)) != null) {
            c d2 = oVar.d();
            n e2 = oVar.e();
            if (d2 != null && e2 != null) {
                long a2 = aVar2.a();
                long c2 = aVar2.c();
                if (c2 > 0 && a2 > 0) {
                    e eVar = new e();
                    eVar.a(aVar2.b());
                    eVar.b(c2);
                    com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e2, u.a(e2), a(e2, oVar.b(), oVar.c(), d2.l()), eVar);
                    aVar3.a(aVar2.l());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, a2);
                        jSONObject.put("percent", aVar2.h());
                        a(aVar3, "feed_continue", jSONObject);
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    public static void c(com.bykv.vk.openvk.component.video.api.b.a aVar, o.a aVar2) {
        o oVar;
        if (aVar != null && aVar2 != null && (oVar = f226a.get(aVar)) != null) {
            c d2 = oVar.d();
            n e2 = oVar.e();
            if (d2 != null && e2 != null) {
                long a2 = aVar2.a();
                long c2 = aVar2.c();
                com.bytedance.sdk.openadsdk.b.b.b.n nVar = new com.bytedance.sdk.openadsdk.b.b.b.n();
                nVar.a(aVar2.b());
                nVar.b(c2);
                nVar.a(aVar2.d());
                nVar.b(aVar2.e());
                com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e2, u.a(e2), a(e2, oVar.b(), oVar.c(), d2.l()), nVar);
                aVar3.a(aVar2.l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, a2);
                    jSONObject.put("percent", aVar2.h());
                    a(aVar3, "play_error", jSONObject);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public static void d(com.bykv.vk.openvk.component.video.api.b.a aVar, o.a aVar2) {
        o oVar;
        if (aVar != null && aVar2 != null && (oVar = f226a.get(aVar)) != null) {
            c d2 = oVar.d();
            n e2 = oVar.e();
            if (d2 != null && e2 != null) {
                long a2 = aVar2.a();
                long c2 = aVar2.c();
                com.bytedance.sdk.openadsdk.b.b.b.b bVar = new com.bytedance.sdk.openadsdk.b.b.b.b();
                bVar.a(aVar2.b());
                bVar.b(c2);
                bVar.a(aVar2.f());
                bVar.b(aVar2.g());
                com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e2, u.a(e2), a(e2, oVar.b(), oVar.c(), d2.l()), bVar);
                aVar3.a(aVar2.l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, a2);
                    jSONObject.put("percent", aVar2.h());
                    a(aVar3, "endcard_skip", jSONObject);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                f226a.remove(aVar);
            }
        }
    }

    public static void a(com.bykv.vk.openvk.component.video.api.b.a aVar, o.a aVar2, com.bytedance.sdk.openadsdk.b.j jVar) {
        o oVar;
        if (aVar != null && aVar2 != null && (oVar = f226a.get(aVar)) != null) {
            c d2 = oVar.d();
            n e2 = oVar.e();
            if (d2 != null && e2 != null) {
                long a2 = aVar2.a();
                long c2 = aVar2.c();
                d dVar = new d();
                dVar.b(aVar2.b());
                dVar.a(c2);
                dVar.a(aVar2.i());
                dVar.b(aVar2.j());
                com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e2, u.a(e2), a(e2, oVar.b(), oVar.c(), d2.l()), dVar);
                aVar3.a(aVar2.l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, a2);
                    jSONObject.put("percent", aVar2.h());
                    a(aVar3, "feed_break", jSONObject, jVar);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                f226a.remove(aVar);
            }
        }
    }

    public static void b(com.bykv.vk.openvk.component.video.api.b.a aVar, o.a aVar2, com.bytedance.sdk.openadsdk.b.j jVar) {
        if (aVar != null && aVar2 != null) {
            e(aVar, aVar2);
            o oVar = f226a.get(aVar);
            if (oVar != null) {
                c d2 = oVar.d();
                n e2 = oVar.e();
                if (d2 != null && e2 != null) {
                    long a2 = aVar2.a();
                    long c2 = aVar2.c();
                    if (c2 > 0) {
                        f fVar = new f();
                        fVar.b(aVar2.b());
                        fVar.a(c2);
                        fVar.a(aVar2.j());
                        com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e2, u.a(e2), a(e2, oVar.b(), oVar.c(), d2.l()), fVar);
                        aVar3.a(aVar2.l());
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, a2);
                            jSONObject.put("percent", aVar2.h());
                            a(aVar3, "feed_over", jSONObject, jVar);
                        } catch (JSONException e3) {
                            e3.printStackTrace();
                        }
                        f226a.remove(aVar);
                    }
                }
            }
        }
    }

    public static void e(com.bykv.vk.openvk.component.video.api.b.a aVar, o.a aVar2) {
        if (aVar != null && aVar2 != null) {
            if (aVar2.k() <= 0) {
                com.bytedance.sdk.component.utils.l.c("VideoEventManager", "Cancel log report when buffer count is 0");
                return;
            }
            o oVar = f226a.get(aVar);
            if (oVar != null) {
                c d2 = oVar.d();
                n e2 = oVar.e();
                if (d2 != null && e2 != null) {
                    long c2 = aVar2.c();
                    if (c2 > 0) {
                        m mVar = new m();
                        mVar.a(aVar2.b());
                        mVar.b(c2);
                        mVar.a(aVar2.k());
                        com.bytedance.sdk.openadsdk.b.b.b.a aVar3 = new com.bytedance.sdk.openadsdk.b.b.b.a(e2, u.a(e2), a(e2, oVar.b(), oVar.c(), d2.l()), mVar);
                        aVar3.a(aVar2.l());
                        a(aVar3, "play_buffer");
                    }
                }
            }
        }
    }

    private static void a(com.bytedance.sdk.openadsdk.b.b.b.a aVar, String str) {
        a(aVar, str, (JSONObject) null, (com.bytedance.sdk.openadsdk.b.j) null);
    }

    private static void a(com.bytedance.sdk.openadsdk.b.b.b.a aVar, String str, JSONObject jSONObject) {
        a(aVar, str, jSONObject, (com.bytedance.sdk.openadsdk.b.j) null);
    }

    private static void a(com.bytedance.sdk.openadsdk.b.b.b.a aVar, String str, com.bytedance.sdk.openadsdk.b.j jVar) {
        a(aVar, str, (JSONObject) null, jVar);
    }

    private static void a(final com.bytedance.sdk.openadsdk.b.b.b.a aVar, String str, JSONObject jSONObject, final com.bytedance.sdk.openadsdk.b.j jVar) {
        if (aVar != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            if (aVar.e() && !TextUtils.isEmpty(aVar.b())) {
                String b2 = aVar.b();
                char c2 = 65535;
                int hashCode = b2.hashCode();
                if (hashCode != -891990144) {
                    if (hashCode != -712491894) {
                        if (hashCode == 1912999166 && b2.equals("draw_ad")) {
                            c2 = 2;
                        }
                    } else if (b2.equals("embeded_ad")) {
                        c2 = 0;
                    }
                } else if (b2.equals("stream")) {
                    c2 = 1;
                }
                if (c2 == 0 || c2 == 1 || c2 == 2) {
                    str = "customer_" + str;
                }
            }
            final String str2 = str;
            com.bytedance.sdk.openadsdk.b.e.a(aVar.a(), aVar.b(), str2, jSONObject2, jVar, (com.bytedance.sdk.openadsdk.b.a.a) new com.bytedance.sdk.openadsdk.b.a.a() {
                public void a(JSONObject jSONObject) throws JSONException {
                    com.bytedance.sdk.openadsdk.b.j jVar;
                    JSONObject c2 = aVar.c();
                    if (aVar.d() != null) {
                        aVar.d().a(c2);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (jVar = jVar) != null) {
                        jVar.a(c2);
                    }
                    jSONObject.put("ad_extra_data", c2.toString());
                }
            });
        }
    }

    private static void a(final n nVar, final c cVar, final o.a aVar) {
        com.bytedance.sdk.openadsdk.h.b.a().a((com.bytedance.sdk.openadsdk.h.a) new com.bytedance.sdk.openadsdk.h.a() {
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", a.c(cVar));
                jSONObject.put("player_duration", aVar.c());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", cVar.j());
                jSONObject.put("path", a.d(cVar));
                jSONObject.put("player_type", cVar.l());
                return com.bytedance.sdk.openadsdk.h.a.b.b().a("pangle_video_play_state").a(u.e(nVar)).b(jSONObject.toString());
            }
        });
    }

    /* access modifiers changed from: private */
    public static long c(c cVar) {
        if (cVar == null) {
            return 0;
        }
        b r = cVar.i() ? cVar.r() : cVar.q();
        if (r != null) {
            return Double.valueOf(r.f() * 1000.0d).longValue();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static String d(c cVar) {
        return new File(cVar.a(), cVar.k()).getAbsolutePath();
    }
}
