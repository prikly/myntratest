package com.appodeal.ads;

import android.app.Application;
import com.appodeal.ads.initializing.ApdInitializationCallback;
import com.appodeal.consent.Consent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.ads.SdkCore$initializeSdkCore$1", f = "SdkCore.kt", l = {873, 892}, m = "invokeSuspend")
public final class r4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17102a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ApdInitializationCallback f17103b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t4 f17104c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Application f17105d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f17106e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Consent f17107f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Boolean f17108g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f17109h;

    @DebugMetadata(c = "com.appodeal.ads.SdkCore$initializeSdkCore$1$4", f = "SdkCore.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ boolean f17110a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f17110a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.f17110a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r4(ApdInitializationCallback apdInitializationCallback, t4 t4Var, Application application, String str, Consent consent, Boolean bool, int i, Continuation<? super r4> continuation) {
        super(2, continuation);
        this.f17103b = apdInitializationCallback;
        this.f17104c = t4Var;
        this.f17105d = application;
        this.f17106e = str;
        this.f17107f = consent;
        this.f17108g = bool;
        this.f17109h = i;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new r4(this.f17103b, this.f17104c, this.f17105d, this.f17106e, this.f17107f, this.f17108g, this.f17109h, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f17102a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r4) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x009e
        L_0x0014:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.m51unboximpl()
            goto L_0x0057
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r12)
            com.appodeal.ads.initializing.ApdInitializationCallback r12 = r11.f17103b
            if (r12 != 0) goto L_0x002e
            goto L_0x0039
        L_0x002e:
            java.util.LinkedHashSet r1 = com.appodeal.ads.q4.l
            boolean r12 = r1.add(r12)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)
        L_0x0039:
            boolean r12 = com.appodeal.ads.q4.f17049c
            if (r12 != 0) goto L_0x008c
            boolean r12 = com.appodeal.ads.q4.f17048b
            if (r12 != 0) goto L_0x008c
            com.appodeal.ads.q4.f17048b = r4
            com.appodeal.ads.t4 r5 = r11.f17104c
            android.app.Application r6 = r11.f17105d
            java.lang.String r7 = r11.f17106e
            com.appodeal.consent.Consent r8 = r11.f17107f
            java.lang.Boolean r9 = r11.f17108g
            r11.f17102a = r4
            r10 = r11
            java.lang.Object r12 = r5.a(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L_0x0057
            return r0
        L_0x0057:
            boolean r1 = kotlin.Result.m49isSuccessimpl(r12)
            if (r1 == 0) goto L_0x0067
            r1 = r12
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r5 = com.appodeal.ads.q4.p
            r5.addAll(r1)
        L_0x0067:
            java.lang.Throwable r12 = kotlin.Result.m46exceptionOrNullimpl(r12)
            if (r12 != 0) goto L_0x006e
            goto L_0x007c
        L_0x006e:
            boolean r1 = r12 instanceof com.appodeal.ads.initializing.ApdInitializationError
            if (r1 == 0) goto L_0x0079
            java.util.ArrayList r1 = com.appodeal.ads.q4.p
            r1.add(r12)
        L_0x0079:
            com.appodeal.ads.utils.Log.log(r12)
        L_0x007c:
            r12 = 0
            com.appodeal.ads.q4.f17048b = r12
            com.appodeal.ads.q4.f17049c = r4
            kotlinx.coroutines.flow.MutableStateFlow r12 = com.appodeal.ads.q4.o
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            r12.setValue(r1)
        L_0x008c:
            kotlinx.coroutines.flow.MutableStateFlow r12 = com.appodeal.ads.q4.o
            com.appodeal.ads.r4$a r1 = new com.appodeal.ads.r4$a
            r1.<init>(r2)
            r11.f17102a = r3
            java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.first(r12, r1, r11)
            if (r12 != r0) goto L_0x009e
            return r0
        L_0x009e:
            com.appodeal.ads.q4 r12 = com.appodeal.ads.q4.f17047a
            com.appodeal.ads.context.b r0 = com.appodeal.ads.q4.a((com.appodeal.ads.q4) r12)
            android.content.Context r0 = r0.getApplicationContext()
            int r1 = r11.f17109h
            java.util.List r3 = com.appodeal.ads.q4.d()
            com.appodeal.ads.q4.a(r12, r0, r1, r3)
            java.util.LinkedHashSet r12 = com.appodeal.ads.q4.l
            java.util.Iterator r12 = r12.iterator()
        L_0x00b9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r0 = r12.next()
            com.appodeal.ads.initializing.ApdInitializationCallback r0 = (com.appodeal.ads.initializing.ApdInitializationCallback) r0
            java.util.ArrayList r1 = com.appodeal.ads.q4.p
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r1 = r2
        L_0x00d2:
            r0.onInitializationFinished(r1)
            goto L_0x00b9
        L_0x00d6:
            java.util.LinkedHashSet r12 = com.appodeal.ads.q4.l
            r12.clear()
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.r4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
