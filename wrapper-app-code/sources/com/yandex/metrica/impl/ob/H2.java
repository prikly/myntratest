package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class H2 {
    private static volatile H2 l;
    private static final Object m = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f4084a;

    /* renamed from: b  reason: collision with root package name */
    private final WifiManager f4085b;

    /* renamed from: c  reason: collision with root package name */
    private C0845yd f4086c;

    /* renamed from: d  reason: collision with root package name */
    private Ed f4087d;

    /* renamed from: e  reason: collision with root package name */
    private C0415gm f4088e;

    /* renamed from: f  reason: collision with root package name */
    private C0539lm<Context, Intent, Void> f4089f;

    /* renamed from: g  reason: collision with root package name */
    private C0635pi f4090g;

    /* renamed from: h  reason: collision with root package name */
    private final C0869zd f4091h;
    private final C0869zd i;
    private final I2 j;
    /* access modifiers changed from: private */
    public final J2 k;

    private H2(Context context, WifiManager wifiManager, Ed ed) {
        this(context, wifiManager, ed, new C0845yd(ed.a()));
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public java.util.List<com.yandex.metrica.impl.ob.F2> c() {
        /*
            r15 = this;
            monitor-enter(r15)
            monitor-enter(r15)     // Catch:{ all -> 0x0143 }
            com.yandex.metrica.impl.ob.pi r0 = r15.f4090g     // Catch:{ all -> 0x0140 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            monitor-exit(r15)     // Catch:{ all -> 0x0143 }
            if (r3 == 0) goto L_0x0018
            com.yandex.metrica.impl.ob.Sh r0 = r0.f()     // Catch:{ all -> 0x0143 }
            boolean r0 = r0.p     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            monitor-exit(r15)
            r3 = 0
            if (r0 == 0) goto L_0x0030
            com.yandex.metrica.impl.ob.zd r0 = r15.f4091h
            android.content.Context r4 = r15.f4084a
            boolean r0 = r0.a(r4)
            if (r0 == 0) goto L_0x0030
            android.net.wifi.WifiManager r0 = r15.f4085b
            if (r0 == 0) goto L_0x0030
            java.util.List r0 = r0.getScanResults()     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r3
        L_0x0031:
            monitor-enter(r15)
            monitor-enter(r15)     // Catch:{ all -> 0x013d }
            com.yandex.metrica.impl.ob.pi r4 = r15.f4090g     // Catch:{ all -> 0x013a }
            if (r4 == 0) goto L_0x0039
            r5 = 1
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            monitor-exit(r15)     // Catch:{ all -> 0x013d }
            if (r5 == 0) goto L_0x0047
            com.yandex.metrica.impl.ob.Sh r4 = r4.f()     // Catch:{ all -> 0x013d }
            boolean r4 = r4.q     // Catch:{ all -> 0x013d }
            if (r4 == 0) goto L_0x0047
            r4 = 1
            goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            monitor-exit(r15)
            if (r4 == 0) goto L_0x007d
            com.yandex.metrica.impl.ob.yd r4 = r15.f4086c
            android.content.Context r5 = r15.f4084a
            boolean r4 = r4.c(r5)
            if (r4 == 0) goto L_0x007d
            android.net.wifi.WifiManager r4 = r15.f4085b
            if (r4 == 0) goto L_0x007d
            android.net.wifi.WifiInfo r4 = r4.getConnectionInfo()     // Catch:{ all -> 0x007d }
            if (r4 == 0) goto L_0x007e
            java.lang.String r5 = r4.getBSSID()     // Catch:{ all -> 0x007d }
            java.lang.String r6 = "00:00:00:00:00:00"
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x007d
            java.lang.String r5 = r4.getBSSID()     // Catch:{ all -> 0x007d }
            java.lang.String r6 = "02:00:00:00:00:00"
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x007d
            int r5 = r4.getIpAddress()     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x007e
        L_0x007d:
            r4 = r3
        L_0x007e:
            if (r4 != 0) goto L_0x0082
            r5 = r3
            goto L_0x0086
        L_0x0082:
            java.lang.String r5 = r4.getBSSID()
        L_0x0086:
            java.util.ArrayList r6 = new java.util.ArrayList
            if (r0 != 0) goto L_0x008c
            r7 = 0
            goto L_0x0090
        L_0x008c:
            int r7 = r0.size()
        L_0x0090:
            if (r4 != 0) goto L_0x0093
            r1 = 0
        L_0x0093:
            int r7 = r7 + r1
            r6.<init>(r7)
            boolean r1 = com.yandex.metrica.impl.ob.A2.b((java.util.Collection) r0)
            if (r1 != 0) goto L_0x00fc
            java.util.Iterator r0 = r0.iterator()
        L_0x00a1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0135
            java.lang.Object r1 = r0.next()
            android.net.wifi.ScanResult r1 = (android.net.wifi.ScanResult) r1
            if (r1 == 0) goto L_0x00a1
            java.lang.String r4 = r1.BSSID
            java.lang.String r7 = "02:00:00:00:00:00"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x00a1
            java.lang.String r4 = r1.BSSID     // Catch:{ NoSuchFieldError -> 0x00d4 }
            if (r4 == 0) goto L_0x00d1
            boolean r7 = r4.equals(r5)     // Catch:{ NoSuchFieldError -> 0x00d4 }
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ NoSuchFieldError -> 0x00d5 }
            java.lang.String r4 = r4.toUpperCase(r8)     // Catch:{ NoSuchFieldError -> 0x00d5 }
            java.lang.String r8 = ":"
            java.lang.String r9 = ""
            java.lang.String r4 = r4.replace(r8, r9)     // Catch:{ NoSuchFieldError -> 0x00d5 }
            r9 = r4
            goto L_0x00d6
        L_0x00d1:
            r9 = r3
            r11 = 0
            goto L_0x00d7
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            r9 = r3
        L_0x00d6:
            r11 = r7
        L_0x00d7:
            com.yandex.metrica.impl.ob.F2 r4 = new com.yandex.metrica.impl.ob.F2
            java.lang.String r10 = r1.SSID
            int r12 = r1.level
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 17
            if (r7 < r8) goto L_0x00f3
            com.yandex.metrica.impl.ob.gm r7 = r15.f4088e
            long r13 = r1.timestamp
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r7 = r7.a(r13, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r13 = r1
            goto L_0x00f4
        L_0x00f3:
            r13 = r3
        L_0x00f4:
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            r6.add(r4)
            goto L_0x00a1
        L_0x00fc:
            if (r4 == 0) goto L_0x0135
            if (r5 != 0) goto L_0x0102
            r8 = r3
            goto L_0x0111
        L_0x0102:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r5.toUpperCase(r0)
            java.lang.String r1 = ":"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            r8 = r0
        L_0x0111:
            java.lang.String r0 = r4.getSSID()
            if (r0 != 0) goto L_0x0118
            goto L_0x0120
        L_0x0118:
            java.lang.String r1 = "\""
            java.lang.String r2 = ""
            java.lang.String r3 = r0.replace(r1, r2)
        L_0x0120:
            r9 = r3
            com.yandex.metrica.impl.ob.F2 r0 = new com.yandex.metrica.impl.ob.F2
            int r11 = r4.getRssi()
            r1 = 0
            java.lang.Long r12 = java.lang.Long.valueOf(r1)
            r10 = 1
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            r6.add(r0)
        L_0x0135:
            java.util.List r0 = com.yandex.metrica.impl.ob.A2.c(r6)
            return r0
        L_0x013a:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0140:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0143 }
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.H2.c():java.util.List");
    }

    public static H2 a(Context context) {
        if (l == null) {
            synchronized (m) {
                if (l == null) {
                    Context applicationContext = context.getApplicationContext();
                    l = new H2(applicationContext, (WifiManager) applicationContext.getApplicationContext().getSystemService("wifi"), new Ed());
                }
            }
        }
        return l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.yandex.metrica.impl.ob.F2> b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.yd r0 = r2.f4086c     // Catch:{ all -> 0x0033 }
            android.content.Context r1 = r2.f4084a     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.c(r1)     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000d
            r0 = 0
            goto L_0x0025
        L_0x000d:
            android.net.wifi.WifiManager r0 = r2.f4085b     // Catch:{ all -> 0x0033 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.isWifiEnabled()     // Catch:{ all -> 0x001c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = r0
        L_0x0021:
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0033 }
        L_0x0025:
            if (r0 != 0) goto L_0x002d
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return r0
        L_0x002d:
            java.util.List r0 = r2.c()     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return r0
        L_0x0033:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.H2.b():java.util.List");
    }

    private H2(Context context, WifiManager wifiManager, Ed ed, C0845yd ydVar) {
        this(context, wifiManager, ed, new C0415gm(), ydVar, new G1(), new I2(), F0.g().h().d());
    }

    public void a(C0635pi piVar) {
        this.f4090g = piVar;
        this.f4087d.a(piVar);
        this.f4086c.a(this.f4087d.a());
        if (piVar.d() != null) {
            I2 i2 = this.j;
            Ph d2 = piVar.d();
            i2.f4023a.a(d2.f4784b, i2.a(d2));
        }
    }

    H2(Context context, WifiManager wifiManager, Ed ed, C0415gm gmVar, C0845yd ydVar, G1 g1, I2 i2, J2 j2) {
        this.f4084a = context;
        this.f4085b = wifiManager;
        this.f4087d = ed;
        this.f4086c = ydVar;
        this.f4091h = g1.d(ydVar);
        this.i = g1.e(ydVar);
        this.f4088e = gmVar;
        this.j = i2;
        this.k = j2;
    }

    public void a(boolean z) {
        this.f4087d.a(z);
        this.f4086c.a(this.f4087d.a());
    }

    public synchronized boolean a(CountDownLatch countDownLatch, V<List<F2>> v) {
        Boolean bool;
        if (!this.i.a(this.f4084a)) {
            return false;
        }
        if (this.f4089f == null) {
            this.f4089f = new G2(this, v, countDownLatch);
        }
        this.k.a(this.f4089f);
        WifiManager wifiManager = this.f4085b;
        if (wifiManager != null) {
            try {
                bool = Boolean.valueOf(wifiManager.startScan());
            } catch (Throwable unused) {
            }
            return Boolean.TRUE.equals(bool);
        }
        bool = null;
        return Boolean.TRUE.equals(bool);
    }

    public I2 a() {
        return this.j;
    }
}
