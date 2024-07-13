package com.appodeal.ads.storage;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.q4;
import com.appodeal.ads.storage.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveVersion$2", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
public final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17402a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(b bVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f17402a = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new l(this.f17402a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f17402a.a(b.a.Default).edit().putString(Constants.APPODEAL_VERSION, q4.n()).apply();
        return Unit.INSTANCE;
    }
}
