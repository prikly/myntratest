package com.criteo.publisher.advancednative;

import java.net.URL;

public abstract class CriteoMedia {
    /* access modifiers changed from: package-private */
    public abstract URL getImageUrl();

    static CriteoMedia create(URL url) {
        return new d(url);
    }
}
