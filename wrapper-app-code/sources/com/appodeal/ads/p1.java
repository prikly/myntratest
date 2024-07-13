package com.appodeal.ads;

import android.os.Bundle;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.o1;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;

public final class p1 extends j1<r1, UnifiedInterstitial, UnifiedInterstitialParams, UnifiedInterstitialCallback> {

    public static final class b implements UnifiedInterstitialParams {
        public final int getAfd() {
            return o1.a().q;
        }

        public final String obtainPlacementId() {
            return g.a(o1.a().l);
        }

        public final String obtainSegmentId() {
            return o1.a().r().toString();
        }
    }

    public p1(r1 r1Var, AdNetwork adNetwork, d0 d0Var) {
        super(r1Var, adNetwork, d0Var);
    }

    public final UnifiedAd a(AdNetwork adNetwork) {
        return adNetwork.createInterstitial();
    }

    public final UnifiedAdCallback c() {
        return new a();
    }

    public final LoadingError l() {
        if (this.f16569b.isInterstitialShowing()) {
            return LoadingError.Canceled;
        }
        return null;
    }

    public final class a extends UnifiedInterstitialCallback {
        public a() {
        }

        public final void onAdClicked() {
            o1.b b2 = o1.b();
            p1 p1Var = p1.this;
            b2.a((r) (r1) p1Var.f16568a, (l) p1Var, (l2) null, (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdClosed() {
            o1.b b2 = o1.b();
            p1 p1Var = p1.this;
            b2.b((r) (r1) p1Var.f16568a, (j1) p1Var);
        }

        public final void onAdExpired() {
            o1.b b2 = o1.b();
            p1 p1Var = p1.this;
            b2.e((r1) p1Var.f16568a, p1Var);
        }

        public final void onAdFinished() {
            o1.b b2 = o1.b();
            p1 p1Var = p1.this;
            b2.i((r1) p1Var.f16568a, p1Var, (l2) null);
        }

        public final void onAdInfoRequested(Bundle bundle) {
            p1.this.a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            o1.b b2 = o1.b();
            p1 p1Var = p1.this;
            b2.a((r1) p1Var.f16568a, p1Var, loadingError);
        }

        public final void onAdLoaded() {
            o1.b b2 = o1.b();
            p1 p1Var = p1.this;
            b2.n((r1) p1Var.f16568a, p1Var);
        }

        public final void onAdShowFailed() {
            o1.b b2 = o1.b();
            p1 p1Var = p1.this;
            b2.b((r1) p1Var.f16568a, p1Var, (l2) null, LoadingError.ShowFailed);
        }

        public final void onAdShown() {
            o1.b b2 = o1.b();
            p1 p1Var = p1.this;
            b2.j((r1) p1Var.f16568a, p1Var, (l2) null);
        }

        public final void printError(String str, Object obj) {
            p1 p1Var = p1.this;
            ((r1) p1Var.f16568a).a((l) p1Var, str, obj);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            o1.b b2 = o1.b();
            p1 p1Var = p1.this;
            b2.a((r) (r1) p1Var.f16568a, (l) p1Var, (l2) null, unifiedAdCallbackClickTrackListener);
        }
    }

    public final UnifiedAdParams a(int i) {
        return new b();
    }
}
