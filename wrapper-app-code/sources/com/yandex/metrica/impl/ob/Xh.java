package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Xh implements Parcelable {
    public static final a CREATOR = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f5342a;

    /* renamed from: b  reason: collision with root package name */
    private final U0 f5343b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5344c;

    public static final class a implements Parcelable.Creator<Xh> {
        private a() {
        }

        public Object createFromParcel(Parcel parcel) {
            Object readValue = parcel.readValue(Boolean.TYPE.getClassLoader());
            if (!(readValue instanceof Boolean)) {
                readValue = null;
            }
            U0 a2 = U0.a(parcel.readString());
            Intrinsics.checkNotNullExpressionValue(a2, "IdentifierStatus.from(parcel.readString())");
            return new Xh((Boolean) readValue, a2, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new Xh[i];
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Xh(Boolean bool, U0 u0, String str) {
        this.f5342a = bool;
        this.f5343b = u0;
        this.f5344c = str;
    }

    public final String a() {
        return this.f5344c;
    }

    public final Boolean b() {
        return this.f5342a;
    }

    public final U0 c() {
        return this.f5343b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xh)) {
            return false;
        }
        Xh xh = (Xh) obj;
        return Intrinsics.areEqual((Object) this.f5342a, (Object) xh.f5342a) && Intrinsics.areEqual((Object) this.f5343b, (Object) xh.f5343b) && Intrinsics.areEqual((Object) this.f5344c, (Object) xh.f5344c);
    }

    public int hashCode() {
        Boolean bool = this.f5342a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        U0 u0 = this.f5343b;
        int hashCode2 = (hashCode + (u0 != null ? u0.hashCode() : 0)) * 31;
        String str = this.f5344c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "FeaturesInternal(sslPinning=" + this.f5342a + ", status=" + this.f5343b + ", errorExplanation=" + this.f5344c + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f5342a);
        parcel.writeString(this.f5343b.a());
        parcel.writeString(this.f5344c);
    }

    public Xh() {
        this((Boolean) null, U0.UNKNOWN, (String) null);
    }
}
