package com.iab.omid.library.ironsrc.b;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.ironsrc.e.a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f7881a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7882b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f7883c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7884d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f7881a = new a(view);
        this.f7882b = view.getClass().getCanonicalName();
        this.f7883c = friendlyObstructionPurpose;
        this.f7884d = str;
    }

    public a a() {
        return this.f7881a;
    }

    public String b() {
        return this.f7882b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f7883c;
    }

    public String d() {
        return this.f7884d;
    }
}
