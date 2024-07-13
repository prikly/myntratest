package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C0413gk;
import java.util.Collections;
import org.json.JSONObject;

class Xk {

    /* renamed from: a  reason: collision with root package name */
    private final C0538ll f5349a;

    /* renamed from: b  reason: collision with root package name */
    private final C0512kk f5350b;

    /* renamed from: c  reason: collision with root package name */
    private final C0277b9 f5351c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C0389fl f5352d;

    /* renamed from: e  reason: collision with root package name */
    private final Bl f5353e;

    /* renamed from: f  reason: collision with root package name */
    private final C0413gk.b f5354f;

    /* renamed from: g  reason: collision with root package name */
    private final C0438hk f5355g;

    class a implements C0538ll {
        a(Xk xk) {
        }

        public void onError(String str) {
        }

        public void onResult(JSONObject jSONObject) {
        }
    }

    Xk(C0389fl flVar, C0512kk kkVar, C0277b9 b9Var, Bl bl, C0438hk hkVar) {
        this(flVar, kkVar, b9Var, bl, hkVar, new C0413gk.b());
    }

    /* access modifiers changed from: package-private */
    public void a(C0389fl flVar) {
        this.f5352d = flVar;
    }

    /* access modifiers changed from: package-private */
    public void b(Activity activity) {
        C0389fl flVar = this.f5352d;
        if (this.f5355g.a(activity, flVar) == Wk.OK) {
            a(activity, 0, flVar, flVar.f5825e);
        }
    }

    Xk(C0389fl flVar, C0512kk kkVar, C0277b9 b9Var, Bl bl, C0438hk hkVar, C0413gk.b bVar) {
        this.f5349a = new a(this);
        this.f5352d = flVar;
        this.f5350b = kkVar;
        this.f5351c = b9Var;
        this.f5353e = bl;
        this.f5354f = bVar;
        this.f5355g = hkVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Activity activity) {
        C0389fl flVar = this.f5352d;
        if (this.f5355g.a(activity, flVar) == Wk.OK) {
            C0805wl wlVar = flVar.f5825e;
            a(activity, wlVar.f7068d, flVar, wlVar);
        }
    }

    private void a(Activity activity, long j, C0389fl flVar, C0805wl wlVar) {
        Bl bl = this.f5353e;
        C0413gk.b bVar = this.f5354f;
        C0512kk kkVar = this.f5350b;
        C0277b9 b9Var = this.f5351c;
        C0538ll llVar = this.f5349a;
        bVar.getClass();
        bl.a(activity, j, flVar, wlVar, Collections.singletonList(new C0413gk(kkVar, b9Var, false, llVar, new C0413gk.a())));
    }
}
