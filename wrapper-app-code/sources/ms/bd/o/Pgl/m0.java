package ms.bd.o.Pgl;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.exoplayer2.common.base.Ascii;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class m0 implements SensorEventListener {

    /* renamed from: f  reason: collision with root package name */
    private static volatile m0 f9702f = null;

    /* renamed from: a  reason: collision with root package name */
    private SensorManager f9703a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f9704b;

    /* renamed from: c  reason: collision with root package name */
    private int f9705c = 0;

    /* renamed from: d  reason: collision with root package name */
    private float[] f9706d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    private List<JSONArray> f9707e = new ArrayList();

    static {
        new DecimalFormat((String) pblk.a(16777217, 0, 0, "b46093", new byte[]{35, 120, Ascii.NAK}));
    }

    private m0(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.f9703a = (SensorManager) applicationContext.getSystemService((String) pblk.a(16777217, 0, 0, "e325e0", new byte[]{103, 52, 79, 82, 85, 53}));
        }
    }

    public static m0 a(Context context) {
        if (f9702f == null) {
            synchronized (m0.class) {
                if (f9702f == null) {
                    f9702f = new m0(context);
                }
            }
        }
        return f9702f;
    }

    private synchronized void c() {
        try {
            if (this.f9703a != null) {
                int i = this.f9704b - 1;
                this.f9704b = i;
                if (i == 0) {
                    this.f9703a.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
            String str = (String) pblk.a(16777217, 0, 0, "2fe8b7", new byte[]{48, 119, Ascii.NAK, 115, 72});
        }
        return;
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void a() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 1
            r1 = 0
            android.app.Activity r2 = ms.bd.o.Pgl.pblz.a()     // Catch:{ all -> 0x000d }
            if (r2 == 0) goto L_0x000b
            r2 = 1
            goto L_0x000e
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = -1
        L_0x000e:
            if (r2 == r0) goto L_0x0013
            r0 = 0
            goto L_0x00f1
        L_0x0013:
            monitor-enter(r12)     // Catch:{ all -> 0x0158 }
            r2 = 3
            android.hardware.SensorManager r3 = r12.f9703a     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            if (r3 == 0) goto L_0x0035
            int r3 = r12.f9704b     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            if (r3 != 0) goto L_0x002c
            android.hardware.SensorManager r3 = r12.f9703a     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            android.hardware.Sensor r3 = r3.getDefaultSensor(r0)     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            android.hardware.SensorManager r4 = r12.f9703a     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            boolean r3 = r4.registerListener(r12, r3, r2)     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            if (r3 != 0) goto L_0x002c
            goto L_0x0035
        L_0x002c:
            int r3 = r12.f9704b     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            int r3 = r3 + r0
            r12.f9704b = r3     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            goto L_0x0035
        L_0x0032:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0158 }
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x0035:
            monitor-exit(r12)     // Catch:{ all -> 0x0158 }
            r3 = 4
            r4 = 2
            monitor-enter(r12)     // Catch:{ Exception -> 0x0090 }
            r5 = 0
        L_0x003a:
            int r6 = r12.f9705c     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x004a
            r6 = 10
            if (r5 >= r6) goto L_0x004a
            int r5 = r5 + 1
            r6 = 1000(0x3e8, double:4.94E-321)
            r12.wait(r6)     // Catch:{ all -> 0x008a }
            goto L_0x003a
        L_0x004a:
            monitor-exit(r12)     // Catch:{ all -> 0x008a }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ all -> 0x0158 }
            r2.<init>()     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch:{ all -> 0x0158 }
            float[] r6 = r12.f9706d     // Catch:{ all -> 0x0158 }
            r6 = r6[r1]     // Catch:{ all -> 0x0158 }
            double r6 = (double) r6     // Catch:{ all -> 0x0158 }
            r5.<init>(r6)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r5 = r5.setScale(r4, r3)     // Catch:{ all -> 0x0158 }
            r2.put(r5)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch:{ all -> 0x0158 }
            float[] r6 = r12.f9706d     // Catch:{ all -> 0x0158 }
            r0 = r6[r0]     // Catch:{ all -> 0x0158 }
            double r6 = (double) r0     // Catch:{ all -> 0x0158 }
            r5.<init>(r6)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r0 = r5.setScale(r4, r3)     // Catch:{ all -> 0x0158 }
            r2.put(r0)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ all -> 0x0158 }
            float[] r5 = r12.f9706d     // Catch:{ all -> 0x0158 }
            r5 = r5[r4]     // Catch:{ all -> 0x0158 }
            double r5 = (double) r5     // Catch:{ all -> 0x0158 }
            r0.<init>(r5)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r0 = r0.setScale(r4, r3)     // Catch:{ all -> 0x0158 }
            r2.put(r0)     // Catch:{ all -> 0x0158 }
            r12.c()     // Catch:{ all -> 0x0158 }
        L_0x0086:
            r12.f9705c = r1     // Catch:{ all -> 0x0158 }
            r0 = r2
            goto L_0x00f1
        L_0x008a:
            r5 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x008a }
            throw r5     // Catch:{ Exception -> 0x0090 }
        L_0x008d:
            r2 = move-exception
            goto L_0x011a
        L_0x0090:
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            r7 = 0
            java.lang.String r9 = "7ad6ed"
            r10 = 5
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x008d }
            r11 = 53
            r10[r1] = r11     // Catch:{ all -> 0x008d }
            r11 = 112(0x70, float:1.57E-43)
            r10[r0] = r11     // Catch:{ all -> 0x008d }
            r11 = 20
            r10[r4] = r11     // Catch:{ all -> 0x008d }
            r11 = 125(0x7d, float:1.75E-43)
            r10[r2] = r11     // Catch:{ all -> 0x008d }
            r2 = 93
            r10[r3] = r2     // Catch:{ all -> 0x008d }
            java.lang.Object r2 = ms.bd.o.Pgl.pblk.a(r5, r6, r7, r9, r10)     // Catch:{ all -> 0x008d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x008d }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ all -> 0x0158 }
            r2.<init>()     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch:{ all -> 0x0158 }
            float[] r6 = r12.f9706d     // Catch:{ all -> 0x0158 }
            r6 = r6[r1]     // Catch:{ all -> 0x0158 }
            double r6 = (double) r6     // Catch:{ all -> 0x0158 }
            r5.<init>(r6)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r5 = r5.setScale(r4, r3)     // Catch:{ all -> 0x0158 }
            r2.put(r5)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch:{ all -> 0x0158 }
            float[] r6 = r12.f9706d     // Catch:{ all -> 0x0158 }
            r0 = r6[r0]     // Catch:{ all -> 0x0158 }
            double r6 = (double) r0     // Catch:{ all -> 0x0158 }
            r5.<init>(r6)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r0 = r5.setScale(r4, r3)     // Catch:{ all -> 0x0158 }
            r2.put(r0)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ all -> 0x0158 }
            float[] r5 = r12.f9706d     // Catch:{ all -> 0x0158 }
            r5 = r5[r4]     // Catch:{ all -> 0x0158 }
            double r5 = (double) r5     // Catch:{ all -> 0x0158 }
            r0.<init>(r5)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r0 = r0.setScale(r4, r3)     // Catch:{ all -> 0x0158 }
            r2.put(r0)     // Catch:{ all -> 0x0158 }
            r12.c()     // Catch:{ all -> 0x0158 }
            goto L_0x0086
        L_0x00f1:
            if (r0 != 0) goto L_0x00f5
            monitor-exit(r12)
            return
        L_0x00f5:
            java.util.List<org.json.JSONArray> r1 = r12.f9707e     // Catch:{ all -> 0x0158 }
            r1.add(r0)     // Catch:{ all -> 0x0158 }
            java.util.List<org.json.JSONArray> r0 = r12.f9707e     // Catch:{ all -> 0x0118 }
            int r0 = r0.size()     // Catch:{ all -> 0x0118 }
            r1 = 100
            if (r0 <= r1) goto L_0x0118
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0118 }
            java.util.List<org.json.JSONArray> r2 = r12.f9707e     // Catch:{ all -> 0x0118 }
            int r3 = r0 + -50
            java.util.List r0 = r2.subList(r3, r0)     // Catch:{ all -> 0x0118 }
            r1.<init>(r0)     // Catch:{ all -> 0x0118 }
            java.util.List<org.json.JSONArray> r0 = r12.f9707e     // Catch:{ all -> 0x0118 }
            r0.clear()     // Catch:{ all -> 0x0118 }
            r12.f9707e = r1     // Catch:{ all -> 0x0118 }
        L_0x0118:
            monitor-exit(r12)
            return
        L_0x011a:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ all -> 0x0158 }
            r5.<init>()     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r6 = new java.math.BigDecimal     // Catch:{ all -> 0x0158 }
            float[] r7 = r12.f9706d     // Catch:{ all -> 0x0158 }
            r7 = r7[r1]     // Catch:{ all -> 0x0158 }
            double r7 = (double) r7     // Catch:{ all -> 0x0158 }
            r6.<init>(r7)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r6 = r6.setScale(r4, r3)     // Catch:{ all -> 0x0158 }
            r5.put(r6)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r6 = new java.math.BigDecimal     // Catch:{ all -> 0x0158 }
            float[] r7 = r12.f9706d     // Catch:{ all -> 0x0158 }
            r0 = r7[r0]     // Catch:{ all -> 0x0158 }
            double r7 = (double) r0     // Catch:{ all -> 0x0158 }
            r6.<init>(r7)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r0 = r6.setScale(r4, r3)     // Catch:{ all -> 0x0158 }
            r5.put(r0)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ all -> 0x0158 }
            float[] r6 = r12.f9706d     // Catch:{ all -> 0x0158 }
            r6 = r6[r4]     // Catch:{ all -> 0x0158 }
            double r6 = (double) r6     // Catch:{ all -> 0x0158 }
            r0.<init>(r6)     // Catch:{ all -> 0x0158 }
            java.math.BigDecimal r0 = r0.setScale(r4, r3)     // Catch:{ all -> 0x0158 }
            r5.put(r0)     // Catch:{ all -> 0x0158 }
            r12.c()     // Catch:{ all -> 0x0158 }
            r12.f9705c = r1     // Catch:{ all -> 0x0158 }
            throw r2     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.m0.a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:7|8|(1:10)(1:11)|12|(2:14|(2:15|(3:17|(2:19|42)(11:20|21|22|23|24|25|26|27|28|29|43)|40)(1:41)))(0)|30|(1:32)(0)|33|34|35|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String b() {
        /*
            r12 = this;
            monitor-enter(r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r0.<init>()     // Catch:{ all -> 0x00b8 }
            java.util.List<org.json.JSONArray> r1 = r12.f9707e     // Catch:{ all -> 0x00b8 }
            int r1 = r1.size()     // Catch:{ all -> 0x00b8 }
            if (r1 > 0) goto L_0x0011
            r0 = 0
            monitor-exit(r12)
            return r0
        L_0x0011:
            java.util.List<org.json.JSONArray> r2 = r12.f9707e     // Catch:{ all -> 0x00b2 }
            int r3 = r1 + -50
            r4 = 0
            if (r3 <= 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            java.util.List r1 = r2.subList(r3, r1)     // Catch:{ all -> 0x00b2 }
            int r2 = r1.size()     // Catch:{ all -> 0x00b2 }
            r3 = 1
            if (r2 <= 0) goto L_0x00a0
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b2 }
        L_0x0029:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00b2 }
            org.json.JSONArray r2 = (org.json.JSONArray) r2     // Catch:{ all -> 0x00b2 }
            if (r2 != 0) goto L_0x0038
            goto L_0x0029
        L_0x0038:
            java.lang.Object r5 = r2.get(r4)     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00b2 }
            r0.append(r5)     // Catch:{ all -> 0x00b2 }
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.String r10 = "49c8ab"
            byte[] r11 = new byte[r3]     // Catch:{ all -> 0x00b2 }
            r5 = 105(0x69, float:1.47E-43)
            r11[r4] = r5     // Catch:{ all -> 0x00b2 }
            java.lang.Object r5 = ms.bd.o.Pgl.pblk.a(r6, r7, r8, r10, r11)     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00b2 }
            r0.append(r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Object r5 = r2.get(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00b2 }
            r0.append(r5)     // Catch:{ all -> 0x00b2 }
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.String r10 = "84121b"
            byte[] r11 = new byte[r3]     // Catch:{ all -> 0x00b2 }
            r5 = 101(0x65, float:1.42E-43)
            r11[r4] = r5     // Catch:{ all -> 0x00b2 }
            java.lang.Object r5 = ms.bd.o.Pgl.pblk.a(r6, r7, r8, r10, r11)     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00b2 }
            r0.append(r5)     // Catch:{ all -> 0x00b2 }
            r5 = 2
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b2 }
            r0.append(r2)     // Catch:{ all -> 0x00b2 }
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r6 = 0
            r7 = 0
            java.lang.String r9 = "012d18"
            byte[] r10 = new byte[r3]     // Catch:{ all -> 0x00b2 }
            r2 = 61
            r10[r4] = r2     // Catch:{ all -> 0x00b2 }
            java.lang.Object r2 = ms.bd.o.Pgl.pblk.a(r5, r6, r7, r9, r10)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b2 }
            r0.append(r2)     // Catch:{ all -> 0x00b2 }
            goto L_0x0029
        L_0x00a0:
            int r1 = r0.length()     // Catch:{ all -> 0x00b2 }
            if (r1 <= 0) goto L_0x00b2
            int r1 = r0.length()     // Catch:{ all -> 0x00b2 }
            int r1 = r1 - r3
            int r2 = r0.length()     // Catch:{ all -> 0x00b2 }
            r0.delete(r1, r2)     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b8 }
            monitor-exit(r12)
            return r0
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.m0.b():java.lang.String");
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f9706d = sensorEvent.values;
        this.f9705c = 1;
    }
}
