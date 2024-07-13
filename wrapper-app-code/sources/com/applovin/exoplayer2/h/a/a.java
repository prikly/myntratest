package com.applovin.exoplayer2.h.a;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Arrays;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12723a = new a((Object) null, new C0123a[0], 0, -9223372036854775807L, 0);

    /* renamed from: g  reason: collision with root package name */
    public static final g.a<a> f12724g = $$Lambda$a$vBKfUbsOWV0HIeQgOPgiVmpb74.INSTANCE;

    /* renamed from: h  reason: collision with root package name */
    private static final C0123a f12725h = new C0123a(0).b(0);

    /* renamed from: b  reason: collision with root package name */
    public final Object f12726b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12727c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12728d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12729e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12730f;
    private final C0123a[] i;

    /* renamed from: com.applovin.exoplayer2.h.a.a$a  reason: collision with other inner class name */
    public static final class C0123a implements g {

        /* renamed from: h  reason: collision with root package name */
        public static final g.a<C0123a> f12731h = $$Lambda$a$a$qEJSSbv7nhL2EgNplwta3WBm8k.INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        public final long f12732a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12733b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri[] f12734c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f12735d;

        /* renamed from: e  reason: collision with root package name */
        public final long[] f12736e;

        /* renamed from: f  reason: collision with root package name */
        public final long f12737f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f12738g;

        public C0123a(long j) {
            this(j, -1, new int[0], new Uri[0], new long[0], 0, false);
        }

        private C0123a(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            com.applovin.exoplayer2.l.a.a(iArr.length == uriArr.length);
            this.f12732a = j;
            this.f12733b = i;
            this.f12735d = iArr;
            this.f12734c = uriArr;
            this.f12736e = jArr;
            this.f12737f = j2;
            this.f12738g = z;
        }

        /* access modifiers changed from: private */
        public static C0123a a(Bundle bundle) {
            long j = bundle.getLong(c(0));
            int i = bundle.getInt(c(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(c(2));
            int[] intArray = bundle.getIntArray(c(3));
            long[] longArray = bundle.getLongArray(c(4));
            long j2 = bundle.getLong(c(5));
            boolean z = bundle.getBoolean(c(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new C0123a(j, i, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j2, z);
        }

        private static int[] a(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        private static long[] a(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static String c(int i) {
            return Integer.toString(i, 36);
        }

        public int a() {
            return a(-1);
        }

        public int a(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f12735d;
                if (i2 >= iArr.length || this.f12738g || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }

        public C0123a b(int i) {
            int[] a2 = a(this.f12735d, i);
            long[] a3 = a(this.f12736e, i);
            return new C0123a(this.f12732a, i, a2, (Uri[]) Arrays.copyOf(this.f12734c, i), a3, this.f12737f, this.f12738g);
        }

        public boolean b() {
            return this.f12733b == -1 || a() < this.f12733b;
        }

        public boolean c() {
            if (this.f12733b == -1) {
                return true;
            }
            for (int i = 0; i < this.f12733b; i++) {
                int[] iArr = this.f12735d;
                if (iArr[i] == 0 || iArr[i] == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0123a aVar = (C0123a) obj;
            return this.f12732a == aVar.f12732a && this.f12733b == aVar.f12733b && Arrays.equals(this.f12734c, aVar.f12734c) && Arrays.equals(this.f12735d, aVar.f12735d) && Arrays.equals(this.f12736e, aVar.f12736e) && this.f12737f == aVar.f12737f && this.f12738g == aVar.f12738g;
        }

        public int hashCode() {
            long j = this.f12732a;
            long j2 = this.f12737f;
            return (((((((((((this.f12733b * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f12734c)) * 31) + Arrays.hashCode(this.f12735d)) * 31) + Arrays.hashCode(this.f12736e)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f12738g ? 1 : 0);
        }
    }

    private a(Object obj, C0123a[] aVarArr, long j, long j2, int i2) {
        this.f12726b = obj;
        this.f12728d = j;
        this.f12729e = j2;
        this.f12727c = aVarArr.length + i2;
        this.i = aVarArr;
        this.f12730f = i2;
    }

    /* access modifiers changed from: private */
    public static a a(Bundle bundle) {
        C0123a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(1));
        if (parcelableArrayList == null) {
            aVarArr = new C0123a[0];
        } else {
            C0123a[] aVarArr2 = new C0123a[parcelableArrayList.size()];
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                aVarArr2[i2] = C0123a.f12731h.fromBundle((Bundle) parcelableArrayList.get(i2));
            }
            aVarArr = aVarArr2;
        }
        return new a((Object) null, aVarArr, bundle.getLong(b(2), 0), bundle.getLong(b(3), -9223372036854775807L), bundle.getInt(b(4)));
    }

    private boolean a(long j, long j2, int i2) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = a(i2).f12732a;
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || j < j2 : j < j3;
    }

    private static String b(int i2) {
        return Integer.toString(i2, 36);
    }

    public int a(long j, long j2) {
        int i2 = this.f12727c - 1;
        while (i2 >= 0 && a(j, j2, i2)) {
            i2--;
        }
        if (i2 < 0 || !a(i2).c()) {
            return -1;
        }
        return i2;
    }

    public C0123a a(int i2) {
        int i3 = this.f12730f;
        return i2 < i3 ? f12725h : this.i[i2 - i3];
    }

    public int b(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i2 = this.f12730f;
        while (i2 < this.f12727c && ((a(i2).f12732a != Long.MIN_VALUE && a(i2).f12732a <= j) || !a(i2).b())) {
            i2++;
        }
        if (i2 < this.f12727c) {
            return i2;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return ai.a(this.f12726b, aVar.f12726b) && this.f12727c == aVar.f12727c && this.f12728d == aVar.f12728d && this.f12729e == aVar.f12729e && this.f12730f == aVar.f12730f && Arrays.equals(this.i, aVar.i);
    }

    public int hashCode() {
        int i2 = this.f12727c * 31;
        Object obj = this.f12726b;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f12728d)) * 31) + ((int) this.f12729e)) * 31) + this.f12730f) * 31) + Arrays.hashCode(this.i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f12726b);
        sb.append(", adResumePositionUs=");
        sb.append(this.f12728d);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.i.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.i[i2].f12732a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.i[i2].f12735d.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.i[i2].f12735d[i3];
                sb.append(i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb.append(", durationUs=");
                sb.append(this.i[i2].f12736e[i3]);
                sb.append(')');
                if (i3 < this.i[i2].f12735d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.i.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
