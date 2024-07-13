package com.appodeal.ads.storage;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveAppKey$2", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
public final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17380a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f17381b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(b bVar, String str, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f17380a = bVar;
        this.f17381b = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new g(this.f17380a, this.f17381b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f17380a.a(b.a.Default).edit().putString(Constants.APP_KEY, this.f17381b).apply();
        return Unit.INSTANCE;
    }
}
