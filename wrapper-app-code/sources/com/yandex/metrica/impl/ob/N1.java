package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;

class N1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4580a;

    /* renamed from: b  reason: collision with root package name */
    private final C0293c0 f4581b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f4582c;

    /* renamed from: d  reason: collision with root package name */
    private final C0471j4 f4583d;

    N1(Context context, C0293c0 c0Var, Bundle bundle, C0471j4 j4Var) {
        this.f4580a = context;
        this.f4581b = c0Var;
        this.f4582c = bundle;
        this.f4583d = j4Var;
    }

    public void run() {
        C0859z3 z3Var = new C0859z3(this.f4582c);
        if (!C0859z3.a(z3Var, this.f4580a)) {
            C0447i4 a2 = C0447i4.a(z3Var);
            D3 d3 = new D3(z3Var);
            this.f4583d.a(a2, d3).a(this.f4581b, d3);
        }
    }
}
