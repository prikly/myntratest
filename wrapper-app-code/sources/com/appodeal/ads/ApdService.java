package com.appodeal.ads;

import android.content.Context;

@Deprecated
public abstract class ApdService {
    private final String name;
    private final String version;

    public ApdService(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public void dispatchInitialize(Context context, ApdServiceInitParams apdServiceInitParams, ApdServiceInitializationListener apdServiceInitializationListener) {
        onInitialize(context, apdServiceInitParams, apdServiceInitializationListener);
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public abstract void onInitialize(Context context, ApdServiceInitParams apdServiceInitParams, ApdServiceInitializationListener apdServiceInitializationListener);

    public void setLogging(boolean z) {
    }
}
