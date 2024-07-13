package com.yandex.metrica.impl.ob;

class Rb {

    /* renamed from: a  reason: collision with root package name */
    private C0554mc f4860a;

    /* renamed from: b  reason: collision with root package name */
    private final U7 f4861b;

    /* renamed from: c  reason: collision with root package name */
    private final T7 f4862c;

    public Rb(C0554mc mcVar, U7 u7, T7 t7) {
        this.f4860a = mcVar;
        this.f4861b = u7;
        this.f4862c = t7;
    }

    public void a() {
        C0554mc mcVar = this.f4860a;
        if (mcVar != null) {
            long c2 = this.f4861b.c();
            int i = mcVar.f6215f;
            boolean z = true;
            if (c2 > ((long) i)) {
                this.f4861b.b((int) (((float) i) * 0.1f));
            }
            C0554mc mcVar2 = this.f4860a;
            long c3 = this.f4862c.c();
            int i2 = mcVar2.f6215f;
            if (c3 <= ((long) i2)) {
                z = false;
            }
            if (z) {
                this.f4862c.b((int) (((float) i2) * 0.1f));
            }
        }
    }

    public void a(C0554mc mcVar) {
        this.f4860a = mcVar;
    }
}
