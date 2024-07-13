package io.bidmachine.measurer;

import android.view.View;
import android.view.ViewGroup;
import com.explorestack.iab.measurer.AdMeasurer;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSession;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.lang.ref.WeakReference;

public abstract class OMSDKAdMeasurer<AdView extends View> implements AdMeasurer<AdView> {
    private static final String TAG = "AdMeasurer";
    /* access modifiers changed from: private */
    public AdEvents adEvents;
    /* access modifiers changed from: private */
    public AdSession adSession;
    /* access modifiers changed from: private */
    public WeakReference<View> adViewWeak;

    /* access modifiers changed from: protected */
    public abstract void onAdLoaded(AdEvents adEvents2) throws Throwable;

    public void registerAdView(AdView adview) {
    }

    public void registerAdContainer(final ViewGroup viewGroup) {
        Utils.onUiThread(new Runnable() {
            public void run() {
                try {
                    if (OMSDKAdMeasurer.this.adSession != null) {
                        OMSDKAdMeasurer.this.registerAdView(OMSDKAdMeasurer.this.adSession, viewGroup);
                    } else {
                        WeakReference unused = OMSDKAdMeasurer.this.adViewWeak = new WeakReference(viewGroup);
                    }
                } catch (Throwable th) {
                    Logger.log(th);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public boolean isSessionPrepared() {
        return this.adSession != null;
    }

    /* access modifiers changed from: protected */
    public void prepareAdSession(AdSession adSession2) {
        try {
            this.adSession = adSession2;
            this.adEvents = AdEvents.createAdEvents(adSession2);
            registerViews(adSession2);
            adSession2.start();
            onAdLoaded(this.adEvents);
            log("prepareAdSession");
        } catch (Throwable th) {
            Logger.log(th);
        }
    }

    private void registerViews(AdSession adSession2) throws Throwable {
        WeakReference<View> weakReference = this.adViewWeak;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            registerAdView(adSession2, view);
        }
        this.adViewWeak = null;
    }

    /* access modifiers changed from: private */
    public void registerAdView(AdSession adSession2, View view) throws Throwable {
        adSession2.registerAdView(view);
        log("registerAdView");
    }

    public void onAdShown() {
        Utils.onUiThread(new Runnable() {
            public void run() {
                try {
                    if (OMSDKAdMeasurer.this.adEvents != null) {
                        OMSDKAdMeasurer.this.adEvents.impressionOccurred();
                    }
                    OMSDKAdMeasurer.this.log("onAdShown");
                } catch (Throwable th) {
                    Logger.log(th);
                }
            }
        });
    }

    public void destroy() {
        Utils.onUiThread(new Runnable() {
            public void run() {
                try {
                    AdEvents unused = OMSDKAdMeasurer.this.adEvents = null;
                    if (OMSDKAdMeasurer.this.adSession != null) {
                        OMSDKAdMeasurer.this.adSession.finish();
                    }
                    OMSDKAdMeasurer.this.log("destroy");
                } catch (Throwable th) {
                    Logger.log(th);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void log(String str) {
        Logger.log(TAG, str);
    }
}
