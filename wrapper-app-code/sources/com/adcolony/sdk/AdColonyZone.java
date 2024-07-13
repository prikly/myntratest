package com.adcolony.sdk;

import com.adcolony.sdk.e0;

public class AdColonyZone {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 0;
    @Deprecated
    public static final int NATIVE = 2;

    /* renamed from: a  reason: collision with root package name */
    private String f9864a;

    /* renamed from: b  reason: collision with root package name */
    private String f9865b;

    /* renamed from: c  reason: collision with root package name */
    private int f9866c = 5;

    /* renamed from: d  reason: collision with root package name */
    private int f9867d;

    /* renamed from: e  reason: collision with root package name */
    private int f9868e;

    /* renamed from: f  reason: collision with root package name */
    private int f9869f;

    /* renamed from: g  reason: collision with root package name */
    private int f9870g;

    /* renamed from: h  reason: collision with root package name */
    private int f9871h;
    private int i;
    private boolean j;
    private boolean k;

    AdColonyZone(String str) {
        this.f9864a = str;
    }

    private int a(int i2) {
        if (a.d() && !a.b().E() && !a.b().F()) {
            return i2;
        }
        b();
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        this.i = i2;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        this.f9866c = i2;
    }

    public int getPlayFrequency() {
        return a(this.f9870g);
    }

    public int getRemainingViewsUntilReward() {
        return a(this.f9868e);
    }

    public int getRewardAmount() {
        return a(this.f9871h);
    }

    public String getRewardName() {
        return a(this.f9865b);
    }

    public int getViewsPerReward() {
        return a(this.f9869f);
    }

    public String getZoneID() {
        return a(this.f9864a);
    }

    public int getZoneType() {
        return this.f9867d;
    }

    public boolean isRewarded() {
        return this.k;
    }

    public boolean isValid() {
        return a(this.j);
    }

    private void b() {
        new e0.a().a("The AdColonyZone API is not available while AdColony is disabled.").a(e0.f10045h);
    }

    private boolean a(boolean z) {
        if (a.d() && !a.b().E() && !a.b().F()) {
            return z;
        }
        b();
        return false;
    }

    private String a(String str) {
        return a(str, "");
    }

    private String a(String str, String str2) {
        if (a.d() && !a.b().E() && !a.b().F()) {
            return str;
        }
        b();
        return str2;
    }

    /* access modifiers changed from: package-private */
    public void a(h0 h0Var) {
        f1 a2 = h0Var.a();
        f1 f2 = c0.f(a2, "reward");
        this.f9865b = c0.h(f2, "reward_name");
        this.f9871h = c0.d(f2, "reward_amount");
        this.f9869f = c0.d(f2, "views_per_reward");
        this.f9868e = c0.d(f2, "views_until_reward");
        this.k = c0.b(a2, "rewarded");
        this.f9866c = c0.d(a2, "status");
        this.f9867d = c0.d(a2, "type");
        this.f9870g = c0.d(a2, "play_interval");
        this.f9864a = c0.h(a2, "zone_id");
        boolean z = true;
        if (this.f9866c == 1) {
            z = false;
        }
        this.j = z;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.i;
    }
}
