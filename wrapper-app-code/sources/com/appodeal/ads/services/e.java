package com.appodeal.ads.services;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import com.appodeal.ads.q4;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.appodeal.ads.services.ServicesSolutionImpl", f = "ServicesSolutionImpl.kt", l = {47}, m = "validatePurchase")
public final class e extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    public InAppPurchase f17309a;

    /* renamed from: b  reason: collision with root package name */
    public InAppPurchaseValidateCallback f17310b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f17311c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f17312d;

    /* renamed from: e  reason: collision with root package name */
    public int f17313e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, Continuation<? super e> continuation) {
        super(continuation);
        this.f17312d = dVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f17311c = obj;
        this.f17313e |= RecyclerView.UNDEFINED_DURATION;
        return this.f17312d.a((InAppPurchase) null, (InAppPurchaseValidateCallback) null, (q4.h.a) null, this);
    }
}
