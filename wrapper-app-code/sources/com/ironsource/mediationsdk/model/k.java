package com.ironsource.mediationsdk.model;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8764a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8765b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8766c;

    /* renamed from: d  reason: collision with root package name */
    public l f8767d;

    /* renamed from: e  reason: collision with root package name */
    public int f8768e;

    /* renamed from: f  reason: collision with root package name */
    public int f8769f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f8770a = true;

        /* renamed from: b  reason: collision with root package name */
        private boolean f8771b = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f8772c = false;

        /* renamed from: d  reason: collision with root package name */
        private l f8773d = null;

        /* renamed from: e  reason: collision with root package name */
        private int f8774e = 0;

        /* renamed from: f  reason: collision with root package name */
        private int f8775f = 0;

        public final a a(boolean z, int i) {
            this.f8772c = z;
            this.f8775f = i;
            return this;
        }

        public final a a(boolean z, l lVar, int i) {
            this.f8771b = z;
            if (lVar == null) {
                lVar = l.PER_DAY;
            }
            this.f8773d = lVar;
            this.f8774e = i;
            return this;
        }

        public final k a() {
            return new k(this.f8770a, this.f8771b, this.f8772c, this.f8773d, this.f8774e, this.f8775f, (byte) 0);
        }
    }

    private k(boolean z, boolean z2, boolean z3, l lVar, int i, int i2) {
        this.f8764a = z;
        this.f8765b = z2;
        this.f8766c = z3;
        this.f8767d = lVar;
        this.f8768e = i;
        this.f8769f = i2;
    }

    /* synthetic */ k(boolean z, boolean z2, boolean z3, l lVar, int i, int i2, byte b2) {
        this(z, z2, z3, lVar, i, i2);
    }
}
