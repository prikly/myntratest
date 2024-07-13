package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

public class W0 implements Parcelable {
    public static final Parcelable.Creator<W0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f5240a;

    /* renamed from: b  reason: collision with root package name */
    public final U0 f5241b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5242c;

    class a implements Parcelable.Creator<W0> {
        a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new W0(parcel.readString(), U0.a(parcel.readString()), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new W0[i];
        }
    }

    public W0(String str, U0 u0, String str2) {
        this.f5240a = str;
        this.f5241b = u0;
        this.f5242c = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W0.class != obj.getClass()) {
            return false;
        }
        W0 w0 = (W0) obj;
        String str = this.f5240a;
        if (str == null ? w0.f5240a != null : !str.equals(w0.f5240a)) {
            return false;
        }
        if (this.f5241b != w0.f5241b) {
            return false;
        }
        String str2 = this.f5242c;
        if (str2 != null) {
            return str2.equals(w0.f5242c);
        }
        if (w0.f5242c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5240a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f5241b.hashCode()) * 31;
        String str2 = this.f5242c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "IdentifiersResultInternal{mId='" + this.f5240a + '\'' + ", mStatus=" + this.f5241b + ", mErrorExplanation='" + this.f5242c + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5240a);
        parcel.writeString(this.f5241b.a());
        parcel.writeString(this.f5242c);
    }
}
