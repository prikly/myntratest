package com.applovin.exoplayer2;

import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;

public final class av {

    /* renamed from: a  reason: collision with root package name */
    public static final av f11140a = new av(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final av f11141b = new av(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public static final av f11142c = new av(Long.MAX_VALUE, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final av f11143d = new av(0, Long.MAX_VALUE);

    /* renamed from: e  reason: collision with root package name */
    public static final av f11144e = f11140a;

    /* renamed from: f  reason: collision with root package name */
    public final long f11145f;

    /* renamed from: g  reason: collision with root package name */
    public final long f11146g;

    public av(long j, long j2) {
        boolean z = true;
        a.a(j >= 0);
        a.a(j2 < 0 ? false : z);
        this.f11145f = j;
        this.f11146g = j2;
    }

    public long a(long j, long j2, long j3) {
        if (this.f11145f == 0 && this.f11146g == 0) {
            return j;
        }
        long j4 = j;
        long c2 = ai.c(j4, this.f11145f, Long.MIN_VALUE);
        long b2 = ai.b(j4, this.f11146g, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = c2 <= j2 && j2 <= b2;
        if (c2 > j3 || j3 > b2) {
            z = false;
        }
        return (!z2 || !z) ? z2 ? j2 : z ? j3 : c2 : Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        av avVar = (av) obj;
        return this.f11145f == avVar.f11145f && this.f11146g == avVar.f11146g;
    }

    public int hashCode() {
        return (((int) this.f11145f) * 31) + ((int) this.f11146g);
    }
}
