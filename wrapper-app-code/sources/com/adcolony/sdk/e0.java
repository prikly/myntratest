package com.adcolony.sdk;

class e0 {

    /* renamed from: c  reason: collision with root package name */
    static e0 f10040c = new e0(3, true);

    /* renamed from: d  reason: collision with root package name */
    static e0 f10041d = new e0(2, false);

    /* renamed from: e  reason: collision with root package name */
    static e0 f10042e = new e0(2, true);

    /* renamed from: f  reason: collision with root package name */
    static e0 f10043f = new e0(1, false);

    /* renamed from: g  reason: collision with root package name */
    static e0 f10044g = new e0(1, true);

    /* renamed from: h  reason: collision with root package name */
    static e0 f10045h = new e0(0, false);
    static e0 i = new e0(0, true);

    /* renamed from: a  reason: collision with root package name */
    private final int f10046a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10047b;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        StringBuilder f10048a = new StringBuilder();

        a() {
        }

        /* access modifiers changed from: package-private */
        public a a(String str) {
            this.f10048a.append(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        public a a(Object obj) {
            if (obj != null) {
                this.f10048a.append(obj.toString());
            } else {
                this.f10048a.append("null");
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public a a(int i) {
            this.f10048a.append(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public void a(e0 e0Var) {
            e0Var.a(this.f10048a.toString());
        }
    }

    static {
        new e0(3, false);
    }

    e0(int i2, boolean z) {
        this.f10046a = i2;
        this.f10047b = z;
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        a.b().q().a(this.f10046a, str, this.f10047b);
    }
}
