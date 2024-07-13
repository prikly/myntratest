package com.appodeal.ads.adapters.admob.unified;

public final class UnifiedAdContainer<T> {
    private T ad;

    public void destroy() {
        this.ad = null;
    }

    public T getAd() {
        return this.ad;
    }

    public void setAd(T t) {
        this.ad = t;
    }
}
