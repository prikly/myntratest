package com.yandex.metrica.impl.ob;

import android.location.Location;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.xc  reason: case insensitive filesystem */
class C0820xc extends C0762v2<Location> {

    /* renamed from: d  reason: collision with root package name */
    public static final long f7101d = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: e  reason: collision with root package name */
    public static final List<String> f7102e = Arrays.asList(new String[]{"gps", "network"});

    /* renamed from: c  reason: collision with root package name */
    private a f7103c;

    /* renamed from: com.yandex.metrica.impl.ob.xc$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f7104a;

        public a(long j, long j2, long j3) {
            this.f7104a = j;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0820xc(com.yandex.metrica.impl.ob.Ph r9) {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.xc$a r7 = new com.yandex.metrica.impl.ob.xc$a
            long r1 = f7101d
            r3 = 200(0xc8, double:9.9E-322)
            r5 = 50
            r0 = r7
            r0.<init>(r1, r3, r5)
            if (r9 == 0) goto L_0x0011
            long r0 = r9.f4785c
            goto L_0x0015
        L_0x0011:
            com.yandex.metrica.impl.ob.If$c r0 = com.yandex.metrica.impl.ob.G.f4018e
            long r0 = r0.f4155c
        L_0x0015:
            r2 = r0
            r0 = 2
            if (r9 == 0) goto L_0x001d
            long r4 = r9.f4785c
            goto L_0x0021
        L_0x001d:
            com.yandex.metrica.impl.ob.If$c r9 = com.yandex.metrica.impl.ob.G.f4018e
            long r4 = r9.f4155c
        L_0x0021:
            long r4 = r4 * r0
            r0 = r8
            r1 = r7
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0820xc.<init>(com.yandex.metrica.impl.ob.Ph):void");
    }

    /* access modifiers changed from: protected */
    public boolean a(Object obj) {
        Location location = (Location) obj;
        return f7102e.contains(location.getProvider()) && (this.f4023a.b() || this.f4023a.d() || a(location, (Location) this.f4023a.a()));
    }

    /* access modifiers changed from: protected */
    public long b(Ph ph) {
        return ph.f4785c;
    }

    /* access modifiers changed from: protected */
    public long a(Ph ph) {
        return ph.f4785c * 2;
    }

    private boolean a(Location location, Location location2) {
        boolean z;
        long j = this.f7103c.f7104a;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z2 = time > j;
        boolean z3 = time < (-j);
        boolean z4 = time > 0;
        if (z2) {
            return true;
        }
        if (!z3) {
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z5 = accuracy > 0;
            boolean z6 = accuracy < 0;
            boolean z7 = ((long) accuracy) > 200;
            String provider = location.getProvider();
            String provider2 = location2.getProvider();
            if (provider == null) {
                z = provider2 == null;
            } else {
                z = provider.equals(provider2);
            }
            if (z6) {
                return true;
            }
            if (z4 && !z5) {
                return true;
            }
            if (!z4 || z7 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    C0820xc(a aVar, long j, long j2) {
        super(j, j2);
        this.f7103c = aVar;
    }
}
