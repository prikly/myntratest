package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.wj  reason: case insensitive filesystem */
public class C0803wj implements Yj<C0755uj> {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final SparseArray<String> f7055d = new a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Ij f7056a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0869zd f7057b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0869zd f7058c;

    /* renamed from: com.yandex.metrica.impl.ob.wj$a */
    class a extends SparseArray<String> {
        a() {
            put(0, (Object) null);
            put(7, "1xRTT");
            put(4, "CDMA");
            put(2, "EDGE");
            put(14, "eHRPD");
            put(5, "EVDO rev.0");
            put(6, "EVDO rev.A");
            put(12, "EVDO rev.B");
            put(1, "GPRS");
            put(8, "HSDPA");
            put(10, "HSPA");
            put(15, "HSPA+");
            put(9, "HSUPA");
            put(11, "iDen");
            put(3, "UMTS");
            put(12, "EVDO rev.B");
            put(14, "eHRPD");
            put(13, "LTE");
            put(15, "HSPA+");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$b */
    class b implements C0869zd {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0845yd f7059a;

        b(C0803wj wjVar, C0845yd ydVar) {
            this.f7059a = ydVar;
        }

        public boolean a(Context context) {
            this.f7059a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$c */
    class c implements C0869zd {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0845yd f7060a;

        c(C0803wj wjVar, C0845yd ydVar) {
            this.f7060a = ydVar;
        }

        public boolean a(Context context) {
            return this.f7060a.b(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$d */
    class d implements C0869zd {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0845yd f7061a;

        d(C0803wj wjVar, C0845yd ydVar) {
            this.f7061a = ydVar;
        }

        public boolean a(Context context) {
            return this.f7061a.a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$e */
    class e implements C0869zd {
        e(C0803wj wjVar) {
        }

        public boolean a(Context context) {
            return true;
        }
    }

    public C0803wj(Ij ij, C0845yd ydVar) {
        this.f7056a = ij;
        if (A2.a(29)) {
            this.f7057b = new b(this, ydVar);
            this.f7058c = new c(this, ydVar);
            return;
        }
        this.f7057b = new d(this, ydVar);
        this.f7058c = new e(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[SYNTHETIC, Splitter:B:17:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[SYNTHETIC, Splitter:B:29:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a4 A[SYNTHETIC, Splitter:B:41:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7 A[SYNTHETIC, Splitter:B:53:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb A[SYNTHETIC, Splitter:B:59:0x00eb] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b() {
        /*
            r7 = this;
            com.yandex.metrica.impl.ob.Ij r0 = r7.f7056a
            boolean r0 = r0.c()
            r1 = 0
            if (r0 == 0) goto L_0x0121
            com.yandex.metrica.impl.ob.uj$a r0 = new com.yandex.metrica.impl.ob.uj$a
            r0.<init>()
            com.yandex.metrica.impl.ob.Ij r2 = r7.f7056a
            android.telephony.TelephonyManager r2 = r2.f()
            r3 = -1
            if (r2 == 0) goto L_0x003d
            com.yandex.metrica.impl.ob.zd r4 = r7.f7057b     // Catch:{ all -> 0x003d }
            com.yandex.metrica.impl.ob.Ij r5 = r7.f7056a     // Catch:{ all -> 0x003d }
            android.content.Context r5 = r5.e()     // Catch:{ all -> 0x003d }
            boolean r4 = r4.a(r5)     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x003d
            android.telephony.CellLocation r2 = r2.getCellLocation()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x0030
            goto L_0x003d
        L_0x0030:
            android.telephony.gsm.GsmCellLocation r2 = (android.telephony.gsm.GsmCellLocation) r2     // Catch:{ all -> 0x003d }
            int r2 = r2.getLac()     // Catch:{ all -> 0x003d }
            if (r3 == r2) goto L_0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003d }
            goto L_0x003e
        L_0x003d:
            r2 = r1
        L_0x003e:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.c((java.lang.Integer) r2)
            com.yandex.metrica.impl.ob.Ij r2 = r7.f7056a
            android.telephony.TelephonyManager r2 = r2.f()
            r4 = 3
            r5 = 0
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = r2.getNetworkOperator()     // Catch:{ all -> 0x006b }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x006b }
            if (r6 != 0) goto L_0x005b
            java.lang.String r2 = r2.substring(r5, r4)     // Catch:{ all -> 0x006b }
            goto L_0x005c
        L_0x005b:
            r2 = r1
        L_0x005c:
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x006b }
            if (r6 != 0) goto L_0x006b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x006b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r2 = r1
        L_0x006c:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.i((java.lang.Integer) r2)
            com.yandex.metrica.impl.ob.Ij r2 = r7.f7056a
            android.telephony.TelephonyManager r2 = r2.f()
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = r2.getNetworkOperator()     // Catch:{ all -> 0x0097 }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0087
            java.lang.String r2 = r2.substring(r4)     // Catch:{ all -> 0x0097 }
            goto L_0x0088
        L_0x0087:
            r2 = r1
        L_0x0088:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0097 }
            if (r4 != 0) goto L_0x0097
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0097 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0097 }
            goto L_0x0098
        L_0x0097:
            r2 = r1
        L_0x0098:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.j((java.lang.Integer) r2)
            com.yandex.metrica.impl.ob.Ij r2 = r7.f7056a
            android.telephony.TelephonyManager r2 = r2.f()
            if (r2 == 0) goto L_0x00ca
            com.yandex.metrica.impl.ob.zd r4 = r7.f7057b     // Catch:{ all -> 0x00ca }
            com.yandex.metrica.impl.ob.Ij r6 = r7.f7056a     // Catch:{ all -> 0x00ca }
            android.content.Context r6 = r6.e()     // Catch:{ all -> 0x00ca }
            boolean r4 = r4.a(r6)     // Catch:{ all -> 0x00ca }
            if (r4 == 0) goto L_0x00ca
            android.telephony.CellLocation r2 = r2.getCellLocation()     // Catch:{ all -> 0x00ca }
            android.telephony.gsm.GsmCellLocation r2 = (android.telephony.gsm.GsmCellLocation) r2     // Catch:{ all -> 0x00ca }
            r4 = 1
            if (r2 == 0) goto L_0x00c3
            int r4 = r2.getCid()     // Catch:{ all -> 0x00ca }
        L_0x00c3:
            if (r3 == r4) goto L_0x00ca
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
            r2 = r1
        L_0x00cb:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.b((java.lang.Integer) r2)
            com.yandex.metrica.impl.ob.Ij r2 = r7.f7056a
            android.telephony.TelephonyManager r2 = r2.f()
            if (r2 == 0) goto L_0x00dc
            java.lang.String r2 = r2.getNetworkOperatorName()     // Catch:{ all -> 0x00dc }
            goto L_0x00dd
        L_0x00dc:
            r2 = r1
        L_0x00dd:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.b((java.lang.String) r2)
            com.yandex.metrica.impl.ob.Ij r2 = r7.f7056a
            android.telephony.TelephonyManager r2 = r2.f()
            java.lang.String r3 = "unknown"
            if (r2 == 0) goto L_0x0110
            com.yandex.metrica.impl.ob.zd r4 = r7.f7058c     // Catch:{ all -> 0x010f }
            com.yandex.metrica.impl.ob.Ij r6 = r7.f7056a     // Catch:{ all -> 0x010f }
            android.content.Context r6 = r6.e()     // Catch:{ all -> 0x010f }
            boolean r4 = r4.a(r6)     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x010d
            int r2 = r2.getNetworkType()     // Catch:{ all -> 0x010f }
            android.util.SparseArray r4 = f7055d     // Catch:{ all -> 0x010f }
            java.lang.Object r2 = r4.get(r2, r3)     // Catch:{ all -> 0x010f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x010f }
            r1 = r2
            goto L_0x0110
        L_0x010d:
            r1 = r3
            goto L_0x0110
        L_0x010f:
        L_0x0110:
            if (r1 != 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r3 = r1
        L_0x0114:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.a((java.lang.String) r3)
            com.yandex.metrica.impl.ob.uj$a r0 = r0.a((int) r5)
            com.yandex.metrica.impl.ob.uj r1 = new com.yandex.metrica.impl.ob.uj
            r1.<init>(r0)
        L_0x0121:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0803wj.b():java.lang.Object");
    }
}
