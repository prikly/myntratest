package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.UserSettings;
import com.appodeal.ads.modules.common.internal.data.ConnectionData;

public interface RestrictedData {
    boolean canSendLocation();

    boolean canSendLocationType();

    boolean canSendUserSettings();

    @Deprecated
    Integer getAge();

    String getCity();

    ConnectionData getConnectionData(Context context);

    String getCountry();

    @Deprecated
    UserSettings.Gender getGender();

    String getHttpAgent(Context context);

    String getIabConsentString();

    String getIfa();

    String getIp();

    LocationData getLocation(Context context);

    String getUSPrivacyString();

    String getUserId();

    String getZip();

    boolean isLimitAdTrackingEnabled();

    boolean isParameterBlocked(String str);

    boolean isUserAgeRestricted();

    boolean isUserCcpaProtected();

    boolean isUserGdprProtected();

    boolean isUserHasConsent();

    boolean isUserInCcpaScope();

    boolean isUserInGdprScope();

    boolean isUserProtected();
}
