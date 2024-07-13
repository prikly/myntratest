package com.applovin.exoplayer2.g.c;

import android.os.Parcel;
import android.os.Parcelable;
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
    public final String f12600a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12601b;

    b(Parcel parcel) {
        this.f12600a = (String) ai.a(parcel.readString());
        this.f12601b = (String) ai.a(parcel.readString());
    }

    public b(String str, String str2) {
        this.f12600a = str;
        this.f12601b = str2;
    }

    public /* synthetic */ v a() {
        return a.C0122a.CC.$default$a(this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.exoplayer2.ac.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f12600a
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case 62359119: goto L_0x0036;
                case 79833656: goto L_0x002c;
                case 428414940: goto L_0x0022;
                case 1746739798: goto L_0x0018;
                case 1939198791: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0018:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 3
            goto L_0x0041
        L_0x0022:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 4
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 2
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 == 0) goto L_0x0064
            if (r0 == r5) goto L_0x005e
            if (r0 == r4) goto L_0x0058
            if (r0 == r3) goto L_0x0052
            if (r0 == r2) goto L_0x004c
            goto L_0x0069
        L_0x004c:
            java.lang.String r0 = r6.f12601b
            r7.g((java.lang.CharSequence) r0)
            goto L_0x0069
        L_0x0052:
            java.lang.String r0 = r6.f12601b
            r7.d((java.lang.CharSequence) r0)
            goto L_0x0069
        L_0x0058:
            java.lang.String r0 = r6.f12601b
            r7.c((java.lang.CharSequence) r0)
            goto L_0x0069
        L_0x005e:
            java.lang.String r0 = r6.f12601b
            r7.b((java.lang.CharSequence) r0)
            goto L_0x0069
        L_0x0064:
            java.lang.String r0 = r6.f12601b
            r7.a((java.lang.CharSequence) r0)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.g.c.b.a(com.applovin.exoplayer2.ac$a):void");
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
        return this.f12600a.equals(bVar.f12600a) && this.f12601b.equals(bVar.f12601b);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12600a.hashCode()) * 31) + this.f12601b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f12600a + "=" + this.f12601b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12600a);
        parcel.writeString(this.f12601b);
    }
}
