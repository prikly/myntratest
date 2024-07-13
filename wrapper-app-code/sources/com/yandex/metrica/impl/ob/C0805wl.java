package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wl  reason: case insensitive filesystem */
public class C0805wl implements Parcelable {
    public static final Parcelable.Creator<C0805wl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f7065a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7066b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7067c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7068d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7069e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7070f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7071g;

    /* renamed from: h  reason: collision with root package name */
    public final List<C0877zl> f7072h;

    /* renamed from: com.yandex.metrica.impl.ob.wl$a */
    class a implements Parcelable.Creator<C0805wl> {
        a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C0805wl(parcel);
        }

        public Object[] newArray(int i) {
            return new C0805wl[i];
        }
    }

    public C0805wl(int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, List<C0877zl> list) {
        this.f7065a = i;
        this.f7066b = i2;
        this.f7067c = i3;
        this.f7068d = j;
        this.f7069e = z;
        this.f7070f = z2;
        this.f7071g = z3;
        this.f7072h = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0805wl.class != obj.getClass()) {
            return false;
        }
        C0805wl wlVar = (C0805wl) obj;
        if (this.f7065a == wlVar.f7065a && this.f7066b == wlVar.f7066b && this.f7067c == wlVar.f7067c && this.f7068d == wlVar.f7068d && this.f7069e == wlVar.f7069e && this.f7070f == wlVar.f7070f && this.f7071g == wlVar.f7071g) {
            return this.f7072h.equals(wlVar.f7072h);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f7068d;
        return (((((((((((((this.f7065a * 31) + this.f7066b) * 31) + this.f7067c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f7069e ? 1 : 0)) * 31) + (this.f7070f ? 1 : 0)) * 31) + (this.f7071g ? 1 : 0)) * 31) + this.f7072h.hashCode();
    }

    public String toString() {
        return "UiParsingConfig{tooLongTextBound=" + this.f7065a + ", truncatedTextBound=" + this.f7066b + ", maxVisitedChildrenInLevel=" + this.f7067c + ", afterCreateTimeout=" + this.f7068d + ", relativeTextSizeCalculation=" + this.f7069e + ", errorReporting=" + this.f7070f + ", parsingAllowedByDefault=" + this.f7071g + ", filters=" + this.f7072h + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7065a);
        parcel.writeInt(this.f7066b);
        parcel.writeInt(this.f7067c);
        parcel.writeLong(this.f7068d);
        parcel.writeByte(this.f7069e ? (byte) 1 : 0);
        parcel.writeByte(this.f7070f ? (byte) 1 : 0);
        parcel.writeByte(this.f7071g ? (byte) 1 : 0);
        parcel.writeList(this.f7072h);
    }

    protected C0805wl(Parcel parcel) {
        this.f7065a = parcel.readInt();
        this.f7066b = parcel.readInt();
        this.f7067c = parcel.readInt();
        this.f7068d = parcel.readLong();
        boolean z = true;
        this.f7069e = parcel.readByte() != 0;
        this.f7070f = parcel.readByte() != 0;
        this.f7071g = parcel.readByte() == 0 ? false : z;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C0877zl.class.getClassLoader());
        this.f7072h = arrayList;
    }
}
