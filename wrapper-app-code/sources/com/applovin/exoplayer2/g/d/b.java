package com.applovin.exoplayer2.g.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class b implements a.C0122a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: a */
        public b[] newArray(int i) {
            return new b[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f12606a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12607b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12608c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12609d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12610e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12611f;

    public b(int i, String str, String str2, String str3, boolean z, int i2) {
        com.applovin.exoplayer2.l.a.a(i2 == -1 || i2 > 0);
        this.f12606a = i;
        this.f12607b = str;
        this.f12608c = str2;
        this.f12609d = str3;
        this.f12610e = z;
        this.f12611f = i2;
    }

    b(Parcel parcel) {
        this.f12606a = parcel.readInt();
        this.f12607b = parcel.readString();
        this.f12608c = parcel.readString();
        this.f12609d = parcel.readString();
        this.f12610e = ai.a(parcel);
        this.f12611f = parcel.readInt();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.exoplayer2.g.d.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0039 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = 1
            goto L_0x0037
        L_0x0021:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x003a }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x003a }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x003a }
            com.applovin.exoplayer2.l.q.c(r2, r7)     // Catch:{ NumberFormatException -> 0x003a }
            r1 = 0
            r6 = -1
        L_0x0037:
            r7 = r6
            goto L_0x0053
        L_0x0039:
            r6 = -1
        L_0x003a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid bitrate header: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.applovin.exoplayer2.l.q.c(r2, r1)
            r7 = r6
            r1 = 0
            goto L_0x0053
        L_0x0051:
            r1 = 0
            r7 = -1
        L_0x0053:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0067
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r9 = r8
        L_0x0068:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x007b
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = 1
            goto L_0x007c
        L_0x007b:
            r10 = r8
        L_0x007c:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008f
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = 1
            goto L_0x0090
        L_0x008f:
            r11 = r8
        L_0x0090:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a9
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = 1
            goto L_0x00aa
        L_0x00a9:
            r12 = 0
        L_0x00aa:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00ea
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00d8 }
            if (r5 <= 0) goto L_0x00c2
            r3 = r5
            goto L_0x00d5
        L_0x00c2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.append(r13)     // Catch:{ NumberFormatException -> 0x00d7 }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00d7 }
            com.applovin.exoplayer2.l.q.c(r2, r4)     // Catch:{ NumberFormatException -> 0x00d7 }
            r4 = r1
        L_0x00d5:
            r1 = r4
            goto L_0x00ea
        L_0x00d7:
            r3 = r5
        L_0x00d8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            com.applovin.exoplayer2.l.q.c(r2, r13)
        L_0x00ea:
            if (r1 == 0) goto L_0x00f8
            com.applovin.exoplayer2.g.d.b r13 = new com.applovin.exoplayer2.g.d.b
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L_0x00f8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.g.d.b.a(java.util.Map):com.applovin.exoplayer2.g.d.b");
    }

    public /* synthetic */ v a() {
        return a.C0122a.CC.$default$a(this);
    }

    public /* synthetic */ void a(ac.a aVar) {
        a.C0122a.CC.$default$a(this, aVar);
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
        b bVar = (b) obj;
        return this.f12606a == bVar.f12606a && ai.a((Object) this.f12607b, (Object) bVar.f12607b) && ai.a((Object) this.f12608c, (Object) bVar.f12608c) && ai.a((Object) this.f12609d, (Object) bVar.f12609d) && this.f12610e == bVar.f12610e && this.f12611f == bVar.f12611f;
    }

    public int hashCode() {
        int i = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12606a) * 31;
        String str = this.f12607b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12608c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12609d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f12610e ? 1 : 0)) * 31) + this.f12611f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f12608c + "\", genre=\"" + this.f12607b + "\", bitrate=" + this.f12606a + ", metadataInterval=" + this.f12611f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12606a);
        parcel.writeString(this.f12607b);
        parcel.writeString(this.f12608c);
        parcel.writeString(this.f12609d);
        ai.a(parcel, this.f12610e);
        parcel.writeInt(this.f12611f);
    }
}
