package io.bidmachine.ads.networks.amazon;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DtbConstants;
import com.amazon.device.ads.MRAIDPolicy;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.banner.BannerAdRequestParameters;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AmazonAdapter extends HeaderBiddingAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    AmazonAdapter() {
        super(BuildConfig.ADAPTER_NAME, BuildConfig.ADAPTER_SDK_VERSION_NAME, BuildConfig.ADAPTER_VERSION_NAME, 19, new AdsType[]{AdsType.Banner, AdsType.Interstitial});
    }

    public void setLogging(boolean z) throws Throwable {
        AdRegistration.enableLogging(z);
    }

    /* access modifiers changed from: protected */
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        return AdRegistration.isInitialized();
    }

    /* access modifiers changed from: protected */
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        Map<String, String> obtainNetworkParams = networkConfigParams.obtainNetworkParams();
        if (obtainNetworkParams == null) {
            networkInitializationCallback.onFail("Network parameters not found");
            return;
        }
        String str = obtainNetworkParams.get("app_key");
        if (TextUtils.isEmpty(str)) {
            networkInitializationCallback.onFail(String.format("%s not provided", new Object[]{"app_key"}));
            return;
        }
        AdRegistration.getInstance(str, contextProvider.getContext().getApplicationContext());
        AdRegistration.setMRAIDSupportedVersions(new String[]{"1.0", DtbConstants.APS_ADAPTER_VERSION_2});
        AdRegistration.setMRAIDPolicy(MRAIDPolicy.CUSTOM);
        configure(initializationParams.isTestMode(), initializationParams.getDataRestrictions());
        networkInitializationCallback.onSuccess();
    }

    /* access modifiers changed from: protected */
    public void onCollectHeaderBiddingParams(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("slot_uuid");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("slot_uuid"));
        } else if (TextUtils.isEmpty(networkAdUnit.getMediationParameter("app_key"))) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("app_key"));
        } else {
            configure(unifiedAdRequestParams.isTestMode(), unifiedAdRequestParams.getDataRestrictions());
            AdsType adsType = headerBiddingAdRequestParams.getAdsType();
            String uSPrivacyString = unifiedAdRequestParams.getDataRestrictions().getUSPrivacyString();
            if (adsType == AdsType.Banner) {
                BannerSize bannerSize = ((BannerAdRequestParameters) unifiedAdRequestParams.getAdRequestParameters()).getBannerSize();
                AmazonLoader.forDisplay(headerBiddingCollectParamsCallback).withUsPrivacy(uSPrivacyString).load(new DTBAdSize(bannerSize.width, bannerSize.height, mediationParameter));
            } else if (adsType != AdsType.Interstitial && adsType != AdsType.Rewarded) {
                headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter("Unsupported ads type"));
            } else if (headerBiddingAdRequestParams.getAdContentType() == AdContentType.Video) {
                DisplayMetrics displayMetrics = contextProvider.getContext().getResources().getDisplayMetrics();
                AmazonLoader.forVideo(headerBiddingCollectParamsCallback).withUsPrivacy(uSPrivacyString).load(new DTBAdSize.DTBVideo(displayMetrics.widthPixels, displayMetrics.heightPixels, mediationParameter));
            } else {
                AmazonLoader.forDisplay(headerBiddingCollectParamsCallback).withUsPrivacy(uSPrivacyString).load(new DTBAdSize.DTBInterstitialAdSize(mediationParameter));
            }
        }
    }

    private void configure(boolean z, DataRestrictions dataRestrictions) {
        AdRegistration.enableTesting(z);
        AdRegistration.useGeoLocation(dataRestrictions.canSendGeoPosition());
    }

    private static abstract class AmazonLoader {
        /* access modifiers changed from: private */
        public final HeaderBiddingCollectParamsCallback collectCallback;
        private String usPrivacy;

        /* access modifiers changed from: package-private */
        public abstract void handleResponse(DTBAdResponse dTBAdResponse, Map<String, String> map);

        /* synthetic */ AmazonLoader(HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback, AnonymousClass1 r2) {
            this(headerBiddingCollectParamsCallback);
        }

        static AmazonLoader forDisplay(HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
            return new AmazonLoader(headerBiddingCollectParamsCallback) {
                /* access modifiers changed from: package-private */
                public void handleResponse(DTBAdResponse dTBAdResponse, Map<String, String> map) {
                    String str;
                    for (Map.Entry next : dTBAdResponse.getDefaultDisplayAdsRequestCustomParams().entrySet()) {
                        List list = (List) next.getValue();
                        if (!(list == null || (str = (String) list.get(0)) == null)) {
                            map.put((String) next.getKey(), str);
                        }
                    }
                }
            };
        }

        static AmazonLoader forVideo(HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
            return new AmazonLoader(headerBiddingCollectParamsCallback) {
                /* access modifiers changed from: package-private */
                public void handleResponse(DTBAdResponse dTBAdResponse, Map<String, String> map) {
                    for (Map.Entry next : dTBAdResponse.getDefaultVideoAdsRequestCustomParams().entrySet()) {
                        String str = (String) next.getValue();
                        if (str != null) {
                            map.put((String) next.getKey(), str);
                        }
                    }
                }
            };
        }

        private AmazonLoader(HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
            this.collectCallback = headerBiddingCollectParamsCallback;
        }

        /* access modifiers changed from: package-private */
        public AmazonLoader withUsPrivacy(String str) {
            this.usPrivacy = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public void load(DTBAdSize dTBAdSize) {
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            dTBAdRequest.setSizes(dTBAdSize);
            if (!TextUtils.isEmpty(this.usPrivacy)) {
                dTBAdRequest.putCustomTarget("us_privacy", this.usPrivacy);
            }
            dTBAdRequest.loadAd(new DTBAdCallback() {
                public void onFailure(AdError adError) {
                    AmazonLoader.this.collectCallback.onCollectFail(AmazonAdapter.mapError(adError));
                }

                public void onSuccess(DTBAdResponse dTBAdResponse) {
                    HashMap hashMap = new HashMap();
                    AmazonLoader.this.handleResponse(dTBAdResponse, hashMap);
                    if (hashMap.isEmpty()) {
                        AmazonLoader.this.collectCallback.onCollectFail(BMError.adapter("Response returned empty parameters"));
                    } else {
                        AmazonLoader.this.collectCallback.onCollectFinished(hashMap);
                    }
                }
            });
        }
    }

    /* renamed from: io.bidmachine.ads.networks.amazon.AmazonAdapter$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdError$ErrorCode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.amazon.device.ads.AdError$ErrorCode[] r0 = com.amazon.device.ads.AdError.ErrorCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$AdError$ErrorCode = r0
                com.amazon.device.ads.AdError$ErrorCode r1 = com.amazon.device.ads.AdError.ErrorCode.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdError$ErrorCode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.AdError$ErrorCode r1 = com.amazon.device.ads.AdError.ErrorCode.NETWORK_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdError$ErrorCode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.AdError$ErrorCode r1 = com.amazon.device.ads.AdError.ErrorCode.NETWORK_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.ads.networks.amazon.AmazonAdapter.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static BMError mapError(AdError adError) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$device$ads$AdError$ErrorCode[adError.getCode().ordinal()];
        if (i == 1) {
            return BMError.noFill();
        }
        if (i == 2) {
            return BMError.NoConnection;
        }
        if (i != 3) {
            return BMError.internal("Unknown error");
        }
        return BMError.TimeoutError;
    }
}
