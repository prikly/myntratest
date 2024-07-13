package com.applovin.exoplayer2.g.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.v;

public final class a implements a.C0122a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) com.applovin.exoplayer2.l.a.b(parcel.readString()));
        }

        /* renamed from: a */
        public a[] newArray(int i) {
            return new a[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f12579a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12580b;

    public a(int i, String str) {
        this.f12579a = i;
        this.f12580b = str;
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

    public String toString() {
        return "Ait(controlCode=" + this.f12579a + ",url=" + this.f12580b + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12580b);
        parcel.writeInt(this.f12579a);
    }
}
