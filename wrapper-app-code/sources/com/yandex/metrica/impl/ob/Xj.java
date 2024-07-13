package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

public class Xj extends C0660qj {

    /* renamed from: a  reason: collision with root package name */
    private int f5347a;

    /* renamed from: b  reason: collision with root package name */
    private C0660qj f5348b;

    public Xj(Context context, ICommonExecutor iCommonExecutor) {
        this(context.getApplicationContext(), new C0565mn(), iCommonExecutor);
    }

    public synchronized void a() {
        int i = this.f5347a + 1;
        this.f5347a = i;
        if (i == 1) {
            this.f5348b.a();
        }
    }

    public synchronized void b() {
        int i = this.f5347a - 1;
        this.f5347a = i;
        if (i == 0) {
            this.f5348b.b();
        }
    }

    Xj(Context context, C0565mn mnVar, ICommonExecutor iCommonExecutor) {
        if (mnVar.a(context, "android.hardware.telephony")) {
            this.f5348b = new Ij(context, iCommonExecutor);
        } else {
            this.f5348b = new Kj();
        }
    }

    public synchronized void a(C0263ak akVar) {
        this.f5348b.a(akVar);
    }

    public synchronized void a(C0779vj vjVar) {
        this.f5348b.a(vjVar);
    }

    public void a(boolean z) {
        this.f5348b.a(z);
    }

    public void a(C0635pi piVar) {
        this.f5348b.a(piVar);
    }

    public void a(C0554mc mcVar) {
        this.f5348b.a(mcVar);
    }
}
