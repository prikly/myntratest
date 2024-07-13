package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.n4  reason: case insensitive filesystem */
public class C0571n4 implements K, C0496k4 {

    /* renamed from: a  reason: collision with root package name */
    private F3 f6300a;

    /* renamed from: b  reason: collision with root package name */
    private final ResultReceiver f6301b;

    public C0571n4(Context context, F3 f3, D3 d3) {
        this.f6300a = f3;
        this.f6301b = d3.f3849c;
        f3.a(this);
    }

    public void a(C0293c0 c0Var, D3 d3) {
        this.f6300a.a(d3.f3848b);
        this.f6300a.a(c0Var, this);
    }

    public F3 b() {
        return this.f6300a;
    }

    public void a(L l) {
        ResultReceiver resultReceiver = this.f6301b;
        int i = C0368f0.f5774b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            l.c(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    public void a() {
        this.f6300a.b(this);
    }
}
