package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.y;

public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() {
        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong());
        }

        /* renamed from: a */
        public g[] newArray(int i) {
            return new g[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final long f12710a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12711b;

    private g(long j, long j2) {
        this.f12710a = j;
        this.f12711b = j2;
    }

    static long a(y yVar, long j) {
        long h2 = (long) yVar.h();
        if ((128 & h2) != 0) {
            return 8589934591L & ((((h2 & 1) << 32) | yVar.o()) + j);
        }
        return -9223372036854775807L;
    }

    static g a(y yVar, long j, ag agVar) {
        long a2 = a(yVar, j);
        return new g(a2, agVar.b(a2));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12710a);
        parcel.writeLong(this.f12711b);
    }
}
