package io.bidmachine.models;

public interface DataRestrictions {
    boolean canSendDeviceInfo();

    boolean canSendGeoPosition();

    boolean canSendIfa();

    boolean canSendUserInfo();

    String getIABGDPRString();

    String getUSPrivacyString();

    boolean isUserAgeRestricted();

    boolean isUserGdprProtected();

    boolean isUserHasCcpaConsent();

    boolean isUserHasConsent();

    boolean isUserInCcpaScope();

    boolean isUserInGdprScope();
}
