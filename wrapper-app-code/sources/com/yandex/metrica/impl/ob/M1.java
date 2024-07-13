package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.rtm.wrapper.f;

class M1 {

    /* renamed from: a  reason: collision with root package name */
    private final C0618p1 f4521a;

    /* renamed from: b  reason: collision with root package name */
    private final f f4522b;

    M1(C0618p1 p1Var, Context context) {
        this(p1Var, new Zg().b(context));
    }

    /* access modifiers changed from: package-private */
    public void a(int i, Bundle bundle) {
        if (i == 1) {
            this.f4521a.reportData(bundle);
        } else if (i == 2) {
            this.f4522b.reportData(bundle);
        }
    }

    M1(C0618p1 p1Var, f fVar) {
        this.f4521a = p1Var;
        this.f4522b = fVar;
    }
}
