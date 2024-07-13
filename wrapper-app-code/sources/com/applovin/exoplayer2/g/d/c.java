package com.applovin.exoplayer2.g.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.v;
import java.util.Arrays;

public final class c implements a.C0122a {
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
    public final byte[] f12612a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12613b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12614c;

    c(Parcel parcel) {
        this.f12612a = (byte[]) com.applovin.exoplayer2.l.a.b(parcel.createByteArray());
        this.f12613b = parcel.readString();
        this.f12614c = parcel.readString();
    }

    public c(byte[] bArr, String str, String str2) {
        this.f12612a = bArr;
        this.f12613b = str;
        this.f12614c = str2;
    }

    public /* synthetic */ v a() {
        return a.C0122a.CC.$default$a(this);
    }

    public void a(ac.a aVar) {
        String str = this.f12613b;
        if (str != null) {
            aVar.a((CharSequence) str);
        }
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
        return Arrays.equals(this.f12612a, ((c) obj).f12612a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12612a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f12613b, this.f12614c, Integer.valueOf(this.f12612a.length)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f12612a);
        parcel.writeString(this.f12613b);
        parcel.writeString(this.f12614c);
    }
}
