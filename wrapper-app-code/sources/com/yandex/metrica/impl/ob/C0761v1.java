package com.yandex.metrica.impl.ob;

import android.content.Intent;
import com.yandex.metrica.impl.ob.A1;

/* renamed from: com.yandex.metrica.impl.ob.v1  reason: case insensitive filesystem */
class C0761v1 implements A1.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0665r1 f6958a;

    C0761v1(C0665r1 r1Var) {
        this.f6958a = r1Var;
    }

    public void a(Intent intent) {
        if (this.f6958a.f6676a != null) {
            C0665r1 r1Var = this.f6958a;
            C0665r1.b(r1Var, r1Var.f6676a);
            C0665r1.d(this.f6958a);
            this.f6958a.f6680e.a(this.f6958a.f6676a);
        }
    }
}
