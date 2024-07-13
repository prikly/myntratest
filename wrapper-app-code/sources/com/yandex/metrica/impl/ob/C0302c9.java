package com.yandex.metrica.impl.ob;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.yandex.metrica.impl.ob.C0687s;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.c9  reason: case insensitive filesystem */
public class C0302c9 extends C0327d9 implements C0376f8 {

    /* renamed from: c  reason: collision with root package name */
    private static final Rd f5604c = new Rd("IDENTITY_SEND_TIME", (String) null);

    /* renamed from: d  reason: collision with root package name */
    private static final Rd f5605d = new Rd("PERMISSIONS_CHECK_TIME", (String) null);

    /* renamed from: e  reason: collision with root package name */
    private static final Rd f5606e = new Rd("USER_INFO", (String) null);

    /* renamed from: f  reason: collision with root package name */
    private static final Rd f5607f = new Rd("PROFILE_ID", (String) null);

    /* renamed from: g  reason: collision with root package name */
    private static final Rd f5608g = new Rd("APP_ENVIRONMENT", (String) null);

    /* renamed from: h  reason: collision with root package name */
    private static final Rd f5609h = new Rd("APP_ENVIRONMENT_REVISION", (String) null);
    private static final Rd i = new Rd("LAST_MIGRATION_VERSION", (String) null);
    private static final Rd j = new Rd("LAST_APP_VERSION_WITH_FEATURES", (String) null);
    private static final Rd k = new Rd("APPLICATION_FEATURES", (String) null);
    private static final Rd l = new Rd("LAST_STAT_SENDING_DISABLED_REPORTING_TIMESTAMP", (String) null);
    private static final Rd m = new Rd("CERTIFICATES_SHA1_FINGERPRINTS", (String) null);
    static final Rd n = new Rd("DEPRECATED_NATIVE_CRASHES_CHECKED", (String) null);
    private static final Rd o = new Rd("REFERRER_HANDLED", (String) null);
    private static final Rd p = new Rd("VITAL_DATA", (String) null);

    public C0302c9(S7 s7) {
        super(s7);
    }

    public C0302c9 a(C0687s.a aVar) {
        synchronized (this) {
            b(f5608g.a(), aVar.f6766a);
            b(f5609h.a(), aVar.f6767b);
        }
        return this;
    }

    public long b(long j2) {
        return a(f5604c.a(), j2);
    }

    public C0302c9 c(long j2) {
        return (C0302c9) b(f5604c.a(), j2);
    }

    public C0302c9 d(long j2) {
        return (C0302c9) b(l.a(), j2);
    }

    public C0302c9 e(long j2) {
        return (C0302c9) b(f5605d.a(), j2);
    }

    public C0687s.a f() {
        C0687s.a aVar;
        synchronized (this) {
            aVar = new C0687s.a(a(f5608g.a(), JsonUtils.EMPTY_JSON), a(f5609h.a(), 0));
        }
        return aVar;
    }

    public String g() {
        return a(k.a(), "");
    }

    public C0302c9 h(String str) {
        return (C0302c9) b(k.a(), str);
    }

    public int i() {
        return a(j.a(), -1);
    }

    public C0302c9 j(String str) {
        return (C0302c9) b(f5606e.a(), str);
    }

    public long k() {
        return a(l.a(), 0);
    }

    public long l() {
        return a(f5605d.a(), 0);
    }

    public String m() {
        return e(f5607f.a());
    }

    public String n() {
        return a(f5606e.a(), (String) null);
    }

    public boolean o() {
        return a(n.a(), false);
    }

    public C0302c9 p() {
        return (C0302c9) b(n.a(), true);
    }

    @Deprecated
    public C0302c9 q() {
        return (C0302c9) b(o.a(), true);
    }

    @Deprecated
    public C0302c9 r() {
        return (C0302c9) f(i.a());
    }

    @Deprecated
    public C0302c9 s() {
        return (C0302c9) f(o.a());
    }

    @Deprecated
    public Boolean t() {
        Rd rd = o;
        if (!c(rd.a())) {
            return null;
        }
        return Boolean.valueOf(a(rd.a(), false));
    }

    public C0302c9 c(String str, String str2) {
        return (C0302c9) b(new Rd("SESSION_", str).a(), str2);
    }

    public String g(String str) {
        return a(new Rd("SESSION_", str).a(), "");
    }

    public List<String> h() {
        return a(m.a(), (List<String>) Collections.emptyList());
    }

    public C0302c9 i(String str) {
        return (C0302c9) b(f5607f.a(), str);
    }

    @Deprecated
    public Integer j() {
        Rd rd = i;
        if (!c(rd.a())) {
            return null;
        }
        return Integer.valueOf((int) a(rd.a(), 0));
    }

    public String c() {
        return a(p.a(), (String) null);
    }

    public C0302c9 a(int i2) {
        return (C0302c9) b(j.a(), i2);
    }

    public C0302c9 a(List<String> list) {
        return (C0302c9) b(m.a(), list);
    }

    public void a(String str) {
        b(p.a(), str);
    }
}
