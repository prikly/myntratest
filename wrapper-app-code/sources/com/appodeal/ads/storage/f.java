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

@DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$init$2", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17379a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(b bVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f17379a = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new f(this.f17379a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        b.a[] values = b.a.values();
        b bVar = this.f17379a;
        int length = values.length;
        int i = 0;
        while (i < length) {
            b.a aVar = values[i];
            i++;
            bVar.f17331c.put(aVar, new q(com.appodeal.ads.context.b.f16327b, aVar.a()));
        }
        return Unit.INSTANCE;
    }
}
