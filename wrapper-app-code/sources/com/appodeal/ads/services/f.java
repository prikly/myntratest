package com.appodeal.ads.services;

import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import com.appodeal.ads.modules.common.internal.service.Purchasable;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.ads.services.ServicesSolutionImpl$validatePurchase$2", f = "ServicesSolutionImpl.kt", l = {48, 57}, m = "invokeSuspend")
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public List f17314a;

    /* renamed from: b  reason: collision with root package name */
    public InAppPurchase f17315b;

    /* renamed from: c  reason: collision with root package name */
    public Collection f17316c;

    /* renamed from: d  reason: collision with root package name */
    public Iterator f17317d;

    /* renamed from: e  reason: collision with root package name */
    public Purchasable f17318e;

    /* renamed from: f  reason: collision with root package name */
    public int f17319f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f17320g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ InAppPurchaseValidateCallback f17321h;
    public final /* synthetic */ InAppPurchase i;
    public final /* synthetic */ Function0<Unit> j;

    @DebugMetadata(c = "com.appodeal.ads.services.ServicesSolutionImpl$validatePurchase$2$services$1", f = "ServicesSolutionImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<Set<? extends Service<? extends ServiceOptions>>, Continuation<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17322a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f17322a = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!((Set) this.f17322a).isEmpty());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d dVar, InAppPurchaseValidateCallback inAppPurchaseValidateCallback, InAppPurchase inAppPurchase, Function0<Unit> function0, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f17320g = dVar;
        this.f17321h = inAppPurchaseValidateCallback;
        this.i = inAppPurchase;
        this.j = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new f(this.f17320g, this.f17321h, this.i, this.j, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17319f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0035
            if (r2 == r4) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            com.appodeal.ads.modules.common.internal.service.Purchasable r2 = r0.f17318e
            java.util.Iterator r4 = r0.f17317d
            java.util.Collection r6 = r0.f17316c
            com.appodeal.ads.inapp.InAppPurchase r7 = r0.f17315b
            java.util.List r8 = r0.f17314a
            kotlin.ResultKt.throwOnFailure(r18)
            r10 = r18
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r4
            r4 = r0
            goto L_0x00a9
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r18)
            r2 = r18
            goto L_0x004c
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r18)
            com.appodeal.ads.services.d r2 = r0.f17320g
            kotlinx.coroutines.flow.MutableStateFlow r2 = r2.f17299a
            com.appodeal.ads.services.f$a r6 = new com.appodeal.ads.services.f$a
            r6.<init>(r5)
            r0.f17319f = r4
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.first(r2, r6, r0)
            if (r2 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Class<com.appodeal.ads.modules.common.internal.service.Purchasable> r4 = com.appodeal.ads.modules.common.internal.service.Purchasable.class
            java.util.List r2 = kotlin.collections.CollectionsKt.filterIsInstance(r2, r4)
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x006f
            com.appodeal.ads.inapp.InAppPurchaseValidateCallback r1 = r0.f17321h
            if (r1 != 0) goto L_0x0060
            goto L_0x0194
        L_0x0060:
            com.appodeal.ads.inapp.InAppPurchase r2 = r0.i
            com.appodeal.ads.service.ServiceError$PurchaseValidationServiceNotFound r3 = com.appodeal.ads.service.ServiceError.PurchaseValidationServiceNotFound.INSTANCE
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            r1.onInAppPurchaseValidateFail(r2, r3)
        L_0x006b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L_0x0194
        L_0x006f:
            com.appodeal.ads.inapp.InAppPurchase r4 = r0.i
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r2.iterator()
            r8 = r2
            r2 = r0
            r16 = r7
            r7 = r4
            r4 = r16
        L_0x0081:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x016b
            java.lang.Object r9 = r4.next()
            com.appodeal.ads.modules.common.internal.service.Purchasable r9 = (com.appodeal.ads.modules.common.internal.service.Purchasable) r9
            r2.f17314a = r8
            r2.f17315b = r7
            r2.f17316c = r6
            r2.f17317d = r4
            r2.f17318e = r9
            r2.f17319f = r3
            java.lang.Object r10 = r9.validatePurchase(r7, r2)
            if (r10 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r16 = r4
            r4 = r2
            r2 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r16
        L_0x00a9:
            com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult r10 = (com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult) r10
            boolean r11 = r10 instanceof com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult.Success
            r12 = 32
            if (r11 == 0) goto L_0x00cd
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r13 = r10
            com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult$Success r13 = (com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult.Success) r13
            java.lang.String r13 = r13.getDescription()
            r11.append(r13)
            java.lang.String r13 = " - Success "
            r11.append(r13)
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            goto L_0x0119
        L_0x00cd:
            boolean r11 = r10 instanceof com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult.Failure
            if (r11 == 0) goto L_0x0165
            r11 = r10
            com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult$Failure r11 = (com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult.Failure) r11
            com.appodeal.ads.service.ServiceError r13 = r11.getError()
            boolean r14 = r13 instanceof com.appodeal.ads.service.ServiceError.Adjust.PurchaseValidationError
            java.lang.String r15 = "trackInApp - Fail "
            if (r14 == 0) goto L_0x00fc
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
        L_0x00e6:
            r13.append(r8)
            r13.append(r12)
            com.appodeal.ads.service.ServiceError r11 = r11.getError()
            java.lang.String r11 = r11.getDescription()
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            goto L_0x0119
        L_0x00fc:
            com.appodeal.ads.service.ServiceError$Adjust$SubscriptionTrackError r14 = com.appodeal.ads.service.ServiceError.Adjust.SubscriptionTrackError.INSTANCE
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r14 == 0) goto L_0x010f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "trackSubscription - Fail "
            r13.append(r14)
            goto L_0x00e6
        L_0x010f:
            boolean r11 = r13 instanceof com.appodeal.ads.service.ServiceError.Appsflyer.PurchaseValidationError
            if (r11 == 0) goto L_0x0118
            java.lang.String r11 = kotlin.jvm.internal.Intrinsics.stringPlus(r15, r8)
            goto L_0x0119
        L_0x0118:
            r11 = r5
        L_0x0119:
            if (r11 != 0) goto L_0x011c
            goto L_0x0148
        L_0x011c:
            com.appodeal.ads.modules.common.internal.service.Service r2 = (com.appodeal.ads.modules.common.internal.service.Service) r2
            com.appodeal.ads.modules.common.internal.service.ServiceInfo r2 = r2.getInfo()
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = com.appodeal.ads.n5.a((java.lang.String) r2)
            java.lang.String r13 = "capitalize((service as Service<*>).info.name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            r13.append(r12)
            r13.append(r11)
            java.lang.String r2 = r13.toString()
            java.lang.String r11 = "Service"
            java.lang.String r12 = "Info"
            com.appodeal.ads.utils.Log.log((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r2)
        L_0x0148:
            boolean r2 = r10 instanceof com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult.Failure
            if (r2 == 0) goto L_0x014f
            com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult$Failure r10 = (com.appodeal.ads.modules.common.internal.service.InAppPurchaseValidationResult.Failure) r10
            goto L_0x0150
        L_0x014f:
            r10 = r5
        L_0x0150:
            if (r10 != 0) goto L_0x0154
            r2 = r5
            goto L_0x0158
        L_0x0154:
            com.appodeal.ads.service.ServiceError r2 = r10.getError()
        L_0x0158:
            if (r2 != 0) goto L_0x015b
            goto L_0x015e
        L_0x015b:
            r7.add(r2)
        L_0x015e:
            r2 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            goto L_0x0081
        L_0x0165:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x016b:
            java.util.List r6 = (java.util.List) r6
            int r1 = r6.size()
            int r3 = r8.size()
            if (r1 != r3) goto L_0x0183
            com.appodeal.ads.inapp.InAppPurchaseValidateCallback r1 = r2.f17321h
            if (r1 != 0) goto L_0x017c
            goto L_0x0194
        L_0x017c:
            com.appodeal.ads.inapp.InAppPurchase r2 = r2.i
            r1.onInAppPurchaseValidateFail(r2, r6)
            goto L_0x006b
        L_0x0183:
            com.appodeal.ads.inapp.InAppPurchaseValidateCallback r1 = r2.f17321h
            if (r1 != 0) goto L_0x0188
            goto L_0x018d
        L_0x0188:
            com.appodeal.ads.inapp.InAppPurchase r3 = r2.i
            r1.onInAppPurchaseValidateSuccess(r3, r6)
        L_0x018d:
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r2.j
            r1.invoke()
            goto L_0x006b
        L_0x0194:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
