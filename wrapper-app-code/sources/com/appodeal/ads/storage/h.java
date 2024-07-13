package com.appodeal.ads.storage;

import com.appodeal.ads.storage.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$savePartOfAudienceAsync$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
public final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f17383b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17384c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(b bVar, String str, int i, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f17382a = bVar;
        this.f17383b = str;
        this.f17384c = i;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new h(this.f17382a, this.f17383b, this.f17384c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f17382a.a(b.a.Default).edit().putInt(this.f17383b, this.f17384c).apply();
        return Unit.INSTANCE;
    }
}
