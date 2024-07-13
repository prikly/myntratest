package com.applovin.exoplayer2;

import java.io.IOException;

public class ai extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11092a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11093b;

    protected ai(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f11092a = z;
        this.f11093b = i;
    }

    public static ai a(String str) {
        return new ai(str, (Throwable) null, false, 1);
    }

    public static ai a(String str, Throwable th) {
        return new ai(str, th, true, 0);
    }

    public static ai b(String str, Throwable th) {
        return new ai(str, th, true, 1);
    }
}
