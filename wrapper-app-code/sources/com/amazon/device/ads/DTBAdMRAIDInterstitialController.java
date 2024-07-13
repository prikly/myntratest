package com.amazon.device.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebViewClient;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.Map;
import org.json.JSONException;

class DTBAdMRAIDInterstitialController extends DTBAdMRAIDController implements DTBAdViewDisplayListener {
    DTBAdInterstitialListener interstitialListener;
    boolean pageDisplayed = false;
    boolean pageLoaded = false;

    /* access modifiers changed from: protected */
    public String getPlacementType() {
        return "interstitial";
    }

    DTBAdMRAIDInterstitialController(DTBAdView dTBAdView, DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(dTBAdView);
        this.interstitialListener = dTBAdInterstitialListener;
    }

    /* access modifiers changed from: package-private */
    public DTBAdInterstitialListener getInterstitialListener() {
        return this.interstitialListener;
    }

    /* access modifiers changed from: package-private */
    public void setInterstitialListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        this.interstitialListener = dTBAdInterstitialListener;
    }

    /* access modifiers changed from: protected */
    public void onPageLoad() {
        this.pageLoaded = true;
        try {
            initializeOnLoadAndDisplay();
            if (this.interstitialListener != null) {
                this.interstitialListener.onAdLoaded(this.adView);
            }
            if (DTBMetricsConfiguration.getInstance().isFeatureEnabled("additional_webview_metric")) {
                StringBuilder sb = new StringBuilder("Creative Rendering finish");
                if (!DtbCommonUtils.isNullOrEmpty(getAdView().getBidId())) {
                    sb.append(String.format(" interstitialCreativeBidId = %s", new Object[]{getAdView().getBidId()}));
                }
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, sb.toString());
            }
        } catch (JSONException e2) {
            DtbLog.error("Error:" + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void initializeOnLoadAndDisplay() throws JSONException {
        if (!this.pageLoaded || !this.pageDisplayed) {
            createLoadReport();
        } else {
            prepareMraid();
        }
    }

    public void onInitialDisplay() {
        this.pageDisplayed = true;
        try {
            initializeOnLoadAndDisplay();
        } catch (JSONException e2) {
            DtbLog.error("JSON exception:" + e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void onMRAIDClose() {
        executeClose("close");
    }

    private void executeClose(String str) {
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        commandCompleted(str);
        setState(MraidStateType.HIDDEN);
        fireViewableChange(false);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                DTBAdMRAIDInterstitialController.this.lambda$executeClose$0$DTBAdMRAIDInterstitialController();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: cleanOnCloseHandler */
    public void lambda$executeClose$0$DTBAdMRAIDInterstitialController() {
        try {
            if (this.adView != null) {
                this.adView.setWebViewClient((WebViewClient) null);
                this.adView.removeAllViews();
                this.adView.cleanup();
                if (this.interstitialListener != null) {
                    this.interstitialListener.onAdClosed(this.adView);
                }
            }
            Activity currentActivity = ActivityMonitor.getInstance().getCurrentActivity();
            if (this.useCustomClose && !currentActivity.isFinishing() && (currentActivity instanceof DTBInterstitialActivity)) {
                DTBInterstitialActivity dTBInterstitialActivity = (DTBInterstitialActivity) currentActivity;
                dTBInterstitialActivity.cleanup();
                dTBInterstitialActivity.finish();
            }
        } catch (RuntimeException e2) {
            DtbLog.error(LOG_TAG, "Failed to execute cleanOnCloseHandler method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to execute cleanOnCloseHandler method", e2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMRAIDUnload() {
        executeClose("unload");
    }

    /* access modifiers changed from: protected */
    public void onResize(Map<String, Object> map) {
        fireErrorEvent("resize", "invalid placement type");
        commandCompleted("resize");
    }

    /* access modifiers changed from: protected */
    public void expand(Map<String, Object> map) {
        fireErrorEvent("expand", "invalid placement type for interstitial ");
        commandCompleted("expand");
    }

    /* access modifiers changed from: protected */
    public void onAdOpened(DTBAdView dTBAdView) {
        DTBAdInterstitialListener dTBAdInterstitialListener = this.interstitialListener;
        if (dTBAdInterstitialListener != null) {
            dTBAdInterstitialListener.onAdOpen(this.adView);
        }
    }

    /* access modifiers changed from: protected */
    public void onAdClicked() {
        if (this.interstitialListener != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    DTBAdMRAIDInterstitialController.this.lambda$onAdClicked$1$DTBAdMRAIDInterstitialController();
                }
            });
        }
    }

    public /* synthetic */ void lambda$onAdClicked$1$DTBAdMRAIDInterstitialController() {
        this.interstitialListener.onAdClicked(this.adView);
    }

    /* access modifiers changed from: package-private */
    public void passLoadError() {
        this.interstitialListener.onAdFailed(this.adView);
    }

    /* access modifiers changed from: protected */
    public void onAdLeftApplication() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                DTBAdMRAIDInterstitialController.this.lambda$onAdLeftApplication$2$DTBAdMRAIDInterstitialController();
            }
        });
        ActivityMonitor.getInstance().setActivityListener(this);
    }

    public /* synthetic */ void lambda$onAdLeftApplication$2$DTBAdMRAIDInterstitialController() {
        this.interstitialListener.onAdLeftApplication(this.adView);
    }

    public void onActivityResumed(Activity activity) {
        ActivityMonitor.getInstance().setActivityListener((DTBActivityListener) null);
    }

    public void onActivityDestroyed(Activity activity) {
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        ActivityMonitor.getInstance().setActivityListener((DTBActivityListener) null);
    }

    /* access modifiers changed from: protected */
    public void impressionFired() {
        this.interstitialListener.onImpressionFired(this.adView);
        super.impressionFired();
    }

    /* access modifiers changed from: protected */
    public void onVideoCompleted() {
        this.interstitialListener.onVideoCompleted(this.adView);
    }
}
