package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() {
        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* renamed from: a */
        public k[] newArray(int i) {
            return new k[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f12652a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12653b;

    k(Parcel parcel) {
        super("PRIV");
        this.f12652a = (String) ai.a(parcel.readString());
        this.f12653b = (byte[]) ai.a(parcel.createByteArray());
    }

    public k(String str, byte[] bArr) {
        super("PRIV");
        this.f12652a = str;
        this.f12653b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return ai.a((Object) this.f12652a, (Object) kVar.f12652a) && Arrays.equals(this.f12653b, kVar.f12653b);
    }

    public int hashCode() {
        String str = this.f12652a;
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f12653b);
    }

    public String toString() {
        return this.f12643f + ": owner=" + this.f12652a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12652a);
        parcel.writeByteArray(this.f12653b);
    }
}
