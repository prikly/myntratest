package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.coreutils.services.UtilityServiceLocator;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;

class Sc implements Fc {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4927a;

    /* renamed from: b  reason: collision with root package name */
    private C0635pi f4928b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C0554mc f4929c;

    /* renamed from: d  reason: collision with root package name */
    private final U7 f4930d;

    /* renamed from: e  reason: collision with root package name */
    private final T7 f4931e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeProvider f4932f;

    /* renamed from: g  reason: collision with root package name */
    private final C0381fd f4933g;

    /* renamed from: h  reason: collision with root package name */
    private final ActivationBarrier f4934h;
    private final ActivationBarrier.IActivationBarrierCallback i;
    private final ICommonExecutor j;
    /* access modifiers changed from: private */
    public boolean k;

    class a implements ActivationBarrier.IActivationBarrierCallback {
        a() {
        }

        public void onWaitFinished() {
            boolean unused = Sc.this.k = true;
            Sc.a(Sc.this);
        }
    }

    public Sc(Context context, C0635pi piVar, C0554mc mcVar, U7 u7, T7 t7, ICommonExecutor iCommonExecutor) {
        this(context, piVar, mcVar, u7, t7, iCommonExecutor, new SystemTimeProvider(), new C0381fd(), UtilityServiceLocator.getInstance().getActivationBarrier());
    }

    static void a(Sc sc) {
        C0554mc mcVar = sc.f4929c;
        if (mcVar != null) {
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(sc.f4933g.a(sc.f4927a, sc.f4928b, mcVar, sc));
        }
    }

    Sc(Context context, C0635pi piVar, C0554mc mcVar, U7 u7, T7 t7, ICommonExecutor iCommonExecutor, TimeProvider timeProvider, C0381fd fdVar, ActivationBarrier activationBarrier) {
        this.k = false;
        this.f4927a = context;
        this.f4929c = mcVar;
        this.f4928b = piVar;
        this.f4930d = u7;
        this.f4931e = t7;
        this.j = iCommonExecutor;
        this.f4932f = timeProvider;
        this.f4933g = fdVar;
        this.f4934h = activationBarrier;
        this.i = new a();
    }

    public void a() {
        if (!(a((J7) this.f4930d) || a((J7) this.f4931e))) {
            return;
        }
        if (!this.k) {
            this.f4934h.subscribe(ActivationBarrier.ACTIVATION_DELAY, this.j, this.i);
            return;
        }
        C0554mc mcVar = this.f4929c;
        if (mcVar != null) {
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(this.f4933g.a(this.f4927a, this.f4928b, mcVar, this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.yandex.metrica.impl.ob.J7 r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.mc r0 = r9.f4929c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003f
            com.yandex.metrica.impl.ob.mc r0 = r9.f4929c
            if (r0 == 0) goto L_0x001c
            int r0 = r0.f6212c
            long r3 = (long) r0
            long r5 = r10.c()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 != 0) goto L_0x0040
            com.yandex.metrica.impl.ob.mc r0 = r9.f4929c
            if (r0 == 0) goto L_0x003b
            long r3 = r0.f6214e
            com.yandex.metrica.coreutils.services.TimeProvider r0 = r9.f4932f
            long r5 = r0.currentTimeMillis()
            long r7 = r10.b()
            long r5 = r5 - r7
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x0036
            r10 = 1
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 == 0) goto L_0x003b
            r10 = 1
            goto L_0x003c
        L_0x003b:
            r10 = 0
        L_0x003c:
            if (r10 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Sc.a(com.yandex.metrica.impl.ob.J7):boolean");
    }

    public void a(C0635pi piVar) {
        this.f4928b = piVar;
    }

    public void a(C0554mc mcVar) {
        this.f4929c = mcVar;
    }
}
