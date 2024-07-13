package com.appodeal.ads.adapters.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdType;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.LoadingError;
import com.appodeal.ads.NetworkInitializationListener;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.adapters.ironsource.interstitial.IronSourceInterstitial;
import com.appodeal.ads.adapters.ironsource.rewarded_video.IronSourceRewarded;
import com.appodeal.ads.adapters.ironsource.video.IronSourceVideo;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.unified.UnifiedAppStateChangeListener;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.utils.ActivityRule;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.app.AppState;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

public class IronSourceNetwork extends AdNetwork<RequestParams> {
    private static final String DEFAULT_INSTANCE = "0";
    private static final UnifiedAppStateChangeListener appStateChangeListener = new UnifiedAppStateChangeListener() {
        public void onAppStateChanged(Activity activity, AppState appState, boolean z) {
            if (!z) {
                int i = AnonymousClass3.$SwitchMap$com$appodeal$ads$utils$app$AppState[appState.ordinal()];
                if (i == 1) {
                    IronSource.onResume(activity);
                } else if (i == 2) {
                    IronSource.onPause(activity);
                }
            }
        }
    };
    private static boolean instanceInProgress = false;
    public static Queue<String> instancesList = new LinkedList();
    public static final Map<String, ISDemandOnlyInterstitialListener> interstitialListeners = new HashMap();
    public static boolean isInitialized = false;

    public boolean canLoadInterstitialWhenDisplaying() {
        return false;
    }

    public boolean canLoadRewardedWhenDisplaying() {
        return false;
    }

    public boolean canLoadVideoWhenDisplaying() {
        return false;
    }

    public String getRecommendedVersion() {
        return VersionInfo.VERSION;
    }

    /* renamed from: com.appodeal.ads.adapters.ironsource.IronSourceNetwork$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$appodeal$ads$utils$app$AppState;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appodeal.ads.utils.app.AppState[] r0 = com.appodeal.ads.utils.app.AppState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$appodeal$ads$utils$app$AppState = r0
                com.appodeal.ads.utils.app.AppState r1 = com.appodeal.ads.utils.app.AppState.Resumed     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$appodeal$ads$utils$app$AppState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appodeal.ads.utils.app.AppState r1 = com.appodeal.ads.utils.app.AppState.Paused     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.ironsource.IronSourceNetwork.AnonymousClass3.<clinit>():void");
        }
    }

    private IronSourceNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    /* access modifiers changed from: protected */
    public UnifiedAppStateChangeListener getAppStateChangeListener() {
        return appStateChangeListener;
    }

    public UnifiedInterstitial<RequestParams> createInterstitial() {
        return new IronSourceInterstitial();
    }

    public UnifiedVideo<RequestParams> createVideo() {
        return new IronSourceVideo();
    }

    public UnifiedRewarded<RequestParams> createRewarded() {
        return new IronSourceRewarded();
    }

    public LoadingError verifyLoadAvailability(AdType adType) {
        if ((adType == AdType.Interstitial || adType == AdType.Video) && (isInterstitialShowing() || isVideoShowing())) {
            return LoadingError.Canceled;
        }
        return super.verifyLoadAvailability(adType);
    }

    public String getVersion() {
        return IronSourceUtils.getSDKVersion();
    }

    /* access modifiers changed from: protected */
    public void initialize(Activity activity, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<RequestParams> networkInitializationListener) throws Exception {
        String string = adUnit.getJsonData().getString("app_key");
        String optString = adUnit.getJsonData().optString("instance_id", "0");
        updateConsent(adNetworkMediationParams.getRestrictedData());
        setTargeting(adNetworkMediationParams.getRestrictedData());
        setMediatorName(adUnit.getMediatorName());
        RequestParams requestParams = new RequestParams(optString, adUnit.getJsonData());
        if (!isInitialized) {
            isInitialized = true;
            IronSource.setLogListener(new LogListener() {
                public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
                    Log.log(LogConstants.KEY_NETWORK, "Log", String.format("IronSource %s:%s", new Object[]{ironSourceTag, str}));
                }
            });
            IronSource.setISDemandOnlyInterstitialListener(new GlobalInterstitialListener());
            IronSource.initISDemandOnly(activity.getBaseContext(), string, IronSource.AD_UNIT.INTERSTITIAL, IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        networkInitializationListener.onInitializationFinished(requestParams);
    }

    public void updateConsent(RestrictedData restrictedData) {
        if (restrictedData.isUserInGdprScope()) {
            IronSource.setConsent(restrictedData.isUserHasConsent());
        }
        if (restrictedData.isUserInCcpaScope()) {
            IronSource.setMetaData("do_not_sell", String.valueOf(restrictedData.isUserHasConsent()));
        }
        IronSource.setMetaData("is_child_directed", String.valueOf(restrictedData.isUserAgeRestricted()));
    }

    private void setTargeting(RestrictedData restrictedData) {
        String userId = restrictedData.getUserId();
        if (!TextUtils.isEmpty(userId)) {
            IronSource.setUserId(userId);
        }
    }

    private void setMediatorName(String str) {
        if (!TextUtils.isEmpty(str)) {
            IronSource.setMediationType(str);
        }
    }

    public static void prepareInstance() {
        instanceInProgress = false;
        instancesList.poll();
    }

    public static void registerInterstitialInstances(JSONArray jSONArray) {
        if (instancesList.isEmpty()) {
            if (jSONArray == null || jSONArray.length() == 0) {
                jSONArray = new JSONArray();
                jSONArray.put("0");
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                instancesList.add(jSONArray.optString(i));
            }
        }
    }

    public static boolean canLoadInstance(String str) {
        return !instanceInProgress && str.equals(instancesList.peek());
    }

    public static void setInProgressInstance(boolean z) {
        instanceInProgress = z;
    }

    public static boolean isInstanceInProgress() {
        return instanceInProgress;
    }

    public static void subscribeInterstitialListener(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        interstitialListeners.put(str, iSDemandOnlyInterstitialListener);
    }

    public static void unsubscribeInterstitialListener(String str) {
        interstitialListeners.remove(str);
    }

    public static LoadingError mapError(int i) {
        if (i != 501) {
            if (i == 520) {
                return LoadingError.ConnectionError;
            }
            if (!(i == 1037 || i == 505 || i == 506)) {
                switch (i) {
                    case 508:
                        break;
                    case 509:
                    case 510:
                        return LoadingError.NoFill;
                    default:
                        return null;
                }
            }
        }
        return LoadingError.InternalError;
    }

    static class GlobalInterstitialListener implements ISDemandOnlyInterstitialListener {
        GlobalInterstitialListener() {
        }

        public void onInterstitialAdReady(String str) {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = IronSourceNetwork.interstitialListeners.get(str);
            if (iSDemandOnlyInterstitialListener != null) {
                iSDemandOnlyInterstitialListener.onInterstitialAdReady(str);
            }
        }

        public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = IronSourceNetwork.interstitialListeners.get(str);
            if (iSDemandOnlyInterstitialListener != null) {
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(str, ironSourceError);
            }
        }

        public void onInterstitialAdOpened(String str) {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = IronSourceNetwork.interstitialListeners.get(str);
            if (iSDemandOnlyInterstitialListener != null) {
                iSDemandOnlyInterstitialListener.onInterstitialAdOpened(str);
            }
        }

        public void onInterstitialAdClosed(String str) {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = IronSourceNetwork.interstitialListeners.get(str);
            if (iSDemandOnlyInterstitialListener != null) {
                iSDemandOnlyInterstitialListener.onInterstitialAdClosed(str);
            }
        }

        public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = IronSourceNetwork.interstitialListeners.get(str);
            if (iSDemandOnlyInterstitialListener != null) {
                iSDemandOnlyInterstitialListener.onInterstitialAdShowFailed(str, ironSourceError);
            }
        }

        public void onInterstitialAdClicked(String str) {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = IronSourceNetwork.interstitialListeners.get(str);
            if (iSDemandOnlyInterstitialListener != null) {
                iSDemandOnlyInterstitialListener.onInterstitialAdClicked(str);
            }
        }
    }

    public static final class RequestParams {
        public final String instanceId;
        public final JSONObject jsonData;

        RequestParams(String str, JSONObject jSONObject) {
            this.instanceId = str;
            this.jsonData = jSONObject;
        }
    }

    public static class builder extends AdNetworkBuilder {
        public String getAdapterVersion() {
            return "21";
        }

        public String getName() {
            return "ironsource";
        }

        public ActivityRule[] getAdActivityRules() {
            return new ActivityRule[]{new ActivityRule.Builder("com.ironsource.sdk.controller.ControllerActivity").build(), new ActivityRule.Builder("com.ironsource.sdk.controller.InterstitialActivity").build(), new ActivityRule.Builder("com.ironsource.sdk.controller.OpenUrlActivity").build()};
        }

        public String[] getRequiredClasses() {
            return new String[]{"com.ironsource.mediationsdk.IronSource"};
        }

        public IronSourceNetwork build() {
            return new IronSourceNetwork(this);
        }
    }
}
