package com.applovin.exoplayer2.m;

import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class b implements g {

    /* renamed from: e  reason: collision with root package name */
    public static final g.a<b> f13672e = $$Lambda$b$PZ_vZiGnXrcCvollwhxu8dATA.INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public final int f13673a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13674b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13675c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f13676d;

    /* renamed from: f  reason: collision with root package name */
    private int f13677f;

    public b(int i, int i2, int i3, byte[] bArr) {
        this.f13673a = i;
        this.f13674b = i2;
        this.f13675c = i3;
        this.f13676d = bArr;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ b a(Bundle bundle) {
        return new b(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    public static int b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String c(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13673a == bVar.f13673a && this.f13674b == bVar.f13674b && this.f13675c == bVar.f13675c && Arrays.equals(this.f13676d, bVar.f13676d);
    }

    public int hashCode() {
        if (this.f13677f == 0) {
            this.f13677f = ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f13673a) * 31) + this.f13674b) * 31) + this.f13675c) * 31) + Arrays.hashCode(this.f13676d);
        }
        return this.f13677f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f13673a);
        sb.append(", ");
        sb.append(this.f13674b);
        sb.append(", ");
        sb.append(this.f13675c);
        sb.append(", ");
        sb.append(this.f13676d != null);
        sb.append(")");
        return sb.toString();
    }
}
