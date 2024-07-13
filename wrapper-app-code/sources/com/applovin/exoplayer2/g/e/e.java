package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() {
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: a */
        public e[] newArray(int i) {
            return new e[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f12631a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12632b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12633c;

    e(Parcel parcel) {
        super("COMM");
        this.f12631a = (String) ai.a(parcel.readString());
        this.f12632b = (String) ai.a(parcel.readString());
        this.f12633c = (String) ai.a(parcel.readString());
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f12631a = str;
        this.f12632b = str2;
        this.f12633c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return ai.a((Object) this.f12632b, (Object) eVar.f12632b) && ai.a((Object) this.f12631a, (Object) eVar.f12631a) && ai.a((Object) this.f12633c, (Object) eVar.f12633c);
    }

    public int hashCode() {
        String str = this.f12631a;
        int i = 0;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12632b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12633c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f12643f + ": language=" + this.f12631a + ", description=" + this.f12632b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12643f);
        parcel.writeString(this.f12631a);
        parcel.writeString(this.f12633c);
    }
}
