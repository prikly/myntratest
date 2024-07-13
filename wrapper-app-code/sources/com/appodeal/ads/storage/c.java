package com.appodeal.ads.storage;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$getAndSetTrackFirstInstall$2", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17376a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f17376a = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new c(this.f17376a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        b bVar = this.f17376a;
        b.a aVar = b.a.Default;
        boolean z = bVar.a(aVar).getBoolean(Constants.APPODEAL_FIRST_INSTALL, false);
        if (!z) {
            this.f17376a.a(aVar).edit().putBoolean(Constants.APPODEAL_FIRST_INSTALL, true).apply();
        }
        return Boxing.boxBoolean(z);
    }
}
