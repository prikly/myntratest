package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.mc  reason: case insensitive filesystem */
public class C0554mc {

    /* renamed from: a  reason: collision with root package name */
    public final long f6210a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6211b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6212c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6213d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6214e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6215f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6216g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6217h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Xb m;
    public final Xb n;
    public final Xb o;
    public final Xb p;
    public final C0305cc q;

    public C0554mc(long j2, float f2, int i2, int i3, long j3, int i4, boolean z, long j4, boolean z2, boolean z3, boolean z4, boolean z5, Xb xb, Xb xb2, Xb xb3, Xb xb4, C0305cc ccVar) {
        this.f6210a = j2;
        this.f6211b = f2;
        this.f6212c = i2;
        this.f6213d = i3;
        this.f6214e = j3;
        this.f6215f = i4;
        this.f6216g = z;
        this.f6217h = j4;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = xb;
        this.n = xb2;
        this.o = xb3;
        this.p = xb4;
        this.q = ccVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0554mc.class != obj.getClass()) {
            return false;
        }
        C0554mc mcVar = (C0554mc) obj;
        if (this.f6210a != mcVar.f6210a || Float.compare(mcVar.f6211b, this.f6211b) != 0 || this.f6212c != mcVar.f6212c || this.f6213d != mcVar.f6213d || this.f6214e != mcVar.f6214e || this.f6215f != mcVar.f6215f || this.f6216g != mcVar.f6216g || this.f6217h != mcVar.f6217h || this.i != mcVar.i || this.j != mcVar.j || this.k != mcVar.k || this.l != mcVar.l) {
            return false;
        }
        Xb xb = this.m;
        if (xb == null ? mcVar.m != null : !xb.equals(mcVar.m)) {
            return false;
        }
        Xb xb2 = this.n;
        if (xb2 == null ? mcVar.n != null : !xb2.equals(mcVar.n)) {
            return false;
        }
        Xb xb3 = this.o;
        if (xb3 == null ? mcVar.o != null : !xb3.equals(mcVar.o)) {
            return false;
        }
        Xb xb4 = this.p;
        if (xb4 == null ? mcVar.p != null : !xb4.equals(mcVar.p)) {
            return false;
        }
        C0305cc ccVar = this.q;
        C0305cc ccVar2 = mcVar.q;
        if (ccVar != null) {
            return ccVar.equals(ccVar2);
        }
        if (ccVar2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f6210a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        float f2 = this.f6211b;
        int i3 = 0;
        int floatToIntBits = f2 != 0.0f ? Float.floatToIntBits(f2) : 0;
        long j3 = this.f6214e;
        long j4 = this.f6217h;
        int i4 = (((((((((((((((((((((i2 + floatToIntBits) * 31) + this.f6212c) * 31) + this.f6213d) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f6215f) * 31) + (this.f6216g ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31;
        Xb xb = this.m;
        int hashCode = (i4 + (xb != null ? xb.hashCode() : 0)) * 31;
        Xb xb2 = this.n;
        int hashCode2 = (hashCode + (xb2 != null ? xb2.hashCode() : 0)) * 31;
        Xb xb3 = this.o;
        int hashCode3 = (hashCode2 + (xb3 != null ? xb3.hashCode() : 0)) * 31;
        Xb xb4 = this.p;
        int hashCode4 = (hashCode3 + (xb4 != null ? xb4.hashCode() : 0)) * 31;
        C0305cc ccVar = this.q;
        if (ccVar != null) {
            i3 = ccVar.hashCode();
        }
        return hashCode4 + i3;
    }

    public String toString() {
        return "LocationArguments{updateTimeInterval=" + this.f6210a + ", updateDistanceInterval=" + this.f6211b + ", recordsCountToForceFlush=" + this.f6212c + ", maxBatchSize=" + this.f6213d + ", maxAgeToForceFlush=" + this.f6214e + ", maxRecordsToStoreLocally=" + this.f6215f + ", collectionEnabled=" + this.f6216g + ", lbsUpdateTimeInterval=" + this.f6217h + ", lbsCollectionEnabled=" + this.i + ", passiveCollectionEnabled=" + this.j + ", allCellsCollectingEnabled=" + this.k + ", connectedCellCollectingEnabled=" + this.l + ", wifiAccessConfig=" + this.m + ", lbsAccessConfig=" + this.n + ", gpsAccessConfig=" + this.o + ", passiveAccessConfig=" + this.p + ", gplConfig=" + this.q + '}';
    }
}
