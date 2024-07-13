package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public class yn<D> implements wn<D> {

    /* renamed from: a  reason: collision with root package name */
    private final Comparator<D> f7182a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7183b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeProvider f7184c;

    /* renamed from: d  reason: collision with root package name */
    final long f7185d;

    /* renamed from: e  reason: collision with root package name */
    private D f7186e;

    /* renamed from: f  reason: collision with root package name */
    private int f7187f;

    /* renamed from: g  reason: collision with root package name */
    private long f7188g;

    public yn(Comparator<D> comparator, TimeProvider timeProvider, int i, long j) {
        this.f7182a = comparator;
        this.f7183b = i;
        this.f7184c = timeProvider;
        this.f7185d = TimeUnit.SECONDS.toMillis(j);
    }

    private void a() {
        this.f7187f = 0;
        this.f7188g = this.f7184c.elapsedRealtime();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.ob.zn<D> get(D r8) {
        /*
            r7 = this;
            D r0 = r7.f7186e
            r1 = 1
            r2 = 0
            if (r0 != r8) goto L_0x0008
        L_0x0006:
            r8 = 0
            goto L_0x0016
        L_0x0008:
            java.util.Comparator<D> r3 = r7.f7182a
            int r0 = r3.compare(r0, r8)
            if (r0 != 0) goto L_0x0013
            r7.f7186e = r8
            goto L_0x0006
        L_0x0013:
            r7.f7186e = r8
            r8 = 1
        L_0x0016:
            if (r8 == 0) goto L_0x0025
            r7.a()
            com.yandex.metrica.impl.ob.zn r8 = new com.yandex.metrica.impl.ob.zn
            com.yandex.metrica.impl.ob.zn$a r0 = com.yandex.metrica.impl.ob.zn.a.NEW
            D r1 = r7.f7186e
            r8.<init>(r0, r1)
            return r8
        L_0x0025:
            int r8 = r7.f7187f
            int r8 = r8 + r1
            r7.f7187f = r8
            int r0 = r7.f7183b
            int r8 = r8 % r0
            r7.f7187f = r8
            com.yandex.metrica.coreutils.services.TimeProvider r8 = r7.f7184c
            long r3 = r8.elapsedRealtime()
            long r5 = r7.f7188g
            long r3 = r3 - r5
            long r5 = r7.f7185d
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x004f
            r7.a()
            com.yandex.metrica.impl.ob.zn r8 = new com.yandex.metrica.impl.ob.zn
            com.yandex.metrica.impl.ob.zn$a r0 = com.yandex.metrica.impl.ob.zn.a.REFRESH
            D r1 = r7.f7186e
            r8.<init>(r0, r1)
            return r8
        L_0x004f:
            int r8 = r7.f7187f
            if (r8 != 0) goto L_0x0060
            r7.a()
            com.yandex.metrica.impl.ob.zn r8 = new com.yandex.metrica.impl.ob.zn
            com.yandex.metrica.impl.ob.zn$a r0 = com.yandex.metrica.impl.ob.zn.a.REFRESH
            D r1 = r7.f7186e
            r8.<init>(r0, r1)
            return r8
        L_0x0060:
            com.yandex.metrica.impl.ob.zn r8 = new com.yandex.metrica.impl.ob.zn
            com.yandex.metrica.impl.ob.zn$a r0 = com.yandex.metrica.impl.ob.zn.a.NOT_CHANGED
            D r1 = r7.f7186e
            r8.<init>(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.yn.get(java.lang.Object):com.yandex.metrica.impl.ob.zn");
    }
}
