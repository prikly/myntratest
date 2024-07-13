package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public class L {

    /* renamed from: a  reason: collision with root package name */
    private final W0 f4445a;

    /* renamed from: b  reason: collision with root package name */
    private final W0 f4446b;

    /* renamed from: c  reason: collision with root package name */
    private final W0 f4447c;

    /* renamed from: d  reason: collision with root package name */
    private final W0 f4448d;

    /* renamed from: e  reason: collision with root package name */
    private final W0 f4449e;

    /* renamed from: f  reason: collision with root package name */
    private final W0 f4450f;

    /* renamed from: g  reason: collision with root package name */
    private final W0 f4451g;

    /* renamed from: h  reason: collision with root package name */
    private final W0 f4452h;
    private final W0 i;
    private final W0 j;
    private final W0 k;
    private final long l;
    private final C0389fl m;
    private final C0674ra n;
    private final long o;
    private final Xh p;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    L(com.yandex.metrica.impl.ob.C0635pi r21, com.yandex.metrica.impl.ob.C0867zb r22, java.util.Map<java.lang.String, java.lang.String> r23) {
        /*
            r20 = this;
            java.lang.String r0 = r21.V()
            com.yandex.metrica.impl.ob.W0 r2 = a((java.lang.String) r0)
            java.lang.String r0 = r21.i()
            com.yandex.metrica.impl.ob.W0 r3 = a((java.lang.String) r0)
            java.lang.String r0 = r21.j()
            com.yandex.metrica.impl.ob.W0 r4 = a((java.lang.String) r0)
            java.lang.String r0 = r21.G()
            com.yandex.metrica.impl.ob.W0 r5 = a((java.lang.String) r0)
            java.lang.String r0 = r21.p()
            com.yandex.metrica.impl.ob.W0 r6 = a((java.lang.String) r0)
            java.lang.String r0 = r21.n()
            java.util.Map r0 = com.yandex.metrica.impl.ob.Tl.a((java.lang.String) r0)
            java.lang.String r0 = com.yandex.metrica.impl.ob.Tl.a((java.util.Map<java.lang.String, java.lang.String>) r0)
            com.yandex.metrica.impl.ob.W0 r7 = a((java.lang.String) r0)
            java.lang.String r0 = com.yandex.metrica.impl.ob.Tl.a((java.util.Map<java.lang.String, java.lang.String>) r23)
            com.yandex.metrica.impl.ob.W0 r8 = a((java.lang.String) r0)
            com.yandex.metrica.impl.ob.W0 r9 = new com.yandex.metrica.impl.ob.W0
            com.yandex.metrica.impl.ob.ub r0 = r22.a()
            com.yandex.metrica.impl.ob.tb r0 = r0.f6881a
            r1 = 0
            if (r0 != 0) goto L_0x004d
            r0 = r1
            goto L_0x0055
        L_0x004d:
            com.yandex.metrica.impl.ob.ub r0 = r22.a()
            com.yandex.metrica.impl.ob.tb r0 = r0.f6881a
            java.lang.String r0 = r0.f6825b
        L_0x0055:
            com.yandex.metrica.impl.ob.ub r10 = r22.a()
            com.yandex.metrica.impl.ob.U0 r10 = r10.f6882b
            com.yandex.metrica.impl.ob.ub r11 = r22.a()
            java.lang.String r11 = r11.f6883c
            r9.<init>(r0, r10, r11)
            com.yandex.metrica.impl.ob.W0 r10 = new com.yandex.metrica.impl.ob.W0
            com.yandex.metrica.impl.ob.ub r0 = r22.b()
            com.yandex.metrica.impl.ob.tb r0 = r0.f6881a
            if (r0 != 0) goto L_0x0070
            r0 = r1
            goto L_0x0078
        L_0x0070:
            com.yandex.metrica.impl.ob.ub r0 = r22.b()
            com.yandex.metrica.impl.ob.tb r0 = r0.f6881a
            java.lang.String r0 = r0.f6825b
        L_0x0078:
            com.yandex.metrica.impl.ob.ub r11 = r22.b()
            com.yandex.metrica.impl.ob.U0 r11 = r11.f6882b
            com.yandex.metrica.impl.ob.ub r12 = r22.b()
            java.lang.String r12 = r12.f6883c
            r10.<init>(r0, r11, r12)
            com.yandex.metrica.impl.ob.W0 r11 = new com.yandex.metrica.impl.ob.W0
            com.yandex.metrica.impl.ob.ub r0 = r22.c()
            com.yandex.metrica.impl.ob.tb r0 = r0.f6881a
            if (r0 != 0) goto L_0x0092
            goto L_0x009a
        L_0x0092:
            com.yandex.metrica.impl.ob.ub r0 = r22.c()
            com.yandex.metrica.impl.ob.tb r0 = r0.f6881a
            java.lang.String r1 = r0.f6825b
        L_0x009a:
            com.yandex.metrica.impl.ob.ub r0 = r22.c()
            com.yandex.metrica.impl.ob.U0 r0 = r0.f6882b
            com.yandex.metrica.impl.ob.ub r12 = r22.c()
            java.lang.String r12 = r12.f6883c
            r11.<init>(r1, r0, r12)
            java.util.Map r0 = r21.h()
            java.lang.String r0 = com.yandex.metrica.impl.ob.Tl.b((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r0)
            com.yandex.metrica.impl.ob.W0 r12 = a((java.lang.String) r0)
            com.yandex.metrica.impl.ob.fl r0 = new com.yandex.metrica.impl.ob.fl
            r13 = r0
            r1 = r21
            r0.<init>((com.yandex.metrica.impl.ob.C0635pi) r1)
            com.yandex.metrica.impl.ob.ra r14 = r21.l()
            long r15 = com.yandex.metrica.impl.ob.C0267b.a()
            long r17 = r21.C()
            com.yandex.metrica.impl.ob.si r0 = r21.O()
            int r0 = r0.a()
            long r0 = (long) r0
            long r17 = r17 + r0
            com.yandex.metrica.impl.ob.Sh r0 = r21.f()
            java.lang.Boolean r0 = r0.x
            com.yandex.metrica.impl.ob.Xh r19 = a((java.lang.Boolean) r0)
            r1 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.L.<init>(com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.zb, java.util.Map):void");
    }

    public W0 a() {
        return this.f4451g;
    }

    public W0 b() {
        return this.k;
    }

    public W0 c() {
        return this.f4446b;
    }

    public W0 d() {
        return this.f4447c;
    }

    public C0674ra e() {
        return this.n;
    }

    public Xh f() {
        return this.p;
    }

    public W0 g() {
        return this.f4452h;
    }

    public W0 h() {
        return this.f4449e;
    }

    public W0 i() {
        return this.i;
    }

    public long j() {
        return this.o;
    }

    public W0 k() {
        return this.f4448d;
    }

    public W0 l() {
        return this.f4450f;
    }

    public long m() {
        return this.l;
    }

    public C0389fl n() {
        return this.m;
    }

    public W0 o() {
        return this.f4445a;
    }

    public W0 p() {
        return this.j;
    }

    public String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f4445a + ", mDeviceIdData=" + this.f4446b + ", mDeviceIdHashData=" + this.f4447c + ", mReportAdUrlData=" + this.f4448d + ", mGetAdUrlData=" + this.f4449e + ", mResponseClidsData=" + this.f4450f + ", mClientClidsForRequestData=" + this.f4451g + ", mGaidData=" + this.f4452h + ", mHoaidData=" + this.i + ", yandexAdvIdData=" + this.j + ", customSdkHostsData=" + this.k + ", customSdkHosts=" + this.k + ", mServerTimeOffset=" + this.l + ", mUiAccessConfig=" + this.m + ", diagnosticsConfigsHolder=" + this.n + ", nextStartupTime=" + this.o + ", features=" + this.p + '}';
    }

    private static Bundle a(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, parcelable);
        return bundle;
    }

    private static C0389fl b(Bundle bundle) {
        return (C0389fl) a(bundle.getBundle("UiAccessConfig"), C0389fl.class.getClassLoader());
    }

    public void c(Bundle bundle) {
        bundle.putBundle("Uuid", a((Parcelable) this.f4445a));
        bundle.putBundle("DeviceId", a((Parcelable) this.f4446b));
        bundle.putBundle("DeviceIdHash", a((Parcelable) this.f4447c));
        bundle.putBundle("AdUrlReport", a((Parcelable) this.f4448d));
        bundle.putBundle("AdUrlGet", a((Parcelable) this.f4449e));
        bundle.putBundle("Clids", a((Parcelable) this.f4450f));
        bundle.putBundle("RequestClids", a((Parcelable) this.f4451g));
        bundle.putBundle(IronSourceConstants.TYPE_GAID, a((Parcelable) this.f4452h));
        bundle.putBundle("HOAID", a((Parcelable) this.i));
        bundle.putBundle("YANDEX_ADV_ID", a((Parcelable) this.j));
        bundle.putBundle("CUSTOM_SDK_HOSTS", a((Parcelable) this.k));
        bundle.putBundle("UiAccessConfig", a((Parcelable) this.m));
        bundle.putBundle("DiagnosticsConfigsHolder", a((Parcelable) this.n));
        bundle.putLong("ServerTimeOffset", this.l);
        bundle.putLong("NextStartupTime", this.o);
        bundle.putBundle("features", a((Parcelable) this.p));
    }

    private static Parcelable a(Bundle bundle, ClassLoader classLoader) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return bundle.getParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }

    private static W0 b(Bundle bundle, String str) {
        W0 w0 = (W0) a(bundle.getBundle(str), W0.class.getClassLoader());
        return w0 == null ? new W0((String) null, U0.UNKNOWN, "bundle serialization error") : w0;
    }

    private static C0674ra a(Bundle bundle) {
        C0674ra raVar = (C0674ra) a(bundle.getBundle("DiagnosticsConfigsHolder"), C0674ra.class.getClassLoader());
        return raVar == null ? new C0674ra() : raVar;
    }

    private static Xh a(Bundle bundle, String str) {
        Xh xh = (Xh) a(bundle.getBundle(str), Xh.class.getClassLoader());
        return xh == null ? new Xh((Boolean) null, U0.UNKNOWN, "bundle serialization error") : xh;
    }

    private static W0 a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new W0(str, isEmpty ? U0.UNKNOWN : U0.OK, isEmpty ? "no identifier in startup state" : null);
    }

    private static Xh a(Boolean bool) {
        boolean z = bool != null;
        return new Xh(bool, z ? U0.OK : U0.UNKNOWN, z ? null : "no identifier in startup state");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public L(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = r22
            r1 = r21
            java.lang.String r2 = "Uuid"
            com.yandex.metrica.impl.ob.W0 r2 = b(r0, r2)
            java.lang.String r3 = "DeviceId"
            com.yandex.metrica.impl.ob.W0 r3 = b(r0, r3)
            java.lang.String r4 = "DeviceIdHash"
            com.yandex.metrica.impl.ob.W0 r4 = b(r0, r4)
            java.lang.String r5 = "AdUrlReport"
            com.yandex.metrica.impl.ob.W0 r5 = b(r0, r5)
            java.lang.String r6 = "AdUrlGet"
            com.yandex.metrica.impl.ob.W0 r6 = b(r0, r6)
            java.lang.String r7 = "Clids"
            com.yandex.metrica.impl.ob.W0 r7 = b(r0, r7)
            java.lang.String r8 = "RequestClids"
            com.yandex.metrica.impl.ob.W0 r8 = b(r0, r8)
            java.lang.String r9 = "GAID"
            com.yandex.metrica.impl.ob.W0 r9 = b(r0, r9)
            java.lang.String r10 = "HOAID"
            com.yandex.metrica.impl.ob.W0 r10 = b(r0, r10)
            java.lang.String r11 = "YANDEX_ADV_ID"
            com.yandex.metrica.impl.ob.W0 r11 = b(r0, r11)
            java.lang.String r12 = "CUSTOM_SDK_HOSTS"
            com.yandex.metrica.impl.ob.W0 r12 = b(r0, r12)
            com.yandex.metrica.impl.ob.fl r13 = b(r22)
            com.yandex.metrica.impl.ob.ra r14 = a((android.os.Bundle) r22)
            java.lang.String r15 = "ServerTimeOffset"
            long r15 = r0.getLong(r15)
            r20 = r1
            java.lang.String r1 = "NextStartupTime"
            long r17 = r0.getLong(r1)
            java.lang.String r1 = "features"
            com.yandex.metrica.impl.ob.Xh r19 = a((android.os.Bundle) r0, (java.lang.String) r1)
            r1 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.L.<init>(android.os.Bundle):void");
    }

    public L(W0 w0, W0 w02, W0 w03, W0 w04, W0 w05, W0 w06, W0 w07, W0 w08, W0 w09, W0 w010, W0 w011, C0389fl flVar, C0674ra raVar, long j2, long j3, Xh xh) {
        this.f4445a = w0;
        this.f4446b = w02;
        this.f4447c = w03;
        this.f4448d = w04;
        this.f4449e = w05;
        this.f4450f = w06;
        this.f4451g = w07;
        this.f4452h = w08;
        this.i = w09;
        this.j = w010;
        this.k = w011;
        this.m = flVar;
        this.n = raVar;
        this.l = j2;
        this.o = j3;
        this.p = xh;
    }
}
