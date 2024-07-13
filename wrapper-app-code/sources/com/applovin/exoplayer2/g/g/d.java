package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() {
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* renamed from: a */
        public d[] newArray(int i) {
            return new d[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final long f12688a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12689b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12690c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12691d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12692e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12693f;

    /* renamed from: g  reason: collision with root package name */
    public final long f12694g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f12695h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12696a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12697b;

        /* renamed from: c  reason: collision with root package name */
        public final long f12698c;

        private a(int i, long j, long j2) {
            this.f12696a = i;
            this.f12697b = j;
            this.f12698c = j2;
        }

        public static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void a(Parcel parcel) {
            parcel.writeInt(this.f12696a);
            parcel.writeLong(this.f12697b);
            parcel.writeLong(this.f12698c);
        }
    }

    private d(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<a> list, boolean z5, long j5, int i2, int i3, int i4) {
        this.f12688a = j2;
        this.f12689b = z;
        this.f12690c = z2;
        this.f12691d = z3;
        this.f12692e = z4;
        this.f12693f = j3;
        this.f12694g = j4;
        this.f12695h = Collections.unmodifiableList(list);
        this.i = z5;
        this.j = j5;
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }

    private d(Parcel parcel) {
        this.f12688a = parcel.readLong();
        boolean z = false;
        this.f12689b = parcel.readByte() == 1;
        this.f12690c = parcel.readByte() == 1;
        this.f12691d = parcel.readByte() == 1;
        this.f12692e = parcel.readByte() == 1;
        this.f12693f = parcel.readLong();
        this.f12694g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(a.b(parcel));
        }
        this.f12695h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readByte() == 1 ? true : z;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }

    static d a(y yVar, long j2, ag agVar) {
        boolean z;
        int i2;
        int i3;
        int i4;
        long j3;
        boolean z2;
        List list;
        long j4;
        boolean z3;
        boolean z4;
        long j5;
        boolean z5;
        ag agVar2 = agVar;
        long o = yVar.o();
        boolean z6 = (yVar.h() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int h2 = yVar.h();
            boolean z7 = (h2 & 128) != 0;
            boolean z8 = (h2 & 64) != 0;
            boolean z9 = (h2 & 32) != 0;
            boolean z10 = (h2 & 16) != 0;
            long a2 = (!z8 || z10) ? -9223372036854775807L : g.a(yVar, j2);
            if (!z8) {
                int h3 = yVar.h();
                ArrayList arrayList = new ArrayList(h3);
                for (int i5 = 0; i5 < h3; i5++) {
                    int h4 = yVar.h();
                    long a3 = !z10 ? g.a(yVar, j2) : -9223372036854775807L;
                    arrayList.add(new a(h4, a3, agVar2.b(a3)));
                }
                emptyList = arrayList;
            }
            if (z9) {
                long h5 = (long) yVar.h();
                boolean z11 = (128 & h5) != 0;
                j5 = ((((h5 & 1) << 32) | yVar.o()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                j5 = -9223372036854775807L;
            }
            i4 = yVar.i();
            z = z8;
            i3 = yVar.h();
            i2 = yVar.h();
            list = emptyList;
            long j6 = a2;
            z2 = z5;
            j3 = j5;
            z3 = z10;
            z4 = z7;
            j4 = j6;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j4 = -9223372036854775807L;
            z2 = false;
            j3 = -9223372036854775807L;
            i4 = 0;
            i3 = 0;
            i2 = 0;
            z = false;
        }
        return new d(o, z6, z4, z, z3, j4, agVar2.b(j4), list, z2, j3, i4, i3, i2);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f12688a);
        parcel.writeByte(this.f12689b ? (byte) 1 : 0);
        parcel.writeByte(this.f12690c ? (byte) 1 : 0);
        parcel.writeByte(this.f12691d ? (byte) 1 : 0);
        parcel.writeByte(this.f12692e ? (byte) 1 : 0);
        parcel.writeLong(this.f12693f);
        parcel.writeLong(this.f12694g);
        int size = this.f12695h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.f12695h.get(i3).a(parcel);
        }
        parcel.writeByte(this.i ? (byte) 1 : 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }
}
