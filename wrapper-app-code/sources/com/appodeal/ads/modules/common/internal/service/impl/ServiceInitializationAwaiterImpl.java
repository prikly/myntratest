package com.appodeal.ads.modules.common.internal.service.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u0007\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/impl/ServiceInitializationAwaiterImpl;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceInitializationAwaiter;", "", "releaseAwaiter", "", "timeout", "launchAwaitingAsync", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "AwaitingState", "OutcomeState", "apd_internal"}, k = 1, mv = {1, 6, 0})
public final class ServiceInitializationAwaiterImpl implements ServiceInitializationAwaiter {

    /* renamed from: a  reason: collision with root package name */
    public Deferred<? extends OutcomeState> f16700a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableStateFlow<AwaitingState> f16701b = StateFlowKt.MutableStateFlow(AwaitingState.NotLaunched);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/impl/ServiceInitializationAwaiterImpl$AwaitingState;", "", "NotLaunched", "InProgress", "Completed", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public enum AwaitingState {
        NotLaunched,
        InProgress,
        Completed
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/impl/ServiceInitializationAwaiterImpl$OutcomeState;", "", "Completed", "TimedOut", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public enum OutcomeState {
        Completed,
        TimedOut
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OutcomeState.values().length];
            iArr[OutcomeState.Completed.ordinal()] = 1;
            iArr[OutcomeState.TimedOut.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl", f = "ServiceInitializationAwaiterImpl.kt", l = {37}, m = "await")
    public static final class a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public ServiceInitializationAwaiterImpl f16704a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f16705b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ServiceInitializationAwaiterImpl f16706c;

        /* renamed from: d  reason: collision with root package name */
        public int f16707d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, Continuation<? super a> continuation) {
            super(continuation);
            this.f16706c = serviceInitializationAwaiterImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f16705b = obj;
            this.f16707d |= RecyclerView.UNDEFINED_DURATION;
            return this.f16706c.await(this);
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$launchAwaitingAsync$1", f = "ServiceInitializationAwaiterImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f16708a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ServiceInitializationAwaiterImpl f16709b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f16710c;

        @DebugMetadata(c = "com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$launchAwaitingAsync$1$1", f = "ServiceInitializationAwaiterImpl.kt", l = {25}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OutcomeState>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f16711a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ServiceInitializationAwaiterImpl f16712b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ long f16713c;

            @DebugMetadata(c = "com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$launchAwaitingAsync$1$1$1", f = "ServiceInitializationAwaiterImpl.kt", l = {26}, m = "invokeSuspend")
            /* renamed from: com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$b$a$a  reason: collision with other inner class name */
            public static final class C0183a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OutcomeState>, Object> {

                /* renamed from: a  reason: collision with root package name */
                public int f16714a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ ServiceInitializationAwaiterImpl f16715b;

                @DebugMetadata(c = "com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$launchAwaitingAsync$1$1$1$1", f = "ServiceInitializationAwaiterImpl.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$b$a$a$a  reason: collision with other inner class name */
                public static final class C0184a extends SuspendLambda implements Function2<AwaitingState, Continuation<? super Boolean>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    public /* synthetic */ Object f16716a;

                    public C0184a(Continuation<? super C0184a> continuation) {
                        super(2, continuation);
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C0184a aVar = new C0184a(continuation);
                        aVar.f16716a = obj;
                        return aVar;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        return ((C0184a) create((AwaitingState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(((AwaitingState) this.f16716a) == AwaitingState.Completed);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0183a(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, Continuation<? super C0183a> continuation) {
                    super(2, continuation);
                    this.f16715b = serviceInitializationAwaiterImpl;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0183a(this.f16715b, continuation);
                }

                public final Object invoke(Object obj, Object obj2) {
                    return ((C0183a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f16714a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        MutableStateFlow access$getAwaiterFlow$p = this.f16715b.f16701b;
                        C0184a aVar = new C0184a((Continuation<? super C0184a>) null);
                        this.f16714a = 1;
                        if (FlowKt.first(access$getAwaiterFlow$p, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return OutcomeState.Completed;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, long j, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f16712b = serviceInitializationAwaiterImpl;
                this.f16713c = j;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f16712b, this.f16713c, continuation);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f16711a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f16712b.f16701b.setValue(AwaitingState.InProgress);
                    long j = this.f16713c;
                    C0183a aVar = new C0183a(this.f16712b, (Continuation<? super C0183a>) null);
                    this.f16711a = 1;
                    obj = TimeoutKt.withTimeoutOrNull(j, aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                OutcomeState outcomeState = (OutcomeState) obj;
                return outcomeState == null ? OutcomeState.TimedOut : outcomeState;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, long j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f16709b = serviceInitializationAwaiterImpl;
            this.f16710c = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f16709b, this.f16710c, continuation);
            bVar.f16708a = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f16709b.f16700a = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f16708a, Dispatchers.getDefault(), (CoroutineStart) null, new a(this.f16709b, this.f16710c, (Continuation<? super a>) null), 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object await(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$a r0 = (com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.a) r0
            int r1 = r0.f16707d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16707d = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$a r0 = new com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f16705b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16707d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl r0 = r0.f16704a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0056
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.MutableStateFlow<com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$AwaitingState> r6 = r5.f16701b
            java.lang.Object r6 = r6.getValue()
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$AwaitingState r2 = com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.AwaitingState.NotLaunched
            if (r6 != r2) goto L_0x0044
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x0044:
            kotlinx.coroutines.Deferred<? extends com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$OutcomeState> r6 = r5.f16700a
            if (r6 != 0) goto L_0x004a
            r0 = r5
            goto L_0x0079
        L_0x004a:
            r0.f16704a = r5
            r0.f16707d = r4
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0 = r5
        L_0x0056:
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$OutcomeState r6 = (com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.OutcomeState) r6
            if (r6 != 0) goto L_0x005b
            goto L_0x0079
        L_0x005b:
            int[] r1 = com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r1[r6]
            if (r6 == r4) goto L_0x0071
            r1 = 2
            if (r6 != r1) goto L_0x006b
            java.lang.String r6 = "Timed out"
            goto L_0x0073
        L_0x006b:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x0071:
            java.lang.String r6 = "Finished successfully"
        L_0x0073:
            r1 = 4
            java.lang.String r2 = "ServiceInitializationAwaiter"
            com.appodeal.ads.modules.common.internal.log.InternalLogKt.logInternal$default(r2, r6, r3, r1, r3)
        L_0x0079:
            r0.f16700a = r3
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.await(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void launchAwaitingAsync(long j) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), (CoroutineContext) null, (CoroutineStart) null, new b(this, j, (Continuation<? super b>) null), 3, (Object) null);
    }

    public void releaseAwaiter() {
        this.f16701b.setValue(AwaitingState.Completed);
    }
}
