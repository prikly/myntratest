package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.exoplayer2.c.b;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.n;
import com.applovin.exoplayer2.e;
import com.applovin.exoplayer2.f.a;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.l.af;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.p;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import com.facebook.ads.AdError;
import io.bidmachine.utils.IabUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public abstract class j extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f12552b = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private v A;
    private MediaFormat B;
    private boolean C;
    private float D;
    private ArrayDeque<i> E;
    private a F;
    private i G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private e S;
    private long T;
    private int U;
    private int V;
    private ByteBuffer W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    protected com.applovin.exoplayer2.c.e f12553a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    private int ae;
    private int af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private long aj;
    private long ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private p as;
    private long at = -9223372036854775807L;
    private long au = -9223372036854775807L;
    private int av;

    /* renamed from: c  reason: collision with root package name */
    private final g.b f12554c;

    /* renamed from: d  reason: collision with root package name */
    private final k f12555d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12556e;

    /* renamed from: f  reason: collision with root package name */
    private final float f12557f;

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.exoplayer2.c.g f12558g = com.applovin.exoplayer2.c.g.f();

    /* renamed from: h  reason: collision with root package name */
    private final com.applovin.exoplayer2.c.g f12559h = new com.applovin.exoplayer2.c.g(0);
    private final com.applovin.exoplayer2.c.g i = new com.applovin.exoplayer2.c.g(2);
    private final d j = new d();
    private final af<v> k = new af<>();
    private final ArrayList<Long> l = new ArrayList<>();
    private final MediaCodec.BufferInfo m = new MediaCodec.BufferInfo();
    private final long[] n = new long[10];
    private final long[] o = new long[10];
    private final long[] p = new long[10];
    private v q;
    private v r;
    private f s;
    private f t;
    private MediaCrypto u;
    private boolean v;
    private long w = -9223372036854775807L;
    private float x = 1.0f;
    private float y = 1.0f;
    private g z;

    public static class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final String f12560a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12561b;

        /* renamed from: c  reason: collision with root package name */
        public final i f12562c;

        /* renamed from: d  reason: collision with root package name */
        public final String f12563d;

        /* renamed from: e  reason: collision with root package name */
        public final a f12564e;

        public a(v vVar, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + vVar, th, vVar.l, z, (i) null, a(i), (a) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(v vVar, Throwable th, boolean z, i iVar) {
            this("Decoder init failed: " + iVar.f12544a + ", " + vVar, th, vVar.l, z, iVar, ai.f13525a >= 21 ? a(th) : null, (a) null);
        }

        private a(String str, Throwable th, String str2, boolean z, i iVar, String str3, a aVar) {
            super(str, th);
            this.f12560a = str2;
            this.f12561b = z;
            this.f12562c = iVar;
            this.f12563d = str3;
            this.f12564e = aVar;
        }

        /* access modifiers changed from: private */
        public a a(a aVar) {
            return new a(getMessage(), getCause(), this.f12560a, this.f12561b, this.f12562c, this.f12563d, aVar);
        }

        private static String a(int i) {
            String str = i < 0 ? "neg_" : "";
            return "com.applovin.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i);
        }

        private static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public j(int i2, g.b bVar, k kVar, boolean z2, float f2) {
        super(i2);
        this.f12554c = bVar;
        this.f12555d = (k) com.applovin.exoplayer2.l.a.b(kVar);
        this.f12556e = z2;
        this.f12557f = f2;
        this.j.f(0);
        this.j.f11419b.order(ByteOrder.nativeOrder());
        this.D = -1.0f;
        this.H = 0;
        this.ad = 0;
        this.U = -1;
        this.V = -1;
        this.T = -9223372036854775807L;
        this.aj = -9223372036854775807L;
        this.ak = -9223372036854775807L;
        this.ae = 0;
        this.af = 0;
    }

    private void B() {
        this.ab = false;
        this.j.a();
        this.i.a();
        this.aa = false;
        this.Z = false;
    }

    private void R() {
        try {
            this.z.d();
        } finally {
            M();
        }
    }

    private boolean S() {
        return this.V >= 0;
    }

    private void T() {
        this.U = -1;
        this.f12559h.f11419b = null;
    }

    private void U() {
        this.V = -1;
        this.W = null;
    }

    private boolean V() throws p {
        g gVar = this.z;
        if (gVar == null || this.ae == 2 || this.al) {
            return false;
        }
        if (this.U < 0) {
            int b2 = gVar.b();
            this.U = b2;
            if (b2 < 0) {
                return false;
            }
            this.f12559h.f11419b = this.z.a(b2);
            this.f12559h.a();
        }
        if (this.ae == 1) {
            if (!this.R) {
                this.ah = true;
                this.z.a(this.U, 0, 0, 0, 4);
                T();
            }
            this.ae = 2;
            return false;
        } else if (this.P) {
            this.P = false;
            this.f12559h.f11419b.put(f12552b);
            this.z.a(this.U, 0, f12552b.length, 0, 0);
            T();
            this.ag = true;
            return true;
        } else {
            if (this.ad == 1) {
                for (int i2 = 0; i2 < this.A.n.size(); i2++) {
                    this.f12559h.f11419b.put(this.A.n.get(i2));
                }
                this.ad = 2;
            }
            int position = this.f12559h.f11419b.position();
            w t2 = t();
            try {
                int a2 = a(t2, this.f12559h, 0);
                if (g()) {
                    this.ak = this.aj;
                }
                if (a2 == -3) {
                    return false;
                }
                if (a2 == -5) {
                    if (this.ad == 2) {
                        this.f12559h.a();
                        this.ad = 1;
                    }
                    a(t2);
                    return true;
                } else if (this.f12559h.c()) {
                    if (this.ad == 2) {
                        this.f12559h.a();
                        this.ad = 1;
                    }
                    this.al = true;
                    if (!this.ag) {
                        aa();
                        return false;
                    }
                    try {
                        if (!this.R) {
                            this.ah = true;
                            this.z.a(this.U, 0, 0, 0, 4);
                            T();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e2) {
                        throw a((Throwable) e2, this.q, h.b(e2.getErrorCode()));
                    }
                } else if (this.ag || this.f12559h.d()) {
                    boolean g2 = this.f12559h.g();
                    if (g2) {
                        this.f12559h.f11418a.a(position);
                    }
                    if (this.I && !g2) {
                        com.applovin.exoplayer2.l.v.a(this.f12559h.f11419b);
                        if (this.f12559h.f11419b.position() == 0) {
                            return true;
                        }
                        this.I = false;
                    }
                    long j2 = this.f12559h.f11421d;
                    e eVar = this.S;
                    if (eVar != null) {
                        j2 = eVar.a(this.q, this.f12559h);
                        this.aj = Math.max(this.aj, this.S.a(this.q));
                    }
                    long j3 = j2;
                    if (this.f12559h.b()) {
                        this.l.add(Long.valueOf(j3));
                    }
                    if (this.an) {
                        this.k.a(j3, this.q);
                        this.an = false;
                    }
                    this.aj = Math.max(this.aj, j3);
                    this.f12559h.h();
                    if (this.f12559h.e()) {
                        b(this.f12559h);
                    }
                    a(this.f12559h);
                    if (g2) {
                        try {
                            this.z.a(this.U, 0, this.f12559h.f11418a, j3, 0);
                        } catch (MediaCodec.CryptoException e3) {
                            throw a((Throwable) e3, this.q, h.b(e3.getErrorCode()));
                        }
                    } else {
                        this.z.a(this.U, 0, this.f12559h.f11419b.limit(), j3, 0);
                    }
                    T();
                    this.ag = true;
                    this.ad = 0;
                    this.f12553a.f11412c++;
                    return true;
                } else {
                    this.f12559h.a();
                    if (this.ad == 2) {
                        this.ad = 1;
                    }
                    return true;
                }
            } catch (g.a e4) {
                a((Exception) e4);
                e(0);
                R();
                return true;
            }
        }
    }

    private boolean W() {
        if (this.ag) {
            this.ae = 1;
            if (this.J || this.L) {
                this.af = 3;
                return false;
            }
            this.af = 1;
        }
        return true;
    }

    private boolean X() throws p {
        if (this.ag) {
            this.ae = 1;
            if (this.J || this.L) {
                this.af = 3;
                return false;
            }
            this.af = 2;
        } else {
            ac();
        }
        return true;
    }

    private void Y() throws p {
        if (this.ag) {
            this.ae = 1;
            this.af = 3;
            return;
        }
        ab();
    }

    private void Z() {
        this.ai = true;
        MediaFormat c2 = this.z.c();
        if (this.H != 0 && c2.getInteger(IabUtils.KEY_WIDTH) == 32 && c2.getInteger(IabUtils.KEY_HEIGHT) == 32) {
            this.Q = true;
            return;
        }
        if (this.O) {
            c2.setInteger("channel-count", 1);
        }
        this.B = c2;
        this.C = true;
    }

    private void a(MediaCrypto mediaCrypto, boolean z2) throws a {
        if (this.E == null) {
            try {
                List<i> d2 = d(z2);
                ArrayDeque<i> arrayDeque = new ArrayDeque<>();
                this.E = arrayDeque;
                if (this.f12556e) {
                    arrayDeque.addAll(d2);
                } else if (!d2.isEmpty()) {
                    this.E.add(d2.get(0));
                }
                this.F = null;
            } catch (l.b e2) {
                throw new a(this.q, (Throwable) e2, z2, -49998);
            }
        }
        if (!this.E.isEmpty()) {
            while (this.z == null) {
                i peekFirst = this.E.peekFirst();
                if (a(peekFirst)) {
                    try {
                        a(peekFirst, mediaCrypto);
                    } catch (Exception e3) {
                        q.b("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, e3);
                        this.E.removeFirst();
                        a aVar = new a(this.q, (Throwable) e3, z2, peekFirst);
                        a((Exception) aVar);
                        a aVar2 = this.F;
                        if (aVar2 == null) {
                            this.F = aVar;
                        } else {
                            this.F = aVar2.a(aVar);
                        }
                        if (this.E.isEmpty()) {
                            throw this.F;
                        }
                    }
                } else {
                    return;
                }
            }
            this.E = null;
            return;
        }
        throw new a(this.q, (Throwable) null, z2, -49999);
    }

    private void a(f fVar) {
        f.CC.a(this.t, fVar);
        this.t = fVar;
    }

    private void a(i iVar, MediaCrypto mediaCrypto) throws Exception {
        String str = iVar.f12544a;
        float f2 = -1.0f;
        float a2 = ai.f13525a < 23 ? -1.0f : a(this.y, this.q, u());
        if (a2 > this.f12557f) {
            f2 = a2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ah.a("createCodec:" + str);
        g.a a3 = a(iVar, this.q, mediaCrypto, f2);
        g b2 = (!this.ap || ai.f13525a < 23) ? this.f12554c.b(a3) : new a.C0121a(a(), this.aq, this.ar).b(a3);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.z = b2;
        this.G = iVar;
        this.D = f2;
        this.A = this.q;
        this.H = c(str);
        this.I = a(str, this.A);
        this.J = b(str);
        this.K = d(str);
        this.L = e(str);
        this.M = g(str);
        this.N = f(str);
        this.O = b(str, this.A);
        boolean z2 = false;
        this.R = b(iVar) || F();
        if (b2.a()) {
            this.ac = true;
            this.ad = 1;
            if (this.H != 0) {
                z2 = true;
            }
            this.P = z2;
        }
        if ("c2.android.mp3.decoder".equals(iVar.f12544a)) {
            this.S = new e();
        }
        if (d_() == 2) {
            this.T = SystemClock.elapsedRealtime() + 1000;
        }
        this.f12553a.f11410a++;
        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }

    private boolean a(i iVar, v vVar, f fVar, f fVar2) throws p {
        n c2;
        if (fVar == fVar2) {
            return false;
        }
        if (fVar2 == null || fVar == null || ai.f13525a < 23 || h.f12716e.equals(fVar.f()) || h.f12716e.equals(fVar2.f()) || (c2 = c(fVar2)) == null) {
            return true;
        }
        return !iVar.f12550g && (c2.f11781d ? false : fVar2.a(vVar.l));
    }

    private static boolean a(IllegalStateException illegalStateException) {
        if (ai.f13525a >= 21 && b(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean a(String str, v vVar) {
        return ai.f13525a < 21 && vVar.n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private void aa() throws p {
        int i2 = this.af;
        if (i2 == 1) {
            R();
        } else if (i2 == 2) {
            R();
            ac();
        } else if (i2 != 3) {
            this.am = true;
            D();
        } else {
            ab();
        }
    }

    private void ab() throws p {
        J();
        E();
    }

    private void ac() throws p {
        try {
            this.u.setMediaDrmSession(c(this.t).f11780c);
            b(this.t);
            this.ae = 0;
            this.af = 0;
        } catch (MediaCryptoException e2) {
            throw a((Throwable) e2, this.q, 6006);
        }
    }

    private void ad() throws p {
        com.applovin.exoplayer2.l.a.b(!this.al);
        w t2 = t();
        this.i.a();
        do {
            this.i.a();
            int a2 = a(t2, this.i, 0);
            if (a2 == -5) {
                a(t2);
                return;
            } else if (a2 != -4) {
                if (a2 != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.i.c()) {
                this.al = true;
                return;
            } else {
                if (this.an) {
                    v vVar = (v) com.applovin.exoplayer2.l.a.b(this.q);
                    this.r = vVar;
                    a(vVar, (MediaFormat) null);
                    this.an = false;
                }
                this.i.h();
            }
        } while (this.j.a(this.i));
        this.aa = true;
    }

    private void b(f fVar) {
        f.CC.a(this.s, fVar);
        this.s = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(long r20, long r22) throws com.applovin.exoplayer2.p {
        /*
            r19 = this;
            r15 = r19
            boolean r0 = r19.S()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00ce
            boolean r0 = r15.M
            if (r0 == 0) goto L_0x0028
            boolean r0 = r15.ah
            if (r0 == 0) goto L_0x0028
            com.applovin.exoplayer2.f.g r0 = r15.z     // Catch:{ IllegalStateException -> 0x001c }
            android.media.MediaCodec$BufferInfo r1 = r15.m     // Catch:{ IllegalStateException -> 0x001c }
            int r0 = r0.a((android.media.MediaCodec.BufferInfo) r1)     // Catch:{ IllegalStateException -> 0x001c }
            goto L_0x0030
        L_0x001c:
            r19.aa()
            boolean r0 = r15.am
            if (r0 == 0) goto L_0x0027
            r19.J()
        L_0x0027:
            return r14
        L_0x0028:
            com.applovin.exoplayer2.f.g r0 = r15.z
            android.media.MediaCodec$BufferInfo r1 = r15.m
            int r0 = r0.a((android.media.MediaCodec.BufferInfo) r1)
        L_0x0030:
            if (r0 >= 0) goto L_0x004a
            r1 = -2
            if (r0 != r1) goto L_0x0039
            r19.Z()
            return r16
        L_0x0039:
            boolean r0 = r15.R
            if (r0 == 0) goto L_0x0049
            boolean r0 = r15.al
            if (r0 != 0) goto L_0x0046
            int r0 = r15.ae
            r1 = 2
            if (r0 != r1) goto L_0x0049
        L_0x0046:
            r19.aa()
        L_0x0049:
            return r14
        L_0x004a:
            boolean r1 = r15.Q
            if (r1 == 0) goto L_0x0056
            r15.Q = r14
            com.applovin.exoplayer2.f.g r1 = r15.z
            r1.a((int) r0, (boolean) r14)
            return r16
        L_0x0056:
            android.media.MediaCodec$BufferInfo r1 = r15.m
            int r1 = r1.size
            if (r1 != 0) goto L_0x0068
            android.media.MediaCodec$BufferInfo r1 = r15.m
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0068
            r19.aa()
            return r14
        L_0x0068:
            r15.V = r0
            com.applovin.exoplayer2.f.g r1 = r15.z
            java.nio.ByteBuffer r0 = r1.b(r0)
            r15.W = r0
            if (r0 == 0) goto L_0x0089
            android.media.MediaCodec$BufferInfo r1 = r15.m
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.W
            android.media.MediaCodec$BufferInfo r1 = r15.m
            int r1 = r1.offset
            android.media.MediaCodec$BufferInfo r2 = r15.m
            int r2 = r2.size
            int r1 = r1 + r2
            r0.limit(r1)
        L_0x0089:
            boolean r0 = r15.N
            if (r0 == 0) goto L_0x00ae
            android.media.MediaCodec$BufferInfo r0 = r15.m
            long r0 = r0.presentationTimeUs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00ae
            android.media.MediaCodec$BufferInfo r0 = r15.m
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00ae
            long r0 = r15.aj
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ae
            android.media.MediaCodec$BufferInfo r2 = r15.m
            r2.presentationTimeUs = r0
        L_0x00ae:
            android.media.MediaCodec$BufferInfo r0 = r15.m
            long r0 = r0.presentationTimeUs
            boolean r0 = r15.f((long) r0)
            r15.X = r0
            long r0 = r15.ak
            android.media.MediaCodec$BufferInfo r2 = r15.m
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00c4
            r0 = 1
            goto L_0x00c5
        L_0x00c4:
            r0 = 0
        L_0x00c5:
            r15.Y = r0
            android.media.MediaCodec$BufferInfo r0 = r15.m
            long r0 = r0.presentationTimeUs
            r15.c((long) r0)
        L_0x00ce:
            boolean r0 = r15.M
            if (r0 == 0) goto L_0x010b
            boolean r0 = r15.ah
            if (r0 == 0) goto L_0x010b
            com.applovin.exoplayer2.f.g r5 = r15.z     // Catch:{ IllegalStateException -> 0x00fe }
            java.nio.ByteBuffer r6 = r15.W     // Catch:{ IllegalStateException -> 0x00fe }
            int r7 = r15.V     // Catch:{ IllegalStateException -> 0x00fe }
            android.media.MediaCodec$BufferInfo r0 = r15.m     // Catch:{ IllegalStateException -> 0x00fe }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00fe }
            r9 = 1
            android.media.MediaCodec$BufferInfo r0 = r15.m     // Catch:{ IllegalStateException -> 0x00fe }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00fe }
            boolean r12 = r15.X     // Catch:{ IllegalStateException -> 0x00fe }
            boolean r13 = r15.Y     // Catch:{ IllegalStateException -> 0x00fe }
            com.applovin.exoplayer2.v r3 = r15.r     // Catch:{ IllegalStateException -> 0x00fe }
            r0 = r19
            r1 = r20
            r17 = r3
            r3 = r22
            r18 = 0
            r14 = r17
            boolean r0 = r0.a(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x00fc }
            goto L_0x012c
        L_0x00fc:
            goto L_0x0100
        L_0x00fe:
            r18 = 0
        L_0x0100:
            r19.aa()
            boolean r0 = r15.am
            if (r0 == 0) goto L_0x010a
            r19.J()
        L_0x010a:
            return r18
        L_0x010b:
            r18 = 0
            com.applovin.exoplayer2.f.g r5 = r15.z
            java.nio.ByteBuffer r6 = r15.W
            int r7 = r15.V
            android.media.MediaCodec$BufferInfo r0 = r15.m
            int r8 = r0.flags
            r9 = 1
            android.media.MediaCodec$BufferInfo r0 = r15.m
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.X
            boolean r13 = r15.Y
            com.applovin.exoplayer2.v r14 = r15.r
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.a(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x012c:
            if (r0 == 0) goto L_0x0149
            android.media.MediaCodec$BufferInfo r0 = r15.m
            long r0 = r0.presentationTimeUs
            r15.d((long) r0)
            android.media.MediaCodec$BufferInfo r0 = r15.m
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x013f
            r14 = 1
            goto L_0x0140
        L_0x013f:
            r14 = 0
        L_0x0140:
            r19.U()
            if (r14 != 0) goto L_0x0146
            return r16
        L_0x0146:
            r19.aa()
        L_0x0149:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.j.b(long, long):boolean");
    }

    private static boolean b(i iVar) {
        String str = iVar.f12544a;
        return (ai.f13525a <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (ai.f13525a <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((ai.f13525a <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(ai.f13527c) && "AFTS".equals(ai.f13528d) && iVar.f12550g));
    }

    private static boolean b(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean b(String str) {
        return ai.f13525a < 18 || (ai.f13525a == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (ai.f13525a == 19 && ai.f13528d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean b(String str, v vVar) {
        return ai.f13525a <= 18 && vVar.y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private int c(String str) {
        if (ai.f13525a <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (ai.f13528d.startsWith("SM-T585") || ai.f13528d.startsWith("SM-A510") || ai.f13528d.startsWith("SM-A520") || ai.f13528d.startsWith("SM-J700"))) {
            return 2;
        }
        if (ai.f13525a >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(ai.f13526b) || "flounder_lte".equals(ai.f13526b) || "grouper".equals(ai.f13526b) || "tilapia".equals(ai.f13526b)) ? 1 : 0;
        }
        return 0;
    }

    private n c(f fVar) throws p {
        b g2 = fVar.g();
        if (g2 == null || (g2 instanceof n)) {
            return (n) g2;
        }
        throw a((Throwable) new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + g2), this.q, (int) AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    private boolean c(long j2, long j3) throws p {
        com.applovin.exoplayer2.l.a.b(!this.am);
        if (this.j.l()) {
            if (!a(j2, j3, (g) null, this.j.f11419b, this.V, 0, this.j.k(), this.j.i(), this.j.b(), this.j.c(), this.r)) {
                return false;
            }
            d(this.j.j());
            this.j.a();
        }
        if (this.al) {
            this.am = true;
            return false;
        }
        if (this.aa) {
            com.applovin.exoplayer2.l.a.b(this.j.a(this.i));
            this.aa = false;
        }
        if (this.ab) {
            if (this.j.l()) {
                return true;
            }
            B();
            this.ab = false;
            E();
            if (!this.Z) {
                return false;
            }
        }
        ad();
        if (this.j.l()) {
            this.j.h();
        }
        return this.j.l() || this.al || this.ab;
    }

    protected static boolean c(v vVar) {
        return vVar.E == 0 || vVar.E == 2;
    }

    private static boolean c(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private List<i> d(boolean z2) throws l.b {
        List<i> a2 = a(this.f12555d, this.q, z2);
        if (a2.isEmpty() && z2) {
            a2 = a(this.f12555d, this.q, false);
            if (!a2.isEmpty()) {
                q.c("MediaCodecRenderer", "Drm session requires secure decoder for " + this.q.l + ", but no secure decoder available. Trying to proceed with " + a2 + ".");
            }
        }
        return a2;
    }

    private void d(v vVar) {
        B();
        String str = vVar.l;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.j.g(32);
        } else {
            this.j.g(1);
        }
        this.Z = true;
    }

    private static boolean d(String str) {
        return ai.f13525a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private boolean e(int i2) throws p {
        w t2 = t();
        this.f12558g.a();
        int a2 = a(t2, this.f12558g, i2 | 4);
        if (a2 == -5) {
            a(t2);
            return true;
        } else if (a2 != -4 || !this.f12558g.c()) {
            return false;
        } else {
            this.al = true;
            aa();
            return false;
        }
    }

    private boolean e(long j2) {
        return this.w == -9223372036854775807L || SystemClock.elapsedRealtime() - j2 < this.w;
    }

    private boolean e(v vVar) throws p {
        if (!(ai.f13525a < 23 || this.z == null || this.af == 3 || d_() == 0)) {
            float a2 = a(this.y, vVar, u());
            float f2 = this.D;
            if (f2 == a2) {
                return true;
            }
            if (a2 == -1.0f) {
                Y();
                return false;
            } else if (f2 == -1.0f && a2 <= this.f12557f) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", a2);
                this.z.a(bundle);
                this.D = a2;
            }
        }
        return true;
    }

    private static boolean e(String str) {
        return (ai.f13525a <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (ai.f13525a <= 19 && (("hb2000".equals(ai.f13526b) || "stvm8".equals(ai.f13526b)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
    }

    private boolean f(long j2) {
        int size = this.l.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.l.get(i2).longValue() == j2) {
                this.l.remove(i2);
                return true;
            }
        }
        return false;
    }

    private static boolean f(String str) {
        return ai.f13525a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(ai.f13527c) && (ai.f13526b.startsWith("baffin") || ai.f13526b.startsWith("grand") || ai.f13526b.startsWith("fortuna") || ai.f13526b.startsWith("gprimelte") || ai.f13526b.startsWith("j2y18lte") || ai.f13526b.startsWith("ms01"));
    }

    private static boolean g(String str) {
        return ai.f13525a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public boolean A() {
        return this.am;
    }

    /* access modifiers changed from: protected */
    public void C() {
    }

    /* access modifiers changed from: protected */
    public void D() throws p {
    }

    /* access modifiers changed from: protected */
    public final void E() throws p {
        v vVar;
        if (this.z == null && !this.Z && (vVar = this.q) != null) {
            if (this.t != null || !b(vVar)) {
                b(this.t);
                String str = this.q.l;
                f fVar = this.s;
                if (fVar != null) {
                    if (this.u == null) {
                        n c2 = c(fVar);
                        if (c2 != null) {
                            try {
                                this.u = new MediaCrypto(c2.f11779b, c2.f11780c);
                                this.v = !c2.f11781d && this.u.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e2) {
                                throw a((Throwable) e2, this.q, 6006);
                            }
                        } else if (this.s.e() == null) {
                            return;
                        }
                    }
                    if (n.f11778a) {
                        int c3 = this.s.c();
                        if (c3 == 1) {
                            f.a aVar = (f.a) com.applovin.exoplayer2.l.a.b(this.s.e());
                            throw a((Throwable) aVar, this.q, aVar.f11763a);
                        } else if (c3 != 4) {
                            return;
                        }
                    }
                }
                try {
                    a(this.u, this.v);
                } catch (a e3) {
                    throw a((Throwable) e3, this.q, 4001);
                }
            } else {
                d(this.q);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean F() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final g G() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    public final MediaFormat H() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public final i I() {
        return this.G;
    }

    /* access modifiers changed from: protected */
    public void J() {
        try {
            if (this.z != null) {
                this.z.e();
                this.f12553a.f11411b++;
                a(this.G.f12544a);
            }
            this.z = null;
            try {
                if (this.u != null) {
                    this.u.release();
                }
            } finally {
                this.u = null;
                b((f) null);
                N();
            }
        } catch (Throwable th) {
            this.z = null;
            if (this.u != null) {
                this.u.release();
            }
            throw th;
        } finally {
            this.u = null;
            b((f) null);
            N();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean K() throws p {
        boolean L2 = L();
        if (L2) {
            E();
        }
        return L2;
    }

    /* access modifiers changed from: protected */
    public boolean L() {
        if (this.z == null) {
            return false;
        }
        if (this.af == 3 || this.J || ((this.K && !this.ai) || (this.L && this.ah))) {
            J();
            return true;
        }
        R();
        return false;
    }

    /* access modifiers changed from: protected */
    public void M() {
        T();
        U();
        this.T = -9223372036854775807L;
        this.ah = false;
        this.ag = false;
        this.P = false;
        this.Q = false;
        this.X = false;
        this.Y = false;
        this.l.clear();
        this.aj = -9223372036854775807L;
        this.ak = -9223372036854775807L;
        e eVar = this.S;
        if (eVar != null) {
            eVar.a();
        }
        this.ae = 0;
        this.af = 0;
        this.ad = this.ac ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public void N() {
        M();
        this.as = null;
        this.S = null;
        this.E = null;
        this.G = null;
        this.A = null;
        this.B = null;
        this.C = false;
        this.ai = false;
        this.D = -1.0f;
        this.H = 0;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.R = false;
        this.ac = false;
        this.ad = 0;
        this.v = false;
    }

    /* access modifiers changed from: protected */
    public float O() {
        return this.x;
    }

    /* access modifiers changed from: protected */
    public final void P() {
        this.ao = true;
    }

    /* access modifiers changed from: protected */
    public final long Q() {
        return this.au;
    }

    /* access modifiers changed from: protected */
    public float a(float f2, v vVar, v[] vVarArr) {
        return -1.0f;
    }

    /* access modifiers changed from: protected */
    public abstract int a(k kVar, v vVar) throws l.b;

    public final int a(v vVar) throws p {
        try {
            return a(this.f12555d, vVar);
        } catch (l.b e2) {
            throw a((Throwable) e2, vVar, 4002);
        }
    }

    /* access modifiers changed from: protected */
    public com.applovin.exoplayer2.c.h a(i iVar, v vVar, v vVar2) {
        return new com.applovin.exoplayer2.c.h(iVar.f12544a, vVar, vVar2, 0, 1);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (X() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b2, code lost:
        if (X() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cf, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00eb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.w r12) throws com.applovin.exoplayer2.p {
        /*
            r11 = this;
            r0 = 1
            r11.an = r0
            com.applovin.exoplayer2.v r1 = r12.f13939b
            java.lang.Object r1 = com.applovin.exoplayer2.l.a.b(r1)
            r5 = r1
            com.applovin.exoplayer2.v r5 = (com.applovin.exoplayer2.v) r5
            java.lang.String r1 = r5.l
            if (r1 == 0) goto L_0x00ec
            com.applovin.exoplayer2.d.f r12 = r12.f13938a
            r11.a((com.applovin.exoplayer2.d.f) r12)
            r11.q = r5
            boolean r12 = r11.Z
            r1 = 0
            if (r12 == 0) goto L_0x001f
            r11.ab = r0
            return r1
        L_0x001f:
            com.applovin.exoplayer2.f.g r12 = r11.z
            if (r12 != 0) goto L_0x0029
            r11.E = r1
            r11.E()
            return r1
        L_0x0029:
            com.applovin.exoplayer2.f.i r1 = r11.G
            com.applovin.exoplayer2.v r4 = r11.A
            com.applovin.exoplayer2.d.f r2 = r11.s
            com.applovin.exoplayer2.d.f r3 = r11.t
            boolean r2 = r11.a((com.applovin.exoplayer2.f.i) r1, (com.applovin.exoplayer2.v) r5, (com.applovin.exoplayer2.d.f) r2, (com.applovin.exoplayer2.d.f) r3)
            if (r2 == 0) goto L_0x0046
            r11.Y()
            com.applovin.exoplayer2.c.h r12 = new com.applovin.exoplayer2.c.h
            java.lang.String r3 = r1.f12544a
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0046:
            com.applovin.exoplayer2.d.f r2 = r11.t
            com.applovin.exoplayer2.d.f r3 = r11.s
            r6 = 0
            if (r2 == r3) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x005b
            int r3 = com.applovin.exoplayer2.l.ai.f13525a
            r7 = 23
            if (r3 < r7) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            goto L_0x005c
        L_0x005b:
            r3 = 1
        L_0x005c:
            com.applovin.exoplayer2.l.a.b((boolean) r3)
            com.applovin.exoplayer2.c.h r3 = r11.a((com.applovin.exoplayer2.f.i) r1, (com.applovin.exoplayer2.v) r4, (com.applovin.exoplayer2.v) r5)
            int r7 = r3.f11430d
            r8 = 3
            r9 = 16
            r10 = 2
            if (r7 == 0) goto L_0x00d1
            if (r7 == r0) goto L_0x00b5
            if (r7 == r10) goto L_0x0089
            if (r7 != r8) goto L_0x0083
            boolean r0 = r11.e((com.applovin.exoplayer2.v) r5)
            if (r0 != 0) goto L_0x0078
            goto L_0x00bb
        L_0x0078:
            r11.A = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.X()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x0083:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0089:
            boolean r7 = r11.e((com.applovin.exoplayer2.v) r5)
            if (r7 != 0) goto L_0x0090
            goto L_0x00bb
        L_0x0090:
            r11.ac = r0
            r11.ad = r0
            int r7 = r11.H
            if (r7 == r10) goto L_0x00a8
            if (r7 != r0) goto L_0x00a7
            int r7 = r5.q
            int r9 = r4.q
            if (r7 != r9) goto L_0x00a7
            int r7 = r5.r
            int r9 = r4.r
            if (r7 != r9) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r11.P = r0
            r11.A = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.X()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00b5:
            boolean r0 = r11.e((com.applovin.exoplayer2.v) r5)
            if (r0 != 0) goto L_0x00be
        L_0x00bb:
            r7 = 16
            goto L_0x00d5
        L_0x00be:
            r11.A = r5
            if (r2 == 0) goto L_0x00c9
            boolean r0 = r11.X()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00c9:
            boolean r0 = r11.W()
            if (r0 != 0) goto L_0x00d4
        L_0x00cf:
            r7 = 2
            goto L_0x00d5
        L_0x00d1:
            r11.Y()
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            int r0 = r3.f11430d
            if (r0 == 0) goto L_0x00eb
            com.applovin.exoplayer2.f.g r0 = r11.z
            if (r0 != r12) goto L_0x00e1
            int r12 = r11.af
            if (r12 != r8) goto L_0x00eb
        L_0x00e1:
            com.applovin.exoplayer2.c.h r12 = new com.applovin.exoplayer2.c.h
            java.lang.String r3 = r1.f12544a
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x00eb:
            return r3
        L_0x00ec:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.applovin.exoplayer2.p r12 = r11.a((java.lang.Throwable) r12, (com.applovin.exoplayer2.v) r5, (int) r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.j.a(com.applovin.exoplayer2.w):com.applovin.exoplayer2.c.h");
    }

    /* access modifiers changed from: protected */
    public abstract g.a a(i iVar, v vVar, MediaCrypto mediaCrypto, float f2);

    /* access modifiers changed from: protected */
    public h a(Throwable th, i iVar) {
        return new h(th, iVar);
    }

    /* access modifiers changed from: protected */
    public abstract List<i> a(k kVar, v vVar, boolean z2) throws l.b;

    public void a(float f2, float f3) throws p {
        this.x = f2;
        this.y = f3;
        e(this.A);
    }

    public void a(long j2, long j3) throws p {
        boolean z2 = false;
        if (this.ao) {
            this.ao = false;
            aa();
        }
        p pVar = this.as;
        if (pVar == null) {
            try {
                if (this.am) {
                    D();
                } else if (this.q != null || e(2)) {
                    E();
                    if (this.Z) {
                        ah.a("bypassRender");
                        while (c(j2, j3)) {
                        }
                    } else if (this.z != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        ah.a("drainAndFeed");
                        while (b(j2, j3) && e(elapsedRealtime)) {
                        }
                        while (V() && e(elapsedRealtime)) {
                        }
                    } else {
                        this.f12553a.f11413d += b(j2);
                        e(1);
                        this.f12553a.a();
                    }
                    ah.a();
                    this.f12553a.a();
                }
            } catch (IllegalStateException e2) {
                if (a(e2)) {
                    a((Exception) e2);
                    if (ai.f13525a >= 21 && c(e2)) {
                        z2 = true;
                    }
                    if (z2) {
                        J();
                    }
                    throw a((Throwable) a((Throwable) e2, I()), this.q, z2, 4003);
                }
                throw e2;
            }
        } else {
            this.as = null;
            throw pVar;
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z2) throws p {
        this.al = false;
        this.am = false;
        this.ao = false;
        if (this.Z) {
            this.j.a();
            this.i.a();
            this.aa = false;
        } else {
            K();
        }
        if (this.k.b() > 0) {
            this.an = true;
        }
        this.k.a();
        int i2 = this.av;
        if (i2 != 0) {
            this.au = this.o[i2 - 1];
            this.at = this.n[i2 - 1];
            this.av = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void a(com.applovin.exoplayer2.c.g gVar) throws p {
    }

    /* access modifiers changed from: protected */
    public final void a(p pVar) {
        this.as = pVar;
    }

    /* access modifiers changed from: protected */
    public void a(v vVar, MediaFormat mediaFormat) throws p {
    }

    /* access modifiers changed from: protected */
    public void a(Exception exc) {
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
    }

    /* access modifiers changed from: protected */
    public void a(String str, long j2, long j3) {
    }

    public void a(boolean z2) {
        this.ap = z2;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z2, boolean z3) throws p {
        this.f12553a = new com.applovin.exoplayer2.c.e();
    }

    /* access modifiers changed from: protected */
    public void a(v[] vVarArr, long j2, long j3) throws p {
        boolean z2 = true;
        if (this.au == -9223372036854775807L) {
            if (this.at != -9223372036854775807L) {
                z2 = false;
            }
            com.applovin.exoplayer2.l.a.b(z2);
            this.at = j2;
            this.au = j3;
            return;
        }
        int i2 = this.av;
        if (i2 == this.o.length) {
            q.c("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.o[this.av - 1]);
        } else {
            this.av = i2 + 1;
        }
        long[] jArr = this.n;
        int i3 = this.av;
        jArr[i3 - 1] = j2;
        this.o[i3 - 1] = j3;
        this.p[i3 - 1] = this.aj;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(long j2, long j3, g gVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z2, boolean z3, v vVar) throws p;

    /* access modifiers changed from: protected */
    public boolean a(i iVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(com.applovin.exoplayer2.c.g gVar) throws p {
    }

    public void b(boolean z2) {
        this.aq = z2;
    }

    /* access modifiers changed from: protected */
    public boolean b(v vVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void c(long j2) throws p {
        boolean z2;
        v a2 = this.k.a(j2);
        if (a2 == null && this.C) {
            a2 = this.k.c();
        }
        if (a2 != null) {
            this.r = a2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || (this.C && this.r != null)) {
            a(this.r, this.B);
            this.C = false;
        }
    }

    public void c(boolean z2) {
        this.ar = z2;
    }

    /* access modifiers changed from: protected */
    public void d(long j2) {
        while (true) {
            int i2 = this.av;
            if (i2 != 0 && j2 >= this.p[0]) {
                long[] jArr = this.n;
                this.at = jArr[0];
                this.au = this.o[0];
                int i3 = i2 - 1;
                this.av = i3;
                System.arraycopy(jArr, 1, jArr, 0, i3);
                long[] jArr2 = this.o;
                System.arraycopy(jArr2, 1, jArr2, 0, this.av);
                long[] jArr3 = this.p;
                System.arraycopy(jArr3, 1, jArr3, 0, this.av);
                C();
            } else {
                return;
            }
        }
    }

    public final int o() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public void p() {
    }

    /* access modifiers changed from: protected */
    public void q() {
    }

    /* access modifiers changed from: protected */
    public void r() {
        this.q = null;
        this.at = -9223372036854775807L;
        this.au = -9223372036854775807L;
        this.av = 0;
        L();
    }

    /* access modifiers changed from: protected */
    public void s() {
        try {
            B();
            J();
        } finally {
            a((f) null);
        }
    }

    public boolean z() {
        return this.q != null && (x() || S() || (this.T != -9223372036854775807L && SystemClock.elapsedRealtime() < this.T));
    }
}
