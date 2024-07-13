package com.appodeal.ads;

import android.app.Activity;
import com.appodeal.ads.context.b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

public final class e5 implements c5 {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineScope f16389a;

    /* renamed from: b  reason: collision with root package name */
    public final ContextProvider f16390b;

    @DebugMetadata(c = "com.appodeal.ads.SessionTimeTrackerImpl$init$1", f = "SessionTimeTracker.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<Activity, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f16391a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f16391a = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((Activity) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (((Activity) this.f16391a) != null) {
                q4.m().l();
            } else {
                q4.m().k();
            }
            return Unit.INSTANCE;
        }
    }

    public e5(CoroutineScope coroutineScope, b bVar) {
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        Intrinsics.checkNotNullParameter(bVar, "contextProvider");
        this.f16389a = coroutineScope;
        this.f16390b = bVar;
    }

    public final void a() {
        FlowKt.launchIn(FlowKt.onEach(this.f16390b.getTopActivityFlow(), new a((Continuation<? super a>) null)), this.f16389a);
    }
}
