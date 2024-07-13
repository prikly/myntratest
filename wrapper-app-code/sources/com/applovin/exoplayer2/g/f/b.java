package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.common.b.d;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class b implements a.C0122a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: a */
        public b[] newArray(int i) {
            return new b[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final long f12670a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12671b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12672c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12673d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12674e;

    public b(long j, long j2, long j3, long j4, long j5) {
        this.f12670a = j;
        this.f12671b = j2;
        this.f12672c = j3;
        this.f12673d = j4;
        this.f12674e = j5;
    }

    private b(Parcel parcel) {
        this.f12670a = parcel.readLong();
        this.f12671b = parcel.readLong();
        this.f12672c = parcel.readLong();
        this.f12673d = parcel.readLong();
        this.f12674e = parcel.readLong();
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
        b bVar = (b) obj;
        return this.f12670a == bVar.f12670a && this.f12671b == bVar.f12671b && this.f12672c == bVar.f12672c && this.f12673d == bVar.f12673d && this.f12674e == bVar.f12674e;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + d.a(this.f12670a)) * 31) + d.a(this.f12671b)) * 31) + d.a(this.f12672c)) * 31) + d.a(this.f12673d)) * 31) + d.a(this.f12674e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f12670a + ", photoSize=" + this.f12671b + ", photoPresentationTimestampUs=" + this.f12672c + ", videoStartPosition=" + this.f12673d + ", videoSize=" + this.f12674e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12670a);
        parcel.writeLong(this.f12671b);
        parcel.writeLong(this.f12672c);
        parcel.writeLong(this.f12673d);
        parcel.writeLong(this.f12674e);
    }
}
