package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.kc  reason: case insensitive filesystem */
public class C0504kc extends Pb {

    /* renamed from: com.yandex.metrica.impl.ob.kc$a */
    class a implements C0405gc {
        a() {
        }

        public void a(long j) {
            C0504kc.this.f4754a.j(j);
        }

        public long getLastAttemptTimeSeconds() {
            return C0504kc.this.f4754a.e(0);
        }
    }

    public C0504kc(Cc cc, C0352e9 e9Var) {
        this(cc, e9Var, new G1());
    }

    public C0405gc a() {
        return new a();
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "network";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "lbs";
    }

    C0504kc(Cc cc, C0352e9 e9Var, G1 g1) {
        super(cc, e9Var, g1);
    }

    /* access modifiers changed from: protected */
    public C0869zd a(C0845yd ydVar) {
        return this.f4756c.a(ydVar);
    }
}
