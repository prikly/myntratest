package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.qa  reason: case insensitive filesystem */
public class C0651qa implements Parcelable {
    public static final Parcelable.Creator<C0651qa> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f6553a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6554b;

    /* renamed from: com.yandex.metrica.impl.ob.qa$a */
    class a implements Parcelable.Creator<C0651qa> {
        a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C0651qa(parcel);
        }

        public Object[] newArray(int i) {
            return new C0651qa[i];
        }
    }

    public C0651qa(long j, int i) {
        this.f6553a = j;
        this.f6554b = i;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiagnosticsConfig{expirationTimestampSeconds=" + this.f6553a + ", intervalSeconds=" + this.f6554b + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6553a);
        parcel.writeInt(this.f6554b);
    }

    protected C0651qa(Parcel parcel) {
        this.f6553a = parcel.readLong();
        this.f6554b = parcel.readInt();
    }
}
