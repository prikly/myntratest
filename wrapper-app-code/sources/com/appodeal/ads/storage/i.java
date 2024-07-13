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

@DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveRequestData$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
public final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17385a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f17386b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f17387c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f17388d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f17389e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f17390f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f17391g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(b bVar, String str, String str2, String str3, long j, String str4, int i, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f17385a = bVar;
        this.f17386b = str;
        this.f17387c = str2;
        this.f17388d = str3;
        this.f17389e = j;
        this.f17390f = str4;
        this.f17391g = i;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new i(this.f17385a, this.f17386b, this.f17387c, this.f17388d, this.f17389e, this.f17390f, this.f17391g, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f17385a.a(b.a.Default).edit().putString(this.f17386b, this.f17387c).putLong(this.f17388d, this.f17389e).putInt(this.f17390f, this.f17391g).apply();
        return Unit.INSTANCE;
    }
}
