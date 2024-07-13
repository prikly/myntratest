package com.appodeal.ads.storage;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.b;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveUrlList$2", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
public final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17400a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set<String> f17401b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(b bVar, Set<String> set, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f17400a = bVar;
        this.f17401b = set;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new k(this.f17400a, this.f17401b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f17400a.a(b.a.Default).edit().putStringSet(Constants.CONFIG_URL_LIST, this.f17401b).apply();
        return Unit.INSTANCE;
    }
}
