package com.appsgeyser.sdk.configuration.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackSdkModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Map;

public class ConfigPhp implements Parcelable {
    public static final Parcelable.Creator<ConfigPhp> CREATOR = new Parcelable.Creator<ConfigPhp>() {
        public ConfigPhp createFromParcel(Parcel parcel) {
            return new ConfigPhp(parcel);
        }

        public ConfigPhp[] newArray(int i) {
            return new ConfigPhp[i];
        }
    };
    @SerializedName("about_screen_description")
    private String aboutScreenDescription;
    @SerializedName("about_screen_description_type")
    private String aboutScreenDescriptionType;
    private FastTrackSdkModel activeAdsSDK;
    @SerializedName("additional_js_code")
    private String additionalJsCode;
    private Map<String, AdNetworkSdkModel> adsNetworkSdk;
    @SerializedName("app_ban_active")
    private boolean appBanActive;
    @SerializedName("appsgeyserAuth")
    private String appsgeyserAccess;
    @SerializedName("appsgeyserDisableAds")
    private String appsgeyserDisableAds;
    private ConfigPhpSdkModel appsgeyserSdk;
    private int countOfTry;
    private String country;
    @SerializedName("custom_html_about_active")
    private boolean customAboutActive;
    private String eulaBeginning;
    @SerializedName("firebaseActive")
    private boolean firebaseActive;
    @SerializedName("firebaseApiKey")
    private String firebaseApiKey;
    @SerializedName("firebaseApplicationId")
    private String firebaseApplicationId;
    @SerializedName("firebaseDataBaseUrl")
    private String firebaseDataBaseUrl;
    @SerializedName("firebaseStorageBucket")
    private String firebaseStorageBucket;
    private long fullScreenDelay;
    private int fullscreenBannerCountToShow;
    private Map<String, AdNetworkSdkModel> fullscreenSdk;
    private boolean inAppPurchasesActive;
    @SerializedName("period_days")
    private int inactivityDaysPeriod;
    @SerializedName("turn_on_inactivity_reminder")
    private boolean inactivityReminderEnabled;
    @SerializedName("text_reminder")
    private String inactivityReminderText;
    @SerializedName("enable_about_screen")
    private boolean isAboutScreenEnabled;
    @SerializedName("startup_confirmation_dialog")
    private boolean isAdvertisingTermsDialog;
    @SerializedName("isInappUpdateEnabled")
    private boolean isInappUpdateEnabled;
    private boolean isOnResumeFSEnabled;
    private boolean isOnTouchFSEnabled;
    private boolean isTakeOffFSEnabled;
    @SerializedName("oneSignalAppId")
    private String oneSignalAppId;
    private boolean pushNotificationsActive;
    @SerializedName("rateMyAppActive")
    private boolean rateMyAppActive;
    private Map<String, AdNetworkSdkModel> rewardedVideoSdk;
    @SerializedName("startup_dialog_allowing_use_if_decline")
    private boolean startupELUAConfirmationDialogAllow;
    private Map<String, String> statUrls;

    public int describeContents() {
        return 0;
    }

    private ConfigPhp(Parcel parcel) {
        boolean z = true;
        this.isAboutScreenEnabled = true;
        this.aboutScreenDescriptionType = RewardedVideo.VIDEO_MODE_DEFAULT;
        this.startupELUAConfirmationDialogAllow = true;
        this.isTakeOffFSEnabled = false;
        this.isOnResumeFSEnabled = false;
        this.isOnTouchFSEnabled = true;
        this.fullScreenDelay = -1;
        this.fullscreenBannerCountToShow = 1;
        this.appsgeyserSdk = (ConfigPhpSdkModel) parcel.readParcelable(ConfigPhpSdkModel.class.getClassLoader());
        this.isAboutScreenEnabled = parcel.readByte() != 0;
        this.isAdvertisingTermsDialog = parcel.readByte() != 0;
        this.country = parcel.readString();
        this.eulaBeginning = parcel.readString();
        this.pushNotificationsActive = parcel.readByte() != 0;
        this.countOfTry = parcel.readInt();
        this.aboutScreenDescriptionType = parcel.readString();
        this.aboutScreenDescription = parcel.readString();
        this.startupELUAConfirmationDialogAllow = parcel.readByte() != 0;
        this.rateMyAppActive = parcel.readByte() != 0;
        this.customAboutActive = parcel.readByte() != 0;
        this.appBanActive = parcel.readByte() != 0;
        this.inAppPurchasesActive = parcel.readByte() != 0;
        this.additionalJsCode = parcel.readString();
        this.inactivityReminderEnabled = parcel.readByte() != 0;
        this.inactivityDaysPeriod = parcel.readInt();
        this.inactivityReminderText = parcel.readString();
        this.oneSignalAppId = parcel.readString();
        this.appsgeyserAccess = parcel.readString();
        this.appsgeyserDisableAds = parcel.readString();
        this.isInappUpdateEnabled = parcel.readByte() != 0;
        this.firebaseActive = parcel.readByte() == 0 ? false : z;
        this.firebaseApplicationId = parcel.readString();
        this.firebaseApiKey = parcel.readString();
        this.firebaseDataBaseUrl = parcel.readString();
        this.firebaseStorageBucket = parcel.readString();
    }

    public static ConfigPhp parseFromJson(String str) throws JsonSyntaxException {
        Gson create = new GsonBuilder().setLenient().create();
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        jsonReader.setLenient(true);
        return (ConfigPhp) create.fromJson(jsonReader, (Type) ConfigPhp.class);
    }

    public ConfigPhp() {
        this.isAboutScreenEnabled = true;
        this.aboutScreenDescriptionType = RewardedVideo.VIDEO_MODE_DEFAULT;
        this.startupELUAConfirmationDialogAllow = true;
        this.isTakeOffFSEnabled = false;
        this.isOnResumeFSEnabled = false;
        this.isOnTouchFSEnabled = true;
        this.fullScreenDelay = -1;
        this.fullscreenBannerCountToShow = 1;
    }

    public ConfigPhpSdkModel getAppsgeyserSdk() {
        return this.appsgeyserSdk;
    }

    public String getAboutScreenDescriptionType() {
        return this.aboutScreenDescriptionType;
    }

    public String getAboutScreenDescription() {
        return this.aboutScreenDescription;
    }

    public boolean getStartupELUAConfirmationDialogAllow() {
        return this.startupELUAConfirmationDialogAllow;
    }

    public String getEulaBeginning() {
        return this.eulaBeginning;
    }

    public int getCountOfTry() {
        return this.countOfTry;
    }

    public Map<String, String> getStatUrls() {
        return this.statUrls;
    }

    public boolean isAboutScreenEnabled() {
        return this.isAboutScreenEnabled;
    }

    public boolean isPushNotificationsActive() {
        return this.pushNotificationsActive;
    }

    public boolean isAdvertisingTermsDialog() {
        return this.isAdvertisingTermsDialog;
    }

    public boolean isAppBanActive() {
        return this.appBanActive;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.appsgeyserSdk, i);
        parcel.writeByte(this.isAboutScreenEnabled ? (byte) 1 : 0);
        parcel.writeByte(this.isAdvertisingTermsDialog ? (byte) 1 : 0);
        parcel.writeString(this.country);
        parcel.writeString(this.eulaBeginning);
        parcel.writeByte(this.pushNotificationsActive ? (byte) 1 : 0);
        parcel.writeInt(this.countOfTry);
        parcel.writeString(this.aboutScreenDescriptionType);
        parcel.writeString(this.aboutScreenDescription);
        parcel.writeByte(this.startupELUAConfirmationDialogAllow ? (byte) 1 : 0);
        parcel.writeByte(this.rateMyAppActive ? (byte) 1 : 0);
        parcel.writeByte(this.customAboutActive ? (byte) 1 : 0);
        parcel.writeByte(this.appBanActive ? (byte) 1 : 0);
        parcel.writeByte(this.inAppPurchasesActive ? (byte) 1 : 0);
        parcel.writeString(this.additionalJsCode);
        parcel.writeByte(this.inactivityReminderEnabled ? (byte) 1 : 0);
        parcel.writeInt(this.inactivityDaysPeriod);
        parcel.writeString(this.inactivityReminderText);
        parcel.writeString(this.oneSignalAppId);
        parcel.writeString(this.appsgeyserAccess);
        parcel.writeString(this.appsgeyserDisableAds);
        parcel.writeByte(this.isInappUpdateEnabled ? (byte) 1 : 0);
        parcel.writeByte(this.firebaseActive ? (byte) 1 : 0);
        parcel.writeString(this.firebaseApplicationId);
        parcel.writeString(this.firebaseApiKey);
        parcel.writeString(this.firebaseDataBaseUrl);
        parcel.writeString(this.firebaseStorageBucket);
    }

    public Map<String, AdNetworkSdkModel> getAdsNetworkSdk() {
        return this.adsNetworkSdk;
    }

    public boolean isOfferWallEnabled() {
        Map<String, AdNetworkSdkModel> map = this.adsNetworkSdk;
        if (map != null && map.size() > 0) {
            for (AdNetworkSdkModel isActive : this.adsNetworkSdk.values()) {
                if (isActive.isActive()) {
                    return true;
                }
            }
        }
        return false;
    }

    public Map<String, AdNetworkSdkModel> getRewardedVideoSdk() {
        return this.rewardedVideoSdk;
    }

    public long getFullScreenDelay() {
        return this.fullScreenDelay;
    }

    public Map<String, AdNetworkSdkModel> getFullscreenSdk() {
        return this.fullscreenSdk;
    }

    public boolean isTakeOffFSEnabled() {
        return this.isTakeOffFSEnabled;
    }

    public boolean isOnResumeFSEnabled() {
        return this.isOnResumeFSEnabled;
    }

    public boolean isOnTouchFSEnabled() {
        return this.isOnTouchFSEnabled;
    }

    public int getFullscreenBannerCountToShow() {
        return this.fullscreenBannerCountToShow;
    }

    public FastTrackSdkModel getActiveAdsSDK() {
        return this.activeAdsSDK;
    }

    public boolean isRateMyAppActive() {
        return this.rateMyAppActive;
    }

    public boolean isCustomAboutActive() {
        return this.customAboutActive;
    }

    public String getAdditionalJsCode() {
        return this.additionalJsCode;
    }

    public boolean isInactivityReminderEnabled() {
        return this.inactivityReminderEnabled;
    }

    public int getInactivityDaysPeriod() {
        int i = this.inactivityDaysPeriod;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public String getInactivityReminderText() {
        return this.inactivityReminderText;
    }

    public String getOneSignalAppId() {
        return this.oneSignalAppId;
    }

    public String getAppsgeyserAccess() {
        return this.appsgeyserAccess;
    }

    public String getAppsgeyserDisableAds() {
        return this.appsgeyserDisableAds;
    }

    public boolean isInappUpdateEnabled() {
        return this.isInappUpdateEnabled;
    }
}
