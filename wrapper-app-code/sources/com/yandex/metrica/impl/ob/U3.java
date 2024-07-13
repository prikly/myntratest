package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.C0704sg;
import com.yandex.metrica.impl.ob.D3;
import java.io.File;

public class U3 extends L3 implements C0434hg, C0458ig {
    private final C0704sg A;
    private final C0728tg B;
    private final C0690s2 C;
    private final C0350e7<File> D;
    private final C0346e3 E;

    class a implements C0564mm<File> {
        a() {
        }

        public void b(Object obj) {
            U3.a(U3.this, (File) obj);
        }
    }

    public class b implements C0704sg.a {
        public b() {
        }

        public void a(C0334dg dgVar) {
            if (dgVar != null) {
                U3.this.a(new C0293c0().a(dgVar.a()).a(C0244a1.EVENT_TYPE_SEND_REFERRER.b()));
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public U3(android.content.Context r21, com.yandex.metrica.impl.ob.C0635pi r22, com.yandex.metrica.impl.ob.I3 r23, com.yandex.metrica.impl.ob.D3.a r24, com.yandex.metrica.impl.ob.C0704sg r25, com.yandex.metrica.impl.ob.C0690s2 r26, com.yandex.metrica.impl.ob.C0778vi r27) {
        /*
            r20 = this;
            com.yandex.metrica.impl.ob.B3 r5 = new com.yandex.metrica.impl.ob.B3
            r5.<init>()
            com.yandex.metrica.impl.ob.x2 r6 = new com.yandex.metrica.impl.ob.x2
            r6.<init>()
            com.yandex.metrica.impl.ob.B0 r7 = new com.yandex.metrica.impl.ob.B0
            r7.<init>()
            com.yandex.metrica.impl.ob.V3 r19 = new com.yandex.metrica.impl.ob.V3
            com.yandex.metrica.impl.ob.T3 r14 = new com.yandex.metrica.impl.ob.T3
            r4 = r26
            r14.<init>(r4)
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.Pm r0 = r0.q()
            com.yandex.metrica.core.api.executors.ICommonExecutor r15 = r0.d()
            java.lang.String r0 = r23.b()
            r1 = r21
            int r16 = com.yandex.metrica.impl.ob.A2.b(r1, r0)
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.Pm r17 = r0.q()
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.f1 r18 = r0.h()
            r8 = r19
            r9 = r21
            r10 = r23
            r11 = r24
            r12 = r27
            r13 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r20
            r2 = r23
            r3 = r22
            r4 = r24
            r9 = r25
            r10 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.U3.<init>(android.content.Context, com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.I3, com.yandex.metrica.impl.ob.D3$a, com.yandex.metrica.impl.ob.sg, com.yandex.metrica.impl.ob.s2, com.yandex.metrica.impl.ob.vi):void");
    }

    private void a(Context context, B0 b0) {
        File a2 = b0.a(context, "YandexMetricaNativeCrashes");
        if (a2 != null) {
            new Y6(a2, new a()).a();
        }
    }

    public void G() {
        this.A.a(this.B);
    }

    public CounterConfiguration.b s() {
        return CounterConfiguration.b.MAIN;
    }

    public void a() {
        x().c(true);
    }

    public synchronized void a(D3.a aVar) {
        super.a(aVar);
        this.C.a(aVar.l);
    }

    public void a(C0635pi piVar) {
        super.a(piVar);
        this.E.a(piVar);
    }

    static void a(U3 u3, File file) {
        u3.D.a(file);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    U3(Context context, I3 i3, C0635pi piVar, D3.a aVar, B3 b3, C0810x2 x2Var, B0 b0, V3 v3, C0704sg sgVar, C0690s2 s2Var) {
        super(context, i3, b3, x2Var, v3);
        V3 v32 = v3;
        this.A = sgVar;
        I4 k = k();
        k.a(C0244a1.EVENT_TYPE_REGULAR, new C5(k.b()));
        this.B = v32.c(this);
        this.C = s2Var;
        C0574n7 a2 = v32.a(v3.f(), v32.b(this), f());
        this.D = a2;
        a2.a();
        Context context2 = context;
        B0 b02 = b0;
        a(context, b0);
        C0346e3 a3 = v32.a(this);
        this.E = a3;
        C0635pi piVar2 = piVar;
        a3.a(piVar, aVar.q);
    }
}
