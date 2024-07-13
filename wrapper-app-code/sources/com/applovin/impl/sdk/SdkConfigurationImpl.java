package com.applovin.impl.sdk;

import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;

public class SdkConfigurationImpl implements AppLovinSdkConfiguration {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f15152a;

    /* renamed from: b  reason: collision with root package name */
    private final n f15153b;

    public SdkConfigurationImpl(List<String> list, n nVar) {
        this.f15152a = list;
        this.f15153b = nVar;
    }

    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = this.f15153b.q().getExtraParameters().get(AppLovinSdkExtraParameterKey.CONSENT_DIALOG_STATE);
        if (!StringUtils.isValidString(str)) {
            str = (String) this.f15153b.a(b.fs);
        }
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.APPLIES : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    public String getCountryCode() {
        return (String) this.f15153b.a(b.ft);
    }

    public List<String> getEnabledAmazonAdUnitIds() {
        return this.f15152a;
    }

    public String toString() {
        return "AppLovinSdkConfiguration{, countryCode=" + getCountryCode() + ", enabledAmazonAdUnitIds=" + getEnabledAmazonAdUnitIds() + '}';
    }
}
