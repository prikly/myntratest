package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.ub  reason: case insensitive filesystem */
public class C0747ub {

    /* renamed from: a  reason: collision with root package name */
    public final C0723tb f6881a;

    /* renamed from: b  reason: collision with root package name */
    public final U0 f6882b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6883c;

    public C0747ub() {
        this((C0723tb) null, U0.UNKNOWN, "identifier info has never been updated");
    }

    public boolean a() {
        C0723tb tbVar = this.f6881a;
        return tbVar != null && !TextUtils.isEmpty(tbVar.f6825b);
    }

    public String toString() {
        return "AdTrackingInfoResult{mAdTrackingInfo=" + this.f6881a + ", mStatus=" + this.f6882b + ", mErrorExplanation='" + this.f6883c + '\'' + '}';
    }

    public C0747ub(C0723tb tbVar, U0 u0, String str) {
        this.f6881a = tbVar;
        this.f6882b = u0;
        this.f6883c = str;
    }
}
