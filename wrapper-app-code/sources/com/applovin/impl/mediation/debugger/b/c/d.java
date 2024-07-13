package com.applovin.impl.mediation.debugger.b.c;

import android.content.Context;
import com.applovin.impl.sdk.utils.h;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f14731a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14732b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14733c;

    d(String str, String str2, Context context) {
        this.f14731a = str.replace("android.permission.", "");
        this.f14732b = str2;
        this.f14733c = h.a(str, context);
    }

    public String a() {
        return this.f14731a;
    }

    public String b() {
        return this.f14732b;
    }

    public boolean c() {
        return this.f14733c;
    }
}
