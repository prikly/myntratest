package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.zl  reason: case insensitive filesystem */
public class C0877zl implements Parcelable {
    public static final Parcelable.Creator<C0877zl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final b f7237a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7238b;

    /* renamed from: com.yandex.metrica.impl.ob.zl$a */
    class a implements Parcelable.Creator<C0877zl> {
        a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C0877zl(parcel);
        }

        public Object[] newArray(int i) {
            return new C0877zl[i];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.zl$b */
    public enum b {
        EQUALS(0),
        CONTAINS(1),
        MATCHES(2),
        DOES_NOT_MATCH(3);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f7244a;

        private b(int i) {
            this.f7244a = i;
        }

        public static b a(int i) {
            b[] values = values();
            for (int i2 = 0; i2 < 4; i2++) {
                b bVar = values[i2];
                if (bVar.f7244a == i) {
                    return bVar;
                }
            }
            return EQUALS;
        }
    }

    public C0877zl(b bVar, String str) {
        this.f7237a = bVar;
        this.f7238b = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0877zl.class != obj.getClass()) {
            return false;
        }
        C0877zl zlVar = (C0877zl) obj;
        if (this.f7237a != zlVar.f7237a) {
            return false;
        }
        return this.f7238b.equals(zlVar.f7238b);
    }

    public int hashCode() {
        return (this.f7237a.hashCode() * 31) + this.f7238b.hashCode();
    }

    public String toString() {
        return "UiParsingFilter{type=" + this.f7237a + ", value='" + this.f7238b + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7237a.f7244a);
        parcel.writeString(this.f7238b);
    }

    protected C0877zl(Parcel parcel) {
        this.f7237a = b.a(parcel.readInt());
        this.f7238b = (String) Tl.a(parcel.readString(), "");
    }
}
