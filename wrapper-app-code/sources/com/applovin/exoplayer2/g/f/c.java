package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class c implements a.C0122a {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, a.class.getClassLoader());
            return new c(arrayList);
        }

        /* renamed from: a */
        public c[] newArray(int i) {
            return new c[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f12675a;

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {
            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: a */
            public a[] newArray(int i) {
                return new a[i];
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static final Comparator<a> f12676a = $$Lambda$c$a$P3NDQmXkrLM2N1UQsk6agOSgdE.INSTANCE;

        /* renamed from: b  reason: collision with root package name */
        public final long f12677b;

        /* renamed from: c  reason: collision with root package name */
        public final long f12678c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12679d;

        public a(long j, long j2, int i) {
            com.applovin.exoplayer2.l.a.a(j < j2);
            this.f12677b = j;
            this.f12678c = j2;
            this.f12679d = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12677b == aVar.f12677b && this.f12678c == aVar.f12678c && this.f12679d == aVar.f12679d;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f12677b), Long.valueOf(this.f12678c), Integer.valueOf(this.f12679d));
        }

        public String toString() {
            return ai.a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f12677b), Long.valueOf(this.f12678c), Integer.valueOf(this.f12679d));
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f12677b);
            parcel.writeLong(this.f12678c);
            parcel.writeInt(this.f12679d);
        }
    }

    public c(List<a> list) {
        this.f12675a = list;
        com.applovin.exoplayer2.l.a.a(!a(list));
    }

    private static boolean a(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).f12678c;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).f12677b < j) {
                return true;
            }
            j = list.get(i).f12678c;
        }
        return false;
    }

    public /* synthetic */ v a() {
        return a.C0122a.CC.$default$a(this);
    }

    public /* synthetic */ void a(ac.a aVar) {
        a.C0122a.CC.$default$a(this, aVar);
    }

    public /* synthetic */ byte[] b() {
        return a.C0122a.CC.$default$b(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f12675a.equals(((c) obj).f12675a);
    }

    public int hashCode() {
        return this.f12675a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f12675a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f12675a);
    }
}
