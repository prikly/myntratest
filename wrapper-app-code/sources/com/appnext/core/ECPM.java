package com.appnext.core;

public class ECPM {
    private String banner;
    private float ecpm;
    private float ppr;

    public ECPM(float f2, float f3, String str) {
        this.ecpm = f2;
        this.ppr = f3;
        this.banner = str;
    }

    public float getEcpm() {
        return this.ecpm;
    }

    /* access modifiers changed from: protected */
    public final void a(float f2) {
        this.ecpm = f2;
    }

    public float getPpr() {
        return this.ppr;
    }

    /* access modifiers changed from: protected */
    public final void b(float f2) {
        this.ppr = f2;
    }

    public String getBanner() {
        return this.banner;
    }

    /* access modifiers changed from: protected */
    public final void ac(String str) {
        this.banner = str;
    }
}
