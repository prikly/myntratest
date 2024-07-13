package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;

public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: a */
        public a[] newArray(int i) {
            return new a[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final long f12682a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12683b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f12684c;

    private a(long j, byte[] bArr, long j2) {
        this.f12682a = j2;
        this.f12683b = j;
        this.f12684c = bArr;
    }

    private a(Parcel parcel) {
        this.f12682a = parcel.readLong();
        this.f12683b = parcel.readLong();
        this.f12684c = (byte[]) ai.a(parcel.createByteArray());
    }

    static a a(y yVar, int i, long j) {
        long o = yVar.o();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        yVar.a(bArr, 0, i2);
        return new a(o, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12682a);
        parcel.writeLong(this.f12683b);
        parcel.writeByteArray(this.f12684c);
    }
}
