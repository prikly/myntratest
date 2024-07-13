package com.yandex.metrica.billing_interface;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f3562a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3563b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3564c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3565d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3566e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3567f;

    /* renamed from: g  reason: collision with root package name */
    public final c f3568g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3569h;
    public final c i;
    public final String j;
    public final String k;
    public final long l;
    public final boolean m;
    public final String n;

    public d(e eVar, String str, int i2, long j2, String str2, long j3, c cVar, int i3, c cVar2, String str3, String str4, long j4, boolean z, String str5) {
        this.f3562a = eVar;
        this.f3563b = str;
        this.f3564c = i2;
        this.f3565d = j2;
        this.f3566e = str2;
        this.f3567f = j3;
        this.f3568g = cVar;
        this.f3569h = i3;
        this.i = cVar2;
        this.j = str3;
        this.k = str4;
        this.l = j4;
        this.m = z;
        this.n = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3564c != dVar.f3564c || this.f3565d != dVar.f3565d || this.f3567f != dVar.f3567f || this.f3569h != dVar.f3569h || this.l != dVar.l || this.m != dVar.m || this.f3562a != dVar.f3562a || !this.f3563b.equals(dVar.f3563b) || !this.f3566e.equals(dVar.f3566e)) {
            return false;
        }
        c cVar = this.f3568g;
        if (cVar == null ? dVar.f3568g != null : !cVar.equals(dVar.f3568g)) {
            return false;
        }
        c cVar2 = this.i;
        if (cVar2 == null ? dVar.i != null : !cVar2.equals(dVar.i)) {
            return false;
        }
        if (this.j.equals(dVar.j) && this.k.equals(dVar.k)) {
            return this.n.equals(dVar.n);
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f3565d;
        long j3 = this.f3567f;
        int hashCode = ((((((((((this.f3562a.hashCode() * 31) + this.f3563b.hashCode()) * 31) + this.f3564c) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f3566e.hashCode()) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        c cVar = this.f3568g;
        int i2 = 0;
        int hashCode2 = (((hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f3569h) * 31;
        c cVar2 = this.i;
        if (cVar2 != null) {
            i2 = cVar2.hashCode();
        }
        long j4 = this.l;
        return ((((((((((hashCode2 + i2) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.m ? 1 : 0)) * 31) + this.n.hashCode();
    }

    public String toString() {
        return "ProductInfo{type=" + this.f3562a + ", sku='" + this.f3563b + '\'' + ", quantity=" + this.f3564c + ", priceMicros=" + this.f3565d + ", priceCurrency='" + this.f3566e + '\'' + ", introductoryPriceMicros=" + this.f3567f + ", introductoryPricePeriod=" + this.f3568g + ", introductoryPriceCycles=" + this.f3569h + ", subscriptionPeriod=" + this.i + ", signature='" + this.j + '\'' + ", purchaseToken='" + this.k + '\'' + ", purchaseTime=" + this.l + ", autoRenewing=" + this.m + ", purchaseOriginalJson='" + this.n + '\'' + '}';
    }
}
