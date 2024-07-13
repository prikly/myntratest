package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() {
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: a */
        public f[] newArray(int i) {
            return new f[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f12634a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12635b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12636c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f12637d;

    f(Parcel parcel) {
        super("GEOB");
        this.f12634a = (String) ai.a(parcel.readString());
        this.f12635b = (String) ai.a(parcel.readString());
        this.f12636c = (String) ai.a(parcel.readString());
        this.f12637d = (byte[]) ai.a(parcel.createByteArray());
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f12634a = str;
        this.f12635b = str2;
        this.f12636c = str3;
        this.f12637d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return ai.a((Object) this.f12634a, (Object) fVar.f12634a) && ai.a((Object) this.f12635b, (Object) fVar.f12635b) && ai.a((Object) this.f12636c, (Object) fVar.f12636c) && Arrays.equals(this.f12637d, fVar.f12637d);
    }

    public int hashCode() {
        String str = this.f12634a;
        int i = 0;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12635b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12636c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f12637d);
    }

    public String toString() {
        return this.f12643f + ": mimeType=" + this.f12634a + ", filename=" + this.f12635b + ", description=" + this.f12636c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12634a);
        parcel.writeString(this.f12635b);
        parcel.writeString(this.f12636c);
        parcel.writeByteArray(this.f12637d);
    }
}
