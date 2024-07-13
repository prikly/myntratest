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

@DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveSessionAsync$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
public final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17392a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f17393b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f17394c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f17395d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f17396e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f17397f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f17398g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f17399h;
    public final /* synthetic */ long i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(b bVar, String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f17392a = bVar;
        this.f17393b = str;
        this.f17394c = j;
        this.f17395d = j2;
        this.f17396e = j3;
        this.f17397f = j4;
        this.f17398g = j5;
        this.f17399h = j6;
        this.i = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Continuation<?> continuation2 = continuation;
        return new j(this.f17392a, this.f17393b, this.f17394c, this.f17395d, this.f17396e, this.f17397f, this.f17398g, this.f17399h, this.i, continuation2);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f17392a.a(b.a.Default).edit().putString("session_uuid", this.f17393b).putLong("session_id", this.f17394c).putLong("session_uptime", this.f17395d).putLong("session_uptime_m", this.f17396e).putLong("session_start_ts", this.f17397f).putLong("session_start_ts_m", this.f17398g).putLong("app_uptime", this.f17399h).putLong("app_uptime_m", this.i).apply();
        return Unit.INSTANCE;
    }
}
