package com.adcolony.sdk;

public class AdColonyAdOptions {

    /* renamed from: a  reason: collision with root package name */
    boolean f9806a;

    /* renamed from: b  reason: collision with root package name */
    boolean f9807b;

    /* renamed from: c  reason: collision with root package name */
    AdColonyUserMetadata f9808c;

    /* renamed from: d  reason: collision with root package name */
    f1 f9809d = c0.b();

    public AdColonyAdOptions enableConfirmationDialog(boolean z) {
        this.f9806a = z;
        c0.b(this.f9809d, "confirmation_enabled", true);
        return this;
    }

    public AdColonyAdOptions enableResultsDialog(boolean z) {
        this.f9807b = z;
        c0.b(this.f9809d, "results_enabled", true);
        return this;
    }

    public Object getOption(String str) {
        return c0.g(this.f9809d, str);
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f9808c;
    }

    public AdColonyAdOptions setOption(String str, boolean z) {
        if (z0.e(str)) {
            c0.b(this.f9809d, str, z);
        }
        return this;
    }

    @Deprecated
    public AdColonyAdOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f9808c = adColonyUserMetadata;
        c0.a(this.f9809d, "user_metadata", adColonyUserMetadata.f9862b);
        return this;
    }

    public AdColonyAdOptions setOption(String str, double d2) {
        if (z0.e(str)) {
            c0.a(this.f9809d, str, d2);
        }
        return this;
    }

    public AdColonyAdOptions setOption(String str, String str2) {
        if (str != null) {
            c0.a(this.f9809d, str, str2);
        }
        return this;
    }
}
