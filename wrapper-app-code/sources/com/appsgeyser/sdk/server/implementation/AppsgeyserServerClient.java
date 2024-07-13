package com.appsgeyser.sdk.server.implementation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.installreferrer.api.ReferrerDetails;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appsgeyser.sdk.InternalEntryPoint;
import com.appsgeyser.sdk.PausedContentInfoActivity;
import com.appsgeyser.sdk.R;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackAdsController;
import com.appsgeyser.sdk.configuration.Configuration;
import com.appsgeyser.sdk.configuration.Constants;
import com.appsgeyser.sdk.configuration.PreferencesCoder;
import com.appsgeyser.sdk.configuration.models.ConfigPhp;
import com.appsgeyser.sdk.datasdk.DataSdkController;
import com.appsgeyser.sdk.deviceidparser.DeviceIdParameters;
import com.appsgeyser.sdk.deviceidparser.DeviceIdParser;
import com.appsgeyser.sdk.hasher.Hasher;
import com.appsgeyser.sdk.push.OneSignalCreator;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.server.network.NetworkManager;
import com.appsgeyser.sdk.utils.DeviceInfoGetter;
import com.appsgeyser.sdk.utils.ReminderAlarmManager;
import com.appsgeyser.sdk.utils.VersionManager;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppsgeyserServerClient {
    /* access modifiers changed from: private */
    public ConfigPhp configPhpModel;
    List<ConfigPhpRequestListener> listenerList;
    private final NetworkManager networkManager;

    public interface ConfigPhpRequestListener {
        void receivedConfigPhp(ConfigPhp configPhp);
    }

    private static class SingletonHolder {
        static final AppsgeyserServerClient HOLDER_INSTANCE = new AppsgeyserServerClient();
    }

    private AppsgeyserServerClient() {
        this.listenerList = new ArrayList();
        this.networkManager = NetworkManager.getInstance();
    }

    public static AppsgeyserServerClient getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    private String getInstallerMarket(Context context) {
        try {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (installerPackageName == null) {
                return "";
            }
            return installerPackageName;
        } catch (Exception e2) {
            if (TextUtils.isEmpty(e2.getMessage())) {
                return "ERROR";
            }
            return "ERROR" + ":" + e2.getMessage();
        }
    }

    public void sendAfterInstallInfo(Context context) {
        sendRequestWithAllArgs(Constants.INSTALL, NetworkManager.RequestType.AFTERINSTALL.ordinal(), context);
    }

    public void sendUsageInfo(Context context) {
        sendRequestWithAllArgs("usage", NetworkManager.RequestType.USAGE.ordinal(), context);
    }

    public void sendAboutDialogVisitSite(Context context) {
        sendRequestSdkStatisticsWithArgs("about_dialog_visit_site", -980696864, context);
    }

    public void sendUpdateInfo(Context context) {
        int currentVersion = VersionManager.getCurrentVersion(context);
        int previousVersion = VersionManager.getPreviousVersion(context);
        if (previousVersion == -1) {
            VersionManager.updateVersion(context, currentVersion);
        } else if (currentVersion > previousVersion) {
            VersionManager.updateVersion(context, currentVersion);
            sendRequestWithAllArgs("update", NetworkManager.RequestType.UPDATE.ordinal(), context);
        }
    }

    public void getConfigPhp(final Context context, DeviceIdParameters deviceIdParameters, ConfigPhpRequestListener configPhpRequestListener) {
        String str;
        String str2;
        ConfigPhp configPhp = this.configPhpModel;
        if (configPhp != null) {
            configPhpRequestListener.receivedConfigPhp(configPhp);
        } else if (this.listenerList.size() > 0) {
            this.listenerList.add(configPhpRequestListener);
        } else {
            Configuration instance = Configuration.getInstance(context);
            this.listenerList.add(configPhpRequestListener);
            String str3 = "";
            String advId = deviceIdParameters != null ? deviceIdParameters.getAdvId() : str3;
            if (!TextUtils.isEmpty(advId)) {
                str = "&advid=" + advId;
            } else {
                str = str3;
            }
            instance.loadConfiguration();
            try {
                str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str2 = str3;
            }
            try {
                str3 = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            String str4 = getBaseConfigUrl(context) + "?widgetId=" + instance.getApplicationId() + "&guid=" + instance.getAppGuid() + "&v=" + com.appsgeyser.sdk.configuration.Constants.PLATFORM_VERSION + "&market=" + getInstallerMarket(context) + "&cadmobid=" + context.getString(R.string.customAdmobAppID) + "&templateVersion=" + instance.getTemplateVersion() + "&appVersionName=" + str2 + "&appVersionCode=" + str3 + str;
            final PreferencesCoder preferencesCoder = new PreferencesCoder(context);
            preferencesCoder.savePrefString("ConfigPhpURLWithParams", str4);
            this.networkManager.sendRequestAsync(str4, Integer.valueOf(NetworkManager.RequestType.CONFIG_PHP.ordinal()), context, (OnRequestDoneListener) new OnRequestDoneListener() {
                public void onRequestDone(String str, int i, String str2) {
                    preferencesCoder.savePrefString("ServerResponse", str2);
                    try {
                        ConfigPhp unused = AppsgeyserServerClient.this.configPhpModel = ConfigPhp.parseFromJson(str2);
                        if (AppsgeyserServerClient.this.configPhpModel.getStatUrls() != null) {
                            StatController.getInstance().init(new HashMap(AppsgeyserServerClient.this.configPhpModel.getStatUrls()));
                        }
                        preferencesCoder.savePrefBoolean("ConfigAppBanned", AppsgeyserServerClient.this.configPhpModel.isAppBanActive());
                        if (AppsgeyserServerClient.this.configPhpModel.isAppBanActive()) {
                            PausedContentInfoActivity.startPausedContentInfoActivity(context, false);
                            return;
                        }
                        DataSdkController.startDataSdkController(context, AppsgeyserServerClient.this.configPhpModel);
                        if (!FastTrackAdsController.getInstance().isActive()) {
                            FastTrackAdsController.getInstance().requestInit(AppsgeyserServerClient.this.configPhpModel, context);
                        }
                        for (ConfigPhpRequestListener receivedConfigPhp : AppsgeyserServerClient.this.listenerList) {
                            receivedConfigPhp.receivedConfigPhp(AppsgeyserServerClient.this.configPhpModel);
                        }
                        if (AppsgeyserServerClient.this.configPhpModel.getAdditionalJsCode() != null) {
                            InternalEntryPoint.getInstance().setAdditionalJsCode(AppsgeyserServerClient.this.configPhpModel.getAdditionalJsCode());
                        }
                        if (AppsgeyserServerClient.this.configPhpModel.isInactivityReminderEnabled()) {
                            ReminderAlarmManager.startReminderAlarm(context, AppsgeyserServerClient.this.configPhpModel.getInactivityDaysPeriod(), true);
                        }
                        AppsgeyserServerClient.this.initPush(context, AppsgeyserServerClient.this.configPhpModel.getOneSignalAppId(), AppsgeyserServerClient.this.configPhpModel.isPushNotificationsActive());
                        AppsgeyserServerClient.this.listenerList.clear();
                    } catch (JsonSyntaxException unused2) {
                        for (ConfigPhpRequestListener access$300 : AppsgeyserServerClient.this.listenerList) {
                            AppsgeyserServerClient.this.onGetConfigErrorResponse(context, access$300, preferencesCoder);
                        }
                    }
                }
            }, (Response.ErrorListener) new Response.ErrorListener() {
                public void onErrorResponse(VolleyError volleyError) {
                    for (ConfigPhpRequestListener access$300 : AppsgeyserServerClient.this.listenerList) {
                        AppsgeyserServerClient.this.onGetConfigErrorResponse(context, access$300, preferencesCoder);
                    }
                    AppsgeyserServerClient.this.listenerList.clear();
                    InternalEntryPoint.getInstance().setConsentRequestProcessActive(false);
                }
            });
        }
    }

    public void sendClickInfo(String str, Context context) {
        this.networkManager.sendRequestAsync(str, Integer.valueOf(NetworkManager.RequestType.CLICK.ordinal()), context, this.networkManager.getEmptyRequestDoneListener(context), this.networkManager.getDefaultErrorListener(Integer.valueOf(NetworkManager.RequestType.CLICK.ordinal()), context));
    }

    public void sendApplicationMode(Context context) {
        Configuration instance = Configuration.getInstance(context);
        this.networkManager.sendRequestAsync("https://ads.appsgeyser.com/checkstatus.php?wid=" + instance.getApplicationId(), Integer.valueOf(NetworkManager.RequestType.APPMODE.ordinal()), context, this.networkManager.getEmptyRequestDoneListener(context), this.networkManager.getDefaultErrorListener(Integer.valueOf(NetworkManager.RequestType.APPMODE.ordinal()), context));
    }

    private void sendRequestWithAllArgs(String str, int i, Context context) {
        String str2;
        String str3;
        String str4 = str;
        Context context2 = context;
        String str5 = "";
        Configuration instance = Configuration.getInstance(context);
        String advId = DeviceIdParser.getInstance().getDeviceIdParameters().getAdvId();
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = str5;
        }
        try {
            str5 = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (!TextUtils.isEmpty(advId)) {
            str3 = context2.getString(R.string.statDomainUrl) + "statistics.php?action=" + str4 + "&name=" + instance.getApplicationId() + "&id=" + instance.getAppGuid() + "&v=" + com.appsgeyser.sdk.configuration.Constants.PLATFORM_VERSION + "&p=android&advid=" + advId + "&market=" + getInstallerMarket(context2) + DeviceInfoGetter.getDeviceInfo(context) + "&templateversion=" + instance.getTemplateVersion() + "&appversionname=" + str2 + "&appversioncode=" + str5;
        } else {
            str3 = context2.getString(R.string.statDomainUrl) + "statistics.php?action=" + str4 + "&name=" + instance.getApplicationId() + "&id=" + instance.getAppGuid() + "&v=" + com.appsgeyser.sdk.configuration.Constants.PLATFORM_VERSION + "&p=android&market=" + getInstallerMarket(context2) + DeviceInfoGetter.getDeviceInfo(context) + "&templateversion=" + instance.getTemplateVersion() + "&appversionname=" + str2 + "&appversioncode=" + str5;
        }
        this.networkManager.sendRequestAsync(str3, Integer.valueOf(i), context, this.networkManager.getEmptyRequestDoneListener(context2), this.networkManager.getDefaultErrorListener(Integer.valueOf(i), context2));
    }

    public void sendReferrerStatsRequest(Context context, Constants.ReferrerInfoStatus referrerInfoStatus, ReferrerDetails referrerDetails) {
        String str;
        String str2 = "";
        Configuration instance = Configuration.getInstance(context);
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = str2;
        }
        try {
            str2 = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://stat.appsgeyser.com/referrer.php");
        int i = AnonymousClass3.$SwitchMap$com$appsgeyser$sdk$configuration$Constants$ReferrerInfoStatus[referrerInfoStatus.ordinal()];
        if (i == 1) {
            sb.append("?action=add&status=ok");
        } else if (i == 2) {
            sb.append("?action=add&status=feature_not_supported");
        } else if (i == 3) {
            sb.append("?action=add&status=unavailable");
        } else if (i == 4) {
            sb.append("?action=add&status=remote_exception");
        }
        sb.append("&wid=");
        sb.append(instance.getApplicationId());
        sb.append("&templateversion=");
        sb.append(instance.getTemplateVersion());
        sb.append("&appversionname=");
        sb.append(str);
        sb.append("&appversioncode=");
        sb.append(str2);
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        if (referrerInfoStatus == Constants.ReferrerInfoStatus.OK && referrerDetails != null) {
            hashMap.put("referrerUrl", referrerDetails.getInstallReferrer());
            hashMap.put("referrerClickTime", String.valueOf(referrerDetails.getReferrerClickTimestampSeconds()));
            hashMap.put("appInstallTime", String.valueOf(referrerDetails.getInstallBeginTimestampSeconds()));
            hashMap.put("instantExperienceLaunched", String.valueOf(referrerDetails.getGooglePlayInstantParam()));
        }
        this.networkManager.sendRequestAsyncPost(sb2, Integer.valueOf(NetworkManager.RequestType.REFERRER.ordinal()), context, this.networkManager.getEmptyRequestDoneListener(context), this.networkManager.getDefaultErrorListener(Integer.valueOf(NetworkManager.RequestType.REFERRER.ordinal()), context), (Map<String, String>) hashMap);
    }

    /* renamed from: com.appsgeyser.sdk.server.implementation.AppsgeyserServerClient$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$appsgeyser$sdk$configuration$Constants$ReferrerInfoStatus;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.appsgeyser.sdk.configuration.Constants$ReferrerInfoStatus[] r0 = com.appsgeyser.sdk.configuration.Constants.ReferrerInfoStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$appsgeyser$sdk$configuration$Constants$ReferrerInfoStatus = r0
                com.appsgeyser.sdk.configuration.Constants$ReferrerInfoStatus r1 = com.appsgeyser.sdk.configuration.Constants.ReferrerInfoStatus.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$appsgeyser$sdk$configuration$Constants$ReferrerInfoStatus     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsgeyser.sdk.configuration.Constants$ReferrerInfoStatus r1 = com.appsgeyser.sdk.configuration.Constants.ReferrerInfoStatus.FEATURE_NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$appsgeyser$sdk$configuration$Constants$ReferrerInfoStatus     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appsgeyser.sdk.configuration.Constants$ReferrerInfoStatus r1 = com.appsgeyser.sdk.configuration.Constants.ReferrerInfoStatus.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$appsgeyser$sdk$configuration$Constants$ReferrerInfoStatus     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.appsgeyser.sdk.configuration.Constants$ReferrerInfoStatus r1 = com.appsgeyser.sdk.configuration.Constants.ReferrerInfoStatus.REMOTE_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsgeyser.sdk.server.implementation.AppsgeyserServerClient.AnonymousClass3.<clinit>():void");
        }
    }

    private void sendRequestSdkStatisticsWithArgs(String str, int i, Context context) {
        Configuration instance = Configuration.getInstance(context);
        this.networkManager.sendRequestAsync(context.getString(R.string.statDomainUrl) + "sdk_statistics.php?action=" + str + "&wdid=" + instance.getApplicationId() + "&guid=" + instance.getAppGuid() + "&v=" + com.appsgeyser.sdk.configuration.Constants.PLATFORM_VERSION + "&p=android" + DeviceInfoGetter.getDeviceInfo(context) + "&templateversion=" + instance.getTemplateVersion(), Integer.valueOf(i), context, this.networkManager.getEmptyRequestDoneListener(context), this.networkManager.getDefaultErrorListener(Integer.valueOf(i), context));
    }

    /* access modifiers changed from: private */
    public void onGetConfigErrorResponse(Context context, ConfigPhpRequestListener configPhpRequestListener, PreferencesCoder preferencesCoder) {
        String prefString = preferencesCoder.getPrefString("ServerResponse", "");
        if (!prefString.equals("")) {
            try {
                ConfigPhp parseFromJson = ConfigPhp.parseFromJson(prefString);
                this.configPhpModel = parseFromJson;
                configPhpRequestListener.receivedConfigPhp(parseFromJson);
            } catch (JsonParseException e2) {
                Log.d("JsonParseException", e2.toString());
            }
        }
        DataSdkController.onGetConfigErrorResponse(context);
    }

    /* access modifiers changed from: private */
    public void initPush(Context context, String str, boolean z) {
        OneSignalCreator.init(context.getApplicationContext(), str, z);
    }

    public void setConfigPhpModel(ConfigPhp configPhp) {
        this.configPhpModel = configPhp;
    }

    private String getBaseConfigUrl(Context context) {
        byte[] decode = Base64.decode(context.getString(R.string.configDomainUrl), 0);
        StringBuilder sb = new StringBuilder();
        sb.append("appsgeyser.com/");
        sb.append(Hasher.md5(Configuration.getInstance(context).getApplicationId() + ":" + "appsgeyser.com/"));
        byte[] bytes = sb.substring(0, decode.length).getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[i] ^ bytes[i]);
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
