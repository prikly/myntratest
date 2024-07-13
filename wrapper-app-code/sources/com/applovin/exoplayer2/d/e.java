package com.applovin.exoplayer2.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class e implements Parcelable, Comparator<a> {
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
    public final String f11754a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11755b;

    /* renamed from: c  reason: collision with root package name */
    private final a[] f11756c;

    /* renamed from: d  reason: collision with root package name */
    private int f11757d;

    public static final class a implements Parcelable {
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
        public final UUID f11758a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11759b;

        /* renamed from: c  reason: collision with root package name */
        public final String f11760c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f11761d;

        /* renamed from: e  reason: collision with root package name */
        private int f11762e;

        a(Parcel parcel) {
            this.f11758a = new UUID(parcel.readLong(), parcel.readLong());
            this.f11759b = parcel.readString();
            this.f11760c = (String) ai.a(parcel.readString());
            this.f11761d = parcel.createByteArray();
        }

        public a(UUID uuid, String str, String str2, byte[] bArr) {
            this.f11758a = (UUID) com.applovin.exoplayer2.l.a.b(uuid);
            this.f11759b = str;
            this.f11760c = (String) com.applovin.exoplayer2.l.a.b(str2);
            this.f11761d = bArr;
        }

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, (String) null, str, bArr);
        }

        public a a(byte[] bArr) {
            return new a(this.f11758a, this.f11759b, this.f11760c, bArr);
        }

        public boolean a(UUID uuid) {
            return h.f12712a.equals(this.f11758a) || uuid.equals(this.f11758a);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return ai.a((Object) this.f11759b, (Object) aVar.f11759b) && ai.a((Object) this.f11760c, (Object) aVar.f11760c) && ai.a((Object) this.f11758a, (Object) aVar.f11758a) && Arrays.equals(this.f11761d, aVar.f11761d);
        }

        public int hashCode() {
            if (this.f11762e == 0) {
                int hashCode = this.f11758a.hashCode() * 31;
                String str = this.f11759b;
                this.f11762e = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f11760c.hashCode()) * 31) + Arrays.hashCode(this.f11761d);
            }
            return this.f11762e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f11758a.getMostSignificantBits());
            parcel.writeLong(this.f11758a.getLeastSignificantBits());
            parcel.writeString(this.f11759b);
            parcel.writeString(this.f11760c);
            parcel.writeByteArray(this.f11761d);
        }
    }

    e(Parcel parcel) {
        this.f11754a = parcel.readString();
        a[] aVarArr = (a[]) ai.a((a[]) parcel.createTypedArray(a.CREATOR));
        this.f11756c = aVarArr;
        this.f11755b = aVarArr.length;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.applovin.exoplayer2.d.e$a[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e(java.lang.String r1, boolean r2, com.applovin.exoplayer2.d.e.a... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f11754a = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.applovin.exoplayer2.d.e$a[] r3 = (com.applovin.exoplayer2.d.e.a[]) r3
        L_0x000e:
            r0.f11756c = r3
            int r1 = r3.length
            r0.f11755b = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.d.e.<init>(java.lang.String, boolean, com.applovin.exoplayer2.d.e$a[]):void");
    }

    public e(String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    public e(List<a> list) {
        this((String) null, false, (a[]) list.toArray(new a[0]));
    }

    public e(a... aVarArr) {
        this((String) null, aVarArr);
    }

    /* renamed from: a */
    public int compare(a aVar, a aVar2) {
        return h.f12712a.equals(aVar.f11758a) ? h.f12712a.equals(aVar2.f11758a) ? 0 : 1 : aVar.f11758a.compareTo(aVar2.f11758a);
    }

    public a a(int i) {
        return this.f11756c[i];
    }

    public e a(String str) {
        return ai.a((Object) this.f11754a, (Object) str) ? this : new e(str, false, this.f11756c);
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
        e eVar = (e) obj;
        return ai.a((Object) this.f11754a, (Object) eVar.f11754a) && Arrays.equals(this.f11756c, eVar.f11756c);
    }

    public int hashCode() {
        if (this.f11757d == 0) {
            String str = this.f11754a;
            this.f11757d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f11756c);
        }
        return this.f11757d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11754a);
        parcel.writeTypedArray(this.f11756c, 0);
    }
}
