package com.appodeal.ads.context;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.context.a;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.modules.common.internal.log.InternalLogKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

public final class f implements ContextProvider, ContextProvider.Synchronizer {

    /* renamed from: a  reason: collision with root package name */
    public Context f16333a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f16334b = LazyKt.lazy(new a(this));

    /* renamed from: c  reason: collision with root package name */
    public final MutableStateFlow<a> f16335c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f16336d;

    /* renamed from: e  reason: collision with root package name */
    public final b f16337e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableStateFlow<Activity> f16338f;

    public static final class a extends Lambda implements Function0<h> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f16339a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(0);
            this.f16339a = fVar;
        }

        public final Object invoke() {
            return new h(new d(this.f16339a), new e(this.f16339a));
        }
    }

    public static final class b implements Flow<Activity> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Flow f16340a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FlowCollector f16341a;

            @DebugMetadata(c = "com.appodeal.ads.context.ContextProviderImpl$special$$inlined$map$1$2", f = "ContextProviderImpl.kt", l = {224}, m = "emit")
            /* renamed from: com.appodeal.ads.context.f$b$a$a  reason: collision with other inner class name */
            public static final class C0181a extends ContinuationImpl {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f16342a;

                /* renamed from: b  reason: collision with root package name */
                public int f16343b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ a f16344c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0181a(a aVar, Continuation continuation) {
                    super(continuation);
                    this.f16344c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f16342a = obj;
                    this.f16343b |= RecyclerView.UNDEFINED_DURATION;
                    return this.f16344c.emit((Object) null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f16341a = flowCollector;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.appodeal.ads.context.f.b.a.C0181a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.appodeal.ads.context.f$b$a$a r0 = (com.appodeal.ads.context.f.b.a.C0181a) r0
                    int r1 = r0.f16343b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f16343b = r1
                    goto L_0x0018
                L_0x0013:
                    com.appodeal.ads.context.f$b$a$a r0 = new com.appodeal.ads.context.f$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f16342a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f16343b
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.ResultKt.throwOnFailure(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f16341a
                    com.appodeal.ads.context.a r5 = (com.appodeal.ads.context.a) r5
                    android.app.Activity r5 = r5.getActivity()
                    r0.f16343b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.context.f.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(MutableStateFlow mutableStateFlow) {
            this.f16340a = mutableStateFlow;
        }

        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object collect = this.f16340a.collect(new a(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public f() {
        MutableStateFlow<a> MutableStateFlow = StateFlowKt.MutableStateFlow(a());
        this.f16335c = MutableStateFlow;
        this.f16337e = new b(MutableStateFlow);
        this.f16338f = StateFlowKt.MutableStateFlow(this.f16336d);
    }

    public static final void a(f fVar, Activity activity) {
        MutableStateFlow<a> mutableStateFlow;
        Object aVar;
        InternalLogKt.logInternal$default("ContextProvider", Reflection.getOrCreateKotlinClass(fVar.f16335c.getValue().getClass()).getSimpleName() + ". Activity is destroyed: " + activity, (Throwable) null, 4, (Object) null);
        if (Intrinsics.areEqual((Object) fVar.f16336d, (Object) activity)) {
            fVar.f16336d = null;
        }
        Activity activity2 = fVar.f16336d;
        boolean z = true;
        if (activity2 == null || !activity2.isDestroyed()) {
            z = false;
        }
        if (z) {
            fVar.f16336d = null;
        }
        if (Intrinsics.areEqual((Object) fVar.f16335c.getValue().getActivity(), (Object) activity)) {
            a value = fVar.f16335c.getValue();
            if (value instanceof a.b) {
                mutableStateFlow = fVar.f16335c;
                aVar = new a.b((Activity) null);
            } else if (value instanceof a.C0180a) {
                mutableStateFlow = fVar.f16335c;
                aVar = new a.C0180a((Activity) null);
            } else {
                return;
            }
            mutableStateFlow.setValue(aVar);
        }
    }

    public static final void b(f fVar, Activity activity) {
        InternalLogKt.logInternal$default("ContextProvider", Reflection.getOrCreateKotlinClass(fVar.f16335c.getValue().getClass()).getSimpleName() + " Resumed Activity updated: " + activity, (Throwable) null, 4, (Object) null);
        fVar.f16336d = activity;
        fVar.f16338f.tryEmit(activity);
        a value = fVar.f16335c.getValue();
        if (value instanceof a.b) {
            fVar.f16335c.setValue(new a.b(activity));
        } else {
            boolean z = value instanceof a.C0180a;
        }
    }

    public final a.C0180a a() {
        return new a.C0180a(this.f16336d);
    }

    public final Activity getActivity() {
        return this.f16335c.getValue().getActivity();
    }

    public final Flow<Activity> getActivityFlow() {
        return this.f16337e;
    }

    public final Context getApplicationContext() {
        Context context = this.f16333a;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Context not provided".toString());
    }

    public final Context getApplicationContextOrNull() {
        return this.f16333a;
    }

    public final StateFlow getTopActivityFlow() {
        return this.f16338f;
    }

    public final void setActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        a value = this.f16335c.getValue();
        if (!(value instanceof a.b) && (value instanceof a.C0180a) && !Intrinsics.areEqual((Object) value.getActivity(), (Object) activity)) {
            this.f16335c.setValue(new a.C0180a(activity));
        }
    }

    public final void setApplicationContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        if (this.f16333a == null) {
            this.f16333a = context;
            Context applicationContext = getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                application.registerActivityLifecycleCallbacks((h) this.f16334b.getValue());
            }
        }
    }

    public final void setAutomaticActivityObserving(boolean z) {
        MutableStateFlow<a> mutableStateFlow;
        Object obj;
        a value = this.f16335c.getValue();
        if (z) {
            if (!(value instanceof a.b)) {
                mutableStateFlow = this.f16335c;
                obj = new a.b(this.f16336d);
            } else {
                return;
            }
        } else if (!(value instanceof a.C0180a)) {
            mutableStateFlow = this.f16335c;
            obj = new a.C0180a(this.f16336d);
        } else {
            return;
        }
        mutableStateFlow.setValue(obj);
    }
}
