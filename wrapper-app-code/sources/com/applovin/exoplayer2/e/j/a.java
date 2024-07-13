package com.applovin.exoplayer2.e.j;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.protobuf.openrtb.LossReason;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import kotlin.KotlinVersion;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12391a = $$Lambda$a$_I_SV3gPxMUyFCqEIVSAu8xQVcs.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private j f12392b;

    /* renamed from: c  reason: collision with root package name */
    private x f12393c;

    /* renamed from: d  reason: collision with root package name */
    private b f12394d;

    /* renamed from: e  reason: collision with root package name */
    private int f12395e = -1;

    /* renamed from: f  reason: collision with root package name */
    private long f12396f = -1;

    /* renamed from: com.applovin.exoplayer2.e.j.a$a  reason: collision with other inner class name */
    private static final class C0120a implements b {

        /* renamed from: a  reason: collision with root package name */
        private static final int[] f12397a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: b  reason: collision with root package name */
        private static final int[] f12398b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, LossReason.LOSS_REASON_CREATIVE_FILTERED_CREATIVE_ATTRIBUTE_EXCLUSIONS_VALUE, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: c  reason: collision with root package name */
        private final j f12399c;

        /* renamed from: d  reason: collision with root package name */
        private final x f12400d;

        /* renamed from: e  reason: collision with root package name */
        private final b f12401e;

        /* renamed from: f  reason: collision with root package name */
        private final int f12402f;

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f12403g;

        /* renamed from: h  reason: collision with root package name */
        private final y f12404h;
        private final int i;
        private final v j;
        private int k;
        private long l;
        private int m;
        private long n;

        public C0120a(j jVar, x xVar, b bVar) throws ai {
            this.f12399c = jVar;
            this.f12400d = xVar;
            this.f12401e = bVar;
            this.i = Math.max(1, bVar.f12415c / 10);
            y yVar = new y(bVar.f12419g);
            yVar.j();
            this.f12402f = yVar.j();
            int i2 = bVar.f12414b;
            int i3 = (((bVar.f12417e - (i2 * 4)) * 8) / (bVar.f12418f * i2)) + 1;
            int i4 = this.f12402f;
            if (i4 == i3) {
                int a2 = com.applovin.exoplayer2.l.ai.a(this.i, i4);
                this.f12403g = new byte[(bVar.f12417e * a2)];
                this.f12404h = new y(a2 * a(this.f12402f, i2));
                int i5 = ((bVar.f12415c * bVar.f12417e) * 8) / this.f12402f;
                this.j = new v.a().f("audio/raw").d(i5).e(i5).f(a(this.i, i2)).k(bVar.f12414b).l(bVar.f12415c).m(2).a();
                return;
            }
            throw ai.b("Expected frames per block: " + i3 + "; got: " + this.f12402f, (Throwable) null);
        }

        private static int a(int i2, int i3) {
            return i2 * 2 * i3;
        }

        private void a(int i2) {
            long d2 = this.l + com.applovin.exoplayer2.l.ai.d(this.n, 1000000, (long) this.f12401e.f12415c);
            int c2 = c(i2);
            this.f12400d.a(d2, 1, c2, this.m - c2, (x.a) null);
            this.n += (long) i2;
            this.m -= c2;
        }

        private void a(byte[] bArr, int i2, int i3, byte[] bArr2) {
            int i4 = this.f12401e.f12417e;
            int i5 = this.f12401e.f12414b;
            int i6 = (i2 * i4) + (i3 * 4);
            int i7 = (i5 * 4) + i6;
            int i8 = (i4 / i5) - 4;
            int i9 = (short) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255));
            int min = Math.min(bArr[i6 + 2] & 255, 88);
            int i10 = f12398b[min];
            int i11 = ((i2 * this.f12402f * i5) + i3) * 2;
            bArr2[i11] = (byte) (i9 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[i11 + 1] = (byte) (i9 >> 8);
            for (int i12 = 0; i12 < i8 * 2; i12++) {
                byte b2 = bArr[((i12 / 8) * i5 * 4) + i7 + ((i12 / 2) % 4)] & 255;
                int i13 = i12 % 2 == 0 ? b2 & Ascii.SI : b2 >> 4;
                int i14 = ((((i13 & 7) * 2) + 1) * i10) >> 3;
                if ((i13 & 8) != 0) {
                    i14 = -i14;
                }
                i9 = com.applovin.exoplayer2.l.ai.a(i9 + i14, -32768, 32767);
                i11 += i5 * 2;
                bArr2[i11] = (byte) (i9 & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[i11 + 1] = (byte) (i9 >> 8);
                min = com.applovin.exoplayer2.l.ai.a(min + f12397a[i13], 0, f12398b.length - 1);
                i10 = f12398b[min];
            }
        }

        private void a(byte[] bArr, int i2, y yVar) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < this.f12401e.f12414b; i4++) {
                    a(bArr, i3, i4, yVar.d());
                }
            }
            int c2 = c(this.f12402f * i2);
            yVar.d(0);
            yVar.c(c2);
        }

        private int b(int i2) {
            return i2 / (this.f12401e.f12414b * 2);
        }

        private int c(int i2) {
            return a(i2, this.f12401e.f12414b);
        }

        public void a(int i2, long j2) {
            this.f12399c.a(new d(this.f12401e, this.f12402f, (long) i2, j2));
            this.f12400d.a(this.j);
        }

        public void a(long j2) {
            this.k = 0;
            this.l = j2;
            this.m = 0;
            this.n = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[EDGE_INSN: B:22:0x003f->B:10:0x003f ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(com.applovin.exoplayer2.e.i r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.i
                int r1 = r6.m
                int r1 = r6.b(r1)
                int r0 = r0 - r1
                int r1 = r6.f12402f
                int r0 = com.applovin.exoplayer2.l.ai.a((int) r0, (int) r1)
                com.applovin.exoplayer2.e.j.b r1 = r6.f12401e
                int r1 = r1.f12417e
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x001e
            L_0x001c:
                r2 = 1
                goto L_0x001f
            L_0x001e:
                r2 = 0
            L_0x001f:
                if (r2 != 0) goto L_0x003f
                int r3 = r6.k
                if (r3 >= r0) goto L_0x003f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.f12403g
                int r5 = r6.k
                int r3 = r7.a(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L_0x0039
                goto L_0x001c
            L_0x0039:
                int r4 = r6.k
                int r4 = r4 + r3
                r6.k = r4
                goto L_0x001f
            L_0x003f:
                int r7 = r6.k
                com.applovin.exoplayer2.e.j.b r8 = r6.f12401e
                int r8 = r8.f12417e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0077
                byte[] r8 = r6.f12403g
                com.applovin.exoplayer2.l.y r9 = r6.f12404h
                r6.a(r8, r7, r9)
                int r8 = r6.k
                com.applovin.exoplayer2.e.j.b r9 = r6.f12401e
                int r9 = r9.f12417e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.k = r8
                com.applovin.exoplayer2.l.y r7 = r6.f12404h
                int r7 = r7.b()
                com.applovin.exoplayer2.e.x r8 = r6.f12400d
                com.applovin.exoplayer2.l.y r9 = r6.f12404h
                r8.a(r9, r7)
                int r8 = r6.m
                int r8 = r8 + r7
                r6.m = r8
                int r7 = r6.b(r8)
                int r8 = r6.i
                if (r7 < r8) goto L_0x0077
                r6.a((int) r8)
            L_0x0077:
                if (r2 == 0) goto L_0x0084
                int r7 = r6.m
                int r7 = r6.b(r7)
                if (r7 <= 0) goto L_0x0084
                r6.a((int) r7)
            L_0x0084:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.j.a.C0120a.a(com.applovin.exoplayer2.e.i, long):boolean");
        }
    }

    private interface b {
        void a(int i, long j) throws ai;

        void a(long j);

        boolean a(i iVar, long j) throws IOException;
    }

    private static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final j f12405a;

        /* renamed from: b  reason: collision with root package name */
        private final x f12406b;

        /* renamed from: c  reason: collision with root package name */
        private final b f12407c;

        /* renamed from: d  reason: collision with root package name */
        private final v f12408d;

        /* renamed from: e  reason: collision with root package name */
        private final int f12409e;

        /* renamed from: f  reason: collision with root package name */
        private long f12410f;

        /* renamed from: g  reason: collision with root package name */
        private int f12411g;

        /* renamed from: h  reason: collision with root package name */
        private long f12412h;

        public c(j jVar, x xVar, b bVar, String str, int i) throws ai {
            this.f12405a = jVar;
            this.f12406b = xVar;
            this.f12407c = bVar;
            int i2 = (bVar.f12414b * bVar.f12418f) / 8;
            if (bVar.f12417e == i2) {
                int i3 = bVar.f12415c * i2 * 8;
                this.f12409e = Math.max(i2, (bVar.f12415c * i2) / 10);
                this.f12408d = new v.a().f(str).d(i3).e(i3).f(this.f12409e).k(bVar.f12414b).l(bVar.f12415c).m(i).a();
                return;
            }
            throw ai.b("Expected block size: " + i2 + "; got: " + bVar.f12417e, (Throwable) null);
        }

        public void a(int i, long j) {
            this.f12405a.a(new d(this.f12407c, 1, (long) i, j));
            this.f12406b.a(this.f12408d);
        }

        public void a(long j) {
            this.f12410f = j;
            this.f12411g = 0;
            this.f12412h = 0;
        }

        public boolean a(i iVar, long j) throws IOException {
            int i;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i <= 0 || (i2 = this.f12411g) >= (i3 = this.f12409e)) {
                    int i4 = this.f12407c.f12417e;
                    int i5 = this.f12411g / i4;
                } else {
                    int a2 = this.f12406b.a((g) iVar, (int) Math.min((long) (i3 - i2), j2), true);
                    if (a2 == -1) {
                        j2 = 0;
                    } else {
                        this.f12411g += a2;
                        j2 -= (long) a2;
                    }
                }
            }
            int i42 = this.f12407c.f12417e;
            int i52 = this.f12411g / i42;
            if (i52 > 0) {
                int i6 = i52 * i42;
                int i7 = this.f12411g - i6;
                this.f12406b.a(this.f12410f + com.applovin.exoplayer2.l.ai.d(this.f12412h, 1000000, (long) this.f12407c.f12415c), 1, i6, i7, (x.a) null);
                this.f12412h += (long) i52;
                this.f12411g = i7;
            }
            return i <= 0;
        }
    }

    private void a() {
        com.applovin.exoplayer2.l.a.a(this.f12393c);
        com.applovin.exoplayer2.l.ai.a(this.f12392b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] b() {
        return new h[]{new a()};
    }

    /* JADX WARNING: type inference failed for: r8v21, types: [com.applovin.exoplayer2.e.j.a$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(com.applovin.exoplayer2.e.i r7, com.applovin.exoplayer2.e.u r8) throws java.io.IOException {
        /*
            r6 = this;
            r6.a()
            com.applovin.exoplayer2.e.j.a$b r8 = r6.f12394d
            if (r8 != 0) goto L_0x007c
            com.applovin.exoplayer2.e.j.b r3 = com.applovin.exoplayer2.e.j.c.a(r7)
            if (r3 == 0) goto L_0x0074
            int r8 = r3.f12413a
            r0 = 17
            if (r8 != r0) goto L_0x001f
            com.applovin.exoplayer2.e.j.a$a r8 = new com.applovin.exoplayer2.e.j.a$a
            com.applovin.exoplayer2.e.j r0 = r6.f12392b
            com.applovin.exoplayer2.e.x r1 = r6.f12393c
            r8.<init>(r0, r1, r3)
        L_0x001c:
            r6.f12394d = r8
            goto L_0x007c
        L_0x001f:
            int r8 = r3.f12413a
            r0 = 6
            if (r8 != r0) goto L_0x0032
            com.applovin.exoplayer2.e.j.a$c r8 = new com.applovin.exoplayer2.e.j.a$c
            com.applovin.exoplayer2.e.j r1 = r6.f12392b
            com.applovin.exoplayer2.e.x r2 = r6.f12393c
            r5 = -1
            java.lang.String r4 = "audio/g711-alaw"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x001c
        L_0x0032:
            int r8 = r3.f12413a
            r0 = 7
            if (r8 != r0) goto L_0x0045
            com.applovin.exoplayer2.e.j.a$c r8 = new com.applovin.exoplayer2.e.j.a$c
            com.applovin.exoplayer2.e.j r1 = r6.f12392b
            com.applovin.exoplayer2.e.x r2 = r6.f12393c
            r5 = -1
            java.lang.String r4 = "audio/g711-mlaw"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x001c
        L_0x0045:
            int r8 = r3.f12413a
            int r0 = r3.f12418f
            int r5 = com.applovin.exoplayer2.b.y.a(r8, r0)
            if (r5 == 0) goto L_0x005c
            com.applovin.exoplayer2.e.j.a$c r8 = new com.applovin.exoplayer2.e.j.a$c
            com.applovin.exoplayer2.e.j r1 = r6.f12392b
            com.applovin.exoplayer2.e.x r2 = r6.f12393c
            java.lang.String r4 = "audio/raw"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x001c
        L_0x005c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unsupported WAV format type: "
            r7.append(r8)
            int r8 = r3.f12413a
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.applovin.exoplayer2.ai r7 = com.applovin.exoplayer2.ai.a(r7)
            throw r7
        L_0x0074:
            r7 = 0
            java.lang.String r8 = "Unsupported or unrecognized wav header."
            com.applovin.exoplayer2.ai r7 = com.applovin.exoplayer2.ai.b(r8, r7)
            throw r7
        L_0x007c:
            int r8 = r6.f12395e
            r0 = -1
            if (r8 != r0) goto L_0x00a1
            android.util.Pair r8 = com.applovin.exoplayer2.e.j.c.b(r7)
            java.lang.Object r1 = r8.first
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            r6.f12395e = r1
            java.lang.Object r8 = r8.second
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            r6.f12396f = r1
            com.applovin.exoplayer2.e.j.a$b r8 = r6.f12394d
            int r3 = r6.f12395e
            r8.a((int) r3, (long) r1)
            goto L_0x00b0
        L_0x00a1:
            long r1 = r7.c()
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00b0
            int r8 = r6.f12395e
            r7.b(r8)
        L_0x00b0:
            long r1 = r6.f12396f
            r3 = -1
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00bb
            r1 = 1
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            com.applovin.exoplayer2.l.a.b((boolean) r1)
            long r1 = r6.f12396f
            long r3 = r7.c()
            long r1 = r1 - r3
            com.applovin.exoplayer2.e.j.a$b r3 = r6.f12394d
            boolean r7 = r3.a((com.applovin.exoplayer2.e.i) r7, (long) r1)
            if (r7 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.j.a.a(com.applovin.exoplayer2.e.i, com.applovin.exoplayer2.e.u):int");
    }

    public void a(long j, long j2) {
        b bVar = this.f12394d;
        if (bVar != null) {
            bVar.a(j2);
        }
    }

    public void a(j jVar) {
        this.f12392b = jVar;
        this.f12393c = jVar.a(0, 1);
        jVar.a();
    }

    public boolean a(i iVar) throws IOException {
        return c.a(iVar) != null;
    }

    public void c() {
    }
}
