package com.appsgeyser.sdk.ads;

import android.content.Context;
import com.appsgeyser.sdk.configuration.Configuration;
import com.appsgeyser.sdk.hasher.Hasher;

public abstract class BaseSecureJsInterface {
    /* access modifiers changed from: protected */
    public boolean checkSecurityCode(String str, Context context) {
        Configuration instance = Configuration.getInstance(context);
        String applicationId = instance.getApplicationId();
        String appGuid = instance.getAppGuid();
        return str.equalsIgnoreCase(Hasher.md5(appGuid + applicationId));
    }
}
