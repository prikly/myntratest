package com.iab.omid.library.appodeal.b;

import android.view.View;
import com.iab.omid.library.appodeal.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.appodeal.e.a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f7773a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7774b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f7775c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7776d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f7773a = new a(view);
        this.f7774b = view.getClass().getCanonicalName();
        this.f7775c = friendlyObstructionPurpose;
        this.f7776d = str;
    }

    public a a() {
        return this.f7773a;
    }

    public String b() {
        return this.f7774b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f7775c;
    }

    public String d() {
        return this.f7776d;
    }
}
