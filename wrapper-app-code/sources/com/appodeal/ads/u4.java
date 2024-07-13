package com.appodeal.ads;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.consent.Consent;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.appodeal.ads.SdkCoreInitializerImpl", f = "SdkCoreInitializer.kt", l = {159, 163}, m = "initializeSdkRegulator")
public final class u4 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    public Context f17452a;

    /* renamed from: b  reason: collision with root package name */
    public Consent f17453b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f17454c;

    /* renamed from: d  reason: collision with root package name */
    public String f17455d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f17456e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x4 f17457f;

    /* renamed from: g  reason: collision with root package name */
    public int f17458g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u4(x4 x4Var, Continuation<? super u4> continuation) {
        super(continuation);
        this.f17457f = x4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f17456e = obj;
        this.f17458g |= RecyclerView.UNDEFINED_DURATION;
        return x4.a(this.f17457f, (Context) null, (Consent) null, (Boolean) null, (String) null, this);
    }
}
