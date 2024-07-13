package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() {
        /* renamed from: a */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        /* renamed from: a */
        public i[] newArray(int i) {
            return new i[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f12644a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12645b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12646c;

    i(Parcel parcel) {
        super("----");
        this.f12644a = (String) ai.a(parcel.readString());
        this.f12645b = (String) ai.a(parcel.readString());
        this.f12646c = (String) ai.a(parcel.readString());
    }

    public i(String str, String str2, String str3) {
        super("----");
        this.f12644a = str;
        this.f12645b = str2;
        this.f12646c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return ai.a((Object) this.f12645b, (Object) iVar.f12645b) && ai.a((Object) this.f12644a, (Object) iVar.f12644a) && ai.a((Object) this.f12646c, (Object) iVar.f12646c);
    }

    public int hashCode() {
        String str = this.f12644a;
        int i = 0;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12645b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12646c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f12643f + ": domain=" + this.f12644a + ", description=" + this.f12645b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12643f);
        parcel.writeString(this.f12644a);
        parcel.writeString(this.f12646c);
    }
}
