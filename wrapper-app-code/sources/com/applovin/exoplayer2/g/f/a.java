package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class a implements a.C0122a {
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
    public final String f12666a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12667b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12668c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12669d;

    private a(Parcel parcel) {
        this.f12666a = (String) ai.a(parcel.readString());
        this.f12667b = (byte[]) ai.a(parcel.createByteArray());
        this.f12668c = parcel.readInt();
        this.f12669d = parcel.readInt();
    }

    public a(String str, byte[] bArr, int i, int i2) {
        this.f12666a = str;
        this.f12667b = bArr;
        this.f12668c = i;
        this.f12669d = i2;
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
        a aVar = (a) obj;
        return this.f12666a.equals(aVar.f12666a) && Arrays.equals(this.f12667b, aVar.f12667b) && this.f12668c == aVar.f12668c && this.f12669d == aVar.f12669d;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12666a.hashCode()) * 31) + Arrays.hashCode(this.f12667b)) * 31) + this.f12668c) * 31) + this.f12669d;
    }

    public String toString() {
        return "mdta: key=" + this.f12666a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12666a);
        parcel.writeByteArray(this.f12667b);
        parcel.writeInt(this.f12668c);
        parcel.writeInt(this.f12669d);
    }
}
