package com.appodeal.ads.services;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.service.RevenueTracker;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.ServiceDataProvider;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.n5;
import com.appodeal.ads.revenue.RevenueInfo;
import com.appodeal.ads.services.c;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

public final class d implements c, c.a {

    /* renamed from: a  reason: collision with root package name */
    public final MutableStateFlow<Set<Service<? extends ServiceOptions>>> f17299a = StateFlowKt.MutableStateFlow(SetsKt.emptySet());

    @DebugMetadata(c = "com.appodeal.ads.services.ServicesSolutionImpl$logEvent$2", f = "ServicesSolutionImpl.kt", l = {29}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f17300a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f17301b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f17302c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f17303d;

        @DebugMetadata(c = "com.appodeal.ads.services.ServicesSolutionImpl$logEvent$2$1", f = "ServicesSolutionImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.appodeal.ads.services.d$a$a  reason: collision with other inner class name */
        public static final class C0203a extends SuspendLambda implements Function2<Set<? extends Service<? extends ServiceOptions>>, Continuation<? super Boolean>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f17304a;

            public C0203a(Continuation<? super C0203a> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0203a aVar = new C0203a(continuation);
                aVar.f17304a = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0203a) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(!((Set) this.f17304a).isEmpty());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, String str, Map<String, ? extends Object> map, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f17301b = dVar;
            this.f17302c = str;
            this.f17303d = map;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f17301b, this.f17302c, this.f17303d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f17300a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow a2 = this.f17301b.f17299a;
                C0203a aVar = new C0203a((Continuation<? super C0203a>) null);
                this.f17300a = 1;
                obj = FlowKt.first(a2, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = this.f17302c;
            Map<String, Object> map = this.f17303d;
            for (Service service : (Iterable) obj) {
                service.logEvent(str, map);
                String a3 = n5.a(service.getInfo().getName());
                Intrinsics.checkNotNullExpressionValue(a3, "capitalize((service as Service<*>).info.name)");
                Log.log(LogConstants.KEY_SERVICE, LogConstants.EVENT_INFO, a3 + ' ' + ("logEvent - " + str + " with params: " + map));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.services.ServicesSolutionImpl$trackRevenue$2", f = "ServicesSolutionImpl.kt", l = {108}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f17305a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f17306b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ RevenueInfo f17307c;

        @DebugMetadata(c = "com.appodeal.ads.services.ServicesSolutionImpl$trackRevenue$2$services$1", f = "ServicesSolutionImpl.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2<Set<? extends Service<? extends ServiceOptions>>, Continuation<? super Boolean>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f17308a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f17308a = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(!((Set) this.f17308a).isEmpty());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, RevenueInfo revenueInfo, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f17306b = dVar;
            this.f17307c = revenueInfo;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f17306b, this.f17307c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f17305a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow a2 = this.f17306b.f17299a;
                a aVar = new a((Continuation<? super a>) null);
                this.f17305a = 1;
                obj = FlowKt.first(a2, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<R> filterIsInstance = CollectionsKt.filterIsInstance((Iterable) obj, RevenueTracker.class);
            RevenueInfo revenueInfo = this.f17307c;
            for (R trackRevenue : filterIsInstance) {
                trackRevenue.trackRevenue(revenueInfo);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.appodeal.ads.inapp.InAppPurchase r11, com.appodeal.ads.inapp.InAppPurchaseValidateCallback r12, com.appodeal.ads.q4.h.a r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.appodeal.ads.services.e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.appodeal.ads.services.e r0 = (com.appodeal.ads.services.e) r0
            int r1 = r0.f17313e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17313e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.services.e r0 = new com.appodeal.ads.services.e
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f17311c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17313e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            com.appodeal.ads.inapp.InAppPurchaseValidateCallback r12 = r0.f17310b
            com.appodeal.ads.inapp.InAppPurchase r11 = r0.f17309a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0052
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r14)
            com.appodeal.ads.services.f r14 = new com.appodeal.ads.services.f
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r12
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f17309a = r11
            r0.f17310b = r12
            r0.f17313e = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r14 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r2, r14, r0)
            if (r14 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlin.Unit r14 = (kotlin.Unit) r14
            if (r14 != 0) goto L_0x0062
            if (r12 != 0) goto L_0x0059
            goto L_0x0062
        L_0x0059:
            com.appodeal.ads.service.ServiceError$IAPValidationTimeout r13 = com.appodeal.ads.service.ServiceError.IAPValidationTimeout.INSTANCE
            java.util.List r13 = kotlin.collections.CollectionsKt.listOf(r13)
            r12.onInAppPurchaseValidateFail(r11, r13)
        L_0x0062:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.d.a(com.appodeal.ads.inapp.InAppPurchase, com.appodeal.ads.inapp.InAppPurchaseValidateCallback, com.appodeal.ads.q4$h$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object a(RevenueInfo revenueInfo, Continuation<? super Unit> continuation) {
        return TimeoutKt.withTimeoutOrNull(10000, new b(this, revenueInfo, (Continuation<? super b>) null), continuation);
    }

    public final Object a(String str, Map<String, ? extends Object> map, Continuation<? super Unit> continuation) {
        return TimeoutKt.withTimeoutOrNull(10000, new a(this, str, map, (Continuation<? super a>) null), continuation);
    }

    public final Object a(List<? extends Service<? extends ServiceOptions>> list, Continuation<? super Unit> continuation) {
        Object emit = this.f17299a.emit(CollectionsKt.toSet(list), continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    public final ArrayList getServicesData() {
        List<R> filterIsInstance = CollectionsKt.filterIsInstance(this.f17299a.getValue(), ServiceDataProvider.class);
        ArrayList arrayList = new ArrayList();
        for (R serviceData : filterIsInstance) {
            ServiceData serviceData2 = serviceData.getServiceData();
            if (serviceData2 != null) {
                arrayList.add(serviceData2);
            }
        }
        return arrayList;
    }
}
