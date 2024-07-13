package com.appodeal.ads.regulator;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.log.InternalLogKt;
import com.appodeal.ads.regulator.a;
import com.appodeal.ads.regulator.b;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentForm;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17135a;

    /* renamed from: b  reason: collision with root package name */
    public final com.appodeal.ads.regulator.usecases.a f17136b;

    /* renamed from: c  reason: collision with root package name */
    public final CoroutineScope f17137c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableStateFlow<b> f17138d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableSharedFlow<a> f17139e;

    /* renamed from: f  reason: collision with root package name */
    public final Lazy f17140f = LazyKt.lazy(new c(this));

    @DebugMetadata(c = "com.appodeal.ads.regulator.ConsentSdkImpl$1", f = "ConsentSdk.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function3<b, a, Continuation<? super b>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ a f17141a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f17142b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f17142b = dVar;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            b bVar = (b) obj;
            a aVar = new a(this.f17142b, (Continuation) obj3);
            aVar.f17141a = (a) obj2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object aVar;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            a aVar2 = this.f17141a;
            if (aVar2 instanceof a.f) {
                a.f fVar = (a.f) aVar2;
                d.a(this.f17142b, fVar.a(), fVar.b(), fVar.c(), fVar.d());
                return b.d.f17132a;
            } else if (aVar2 instanceof a.b) {
                InternalLogKt.logInternal$default("ConsentSdk", String.valueOf(aVar2), (Throwable) null, 4, (Object) null);
                a.b bVar = (a.b) aVar2;
                if (bVar.b()) {
                    d.e(this.f17142b);
                    return b.e.f17133a;
                }
                d.a(this.f17142b, new a.c(bVar.a()));
                return b.a.f17129a;
            } else if (aVar2 instanceof a.e) {
                ((a.e) aVar2).a().show();
                return b.C0197b.f17130a;
            } else {
                if (aVar2 instanceof a.c) {
                    InternalLogKt.logInternal$default("ConsentSdk", String.valueOf(aVar2), (Throwable) null, 4, (Object) null);
                    aVar = new b.f.C0198b(((a.c) aVar2).a());
                } else if (aVar2 instanceof a.C0196a) {
                    InternalLogKt.logInternal$default("ConsentSdk", String.valueOf(aVar2), (Throwable) null, 4, (Object) null);
                    aVar = new b.f.C0198b(((a.C0196a) aVar2).a());
                } else if (aVar2 instanceof a.d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar2);
                    sb.append('[');
                    a.d dVar = (a.d) aVar2;
                    sb.append(dVar.a());
                    sb.append(']');
                    InternalLogKt.logInternal$default("ConsentSdk", sb.toString(), (Throwable) null, 4, (Object) null);
                    aVar = new b.f.a(dVar.a());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return aVar;
            }
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.regulator.ConsentSdkImpl$2", f = "ConsentSdk.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<b, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17143a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f17144b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f17144b = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f17144b, continuation);
            bVar.f17143a = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            b bVar = (b) this.f17143a;
            InternalLogKt.logInternal$default("ConsentSdk", Intrinsics.stringPlus("Consent state updated: ", bVar.getClass().getSimpleName()), (Throwable) null, 4, (Object) null);
            this.f17144b.f17138d.setValue(bVar);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0<e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f17145a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar) {
            super(0);
            this.f17145a = dVar;
        }

        public final Object invoke() {
            return new e(this.f17145a);
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.regulator.ConsentSdkImpl", f = "ConsentSdk.kt", l = {169}, m = "getRegulatorData")
    /* renamed from: com.appodeal.ads.regulator.d$d  reason: collision with other inner class name */
    public static final class C0199d extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17146a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f17147b;

        /* renamed from: c  reason: collision with root package name */
        public int f17148c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0199d(d dVar, Continuation<? super C0199d> continuation) {
            super(continuation);
            this.f17147b = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17146a = obj;
            this.f17148c |= RecyclerView.UNDEFINED_DURATION;
            return this.f17147b.a((String) null, (Consent) null, (Consent.Status) null, (Consent.Zone) null, (Continuation<? super Consent>) this);
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.regulator.ConsentSdkImpl$getRegulatorData$resultState$1", f = "ConsentSdk.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2<b, Continuation<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17149a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.f17149a = obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((e) create((b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((b) this.f17149a) instanceof b.f);
        }
    }

    public d(Context context, com.appodeal.ads.regulator.usecases.a aVar, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "loadConsent");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        this.f17135a = context;
        this.f17136b = aVar;
        this.f17137c = coroutineScope;
        MutableStateFlow<b> MutableStateFlow = StateFlowKt.MutableStateFlow(b.c.f17131a);
        this.f17138d = MutableStateFlow;
        MutableSharedFlow<a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f17139e = MutableSharedFlow$default;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.scan(MutableSharedFlow$default, MutableStateFlow.getValue(), new a(this, (Continuation<? super a>) null)), new b(this, (Continuation<? super b>) null)), coroutineScope);
    }

    public static final void a(d dVar, String str, Consent consent, Consent.Status status, Consent.Zone zone) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(dVar.f17137c, (CoroutineContext) null, (CoroutineStart) null, new f(dVar, str, status, zone, consent, (Continuation<? super f>) null), 3, (Object) null);
    }

    public static final void e(d dVar) {
        dVar.getClass();
        new ConsentForm(dVar.f17135a, (e) dVar.f17140f.getValue()).load();
    }

    public static final void a(d dVar, a aVar) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(dVar.f17137c, (CoroutineContext) null, (CoroutineStart) null, new g(dVar, aVar, (Continuation<? super g>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r14, com.appodeal.consent.Consent r15, com.appodeal.consent.Consent.Status r16, com.appodeal.consent.Consent.Zone r17, kotlin.coroutines.Continuation<? super com.appodeal.consent.Consent> r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            boolean r2 = r1 instanceof com.appodeal.ads.regulator.d.C0199d
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.appodeal.ads.regulator.d$d r2 = (com.appodeal.ads.regulator.d.C0199d) r2
            int r3 = r2.f17148c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.f17148c = r3
            goto L_0x001b
        L_0x0016:
            com.appodeal.ads.regulator.d$d r2 = new com.appodeal.ads.regulator.d$d
            r2.<init>(r13, r1)
        L_0x001b:
            java.lang.Object r1 = r2.f17146a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f17148c
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0035
            if (r4 != r5) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0061
        L_0x002d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r1)
            com.appodeal.ads.regulator.a$f r1 = new com.appodeal.ads.regulator.a$f
            r4 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r14, r15, r8, r9)
            kotlinx.coroutines.CoroutineScope r7 = r0.f17137c
            com.appodeal.ads.regulator.g r10 = new com.appodeal.ads.regulator.g
            r10.<init>(r13, r1, r6)
            r8 = 0
            r9 = 0
            r11 = 3
            r12 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.flow.MutableStateFlow<com.appodeal.ads.regulator.b> r1 = r0.f17138d
            com.appodeal.ads.regulator.d$e r4 = new com.appodeal.ads.regulator.d$e
            r4.<init>(r6)
            r2.f17148c = r5
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r1, r4, r2)
            if (r1 != r3) goto L_0x0061
            return r3
        L_0x0061:
            com.appodeal.ads.regulator.b r1 = (com.appodeal.ads.regulator.b) r1
            boolean r2 = r1 instanceof com.appodeal.ads.regulator.b.f.C0198b
            if (r2 == 0) goto L_0x006a
            com.appodeal.ads.regulator.b$f$b r1 = (com.appodeal.ads.regulator.b.f.C0198b) r1
            goto L_0x006b
        L_0x006a:
            r1 = r6
        L_0x006b:
            if (r1 != 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            com.appodeal.consent.Consent r6 = r1.a()
        L_0x0072:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.regulator.d.a(java.lang.String, com.appodeal.consent.Consent, com.appodeal.consent.Consent$Status, com.appodeal.consent.Consent$Zone, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
