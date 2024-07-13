package com.appsgeyser.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.appsgeyser.sdk.AppsgeyserSDK;
import com.appsgeyser.sdk.ads.AdView;
import com.appsgeyser.sdk.ads.FullScreenBanner;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackAdsController;
import com.appsgeyser.sdk.ads.rewardedVideo.RewardedAdHelper;
import com.appsgeyser.sdk.ads.sdk.SdkController;
import com.appsgeyser.sdk.analytics.Analytics;
import com.appsgeyser.sdk.configuration.Configuration;
import com.appsgeyser.sdk.configuration.Constants;
import com.appsgeyser.sdk.configuration.PreferencesCoder;
import com.appsgeyser.sdk.configuration.models.ConfigPhp;
import com.appsgeyser.sdk.datasdk.PermissionsRequester;
import com.appsgeyser.sdk.deviceidparser.DeviceIdParameters;
import com.appsgeyser.sdk.deviceidparser.DeviceIdParser;
import com.appsgeyser.sdk.deviceidparser.IDeviceIdParserListener;
import com.appsgeyser.sdk.inapp.PurchaseController;
import com.appsgeyser.sdk.inapp.utils.DisableAdsSharedPrefs;
import com.appsgeyser.sdk.server.implementation.AppsgeyserServerClient;
import com.appsgeyser.sdk.server.network.NetworkAvailableReceiver;
import com.appsgeyser.sdk.server.network.NetworkManager;
import com.appsgeyser.sdk.server.network.OnNetworkStateChangedListener;
import com.appsgeyser.sdk.ui.AboutDialogActivity;
import com.appsgeyser.sdk.ui.AdvertisingTermsDialog;
import com.appsgeyser.sdk.utils.RateApp.MarketChecker;
import com.appsgeyser.sdk.utils.RateApp.RateAppManager;
import com.google.gson.JsonSyntaxException;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.HashMap;

public final class InternalEntryPoint implements IDeviceIdParserListener {
    private static final InternalEntryPoint INSTANCE = new InternalEntryPoint();
    /* access modifiers changed from: private */
    public AppsgeyserSDK.OnAboutDialogEnableListener aboutDialogEnabledListener;
    /* access modifiers changed from: private */
    public AppsgeyserSDK.OnAccessDataEnableListener accessDataEnableListener;
    private AdView adView = null;
    private String additionalJsCode = "";
    /* access modifiers changed from: private */
    public AdvertisingTermsDialog advertisingTermsDialog;
    private AfterConsentRequestListener afterConsentRequestCompletedListener;
    private AppState appState = AppState.ON_PAUSE;
    private Application application;
    private Configuration configuration = null;
    /* access modifiers changed from: private */
    public boolean customHtmlAbout;
    /* access modifiers changed from: private */
    public AppsgeyserSDK.OnDisableAdsDataEnableListener disableAdsDataEnableListener;
    private boolean doneDeviceParser;
    private boolean enablePull = false;
    /* access modifiers changed from: private */
    public FullScreenBanner fullScreenBanner;
    /* access modifiers changed from: private */
    public DeviceIdParameters idParameters;
    private boolean isApplicationVisible = true;
    private boolean isConsentRequestProcessActive;
    private boolean isConsentRequestProcessCompleted;
    /* access modifiers changed from: private */
    public boolean isOnResumeFSEnabled;
    private AppsgeyserSDK.OnAdditionalJsLoaded jsLoader;
    private OnNetworkStateChangedListener networkAvailableListener;
    private NetworkAvailableReceiver networkReceiver;
    private AppsgeyserSDK.OnInAppUpdateEnableListener onInAppUpdateEnableListener;
    /* access modifiers changed from: private */
    public AppsgeyserSDK.OnRateMyAppEnableListener rateMyAppEnableListener;
    /* access modifiers changed from: private */
    public RewardedAdHelper rewardedAdHelper;
    /* access modifiers changed from: private */
    public boolean saveAccessDataEnableListener;
    /* access modifiers changed from: private */
    public boolean saveDialogEnableListener;
    /* access modifiers changed from: private */
    public boolean saveDisableAdsEnableListener;
    /* access modifiers changed from: private */
    public boolean saveRateMyAppEnableListener;
    private HashMap<String, Boolean> wasFSShownInOnResume = new HashMap<>(6);

    public interface AfterConsentRequestListener {
        void onConsentRequestCompleted();
    }

    public enum AppState {
        ON_RESUME,
        ON_PAUSE
    }

    public static InternalEntryPoint getInstance() {
        return INSTANCE;
    }

    /* access modifiers changed from: package-private */
    public void takeOff(Activity activity, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (checkPermissions(activity)) {
                init(activity, str3, str, str2);
                DisableAdsSharedPrefs.getInstance().init(activity);
                PurchaseController.getInstance().init(activity, str);
                YandexMetrica.activate(activity, YandexMetricaConfig.newConfigBuilder("34e75064-5ba5-4fac-b092-dc10aa167be0").build());
                YandexMetrica.enableActivityAutoTracking(activity.getApplication());
                try {
                    String metricaOnStartEvent = this.configuration.getMetricaOnStartEvent();
                    if (metricaOnStartEvent != null) {
                        YandexMetrica.reportEvent("on_start_event", metricaOnStartEvent);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                return;
            }
        }
        if (NetworkManager.isOnline(activity)) {
            DeviceIdParser.getInstance().rescan(activity, this);
            this.doneDeviceParser = true;
        }
        RateAppManager.getInstance(activity).increaseEntries();
        PermissionsRequester.requestNotificationPermissions(activity, 122);
    }

    private void init(Activity activity, String str, String str2, String str3) {
        Configuration instance = Configuration.getInstance(activity);
        this.configuration = instance;
        instance.setTemplateVersion(str);
        this.configuration.loadConfiguration();
        if (!(this.configuration.getApplicationId() != null ? this.configuration.getApplicationId() : "").equals(str2)) {
            this.configuration.clearApplicationSettings();
            this.configuration.setApplicationId(str2);
            this.configuration.setMetricaOnStartEvent(str3, str);
        }
        Analytics.getInstance(activity).activityStarted(activity);
        this.fullScreenBanner = new FullScreenBanner(activity);
        this.advertisingTermsDialog = new AdvertisingTermsDialog(activity);
        if (this.networkReceiver == null) {
            this.networkReceiver = NetworkAvailableReceiver.createAndRegisterNetworkReceiver(activity);
        }
        OnNetworkStateChangedListener createNetworkAvailableListener = this.networkReceiver.createNetworkAvailableListener(activity);
        this.networkAvailableListener = createNetworkAvailableListener;
        this.networkReceiver.addListener(createNetworkAvailableListener);
        SdkController.initSdk(activity);
    }

    public void retryParsers(Context context) {
        if (!this.doneDeviceParser) {
            DeviceIdParser.getInstance().rescan(context, this);
            this.doneDeviceParser = true;
        }
    }

    public FullScreenBanner getFullScreenBanner(Context context) {
        FullScreenBanner fullScreenBanner2;
        synchronized (InternalEntryPoint.class) {
            if (this.fullScreenBanner == null) {
                this.fullScreenBanner = new FullScreenBanner(context);
            } else if (this.fullScreenBanner.getContext() == null) {
                this.fullScreenBanner.setContext(context);
            }
            fullScreenBanner2 = this.fullScreenBanner;
        }
        return fullScreenBanner2;
    }

    /* access modifiers changed from: package-private */
    public void setAdView(AdView adView2) {
        this.adView = adView2;
    }

    private boolean checkPermissions(Activity activity) {
        if (activity.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && activity.checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            return true;
        }
        ExceptionHandler.handleException(new Exception("Invalid permission. You have to grant ACCESS_NETWORK_STATE and INTERNET permissions to work properly"));
        return false;
    }

    /* access modifiers changed from: package-private */
    public void onPause(Context context) {
        this.appState = AppState.ON_PAUSE;
        String localClassName = context instanceof Activity ? ((Activity) context).getLocalClassName() : "";
        AdView adView2 = this.adView;
        if (adView2 != null && localClassName.equals(adView2.getActivity().getLocalClassName())) {
            this.adView.onPause();
        }
        NetworkAvailableReceiver networkAvailableReceiver = this.networkReceiver;
        if (networkAvailableReceiver != null) {
            try {
                context.unregisterReceiver(networkAvailableReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
        RewardedAdHelper rewardedAdHelper2 = this.rewardedAdHelper;
        if (rewardedAdHelper2 != null) {
            rewardedAdHelper2.onPause();
        }
        FullScreenBanner fullScreenBanner2 = this.fullScreenBanner;
        if (fullScreenBanner2 != null) {
            fullScreenBanner2.setActivityInForeground(false);
        }
        FastTrackAdsController.getInstance().onPause();
        INSTANCE.setApplicationVisible(false);
        RateAppManager.getInstance(context).setPause();
    }

    /* access modifiers changed from: package-private */
    public void onResume(Context context) {
        String str;
        this.appState = AppState.ON_RESUME;
        boolean z = context instanceof Activity;
        if (z) {
            Activity activity = (Activity) context;
            str = activity.getLocalClassName();
            RateAppManager.getInstance(context).setCurrentActivity(activity);
        } else {
            str = "";
        }
        if (new PreferencesCoder(context).getPrefBoolean("ConfigAppBanned", false)) {
            PausedContentInfoActivity.startPausedContentInfoActivity(context, false);
        }
        AdView adView2 = this.adView;
        if (adView2 != null && str.equals(adView2.getActivity().getLocalClassName())) {
            this.adView.onResume();
        }
        this.configuration = Configuration.getInstance(context);
        if (this.networkReceiver == null) {
            NetworkAvailableReceiver createAndRegisterNetworkReceiver = NetworkAvailableReceiver.createAndRegisterNetworkReceiver(context);
            this.networkReceiver = createAndRegisterNetworkReceiver;
            OnNetworkStateChangedListener createNetworkAvailableListener = createAndRegisterNetworkReceiver.createNetworkAvailableListener(context);
            this.networkAvailableListener = createNetworkAvailableListener;
            this.networkReceiver.addListener(createNetworkAvailableListener);
        } else {
            context.registerReceiver(this.networkReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        FullScreenBanner fullScreenBanner2 = this.fullScreenBanner;
        if (fullScreenBanner2 != null) {
            fullScreenBanner2.setContext(context);
            this.fullScreenBanner.setActivityInForeground(true);
        }
        RewardedAdHelper rewardedAdHelper2 = this.rewardedAdHelper;
        if (rewardedAdHelper2 != null) {
            rewardedAdHelper2.setContext(context);
            this.rewardedAdHelper.onResume();
        }
        if (this.isOnResumeFSEnabled && this.fullScreenBanner != null && z) {
            Activity activity2 = (Activity) context;
            if (!isFSWasAlreadyShown(activity2)) {
                this.wasFSShownInOnResume.put(activity2.getClass().getCanonicalName(), true);
                this.fullScreenBanner.load("on_resume");
            }
        }
        FastTrackAdsController.getInstance().onResume(context);
        INSTANCE.setApplicationVisible(true);
    }

    private boolean isFSWasAlreadyShown(Activity activity) {
        String canonicalName = activity.getClass().getCanonicalName();
        if (this.wasFSShownInOnResume.containsKey(canonicalName)) {
            return this.wasFSShownInOnResume.get(canonicalName).booleanValue();
        }
        return false;
    }

    public void onDeviceIdParametersObtained(final Context context, DeviceIdParameters deviceIdParameters) {
        this.idParameters = deviceIdParameters;
        AppsgeyserServerClient.getInstance().getConfigPhp(context, this.idParameters, new AppsgeyserServerClient.ConfigPhpRequestListener() {
            public void receivedConfigPhp(ConfigPhp configPhp) {
                InternalEntryPoint.getInstance().getFullScreenBanner(context).initWithDeviceIdParameters(InternalEntryPoint.this.idParameters);
                if (configPhp != null) {
                    if (InternalEntryPoint.this.advertisingTermsDialog != null) {
                        InternalEntryPoint.this.advertisingTermsDialog.show(configPhp.isAdvertisingTermsDialog());
                    }
                    if (InternalEntryPoint.this.saveDialogEnableListener) {
                        InternalEntryPoint.this.aboutDialogEnabledListener.onDialogEnableReceived(configPhp.isAboutScreenEnabled());
                    }
                    if (InternalEntryPoint.this.saveRateMyAppEnableListener) {
                        InternalEntryPoint.this.rateMyAppEnableListener.onRateMyAppEnableReceived(configPhp.isRateMyAppActive());
                    }
                    if (InternalEntryPoint.this.saveAccessDataEnableListener) {
                        InternalEntryPoint.this.accessDataEnableListener.onAccessDataEnable(configPhp.getAppsgeyserAccess());
                    }
                    if (InternalEntryPoint.this.saveDisableAdsEnableListener) {
                        InternalEntryPoint.this.disableAdsDataEnableListener.onDisableAdsDataEnable(configPhp.getAppsgeyserDisableAds());
                    }
                    if (InternalEntryPoint.this.rewardedAdHelper == null) {
                        RewardedAdHelper unused = InternalEntryPoint.this.rewardedAdHelper = new RewardedAdHelper(configPhp, context);
                    }
                    Constants.setFullScreenDelay(configPhp.getFullScreenDelay());
                    InternalEntryPoint.getInstance().getFullScreenBanner(context).setTimesToShow(configPhp.getFullscreenBannerCountToShow());
                    InternalEntryPoint.getInstance().getFullScreenBanner(context).setOnTouchFSEnabled(configPhp.isOnTouchFSEnabled());
                    if (configPhp.isTakeOffFSEnabled()) {
                        InternalEntryPoint.getInstance().getFullScreenBanner(context).load("on_take_off");
                    }
                    boolean unused2 = InternalEntryPoint.this.isOnResumeFSEnabled = configPhp.isOnResumeFSEnabled();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void showAboutDialog(Activity activity) {
        final Intent intent = new Intent(activity, AboutDialogActivity.class);
        intent.setFlags(268435456);
        if (this.idParameters != null) {
            AppsgeyserServerClient.getInstance().getConfigPhp(activity, this.idParameters, new AppsgeyserServerClient.ConfigPhpRequestListener() {
                public void receivedConfigPhp(ConfigPhp configPhp) {
                    intent.putExtra("config_php_key", configPhp);
                    boolean unused = InternalEntryPoint.this.customHtmlAbout = configPhp.isCustomAboutActive();
                }
            });
        } else {
            String prefString = Configuration.getInstance(activity).getSettingsCoder().getPrefString("ServerResponse", "");
            if (!TextUtils.isEmpty(prefString)) {
                try {
                    ConfigPhp parseFromJson = ConfigPhp.parseFromJson(prefString);
                    intent.putExtra("config_php_key", parseFromJson);
                    this.customHtmlAbout = parseFromJson.isCustomAboutActive();
                } catch (JsonSyntaxException unused) {
                }
            } else {
                intent.putExtra("config_php_key", "");
            }
        }
        if (!this.customHtmlAbout) {
            activity.startActivity(intent);
        } else {
            PausedContentInfoActivity.startPausedContentInfoActivity(activity, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void getNewConfigPhp(Context context, final AppsgeyserSDK.OnAboutDialogEnableListener onAboutDialogEnableListener) {
        this.aboutDialogEnabledListener = onAboutDialogEnableListener;
        if (this.idParameters != null) {
            AppsgeyserServerClient.getInstance().getConfigPhp(context, this.idParameters, new AppsgeyserServerClient.ConfigPhpRequestListener() {
                public void receivedConfigPhp(ConfigPhp configPhp) {
                    onAboutDialogEnableListener.onDialogEnableReceived(configPhp.isAboutScreenEnabled());
                    boolean unused = InternalEntryPoint.this.saveDialogEnableListener = false;
                }
            });
            return;
        }
        String prefString = Configuration.getInstance(context).getSettingsCoder().getPrefString("ServerResponse", "");
        if (!TextUtils.isEmpty(prefString)) {
            try {
                onAboutDialogEnableListener.onDialogEnableReceived(ConfigPhp.parseFromJson(prefString).isAboutScreenEnabled());
                this.saveDialogEnableListener = false;
            } catch (JsonSyntaxException unused) {
                this.saveDialogEnableListener = true;
            }
        } else {
            this.saveDialogEnableListener = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void getNewConfigPhp(Context context, final AppsgeyserSDK.OnInAppUpdateEnableListener onInAppUpdateEnableListener2) {
        this.onInAppUpdateEnableListener = onInAppUpdateEnableListener2;
        if (this.idParameters != null) {
            AppsgeyserServerClient.getInstance().getConfigPhp(context, this.idParameters, new AppsgeyserServerClient.ConfigPhpRequestListener() {
                public void receivedConfigPhp(ConfigPhp configPhp) {
                    onInAppUpdateEnableListener2.onInAppUpdateEnable(configPhp.isInappUpdateEnabled());
                    boolean unused = InternalEntryPoint.this.saveDialogEnableListener = false;
                }
            });
            return;
        }
        String prefString = Configuration.getInstance(context).getSettingsCoder().getPrefString("ServerResponse", "");
        if (!TextUtils.isEmpty(prefString)) {
            try {
                onInAppUpdateEnableListener2.onInAppUpdateEnable(ConfigPhp.parseFromJson(prefString).isInappUpdateEnabled());
                this.saveDialogEnableListener = false;
            } catch (JsonSyntaxException unused) {
                this.saveDialogEnableListener = true;
            }
        } else {
            this.saveDialogEnableListener = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void getNewConfigPhp(Context context, final AppsgeyserSDK.OnAccessDataEnableListener onAccessDataEnableListener) {
        this.accessDataEnableListener = onAccessDataEnableListener;
        if (this.idParameters != null) {
            AppsgeyserServerClient.getInstance().getConfigPhp(context, this.idParameters, new AppsgeyserServerClient.ConfigPhpRequestListener() {
                public void receivedConfigPhp(ConfigPhp configPhp) {
                    onAccessDataEnableListener.onAccessDataEnable(configPhp.getAppsgeyserAccess());
                    boolean unused = InternalEntryPoint.this.saveAccessDataEnableListener = false;
                }
            });
            return;
        }
        String prefString = Configuration.getInstance(context).getSettingsCoder().getPrefString("ServerResponse", "");
        if (!TextUtils.isEmpty(prefString)) {
            try {
                onAccessDataEnableListener.onAccessDataEnable(ConfigPhp.parseFromJson(prefString).getAppsgeyserAccess());
                this.saveAccessDataEnableListener = false;
            } catch (JsonSyntaxException unused) {
                this.saveAccessDataEnableListener = true;
            }
        } else {
            this.saveAccessDataEnableListener = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void getNewConfigPhp(Context context, final AppsgeyserSDK.OnDisableAdsDataEnableListener onDisableAdsDataEnableListener) {
        this.disableAdsDataEnableListener = onDisableAdsDataEnableListener;
        if (this.idParameters != null) {
            AppsgeyserServerClient.getInstance().getConfigPhp(context, this.idParameters, new AppsgeyserServerClient.ConfigPhpRequestListener() {
                public void receivedConfigPhp(ConfigPhp configPhp) {
                    onDisableAdsDataEnableListener.onDisableAdsDataEnable(configPhp.getAppsgeyserDisableAds());
                    boolean unused = InternalEntryPoint.this.saveDisableAdsEnableListener = false;
                }
            });
            return;
        }
        String prefString = Configuration.getInstance(context).getSettingsCoder().getPrefString("ServerResponse", "");
        if (!TextUtils.isEmpty(prefString)) {
            try {
                onDisableAdsDataEnableListener.onDisableAdsDataEnable(ConfigPhp.parseFromJson(prefString).getAppsgeyserDisableAds());
                this.saveDisableAdsEnableListener = false;
            } catch (JsonSyntaxException unused) {
                this.saveDisableAdsEnableListener = true;
            }
        } else {
            this.saveDisableAdsEnableListener = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void getNewConfigPhp(Context context, final AppsgeyserSDK.OnRateMyAppEnableListener onRateMyAppEnableListener) {
        this.rateMyAppEnableListener = onRateMyAppEnableListener;
        if (this.idParameters != null) {
            AppsgeyserServerClient.getInstance().getConfigPhp(context, this.idParameters, new AppsgeyserServerClient.ConfigPhpRequestListener() {
                public void receivedConfigPhp(ConfigPhp configPhp) {
                    onRateMyAppEnableListener.onRateMyAppEnableReceived(configPhp.isRateMyAppActive());
                    boolean unused = InternalEntryPoint.this.saveRateMyAppEnableListener = false;
                }
            });
            return;
        }
        String prefString = Configuration.getInstance(context).getSettingsCoder().getPrefString("ServerResponse", "");
        if (!TextUtils.isEmpty(prefString)) {
            try {
                onRateMyAppEnableListener.onRateMyAppEnableReceived(ConfigPhp.parseFromJson(prefString).isRateMyAppActive());
                this.saveRateMyAppEnableListener = false;
            } catch (JsonSyntaxException unused) {
                this.saveRateMyAppEnableListener = true;
            }
        } else {
            this.saveRateMyAppEnableListener = true;
        }
    }

    public void setAdditionalJsCode(String str) {
        this.additionalJsCode = str;
        AppsgeyserSDK.OnAdditionalJsLoaded onAdditionalJsLoaded = this.jsLoader;
        if (onAdditionalJsLoaded != null) {
            onAdditionalJsLoaded.onJsLoaded(str);
        }
    }

    public String getAdditionalJsCode() {
        return this.additionalJsCode;
    }

    /* access modifiers changed from: package-private */
    public void getAdditionalJsCode(AppsgeyserSDK.OnAdditionalJsLoaded onAdditionalJsLoaded) {
        this.jsLoader = onAdditionalJsLoaded;
    }

    public void addNetworkListener(OnNetworkStateChangedListener onNetworkStateChangedListener, Context context) {
        NetworkAvailableReceiver networkAvailableReceiver = this.networkReceiver;
        if (networkAvailableReceiver != null) {
            networkAvailableReceiver.addListener(onNetworkStateChangedListener);
            return;
        }
        NetworkAvailableReceiver createAndRegisterNetworkReceiver = NetworkAvailableReceiver.createAndRegisterNetworkReceiver(context);
        this.networkReceiver = createAndRegisterNetworkReceiver;
        createAndRegisterNetworkReceiver.addListener(onNetworkStateChangedListener);
    }

    public void removeNetworkListener(OnNetworkStateChangedListener onNetworkStateChangedListener) {
        NetworkAvailableReceiver networkAvailableReceiver = this.networkReceiver;
        if (networkAvailableReceiver != null) {
            networkAvailableReceiver.removeListener(onNetworkStateChangedListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void checkIsOfferWallEnabled(Context context, final AppsgeyserSDK.OfferWallEnabledListener offerWallEnabledListener) {
        if (this.idParameters != null) {
            AppsgeyserServerClient.getInstance().getConfigPhp(context, this.idParameters, new AppsgeyserServerClient.ConfigPhpRequestListener() {
                public void receivedConfigPhp(ConfigPhp configPhp) {
                    offerWallEnabledListener.isOfferWallEnabled(configPhp.isOfferWallEnabled());
                }
            });
        } else {
            DeviceIdParser.getInstance().rescan(context, new IDeviceIdParserListener() {
                public void onDeviceIdParametersObtained(Context context, DeviceIdParameters deviceIdParameters) {
                    DeviceIdParameters unused = InternalEntryPoint.this.idParameters = deviceIdParameters;
                    AppsgeyserServerClient.getInstance().getConfigPhp(context, deviceIdParameters, new AppsgeyserServerClient.ConfigPhpRequestListener() {
                        public void receivedConfigPhp(ConfigPhp configPhp) {
                            offerWallEnabledListener.isOfferWallEnabled(configPhp.isOfferWallEnabled());
                        }
                    });
                    InternalEntryPoint.this.fullScreenBanner.initWithDeviceIdParameters(InternalEntryPoint.this.idParameters);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public RewardedAdHelper getRewardedAdHelper() {
        return this.rewardedAdHelper;
    }

    /* access modifiers changed from: package-private */
    public FastTrackAdsController getFastTrackAdsController() {
        return FastTrackAdsController.getInstance();
    }

    public void setApplication(Application application2) {
        this.application = application2;
    }

    public void setApplicationVisible(boolean z) {
        this.isApplicationVisible = z;
    }

    public boolean isConsentRequestProcessActive() {
        return this.isConsentRequestProcessActive;
    }

    public void setAfterConsentRequestCompletedListener(AfterConsentRequestListener afterConsentRequestListener) {
        if (this.isConsentRequestProcessCompleted) {
            afterConsentRequestListener.onConsentRequestCompleted();
        } else {
            this.afterConsentRequestCompletedListener = afterConsentRequestListener;
        }
    }

    public void setConsentRequestProcessActive(boolean z) {
        if (!this.isConsentRequestProcessCompleted) {
            this.isConsentRequestProcessActive = z;
            if (!z) {
                this.isConsentRequestProcessCompleted = true;
                AfterConsentRequestListener afterConsentRequestListener = this.afterConsentRequestCompletedListener;
                if (afterConsentRequestListener != null) {
                    afterConsentRequestListener.onConsentRequestCompleted();
                    this.afterConsentRequestCompletedListener = null;
                    return;
                }
                return;
            }
            return;
        }
        this.isConsentRequestProcessActive = false;
    }

    public MarketChecker getMarketChecker() {
        return MarketChecker.getInstance();
    }

    public AppState getAppState() {
        return this.appState;
    }
}
