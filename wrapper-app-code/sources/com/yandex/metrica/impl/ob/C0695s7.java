package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.s7  reason: case insensitive filesystem */
class C0695s7 implements C0539lm<String, Bundle, C0671r7> {

    /* renamed from: a  reason: collision with root package name */
    private final E7 f6775a;

    /* renamed from: b  reason: collision with root package name */
    private final H7 f6776b;

    C0695s7() {
        this(new E7(), new H7());
    }

    C0695s7(E7 e7, H7 h7) {
        this.f6775a = e7;
        this.f6776b = h7;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1 = new com.yandex.metrica.impl.ob.G7((java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x008b */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.ob.C0671r7 a(java.lang.String r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "arg_hv"
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            goto L_0x0025
        L_0x000a:
            java.lang.String r1 = "arg_df"
            boolean r3 = r9.containsKey(r1)
            if (r3 == 0) goto L_0x0025
            java.lang.String r3 = "arg_ct"
            boolean r4 = r9.containsKey(r3)
            if (r4 != 0) goto L_0x001b
            goto L_0x0025
        L_0x001b:
            java.lang.String r1 = r9.getString(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0027
        L_0x0025:
            r5 = r2
            goto L_0x0030
        L_0x0027:
            long r3 = r9.getLong(r3)
            com.yandex.metrica.impl.ob.u7 r5 = new com.yandex.metrica.impl.ob.u7
            r5.<init>(r8, r1, r3)
        L_0x0030:
            if (r5 == 0) goto L_0x009c
            java.lang.String r8 = "arg_cd"
            java.lang.String r8 = r9.getString(r8)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x009c
            com.yandex.metrica.impl.ob.E7 r1 = r7.f6775a
            com.yandex.metrica.impl.ob.i4 r8 = r1.a((java.lang.String) r8)
            if (r8 == 0) goto L_0x009c
            com.yandex.metrica.impl.ob.H7 r1 = r7.f6776b
            java.lang.String r3 = "arg_rc"
            java.lang.String r9 = r9.getString(r3)
            java.lang.String r3 = ""
            if (r9 != 0) goto L_0x0053
            r9 = r3
        L_0x0053:
            r1.getClass()
            com.yandex.metrica.impl.ob.Tl$a r1 = new com.yandex.metrica.impl.ob.Tl$a     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0091 }
            r6 = 0
            byte[] r9 = android.util.Base64.decode(r9, r6)     // Catch:{ Exception -> 0x0091 }
            r4.<init>(r9)     // Catch:{ Exception -> 0x0091 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r9 = "arg_ee"
            java.lang.String r9 = r1.optString(r9, r3)     // Catch:{ Exception -> 0x008b }
            boolean r3 = r1.has(r0)     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x0076
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x008b }
            goto L_0x0077
        L_0x0076:
            r0 = r2
        L_0x0077:
            com.yandex.metrica.impl.ob.G7 r1 = new com.yandex.metrica.impl.ob.G7     // Catch:{ Exception -> 0x008b }
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x0080
            r9 = r2
        L_0x0080:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x0087
            r0 = r2
        L_0x0087:
            r1.<init>(r9, r0)     // Catch:{ Exception -> 0x008b }
            goto L_0x0096
        L_0x008b:
            com.yandex.metrica.impl.ob.G7 r1 = new com.yandex.metrica.impl.ob.G7     // Catch:{ Exception -> 0x0091 }
            r1.<init>(r2, r2)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0096
        L_0x0091:
            com.yandex.metrica.impl.ob.G7 r1 = new com.yandex.metrica.impl.ob.G7
            r1.<init>(r2, r2)
        L_0x0096:
            com.yandex.metrica.impl.ob.r7 r9 = new com.yandex.metrica.impl.ob.r7
            r9.<init>(r5, r8, r1)
            return r9
        L_0x009c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0695s7.a(java.lang.String, android.os.Bundle):com.yandex.metrica.impl.ob.r7");
    }
}
