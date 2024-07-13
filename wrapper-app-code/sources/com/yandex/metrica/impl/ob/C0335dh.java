package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.coreutils.services.UtilityServiceLocator;
import com.yandex.metrica.impl.ob.C0260ah;
import com.yandex.metrica.impl.ob.C0378fa;

/* renamed from: com.yandex.metrica.impl.ob.dh  reason: case insensitive filesystem */
public class C0335dh {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0285bh f5673a;

    /* renamed from: b  reason: collision with root package name */
    private final ProtobufStateStorage<C0360eh> f5674b;

    /* renamed from: c  reason: collision with root package name */
    private final C0810x2 f5675c;

    /* renamed from: d  reason: collision with root package name */
    private final ICommonExecutor f5676d;

    /* renamed from: e  reason: collision with root package name */
    private final ActivationBarrier.IActivationBarrierCallback f5677e;

    /* renamed from: f  reason: collision with root package name */
    private final ActivationBarrier f5678f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C0260ah f5679g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f5680h;
    private C0311ci i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private boolean o;
    /* access modifiers changed from: private */
    public boolean p;
    private final Object q;

    /* renamed from: com.yandex.metrica.impl.ob.dh$a */
    class a implements C0260ah.a {
        a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$b */
    class b implements ActivationBarrier.IActivationBarrierCallback {
        b() {
        }

        public void onWaitFinished() {
            boolean unused = C0335dh.this.p = true;
            C0335dh.this.f5673a.a(C0335dh.this.f5679g);
        }
    }

    public C0335dh(Context context, ICommonExecutor iCommonExecutor) {
        this(new C0285bh(context, (String) null, iCommonExecutor), C0378fa.b.a(C0360eh.class).a(context), new C0810x2(), iCommonExecutor, UtilityServiceLocator.getInstance().getActivationBarrier());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f5680h) {
            this.f5680h = true;
            if (!this.p) {
                this.f5678f.subscribe(this.i.f5640c, this.f5676d, this.f5677e);
            } else {
                this.f5673a.a(this.f5679g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        C0360eh ehVar = (C0360eh) this.f5674b.read();
        this.m = ehVar.f5755c;
        this.n = ehVar.f5756d;
        this.o = ehVar.f5757e;
    }

    public void b(C0635pi piVar) {
        C0311ci ciVar;
        C0311ci ciVar2;
        boolean z = true;
        if (piVar == null || ((this.j || !piVar.f().f4956e) && (ciVar2 = this.i) != null && ciVar2.equals(piVar.K()) && this.k == piVar.B() && this.l == piVar.o() && !this.f5673a.b(piVar))) {
            z = false;
        }
        synchronized (this.q) {
            if (piVar != null) {
                this.j = piVar.f().f4956e;
                this.i = piVar.K();
                this.k = piVar.B();
                this.l = piVar.o();
            }
            this.f5673a.a(piVar);
        }
        if (z) {
            synchronized (this.q) {
                if (this.j && (ciVar = this.i) != null) {
                    if (this.n) {
                        if (this.o) {
                            if (this.f5675c.a(this.m, ciVar.f5641d, "should retry sdk collecting")) {
                                a();
                            }
                        } else if (this.f5675c.a(this.m, ciVar.f5638a, "should collect sdk as usual")) {
                            a();
                        }
                    } else if (this.k - this.l >= ciVar.f5639b) {
                        a();
                    }
                }
            }
        }
    }

    C0335dh(C0285bh bhVar, ProtobufStateStorage<C0360eh> protobufStateStorage, C0810x2 x2Var, ICommonExecutor iCommonExecutor, ActivationBarrier activationBarrier) {
        this.p = false;
        this.q = new Object();
        this.f5673a = bhVar;
        this.f5674b = protobufStateStorage;
        this.f5679g = new C0260ah(protobufStateStorage, new a());
        this.f5675c = x2Var;
        this.f5676d = iCommonExecutor;
        this.f5677e = new b();
        this.f5678f = activationBarrier;
    }

    public void a(C0635pi piVar) {
        C0360eh ehVar = (C0360eh) this.f5674b.read();
        this.m = ehVar.f5755c;
        this.n = ehVar.f5756d;
        this.o = ehVar.f5757e;
        b(piVar);
    }
}
