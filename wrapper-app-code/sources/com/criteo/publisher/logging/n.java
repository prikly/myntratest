package com.criteo.publisher.logging;

import com.criteo.publisher.f0.k;
import com.criteo.publisher.k0.g;
import com.criteo.publisher.n0.b;
import com.criteo.publisher.x;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteLogSendingQueueConsumer.kt */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final k<RemoteLogRecords> f2667a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2668b;

    /* renamed from: c  reason: collision with root package name */
    private final com.criteo.publisher.n0.g f2669c;

    /* renamed from: d  reason: collision with root package name */
    private final b f2670d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f2671e;

    public n(k<RemoteLogRecords> kVar, g gVar, com.criteo.publisher.n0.g gVar2, b bVar, Executor executor) {
        Intrinsics.checkParameterIsNotNull(kVar, "sendingQueue");
        Intrinsics.checkParameterIsNotNull(gVar, "api");
        Intrinsics.checkParameterIsNotNull(gVar2, "buildConfigWrapper");
        Intrinsics.checkParameterIsNotNull(bVar, "advertisingInfo");
        Intrinsics.checkParameterIsNotNull(executor, "executor");
        this.f2667a = kVar;
        this.f2668b = gVar;
        this.f2669c = gVar2;
        this.f2670d = bVar;
        this.f2671e = executor;
    }

    public void a() {
        this.f2671e.execute(new a(this.f2667a, this.f2668b, this.f2669c, this.f2670d));
    }

    /* compiled from: RemoteLogSendingQueueConsumer.kt */
    public static final class a extends x {

        /* renamed from: c  reason: collision with root package name */
        private final k<RemoteLogRecords> f2672c;

        /* renamed from: d  reason: collision with root package name */
        private final g f2673d;

        /* renamed from: e  reason: collision with root package name */
        private final com.criteo.publisher.n0.g f2674e;

        /* renamed from: f  reason: collision with root package name */
        private final b f2675f;

        public a(k<RemoteLogRecords> kVar, g gVar, com.criteo.publisher.n0.g gVar2, b bVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "sendingQueue");
            Intrinsics.checkParameterIsNotNull(gVar, "api");
            Intrinsics.checkParameterIsNotNull(gVar2, "buildConfigWrapper");
            Intrinsics.checkParameterIsNotNull(bVar, "advertisingInfo");
            this.f2672c = kVar;
            this.f2673d = gVar;
            this.f2674e = gVar2;
            this.f2675f = bVar;
        }

        public void a() {
            List<RemoteLogRecords> a2 = this.f2672c.a(this.f2674e.o());
            if (!a2.isEmpty()) {
                try {
                    a(a2);
                    this.f2673d.a(a2);
                } catch (Throwable th) {
                    for (RemoteLogRecords a3 : a2) {
                        this.f2672c.a(a3);
                    }
                    throw th;
                }
            }
        }

        private final void a(List<? extends RemoteLogRecords> list) {
            String b2 = this.f2675f.b();
            if (b2 != null) {
                for (RemoteLogRecords remoteLogRecords : list) {
                    if (remoteLogRecords.a().b() == null) {
                        remoteLogRecords.a().a(b2);
                    }
                }
            }
        }
    }
}
