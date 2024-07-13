package com.ironsource.sdk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FeaturesManager {

    /* renamed from: a  reason: collision with root package name */
    private static volatile FeaturesManager f9080a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, ?> f9081b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<String> f9082c = new ArrayList<String>() {
        {
            add("webviewperad-v1");
            add("noPackagesInstallationPolling");
            add("removeViewOnDestroy");
            add("bannerMultipleInstances");
            add("lastUpdateTimeRemoval");
            add("isnFileSystemAPI");
            add("controlActivityLifecycle");
            add("bannersOpenMeasurement");
        }
    };

    private FeaturesManager() {
        if (f9080a == null) {
            this.f9081b = new HashMap();
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    public static FeaturesManager getInstance() {
        if (f9080a == null) {
            synchronized (FeaturesManager.class) {
                if (f9080a == null) {
                    f9080a = new FeaturesManager();
                }
            }
        }
        return f9080a;
    }

    /* access modifiers changed from: package-private */
    public final ArrayList<String> a() {
        return new ArrayList<>(this.f9082c);
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f9081b.containsKey("debugMode")) {
                num = (Integer) this.f9081b.get("debugMode");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map != null) {
            this.f9081b = map;
        }
    }
}
