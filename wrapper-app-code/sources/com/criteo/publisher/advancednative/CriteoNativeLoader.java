package com.criteo.publisher.advancednative;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.criteo.publisher.Bid;
import com.criteo.publisher.CriteoErrorCode;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.d;
import com.criteo.publisher.e;
import com.criteo.publisher.e0.c;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.model.NativeAdUnit;
import com.criteo.publisher.model.b0.n;
import com.criteo.publisher.model.s;
import com.criteo.publisher.n0.o;
import java.lang.ref.WeakReference;

public class CriteoNativeLoader {
    final NativeAdUnit adUnit;
    private final CriteoNativeAdListener listener;
    private final g logger;
    private final CriteoNativeRenderer publisherRenderer;
    private CriteoNativeRenderer renderer;

    public CriteoNativeLoader(CriteoNativeAdListener criteoNativeAdListener, CriteoNativeRenderer criteoNativeRenderer) {
        this((NativeAdUnit) null, criteoNativeAdListener, criteoNativeRenderer);
    }

    public CriteoNativeLoader(NativeAdUnit nativeAdUnit, CriteoNativeAdListener criteoNativeAdListener, CriteoNativeRenderer criteoNativeRenderer) {
        this.logger = h.b(getClass());
        this.adUnit = nativeAdUnit;
        this.listener = new k(criteoNativeAdListener, new WeakReference(this));
        this.publisherRenderer = criteoNativeRenderer;
        this.logger.a(m.c(nativeAdUnit));
    }

    public static void setImageLoader(ImageLoader imageLoader) {
        getImageLoaderHolder().a(imageLoader);
    }

    public View createEmptyNativeView(Context context, ViewGroup viewGroup) {
        return getRenderer().createNativeView(context, viewGroup);
    }

    public void loadAd() {
        loadAd(new ContextData());
    }

    public void loadAd(ContextData contextData) {
        try {
            doLoad(contextData);
        } catch (Throwable th) {
            o.a(th);
        }
    }

    private void doLoad(ContextData contextData) {
        this.logger.a(m.e(this));
        getIntegrationRegistry().a(com.criteo.publisher.i0.a.STANDALONE);
        getBidManager().a(this.adUnit, contextData, new a());
    }

    class a implements d {
        a() {
        }

        public void a(s sVar) {
            CriteoNativeLoader.this.handleNativeAssets(sVar.g());
        }

        public void a() {
            CriteoNativeLoader.this.handleNativeAssets((n) null);
        }
    }

    public void loadAd(Bid bid) {
        try {
            doLoad(bid);
        } catch (Throwable th) {
            o.a(th);
        }
    }

    private void doLoad(Bid bid) {
        n nVar;
        this.logger.a(m.a(this, bid));
        getIntegrationRegistry().a(com.criteo.publisher.i0.a.IN_HOUSE);
        if (bid == null) {
            nVar = null;
        } else {
            nVar = bid.a();
        }
        handleNativeAssets(nVar);
    }

    /* access modifiers changed from: private */
    public void handleNativeAssets(n nVar) {
        if (nVar == null) {
            notifyForFailureAsync();
        } else {
            notifyForAdAsync(getNativeAdMapper().a(nVar, new WeakReference(this.listener), getRenderer()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(CriteoNativeAd criteoNativeAd) {
        this.listener.onAdReceived(criteoNativeAd);
    }

    private void notifyForAdAsync(CriteoNativeAd criteoNativeAd) {
        getUiThreadExecutor().a(new Runnable(criteoNativeAd) {
            public final /* synthetic */ CriteoNativeAd f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                CriteoNativeLoader.this.a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.listener.onAdFailedToReceive(CriteoErrorCode.ERROR_CODE_NO_FILL);
    }

    private void notifyForFailureAsync() {
        getUiThreadExecutor().a(new Runnable() {
            public final void run() {
                CriteoNativeLoader.this.a();
            }
        });
    }

    private CriteoNativeRenderer getRenderer() {
        if (this.renderer == null) {
            this.renderer = new AdChoiceOverlayNativeRenderer(this.publisherRenderer, getAdChoiceOverlay());
        }
        return this.renderer;
    }

    private l getNativeAdMapper() {
        return com.criteo.publisher.s.c().Q0();
    }

    private c getUiThreadExecutor() {
        return com.criteo.publisher.s.c().c1();
    }

    private e getBidManager() {
        return com.criteo.publisher.s.c().k0();
    }

    private b getAdChoiceOverlay() {
        return com.criteo.publisher.s.c().b0();
    }

    private static h getImageLoaderHolder() {
        return com.criteo.publisher.s.c().D0();
    }

    private com.criteo.publisher.i0.c getIntegrationRegistry() {
        return com.criteo.publisher.s.c().F0();
    }
}
