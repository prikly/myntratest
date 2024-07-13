package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.wh  reason: case insensitive filesystem */
public class C0801wh {

    /* renamed from: a  reason: collision with root package name */
    private final String f7052a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7053b;

    /* renamed from: c  reason: collision with root package name */
    private final C0352e9 f7054c;

    public C0801wh(String str, String str2) {
        this(str, str2, F0.g().s());
    }

    public String a() {
        C0352e9 e9Var = this.f7054c;
        String str = this.f7052a;
        String str2 = this.f7053b;
        e9Var.getClass();
        return e9Var.a(new Rd("LAST_SOCKET_REPORT_TIMES_" + str + "_" + str2, (String) null).a(), (String) null);
    }

    C0801wh(String str, String str2, C0352e9 e9Var) {
        this.f7052a = str;
        this.f7053b = str2;
        this.f7054c = e9Var;
    }

    public void a(String str) {
        this.f7054c.a(this.f7052a, this.f7053b, str);
    }
}
