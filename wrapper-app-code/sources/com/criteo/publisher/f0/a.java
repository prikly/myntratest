package com.criteo.publisher.f0;

import com.criteo.publisher.f0.n;

/* compiled from: $AutoValue_Metric */
abstract class a extends n {

    /* renamed from: a  reason: collision with root package name */
    private final Long f2399a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f2400b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2401c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2402d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f2403e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2404f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2405g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f2406h;
    private final Integer i;
    private final boolean j;

    a(Long l, Long l2, boolean z, boolean z2, Long l3, String str, String str2, Integer num, Integer num2, boolean z3) {
        this.f2399a = l;
        this.f2400b = l2;
        this.f2401c = z;
        this.f2402d = z2;
        this.f2403e = l3;
        if (str != null) {
            this.f2404f = str;
            this.f2405g = str2;
            this.f2406h = num;
            this.i = num2;
            this.j = z3;
            return;
        }
        throw new NullPointerException("Null impressionId");
    }

    /* access modifiers changed from: package-private */
    public Long c() {
        return this.f2399a;
    }

    /* access modifiers changed from: package-private */
    public Long b() {
        return this.f2400b;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f2401c;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f2402d;
    }

    /* access modifiers changed from: package-private */
    public Long d() {
        return this.f2403e;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f2404f;
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return this.f2405g;
    }

    /* access modifiers changed from: package-private */
    public Integer h() {
        return this.f2406h;
    }

    /* access modifiers changed from: package-private */
    public Integer f() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.j;
    }

    public String toString() {
        return "Metric{cdbCallStartTimestamp=" + this.f2399a + ", cdbCallEndTimestamp=" + this.f2400b + ", cdbCallTimeout=" + this.f2401c + ", cachedBidUsed=" + this.f2402d + ", elapsedTimestamp=" + this.f2403e + ", impressionId=" + this.f2404f + ", requestGroupId=" + this.f2405g + ", zoneId=" + this.f2406h + ", profileId=" + this.i + ", readyToSend=" + this.j + "}";
    }

    public boolean equals(Object obj) {
        Long l;
        String str;
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        Long l2 = this.f2399a;
        if (l2 != null ? l2.equals(nVar.c()) : nVar.c() == null) {
            Long l3 = this.f2400b;
            if (l3 != null ? l3.equals(nVar.b()) : nVar.b() == null) {
                if (this.f2401c != nVar.j() || this.f2402d != nVar.i() || ((l = this.f2403e) != null ? !l.equals(nVar.d()) : nVar.d() != null) || !this.f2404f.equals(nVar.e()) || ((str = this.f2405g) != null ? !str.equals(nVar.g()) : nVar.g() != null) || ((num = this.f2406h) != null ? !num.equals(nVar.h()) : nVar.h() != null) || ((num2 = this.i) != null ? !num2.equals(nVar.f()) : nVar.f() != null) || this.j != nVar.k()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Long l = this.f2399a;
        int i2 = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003;
        Long l2 = this.f2400b;
        int i3 = 1231;
        int hashCode2 = (((((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.f2401c ? 1231 : 1237)) * 1000003) ^ (this.f2402d ? 1231 : 1237)) * 1000003;
        Long l3 = this.f2403e;
        int hashCode3 = (((hashCode2 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003) ^ this.f2404f.hashCode()) * 1000003;
        String str = this.f2405g;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.f2406h;
        int hashCode5 = (hashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.i;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        int i4 = (hashCode5 ^ i2) * 1000003;
        if (!this.j) {
            i3 = 1237;
        }
        return i4 ^ i3;
    }

    /* access modifiers changed from: package-private */
    public n.a l() {
        return new b(this);
    }

    /* compiled from: $AutoValue_Metric */
    static class b extends n.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f2407a;

        /* renamed from: b  reason: collision with root package name */
        private Long f2408b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f2409c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f2410d;

        /* renamed from: e  reason: collision with root package name */
        private Long f2411e;

        /* renamed from: f  reason: collision with root package name */
        private String f2412f;

        /* renamed from: g  reason: collision with root package name */
        private String f2413g;

        /* renamed from: h  reason: collision with root package name */
        private Integer f2414h;
        private Integer i;
        private Boolean j;

        b() {
        }

        private b(n nVar) {
            this.f2407a = nVar.c();
            this.f2408b = nVar.b();
            this.f2409c = Boolean.valueOf(nVar.j());
            this.f2410d = Boolean.valueOf(nVar.i());
            this.f2411e = nVar.d();
            this.f2412f = nVar.e();
            this.f2413g = nVar.g();
            this.f2414h = nVar.h();
            this.i = nVar.f();
            this.j = Boolean.valueOf(nVar.k());
        }

        /* access modifiers changed from: package-private */
        public n.a b(Long l) {
            this.f2407a = l;
            return this;
        }

        /* access modifiers changed from: package-private */
        public n.a a(Long l) {
            this.f2408b = l;
            return this;
        }

        /* access modifiers changed from: package-private */
        public n.a b(boolean z) {
            this.f2409c = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        public n.a a(boolean z) {
            this.f2410d = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        public n.a c(Long l) {
            this.f2411e = l;
            return this;
        }

        /* access modifiers changed from: package-private */
        public n.a a(String str) {
            if (str != null) {
                this.f2412f = str;
                return this;
            }
            throw new NullPointerException("Null impressionId");
        }

        /* access modifiers changed from: package-private */
        public n.a b(String str) {
            this.f2413g = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public n.a b(Integer num) {
            this.f2414h = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public n.a a(Integer num) {
            this.i = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public n.a c(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        public n a() {
            String str = "";
            if (this.f2409c == null) {
                str = str + " cdbCallTimeout";
            }
            if (this.f2410d == null) {
                str = str + " cachedBidUsed";
            }
            if (this.f2412f == null) {
                str = str + " impressionId";
            }
            if (this.j == null) {
                str = str + " readyToSend";
            }
            if (str.isEmpty()) {
                return new e(this.f2407a, this.f2408b, this.f2409c.booleanValue(), this.f2410d.booleanValue(), this.f2411e, this.f2412f, this.f2413g, this.f2414h, this.i, this.j.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
