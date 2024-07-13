package com.appodeal.ads.regulator;

import android.content.Context;
import com.appodeal.ads.regulator.a;
import com.appodeal.ads.regulator.usecases.a;
import com.appodeal.consent.Consent;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.ads.regulator.ConsentSdkImpl$loadCurrentConsent$1", f = "ConsentSdk.kt", l = {187}, m = "invokeSuspend")
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17153a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f17154b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f17155c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Consent.Status f17156d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Consent.Zone f17157e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Consent f17158f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d dVar, String str, Consent.Status status, Consent.Zone zone, Consent consent, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f17154b = dVar;
        this.f17155c = str;
        this.f17156d = status;
        this.f17157e = zone;
        this.f17158f = consent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new f(this.f17154b, this.f17155c, this.f17156d, this.f17157e, this.f17158f, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f17153a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a c2 = this.f17154b.f17136b;
            Context b2 = this.f17154b.f17135a;
            String str = this.f17155c;
            Consent.Status status = this.f17156d;
            Consent.Zone zone = this.f17157e;
            Consent consent = this.f17158f;
            this.f17153a = 1;
            obj2 = c2.a(b2, str, status, zone, consent, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).m51unboximpl();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d dVar = this.f17154b;
        if (Result.m49isSuccessimpl(obj2)) {
            com.appodeal.ads.regulator.data.a aVar = (com.appodeal.ads.regulator.data.a) obj2;
            d.a(dVar, new a.b(aVar.a(), aVar.b()));
        }
        d dVar2 = this.f17154b;
        Throwable r11 = Result.m46exceptionOrNullimpl(obj2);
        if (r11 != null) {
            d.a(dVar2, new a.d(r11));
        }
        return Unit.INSTANCE;
    }
}
