package com.criteo.publisher.logging;

import android.os.Looper;
import com.appodeal.ads.modules.common.internal.Constants;
import com.criteo.publisher.f0.k;
import com.criteo.publisher.logging.RemoteLogRecords;
import com.criteo.publisher.model.t;
import com.criteo.publisher.x;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteHandler.kt */
public class j implements d {

    /* renamed from: a  reason: collision with root package name */
    private final k f2649a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k<RemoteLogRecords> f2650b;

    /* renamed from: c  reason: collision with root package name */
    private final t f2651c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f2652d;

    /* renamed from: e  reason: collision with root package name */
    private final com.criteo.publisher.l0.a f2653e;

    public j(k kVar, k<RemoteLogRecords> kVar2, t tVar, Executor executor, com.criteo.publisher.l0.a aVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "remoteLogRecordsFactory");
        Intrinsics.checkParameterIsNotNull(kVar2, "sendingQueue");
        Intrinsics.checkParameterIsNotNull(tVar, Constants.CONFIG);
        Intrinsics.checkParameterIsNotNull(executor, "executor");
        Intrinsics.checkParameterIsNotNull(aVar, "consentData");
        this.f2649a = kVar;
        this.f2650b = kVar2;
        this.f2651c = tVar;
        this.f2652d = executor;
        this.f2653e = aVar;
    }

    public void a(String str, e eVar) {
        RemoteLogRecords.RemoteLogLevel a2;
        RemoteLogRecords a3;
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(eVar, "logMessage");
        if (this.f2653e.b() && (a2 = RemoteLogRecords.RemoteLogLevel.Companion.a(eVar.a())) != null) {
            RemoteLogRecords.RemoteLogLevel f2 = this.f2651c.f();
            Intrinsics.checkExpressionValueIsNotNull(f2, "config.remoteLogLevel");
            if (!(a2.compareTo(f2) >= 0)) {
                a2 = null;
            }
            if (a2 != null && (a3 = this.f2649a.a(eVar)) != null) {
                if (a()) {
                    this.f2652d.execute(new a(a3, this));
                } else {
                    this.f2650b.a(a3);
                }
            }
        }
    }

    /* compiled from: RemoteHandler.kt */
    public static final class a extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RemoteLogRecords f2654c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f2655d;

        a(RemoteLogRecords remoteLogRecords, j jVar) {
            this.f2654c = remoteLogRecords;
            this.f2655d = jVar;
        }

        public void a() {
            this.f2655d.f2650b.a(this.f2654c);
        }
    }

    public boolean a() {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        return Intrinsics.areEqual((Object) currentThread, (Object) mainLooper != null ? mainLooper.getThread() : null);
    }
}
