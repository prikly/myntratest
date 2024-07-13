package com.appsgeyser.sdk.ads.sdk;

import android.content.Context;
import com.appsgeyser.sdk.InternalEntryPoint;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import java.util.HashMap;
import java.util.Map;

abstract class SdkWrapper {
    protected Context context;
    private boolean isActive = false;
    HashMap<String, String> parameters;
    protected AppsgeyserProgressDialog progressDialog;

    public abstract void showFsBanner();

    SdkWrapper() {
    }

    /* access modifiers changed from: package-private */
    public void addExtras(HashMap<String, String> hashMap) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        for (Map.Entry next : hashMap.entrySet()) {
            this.parameters.put((String) next.getKey(), (String) next.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public void startSession(Context context2) {
        this.progressDialog = new AppsgeyserProgressDialog(context2);
        if (this.isActive) {
            stopSession();
        }
        this.context = context2;
        this.isActive = true;
        InternalEntryPoint.getInstance().getFullScreenBanner(context2).close();
    }

    /* access modifiers changed from: package-private */
    public void stopSession() {
        this.isActive = false;
    }

    /* access modifiers changed from: package-private */
    public boolean isActive() {
        return this.isActive;
    }
}
