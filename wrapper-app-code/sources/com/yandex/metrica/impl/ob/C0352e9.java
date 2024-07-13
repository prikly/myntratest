package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.e9  reason: case insensitive filesystem */
public class C0352e9 extends C0327d9 implements C0376f8, C0634ph {

    /* renamed from: c  reason: collision with root package name */
    static final Rd f5723c = new Rd("LOCATION_TRACKING_ENABLED", (String) null);

    /* renamed from: d  reason: collision with root package name */
    static final Rd f5724d = new Rd("PREF_KEY_OFFSET", (String) null);

    /* renamed from: e  reason: collision with root package name */
    static final Rd f5725e = new Rd("UNCHECKED_TIME", (String) null);

    /* renamed from: f  reason: collision with root package name */
    static final Rd f5726f = new Rd("STATISTICS_RESTRICTED_IN_MAIN", (String) null);

    /* renamed from: g  reason: collision with root package name */
    static final Rd f5727g = new Rd("LAST_IDENTITY_LIGHT_SEND_TIME", (String) null);

    /* renamed from: h  reason: collision with root package name */
    static final Rd f5728h = new Rd("NEXT_REPORT_SEND_ATTEMPT_NUMBER", (String) null);
    static final Rd i = new Rd("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", (String) null);
    static final Rd j = new Rd("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", (String) null);
    static final Rd k = new Rd("LAST_REPORT_SEND_ATTEMPT_TIME", (String) null);
    static final Rd l = new Rd("LAST_LOCATION_SEND_ATTEMPT_TIME", (String) null);
    static final Rd m = new Rd("LAST_STARTUP_SEND_ATTEMPT_TIME", (String) null);
    private static final Rd n = new Rd("LAST_MIGRATION_VERSION", (String) null);
    static final Rd o = new Rd("LAST_WIFI_SCANNING_ATTEMPT_TIME", (String) null);
    static final Rd p = new Rd("LAST_LBS_SCANNING_ATTEMPT_TIME", (String) null);
    static final Rd q = new Rd("LAST_GPS_SCANNING_ATTEMPT_TIME", (String) null);
    static final Rd r = new Rd("LAST_FUSED_SCANNING_ATTEMPT_TIME", (String) null);
    static final Rd s = new Rd("SATELLITE_PRELOAD_INFO_CHECKED", (String) null);
    static final Rd t = new Rd("SATELLITE_CLIDS_CHECKED", (String) null);
    static final Rd u = new Rd("CERTIFICATE_REQUEST_ETAG", (String) null);
    static final Rd v = new Rd("CERTIFICATE_REQUEST_NEXT_ATTEMPT_TIME", (String) null);
    static final Rd w = new Rd("VITAL_DATA", (String) null);

    static {
        new Rd("SDKFCE", (String) null);
        new Rd("FST", (String) null);
        new Rd("LSST", (String) null);
        new Rd("FSDKFCO", (String) null);
        new Rd("SRSDKFC", (String) null);
        new Rd("LSDKFCAT", (String) null);
    }

    public C0352e9(S7 s7) {
        super(s7);
    }

    @Deprecated
    public int a(int i2) {
        return a(n.a(), i2);
    }

    public long b(int i2) {
        return a(f5724d.a(), (long) i2);
    }

    public C0352e9 c(boolean z) {
        return (C0352e9) b(f5725e.a(), z);
    }

    public void d(boolean z) {
        b(f5723c.a(), z).d();
    }

    public long e(long j2) {
        return a(p.a(), j2);
    }

    public Boolean f() {
        Rd rd = f5726f;
        if (c(rd.a())) {
            return Boolean.valueOf(a(rd.a(), true));
        }
        return null;
    }

    public boolean g() {
        return a(f5723c.a(), false);
    }

    public C0352e9 h(long j2) {
        return (C0352e9) b(q.a(), j2);
    }

    public C0352e9 i(long j2) {
        return (C0352e9) b(f5727g.a(), j2);
    }

    public C0352e9 j(long j2) {
        return (C0352e9) b(p.a(), j2);
    }

    public C0352e9 k(long j2) {
        return (C0352e9) b(o.a(), j2);
    }

    public C0352e9 l(long j2) {
        return (C0352e9) b(f5724d.a(), j2);
    }

    public boolean a(boolean z) {
        return a(f5725e.a(), z);
    }

    public C0352e9 b(boolean z) {
        return (C0352e9) b(f5726f.a(), z);
    }

    public long c(long j2) {
        return a(q.a(), j2);
    }

    public long d(long j2) {
        return a(f5727g.a(), j2);
    }

    public C0352e9 g(long j2) {
        return (C0352e9) b(r.a(), j2);
    }

    public C0352e9 h() {
        return (C0352e9) b(t.a(), true);
    }

    public C0352e9 i() {
        return (C0352e9) b(s.a(), true);
    }

    @Deprecated
    public C0352e9 j() {
        return (C0352e9) f(n.a());
    }

    public boolean k() {
        return a(s.a(), false);
    }

    public boolean l() {
        return a(t.a(), false);
    }

    public int a(C0654qd qdVar, int i2) {
        Rd b2 = b(qdVar);
        return b2 == null ? i2 : a(b2.a(), i2);
    }

    public C0352e9 b(C0654qd qdVar, int i2) {
        Rd b2 = b(qdVar);
        return b2 != null ? (C0352e9) b(b2.a(), i2) : this;
    }

    public String c() {
        return a(w.a(), (String) null);
    }

    public long f(long j2) {
        return a(o.a(), j2);
    }

    public long a(C0654qd qdVar, long j2) {
        Rd a2 = a(qdVar);
        return a2 == null ? j2 : a(a2.a(), j2);
    }

    public C0352e9 b(C0654qd qdVar, long j2) {
        Rd a2 = a(qdVar);
        return a2 != null ? (C0352e9) b(a2.a(), j2) : this;
    }

    public C0352e9 a(String str, String str2, String str3) {
        return (C0352e9) b(new Rd("LAST_SOCKET_REPORT_TIMES_" + str + "_" + str2, (String) null).a(), str3);
    }

    public long b(long j2) {
        return a(r.a(), j2);
    }

    public String b() {
        return a(u.a(), (String) null);
    }

    public long a() {
        return a(v.a(), 0);
    }

    public C0634ph b(String str) {
        return (C0634ph) b(u.a(), str);
    }

    private Rd b(C0654qd qdVar) {
        int ordinal = qdVar.ordinal();
        if (ordinal == 0) {
            return f5728h;
        }
        if (ordinal == 1) {
            return i;
        }
        if (ordinal != 2) {
            return null;
        }
        return j;
    }

    public C0634ph a(long j2) {
        return (C0634ph) b(v.a(), j2);
    }

    public void a(String str) {
        b(w.a(), str);
    }

    private Rd a(C0654qd qdVar) {
        int ordinal = qdVar.ordinal();
        if (ordinal == 0) {
            return k;
        }
        if (ordinal == 1) {
            return l;
        }
        if (ordinal != 2) {
            return null;
        }
        return m;
    }
}
