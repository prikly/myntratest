package com.applovin.exoplayer2.e.d;

import java.util.List;

final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f11888a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f11889b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f11890a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11891b;

        /* renamed from: c  reason: collision with root package name */
        public final long f11892c;

        /* renamed from: d  reason: collision with root package name */
        public final long f11893d;

        public a(String str, String str2, long j, long j2) {
            this.f11890a = str;
            this.f11891b = str2;
            this.f11892c = j;
            this.f11893d = j2;
        }
    }

    public b(long j, List<a> list) {
        this.f11888a = j;
        this.f11889b = list;
    }

    public com.applovin.exoplayer2.g.f.b a(long j) {
        long j2;
        if (this.f11889b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f11889b.size() - 1; size >= 0; size--) {
            a aVar = this.f11889b.get(size);
            boolean equals = "video/mp4".equals(aVar.f11890a) | z;
            if (size == 0) {
                j2 = j3 - aVar.f11893d;
                j3 = 0;
            } else {
                long j8 = j3;
                j3 -= aVar.f11892c;
                j2 = j8;
            }
            if (!equals || j3 == j2) {
                z = equals;
            } else {
                j7 = j2 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j2;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new com.applovin.exoplayer2.g.f.b(j4, j5, this.f11888a, j6, j7);
    }
}
