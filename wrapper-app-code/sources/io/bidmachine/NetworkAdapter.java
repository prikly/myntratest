package io.bidmachine;

import android.content.Context;
import android.os.Build;
import io.bidmachine.core.AdapterLogger;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedNativeAd;
import io.bidmachine.unified.UnifiedRichMediaAd;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class NetworkAdapter {
    final int adapterMinDeviceApiVersion;
    private final String adapterVersion;
    /* access modifiers changed from: private */
    public final Set<InternalNetworkInitializationCallback> initializeCallbackSet = new CopyOnWriteArraySet();
    /* access modifiers changed from: private */
    public final AtomicBoolean isInitialized = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final AtomicBoolean isInitializing = new AtomicBoolean(false);
    private final String key;
    private final String sdkVersion;
    private final AdsType[] supportedTypes;

    public void clearAuction(NetworkAdUnit networkAdUnit) throws Throwable {
    }

    /* access modifiers changed from: protected */
    public abstract boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable;

    public void onLossAuction(NetworkAdUnit networkAdUnit) throws Throwable {
    }

    /* access modifiers changed from: protected */
    public abstract void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable;

    public void onWinAuction(NetworkAdUnit networkAdUnit) throws Throwable {
    }

    public void setLogging(boolean z) throws Throwable {
    }

    protected NetworkAdapter(String str, String str2, String str3, int i, AdsType[] adsTypeArr) {
        this.key = str;
        this.sdkVersion = str2;
        this.adapterVersion = str3;
        this.adapterMinDeviceApiVersion = i;
        this.supportedTypes = adsTypeArr;
    }

    public String getKey() {
        return this.key;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getAdapterVersion() {
        return this.adapterVersion;
    }

    /* access modifiers changed from: package-private */
    public AdsType[] getSupportedTypes() {
        return this.supportedTypes;
    }

    public final void initialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, InternalNetworkInitializationCallback internalNetworkInitializationCallback) throws Throwable {
        int i = Build.VERSION.SDK_INT;
        int i2 = this.adapterMinDeviceApiVersion;
        if (i < i2) {
            internalNetworkInitializationCallback.onFail(this, String.format("minSdkVersion is %s", new Object[]{Integer.valueOf(i2)}));
        } else if (isInitialized(contextProvider)) {
            internalNetworkInitializationCallback.onSuccess(this);
        } else {
            this.initializeCallbackSet.add(internalNetworkInitializationCallback);
            if (this.isInitializing.compareAndSet(false, true)) {
                onNetworkInitialize(contextProvider, initializationParams, networkConfigParams, new NetworkInitializationCallback() {
                    public void onSuccess() {
                        NetworkAdapter.this.isInitialized.set(true);
                        NetworkAdapter.this.isInitializing.set(false);
                        for (InternalNetworkInitializationCallback onSuccess : NetworkAdapter.this.initializeCallbackSet) {
                            onSuccess.onSuccess(NetworkAdapter.this);
                        }
                        NetworkAdapter.this.initializeCallbackSet.clear();
                    }

                    public void onFail(String str) {
                        NetworkAdapter.this.isInitialized.set(false);
                        NetworkAdapter.this.isInitializing.set(false);
                        for (InternalNetworkInitializationCallback onFail : NetworkAdapter.this.initializeCallbackSet) {
                            onFail.onFail(NetworkAdapter.this, str);
                        }
                        NetworkAdapter.this.initializeCallbackSet.clear();
                    }
                });
            }
        }
    }

    public final boolean isInitialized(Context context) {
        return isInitialized((ContextProvider) new SimpleContextProvider(context));
    }

    public final boolean isInitialized(ContextProvider contextProvider) {
        if (this.isInitialized.get()) {
            return true;
        }
        try {
            boolean isNetworkInitialized = isNetworkInitialized(contextProvider);
            this.isInitialized.compareAndSet(false, isNetworkInitialized);
            return isNetworkInitialized;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean isInitializing() {
        return this.isInitializing.get();
    }

    public UnifiedBannerAd createBanner() {
        throw new IllegalArgumentException(getKey() + " adapter does not support banner");
    }

    public UnifiedRichMediaAd createRichMedia() {
        throw new IllegalArgumentException(getKey() + " adapter does not support rich media");
    }

    public UnifiedFullscreenAd createInterstitial() {
        throw new IllegalArgumentException(getKey() + " adapter does not support static interstitial");
    }

    public UnifiedFullscreenAd createRewarded() {
        throw new IllegalArgumentException(getKey() + " adapter does not support rewarded interstitial");
    }

    public UnifiedNativeAd createNativeAd() {
        throw new IllegalArgumentException(getKey() + " adapter does not support native ads");
    }

    public boolean isAdsTypeSupported(AdsType adsType) {
        for (AdsType adsType2 : this.supportedTypes) {
            if (adsType2 == adsType) {
                return true;
            }
        }
        return false;
    }

    public final void logMessage(String str) {
        AdapterLogger.logMessage(getKey(), str);
    }

    public final void logError(String str) {
        AdapterLogger.logError(getKey(), str);
    }

    public final void logThrowable(Throwable th) {
        AdapterLogger.logThrowable(th);
    }
}
