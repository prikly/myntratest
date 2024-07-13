package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinUserSegment;

class g implements AppLovinUserSegment {

    /* renamed from: a  reason: collision with root package name */
    private String f15534a;

    g() {
    }

    public String getName() {
        return this.f15534a;
    }

    public void setName(String str) {
        if (str != null) {
            if (str.length() > 32) {
                v.i("AppLovinUserSegment", "Setting name greater than 32 characters: " + str);
            }
            if (!StringUtils.isAlphaNumeric(str)) {
                v.i("AppLovinUserSegment", "Setting name that is not alphanumeric: " + str);
            }
        }
        this.f15534a = str;
    }

    public String toString() {
        return "AppLovinUserSegment{name=" + getName() + '}';
    }
}
