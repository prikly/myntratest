package com.appsgeyser.sdk.inapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class DisableAdsSharedPrefs {
    private static DisableAdsSharedPrefs instance;
    private final String DISABLE_ADS_KEY = "disable_ads_key";
    private final String DISABLE_ADS_NAME = "DISABLE_ADS_NAME";
    private SharedPreferences sharedPrefs = null;

    public void init(Context context) {
        this.sharedPrefs = context.getSharedPreferences("DISABLE_ADS_NAME", 0);
    }

    public static DisableAdsSharedPrefs getInstance() {
        if (instance == null) {
            instance = new DisableAdsSharedPrefs();
        }
        return instance;
    }

    private DisableAdsSharedPrefs() {
    }

    public void saveDisableAdsPurchaseFlag(boolean z) {
        this.sharedPrefs.edit().putBoolean("disable_ads_key", z).apply();
    }

    public boolean getDisableAdsActiveFlag() {
        return this.sharedPrefs.getBoolean("disable_ads_key", false);
    }
}
