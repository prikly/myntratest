package com.applovin.exoplayer2.j;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f13298a;

    /* renamed from: b  reason: collision with root package name */
    private final g[] f13299b;

    /* renamed from: c  reason: collision with root package name */
    private int f13300c;

    public h(g... gVarArr) {
        this.f13299b = gVarArr;
        this.f13298a = gVarArr.length;
    }

    public g a(int i) {
        return this.f13299b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13299b, ((h) obj).f13299b);
    }

    public int hashCode() {
        if (this.f13300c == 0) {
            this.f13300c = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f13299b);
        }
        return this.f13300c;
    }
}
