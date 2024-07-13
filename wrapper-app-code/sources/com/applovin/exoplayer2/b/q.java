package com.applovin.exoplayer2.b;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.ar;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.b.h;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.f.i;
import com.applovin.exoplayer2.f.j;
import com.applovin.exoplayer2.f.k;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.s;
import com.applovin.exoplayer2.l.t;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.p;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q extends j implements s {

    /* renamed from: b  reason: collision with root package name */
    private final Context f11312b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final g.a f11313c;

    /* renamed from: d  reason: collision with root package name */
    private final h f11314d;

    /* renamed from: e  reason: collision with root package name */
    private int f11315e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11316f;

    /* renamed from: g  reason: collision with root package name */
    private v f11317g;

    /* renamed from: h  reason: collision with root package name */
    private long f11318h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    /* access modifiers changed from: private */
    public ar.a m;

    private final class a implements h.c {
        private a() {
        }

        public void a() {
            q.this.B();
        }

        public void a(int i, long j, long j2) {
            q.this.f11313c.a(i, j, j2);
        }

        public void a(long j) {
            q.this.f11313c.a(j);
        }

        public void a(Exception exc) {
            com.applovin.exoplayer2.l.q.c("MediaCodecAudioRenderer", "Audio sink error", exc);
            q.this.f11313c.a(exc);
        }

        public void a(boolean z) {
            q.this.f11313c.a(z);
        }

        public void b() {
            if (q.this.m != null) {
                q.this.m.a();
            }
        }

        public void b(long j) {
            if (q.this.m != null) {
                q.this.m.a(j);
            }
        }
    }

    public q(Context context, g.b bVar, k kVar, boolean z, Handler handler, g gVar, h hVar) {
        super(1, bVar, kVar, z, 44100.0f);
        this.f11312b = context.getApplicationContext();
        this.f11314d = hVar;
        this.f11313c = new g.a(handler, gVar);
        hVar.a((h.c) new a());
    }

    public q(Context context, k kVar, boolean z, Handler handler, g gVar, h hVar) {
        this(context, g.b.f12541a, kVar, z, handler, gVar, hVar);
    }

    private void R() {
        long a2 = this.f11314d.a(A());
        if (a2 != Long.MIN_VALUE) {
            if (!this.j) {
                a2 = Math.max(this.f11318h, a2);
            }
            this.f11318h = a2;
            this.j = false;
        }
    }

    private static boolean S() {
        return ai.f13525a == 23 && ("ZTE B2017G".equals(ai.f13528d) || "AXON 7 mini".equals(ai.f13528d));
    }

    private int a(i iVar, v vVar) {
        if (!"OMX.google.raw.decoder".equals(iVar.f12544a) || ai.f13525a >= 24 || (ai.f13525a == 23 && ai.c(this.f11312b))) {
            return vVar.m;
        }
        return -1;
    }

    private static boolean b(String str) {
        return ai.f13525a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(ai.f13527c) && (ai.f13526b.startsWith("zeroflte") || ai.f13526b.startsWith("herolte") || ai.f13526b.startsWith("heroqlte"));
    }

    public boolean A() {
        return super.A() && this.f11314d.d();
    }

    /* access modifiers changed from: protected */
    public void B() {
        this.j = true;
    }

    /* access modifiers changed from: protected */
    public void C() {
        super.C();
        this.f11314d.b();
    }

    /* access modifiers changed from: protected */
    public void D() throws p {
        try {
            this.f11314d.c();
        } catch (h.e e2) {
            throw a((Throwable) e2, e2.f11243c, e2.f11242b, (int) IronSourceConstants.errorCode_isReadyException);
        }
    }

    /* access modifiers changed from: protected */
    public float a(float f2, v vVar, v[] vVarArr) {
        int i2 = -1;
        for (v vVar2 : vVarArr) {
            int i3 = vVar2.z;
            if (i3 != -1) {
                i2 = Math.max(i2, i3);
            }
        }
        if (i2 == -1) {
            return -1.0f;
        }
        return f2 * ((float) i2);
    }

    /* access modifiers changed from: protected */
    public int a(i iVar, v vVar, v[] vVarArr) {
        int a2 = a(iVar, vVar);
        if (vVarArr.length == 1) {
            return a2;
        }
        for (v vVar2 : vVarArr) {
            if (iVar.a(vVar, vVar2).f11430d != 0) {
                a2 = Math.max(a2, a(iVar, vVar2));
            }
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public int a(k kVar, v vVar) throws l.b {
        if (!u.a(vVar.l)) {
            return as.CC.b(0);
        }
        int i2 = ai.f13525a >= 21 ? 32 : 0;
        boolean z = vVar.E != 0;
        boolean c2 = c(vVar);
        int i3 = 8;
        int i4 = 4;
        if (c2 && this.f11314d.a(vVar) && (!z || l.a() != null)) {
            return as.CC.a(4, 8, i2);
        }
        if ("audio/raw".equals(vVar.l) && !this.f11314d.a(vVar)) {
            return as.CC.b(1);
        }
        if (!this.f11314d.a(ai.b(2, vVar.y, vVar.z))) {
            return as.CC.b(1);
        }
        List<i> a2 = a(kVar, vVar, false);
        if (a2.isEmpty()) {
            return as.CC.b(1);
        }
        if (!c2) {
            return as.CC.b(2);
        }
        i iVar = a2.get(0);
        boolean a3 = iVar.a(vVar);
        if (a3 && iVar.c(vVar)) {
            i3 = 16;
        }
        if (!a3) {
            i4 = 3;
        }
        return as.CC.a(i4, i3, i2);
    }

    /* access modifiers changed from: protected */
    public MediaFormat a(v vVar, String str, int i2, float f2) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", vVar.y);
        mediaFormat.setInteger("sample-rate", vVar.z);
        t.a(mediaFormat, vVar.n);
        t.a(mediaFormat, "max-input-size", i2);
        if (ai.f13525a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f && !S()) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (ai.f13525a <= 28 && "audio/ac4".equals(vVar.l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (ai.f13525a >= 24 && this.f11314d.b(ai.b(4, vVar.y, vVar.z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public com.applovin.exoplayer2.c.h a(i iVar, v vVar, v vVar2) {
        com.applovin.exoplayer2.c.h a2 = iVar.a(vVar, vVar2);
        int i2 = a2.f11431e;
        if (a(iVar, vVar2) > this.f11315e) {
            i2 |= 64;
        }
        int i3 = i2;
        return new com.applovin.exoplayer2.c.h(iVar.f12544a, vVar, vVar2, i3 != 0 ? 0 : a2.f11430d, i3);
    }

    /* access modifiers changed from: protected */
    public com.applovin.exoplayer2.c.h a(w wVar) throws p {
        com.applovin.exoplayer2.c.h a2 = super.a(wVar);
        this.f11313c.a(wVar.f13939b, a2);
        return a2;
    }

    /* access modifiers changed from: protected */
    public g.a a(i iVar, v vVar, MediaCrypto mediaCrypto, float f2) {
        this.f11315e = a(iVar, vVar, u());
        this.f11316f = b(iVar.f12544a);
        MediaFormat a2 = a(vVar, iVar.f12546c, this.f11315e, f2);
        this.f11317g = "audio/raw".equals(iVar.f12545b) && !"audio/raw".equals(vVar.l) ? vVar : null;
        return g.a.a(iVar, a2, vVar, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    public List<i> a(k kVar, v vVar, boolean z) throws l.b {
        i a2;
        String str = vVar.l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f11314d.a(vVar) && (a2 = l.a()) != null) {
            return Collections.singletonList(a2);
        }
        List<i> a3 = l.a(kVar.getDecoderInfos(str, z, false), vVar);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(a3);
            arrayList.addAll(kVar.getDecoderInfos("audio/eac3", z, false));
            a3 = arrayList;
        }
        return Collections.unmodifiableList(a3);
    }

    public void a(int i2, Object obj) throws p {
        if (i2 == 2) {
            this.f11314d.a(((Float) obj).floatValue());
        } else if (i2 == 3) {
            this.f11314d.a((d) obj);
        } else if (i2 != 6) {
            switch (i2) {
                case 9:
                    this.f11314d.b(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f11314d.a(((Integer) obj).intValue());
                    return;
                case 11:
                    this.m = (ar.a) obj;
                    return;
                default:
                    super.a(i2, obj);
                    return;
            }
        } else {
            this.f11314d.a((k) obj);
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z) throws p {
        super.a(j2, z);
        if (this.l) {
            this.f11314d.k();
        } else {
            this.f11314d.j();
        }
        this.f11318h = j2;
        this.i = true;
        this.j = true;
    }

    public void a(am amVar) {
        this.f11314d.a(amVar);
    }

    /* access modifiers changed from: protected */
    public void a(com.applovin.exoplayer2.c.g gVar) {
        if (this.i && !gVar.b()) {
            if (Math.abs(gVar.f11421d - this.f11318h) > 500000) {
                this.f11318h = gVar.f11421d;
            }
            this.i = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093 A[LOOP:0: B:26:0x008f->B:28:0x0093, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.exoplayer2.v r6, android.media.MediaFormat r7) throws com.applovin.exoplayer2.p {
        /*
            r5 = this;
            com.applovin.exoplayer2.v r0 = r5.f11317g
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0009
            r6 = r0
            goto L_0x0099
        L_0x0009:
            com.applovin.exoplayer2.f.g r0 = r5.G()
            if (r0 != 0) goto L_0x0011
            goto L_0x0099
        L_0x0011:
            java.lang.String r0 = r6.l
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
        L_0x001b:
            int r0 = r6.A
            goto L_0x004c
        L_0x001e:
            int r0 = com.applovin.exoplayer2.l.ai.f13525a
            r4 = 24
            if (r0 < r4) goto L_0x0031
            java.lang.String r0 = "pcm-encoding"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L_0x0031
            int r0 = r7.getInteger(r0)
            goto L_0x004c
        L_0x0031:
            java.lang.String r0 = "v-bits-per-sample"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L_0x0042
            int r0 = r7.getInteger(r0)
            int r0 = com.applovin.exoplayer2.l.ai.c((int) r0)
            goto L_0x004c
        L_0x0042:
            java.lang.String r0 = r6.l
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x004b
            goto L_0x001b
        L_0x004b:
            r0 = 2
        L_0x004c:
            com.applovin.exoplayer2.v$a r4 = new com.applovin.exoplayer2.v$a
            r4.<init>()
            com.applovin.exoplayer2.v$a r3 = r4.f((java.lang.String) r3)
            com.applovin.exoplayer2.v$a r0 = r3.m((int) r0)
            int r3 = r6.B
            com.applovin.exoplayer2.v$a r0 = r0.n((int) r3)
            int r3 = r6.C
            com.applovin.exoplayer2.v$a r0 = r0.o((int) r3)
            java.lang.String r3 = "channel-count"
            int r3 = r7.getInteger(r3)
            com.applovin.exoplayer2.v$a r0 = r0.k((int) r3)
            java.lang.String r3 = "sample-rate"
            int r7 = r7.getInteger(r3)
            com.applovin.exoplayer2.v$a r7 = r0.l((int) r7)
            com.applovin.exoplayer2.v r7 = r7.a()
            boolean r0 = r5.f11316f
            if (r0 == 0) goto L_0x0098
            int r0 = r7.y
            r3 = 6
            if (r0 != r3) goto L_0x0098
            int r0 = r6.y
            if (r0 >= r3) goto L_0x0098
            int r0 = r6.y
            int[] r2 = new int[r0]
            r0 = 0
        L_0x008f:
            int r3 = r6.y
            if (r0 >= r3) goto L_0x0098
            r2[r0] = r0
            int r0 = r0 + 1
            goto L_0x008f
        L_0x0098:
            r6 = r7
        L_0x0099:
            com.applovin.exoplayer2.b.h r7 = r5.f11314d     // Catch:{ a -> 0x009f }
            r7.a((com.applovin.exoplayer2.v) r6, (int) r1, (int[]) r2)     // Catch:{ a -> 0x009f }
            return
        L_0x009f:
            r6 = move-exception
            com.applovin.exoplayer2.v r7 = r6.f11235a
            r0 = 5001(0x1389, float:7.008E-42)
            com.applovin.exoplayer2.p r6 = r5.a((java.lang.Throwable) r6, (com.applovin.exoplayer2.v) r7, (int) r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.q.a(com.applovin.exoplayer2.v, android.media.MediaFormat):void");
    }

    /* access modifiers changed from: protected */
    public void a(Exception exc) {
        com.applovin.exoplayer2.l.q.c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f11313c.b(exc);
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        this.f11313c.a(str);
    }

    /* access modifiers changed from: protected */
    public void a(String str, long j2, long j3) {
        this.f11313c.a(str, j2, j3);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z, boolean z2) throws p {
        super.a(z, z2);
        this.f11313c.a(this.f12553a);
        if (v().f11139b) {
            this.f11314d.g();
        } else {
            this.f11314d.h();
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(long j2, long j3, com.applovin.exoplayer2.f.g gVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, v vVar) throws p {
        com.applovin.exoplayer2.l.a.b(byteBuffer);
        if (this.f11317g != null && (i3 & 2) != 0) {
            ((com.applovin.exoplayer2.f.g) com.applovin.exoplayer2.l.a.b(gVar)).a(i2, false);
            return true;
        } else if (z) {
            if (gVar != null) {
                gVar.a(i2, false);
            }
            this.f12553a.f11415f += i4;
            this.f11314d.b();
            return true;
        } else {
            try {
                if (!this.f11314d.a(byteBuffer, j4, i4)) {
                    return false;
                }
                if (gVar != null) {
                    gVar.a(i2, false);
                }
                this.f12553a.f11414e += i4;
                return true;
            } catch (h.b e2) {
                throw a((Throwable) e2, e2.f11238c, e2.f11237b, (int) IronSourceConstants.errorCode_biddingDataException);
            } catch (h.e e3) {
                throw a((Throwable) e3, vVar, e3.f11242b, (int) IronSourceConstants.errorCode_isReadyException);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(v vVar) {
        return this.f11314d.a(vVar);
    }

    public s c() {
        return this;
    }

    public long c_() {
        if (d_() == 2) {
            R();
        }
        return this.f11318h;
    }

    public am d() {
        return this.f11314d.f();
    }

    /* access modifiers changed from: protected */
    public void p() {
        super.p();
        this.f11314d.a();
    }

    /* access modifiers changed from: protected */
    public void q() {
        R();
        this.f11314d.i();
        super.q();
    }

    /* access modifiers changed from: protected */
    public void r() {
        this.k = true;
        try {
            this.f11314d.j();
            try {
                super.r();
            } finally {
                this.f11313c.b(this.f12553a);
            }
        } catch (Throwable th) {
            super.r();
            throw th;
        } finally {
            this.f11313c.b(this.f12553a);
        }
    }

    /* access modifiers changed from: protected */
    public void s() {
        try {
            super.s();
        } finally {
            if (this.k) {
                this.k = false;
                this.f11314d.l();
            }
        }
    }

    public String y() {
        return "MediaCodecAudioRenderer";
    }

    public boolean z() {
        return this.f11314d.e() || super.z();
    }
}
