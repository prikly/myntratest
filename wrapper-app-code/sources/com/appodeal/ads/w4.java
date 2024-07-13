package com.appodeal.ads;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.appodeal.ads.SdkCoreInitializerImpl", f = "SdkCoreInitializer.kt", l = {118, 119}, m = "installRequest")
public final class w4 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    public Context f17622a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f17623b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x4 f17624c;

    /* renamed from: d  reason: collision with root package name */
    public int f17625d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w4(x4 x4Var, Continuation<? super w4> continuation) {
        super(continuation);
        this.f17624c = x4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f17623b = obj;
        this.f17625d |= RecyclerView.UNDEFINED_DURATION;
        return x4.a(this.f17624c, (Context) null, this);
    }
}
