package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.common.b.b;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class d implements a.C0122a {
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
    public final float f12680a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12681b;

    public d(float f2, int i) {
        this.f12680a = f2;
        this.f12681b = i;
    }

    private d(Parcel parcel) {
        this.f12680a = parcel.readFloat();
        this.f12681b = parcel.readInt();
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
        d dVar = (d) obj;
        return this.f12680a == dVar.f12680a && this.f12681b == dVar.f12681b;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + b.a(this.f12680a)) * 31) + this.f12681b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f12680a + ", svcTemporalLayerCount=" + this.f12681b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f12680a);
        parcel.writeInt(this.f12681b);
    }
}
