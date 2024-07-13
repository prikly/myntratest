package com.yandex.metrica.impl.ob;

public class Z8 extends C0327d9 {

    /* renamed from: c  reason: collision with root package name */
    private static final Rd f5409c = new Rd("LAST_SATELLITE_CLIDS_DIAGNOSTICS_SENT_TIME", (String) null);

    /* renamed from: d  reason: collision with root package name */
    private static final Rd f5410d = new Rd("LAST_PRELOAD_INFO_DIAGNOSTICS_SENT_TIME", (String) null);

    public Z8(S7 s7) {
        super(s7);
    }

    public long b(long j) {
        return a(f5409c.a(), j);
    }

    public long c(long j) {
        return a(f5410d.a(), j);
    }

    public Z8 d(long j) {
        return (Z8) b(f5409c.a(), j);
    }

    public Z8 e(long j) {
        return (Z8) b(f5410d.a(), j);
    }
}
