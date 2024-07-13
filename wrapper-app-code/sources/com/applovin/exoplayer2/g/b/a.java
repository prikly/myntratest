package com.applovin.exoplayer2.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class a implements a.C0122a {
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

    /* renamed from: f  reason: collision with root package name */
    private static final v f12581f = new v.a().f("application/id3").a();

    /* renamed from: g  reason: collision with root package name */
    private static final v f12582g = new v.a().f("application/x-scte35").a();

    /* renamed from: a  reason: collision with root package name */
    public final String f12583a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12584b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12585c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12586d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f12587e;

    /* renamed from: h  reason: collision with root package name */
    private int f12588h;

    a(Parcel parcel) {
        this.f12583a = (String) ai.a(parcel.readString());
        this.f12584b = (String) ai.a(parcel.readString());
        this.f12585c = parcel.readLong();
        this.f12586d = parcel.readLong();
        this.f12587e = (byte[]) ai.a(parcel.createByteArray());
    }

    public a(String str, String str2, long j, long j2, byte[] bArr) {
        this.f12583a = str;
        this.f12584b = str2;
        this.f12585c = j;
        this.f12586d = j2;
        this.f12587e = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.exoplayer2.v a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f12583a
            int r1 = r0.hashCode()
            r2 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = -795945609(0xffffffffd08ed577, float:-1.91708344E10)
            if (r1 == r2) goto L_0x0022
            r2 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            r0 = 0
            return r0
        L_0x003f:
            com.applovin.exoplayer2.v r0 = f12582g
            return r0
        L_0x0042:
            com.applovin.exoplayer2.v r0 = f12581f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.g.b.a.a():com.applovin.exoplayer2.v");
    }

    public /* synthetic */ void a(ac.a aVar) {
        a.C0122a.CC.$default$a(this, aVar);
    }

    public byte[] b() {
        if (a() != null) {
            return this.f12587e;
        }
        return null;
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
        a aVar = (a) obj;
        return this.f12585c == aVar.f12585c && this.f12586d == aVar.f12586d && ai.a((Object) this.f12583a, (Object) aVar.f12583a) && ai.a((Object) this.f12584b, (Object) aVar.f12584b) && Arrays.equals(this.f12587e, aVar.f12587e);
    }

    public int hashCode() {
        if (this.f12588h == 0) {
            String str = this.f12583a;
            int i = 0;
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f12584b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.f12585c;
            long j2 = this.f12586d;
            this.f12588h = ((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f12587e);
        }
        return this.f12588h;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f12583a + ", id=" + this.f12586d + ", durationMs=" + this.f12585c + ", value=" + this.f12584b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12583a);
        parcel.writeString(this.f12584b);
        parcel.writeLong(this.f12585c);
        parcel.writeLong(this.f12586d);
        parcel.writeByteArray(this.f12587e);
    }
}
