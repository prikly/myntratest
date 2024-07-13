package com.appodeal.ads.utils;

import java.util.Objects;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f17521a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17522b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17523c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17524d;

    /* renamed from: e  reason: collision with root package name */
    public final double f17525e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f17526f;

    /* renamed from: g  reason: collision with root package name */
    public final int f17527g;

    public k(int i, int i2, String str, String str2, String str3, String str4, boolean z) {
        this.f17521a = i;
        this.f17527g = i2;
        this.f17522b = str;
        this.f17523c = str2;
        this.f17524d = Integer.parseInt(str3);
        this.f17525e = Double.parseDouble(str4);
        this.f17526f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f17523c, ((k) obj).f17523c);
    }

    public final int hashCode() {
        String str = this.f17523c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
