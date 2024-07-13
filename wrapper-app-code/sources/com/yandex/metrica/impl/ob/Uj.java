package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

public class Uj implements Yj<List<Tj>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Ij f5189a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0845yd f5190b;

    Uj(Ij ij, C0845yd ydVar) {
        this.f5189a = ij;
        this.f5190b = ydVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC, Splitter:B:15:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061 A[SYNTHETIC, Splitter:B:28:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d A[SYNTHETIC, Splitter:B:38:0x008d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.ob.Tj a() {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.Tj r0 = new com.yandex.metrica.impl.ob.Tj
            com.yandex.metrica.impl.ob.Ij r1 = r8.f5189a
            android.telephony.TelephonyManager r1 = r1.f()
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = r1.getSimOperator()     // Catch:{ all -> 0x002d }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x001c
            r4 = 0
            java.lang.String r1 = r1.substring(r4, r2)     // Catch:{ all -> 0x002d }
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x002d }
            if (r4 == 0) goto L_0x0024
            goto L_0x002d
        L_0x0024:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x002d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x002d }
            goto L_0x002e
        L_0x002d:
            r1 = r3
        L_0x002e:
            com.yandex.metrica.impl.ob.Ij r4 = r8.f5189a
            android.telephony.TelephonyManager r4 = r4.f()
            if (r4 == 0) goto L_0x0056
            java.lang.String r4 = r4.getSimOperator()     // Catch:{ all -> 0x0056 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0056 }
            if (r5 != 0) goto L_0x0045
            java.lang.String r2 = r4.substring(r2)     // Catch:{ all -> 0x0056 }
            goto L_0x0046
        L_0x0045:
            r2 = r3
        L_0x0046:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x004d
            goto L_0x0056
        L_0x004d:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0056 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0056 }
            goto L_0x0057
        L_0x0056:
            r2 = r3
        L_0x0057:
            com.yandex.metrica.impl.ob.Ij r4 = r8.f5189a
            android.telephony.TelephonyManager r4 = r4.f()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            if (r4 == 0) goto L_0x007c
            com.yandex.metrica.impl.ob.yd r6 = r8.f5190b     // Catch:{ all -> 0x007c }
            com.yandex.metrica.impl.ob.Ij r7 = r8.f5189a     // Catch:{ all -> 0x007c }
            android.content.Context r7 = r7.e()     // Catch:{ all -> 0x007c }
            boolean r6 = r6.b(r7)     // Catch:{ all -> 0x007c }
            if (r6 == 0) goto L_0x007c
            boolean r4 = r4.isNetworkRoaming()     // Catch:{ all -> 0x007c }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x007c }
            goto L_0x007d
        L_0x007c:
            r4 = r3
        L_0x007d:
            if (r4 != 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r5 = r4
        L_0x0081:
            boolean r4 = r5.booleanValue()
            com.yandex.metrica.impl.ob.Ij r5 = r8.f5189a
            android.telephony.TelephonyManager r5 = r5.f()
            if (r5 == 0) goto L_0x0091
            java.lang.String r3 = r5.getSimOperatorName()     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0.<init>(r1, r2, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Uj.a():com.yandex.metrica.impl.ob.Tj");
    }

    public Object b() {
        ArrayList arrayList = new ArrayList();
        if (this.f5189a.d()) {
            if (A2.a(23)) {
                if (this.f5190b.b(this.f5189a.e())) {
                    arrayList.addAll(Vj.a(this.f5189a.e()));
                }
                if (arrayList.size() == 0) {
                    arrayList.add(a());
                }
            } else {
                arrayList.add(a());
            }
        }
        return arrayList;
    }
}
