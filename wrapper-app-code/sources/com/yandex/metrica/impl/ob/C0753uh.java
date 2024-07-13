package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;

/* renamed from: com.yandex.metrica.impl.ob.uh  reason: case insensitive filesystem */
public class C0753uh {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6916a;

    /* renamed from: b  reason: collision with root package name */
    private final B0 f6917b;

    /* renamed from: c  reason: collision with root package name */
    private final ICommonExecutor f6918c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final CacheControlHttpsConnectionPerformer f6919d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C0634ph f6920e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeProvider f6921f;

    /* renamed from: g  reason: collision with root package name */
    private final IExecutionPolicy f6922g;

    /* renamed from: h  reason: collision with root package name */
    private final ActivationBarrier f6923h;
    private boolean i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0753uh(android.content.Context r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.B0 r2 = new com.yandex.metrica.impl.ob.B0
            r2.<init>()
            com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer r3 = new com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.sd r0 = r0.t()
            r0.getClass()
            r0 = 0
            r3.<init>(r0)
            com.yandex.metrica.coreutils.services.SystemTimeProvider r4 = new com.yandex.metrica.coreutils.services.SystemTimeProvider
            r4.<init>()
            com.yandex.metrica.impl.ob.od r5 = new com.yandex.metrica.impl.ob.od
            r5.<init>(r10)
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.Pm r0 = r0.q()
            com.yandex.metrica.core.api.executors.ICommonExecutor r6 = r0.g()
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.e9 r7 = r0.s()
            com.yandex.metrica.coreutils.services.UtilityServiceLocator r0 = com.yandex.metrica.coreutils.services.UtilityServiceLocator.getInstance()
            com.yandex.metrica.coreutils.services.ActivationBarrier r8 = r0.getActivationBarrier()
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0753uh.<init>(android.content.Context):void");
    }

    static void c(C0753uh uhVar) {
        synchronized (uhVar) {
            uhVar.i = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(com.yandex.metrica.impl.ob.C0635pi r11, com.yandex.metrica.impl.ob.Eh r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.yandex.metrica.impl.ob.di r5 = r11.M()     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0009
            monitor-exit(r10)
            return
        L_0x0009:
            com.yandex.metrica.impl.ob.B0 r0 = r10.f6917b     // Catch:{ all -> 0x0061 }
            android.content.Context r1 = r10.f6916a     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "certificate.p12"
            java.io.File r3 = r0.a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0061 }
            r0 = 1
            if (r3 == 0) goto L_0x001e
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r12.a((java.io.File) r3)     // Catch:{ all -> 0x0061 }
        L_0x0024:
            com.yandex.metrica.coreutils.services.TimeProvider r2 = r10.f6921f     // Catch:{ all -> 0x0061 }
            long r6 = r2.currentTimeSeconds()     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.impl.ob.ph r2 = r10.f6920e     // Catch:{ all -> 0x0061 }
            long r8 = r2.a()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0036
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
        L_0x0036:
            boolean r1 = r10.i     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x005f
            java.lang.String r2 = r11.e()     // Catch:{ all -> 0x0061 }
            boolean r11 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0061 }
            if (r11 != 0) goto L_0x005f
            com.yandex.metrica.networktasks.api.IExecutionPolicy r11 = r10.f6922g     // Catch:{ all -> 0x0061 }
            boolean r11 = r11.canBeExecuted()     // Catch:{ all -> 0x0061 }
            if (r11 == 0) goto L_0x005f
            r10.i = r0     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.coreutils.services.ActivationBarrier r11 = r10.f6923h     // Catch:{ all -> 0x0061 }
            long r6 = com.yandex.metrica.coreutils.services.ActivationBarrier.ACTIVATION_DELAY     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.core.api.executors.ICommonExecutor r8 = r10.f6918c     // Catch:{ all -> 0x0061 }
            com.yandex.metrica.impl.ob.sh r9 = new com.yandex.metrica.impl.ob.sh     // Catch:{ all -> 0x0061 }
            r0 = r9
            r1 = r10
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0061 }
            r11.subscribe(r6, r8, r9)     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r10)
            return
        L_0x0061:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0753uh.a(com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.Eh):void");
    }

    C0753uh(Context context, B0 b0, CacheControlHttpsConnectionPerformer cacheControlHttpsConnectionPerformer, TimeProvider timeProvider, IExecutionPolicy iExecutionPolicy, ICommonExecutor iCommonExecutor, C0634ph phVar, ActivationBarrier activationBarrier) {
        this.i = false;
        this.f6916a = context;
        this.f6917b = b0;
        this.f6919d = cacheControlHttpsConnectionPerformer;
        this.f6921f = timeProvider;
        this.f6922g = iExecutionPolicy;
        this.f6918c = iCommonExecutor;
        this.f6920e = phVar;
        this.f6923h = activationBarrier;
    }

    static void a(C0753uh uhVar, long j) {
        uhVar.f6920e.a(uhVar.f6921f.currentTimeSeconds() + j);
    }
}
