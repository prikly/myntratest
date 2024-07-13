package io.bidmachine.ads.networks.notsy;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import io.bidmachine.AdsFormat;
import io.bidmachine.core.AdapterLogger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.BMError;
import java.lang.ref.WeakReference;
import java.util.Map;

abstract class InternalNotsyAd {
    private final InternalNotsyAdUnit adUnit;
    private Status status = Status.Idle;
    private final Object statusLock = new Object();
    private WeakReference<InternalNotsyAdPresentListener> weakAdPresentListener;

    enum Status {
        Idle,
        Loading,
        Loaded,
        Showing,
        Shown
    }

    /* access modifiers changed from: protected */
    public abstract void destroyAd() throws Throwable;

    /* access modifiers changed from: protected */
    public abstract void loadAd(Context context, InternalLoadListener internalLoadListener) throws Throwable;

    InternalNotsyAd(InternalNotsyAdUnit internalNotsyAdUnit) {
        this.adUnit = internalNotsyAdUnit;
    }

    public void setAdPresentListener(InternalNotsyAdPresentListener internalNotsyAdPresentListener) {
        this.weakAdPresentListener = new WeakReference<>(internalNotsyAdPresentListener);
    }

    public void destroy() {
        Utils.onUiThread(new Runnable() {
            public final void run() {
                InternalNotsyAd.this.lambda$destroy$0$InternalNotsyAd();
            }
        });
    }

    public /* synthetic */ void lambda$destroy$0$InternalNotsyAd() {
        try {
            if (this.weakAdPresentListener != null) {
                this.weakAdPresentListener.clear();
                this.weakAdPresentListener = null;
            }
            NotsyLoader.onNotsyAdDestroy(this, this.status == Status.Shown);
        } catch (Throwable th) {
            AdapterLogger.logThrowable(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final void load(Context context, InternalLoadListener internalLoadListener) {
        Utils.onUiThread(new Runnable(context.getApplicationContext(), internalLoadListener) {
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ InternalLoadListener f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                InternalNotsyAd.this.lambda$load$1$InternalNotsyAd(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$load$1$InternalNotsyAd(Context context, InternalLoadListener internalLoadListener) {
        try {
            setStatus(Status.Loading);
            loadAd(context, internalLoadListener);
        } catch (Throwable th) {
            AdapterLogger.logThrowable(th);
            internalLoadListener.onAdLoadFailed(this, BMError.internal("Exception when loading ad object"));
        }
    }

    /* access modifiers changed from: package-private */
    public InternalNotsyAdUnit getAdUnit() {
        return this.adUnit;
    }

    /* access modifiers changed from: package-private */
    public AdsFormat getAdsFormat() {
        return this.adUnit.getAdsFormat();
    }

    /* access modifiers changed from: package-private */
    public InternalNotsyData getInternalNotsyData() {
        return getAdUnit().getInternalNotsyData();
    }

    /* access modifiers changed from: package-private */
    public String getAdUnitId() {
        return getInternalNotsyData().getAdUnitId();
    }

    /* access modifiers changed from: package-private */
    public float getScope() {
        return getInternalNotsyData().getScore();
    }

    /* access modifiers changed from: package-private */
    public InternalNotsyAdPresentListener getAdPresentListener() {
        return (InternalNotsyAdPresentListener) this.weakAdPresentListener.get();
    }

    /* access modifiers changed from: package-private */
    public void setStatus(Status status2) {
        synchronized (this.statusLock) {
            this.status = status2;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isLoaded() {
        boolean z;
        synchronized (this.statusLock) {
            z = this.status == Status.Loaded;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public AdManagerAdRequest createAdManagerAdRequest() {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry next : this.adUnit.getCustomTargeting().entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                builder.addCustomTargeting(str, str2);
            }
        }
        return builder.build();
    }

    static class Factory {
        Factory() {
        }

        static InternalNotsyAd create(InternalNotsyAdUnit internalNotsyAdUnit) {
            switch (AnonymousClass1.$SwitchMap$io$bidmachine$AdsFormat[internalNotsyAdUnit.getAdsFormat().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return new InternalNotsyBannerAd(internalNotsyAdUnit);
                case 5:
                case 6:
                case 7:
                    return new InternalNotsyInterstitialAd(internalNotsyAdUnit);
                case 8:
                case 9:
                case 10:
                    return new InternalNotsyRewardedAd(internalNotsyAdUnit);
                default:
                    return null;
            }
        }
    }

    /* renamed from: io.bidmachine.ads.networks.notsy.InternalNotsyAd$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$AdsFormat;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.bidmachine.AdsFormat[] r0 = io.bidmachine.AdsFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$bidmachine$AdsFormat = r0
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Banner     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Banner_320x50     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Banner_728x90     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Banner_300x250     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x003e }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Interstitial     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.InterstitialStatic     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.InterstitialVideo     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Rewarded     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x006c }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.RewardedStatic     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.RewardedVideo     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.ads.networks.notsy.InternalNotsyAd.AnonymousClass1.<clinit>():void");
        }
    }
}
