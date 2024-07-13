package com.appodeal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.appodeal.ads.h2;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import java.util.HashMap;

public final class j2 extends r5<k2, UnifiedMrec, UnifiedMrecParams, UnifiedMrecCallback> {

    public static final class b implements UnifiedMrecParams {
        public final String obtainPlacementId() {
            return g.a(h2.a().l);
        }

        public final String obtainSegmentId() {
            return h2.a().r().toString();
        }
    }

    public j2(k2 k2Var, AdNetwork adNetwork, d0 d0Var) {
        super(k2Var, adNetwork, d0Var);
    }

    public final UnifiedAd a(AdNetwork adNetwork) {
        return adNetwork.createMrec();
    }

    public final int b(Context context) {
        HashMap hashMap = f1.f16398a;
        return Math.round(TypedValue.applyDimension(1, 300.0f, context.getResources().getDisplayMetrics()));
    }

    public final UnifiedAdCallback c() {
        return new a();
    }

    public final class a extends UnifiedMrecCallback {
        public a() {
        }

        public final void onAdClicked() {
            h2.c b2 = h2.b();
            j2 j2Var = j2.this;
            b2.a((r) (k2) j2Var.f16568a, (l) j2Var, (l2) null, (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdExpired() {
            h2.c b2 = h2.b();
            j2 j2Var = j2.this;
            b2.e((k2) j2Var.f16568a, j2Var);
        }

        public final void onAdInfoRequested(Bundle bundle) {
            j2.this.a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            h2.c b2 = h2.b();
            j2 j2Var = j2.this;
            b2.a((k2) j2Var.f16568a, j2Var, loadingError);
        }

        public final void onAdLoaded(View view) {
            j2.this.s = view;
            h2.c b2 = h2.b();
            j2 j2Var = j2.this;
            b2.n((k2) j2Var.f16568a, j2Var);
        }

        public final void onAdShowFailed() {
            h2.c b2 = h2.b();
            j2 j2Var = j2.this;
            b2.b((k2) j2Var.f16568a, j2Var, (l2) null, LoadingError.ShowFailed);
        }

        public final void printError(String str, Object obj) {
            j2 j2Var = j2.this;
            ((k2) j2Var.f16568a).a((l) j2Var, str, obj);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            h2.c b2 = h2.b();
            j2 j2Var = j2.this;
            b2.a((r) (k2) j2Var.f16568a, (l) j2Var, (l2) null, unifiedAdCallbackClickTrackListener);
        }
    }

    public final UnifiedAdParams a(int i) {
        return new b();
    }

    public final int a(Context context) {
        HashMap hashMap = f1.f16398a;
        return Math.round(TypedValue.applyDimension(1, 250.0f, context.getResources().getDisplayMetrics()));
    }
}
