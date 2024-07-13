package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.hl  reason: case insensitive filesystem */
public class C0439hl implements Parcelable {
    public static final Parcelable.Creator<C0439hl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5943a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5944b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5945c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5946d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5947e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5948f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5949g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5950h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final List<C0877zl> p;

    /* renamed from: com.yandex.metrica.impl.ob.hl$a */
    class a implements Parcelable.Creator<C0439hl> {
        a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C0439hl(parcel);
        }

        public Object[] newArray(int i) {
            return new C0439hl[i];
        }
    }

    public C0439hl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2, int i3, int i4, int i5, int i6, List<C0877zl> list) {
        this.f5943a = z;
        this.f5944b = z2;
        this.f5945c = z3;
        this.f5946d = z4;
        this.f5947e = z5;
        this.f5948f = z6;
        this.f5949g = z7;
        this.f5950h = z8;
        this.i = z9;
        this.j = z10;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.o = i6;
        this.p = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0439hl.class != obj.getClass()) {
            return false;
        }
        C0439hl hlVar = (C0439hl) obj;
        if (this.f5943a == hlVar.f5943a && this.f5944b == hlVar.f5944b && this.f5945c == hlVar.f5945c && this.f5946d == hlVar.f5946d && this.f5947e == hlVar.f5947e && this.f5948f == hlVar.f5948f && this.f5949g == hlVar.f5949g && this.f5950h == hlVar.f5950h && this.i == hlVar.i && this.j == hlVar.j && this.k == hlVar.k && this.l == hlVar.l && this.m == hlVar.m && this.n == hlVar.n && this.o == hlVar.o) {
            return this.p.equals(hlVar.p);
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((this.f5943a ? 1 : 0) * true) + (this.f5944b ? 1 : 0)) * 31) + (this.f5945c ? 1 : 0)) * 31) + (this.f5946d ? 1 : 0)) * 31) + (this.f5947e ? 1 : 0)) * 31) + (this.f5948f ? 1 : 0)) * 31) + (this.f5949g ? 1 : 0)) * 31) + (this.f5950h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p.hashCode();
    }

    public String toString() {
        return "UiCollectingConfig{textSizeCollecting=" + this.f5943a + ", relativeTextSizeCollecting=" + this.f5944b + ", textVisibilityCollecting=" + this.f5945c + ", textStyleCollecting=" + this.f5946d + ", infoCollecting=" + this.f5947e + ", nonContentViewCollecting=" + this.f5948f + ", textLengthCollecting=" + this.f5949g + ", viewHierarchical=" + this.f5950h + ", ignoreFiltered=" + this.i + ", webViewUrlsCollecting=" + this.j + ", tooLongTextBound=" + this.k + ", truncatedTextBound=" + this.l + ", maxEntitiesCount=" + this.m + ", maxFullContentLength=" + this.n + ", webViewUrlLimit=" + this.o + ", filters=" + this.p + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f5943a ? (byte) 1 : 0);
        parcel.writeByte(this.f5944b ? (byte) 1 : 0);
        parcel.writeByte(this.f5945c ? (byte) 1 : 0);
        parcel.writeByte(this.f5946d ? (byte) 1 : 0);
        parcel.writeByte(this.f5947e ? (byte) 1 : 0);
        parcel.writeByte(this.f5948f ? (byte) 1 : 0);
        parcel.writeByte(this.f5949g ? (byte) 1 : 0);
        parcel.writeByte(this.f5950h ? (byte) 1 : 0);
        parcel.writeByte(this.i ? (byte) 1 : 0);
        parcel.writeByte(this.j ? (byte) 1 : 0);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeList(this.p);
    }

    protected C0439hl(Parcel parcel) {
        boolean z = true;
        this.f5943a = parcel.readByte() != 0;
        this.f5944b = parcel.readByte() != 0;
        this.f5945c = parcel.readByte() != 0;
        this.f5946d = parcel.readByte() != 0;
        this.f5947e = parcel.readByte() != 0;
        this.f5948f = parcel.readByte() != 0;
        this.f5949g = parcel.readByte() != 0;
        this.f5950h = parcel.readByte() != 0;
        this.i = parcel.readByte() != 0;
        this.j = parcel.readByte() == 0 ? false : z;
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C0877zl.class.getClassLoader());
        this.p = arrayList;
    }
}
