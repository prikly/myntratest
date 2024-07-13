package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() {
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: a */
        public f[] newArray(int i) {
            return new f[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f12699a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12700a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12701b;

        private a(int i, long j) {
            this.f12700a = i;
            this.f12701b = j;
        }

        /* access modifiers changed from: private */
        public static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.f12700a);
            parcel.writeLong(this.f12701b);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f12702a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12703b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12704c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f12705d;

        /* renamed from: e  reason: collision with root package name */
        public final long f12706e;

        /* renamed from: f  reason: collision with root package name */
        public final List<a> f12707f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f12708g;

        /* renamed from: h  reason: collision with root package name */
        public final long f12709h;
        public final int i;
        public final int j;
        public final int k;

        private b(long j2, boolean z, boolean z2, boolean z3, List<a> list, long j3, boolean z4, long j4, int i2, int i3, int i4) {
            this.f12702a = j2;
            this.f12703b = z;
            this.f12704c = z2;
            this.f12705d = z3;
            this.f12707f = Collections.unmodifiableList(list);
            this.f12706e = j3;
            this.f12708g = z4;
            this.f12709h = j4;
            this.i = i2;
            this.j = i3;
            this.k = i4;
        }

        private b(Parcel parcel) {
            this.f12702a = parcel.readLong();
            boolean z = false;
            this.f12703b = parcel.readByte() == 1;
            this.f12704c = parcel.readByte() == 1;
            this.f12705d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(a.b(parcel));
            }
            this.f12707f = Collections.unmodifiableList(arrayList);
            this.f12706e = parcel.readLong();
            this.f12708g = parcel.readByte() == 1 ? true : z;
            this.f12709h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        /* access modifiers changed from: private */
        public static b b(y yVar) {
            boolean z;
            int i2;
            int i3;
            int i4;
            long j2;
            boolean z2;
            long j3;
            ArrayList arrayList;
            boolean z3;
            long j4;
            boolean z4;
            long o = yVar.o();
            boolean z5 = (yVar.h() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z5) {
                int h2 = yVar.h();
                boolean z6 = (h2 & 128) != 0;
                boolean z7 = (h2 & 64) != 0;
                boolean z8 = (h2 & 32) != 0;
                long o2 = z7 ? yVar.o() : -9223372036854775807L;
                if (!z7) {
                    int h3 = yVar.h();
                    ArrayList arrayList3 = new ArrayList(h3);
                    for (int i5 = 0; i5 < h3; i5++) {
                        arrayList3.add(new a(yVar.h(), yVar.o()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long h4 = (long) yVar.h();
                    boolean z9 = (128 & h4) != 0;
                    j4 = ((((h4 & 1) << 32) | yVar.o()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    j4 = -9223372036854775807L;
                }
                int i6 = yVar.i();
                int h5 = yVar.h();
                z = z7;
                i2 = yVar.h();
                j2 = j4;
                arrayList = arrayList2;
                long j5 = o2;
                i4 = i6;
                i3 = h5;
                j3 = j5;
                boolean z10 = z6;
                z2 = z4;
                z3 = z10;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j3 = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                z = false;
            }
            return new b(o, z5, z3, z, arrayList, j3, z2, j2, i4, i3, i2);
        }

        /* access modifiers changed from: private */
        public void b(Parcel parcel) {
            parcel.writeLong(this.f12702a);
            parcel.writeByte(this.f12703b ? (byte) 1 : 0);
            parcel.writeByte(this.f12704c ? (byte) 1 : 0);
            parcel.writeByte(this.f12705d ? (byte) 1 : 0);
            int size = this.f12707f.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f12707f.get(i2).c(parcel);
            }
            parcel.writeLong(this.f12706e);
            parcel.writeByte(this.f12708g ? (byte) 1 : 0);
            parcel.writeLong(this.f12709h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }

        /* access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel);
        }
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.c(parcel));
        }
        this.f12699a = Collections.unmodifiableList(arrayList);
    }

    private f(List<b> list) {
        this.f12699a = Collections.unmodifiableList(list);
    }

    static f a(y yVar) {
        int h2 = yVar.h();
        ArrayList arrayList = new ArrayList(h2);
        for (int i = 0; i < h2; i++) {
            arrayList.add(b.b(yVar));
        }
        return new f((List<b>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f12699a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f12699a.get(i2).b(parcel);
        }
    }
}
