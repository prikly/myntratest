package com.applovin.sdk;

import java.util.List;

public interface AppLovinSdkConfiguration {

    @Deprecated
    public enum ConsentDialogState {
        UNKNOWN,
        APPLIES,
        DOES_NOT_APPLY
    }

    @Deprecated
    ConsentDialogState getConsentDialogState();

    String getCountryCode();

    List<String> getEnabledAmazonAdUnitIds();
}
