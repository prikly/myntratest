package com.appodeal.ads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.ads.AdLifecycleTrackerImpl$onActivityResumed$2", f = "AdLifecycleTracker.kt", l = {54, 56}, m = "invokeSuspend")
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16392a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f16393b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d dVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f16393b = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new f(this.f16393b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f16392a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x004b
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001a:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0036
        L_0x001e:
            kotlin.ResultKt.throwOnFailure(r5)
            com.appodeal.advertising.AdvertisingInfo r5 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
            com.appodeal.ads.d r1 = r4.f16393b
            com.appodeal.ads.modules.common.internal.context.ContextProvider r1 = r1.f16350b
            android.content.Context r1 = r1.getApplicationContext()
            r4.f16392a = r3
            java.lang.Object r5 = r5.fetchAdvertisingProfile(r1, r4)
            if (r5 != r0) goto L_0x0036
            return r0
        L_0x0036:
            com.appodeal.advertising.AdvertisingInfo r5 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
            com.appodeal.ads.d r1 = r4.f16393b
            com.appodeal.ads.modules.common.internal.context.ContextProvider r1 = r1.f16350b
            android.content.Context r1 = r1.getApplicationContext()
            r4.f16392a = r2
            java.lang.Object r5 = r5.getAdvertisingProfile(r1, r4)
            if (r5 != r0) goto L_0x004b
            return r0
        L_0x004b:
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r5 = (com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r5
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "AdvertisingProfile"
            java.lang.String r2 = "Extract"
            com.appodeal.ads.utils.Log.log((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r0)
            boolean r5 = com.appodeal.ads.x2.a((com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r5)
            if (r5 == 0) goto L_0x0061
            com.appodeal.ads.r0.d()
        L_0x0061:
            java.lang.String r5 = "SDK"
            java.lang.String r0 = "Resume"
            com.appodeal.ads.utils.Log.log(r5, r0)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
