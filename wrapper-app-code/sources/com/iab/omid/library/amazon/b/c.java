package com.iab.omid.library.amazon.b;

import android.view.View;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.amazon.e.a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f7552a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7553b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f7554c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7555d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f7552a = new a(view);
        this.f7553b = view.getClass().getCanonicalName();
        this.f7554c = friendlyObstructionPurpose;
        this.f7555d = str;
    }

    public a a() {
        return this.f7552a;
    }

    public String b() {
        return this.f7553b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f7554c;
    }

    public String d() {
        return this.f7555d;
    }
}
