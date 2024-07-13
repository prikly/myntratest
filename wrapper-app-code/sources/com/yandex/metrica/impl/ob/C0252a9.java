package com.yandex.metrica.impl.ob;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.a9  reason: case insensitive filesystem */
public class C0252a9 extends C0327d9 {

    /* renamed from: c  reason: collision with root package name */
    private final Rd f5468c = new Rd("init_event_pref_key");

    /* renamed from: d  reason: collision with root package name */
    private final Rd f5469d = new Rd("first_event_pref_key");

    public C0252a9(S7 s7) {
        super(s7);
    }

    @Deprecated
    public boolean f() {
        return a(this.f5469d.a(), (String) null) != null;
    }

    @Deprecated
    public String g(String str) {
        return a(this.f5468c.a(), (String) null);
    }

    @Deprecated
    public C0252a9 h() {
        return (C0252a9) f(this.f5469d.a());
    }

    @Deprecated
    public C0252a9 i() {
        return (C0252a9) f(this.f5468c.a());
    }

    @Deprecated
    public void j() {
        b(this.f5469d.a(), "DONE").d();
    }

    @Deprecated
    public void k() {
        b(this.f5468c.a(), "DONE").d();
    }

    @Deprecated
    public boolean g() {
        return a(this.f5468c.a(), (String) null) != null;
    }
}
