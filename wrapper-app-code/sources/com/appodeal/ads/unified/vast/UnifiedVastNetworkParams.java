package com.appodeal.ads.unified.vast;

import com.appodeal.ads.RestrictedData;

public class UnifiedVastNetworkParams {
    public final String adm;
    public final boolean autoClose;
    public final int closeTime;
    public final long expiryTime;
    public final String packageName;
    public final RestrictedData restrictedData;
    public final String vastUrl;

    public static class Builder {
        public String adm;
        public boolean autoClose;
        public int closeTime;
        public long expiryTime;
        public String packageName;
        public RestrictedData restrictedData;
        public String vastUrl;

        public Builder(RestrictedData restrictedData2) {
            this.restrictedData = restrictedData2;
        }

        public Builder(UnifiedVastNetworkParams unifiedVastNetworkParams) {
            this.restrictedData = unifiedVastNetworkParams.restrictedData;
            this.adm = unifiedVastNetworkParams.adm;
            this.vastUrl = unifiedVastNetworkParams.vastUrl;
            this.packageName = unifiedVastNetworkParams.packageName;
            this.expiryTime = unifiedVastNetworkParams.expiryTime;
            this.closeTime = unifiedVastNetworkParams.closeTime;
            this.autoClose = unifiedVastNetworkParams.autoClose;
        }

        public UnifiedVastNetworkParams build() {
            return new UnifiedVastNetworkParams(this.restrictedData, this.adm, this.vastUrl, this.packageName, this.closeTime, this.expiryTime, this.autoClose);
        }

        public Builder setAdm(String str) {
            this.adm = str;
            return this;
        }

        public Builder setAutoClose(boolean z) {
            this.autoClose = z;
            return this;
        }

        public Builder setCloseTime(int i) {
            this.closeTime = i;
            return this;
        }

        public Builder setExpiryTime(long j) {
            this.expiryTime = j;
            return this;
        }

        public Builder setPackageName(String str) {
            this.packageName = str;
            return this;
        }

        public Builder setVastUrl(String str) {
            this.vastUrl = str;
            return this;
        }
    }

    public UnifiedVastNetworkParams(RestrictedData restrictedData2, String str, String str2, String str3, int i, long j, boolean z) {
        this.restrictedData = restrictedData2;
        this.adm = str;
        this.vastUrl = str2;
        this.packageName = str3;
        this.closeTime = i;
        this.expiryTime = j;
        this.autoClose = z;
    }
}
