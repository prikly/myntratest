package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class a extends h {
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
    public final String f12615a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12616b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12617c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f12618d;

    a(Parcel parcel) {
        super("APIC");
        this.f12615a = (String) ai.a(parcel.readString());
        this.f12616b = parcel.readString();
        this.f12617c = parcel.readInt();
        this.f12618d = (byte[]) ai.a(parcel.createByteArray());
    }

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f12615a = str;
        this.f12616b = str2;
        this.f12617c = i;
        this.f12618d = bArr;
    }

    public void a(ac.a aVar) {
        aVar.a(this.f12618d, this.f12617c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12617c == aVar.f12617c && ai.a((Object) this.f12615a, (Object) aVar.f12615a) && ai.a((Object) this.f12616b, (Object) aVar.f12616b) && Arrays.equals(this.f12618d, aVar.f12618d);
    }

    public int hashCode() {
        int i = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12617c) * 31;
        String str = this.f12615a;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12616b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f12618d);
    }

    public String toString() {
        return this.f12643f + ": mimeType=" + this.f12615a + ", description=" + this.f12616b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12615a);
        parcel.writeString(this.f12616b);
        parcel.writeInt(this.f12617c);
        parcel.writeByteArray(this.f12618d);
    }
}
