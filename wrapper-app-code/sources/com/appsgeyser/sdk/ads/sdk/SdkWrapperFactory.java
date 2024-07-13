package com.appsgeyser.sdk.ads.sdk;

import java.security.InvalidParameterException;
import java.util.HashMap;

class SdkWrapperFactory {
    private static final SdkWrapperFactory INSTANCE = new SdkWrapperFactory();
    private final HashMap<String, SdkWrapper> map = new HashMap<>();

    private SdkWrapperFactory() {
    }

    /* access modifiers changed from: package-private */
    public SdkWrapper getWrapperByKey(String str) throws InvalidParameterException {
        if (this.map.get(str) == null) {
            SdkWrapper newInstance = newInstance(str);
            if (newInstance != null) {
                this.map.put(str, newInstance);
            } else {
                throw new InvalidParameterException("Could not create wrapper for " + str);
            }
        }
        return this.map.get(str);
    }

    static SdkWrapperFactory getInstance() {
        return INSTANCE;
    }

    private SdkWrapper newInstance(String str) {
        if (((str.hashCode() == -75196300 && str.equals("APPNEXT")) ? (char) 0 : 65535) != 0) {
            return null;
        }
        return new AppNextSdkWrapper();
    }
}
