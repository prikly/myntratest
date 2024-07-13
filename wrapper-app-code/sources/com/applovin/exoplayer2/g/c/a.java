package com.applovin.exoplayer2.g.c;

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
    public final int f12592a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12593b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12594c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12595d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12596e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12597f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12598g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f12599h;

    public a(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f12592a = i;
        this.f12593b = str;
        this.f12594c = str2;
        this.f12595d = i2;
        this.f12596e = i3;
        this.f12597f = i4;
        this.f12598g = i5;
        this.f12599h = bArr;
    }

    a(Parcel parcel) {
        this.f12592a = parcel.readInt();
        this.f12593b = (String) ai.a(parcel.readString());
        this.f12594c = (String) ai.a(parcel.readString());
        this.f12595d = parcel.readInt();
        this.f12596e = parcel.readInt();
        this.f12597f = parcel.readInt();
        this.f12598g = parcel.readInt();
        this.f12599h = (byte[]) ai.a(parcel.createByteArray());
    }

    public /* synthetic */ v a() {
        return a.C0122a.CC.$default$a(this);
    }

    public void a(ac.a aVar) {
        aVar.a(this.f12599h, this.f12592a);
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
        return this.f12592a == aVar.f12592a && this.f12593b.equals(aVar.f12593b) && this.f12594c.equals(aVar.f12594c) && this.f12595d == aVar.f12595d && this.f12596e == aVar.f12596e && this.f12597f == aVar.f12597f && this.f12598g == aVar.f12598g && Arrays.equals(this.f12599h, aVar.f12599h);
    }

    public int hashCode() {
        return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12592a) * 31) + this.f12593b.hashCode()) * 31) + this.f12594c.hashCode()) * 31) + this.f12595d) * 31) + this.f12596e) * 31) + this.f12597f) * 31) + this.f12598g) * 31) + Arrays.hashCode(this.f12599h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f12593b + ", description=" + this.f12594c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12592a);
        parcel.writeString(this.f12593b);
        parcel.writeString(this.f12594c);
        parcel.writeInt(this.f12595d);
        parcel.writeInt(this.f12596e);
        parcel.writeInt(this.f12597f);
        parcel.writeInt(this.f12598g);
        parcel.writeByteArray(this.f12599h);
    }
}
