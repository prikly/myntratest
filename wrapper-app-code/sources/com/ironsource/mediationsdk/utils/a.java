package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f8888a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8889b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8890c = false;

    public final void a(IronSource.AD_UNIT ad_unit, boolean z) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f8888a = z;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f8889b = z;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f8890c = z;
        }
    }

    public final boolean a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f8888a;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f8889b;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f8890c;
        }
        return false;
    }
}
