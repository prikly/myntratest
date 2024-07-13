package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bykv.vk.openvk.component.video.api.b;
import com.bytedance.sdk.openadsdk.core.m;

public final class TTAdConfig {

    /* renamed from: a  reason: collision with root package name */
    private String f19332a;

    /* renamed from: b  reason: collision with root package name */
    private String f19333b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19334c;

    /* renamed from: d  reason: collision with root package name */
    private String f19335d;

    /* renamed from: e  reason: collision with root package name */
    private String f19336e;

    /* renamed from: f  reason: collision with root package name */
    private int f19337f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19338g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19339h;
    private boolean i;
    private boolean j;
    private String[] k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private String p;
    private int q;
    private int r;

    private TTAdConfig() {
        this.f19334c = false;
        this.f19337f = 0;
        boolean z = true;
        this.f19338g = true;
        this.f19339h = false;
        this.i = Build.VERSION.SDK_INT < 14 ? false : z;
        this.j = false;
        this.l = false;
        this.m = -1;
        this.n = -1;
        this.o = -1;
    }

    public void setPackageName(String str) {
        this.p = str;
    }

    public String getPackageName() {
        return this.p;
    }

    public void setCoppa(int i2) {
        this.m = i2;
    }

    public int getCoppa() {
        return this.m;
    }

    public void setGDPR(int i2) {
        this.n = i2;
    }

    public int getGDPR() {
        return this.n;
    }

    public void setCcpa(int i2) {
        this.o = i2;
    }

    public int getCcpa() {
        return this.o;
    }

    public String getAppId() {
        return this.f19332a;
    }

    public void setAppId(String str) {
        this.f19332a = str;
    }

    public String getAppName() {
        String str = this.f19333b;
        if (str == null || str.isEmpty()) {
            this.f19333b = a(m.a());
        }
        return this.f19333b;
    }

    public void setAppName(String str) {
        this.f19333b = str;
    }

    public int getAppIconId() {
        return this.r;
    }

    public void setAppIcon(int i2) {
        this.r = i2;
    }

    public boolean isPaid() {
        return this.f19334c;
    }

    public void setPaid(boolean z) {
        this.f19334c = z;
    }

    public String getKeywords() {
        return this.f19335d;
    }

    public void setKeywords(String str) {
        this.f19335d = str;
    }

    public String getData() {
        return this.f19336e;
    }

    public void setData(String str) {
        this.f19336e = str;
    }

    public int getTitleBarTheme() {
        return this.f19337f;
    }

    public void setTitleBarTheme(int i2) {
        this.f19337f = i2;
    }

    public boolean isAllowShowNotify() {
        return this.f19338g;
    }

    public void setAllowShowNotify(boolean z) {
        this.f19338g = z;
    }

    public boolean isDebug() {
        return this.f19339h;
    }

    public void setDebug(boolean z) {
        this.f19339h = z;
    }

    public boolean isUseTextureView() {
        return this.i;
    }

    public void setUseTextureView(boolean z) {
        this.i = z;
    }

    public boolean isSupportMultiProcess() {
        return this.j;
    }

    public void setSupportMultiProcess(boolean z) {
        this.j = z;
        b.a(z);
    }

    public String[] getNeedClearTaskReset() {
        return this.k;
    }

    public void setNeedClearTaskReset(String... strArr) {
        this.k = strArr;
    }

    public boolean isAsyncInit() {
        return this.l;
    }

    public void setAsyncInit(boolean z) {
        this.l = z;
    }

    private String a(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public int getDebugLog() {
        return this.q;
    }

    public void setDebugLog(int i2) {
        this.q = i2;
    }

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f19340a;

        /* renamed from: b  reason: collision with root package name */
        private String f19341b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f19342c = false;

        /* renamed from: d  reason: collision with root package name */
        private String f19343d;

        /* renamed from: e  reason: collision with root package name */
        private String f19344e;

        /* renamed from: f  reason: collision with root package name */
        private int f19345f = 0;

        /* renamed from: g  reason: collision with root package name */
        private boolean f19346g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f19347h;
        private boolean i;
        private boolean j;
        private String[] k;
        private boolean l;
        private int m;
        private int n;
        private int o;
        private int p;
        private String q;
        private int r;

        @Deprecated
        public Builder allowShowPageWhenScreenLock(boolean z) {
            return this;
        }

        public Builder() {
            boolean z = true;
            this.f19346g = true;
            this.f19347h = false;
            this.i = Build.VERSION.SDK_INT < 14 ? false : z;
            this.j = false;
            this.l = false;
            this.m = -1;
            this.n = -1;
            this.o = -1;
        }

        public Builder coppa(int i2) {
            this.m = i2;
            return this;
        }

        public Builder setGDPR(int i2) {
            this.n = i2;
            return this;
        }

        public Builder setCCPA(int i2) {
            this.o = i2;
            return this;
        }

        public Builder appId(String str) {
            this.f19340a = str;
            return this;
        }

        public Builder appIcon(int i2) {
            this.r = i2;
            return this;
        }

        @Deprecated
        public Builder appName(String str) {
            this.f19341b = str;
            return this;
        }

        @Deprecated
        public Builder paid(boolean z) {
            this.f19342c = z;
            return this;
        }

        @Deprecated
        public Builder keywords(String str) {
            this.f19343d = str;
            return this;
        }

        public Builder data(String str) {
            this.f19344e = str;
            return this;
        }

        @Deprecated
        public Builder titleBarTheme(int i2) {
            this.f19345f = i2;
            return this;
        }

        @Deprecated
        public Builder allowShowNotify(boolean z) {
            this.f19346g = z;
            return this;
        }

        public Builder debug(boolean z) {
            this.f19347h = z;
            return this;
        }

        public Builder useTextureView(boolean z) {
            this.i = z;
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            this.j = z;
            return this;
        }

        @Deprecated
        public Builder needClearTaskReset(String... strArr) {
            this.k = strArr;
            return this;
        }

        public Builder asyncInit(boolean z) {
            this.l = z;
            return this;
        }

        public Builder debugLog(int i2) {
            this.p = i2;
            return this;
        }

        public Builder setPackageName(String str) {
            this.q = str;
            return this;
        }

        public TTAdConfig build() {
            TTAdConfig tTAdConfig = new TTAdConfig();
            tTAdConfig.setAppId(this.f19340a);
            tTAdConfig.setCoppa(this.m);
            tTAdConfig.setAppName(this.f19341b);
            tTAdConfig.setAppIcon(this.r);
            tTAdConfig.setPaid(this.f19342c);
            tTAdConfig.setKeywords(this.f19343d);
            tTAdConfig.setData(this.f19344e);
            tTAdConfig.setTitleBarTheme(this.f19345f);
            tTAdConfig.setAllowShowNotify(this.f19346g);
            tTAdConfig.setDebug(this.f19347h);
            tTAdConfig.setUseTextureView(this.i);
            tTAdConfig.setSupportMultiProcess(this.j);
            tTAdConfig.setNeedClearTaskReset(this.k);
            tTAdConfig.setAsyncInit(this.l);
            tTAdConfig.setGDPR(this.n);
            tTAdConfig.setCcpa(this.o);
            tTAdConfig.setDebugLog(this.p);
            tTAdConfig.setPackageName(this.q);
            return tTAdConfig;
        }
    }
}
