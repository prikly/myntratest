package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.hk  reason: case insensitive filesystem */
class C0438hk {

    /* renamed from: a  reason: collision with root package name */
    private final C0338dk f5941a;

    /* renamed from: b  reason: collision with root package name */
    private final C0288bk f5942b;

    C0438hk(Context context) {
        this(new C0338dk(context), new C0288bk());
    }

    /* access modifiers changed from: package-private */
    public Wk a(Activity activity, C0389fl flVar) {
        if (flVar == null) {
            return Wk.NULL_UI_ACCESS_CONFIG;
        }
        if (!flVar.f5821a) {
            return Wk.UI_PARING_FEATURE_DISABLED;
        }
        C0805wl wlVar = flVar.f5825e;
        if (wlVar == null) {
            return Wk.NULL_UI_PARSING_CONFIG;
        }
        if (this.f5941a.a(activity, wlVar)) {
            return Wk.FORBIDDEN_FOR_APP;
        }
        if (this.f5942b.a(activity, flVar.f5825e)) {
            return Wk.FORBIDDEN_FOR_ACTIVITY;
        }
        return Wk.OK;
    }

    C0438hk(C0338dk dkVar, C0288bk bkVar) {
        this.f5941a = dkVar;
        this.f5942b = bkVar;
    }
}
