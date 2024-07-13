package com.amazon.device.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DTBAdInterstitial {
    protected static final String INTERSTITIAL_CACHE_KEY = "INTERSTITIAL_CACHE_KEY";
    private static final String LOG_TAG = DTBAdInterstitial.class.getSimpleName();
    private static Map<Integer, DTBAdInterstitial> dtbAdInterstitialCache = Collections.synchronizedMap(new HashMap());
    DTBAdView adView;
    private Context context;

    /* access modifiers changed from: package-private */
    public DTBAdView getAdView() {
        return this.adView;
    }

    private static int putInCache(DTBAdInterstitial dTBAdInterstitial) {
        dtbAdInterstitialCache.put(Integer.valueOf(dTBAdInterstitial.hashCode()), dTBAdInterstitial);
        return dTBAdInterstitial.hashCode();
    }

    static void removeFromCache(int i) {
        dtbAdInterstitialCache.remove(Integer.valueOf(i));
    }

    static DTBAdInterstitial getFromCache(int i) {
        if (!dtbAdInterstitialCache.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return dtbAdInterstitialCache.get(Integer.valueOf(i));
    }

    public DTBAdInterstitial(Context context2, DTBAdInterstitialListener dTBAdInterstitialListener) {
        try {
            this.context = context2;
            this.adView = new DTBAdView(context2, dTBAdInterstitialListener);
        } catch (RuntimeException e2) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBAdInterstitial class");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdInterstitial class", e2);
        }
    }

    private DTBAdMRAIDInterstitialController getInterstitialController() {
        return (DTBAdMRAIDInterstitialController) this.adView.getController();
    }

    private DTBAdInterstitialListener getInterstitialListener() {
        return getInterstitialController().getInterstitialListener();
    }

    /* access modifiers changed from: package-private */
    public void setListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        getInterstitialController().setInterstitialListener(dTBAdInterstitialListener);
    }

    public void fetchAd(Map<String, Object> map) {
        this.adView.fetchAd(map);
    }

    public void fetchAd(Bundle bundle) {
        try {
            this.adView.fetchAd(bundle.getString(DTBAdView.BID_HTML, ""), bundle);
        } catch (RuntimeException e2) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with bundle argument");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with extraData argument", e2);
        }
    }

    public void fetchAd(String str) {
        try {
            this.adView.fetchAd(str);
        } catch (RuntimeException e2) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with bundle argument");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with adHtml argument", e2);
        }
    }

    public void fetchAd(String str, Bundle bundle) {
        try {
            this.adView.fetchAd(str, bundle);
        } catch (RuntimeException e2) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with adHtml and bundle argument");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with adHtml and  bundle argument", e2);
        }
    }

    public void show() {
        try {
            if (getInterstitialController() == null) {
                DtbLog.error(LOG_TAG, "Fail to show the interstitial ad");
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "There is no controller before showing the interstitial ad");
                return;
            }
            Intent intent = new Intent(this.context, DTBInterstitialActivity.class);
            intent.putExtra(INTERSTITIAL_CACHE_KEY, putInCache(this));
            startOMSDKSession();
            this.context.startActivity(intent);
        } catch (RuntimeException e2) {
            DtbLog.error(LOG_TAG, "Fail to execute show method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute show method", e2);
        }
    }

    public static int getWidth(Context context2) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context2.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        } catch (RuntimeException e2) {
            DtbLog.error(LOG_TAG, "Fail to execute getWidth method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getWidth method", e2);
            return 0;
        }
    }

    private void startOMSDKSession() {
        try {
            DtbOmSdkSessionManager dtbOmSdkSessionManager = getInterstitialController().getDtbOmSdkSessionManager();
            if (!getAdView().isVideo()) {
                dtbOmSdkSessionManager.initHtmlDisplayOmAdSession(getAdView(), "https://c.amazon-adsystem.com/");
            } else {
                dtbOmSdkSessionManager.initJavaScriptOmAdSession(getAdView(), "https://c.amazon-adsystem.com/");
            }
            dtbOmSdkSessionManager.registerAdView(getAdView());
            dtbOmSdkSessionManager.startAdSession();
            dtbOmSdkSessionManager.displayAdEventLoaded();
        } catch (RuntimeException e2) {
            DtbLog.error(LOG_TAG, "Unable to start OM SDK session for Interstitial ad");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Unable to start OM SDK session for Interstitial ad", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void onAdClosed() {
        DTBAdInterstitialListener interstitialListener = getInterstitialListener();
        if (interstitialListener != null) {
            interstitialListener.onAdClosed(this.adView);
        }
    }
}
