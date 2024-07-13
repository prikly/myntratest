package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator<j>() {
        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        /* renamed from: a */
        public j[] newArray(int i) {
            return new j[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f12647a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12648b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12649c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f12650d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f12651e;

    public j(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f12647a = i;
        this.f12648b = i2;
        this.f12649c = i3;
        this.f12650d = iArr;
        this.f12651e = iArr2;
    }

    j(Parcel parcel) {
        super("MLLT");
        this.f12647a = parcel.readInt();
        this.f12648b = parcel.readInt();
        this.f12649c = parcel.readInt();
        this.f12650d = (int[]) ai.a(parcel.createIntArray());
        this.f12651e = (int[]) ai.a(parcel.createIntArray());
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
        j jVar = (j) obj;
        return this.f12647a == jVar.f12647a && this.f12648b == jVar.f12648b && this.f12649c == jVar.f12649c && Arrays.equals(this.f12650d, jVar.f12650d) && Arrays.equals(this.f12651e, jVar.f12651e);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12647a) * 31) + this.f12648b) * 31) + this.f12649c) * 31) + Arrays.hashCode(this.f12650d)) * 31) + Arrays.hashCode(this.f12651e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12647a);
        parcel.writeInt(this.f12648b);
        parcel.writeInt(this.f12649c);
        parcel.writeIntArray(this.f12650d);
        parcel.writeIntArray(this.f12651e);
    }
}
