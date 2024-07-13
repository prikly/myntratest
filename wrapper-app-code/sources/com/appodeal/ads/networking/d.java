package com.appodeal.ads.networking;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.y2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.appodeal.ads.networking.JsonRequestExtKt", f = "JsonRequestExt.kt", l = {64}, m = "execute")
public final class d extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f16984a;

    /* renamed from: b  reason: collision with root package name */
    public int f16985b;

    public d(Continuation<? super d> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.f16984a = obj;
        this.f16985b |= RecyclerView.UNDEFINED_DURATION;
        Object a2 = c.a((y2.a) null, (Continuation) this);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m43boximpl(a2);
    }
}
