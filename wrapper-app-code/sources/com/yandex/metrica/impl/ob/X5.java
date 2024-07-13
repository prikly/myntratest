package com.yandex.metrica.impl.ob;

public class X5 {

    /* renamed from: a  reason: collision with root package name */
    private final C0374f6 f5296a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f5297b;

    /* renamed from: c  reason: collision with root package name */
    private final Long f5298c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f5299d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f5300e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f5301f;

    /* renamed from: g  reason: collision with root package name */
    private final Long f5302g;

    /* renamed from: h  reason: collision with root package name */
    private final Long f5303h;

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Long f5304a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C0374f6 f5305b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Long f5306c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Long f5307d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Integer f5308e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public Long f5309f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Boolean f5310g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Long f5311h;

        private b(Z5 z5) {
            this.f5305b = z5.b();
            this.f5308e = z5.a();
        }

        public b a(Long l) {
            this.f5307d = l;
            return this;
        }

        public b b(Long l) {
            this.f5309f = l;
            return this;
        }

        public b c(Long l) {
            this.f5306c = l;
            return this;
        }

        public b d(Long l) {
            this.f5311h = l;
            return this;
        }

        public b a(Boolean bool) {
            this.f5310g = bool;
            return this;
        }
    }

    public C0374f6 a() {
        return this.f5296a;
    }

    public long b(long j) {
        Long l = this.f5300e;
        return l == null ? j : l.longValue();
    }

    public long c(long j) {
        Long l = this.f5297b;
        return l == null ? j : l.longValue();
    }

    public long d(long j) {
        Long l = this.f5303h;
        return l == null ? j : l.longValue();
    }

    public long e(long j) {
        Long l = this.f5302g;
        return l == null ? j : l.longValue();
    }

    private X5(b bVar) {
        this.f5296a = bVar.f5305b;
        this.f5299d = bVar.f5308e;
        this.f5297b = bVar.f5306c;
        this.f5298c = bVar.f5307d;
        this.f5300e = bVar.f5309f;
        this.f5301f = bVar.f5310g;
        this.f5302g = bVar.f5311h;
        this.f5303h = bVar.f5304a;
    }

    public long a(long j) {
        Long l = this.f5298c;
        return l == null ? j : l.longValue();
    }

    public int a(int i) {
        Integer num = this.f5299d;
        return num == null ? i : num.intValue();
    }

    public boolean a(boolean z) {
        Boolean bool = this.f5301f;
        return bool == null ? z : bool.booleanValue();
    }
}
