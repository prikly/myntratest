package com.yandex.metrica.impl.ob;

public class Mb extends Uc<Xb> {

    /* renamed from: c  reason: collision with root package name */
    private final String f4546c;

    public Mb(C0405gc gcVar, String str) {
        this(gcVar, str, new C0810x2());
    }

    public boolean a(Object obj) {
        Wb wb = ((Xb) obj).f5333b;
        return wb != null && a(wb.f5261b);
    }

    public boolean b(Object obj) {
        return ((Xb) obj).f5332a.f4823a;
    }

    Mb(C0405gc gcVar, String str, C0810x2 x2Var) {
        super(gcVar, x2Var);
        this.f4546c = str;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return this.f4546c;
    }
}
