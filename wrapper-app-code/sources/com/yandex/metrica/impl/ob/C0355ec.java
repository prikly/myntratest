package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.ec  reason: case insensitive filesystem */
public class C0355ec {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0352e9 f5732a;

    /* renamed from: b  reason: collision with root package name */
    private final Cc f5733b;

    /* renamed from: c  reason: collision with root package name */
    private final C0405gc f5734c;

    /* renamed from: d  reason: collision with root package name */
    private final C0280bc f5735d = a();

    /* renamed from: e  reason: collision with root package name */
    private final Zb f5736e;

    /* renamed from: f  reason: collision with root package name */
    private final C0330dc f5737f;

    /* renamed from: com.yandex.metrica.impl.ob.ec$a */
    class a implements C0405gc {
        a() {
        }

        public void a(long j) {
            C0355ec.this.f5732a.g(j);
        }

        public long getLastAttemptTimeSeconds() {
            return C0355ec.this.f5732a.b(0);
        }
    }

    public C0355ec(Cc cc, C0352e9 e9Var, Pc pc) {
        this.f5733b = cc;
        this.f5732a = e9Var;
        C0405gc b2 = b();
        this.f5734c = b2;
        this.f5736e = a(b2);
        this.f5737f = a(pc);
    }

    private C0405gc b() {
        return new a();
    }

    private C0280bc a() {
        return new C0280bc(this.f5733b.f3817a.f4925b);
    }

    private Zb a(C0405gc gcVar) {
        return new Zb(gcVar, new C0810x2());
    }

    private C0330dc a(Pc pc) {
        Sb sb = this.f5733b.f3817a;
        return new C0330dc(sb.f4924a, pc, sb.f4925b, sb.f4926c);
    }

    public Ec<C0305cc> a(C0305cc ccVar) {
        return new Ec(this.f5737f, this.f5736e, new Ob(this.f5734c, new SystemTimeProvider()), this.f5735d, ccVar);
    }
}
