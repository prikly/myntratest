package com.criteo.publisher.m0;

import com.criteo.publisher.CriteoErrorCode;
import com.criteo.publisher.CriteoInterstitial;
import com.criteo.publisher.CriteoInterstitialAdListener;
import com.criteo.publisher.e0.c;
import com.criteo.publisher.j0.b;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.p;
import com.criteo.publisher.x;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InterstitialListenerNotifier.kt */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final g f2696a;

    /* renamed from: b  reason: collision with root package name */
    private final CriteoInterstitial f2697b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Reference<CriteoInterstitialAdListener> f2698c;

    /* renamed from: d  reason: collision with root package name */
    private final c f2699d;

    public d(CriteoInterstitial criteoInterstitial, Reference<CriteoInterstitialAdListener> reference, c cVar) {
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        Intrinsics.checkParameterIsNotNull(reference, "listenerRef");
        Intrinsics.checkParameterIsNotNull(cVar, "runOnUiThreadExecutor");
        this.f2697b = criteoInterstitial;
        this.f2698c = reference;
        this.f2699d = cVar;
        g b2 = h.b(getClass());
        Intrinsics.checkExpressionValueIsNotNull(b2, "LoggerFactory.getLogger(javaClass)");
        this.f2696a = b2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(CriteoInterstitial criteoInterstitial, CriteoInterstitialAdListener criteoInterstitialAdListener, c cVar) {
        this(criteoInterstitial, (Reference<CriteoInterstitialAdListener>) new WeakReference(criteoInterstitialAdListener), cVar);
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        Intrinsics.checkParameterIsNotNull(cVar, "runOnUiThreadExecutor");
    }

    /* compiled from: InterstitialListenerNotifier.kt */
    public static final class a extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f2700c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f2701d;

        a(d dVar, p pVar) {
            this.f2700c = dVar;
            this.f2701d = pVar;
        }

        public void a() {
            CriteoInterstitialAdListener criteoInterstitialAdListener = (CriteoInterstitialAdListener) this.f2700c.f2698c.get();
            if (criteoInterstitialAdListener != null) {
                this.f2700c.a(criteoInterstitialAdListener, this.f2701d);
            }
        }
    }

    public void a(p pVar) {
        Intrinsics.checkParameterIsNotNull(pVar, "code");
        a(this.f2696a, pVar);
        this.f2699d.a(new a(this, pVar));
    }

    /* access modifiers changed from: private */
    public void a(CriteoInterstitialAdListener criteoInterstitialAdListener, p pVar) {
        switch (c.f2695a[pVar.ordinal()]) {
            case 1:
                criteoInterstitialAdListener.onAdReceived(this.f2697b);
                return;
            case 2:
                criteoInterstitialAdListener.onAdFailedToReceive(CriteoErrorCode.ERROR_CODE_NO_FILL);
                return;
            case 3:
                criteoInterstitialAdListener.onAdFailedToReceive(CriteoErrorCode.ERROR_CODE_NETWORK_ERROR);
                return;
            case 4:
                criteoInterstitialAdListener.onAdOpened();
                return;
            case 5:
                criteoInterstitialAdListener.onAdClosed();
                return;
            case 6:
                criteoInterstitialAdListener.onAdClicked();
                criteoInterstitialAdListener.onAdLeftApplication();
                return;
            default:
                return;
        }
    }

    private void a(g gVar, p pVar) {
        if (pVar == p.VALID) {
            gVar.a(b.b(this.f2697b));
        } else if (pVar == p.INVALID || pVar == p.INVALID_CREATIVE) {
            gVar.a(b.a(this.f2697b));
        }
    }
}
