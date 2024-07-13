package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C0413gk;
import java.util.Collections;

class Sk {

    /* renamed from: a  reason: collision with root package name */
    private final C0512kk f4976a;

    /* renamed from: b  reason: collision with root package name */
    private final C0277b9 f4977b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C0389fl f4978c;

    /* renamed from: d  reason: collision with root package name */
    private final Bl f4979d;

    /* renamed from: e  reason: collision with root package name */
    private final C0413gk.b f4980e;

    /* renamed from: f  reason: collision with root package name */
    private final C0438hk f4981f;

    Sk(C0389fl flVar, C0512kk kkVar, C0277b9 b9Var, Bl bl, C0438hk hkVar) {
        this(flVar, kkVar, b9Var, bl, hkVar, new C0413gk.b());
    }

    /* access modifiers changed from: package-private */
    public void a(C0389fl flVar) {
        this.f4978c = flVar;
    }

    Sk(C0389fl flVar, C0512kk kkVar, C0277b9 b9Var, Bl bl, C0438hk hkVar, C0413gk.b bVar) {
        this.f4978c = flVar;
        this.f4976a = kkVar;
        this.f4977b = b9Var;
        this.f4979d = bl;
        this.f4981f = hkVar;
        this.f4980e = bVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Activity activity, C0538ll llVar, boolean z) {
        String str;
        C0389fl flVar = this.f4978c;
        if ((z || this.f4976a.b().isEmpty()) && activity != null) {
            Wk a2 = this.f4981f.a(activity, flVar);
            if (a2 != Wk.OK) {
                int ordinal = a2.ordinal();
                if (ordinal == 1) {
                    str = String.format("no %s_config", new Object[]{"ui_access"});
                } else if (ordinal == 2) {
                    str = String.format("no %s_config", new Object[]{"ui_parsing"});
                } else if (ordinal != 3) {
                    str = ordinal != 4 ? ordinal != 5 ? "parsing ui context is forbidden for some reason" : "parsing ui context is forbidden by app for activity" : "parsing ui context is forbidden by app for application";
                } else {
                    str = String.format("feature %s disabled", new Object[]{"ui_parsing"});
                }
                llVar.onError(str);
            } else if (!flVar.f5823c) {
                llVar.onError(String.format("feature %s disabled", new Object[]{"ui_collecting_for_bridge"}));
            } else if (flVar.f5827g == null) {
                llVar.onError(String.format("no %s_config", new Object[]{"ui_collecting_for_bridge"}));
            } else {
                Bl bl = this.f4979d;
                C0805wl wlVar = flVar.f5825e;
                C0413gk.b bVar = this.f4980e;
                C0512kk kkVar = this.f4976a;
                C0277b9 b9Var = this.f4977b;
                bVar.getClass();
                bl.a(activity, 0, flVar, wlVar, Collections.singletonList(new C0413gk(kkVar, b9Var, z, llVar, new C0413gk.a())));
            }
        } else {
            llVar.onResult(this.f4976a.a());
        }
    }
}
