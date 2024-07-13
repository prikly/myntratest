package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.v;

public class AppLovinPrivacySettings {
    public static boolean hasUserConsent(Context context) {
        v.f("AppLovinPrivacySettings", "hasUserConsent()");
        Boolean a2 = k.b().a(context);
        if (a2 != null) {
            return a2.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        v.f("AppLovinPrivacySettings", "isAgeRestrictedUser()");
        Boolean a2 = k.a().a(context);
        if (a2 != null) {
            return a2.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUserSet(Context context) {
        v.f("AppLovinPrivacySettings", "isAgeRestrictedUserSet()");
        return k.a().a(context) != null;
    }

    public static boolean isDoNotSell(Context context) {
        v.f("AppLovinPrivacySettings", "isDoNotSell()");
        Boolean a2 = k.c().a(context);
        if (a2 != null) {
            return a2.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        v.f("AppLovinPrivacySettings", "isDoNotSellSet()");
        return k.c().a(context) != null;
    }

    public static boolean isUserConsentSet(Context context) {
        v.f("AppLovinPrivacySettings", "isUserConsentSet()");
        return k.b().a(context) != null;
    }

    public static void setDoNotSell(boolean z, Context context) {
        v.f("AppLovinPrivacySettings", "setDoNotSell()");
        if (k.c(z, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, (Boolean) null, Boolean.valueOf(z));
        }
    }

    public static void setHasUserConsent(boolean z, Context context) {
        v.f("AppLovinPrivacySettings", "setHasUserConsent()");
        if (k.b(z, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z), (Boolean) null, (Boolean) null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z, Context context) {
        v.f("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (k.a(z, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, Boolean.valueOf(z), (Boolean) null);
        }
    }
}
