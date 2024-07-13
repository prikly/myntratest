package com.appodeal.ads;

import android.os.Bundle;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;
import com.appodeal.ads.w2;

public final class o5 extends j1<q5, UnifiedVideo, UnifiedVideoParams, UnifiedVideoCallback> {

    public static final class b implements UnifiedVideoParams {
        public final int getAfd() {
            return w2.a().q;
        }

        public final String obtainPlacementId() {
            return g.a(w2.a().l);
        }

        public final String obtainSegmentId() {
            return w2.a().r().toString();
        }
    }

    public o5(q5 q5Var, AdNetwork adNetwork, d0 d0Var) {
        super(q5Var, adNetwork, d0Var);
    }

    public final UnifiedAd a(AdNetwork adNetwork) {
        return adNetwork.createVideo();
    }

    public final UnifiedAdCallback c() {
        return new a();
    }

    public final LoadingError l() {
        if (this.f16569b.isVideoShowing()) {
            return LoadingError.Canceled;
        }
        return null;
    }

    public final class a extends UnifiedVideoCallback {
        public a() {
        }

        public final void onAdClicked() {
            w2.c b2 = w2.b();
            o5 o5Var = o5.this;
            b2.a((r) (q5) o5Var.f16568a, (l) o5Var, (l2) null, (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdClosed() {
            w2.c b2 = w2.b();
            o5 o5Var = o5.this;
            b2.b((r) (q5) o5Var.f16568a, (j1) o5Var);
        }

        public final void onAdExpired() {
            w2.c b2 = w2.b();
            o5 o5Var = o5.this;
            b2.e((q5) o5Var.f16568a, o5Var);
        }

        public final void onAdFinished() {
            w2.c b2 = w2.b();
            o5 o5Var = o5.this;
            b2.i((q5) o5Var.f16568a, o5Var, (l2) null);
        }

        public final void onAdInfoRequested(Bundle bundle) {
            o5.this.a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            w2.c b2 = w2.b();
            o5 o5Var = o5.this;
            b2.a((q5) o5Var.f16568a, o5Var, loadingError);
        }

        public final void onAdLoaded() {
            w2.c b2 = w2.b();
            o5 o5Var = o5.this;
            b2.n((q5) o5Var.f16568a, o5Var);
        }

        public final void onAdShowFailed() {
            w2.c b2 = w2.b();
            o5 o5Var = o5.this;
            b2.b((q5) o5Var.f16568a, o5Var, (l2) null, LoadingError.ShowFailed);
        }

        public final void onAdShown() {
            w2.c b2 = w2.b();
            o5 o5Var = o5.this;
            b2.j((q5) o5Var.f16568a, o5Var, (l2) null);
        }

        public final void printError(String str, Object obj) {
            o5 o5Var = o5.this;
            ((q5) o5Var.f16568a).a((l) o5Var, str, obj);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            w2.c b2 = w2.b();
            o5 o5Var = o5.this;
            b2.a((r) (q5) o5Var.f16568a, (l) o5Var, (l2) null, unifiedAdCallbackClickTrackListener);
        }
    }

    public final UnifiedAdParams a(int i) {
        return new b();
    }
}
