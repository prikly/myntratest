package com.applovin.exoplayer2.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.List;

public final class a implements Parcelable {
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
    private final C0122a[] f12578a;

    /* renamed from: com.applovin.exoplayer2.g.a$a  reason: collision with other inner class name */
    public interface C0122a extends Parcelable {

        /* renamed from: com.applovin.exoplayer2.g.a$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static v $default$a(C0122a aVar) {
                return null;
            }

            public static void $default$a(C0122a aVar, ac.a aVar2) {
            }

            public static byte[] $default$b(C0122a aVar) {
                return null;
            }
        }

        v a();

        void a(ac.a aVar);

        byte[] b();
    }

    a(Parcel parcel) {
        this.f12578a = new C0122a[parcel.readInt()];
        int i = 0;
        while (true) {
            C0122a[] aVarArr = this.f12578a;
            if (i < aVarArr.length) {
                aVarArr[i] = (C0122a) parcel.readParcelable(C0122a.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public a(List<? extends C0122a> list) {
        this.f12578a = (C0122a[]) list.toArray(new C0122a[0]);
    }

    public a(C0122a... aVarArr) {
        this.f12578a = aVarArr;
    }

    public int a() {
        return this.f12578a.length;
    }

    public C0122a a(int i) {
        return this.f12578a[i];
    }

    public a a(a aVar) {
        return aVar == null ? this : a(aVar.f12578a);
    }

    public a a(C0122a... aVarArr) {
        return aVarArr.length == 0 ? this : new a((C0122a[]) ai.a((T[]) this.f12578a, (T[]) aVarArr));
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
        return Arrays.equals(this.f12578a, ((a) obj).f12578a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12578a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f12578a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12578a.length);
        for (C0122a writeParcelable : this.f12578a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
