package com.appodeal.ads;

import android.os.Bundle;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.o4;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;

public final class m4 extends j1<n4, UnifiedRewarded, UnifiedRewardedParams, UnifiedRewardedCallback> {

    public static class b implements UnifiedRewardedParams {
        public final int getAfd() {
            return o4.a().q;
        }

        public final int getMaxDuration() {
            return o4.f17014b;
        }

        public final String obtainPlacementId() {
            return g.a(o4.a().l);
        }

        public final String obtainSegmentId() {
            return o4.a().r().toString();
        }
    }

    public m4(n4 n4Var, AdNetwork adNetwork, d0 d0Var) {
        super(n4Var, adNetwork, d0Var);
    }

    public final UnifiedAd a(AdNetwork adNetwork) {
        return adNetwork.createRewarded();
    }

    public final UnifiedAdCallback c() {
        return new a();
    }

    public final LoadingError l() {
        if (this.f16569b.isRewardedShowing()) {
            return LoadingError.Canceled;
        }
        return null;
    }

    public final class a extends UnifiedRewardedCallback {
        public a() {
        }

        public final void onAdClicked() {
            o4.c b2 = o4.b();
            m4 m4Var = m4.this;
            b2.a((r) (n4) m4Var.f16568a, (l) m4Var, (l2) null, (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdClosed() {
            o4.c b2 = o4.b();
            m4 m4Var = m4.this;
            b2.b((r) (n4) m4Var.f16568a, (j1) m4Var);
        }

        public final void onAdExpired() {
            o4.c b2 = o4.b();
            m4 m4Var = m4.this;
            b2.e((n4) m4Var.f16568a, m4Var);
        }

        public final void onAdFinished() {
            o4.c b2 = o4.b();
            m4 m4Var = m4.this;
            b2.i((n4) m4Var.f16568a, m4Var, (l2) null);
        }

        public final void onAdInfoRequested(Bundle bundle) {
            m4.this.a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            o4.c b2 = o4.b();
            m4 m4Var = m4.this;
            b2.a((n4) m4Var.f16568a, m4Var, loadingError);
        }

        public final void onAdLoaded() {
            o4.c b2 = o4.b();
            m4 m4Var = m4.this;
            b2.n((n4) m4Var.f16568a, m4Var);
        }

        public final void onAdShowFailed() {
            o4.c b2 = o4.b();
            m4 m4Var = m4.this;
            b2.b((n4) m4Var.f16568a, m4Var, (l2) null, LoadingError.ShowFailed);
        }

        public final void onAdShown() {
            o4.c b2 = o4.b();
            m4 m4Var = m4.this;
            b2.j((n4) m4Var.f16568a, m4Var, (l2) null);
        }

        public final void printError(String str, Object obj) {
            m4 m4Var = m4.this;
            ((n4) m4Var.f16568a).a((l) m4Var, str, obj);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            o4.c b2 = o4.b();
            m4 m4Var = m4.this;
            b2.a((r) (n4) m4Var.f16568a, (l) m4Var, (l2) null, unifiedAdCallbackClickTrackListener);
        }
    }

    public final UnifiedAdParams a(int i) {
        return new b();
    }
}
