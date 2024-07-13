package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.environment.e.a;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.a.e;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.g.c;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.h.b;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONObject;

public class g implements e, m {

    /* renamed from: a  reason: collision with root package name */
    public m f9133a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f9134b = g.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private d.b f9135c = d.b.None;

    /* renamed from: d  reason: collision with root package name */
    private CountDownTimer f9136d;

    /* renamed from: e  reason: collision with root package name */
    private final b f9137e = new b("NativeCommandExecutor");

    /* renamed from: f  reason: collision with root package name */
    private final b f9138f = new b("ControllerCommandsExecutor");

    /* renamed from: g  reason: collision with root package name */
    private final a f9139g;

    public g(Context context, c cVar, com.ironsource.sdk.service.d dVar, j jVar, a aVar) {
        this.f9139g = aVar;
        final Context context2 = context;
        final c cVar2 = cVar;
        final com.ironsource.sdk.service.d dVar2 = dVar;
        final j jVar2 = jVar;
        b((Runnable) new Runnable() {
            public final void run() {
                try {
                    m unused = g.this.f9133a = g.a(g.this, context2, cVar2, dVar2, jVar2);
                    g.this.f9133a.h();
                } catch (Exception e2) {
                    g.this.d(Log.getStackTraceString(e2));
                }
            }
        });
        this.f9136d = new CountDownTimer(200000, 1000) {
            public final void onFinish() {
                Logger.i(g.this.f9134b, "Global Controller Timer Finish");
                g.this.d("controller html - download timeout");
            }

            public final void onTick(long j) {
                String b2 = g.this.f9134b;
                Logger.i(b2, "Global Controller Timer Tick " + j);
            }
        }.start();
    }

    static /* synthetic */ x a(g gVar, Context context, c cVar, com.ironsource.sdk.service.d dVar, j jVar) {
        com.ironsource.sdk.a.d.a(f.f9000b);
        x xVar = new x(context, jVar, cVar, gVar, gVar.f9139g);
        b bVar = new b(context, xVar.a(), new com.ironsource.sdk.h.a(a.a()), new com.ironsource.sdk.h.d(xVar.a().f9572b));
        xVar.p = new v(context, dVar);
        xVar.n = new q(context);
        xVar.o = new r(context);
        xVar.q = new k(context);
        xVar.r = new a(cVar);
        a aVar = xVar.r;
        if (xVar.t == null) {
            xVar.t = new y() {
                public final void a(String str, JSONObject jSONObject) {
                    x.this.b(x.b(str, jSONObject.toString()));
                }
            };
        }
        aVar.f9096a = xVar.t;
        xVar.s = new l(xVar.a().f9572b, bVar);
        return xVar;
    }

    private void b(Runnable runnable) {
        a aVar = this.f9139g;
        if (aVar != null) {
            aVar.a(runnable);
        } else {
            Logger.e(this.f9134b, "mThreadManager = null");
        }
    }

    /* access modifiers changed from: private */
    public synchronized void d(String str) {
        com.ironsource.sdk.a.d.a(f.f9001c, (Map<String, Object>) new com.ironsource.sdk.a.a().a("callfailreason", str).f8990a);
        this.f9133a = new p(str, this.f9139g, this);
        this.f9137e.a();
        this.f9137e.b();
    }

    private boolean i() {
        return d.b.Ready.equals(this.f9135c);
    }

    public final void a() {
        this.f9135c = d.b.Loaded;
        this.f9137e.a();
        this.f9137e.b();
    }

    public final void a(Context context) {
        if (i()) {
            this.f9133a.a(context);
        }
    }

    public final void a(final c cVar, final Map<String, String> map, final com.ironsource.sdk.j.a.b bVar) {
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.a(cVar, (Map<String, String>) map, bVar);
            }
        });
    }

    public final void a(final c cVar, final Map<String, String> map, final com.ironsource.sdk.j.a.c cVar2) {
        this.f9138f.a(new Runnable() {
            public final void run() {
                com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("demandsourcename", cVar.f9515a).a("producttype", e.a(cVar, d.e.Interstitial)).a("isbiddinginstance", Boolean.valueOf(e.a(cVar)));
                com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f9599a;
                com.ironsource.sdk.a.d.a(f.i, (Map<String, Object>) a2.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(cVar.f9516b))).f8990a);
                g.this.f9133a.a(cVar, (Map<String, String>) map, cVar2);
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f9137e.a(runnable);
    }

    public final void a(String str) {
        com.ironsource.sdk.a.d.a(f.l, (Map<String, Object>) new com.ironsource.sdk.a.a().a("callfailreason", str).f8990a);
        com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new com.ironsource.sdk.g.e(1001, str));
            IronSourceNetwork.setInitListener((com.ironsource.sdk.j.d) null);
        }
        CountDownTimer countDownTimer = this.f9136d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    public final void a(final String str, final com.ironsource.sdk.j.a.c cVar) {
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.a(str, cVar);
            }
        });
    }

    public final void a(String str, String str2, c cVar, com.ironsource.sdk.j.a.b bVar) {
        final String str3 = str;
        final String str4 = str2;
        final c cVar2 = cVar;
        final com.ironsource.sdk.j.a.b bVar2 = bVar;
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.a(str3, str4, cVar2, bVar2);
            }
        });
    }

    public final void a(String str, String str2, c cVar, com.ironsource.sdk.j.a.c cVar2) {
        final String str3 = str;
        final String str4 = str2;
        final c cVar3 = cVar;
        final com.ironsource.sdk.j.a.c cVar4 = cVar2;
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.a(str3, str4, cVar3, cVar4);
            }
        });
    }

    public final void a(String str, String str2, c cVar, com.ironsource.sdk.j.a.d dVar) {
        final String str3 = str;
        final String str4 = str2;
        final c cVar2 = cVar;
        final com.ironsource.sdk.j.a.d dVar2 = dVar;
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.a(str3, str4, cVar2, dVar2);
            }
        });
    }

    public final void a(final String str, final String str2, final com.ironsource.sdk.j.e eVar) {
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.a(str, str2, eVar);
            }
        });
    }

    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        final String str3 = str;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        final com.ironsource.sdk.j.e eVar2 = eVar;
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.a(str3, str4, (Map<String, String>) map2, eVar2);
            }
        });
    }

    public final void a(final Map<String, String> map, final com.ironsource.sdk.j.e eVar) {
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.a((Map<String, String>) map, eVar);
            }
        });
    }

    public final void a(final JSONObject jSONObject) {
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.a(jSONObject);
            }
        });
    }

    public final void a(final JSONObject jSONObject, final com.ironsource.sdk.j.a.c cVar) {
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.a(jSONObject, cVar);
            }
        });
    }

    public final void a(final JSONObject jSONObject, final com.ironsource.sdk.j.a.d dVar) {
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.a(jSONObject, dVar);
            }
        });
    }

    public final void b() {
        if (d.c.Web.equals(c())) {
            com.ironsource.sdk.a.d.a(f.f9002d);
            com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
            if (initListener != null) {
                initListener.onSuccess();
                IronSourceNetwork.setInitListener((com.ironsource.sdk.j.d) null);
            }
        }
        this.f9135c = d.b.Ready;
        CountDownTimer countDownTimer = this.f9136d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f9138f.a();
        this.f9138f.b();
        this.f9133a.g();
    }

    public final void b(Context context) {
        if (i()) {
            this.f9133a.b(context);
        }
    }

    public final void b(final c cVar, final Map<String, String> map, final com.ironsource.sdk.j.a.c cVar2) {
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.b(cVar, map, cVar2);
            }
        });
    }

    public final void b(String str) {
        com.ironsource.sdk.a.d.a(f.u, (Map<String, Object>) new com.ironsource.sdk.a.a().a("generalmessage", str).f8990a);
        CountDownTimer countDownTimer = this.f9136d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    public final d.c c() {
        return this.f9133a.c();
    }

    public final boolean c(String str) {
        if (!i()) {
            return false;
        }
        return this.f9133a.c(str);
    }

    public final void d() {
        this.f9138f.a(new Runnable() {
            public final void run() {
                g.this.f9133a.d();
            }
        });
    }

    public void destroy() {
        CountDownTimer countDownTimer = this.f9136d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f9136d = null;
        b((Runnable) new Runnable() {
            public final void run() {
                if (g.this.f9133a != null) {
                    g.this.f9133a.destroy();
                    m unused = g.this.f9133a = null;
                }
            }
        });
    }

    public final void e() {
        if (i()) {
            this.f9133a.e();
        }
    }

    public final void f() {
        if (i()) {
            this.f9133a.f();
        }
    }

    @Deprecated
    public final void g() {
    }

    public final void h() {
    }
}
