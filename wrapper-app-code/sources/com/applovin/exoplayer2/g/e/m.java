package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator<m>() {
        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* renamed from: a */
        public m[] newArray(int i) {
            return new m[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f12656a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12657b;

    m(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f12656a = parcel.readString();
        this.f12657b = (String) ai.a(parcel.readString());
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f12656a = str2;
        this.f12657b = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f12643f.equals(mVar.f12643f) && ai.a((Object) this.f12656a, (Object) mVar.f12656a) && ai.a((Object) this.f12657b, (Object) mVar.f12657b);
    }

    public int hashCode() {
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12643f.hashCode()) * 31;
        String str = this.f12656a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12657b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f12643f + ": url=" + this.f12657b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12643f);
        parcel.writeString(this.f12656a);
        parcel.writeString(this.f12657b);
    }
}
