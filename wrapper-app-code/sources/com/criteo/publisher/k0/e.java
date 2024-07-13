package com.criteo.publisher.k0;

import com.appodeal.ads.modules.common.internal.Constants;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.i;
import com.criteo.publisher.model.n;
import com.criteo.publisher.model.p;
import com.criteo.publisher.model.t;
import com.criteo.publisher.w;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveBidRequestSender.kt */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final g f2581a;

    /* renamed from: b  reason: collision with root package name */
    private final p f2582b;

    /* renamed from: c  reason: collision with root package name */
    private final i f2583c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f2584d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f2585e;

    /* renamed from: f  reason: collision with root package name */
    private final t f2586f;

    public e(g gVar, p pVar, i iVar, Executor executor, ScheduledExecutorService scheduledExecutorService, t tVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "pubSdkApi");
        Intrinsics.checkParameterIsNotNull(pVar, "cdbRequestFactory");
        Intrinsics.checkParameterIsNotNull(iVar, "clock");
        Intrinsics.checkParameterIsNotNull(executor, "executor");
        Intrinsics.checkParameterIsNotNull(scheduledExecutorService, "scheduledExecutorService");
        Intrinsics.checkParameterIsNotNull(tVar, Constants.CONFIG);
        this.f2581a = gVar;
        this.f2582b = pVar;
        this.f2583c = iVar;
        this.f2584d = executor;
        this.f2585e = scheduledExecutorService;
        this.f2586f = tVar;
    }

    public void a(n nVar, ContextData contextData, w wVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "cacheAdUnit");
        Intrinsics.checkParameterIsNotNull(contextData, "contextData");
        Intrinsics.checkParameterIsNotNull(wVar, "liveCdbCallListener");
        a(wVar);
        this.f2584d.execute(new c(this.f2581a, this.f2582b, this.f2583c, CollectionsKt.listOf(nVar), contextData, wVar));
    }

    /* compiled from: LiveBidRequestSender.kt */
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f2587a;

        a(w wVar) {
            this.f2587a = wVar;
        }

        public final void run() {
            this.f2587a.a();
        }
    }

    public void a(w wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "liveCdbCallListener");
        this.f2585e.schedule(new a(wVar), (long) this.f2586f.e(), TimeUnit.MILLISECONDS);
    }
}
