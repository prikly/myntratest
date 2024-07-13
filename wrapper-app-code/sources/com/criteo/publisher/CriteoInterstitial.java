package com.criteo.publisher;

import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.i0.a;
import com.criteo.publisher.i0.c;
import com.criteo.publisher.j0.b;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.m0.d;
import com.criteo.publisher.model.InterstitialAdUnit;
import com.criteo.publisher.model.a0;

public class CriteoInterstitial {
    private final Criteo criteo;
    private CriteoInterstitialAdListener criteoInterstitialAdListener;
    private n criteoInterstitialEventController;
    final InterstitialAdUnit interstitialAdUnit;
    private final g logger;

    public CriteoInterstitial() {
        this((InterstitialAdUnit) null, (Criteo) null);
    }

    public CriteoInterstitial(InterstitialAdUnit interstitialAdUnit2) {
        this(interstitialAdUnit2, (Criteo) null);
    }

    CriteoInterstitial(InterstitialAdUnit interstitialAdUnit2, Criteo criteo2) {
        g b2 = h.b(getClass());
        this.logger = b2;
        this.interstitialAdUnit = interstitialAdUnit2;
        this.criteo = criteo2;
        b2.a(b.a(interstitialAdUnit2));
    }

    public void setCriteoInterstitialAdListener(CriteoInterstitialAdListener criteoInterstitialAdListener2) {
        this.criteoInterstitialAdListener = criteoInterstitialAdListener2;
    }

    public void loadAd() {
        loadAd(new ContextData());
    }

    public void loadAd(ContextData contextData) {
        if (!s.c().d()) {
            this.logger.a(b.a());
            return;
        }
        try {
            doLoadAd(contextData);
        } catch (Throwable th) {
            this.logger.a(v.b(th));
        }
    }

    private void doLoadAd(ContextData contextData) {
        this.logger.a(b.c(this));
        getIntegrationRegistry().a(a.STANDALONE);
        getOrCreateController().a(this.interstitialAdUnit, contextData);
    }

    public void loadAd(Bid bid) {
        if (!s.c().d()) {
            this.logger.a(b.a());
            return;
        }
        try {
            doLoadAd(bid);
        } catch (Throwable th) {
            this.logger.a(v.b(th));
        }
    }

    public void loadAdWithDisplayData(String str) {
        if (!s.c().d()) {
            this.logger.a(b.a());
        } else {
            getOrCreateController().a(str);
        }
    }

    private void doLoadAd(Bid bid) {
        this.logger.a(b.a(this, bid));
        getIntegrationRegistry().a(a.IN_HOUSE);
        getOrCreateController().a(bid);
    }

    public boolean isAdLoaded() {
        try {
            boolean a2 = getOrCreateController().a();
            this.logger.a(b.a(this, a2));
            return a2;
        } catch (Throwable th) {
            this.logger.a(v.b(th));
            return false;
        }
    }

    public void show() {
        if (!s.c().d()) {
            this.logger.a(b.a());
            return;
        }
        try {
            doShow();
        } catch (Throwable th) {
            this.logger.a(v.b(th));
        }
    }

    private void doShow() {
        this.logger.a(b.d(this));
        getOrCreateController().c();
    }

    /* access modifiers changed from: package-private */
    public n getOrCreateController() {
        if (this.criteoInterstitialEventController == null) {
            Criteo criteo2 = getCriteo();
            this.criteoInterstitialEventController = new n(new a0(criteo2.getConfig(), getPubSdkApi()), criteo2.getInterstitialActivityHelper(), criteo2, new d(this, this.criteoInterstitialAdListener, getRunOnUiThreadExecutor()));
        }
        return this.criteoInterstitialEventController;
    }

    private Criteo getCriteo() {
        Criteo criteo2 = this.criteo;
        return criteo2 == null ? Criteo.getInstance() : criteo2;
    }

    private c getIntegrationRegistry() {
        return s.c().F0();
    }

    private com.criteo.publisher.k0.g getPubSdkApi() {
        return s.c().S0();
    }

    private com.criteo.publisher.e0.c getRunOnUiThreadExecutor() {
        return s.c().c1();
    }
}
