package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: a */
        public c[] newArray(int i) {
            return new c[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f12620a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12621b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12622c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12623d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12624e;

    /* renamed from: g  reason: collision with root package name */
    private final h[] f12625g;

    c(Parcel parcel) {
        super("CHAP");
        this.f12620a = (String) ai.a(parcel.readString());
        this.f12621b = parcel.readInt();
        this.f12622c = parcel.readInt();
        this.f12623d = parcel.readLong();
        this.f12624e = parcel.readLong();
        int readInt = parcel.readInt();
        this.f12625g = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f12625g[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public c(String str, int i, int i2, long j, long j2, h[] hVarArr) {
        super("CHAP");
        this.f12620a = str;
        this.f12621b = i;
        this.f12622c = i2;
        this.f12623d = j;
        this.f12624e = j2;
        this.f12625g = hVarArr;
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
        c cVar = (c) obj;
        return this.f12621b == cVar.f12621b && this.f12622c == cVar.f12622c && this.f12623d == cVar.f12623d && this.f12624e == cVar.f12624e && ai.a((Object) this.f12620a, (Object) cVar.f12620a) && Arrays.equals(this.f12625g, cVar.f12625g);
    }

    public int hashCode() {
        int i = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12621b) * 31) + this.f12622c) * 31) + ((int) this.f12623d)) * 31) + ((int) this.f12624e)) * 31;
        String str = this.f12620a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12620a);
        parcel.writeInt(this.f12621b);
        parcel.writeInt(this.f12622c);
        parcel.writeLong(this.f12623d);
        parcel.writeLong(this.f12624e);
        parcel.writeInt(this.f12625g.length);
        for (h writeParcelable : this.f12625g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
