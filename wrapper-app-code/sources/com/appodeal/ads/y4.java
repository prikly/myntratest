package com.appodeal.ads;

import android.app.Application;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.libs.network.AppodealEndpoints;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.appodeal.ads.SdkCoreInitializerImpl", f = "SdkCoreInitializer.kt", l = {175, 179, 188}, m = "prepareSdkCore")
public final class y4 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    public Object f17730a;

    /* renamed from: b  reason: collision with root package name */
    public Object f17731b;

    /* renamed from: c  reason: collision with root package name */
    public Object f17732c;

    /* renamed from: d  reason: collision with root package name */
    public Context f17733d;

    /* renamed from: e  reason: collision with root package name */
    public AppodealEndpoints f17734e;

    /* renamed from: f  reason: collision with root package name */
    public String f17735f;

    /* renamed from: g  reason: collision with root package name */
    public /* synthetic */ Object f17736g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ x4 f17737h;
    public int i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y4(x4 x4Var, Continuation<? super y4> continuation) {
        super(continuation);
        this.f17737h = x4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f17736g = obj;
        this.i |= RecyclerView.UNDEFINED_DURATION;
        return x4.a(this.f17737h, (Application) null, (String) null, (Continuation) this);
    }
}
