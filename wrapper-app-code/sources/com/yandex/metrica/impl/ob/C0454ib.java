package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0783w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.ib  reason: case insensitive filesystem */
public final class C0454ib {

    /* renamed from: a  reason: collision with root package name */
    private Uh f5976a;

    /* renamed from: b  reason: collision with root package name */
    private C0404gb f5977b;

    /* renamed from: c  reason: collision with root package name */
    private final C0783w f5978c;

    /* renamed from: d  reason: collision with root package name */
    private final C0429hb f5979d;

    /* renamed from: com.yandex.metrica.impl.ob.ib$a */
    static final class a implements C0783w.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0454ib f5980a;

        a(C0454ib ibVar) {
            this.f5980a = ibVar;
        }

        public final void a(C0783w.a aVar) {
            this.f5980a.b();
        }
    }

    public C0454ib(C0783w wVar, C0429hb hbVar) {
        this.f5978c = wVar;
        this.f5979d = hbVar;
    }

    public synchronized void b(C0635pi piVar) {
        if (!Intrinsics.areEqual((Object) piVar.m(), (Object) this.f5976a)) {
            this.f5976a = piVar.m();
            C0404gb gbVar = this.f5977b;
            if (gbVar != null) {
                gbVar.a();
            }
            this.f5977b = null;
            if (a()) {
                if (this.f5977b == null) {
                    Uh uh = this.f5976a;
                    if (uh != null) {
                        this.f5977b = this.f5979d.a(uh);
                    }
                }
            }
        }
    }

    public final synchronized void a(C0635pi piVar) {
        this.f5976a = piVar.m();
        this.f5978c.a((C0783w.b) new a(this));
        b();
    }

    private final boolean a() {
        boolean z;
        Uh uh = this.f5976a;
        if (uh == null) {
            return false;
        }
        C0783w.a c2 = this.f5978c.c();
        Intrinsics.checkNotNullExpressionValue(c2, "applicationStateProvider.currentState");
        if (!(uh.c().length() > 0)) {
            return false;
        }
        int ordinal = c2.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            z = uh.d();
        } else if (ordinal == 2) {
            z = true;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.gb r0 = r2.f5977b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0007
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            boolean r1 = r2.a()     // Catch:{ all -> 0x0031 }
            if (r1 != r0) goto L_0x0010
            monitor-exit(r2)
            return
        L_0x0010:
            if (r0 == 0) goto L_0x001e
            com.yandex.metrica.impl.ob.gb r0 = r2.f5977b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0019
            r0.a()     // Catch:{ all -> 0x0031 }
        L_0x0019:
            r0 = 0
            r2.f5977b = r0     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)
            return
        L_0x001e:
            com.yandex.metrica.impl.ob.gb r0 = r2.f5977b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0023
            goto L_0x002f
        L_0x0023:
            com.yandex.metrica.impl.ob.Uh r0 = r2.f5976a     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            com.yandex.metrica.impl.ob.hb r1 = r2.f5979d     // Catch:{ all -> 0x0031 }
            com.yandex.metrica.impl.ob.gb r0 = r1.a(r0)     // Catch:{ all -> 0x0031 }
            r2.f5977b = r0     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r2)
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0454ib.b():void");
    }
}
