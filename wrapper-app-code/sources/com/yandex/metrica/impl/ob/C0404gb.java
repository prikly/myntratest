package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* renamed from: com.yandex.metrica.impl.ob.gb  reason: case insensitive filesystem */
public final class C0404gb {

    /* renamed from: a  reason: collision with root package name */
    private C0365em f5847a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f5848b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ICommonExecutor f5849c;

    /* renamed from: com.yandex.metrica.impl.ob.gb$a */
    public static final class a extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0404gb f5850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f5851b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C0503kb f5852c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f5853d;

        a(C0404gb gbVar, b bVar, C0503kb kbVar, long j) {
            this.f5850a = gbVar;
            this.f5851b = bVar;
            this.f5852c = kbVar;
            this.f5853d = j;
        }

        public void a() {
            if (!this.f5850a.f5848b) {
                this.f5851b.a(true);
                this.f5852c.a();
                this.f5850a.f5849c.executeDelayed(C0404gb.b(this.f5850a), this.f5853d, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.gb$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f5854a;

        public b(boolean z) {
            this.f5854a = z;
        }

        public final boolean a() {
            return this.f5854a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(boolean z, int i) {
            this((i & 1) != 0 ? false : z);
        }

        public final void a(boolean z) {
            this.f5854a = z;
        }
    }

    public C0404gb(Uh uh, b bVar, Random random, ICommonExecutor iCommonExecutor, C0503kb kbVar) {
        this.f5849c = iCommonExecutor;
        this.f5847a = new a(this, bVar, kbVar, (long) uh.b());
        if (bVar.a()) {
            C0365em emVar = this.f5847a;
            if (emVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
            }
            emVar.run();
            return;
        }
        long nextInt = (long) random.nextInt(uh.a() + 1);
        C0365em emVar2 = this.f5847a;
        if (emVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
        }
        iCommonExecutor.executeDelayed(emVar2, nextInt, TimeUnit.SECONDS);
    }

    public static final /* synthetic */ C0365em b(C0404gb gbVar) {
        C0365em emVar = gbVar.f5847a;
        if (emVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
        }
        return emVar;
    }

    public final void a() {
        this.f5848b = true;
        ICommonExecutor iCommonExecutor = this.f5849c;
        C0365em emVar = this.f5847a;
        if (emVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
        }
        iCommonExecutor.remove(emVar);
    }
}
