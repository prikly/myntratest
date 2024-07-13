package com.applovin.exoplayer2.b;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.applovin.exoplayer2.l.ai;

final class i {

    /* renamed from: a  reason: collision with root package name */
    private final a f11244a;

    /* renamed from: b  reason: collision with root package name */
    private int f11245b;

    /* renamed from: c  reason: collision with root package name */
    private long f11246c;

    /* renamed from: d  reason: collision with root package name */
    private long f11247d;

    /* renamed from: e  reason: collision with root package name */
    private long f11248e;

    /* renamed from: f  reason: collision with root package name */
    private long f11249f;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f11250a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f11251b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f11252c;

        /* renamed from: d  reason: collision with root package name */
        private long f11253d;

        /* renamed from: e  reason: collision with root package name */
        private long f11254e;

        public a(AudioTrack audioTrack) {
            this.f11250a = audioTrack;
        }

        public boolean a() {
            boolean timestamp = this.f11250a.getTimestamp(this.f11251b);
            if (timestamp) {
                long j = this.f11251b.framePosition;
                if (this.f11253d > j) {
                    this.f11252c++;
                }
                this.f11253d = j;
                this.f11254e = j + (this.f11252c << 32);
            }
            return timestamp;
        }

        public long b() {
            return this.f11251b.nanoTime / 1000;
        }

        public long c() {
            return this.f11254e;
        }
    }

    public i(AudioTrack audioTrack) {
        if (ai.f13525a >= 19) {
            this.f11244a = new a(audioTrack);
            d();
            return;
        }
        this.f11244a = null;
        a(3);
    }

    private void a(int i) {
        this.f11245b = i;
        long j = 10000;
        if (i == 0) {
            this.f11248e = 0;
            this.f11249f = -1;
            this.f11246c = System.nanoTime() / 1000;
        } else if (i != 1) {
            if (i == 2 || i == 3) {
                j = 10000000;
            } else if (i == 4) {
                j = 500000;
            } else {
                throw new IllegalStateException();
            }
        }
        this.f11247d = j;
    }

    public void a() {
        a(4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r0 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r0 == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(long r8) {
        /*
            r7 = this;
            com.applovin.exoplayer2.b.i$a r0 = r7.f11244a
            r1 = 0
            if (r0 == 0) goto L_0x0071
            long r2 = r7.f11248e
            long r2 = r8 - r2
            long r4 = r7.f11247d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0010
            goto L_0x0071
        L_0x0010:
            r7.f11248e = r8
            boolean r0 = r0.a()
            int r2 = r7.f11245b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L_0x0049
            r8 = 2
            if (r2 == r4) goto L_0x0033
            if (r2 == r8) goto L_0x0030
            if (r2 == r3) goto L_0x002d
            r8 = 4
            if (r2 != r8) goto L_0x0027
            goto L_0x0070
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x002d:
            if (r0 == 0) goto L_0x0070
            goto L_0x0045
        L_0x0030:
            if (r0 != 0) goto L_0x0070
            goto L_0x0045
        L_0x0033:
            if (r0 == 0) goto L_0x0045
            com.applovin.exoplayer2.b.i$a r9 = r7.f11244a
            long r1 = r9.c()
            long r3 = r7.f11249f
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x0070
            r7.a((int) r8)
            goto L_0x0070
        L_0x0045:
            r7.d()
            goto L_0x0070
        L_0x0049:
            if (r0 == 0) goto L_0x0063
            com.applovin.exoplayer2.b.i$a r8 = r7.f11244a
            long r8 = r8.b()
            long r2 = r7.f11246c
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0071
            com.applovin.exoplayer2.b.i$a r8 = r7.f11244a
            long r8 = r8.c()
            r7.f11249f = r8
            r7.a((int) r4)
            goto L_0x0070
        L_0x0063:
            long r1 = r7.f11246c
            long r8 = r8 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0070
            r7.a((int) r3)
        L_0x0070:
            r1 = r0
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.i.a(long):boolean");
    }

    public void b() {
        if (this.f11245b == 4) {
            d();
        }
    }

    public boolean c() {
        return this.f11245b == 2;
    }

    public void d() {
        if (this.f11244a != null) {
            a(0);
        }
    }

    public long e() {
        a aVar = this.f11244a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public long f() {
        a aVar = this.f11244a;
        if (aVar != null) {
            return aVar.c();
        }
        return -1;
    }
}
