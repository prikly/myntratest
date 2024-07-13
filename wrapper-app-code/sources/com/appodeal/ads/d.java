package com.appodeal.ads;

import android.app.Activity;
import android.os.Handler;
import com.appodeal.ads.context.b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.utils.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineScope f16349a;

    /* renamed from: b  reason: collision with root package name */
    public final ContextProvider f16350b;

    /* renamed from: c  reason: collision with root package name */
    public long f16351c;

    /* renamed from: d  reason: collision with root package name */
    public long f16352d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f16353e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public Job f16354f;

    @DebugMetadata(c = "com.appodeal.ads.AdLifecycleTrackerImpl$init$1", f = "AdLifecycleTracker.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<Activity, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f16355a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f16356b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16356b = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f16356b, continuation);
            aVar.f16355a = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((Activity) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (((Activity) this.f16355a) != null) {
                d.f(this.f16356b);
            } else {
                d.e(this.f16356b);
            }
            return Unit.INSTANCE;
        }
    }

    public d(CoroutineScope coroutineScope, b bVar) {
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        Intrinsics.checkNotNullParameter(bVar, "contextProvider");
        this.f16349a = coroutineScope;
        this.f16350b = bVar;
    }

    public static List b() {
        List<u> listOf = CollectionsKt.listOf(t0.a(), h2.a(), o1.a(), w2.a(), o4.a());
        ArrayList arrayList = new ArrayList();
        for (u f2 : listOf) {
            r f3 = f2.f();
            l lVar = null;
            if (f3 != null) {
                if (!(!f3.r())) {
                    f3 = null;
                }
                if (f3 != null) {
                    lVar = f3.h();
                }
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        HashSet a2 = Native.c().a();
        Intrinsics.checkNotNullExpressionValue(a2, "getNativeAdBox().adObjects");
        return CollectionsKt.plus(arrayList, a2);
    }

    public static final void e(d dVar) {
        Job job = dVar.f16354f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        dVar.f16354f = BuildersKt__Builders_commonKt.launch$default(dVar.f16349a, Dispatchers.getDefault(), (CoroutineStart) null, new e(dVar, (Continuation<? super e>) null), 2, (Object) null);
    }

    public static final void f(d dVar) {
        dVar.getClass();
        dVar.f16352d = System.currentTimeMillis();
        if (dVar.f16353e.getAndSet(false)) {
            for (l a2 : b()) {
                o.a(a2);
            }
            q4.f17047a.getClass();
            for (u j : q4.d()) {
                j.j();
            }
            Job unused = BuildersKt__Builders_commonKt.launch$default(dVar.f16349a, (CoroutineContext) null, (CoroutineStart) null, new f(dVar, (Continuation<? super f>) null), 3, (Object) null);
        }
    }

    public static final void g(d dVar) {
        dVar.getClass();
        for (l lVar : b()) {
            if (lVar != null) {
                Runnable runnable = (Runnable) o.f17550b.get(lVar);
                if (runnable != null) {
                    o.f17549a.removeCallbacks(runnable);
                }
            } else {
                Handler handler = o.f17549a;
            }
        }
    }

    public final void a() {
        FlowKt.launchIn(FlowKt.onEach(this.f16350b.getTopActivityFlow(), new a(this, (Continuation<? super a>) null)), this.f16349a);
    }
}
