package com.yandex.metrica.impl.ob;

class S2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ R2 f4912a;

    class a implements Runnable {
        a() {
        }

        public void run() {
            C0609oh.a(S2.this.f4912a.f4843a);
        }
    }

    S2(R2 r2) {
        this.f4912a = r2;
    }

    public void run() {
        this.f4912a.f4847e.a().execute(new a());
    }
}
