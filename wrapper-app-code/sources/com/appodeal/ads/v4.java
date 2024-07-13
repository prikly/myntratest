package com.appodeal.ads;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.networking.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.appodeal.ads.SdkCoreInitializerImpl", f = "SdkCoreInitializer.kt", l = {129}, m = "initializeServices")
public final class v4 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    public x4 f17609a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f17610b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x4 f17611c;

    /* renamed from: d  reason: collision with root package name */
    public int f17612d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v4(x4 x4Var, Continuation<? super v4> continuation) {
        super(continuation);
        this.f17611c = x4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f17610b = obj;
        this.f17612d |= RecyclerView.UNDEFINED_DURATION;
        return x4.a(this.f17611c, (Context) null, (b) null, (Continuation) this);
    }
}
