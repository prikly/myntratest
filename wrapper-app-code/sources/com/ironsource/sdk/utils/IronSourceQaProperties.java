package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

public class IronSourceQaProperties {

    /* renamed from: a  reason: collision with root package name */
    private static IronSourceQaProperties f9607a;

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, String> f9608b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f9607a == null) {
            f9607a = new IronSourceQaProperties();
        }
        return f9607a;
    }

    public static boolean isInitialized() {
        return f9607a != null;
    }

    public Map<String, String> getParameters() {
        return f9608b;
    }

    public void setQaParameter(String str, String str2) {
        if (str != null && str2 != null) {
            f9608b.put(str, str2);
        }
    }
}
