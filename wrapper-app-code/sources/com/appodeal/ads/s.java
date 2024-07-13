package com.appodeal.ads;

import com.appodeal.ads.s;

public abstract class s<SelfType extends s> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17189a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17190b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17191c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17192d;

    /* renamed from: e  reason: collision with root package name */
    public final String f17193e;

    public s(String str, String str2) {
        this.f17192d = str;
        this.f17193e = str2;
    }

    public final String a() {
        return this.f17189a ? this.f17193e : this.f17192d;
    }

    public final boolean b() {
        return this.f17189a;
    }

    public final boolean c() {
        return this.f17191c;
    }
}
