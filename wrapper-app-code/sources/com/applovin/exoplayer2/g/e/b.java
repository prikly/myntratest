package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class b extends h {
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
    public final byte[] f12619a;

    b(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f12619a = (byte[]) ai.a(parcel.createByteArray());
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f12619a = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12643f.equals(bVar.f12643f) && Arrays.equals(this.f12619a, bVar.f12619a);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12643f.hashCode()) * 31) + Arrays.hashCode(this.f12619a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12643f);
        parcel.writeByteArray(this.f12619a);
    }
}
