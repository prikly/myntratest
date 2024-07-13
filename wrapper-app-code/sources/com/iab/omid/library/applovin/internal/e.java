package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.applovin.weakreference.a;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final a f7672a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7673b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f7674c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7675d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f7672a = new a(view);
        this.f7673b = view.getClass().getCanonicalName();
        this.f7674c = friendlyObstructionPurpose;
        this.f7675d = str;
    }

    public String a() {
        return this.f7675d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f7674c;
    }

    public a c() {
        return this.f7672a;
    }

    public String d() {
        return this.f7673b;
    }
}
