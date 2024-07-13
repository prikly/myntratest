package io.bidmachine.ads.networks.notsy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import io.bidmachine.ads.networks.notsy.InternalNotsyAd;
import io.bidmachine.utils.BMError;

class InternalNotsyBannerAd extends InternalNotsyAd {
    private AdManagerAdView adView;

    InternalNotsyBannerAd(InternalNotsyAdUnit internalNotsyAdUnit) {
        super(internalNotsyAdUnit);
    }

    public void loadAd(Context context, InternalLoadListener internalLoadListener) throws Throwable {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.adView = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.adView.setAdUnitId(getAdUnitId());
        this.adView.setAdListener(new Listener(this, internalLoadListener, (AnonymousClass1) null));
        int i = AnonymousClass1.$SwitchMap$io$bidmachine$AdsFormat[getAdsFormat().ordinal()];
        if (i == 1) {
            this.adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
        } else if (i != 2) {
            this.adView.setAdSize(AdSize.BANNER);
        } else {
            this.adView.setAdSize(AdSize.LEADERBOARD);
        }
        this.adView.loadAd(createAdManagerAdRequest());
    }

    /* renamed from: io.bidmachine.ads.networks.notsy.InternalNotsyBannerAd$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$AdsFormat;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.bidmachine.AdsFormat[] r0 = io.bidmachine.AdsFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$bidmachine$AdsFormat = r0
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Banner_300x250     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Banner_728x90     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.ads.networks.notsy.InternalNotsyBannerAd.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public View getAdView() {
        return this.adView;
    }

    /* access modifiers changed from: protected */
    public void destroyAd() throws Throwable {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.adView = null;
        }
    }

    private static final class Listener extends AdListener {
        private final InternalNotsyAd internalNotsyAd;
        private final InternalLoadListener loadListener;

        public void onAdClosed() {
        }

        public void onAdOpened() {
        }

        /* synthetic */ Listener(InternalNotsyAd internalNotsyAd2, InternalLoadListener internalLoadListener, AnonymousClass1 r3) {
            this(internalNotsyAd2, internalLoadListener);
        }

        private Listener(InternalNotsyAd internalNotsyAd2, InternalLoadListener internalLoadListener) {
            this.internalNotsyAd = internalNotsyAd2;
            this.loadListener = internalLoadListener;
        }

        public void onAdLoaded() {
            this.internalNotsyAd.setStatus(InternalNotsyAd.Status.Loaded);
            this.loadListener.onAdLoaded(this.internalNotsyAd);
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.loadListener.onAdLoadFailed(this.internalNotsyAd, BMError.noFill());
        }

        public void onAdImpression() {
            NotsyLoader.onNotsyAdShown(this.internalNotsyAd);
            this.internalNotsyAd.setStatus(InternalNotsyAd.Status.Shown);
            if (this.internalNotsyAd.getAdPresentListener() != null) {
                this.internalNotsyAd.getAdPresentListener().onAdShown();
            }
        }

        public void onAdClicked() {
            if (this.internalNotsyAd.getAdPresentListener() != null) {
                this.internalNotsyAd.getAdPresentListener().onAdClicked();
            }
        }
    }
}
