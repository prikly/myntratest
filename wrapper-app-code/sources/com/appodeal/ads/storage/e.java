package com.appodeal.ads.storage;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.b;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$getUrlList$2", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Set<? extends String>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17378a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(b bVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f17378a = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new e(this.f17378a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Set<String> stringSet = this.f17378a.a(b.a.Default).getStringSet(Constants.CONFIG_URL_LIST, SetsKt.emptySet());
        return stringSet == null ? SetsKt.emptySet() : stringSet;
    }
}
