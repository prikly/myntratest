package com.appodeal.ads.unified.mraid;

import com.appodeal.ads.RestrictedData;

public class UnifiedMraidNetworkParams {
    public final String adUrl;
    public final String adm;
    public final String baseUrl;
    public final int closeTime;
    public final long expiryTime;
    public final int height;
    public final boolean isTag;
    public final String packageName;
    public final String pageFinishedScript;
    public final boolean preload;
    public final RestrictedData restrictedData;
    public final int width;

    public static class Builder {
        private String adUrl;
        private String adm;
        private String baseUrl;
        private int closeTime = -1;
        private long expiryTime;
        private int height;
        private boolean isTag;
        private String packageName;
        private String pageFinishedScript;
        private boolean preload;
        private final RestrictedData restrictedData;
        private int width;

        public Builder(RestrictedData restrictedData2) {
            this.restrictedData = restrictedData2;
        }

        public Builder(UnifiedMraidNetworkParams unifiedMraidNetworkParams) {
            this.restrictedData = unifiedMraidNetworkParams.restrictedData;
            this.packageName = unifiedMraidNetworkParams.packageName;
            this.baseUrl = unifiedMraidNetworkParams.baseUrl;
            this.adm = unifiedMraidNetworkParams.adm;
            this.adUrl = unifiedMraidNetworkParams.adUrl;
            this.pageFinishedScript = unifiedMraidNetworkParams.pageFinishedScript;
            this.expiryTime = unifiedMraidNetworkParams.expiryTime;
            this.preload = unifiedMraidNetworkParams.preload;
            this.isTag = unifiedMraidNetworkParams.isTag;
            this.width = unifiedMraidNetworkParams.width;
            this.height = unifiedMraidNetworkParams.height;
            this.closeTime = unifiedMraidNetworkParams.closeTime;
        }

        public UnifiedMraidNetworkParams build() {
            return new UnifiedMraidNetworkParams(this.restrictedData, this.packageName, this.baseUrl, this.adm, this.adUrl, this.pageFinishedScript, this.expiryTime, this.preload, this.isTag, this.width, this.height, this.closeTime);
        }

        public Builder setAdUrl(String str) {
            this.adUrl = str;
            return this;
        }

        public Builder setAdm(String str) {
            this.adm = str;
            return this;
        }

        public Builder setBaseUrl(String str) {
            this.baseUrl = str;
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

        public Builder setHeight(int i) {
            this.height = i;
            return this;
        }

        public Builder setIsTag(boolean z) {
            this.isTag = z;
            return this;
        }

        public Builder setPackageName(String str) {
            this.packageName = str;
            return this;
        }

        public Builder setPageFinishedScript(String str) {
            this.pageFinishedScript = str;
            return this;
        }

        public Builder setPreload(boolean z) {
            this.preload = z;
            return this;
        }

        public Builder setWidth(int i) {
            this.width = i;
            return this;
        }
    }

    public UnifiedMraidNetworkParams(RestrictedData restrictedData2, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2, int i, int i2, int i3) {
        this.restrictedData = restrictedData2;
        this.packageName = str;
        this.baseUrl = str2;
        this.adm = str3;
        this.adUrl = str4;
        this.pageFinishedScript = str5;
        this.expiryTime = j;
        this.preload = z;
        this.isTag = z2;
        this.width = i;
        this.height = i2;
        this.closeTime = i3;
    }
}
