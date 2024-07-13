package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator<l>() {
        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        /* renamed from: a */
        public l[] newArray(int i) {
            return new l[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f12654a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12655b;

    l(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f12654a = parcel.readString();
        this.f12655b = (String) ai.a(parcel.readString());
    }

    public l(String str, String str2, String str3) {
        super(str);
        this.f12654a = str2;
        this.f12655b = str3;
    }

    private static List<Integer> a(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            } else {
                if (str.length() >= 4) {
                    parseInt = Integer.parseInt(str.substring(0, 4));
                }
                return arrayList;
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.exoplayer2.ac.a r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.f12643f
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            switch(r1) {
                case 82815: goto L_0x00fc;
                case 82878: goto L_0x00f1;
                case 82897: goto L_0x00e6;
                case 83253: goto L_0x00dc;
                case 83254: goto L_0x00d2;
                case 83255: goto L_0x00c7;
                case 83341: goto L_0x00bc;
                case 83378: goto L_0x00b2;
                case 83536: goto L_0x00a7;
                case 83552: goto L_0x009c;
                case 2567331: goto L_0x0091;
                case 2569357: goto L_0x0085;
                case 2569891: goto L_0x0079;
                case 2570401: goto L_0x006d;
                case 2570410: goto L_0x0061;
                case 2571565: goto L_0x0055;
                case 2575251: goto L_0x004a;
                case 2581512: goto L_0x003f;
                case 2581513: goto L_0x0034;
                case 2581514: goto L_0x0028;
                case 2583398: goto L_0x001c;
                case 2590194: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0106
        L_0x0010:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 11
            goto L_0x0107
        L_0x001c:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 9
            goto L_0x0107
        L_0x0028:
            java.lang.String r1 = "TPE3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 19
            goto L_0x0107
        L_0x0034:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 5
            goto L_0x0107
        L_0x003f:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 3
            goto L_0x0107
        L_0x004a:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 1
            goto L_0x0107
        L_0x0055:
            java.lang.String r1 = "TEXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 21
            goto L_0x0107
        L_0x0061:
            java.lang.String r1 = "TDRL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 15
            goto L_0x0107
        L_0x006d:
            java.lang.String r1 = "TDRC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 14
            goto L_0x0107
        L_0x0079:
            java.lang.String r1 = "TDAT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 13
            goto L_0x0107
        L_0x0085:
            java.lang.String r1 = "TCOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 17
            goto L_0x0107
        L_0x0091:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 7
            goto L_0x0107
        L_0x009c:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 10
            goto L_0x0107
        L_0x00a7:
            java.lang.String r1 = "TXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 20
            goto L_0x0107
        L_0x00b2:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 0
            goto L_0x0107
        L_0x00bc:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 8
            goto L_0x0107
        L_0x00c7:
            java.lang.String r1 = "TP3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 18
            goto L_0x0107
        L_0x00d2:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 4
            goto L_0x0107
        L_0x00dc:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 2
            goto L_0x0107
        L_0x00e6:
            java.lang.String r1 = "TDA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 12
            goto L_0x0107
        L_0x00f1:
            java.lang.String r1 = "TCM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 16
            goto L_0x0107
        L_0x00fc:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 6
            goto L_0x0107
        L_0x0106:
            r0 = -1
        L_0x0107:
            switch(r0) {
                case 0: goto L_0x01ec;
                case 1: goto L_0x01ec;
                case 2: goto L_0x01e6;
                case 3: goto L_0x01e6;
                case 4: goto L_0x01e0;
                case 5: goto L_0x01e0;
                case 6: goto L_0x01da;
                case 7: goto L_0x01da;
                case 8: goto L_0x01b1;
                case 9: goto L_0x01b1;
                case 10: goto L_0x01a3;
                case 11: goto L_0x01a3;
                case 12: goto L_0x017f;
                case 13: goto L_0x017f;
                case 14: goto L_0x0150;
                case 15: goto L_0x0121;
                case 16: goto L_0x011a;
                case 17: goto L_0x011a;
                case 18: goto L_0x0113;
                case 19: goto L_0x0113;
                case 20: goto L_0x010c;
                case 21: goto L_0x010c;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x01f1
        L_0x010c:
            java.lang.String r0 = r7.f12655b
            r8.h((java.lang.CharSequence) r0)
            goto L_0x01f1
        L_0x0113:
            java.lang.String r0 = r7.f12655b
            r8.j((java.lang.CharSequence) r0)
            goto L_0x01f1
        L_0x011a:
            java.lang.String r0 = r7.f12655b
            r8.i((java.lang.CharSequence) r0)
            goto L_0x01f1
        L_0x0121:
            java.lang.String r0 = r7.f12655b
            java.util.List r0 = a((java.lang.String) r0)
            int r1 = r0.size()
            if (r1 == r6) goto L_0x0145
            if (r1 == r5) goto L_0x013c
            if (r1 == r3) goto L_0x0133
            goto L_0x01f1
        L_0x0133:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.i((java.lang.Integer) r1)
        L_0x013c:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.h((java.lang.Integer) r1)
        L_0x0145:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.g((java.lang.Integer) r0)
            goto L_0x01f1
        L_0x0150:
            java.lang.String r0 = r7.f12655b
            java.util.List r0 = a((java.lang.String) r0)
            int r1 = r0.size()
            if (r1 == r6) goto L_0x0174
            if (r1 == r5) goto L_0x016b
            if (r1 == r3) goto L_0x0162
            goto L_0x01f1
        L_0x0162:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.f((java.lang.Integer) r1)
        L_0x016b:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.e((java.lang.Integer) r1)
        L_0x0174:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.d((java.lang.Integer) r0)
            goto L_0x01f1
        L_0x017f:
            java.lang.String r0 = r7.f12655b     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f1 }
            java.lang.String r0 = r0.substring(r5, r2)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f1 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f1 }
            java.lang.String r1 = r7.f12655b     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f1 }
            java.lang.String r1 = r1.substring(r4, r5)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f1 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f1 }
            com.applovin.exoplayer2.ac$a r8 = r8.e((java.lang.Integer) r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f1 }
            r8.f((java.lang.Integer) r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x01f1 }
            goto L_0x01f1
        L_0x01a3:
            java.lang.String r0 = r7.f12655b     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            r8.d((java.lang.Integer) r0)     // Catch:{  }
            goto L_0x01f1
        L_0x01b1:
            java.lang.String r0 = r7.f12655b
            java.lang.String r1 = "/"
            java.lang.String[] r0 = com.applovin.exoplayer2.l.ai.a((java.lang.String) r0, (java.lang.String) r1)
            r1 = r0[r4]     // Catch:{  }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{  }
            int r2 = r0.length     // Catch:{  }
            if (r2 <= r6) goto L_0x01cd
            r0 = r0[r6]     // Catch:{  }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{  }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{  }
            goto L_0x01ce
        L_0x01cd:
            r0 = 0
        L_0x01ce:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{  }
            com.applovin.exoplayer2.ac$a r8 = r8.a((java.lang.Integer) r1)     // Catch:{  }
            r8.b((java.lang.Integer) r0)     // Catch:{  }
            goto L_0x01f1
        L_0x01da:
            java.lang.String r0 = r7.f12655b
            r8.c((java.lang.CharSequence) r0)
            goto L_0x01f1
        L_0x01e0:
            java.lang.String r0 = r7.f12655b
            r8.d((java.lang.CharSequence) r0)
            goto L_0x01f1
        L_0x01e6:
            java.lang.String r0 = r7.f12655b
            r8.b((java.lang.CharSequence) r0)
            goto L_0x01f1
        L_0x01ec:
            java.lang.String r0 = r7.f12655b
            r8.a((java.lang.CharSequence) r0)
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.g.e.l.a(com.applovin.exoplayer2.ac$a):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return ai.a((Object) this.f12643f, (Object) lVar.f12643f) && ai.a((Object) this.f12654a, (Object) lVar.f12654a) && ai.a((Object) this.f12655b, (Object) lVar.f12655b);
    }

    public int hashCode() {
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12643f.hashCode()) * 31;
        String str = this.f12654a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12655b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f12643f + ": description=" + this.f12654a + ": value=" + this.f12655b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12643f);
        parcel.writeString(this.f12654a);
        parcel.writeString(this.f12655b);
    }
}
