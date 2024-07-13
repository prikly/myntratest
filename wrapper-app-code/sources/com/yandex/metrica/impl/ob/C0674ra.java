package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.ra  reason: case insensitive filesystem */
public class C0674ra implements Parcelable {
    public static final Parcelable.Creator<C0674ra> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final C0651qa f6692a;

    /* renamed from: b  reason: collision with root package name */
    public final C0651qa f6693b;

    /* renamed from: c  reason: collision with root package name */
    public final C0651qa f6694c;

    /* renamed from: com.yandex.metrica.impl.ob.ra$a */
    class a implements Parcelable.Creator<C0674ra> {
        a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C0674ra(parcel);
        }

        public Object[] newArray(int i) {
            return new C0674ra[i];
        }
    }

    public C0674ra() {
        this((C0651qa) null, (C0651qa) null, (C0651qa) null);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiagnosticsConfigsHolder{activationConfig=" + this.f6692a + ", clidsInfoConfig=" + this.f6693b + ", preloadInfoConfig=" + this.f6694c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6692a, i);
        parcel.writeParcelable(this.f6693b, i);
        parcel.writeParcelable(this.f6694c, i);
    }

    public C0674ra(C0651qa qaVar, C0651qa qaVar2, C0651qa qaVar3) {
        this.f6692a = qaVar;
        this.f6693b = qaVar2;
        this.f6694c = qaVar3;
    }

    protected C0674ra(Parcel parcel) {
        this.f6692a = (C0651qa) parcel.readParcelable(C0651qa.class.getClassLoader());
        this.f6693b = (C0651qa) parcel.readParcelable(C0651qa.class.getClassLoader());
        this.f6694c = (C0651qa) parcel.readParcelable(C0651qa.class.getClassLoader());
    }
}
