package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;

public class Q1 extends C0859z3 {

    /* renamed from: c  reason: collision with root package name */
    protected C0808x0 f4805c;

    /* renamed from: d  reason: collision with root package name */
    protected C0457ie f4806d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4807e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4808f;

    protected Q1(A3 a3, CounterConfiguration counterConfiguration) {
        this(a3, counterConfiguration, (String) null);
    }

    /* access modifiers changed from: package-private */
    public void a(C0291bn bnVar) {
        this.f4805c = new C0808x0(bnVar);
    }

    /* access modifiers changed from: package-private */
    public Bundle c() {
        Bundle bundle = new Bundle();
        CounterConfiguration b2 = b();
        synchronized (b2) {
            bundle.putParcelable("COUNTER_CFG_OBJ", b2);
        }
        A3 a2 = a();
        synchronized (a2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", a2);
        }
        return bundle;
    }

    public String d() {
        return this.f4805c.a();
    }

    public String e() {
        return this.f4808f;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f4807e;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f4807e = true;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f4807e = false;
    }

    protected Q1(A3 a3, CounterConfiguration counterConfiguration, String str) {
        super(a3, counterConfiguration);
        this.f4807e = true;
        this.f4808f = str;
    }

    /* access modifiers changed from: package-private */
    public void a(C0485ji jiVar) {
        if (jiVar != null) {
            b().d(((C0436hi) jiVar).e());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(C0457ie ieVar) {
        this.f4806d = ieVar;
    }
}
