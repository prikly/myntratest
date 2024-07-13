package com.yandex.metrica.impl.ob;

import kotlin.jvm.internal.Intrinsics;

public final class Uh {

    /* renamed from: a  reason: collision with root package name */
    private final String f5173a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5174b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5175c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5176d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5177e;

    public Uh(String str, int i, int i2, boolean z, boolean z2) {
        this.f5173a = str;
        this.f5174b = i;
        this.f5175c = i2;
        this.f5176d = z;
        this.f5177e = z2;
    }

    public final int a() {
        return this.f5175c;
    }

    public final int b() {
        return this.f5174b;
    }

    public final String c() {
        return this.f5173a;
    }

    public final boolean d() {
        return this.f5176d;
    }

    public final boolean e() {
        return this.f5177e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uh)) {
            return false;
        }
        Uh uh = (Uh) obj;
        return Intrinsics.areEqual((Object) this.f5173a, (Object) uh.f5173a) && this.f5174b == uh.f5174b && this.f5175c == uh.f5175c && this.f5176d == uh.f5176d && this.f5177e == uh.f5177e;
    }

    public int hashCode() {
        String str = this.f5173a;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f5174b) * 31) + this.f5175c) * 31;
        boolean z = this.f5176d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f5177e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "EgressConfig(url=" + this.f5173a + ", repeatedDelay=" + this.f5174b + ", randomDelayWindow=" + this.f5175c + ", isBackgroundAllowed=" + this.f5176d + ", isDiagnosticsEnabled=" + this.f5177e + ")";
    }
}
