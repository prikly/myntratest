package com.iab.omid.library.adcolony.b;

import android.view.View;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.adcolony.e.a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f7445a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7446b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f7447c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7448d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f7445a = new a(view);
        this.f7446b = view.getClass().getCanonicalName();
        this.f7447c = friendlyObstructionPurpose;
        this.f7448d = str;
    }

    public a a() {
        return this.f7445a;
    }

    public String b() {
        return this.f7446b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f7447c;
    }

    public String d() {
        return this.f7448d;
    }
}
