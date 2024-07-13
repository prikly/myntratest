package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() {
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* renamed from: a */
        public d[] newArray(int i) {
            return new d[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f12626a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12627b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12628c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f12629d;

    /* renamed from: e  reason: collision with root package name */
    private final h[] f12630e;

    d(Parcel parcel) {
        super("CTOC");
        this.f12626a = (String) ai.a(parcel.readString());
        boolean z = true;
        this.f12627b = parcel.readByte() != 0;
        this.f12628c = parcel.readByte() == 0 ? false : z;
        this.f12629d = (String[]) ai.a(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f12630e = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f12630e[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public d(String str, boolean z, boolean z2, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.f12626a = str;
        this.f12627b = z;
        this.f12628c = z2;
        this.f12629d = strArr;
        this.f12630e = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12627b == dVar.f12627b && this.f12628c == dVar.f12628c && ai.a((Object) this.f12626a, (Object) dVar.f12626a) && Arrays.equals(this.f12629d, dVar.f12629d) && Arrays.equals(this.f12630e, dVar.f12630e);
    }

    public int hashCode() {
        int i = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f12627b ? 1 : 0)) * 31) + (this.f12628c ? 1 : 0)) * 31;
        String str = this.f12626a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12626a);
        parcel.writeByte(this.f12627b ? (byte) 1 : 0);
        parcel.writeByte(this.f12628c ? (byte) 1 : 0);
        parcel.writeStringArray(this.f12629d);
        parcel.writeInt(this.f12630e.length);
        for (h writeParcelable : this.f12630e) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
