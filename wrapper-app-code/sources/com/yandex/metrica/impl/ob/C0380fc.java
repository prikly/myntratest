package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.fc  reason: case insensitive filesystem */
public class C0380fc extends Pb {

    /* renamed from: com.yandex.metrica.impl.ob.fc$a */
    class a implements C0405gc {
        a() {
        }

        public void a(long j) {
            C0380fc.this.f4754a.h(j);
        }

        public long getLastAttemptTimeSeconds() {
            return C0380fc.this.f4754a.c(0);
        }
    }

    public C0380fc(Cc cc, C0352e9 e9Var) {
        this(cc, e9Var, new G1());
    }

    public C0405gc a() {
        return new a();
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "gps";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "gps";
    }

    C0380fc(Cc cc, C0352e9 e9Var, G1 g1) {
        super(cc, e9Var, g1);
    }

    /* access modifiers changed from: protected */
    public C0869zd a(C0845yd ydVar) {
        return this.f4756c.c(ydVar);
    }
}
