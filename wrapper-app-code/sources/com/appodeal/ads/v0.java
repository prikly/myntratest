package com.appodeal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.t0;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import java.util.HashMap;

public final class v0 extends r5<w0, UnifiedBanner, UnifiedBannerParams, UnifiedBannerCallback> {
    @Deprecated
    public int t;
    public int u = -1;

    public static class b implements UnifiedBannerParams {
        public final int getMaxHeight(Context context) {
            return ((t0.f17414b || t0.f17415c) && f1.m(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext()) > 720.0f) ? 90 : 50;
        }

        public final int getMaxWidth(Context context) {
            int round = Math.round(f1.p(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext()));
            if (t0.f17414b) {
                return round;
            }
            return (!t0.f17415c || round < 728) ? 320 : 728;
        }

        public final boolean needLeaderBoard(Context context) {
            return t0.a(context);
        }

        public final String obtainPlacementId() {
            return g.a(t0.a().l);
        }

        public final String obtainSegmentId() {
            return t0.a().r().toString();
        }

        public final boolean useSmartBanners(Context context) {
            return t0.f17414b;
        }
    }

    public v0(w0 w0Var, AdNetwork adNetwork, d0 d0Var) {
        super(w0Var, adNetwork, d0Var);
    }

    public final UnifiedAd a(AdNetwork adNetwork) {
        return adNetwork.createBanner();
    }

    public final int b(Context context) {
        if (t0.f17414b && this.f16569b.isSupportSmartBanners()) {
            return -1;
        }
        if (t0.a(context)) {
            HashMap hashMap = f1.f16398a;
            return Math.round(TypedValue.applyDimension(1, 728.0f, context.getResources().getDisplayMetrics()));
        }
        HashMap hashMap2 = f1.f16398a;
        return Math.round(TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
    }

    public final UnifiedAdCallback c() {
        return new a();
    }

    public final int m() {
        return this.t;
    }

    public class a extends UnifiedBannerCallback {
        public a() {
        }

        public final void onAdClicked() {
            t0.c b2 = t0.b();
            v0 v0Var = v0.this;
            b2.a((r) (w0) v0Var.f16568a, (l) v0Var, (l2) null, (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdExpired() {
            t0.c b2 = t0.b();
            v0 v0Var = v0.this;
            b2.e((w0) v0Var.f16568a, v0Var);
        }

        public final void onAdInfoRequested(Bundle bundle) {
            v0.this.a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            t0.c b2 = t0.b();
            v0 v0Var = v0.this;
            b2.a((w0) v0Var.f16568a, v0Var, loadingError);
        }

        public final void onAdLoaded(View view, int i, int i2) {
            v0 v0Var = v0.this;
            v0Var.s = view;
            v0Var.t = i2;
            v0Var.u = view.getResources().getConfiguration().orientation;
            t0.c b2 = t0.b();
            v0 v0Var2 = v0.this;
            b2.n((w0) v0Var2.f16568a, v0Var2);
        }

        public final void onAdShowFailed() {
            t0.c b2 = t0.b();
            v0 v0Var = v0.this;
            b2.b((w0) v0Var.f16568a, v0Var, (l2) null, LoadingError.ShowFailed);
        }

        public final void printError(String str, Object obj) {
            v0 v0Var = v0.this;
            ((w0) v0Var.f16568a).a((l) v0Var, str, obj);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            t0.c b2 = t0.b();
            v0 v0Var = v0.this;
            b2.a((r) (w0) v0Var.f16568a, (l) v0Var, (l2) null, unifiedAdCallbackClickTrackListener);
        }
    }

    public final UnifiedAdParams a(int i) {
        return new b();
    }

    public final int a(Context context) {
        HashMap hashMap = f1.f16398a;
        return Math.round(TypedValue.applyDimension(1, (float) this.t, context.getResources().getDisplayMetrics()));
    }
}
