package com.yandex.metrica.impl.ob;

public final class Z5 {

    /* renamed from: a  reason: collision with root package name */
    private final C0374f6 f5396a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f5397b;

    static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public C0374f6 f5398a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Integer f5399b;

        private b(C0374f6 f6Var) {
            this.f5398a = f6Var;
        }

        public b a(int i) {
            this.f5399b = Integer.valueOf(i);
            return this;
        }

        public Z5 a() {
            return new Z5(this);
        }
    }

    public static final b a(C0374f6 f6Var) {
        return new b(f6Var);
    }

    public C0374f6 b() {
        return this.f5396a;
    }

    private Z5(b bVar) {
        this.f5396a = bVar.f5398a;
        this.f5397b = bVar.f5399b;
    }

    public Integer a() {
        return this.f5397b;
    }
}
