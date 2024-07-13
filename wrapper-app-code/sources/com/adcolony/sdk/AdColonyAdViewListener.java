package com.adcolony.sdk;

public abstract class AdColonyAdViewListener {

    /* renamed from: a  reason: collision with root package name */
    String f9822a = "";

    /* renamed from: b  reason: collision with root package name */
    AdColonyAdSize f9823b;

    /* renamed from: c  reason: collision with root package name */
    p0 f9824c;

    /* access modifiers changed from: package-private */
    public AdColonyAdSize a() {
        return this.f9823b;
    }

    /* access modifiers changed from: package-private */
    public p0 b() {
        return this.f9824c;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f9822a;
    }

    public void onClicked(AdColonyAdView adColonyAdView) {
    }

    public void onClosed(AdColonyAdView adColonyAdView) {
    }

    public void onLeftApplication(AdColonyAdView adColonyAdView) {
    }

    public void onOpened(AdColonyAdView adColonyAdView) {
    }

    public abstract void onRequestFilled(AdColonyAdView adColonyAdView);

    public void onRequestNotFilled(AdColonyZone adColonyZone) {
    }

    public void onShow(AdColonyAdView adColonyAdView) {
    }

    /* access modifiers changed from: package-private */
    public void a(p0 p0Var) {
        this.f9824c = p0Var;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.f9822a = str;
    }

    /* access modifiers changed from: package-private */
    public void a(AdColonyAdSize adColonyAdSize) {
        this.f9823b = adColonyAdSize;
    }
}
