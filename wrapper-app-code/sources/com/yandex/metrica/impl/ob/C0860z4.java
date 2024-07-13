package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.D4;
import com.yandex.metrica.networktasks.api.ConfigProvider;

/* renamed from: com.yandex.metrica.impl.ob.z4  reason: case insensitive filesystem */
public class C0860z4 implements P3, Q3, ConfigProvider<D4> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7209a;

    /* renamed from: b  reason: collision with root package name */
    private final I3 f7210b;

    /* renamed from: c  reason: collision with root package name */
    private final C0617p0 f7211c;

    /* renamed from: d  reason: collision with root package name */
    private A4 f7212d;

    /* renamed from: e  reason: collision with root package name */
    private C0372f4 f7213e;

    /* renamed from: com.yandex.metrica.impl.ob.z4$a */
    static class a {
        a() {
        }

        public A4 a(Context context, I3 i3, C0635pi piVar, D4.a aVar) {
            return new A4(new D4.b(context, i3.b()), piVar, aVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z4$b */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final C0369f1 f7214a;

        b() {
            this(F0.g().h());
        }

        public C0617p0<C0860z4> a(C0860z4 z4Var, C0778vi viVar, E4 e4, C0276b8 b8Var) {
            C0617p0<C0860z4> p0Var = new C0617p0<>(z4Var, viVar.a(), e4, b8Var);
            this.f7214a.a(p0Var);
            return p0Var;
        }

        b(C0369f1 f1Var) {
            this.f7214a = f1Var;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0860z4(android.content.Context r13, com.yandex.metrica.impl.ob.I3 r14, com.yandex.metrica.impl.ob.D3.a r15, com.yandex.metrica.impl.ob.C0635pi r16, com.yandex.metrica.impl.ob.C0778vi r17, com.yandex.metrica.CounterConfiguration.b r18) {
        /*
            r12 = this;
            r2 = r14
            com.yandex.metrica.impl.ob.E4 r7 = new com.yandex.metrica.impl.ob.E4
            r7.<init>()
            com.yandex.metrica.impl.ob.z4$b r8 = new com.yandex.metrica.impl.ob.z4$b
            r8.<init>()
            com.yandex.metrica.impl.ob.z4$a r9 = new com.yandex.metrica.impl.ob.z4$a
            r9.<init>()
            com.yandex.metrica.impl.ob.f4 r10 = new com.yandex.metrica.impl.ob.f4
            r1 = r13
            r10.<init>(r13, r14)
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.e8 r0 = r0.w()
            com.yandex.metrica.impl.ob.b8 r11 = r0.a(r14)
            r0 = r12
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0860z4.<init>(android.content.Context, com.yandex.metrica.impl.ob.I3, com.yandex.metrica.impl.ob.D3$a, com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.vi, com.yandex.metrica.CounterConfiguration$b):void");
    }

    public void a(D3.a aVar) {
        this.f7212d.a(aVar);
    }

    public void a(C0411gi giVar, C0635pi piVar) {
    }

    public Context b() {
        return this.f7209a;
    }

    public Object getConfig() {
        return (D4) this.f7212d.b();
    }

    public void a(C0293c0 c0Var) {
        this.f7211c.a(c0Var);
    }

    public void a() {
        if (this.f7213e.a(((D4) this.f7212d.b()).D())) {
            this.f7211c.a(C0856z0.a());
            this.f7213e.a();
        }
    }

    public synchronized void a(C0635pi piVar) {
        this.f7212d.a(piVar);
        this.f7213e.a(piVar.P());
    }

    public C0860z4(Context context, I3 i3, D3.a aVar, C0635pi piVar, C0778vi viVar, CounterConfiguration.b bVar, E4 e4, b bVar2, a aVar2, C0372f4 f4Var, C0276b8 b8Var) {
        this.f7209a = context;
        this.f7210b = i3;
        this.f7213e = f4Var;
        this.f7211c = bVar2.a(this, viVar, e4, b8Var);
        synchronized (this) {
            this.f7213e.a(piVar.P());
            this.f7212d = aVar2.a(context, i3, piVar, new D4.a(aVar));
        }
    }
}
