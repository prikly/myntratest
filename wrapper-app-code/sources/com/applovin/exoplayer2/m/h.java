package com.applovin.exoplayer2.m;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.f.i;
import com.applovin.exoplayer2.f.j;
import com.applovin.exoplayer2.f.k;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.t;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.m.n;
import com.applovin.exoplayer2.p;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import com.google.android.gms.common.Scopes;
import com.onesignal.OneSignalRemoteParams;
import com.unity3d.services.core.device.MimeTypes;
import io.bidmachine.utils.IabUtils;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public class h extends j {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f13710c = {1920, 1600, OneSignalRemoteParams.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW, 1280, 960, 854, 640, 540, 480};

    /* renamed from: d  reason: collision with root package name */
    private static boolean f13711d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f13712e;
    private int A;
    private long B;
    private long C;
    private long D;
    private int E;
    private int F;
    private int G;
    private int H;
    private float I;
    private o J;
    private boolean K;
    private int L;
    private l M;

    /* renamed from: b  reason: collision with root package name */
    b f13713b;

    /* renamed from: f  reason: collision with root package name */
    private final Context f13714f;

    /* renamed from: g  reason: collision with root package name */
    private final m f13715g;

    /* renamed from: h  reason: collision with root package name */
    private final n.a f13716h;
    private final long i;
    private final int j;
    private final boolean k;
    private a l;
    private boolean m;
    private boolean n;
    private Surface o;
    private d p;
    private boolean q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private long v;
    private long w;
    private long x;
    private int y;
    private int z;

    protected static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13717a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13718b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13719c;

        public a(int i, int i2, int i3) {
            this.f13717a = i;
            this.f13718b = i2;
            this.f13719c = i3;
        }
    }

    private final class b implements Handler.Callback, g.c {

        /* renamed from: b  reason: collision with root package name */
        private final Handler f13721b;

        public b(g gVar) {
            Handler a2 = ai.a((Handler.Callback) this);
            this.f13721b = a2;
            gVar.a((g.c) this, a2);
        }

        private void a(long j) {
            if (this == h.this.f13713b) {
                if (j == Long.MAX_VALUE) {
                    h.this.R();
                    return;
                }
                try {
                    h.this.e(j);
                } catch (p e2) {
                    h.this.a(e2);
                }
            }
        }

        public void a(g gVar, long j, long j2) {
            if (ai.f13525a < 30) {
                this.f13721b.sendMessageAtFrontOfQueue(Message.obtain(this.f13721b, 0, (int) (j >> 32), (int) j));
                return;
            }
            a(j);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(ai.b(message.arg1, message.arg2));
            return true;
        }
    }

    public h(Context context, g.b bVar, k kVar, long j2, boolean z2, Handler handler, n nVar, int i2) {
        super(2, bVar, kVar, z2, 30.0f);
        this.i = j2;
        this.j = i2;
        Context applicationContext = context.getApplicationContext();
        this.f13714f = applicationContext;
        this.f13715g = new m(applicationContext);
        this.f13716h = new n.a(handler, nVar);
        this.k = aa();
        this.w = -9223372036854775807L;
        this.F = -1;
        this.G = -1;
        this.I = -1.0f;
        this.r = 1;
        this.L = 0;
        V();
    }

    public h(Context context, k kVar, long j2, boolean z2, Handler handler, n nVar, int i2) {
        this(context, g.b.f12541a, kVar, j2, z2, handler, nVar, i2);
    }

    /* access modifiers changed from: private */
    public void R() {
        P();
    }

    private void S() {
        this.w = this.i > 0 ? SystemClock.elapsedRealtime() + this.i : -9223372036854775807L;
    }

    private void T() {
        g G2;
        this.s = false;
        if (ai.f13525a >= 23 && this.K && (G2 = G()) != null) {
            this.f13713b = new b(G2);
        }
    }

    private void U() {
        if (this.q) {
            this.f13716h.a((Object) this.o);
        }
    }

    private void V() {
        this.J = null;
    }

    private void W() {
        if (this.F != -1 || this.G != -1) {
            o oVar = this.J;
            if (oVar == null || oVar.f13758b != this.F || this.J.f13759c != this.G || this.J.f13760d != this.H || this.J.f13761e != this.I) {
                o oVar2 = new o(this.F, this.G, this.H, this.I);
                this.J = oVar2;
                this.f13716h.a(oVar2);
            }
        }
    }

    private void X() {
        o oVar = this.J;
        if (oVar != null) {
            this.f13716h.a(oVar);
        }
    }

    private void Y() {
        if (this.y > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f13716h.a(this.y, elapsedRealtime - this.x);
            this.y = 0;
            this.x = elapsedRealtime;
        }
    }

    private void Z() {
        int i2 = this.E;
        if (i2 != 0) {
            this.f13716h.a(this.D, i2);
            this.D = 0;
            this.E = 0;
        }
    }

    protected static int a(i iVar, v vVar) {
        if (vVar.m == -1) {
            return c(iVar, vVar);
        }
        int size = vVar.n.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += vVar.n.get(i3).length;
        }
        return vVar.m + i2;
    }

    private static List<i> a(k kVar, v vVar, boolean z2, boolean z3) throws l.b {
        Pair<Integer, Integer> a2;
        String str;
        String str2 = vVar.l;
        if (str2 == null) {
            return Collections.emptyList();
        }
        List<i> a3 = l.a(kVar.getDecoderInfos(str2, z2, z3), vVar);
        if ("video/dolby-vision".equals(str2) && (a2 = l.a(vVar)) != null) {
            int intValue = ((Integer) a2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                str = MimeTypes.VIDEO_H265;
            } else if (intValue == 512) {
                str = MimeTypes.VIDEO_H264;
            }
            a3.addAll(kVar.getDecoderInfos(str, z2, z3));
        }
        return Collections.unmodifiableList(a3);
    }

    private void a(long j2, long j3, v vVar) {
        l lVar = this.M;
        if (lVar != null) {
            lVar.a(j2, j3, vVar, H());
        }
    }

    private static void a(MediaFormat mediaFormat, int i2) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i2);
    }

    private static void a(g gVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        gVar.a(bundle);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.Object r5) throws com.applovin.exoplayer2.p {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.view.Surface
            if (r0 == 0) goto L_0x0007
            android.view.Surface r5 = (android.view.Surface) r5
            goto L_0x0008
        L_0x0007:
            r5 = 0
        L_0x0008:
            if (r5 != 0) goto L_0x0026
            com.applovin.exoplayer2.m.d r0 = r4.p
            if (r0 == 0) goto L_0x0010
            r5 = r0
            goto L_0x0026
        L_0x0010:
            com.applovin.exoplayer2.f.i r0 = r4.I()
            if (r0 == 0) goto L_0x0026
            boolean r1 = r4.b((com.applovin.exoplayer2.f.i) r0)
            if (r1 == 0) goto L_0x0026
            android.content.Context r5 = r4.f13714f
            boolean r0 = r0.f12550g
            com.applovin.exoplayer2.m.d r5 = com.applovin.exoplayer2.m.d.a(r5, r0)
            r4.p = r5
        L_0x0026:
            android.view.Surface r0 = r4.o
            if (r0 == r5) goto L_0x006e
            r4.o = r5
            com.applovin.exoplayer2.m.m r0 = r4.f13715g
            r0.a((android.view.Surface) r5)
            r0 = 0
            r4.q = r0
            int r0 = r4.d_()
            com.applovin.exoplayer2.f.g r1 = r4.G()
            if (r1 == 0) goto L_0x0054
            int r2 = com.applovin.exoplayer2.l.ai.f13525a
            r3 = 23
            if (r2 < r3) goto L_0x004e
            if (r5 == 0) goto L_0x004e
            boolean r2 = r4.m
            if (r2 != 0) goto L_0x004e
            r4.a((com.applovin.exoplayer2.f.g) r1, (android.view.Surface) r5)
            goto L_0x0054
        L_0x004e:
            r4.J()
            r4.E()
        L_0x0054:
            if (r5 == 0) goto L_0x0067
            com.applovin.exoplayer2.m.d r1 = r4.p
            if (r5 == r1) goto L_0x0067
            r4.X()
            r4.T()
            r5 = 2
            if (r0 != r5) goto L_0x007a
            r4.S()
            goto L_0x007a
        L_0x0067:
            r4.V()
            r4.T()
            goto L_0x007a
        L_0x006e:
            if (r5 == 0) goto L_0x007a
            com.applovin.exoplayer2.m.d r0 = r4.p
            if (r5 == r0) goto L_0x007a
            r4.X()
            r4.U()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.h.a(java.lang.Object):void");
    }

    private static boolean aa() {
        return "NVIDIA".equals(ai.f13527c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0343, code lost:
        if (r0.equals("602LV") != false) goto L_0x0705;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean ab() {
        /*
            int r0 = com.applovin.exoplayer2.l.ai.f13525a
            r1 = 4
            r2 = 5
            r3 = 3
            r4 = 6
            r5 = 28
            r6 = -1
            r7 = 2
            r8 = 0
            r9 = 1
            if (r0 > r5) goto L_0x0064
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f13526b
            int r10 = r0.hashCode()
            switch(r10) {
                case -1339091551: goto L_0x0054;
                case -1220081023: goto L_0x004a;
                case -1220066608: goto L_0x0040;
                case -1012436106: goto L_0x0036;
                case -64886864: goto L_0x002c;
                case 3415681: goto L_0x0022;
                case 825323514: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x005e
        L_0x0018:
            java.lang.String r10 = "machuca"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 4
            goto L_0x005f
        L_0x0022:
            java.lang.String r10 = "once"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 5
            goto L_0x005f
        L_0x002c:
            java.lang.String r10 = "magnolia"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 3
            goto L_0x005f
        L_0x0036:
            java.lang.String r10 = "oneday"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 6
            goto L_0x005f
        L_0x0040:
            java.lang.String r10 = "dangalUHD"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x004a:
            java.lang.String r10 = "dangalFHD"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 2
            goto L_0x005f
        L_0x0054:
            java.lang.String r10 = "dangal"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x005e
            r0 = 0
            goto L_0x005f
        L_0x005e:
            r0 = -1
        L_0x005f:
            switch(r0) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0063;
                case 2: goto L_0x0063;
                case 3: goto L_0x0063;
                case 4: goto L_0x0063;
                case 5: goto L_0x0063;
                case 6: goto L_0x0063;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x0064
        L_0x0063:
            return r9
        L_0x0064:
            int r0 = com.applovin.exoplayer2.l.ai.f13525a
            r10 = 27
            if (r0 > r10) goto L_0x0075
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f13526b
            java.lang.String r11 = "HWEML"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0075
            return r9
        L_0x0075:
            int r0 = com.applovin.exoplayer2.l.ai.f13525a
            r11 = 26
            if (r0 > r11) goto L_0x0745
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f13526b
            int r12 = r0.hashCode()
            switch(r12) {
                case -2144781245: goto L_0x06f9;
                case -2144781185: goto L_0x06ee;
                case -2144781160: goto L_0x06e3;
                case -2097309513: goto L_0x06d8;
                case -2022874474: goto L_0x06cd;
                case -1978993182: goto L_0x06c2;
                case -1978990237: goto L_0x06b7;
                case -1936688988: goto L_0x06ac;
                case -1936688066: goto L_0x06a1;
                case -1936688065: goto L_0x0695;
                case -1931988508: goto L_0x0689;
                case -1885099851: goto L_0x067d;
                case -1696512866: goto L_0x0671;
                case -1680025915: goto L_0x0665;
                case -1615810839: goto L_0x0659;
                case -1600724499: goto L_0x064d;
                case -1554255044: goto L_0x0641;
                case -1481772737: goto L_0x0635;
                case -1481772730: goto L_0x0629;
                case -1481772729: goto L_0x061d;
                case -1320080169: goto L_0x0611;
                case -1217592143: goto L_0x0605;
                case -1180384755: goto L_0x05f9;
                case -1139198265: goto L_0x05ed;
                case -1052835013: goto L_0x05e1;
                case -993250464: goto L_0x05d6;
                case -993250458: goto L_0x05cb;
                case -965403638: goto L_0x05bf;
                case -958336948: goto L_0x05b3;
                case -879245230: goto L_0x05a7;
                case -842500323: goto L_0x059b;
                case -821392978: goto L_0x058f;
                case -797483286: goto L_0x0583;
                case -794946968: goto L_0x0577;
                case -788334647: goto L_0x056b;
                case -782144577: goto L_0x055f;
                case -575125681: goto L_0x0553;
                case -521118391: goto L_0x0547;
                case -430914369: goto L_0x053b;
                case -290434366: goto L_0x052f;
                case -282781963: goto L_0x0523;
                case -277133239: goto L_0x0517;
                case -173639913: goto L_0x050b;
                case -56598463: goto L_0x04ff;
                case 2126: goto L_0x04f3;
                case 2564: goto L_0x04e7;
                case 2715: goto L_0x04db;
                case 2719: goto L_0x04cf;
                case 3091: goto L_0x04c3;
                case 3483: goto L_0x04b7;
                case 73405: goto L_0x04ab;
                case 75537: goto L_0x049f;
                case 75739: goto L_0x0493;
                case 76779: goto L_0x0487;
                case 78669: goto L_0x047b;
                case 79305: goto L_0x046f;
                case 80618: goto L_0x0463;
                case 88274: goto L_0x0457;
                case 98846: goto L_0x044b;
                case 98848: goto L_0x043f;
                case 99329: goto L_0x0433;
                case 101481: goto L_0x0427;
                case 1513190: goto L_0x041c;
                case 1514184: goto L_0x0411;
                case 1514185: goto L_0x0406;
                case 2133089: goto L_0x03fa;
                case 2133091: goto L_0x03ee;
                case 2133120: goto L_0x03e2;
                case 2133151: goto L_0x03d6;
                case 2133182: goto L_0x03ca;
                case 2133184: goto L_0x03be;
                case 2436959: goto L_0x03b2;
                case 2463773: goto L_0x03a6;
                case 2464648: goto L_0x039a;
                case 2689555: goto L_0x038e;
                case 3154429: goto L_0x0382;
                case 3284551: goto L_0x0376;
                case 3351335: goto L_0x036a;
                case 3386211: goto L_0x035e;
                case 41325051: goto L_0x0352;
                case 51349633: goto L_0x0347;
                case 51350594: goto L_0x033d;
                case 55178625: goto L_0x0331;
                case 61542055: goto L_0x0326;
                case 65355429: goto L_0x031a;
                case 66214468: goto L_0x030e;
                case 66214470: goto L_0x0302;
                case 66214473: goto L_0x02f6;
                case 66215429: goto L_0x02ea;
                case 66215431: goto L_0x02de;
                case 66215433: goto L_0x02d2;
                case 66216390: goto L_0x02c6;
                case 76402249: goto L_0x02ba;
                case 76404105: goto L_0x02ae;
                case 76404911: goto L_0x02a2;
                case 80963634: goto L_0x0296;
                case 82882791: goto L_0x028a;
                case 98715550: goto L_0x027e;
                case 101370885: goto L_0x0272;
                case 102844228: goto L_0x0266;
                case 165221241: goto L_0x025a;
                case 182191441: goto L_0x024e;
                case 245388979: goto L_0x0242;
                case 287431619: goto L_0x0236;
                case 307593612: goto L_0x022a;
                case 308517133: goto L_0x021e;
                case 316215098: goto L_0x0212;
                case 316215116: goto L_0x0206;
                case 316246811: goto L_0x01fa;
                case 316246818: goto L_0x01ee;
                case 407160593: goto L_0x01e2;
                case 507412548: goto L_0x01d6;
                case 793982701: goto L_0x01ca;
                case 794038622: goto L_0x01be;
                case 794040393: goto L_0x01b2;
                case 835649806: goto L_0x01a6;
                case 917340916: goto L_0x019a;
                case 958008161: goto L_0x018e;
                case 1060579533: goto L_0x0182;
                case 1150207623: goto L_0x0176;
                case 1176899427: goto L_0x016a;
                case 1280332038: goto L_0x015e;
                case 1306947716: goto L_0x0152;
                case 1349174697: goto L_0x0146;
                case 1522194893: goto L_0x013a;
                case 1691543273: goto L_0x012e;
                case 1691544261: goto L_0x0122;
                case 1709443163: goto L_0x0116;
                case 1865889110: goto L_0x010a;
                case 1906253259: goto L_0x00fe;
                case 1977196784: goto L_0x00f2;
                case 2006372676: goto L_0x00e6;
                case 2019281702: goto L_0x00da;
                case 2029784656: goto L_0x00ce;
                case 2030379515: goto L_0x00c2;
                case 2033393791: goto L_0x00b6;
                case 2047190025: goto L_0x00aa;
                case 2047252157: goto L_0x009e;
                case 2048319463: goto L_0x0092;
                case 2048855701: goto L_0x0086;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x0704
        L_0x0086:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 66
            goto L_0x0705
        L_0x0092:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 65
            goto L_0x0705
        L_0x009e:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 33
            goto L_0x0705
        L_0x00aa:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 32
            goto L_0x0705
        L_0x00b6:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 14
            goto L_0x0705
        L_0x00c2:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 64
            goto L_0x0705
        L_0x00ce:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 63
            goto L_0x0705
        L_0x00da:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 29
            goto L_0x0705
        L_0x00e6:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 19
            goto L_0x0705
        L_0x00f2:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 69
            goto L_0x0705
        L_0x00fe:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 100
            goto L_0x0705
        L_0x010a:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x0705
        L_0x0116:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 68
            goto L_0x0705
        L_0x0122:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 24
            goto L_0x0705
        L_0x012e:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 23
            goto L_0x0705
        L_0x013a:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 133(0x85, float:1.86E-43)
            goto L_0x0705
        L_0x0146:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 61
            goto L_0x0705
        L_0x0152:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 35
            goto L_0x0705
        L_0x015e:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 62
            goto L_0x0705
        L_0x016a:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 71
            goto L_0x0705
        L_0x0176:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 78
            goto L_0x0705
        L_0x0182:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 96
            goto L_0x0705
        L_0x018e:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 72
            goto L_0x0705
        L_0x019a:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 10
            goto L_0x0705
        L_0x01a6:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 81
            goto L_0x0705
        L_0x01b2:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 59
            goto L_0x0705
        L_0x01be:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 58
            goto L_0x0705
        L_0x01ca:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 57
            goto L_0x0705
        L_0x01d6:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x0705
        L_0x01e2:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x0705
        L_0x01ee:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 125(0x7d, float:1.75E-43)
            goto L_0x0705
        L_0x01fa:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x0705
        L_0x0206:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x0705
        L_0x0212:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x0705
        L_0x021e:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 12
            goto L_0x0705
        L_0x022a:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 11
            goto L_0x0705
        L_0x0236:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 60
            goto L_0x0705
        L_0x0242:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 82
            goto L_0x0705
        L_0x024e:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 25
            goto L_0x0705
        L_0x025a:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 8
            goto L_0x0705
        L_0x0266:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 77
            goto L_0x0705
        L_0x0272:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 76
            goto L_0x0705
        L_0x027e:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 67
            goto L_0x0705
        L_0x028a:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 135(0x87, float:1.89E-43)
            goto L_0x0705
        L_0x0296:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0705
        L_0x02a2:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x0705
        L_0x02ae:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x0705
        L_0x02ba:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x0705
        L_0x02c6:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 48
            goto L_0x0705
        L_0x02d2:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 47
            goto L_0x0705
        L_0x02de:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 46
            goto L_0x0705
        L_0x02ea:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 45
            goto L_0x0705
        L_0x02f6:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 44
            goto L_0x0705
        L_0x0302:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 43
            goto L_0x0705
        L_0x030e:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 42
            goto L_0x0705
        L_0x031a:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 30
            goto L_0x0705
        L_0x0326:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 7
            goto L_0x0705
        L_0x0331:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 15
            goto L_0x0705
        L_0x033d:
            java.lang.String r2 = "602LV"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0704
            goto L_0x0705
        L_0x0347:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 3
            goto L_0x0705
        L_0x0352:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 83
            goto L_0x0705
        L_0x035e:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 92
            goto L_0x0705
        L_0x036a:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 85
            goto L_0x0705
        L_0x0376:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 75
            goto L_0x0705
        L_0x0382:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 50
            goto L_0x0705
        L_0x038e:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 136(0x88, float:1.9E-43)
            goto L_0x0705
        L_0x039a:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x0705
        L_0x03a6:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x0705
        L_0x03b2:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 93
            goto L_0x0705
        L_0x03be:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 41
            goto L_0x0705
        L_0x03ca:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 40
            goto L_0x0705
        L_0x03d6:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 39
            goto L_0x0705
        L_0x03e2:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 38
            goto L_0x0705
        L_0x03ee:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 37
            goto L_0x0705
        L_0x03fa:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 36
            goto L_0x0705
        L_0x0406:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 2
            goto L_0x0705
        L_0x0411:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 1
            goto L_0x0705
        L_0x041c:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 0
            goto L_0x0705
        L_0x0427:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 49
            goto L_0x0705
        L_0x0433:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 28
            goto L_0x0705
        L_0x043f:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 27
            goto L_0x0705
        L_0x044b:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 26
            goto L_0x0705
        L_0x0457:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 139(0x8b, float:1.95E-43)
            goto L_0x0705
        L_0x0463:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x0705
        L_0x046f:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x0705
        L_0x047b:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 94
            goto L_0x0705
        L_0x0487:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 86
            goto L_0x0705
        L_0x0493:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 80
            goto L_0x0705
        L_0x049f:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 79
            goto L_0x0705
        L_0x04ab:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 73
            goto L_0x0705
        L_0x04b7:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 84
            goto L_0x0705
        L_0x04c3:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 16
            goto L_0x0705
        L_0x04cf:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 129(0x81, float:1.81E-43)
            goto L_0x0705
        L_0x04db:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 127(0x7f, float:1.78E-43)
            goto L_0x0705
        L_0x04e7:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x0705
        L_0x04f3:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 20
            goto L_0x0705
        L_0x04ff:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 134(0x86, float:1.88E-43)
            goto L_0x0705
        L_0x050b:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 31
            goto L_0x0705
        L_0x0517:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 138(0x8a, float:1.93E-43)
            goto L_0x0705
        L_0x0523:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 17
            goto L_0x0705
        L_0x052f:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x0705
        L_0x053b:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x0705
        L_0x0547:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 53
            goto L_0x0705
        L_0x0553:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 51
            goto L_0x0705
        L_0x055f:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 91
            goto L_0x0705
        L_0x056b:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 132(0x84, float:1.85E-43)
            goto L_0x0705
        L_0x0577:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 131(0x83, float:1.84E-43)
            goto L_0x0705
        L_0x0583:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x0705
        L_0x058f:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 9
            goto L_0x0705
        L_0x059b:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 88
            goto L_0x0705
        L_0x05a7:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 126(0x7e, float:1.77E-43)
            goto L_0x0705
        L_0x05b3:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 34
            goto L_0x0705
        L_0x05bf:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x0705
        L_0x05cb:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 6
            goto L_0x0705
        L_0x05d6:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 5
            goto L_0x0705
        L_0x05e1:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 87
            goto L_0x0705
        L_0x05ed:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x0705
        L_0x05f9:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 70
            goto L_0x0705
        L_0x0605:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 18
            goto L_0x0705
        L_0x0611:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 52
            goto L_0x0705
        L_0x061d:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 99
            goto L_0x0705
        L_0x0629:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 98
            goto L_0x0705
        L_0x0635:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 97
            goto L_0x0705
        L_0x0641:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x0705
        L_0x064d:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 95
            goto L_0x0705
        L_0x0659:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x0705
        L_0x0665:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 21
            goto L_0x0705
        L_0x0671:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 137(0x89, float:1.92E-43)
            goto L_0x0705
        L_0x067d:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x0705
        L_0x0689:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 13
            goto L_0x0705
        L_0x0695:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x0705
        L_0x06a1:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x0705
        L_0x06ac:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x0705
        L_0x06b7:
            java.lang.String r1 = "NX573J"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 90
            goto L_0x0705
        L_0x06c2:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 89
            goto L_0x0705
        L_0x06cd:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 22
            goto L_0x0705
        L_0x06d8:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 74
            goto L_0x0705
        L_0x06e3:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 56
            goto L_0x0705
        L_0x06ee:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 55
            goto L_0x0705
        L_0x06f9:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0704
            r1 = 54
            goto L_0x0705
        L_0x0704:
            r1 = -1
        L_0x0705:
            switch(r1) {
                case 0: goto L_0x070f;
                case 1: goto L_0x070f;
                case 2: goto L_0x070f;
                case 3: goto L_0x070f;
                case 4: goto L_0x070f;
                case 5: goto L_0x070f;
                case 6: goto L_0x070f;
                case 7: goto L_0x070f;
                case 8: goto L_0x070f;
                case 9: goto L_0x070f;
                case 10: goto L_0x070f;
                case 11: goto L_0x070f;
                case 12: goto L_0x070f;
                case 13: goto L_0x070f;
                case 14: goto L_0x070f;
                case 15: goto L_0x070f;
                case 16: goto L_0x070f;
                case 17: goto L_0x070f;
                case 18: goto L_0x070f;
                case 19: goto L_0x070f;
                case 20: goto L_0x070f;
                case 21: goto L_0x070f;
                case 22: goto L_0x070f;
                case 23: goto L_0x070f;
                case 24: goto L_0x070f;
                case 25: goto L_0x070f;
                case 26: goto L_0x070f;
                case 27: goto L_0x070f;
                case 28: goto L_0x070f;
                case 29: goto L_0x070f;
                case 30: goto L_0x070f;
                case 31: goto L_0x070f;
                case 32: goto L_0x070f;
                case 33: goto L_0x070f;
                case 34: goto L_0x070f;
                case 35: goto L_0x070f;
                case 36: goto L_0x070f;
                case 37: goto L_0x070f;
                case 38: goto L_0x070f;
                case 39: goto L_0x070f;
                case 40: goto L_0x070f;
                case 41: goto L_0x070f;
                case 42: goto L_0x070f;
                case 43: goto L_0x070f;
                case 44: goto L_0x070f;
                case 45: goto L_0x070f;
                case 46: goto L_0x070f;
                case 47: goto L_0x070f;
                case 48: goto L_0x070f;
                case 49: goto L_0x070f;
                case 50: goto L_0x070f;
                case 51: goto L_0x070f;
                case 52: goto L_0x070f;
                case 53: goto L_0x070f;
                case 54: goto L_0x070f;
                case 55: goto L_0x070f;
                case 56: goto L_0x070f;
                case 57: goto L_0x070f;
                case 58: goto L_0x070f;
                case 59: goto L_0x070f;
                case 60: goto L_0x070f;
                case 61: goto L_0x070f;
                case 62: goto L_0x070f;
                case 63: goto L_0x070f;
                case 64: goto L_0x070f;
                case 65: goto L_0x070f;
                case 66: goto L_0x070f;
                case 67: goto L_0x070f;
                case 68: goto L_0x070f;
                case 69: goto L_0x070f;
                case 70: goto L_0x070f;
                case 71: goto L_0x070f;
                case 72: goto L_0x070f;
                case 73: goto L_0x070f;
                case 74: goto L_0x070f;
                case 75: goto L_0x070f;
                case 76: goto L_0x070f;
                case 77: goto L_0x070f;
                case 78: goto L_0x070f;
                case 79: goto L_0x070f;
                case 80: goto L_0x070f;
                case 81: goto L_0x070f;
                case 82: goto L_0x070f;
                case 83: goto L_0x070f;
                case 84: goto L_0x070f;
                case 85: goto L_0x070f;
                case 86: goto L_0x070f;
                case 87: goto L_0x070f;
                case 88: goto L_0x070f;
                case 89: goto L_0x070f;
                case 90: goto L_0x070f;
                case 91: goto L_0x070f;
                case 92: goto L_0x070f;
                case 93: goto L_0x070f;
                case 94: goto L_0x070f;
                case 95: goto L_0x070f;
                case 96: goto L_0x070f;
                case 97: goto L_0x070f;
                case 98: goto L_0x070f;
                case 99: goto L_0x070f;
                case 100: goto L_0x070f;
                case 101: goto L_0x070f;
                case 102: goto L_0x070f;
                case 103: goto L_0x070f;
                case 104: goto L_0x070f;
                case 105: goto L_0x070f;
                case 106: goto L_0x070f;
                case 107: goto L_0x070f;
                case 108: goto L_0x070f;
                case 109: goto L_0x070f;
                case 110: goto L_0x070f;
                case 111: goto L_0x070f;
                case 112: goto L_0x070f;
                case 113: goto L_0x070f;
                case 114: goto L_0x070f;
                case 115: goto L_0x070f;
                case 116: goto L_0x070f;
                case 117: goto L_0x070f;
                case 118: goto L_0x070f;
                case 119: goto L_0x070f;
                case 120: goto L_0x070f;
                case 121: goto L_0x070f;
                case 122: goto L_0x070f;
                case 123: goto L_0x070f;
                case 124: goto L_0x070f;
                case 125: goto L_0x070f;
                case 126: goto L_0x070f;
                case 127: goto L_0x070f;
                case 128: goto L_0x070f;
                case 129: goto L_0x070f;
                case 130: goto L_0x070f;
                case 131: goto L_0x070f;
                case 132: goto L_0x070f;
                case 133: goto L_0x070f;
                case 134: goto L_0x070f;
                case 135: goto L_0x070f;
                case 136: goto L_0x070f;
                case 137: goto L_0x070f;
                case 138: goto L_0x070f;
                case 139: goto L_0x070f;
                default: goto L_0x0708;
            }
        L_0x0708:
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f13528d
            int r1 = r0.hashCode()
            goto L_0x0710
        L_0x070f:
            return r9
        L_0x0710:
            r2 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r1 == r2) goto L_0x0734
            r2 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r1 == r2) goto L_0x072a
            r2 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r1 == r2) goto L_0x0720
            goto L_0x073d
        L_0x0720:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x073d
            r6 = 1
            goto L_0x073d
        L_0x072a:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x073d
            r6 = 0
            goto L_0x073d
        L_0x0734:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x073d
            r6 = 2
        L_0x073d:
            if (r6 == 0) goto L_0x0744
            if (r6 == r9) goto L_0x0744
            if (r6 == r7) goto L_0x0744
            goto L_0x0745
        L_0x0744:
            return r9
        L_0x0745:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.h.ab():boolean");
    }

    private static Point b(i iVar, v vVar) {
        boolean z2 = vVar.r > vVar.q;
        int i2 = z2 ? vVar.r : vVar.q;
        int i3 = z2 ? vVar.q : vVar.r;
        float f2 = ((float) i3) / ((float) i2);
        for (int i4 : f13710c) {
            int i5 = (int) (((float) i4) * f2);
            if (i4 <= i2 || i5 <= i3) {
                break;
            }
            if (ai.f13525a >= 21) {
                int i6 = z2 ? i5 : i4;
                if (!z2) {
                    i4 = i5;
                }
                Point a2 = iVar.a(i6, i4);
                if (iVar.a(a2.x, a2.y, (double) vVar.s)) {
                    return a2;
                }
            } else {
                try {
                    int a3 = ai.a(i4, 16) * 16;
                    int a4 = ai.a(i5, 16) * 16;
                    if (a3 * a4 <= l.b()) {
                        int i7 = z2 ? a4 : a3;
                        if (!z2) {
                            a3 = a4;
                        }
                        return new Point(i7, a3);
                    }
                } catch (l.b unused) {
                }
            }
        }
        return null;
    }

    private boolean b(i iVar) {
        return ai.f13525a >= 23 && !this.K && !b(iVar.f12544a) && (!iVar.f12550g || d.a(this.f13714f));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r12 = ((java.lang.Integer) r12.first).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(com.applovin.exoplayer2.f.i r11, com.applovin.exoplayer2.v r12) {
        /*
            int r0 = r12.q
            int r1 = r12.r
            r2 = -1
            if (r0 == r2) goto L_0x00d0
            if (r1 != r2) goto L_0x000b
            goto L_0x00d0
        L_0x000b:
            java.lang.String r3 = r12.l
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r12 = com.applovin.exoplayer2.f.l.a((com.applovin.exoplayer2.v) r12)
            if (r12 == 0) goto L_0x0033
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r12 == r3) goto L_0x0031
            if (r12 == r7) goto L_0x0031
            if (r12 != r8) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = r6
        L_0x0034:
            int r12 = r3.hashCode()
            r4 = 5
            r9 = 4
            r10 = 3
            switch(r12) {
                case -1664118616: goto L_0x006d;
                case -1662541442: goto L_0x0065;
                case 1187890754: goto L_0x005b;
                case 1331836730: goto L_0x0053;
                case 1599127256: goto L_0x0049;
                case 1599127257: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0077
        L_0x003f:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 5
            goto L_0x0078
        L_0x0049:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 3
            goto L_0x0078
        L_0x0053:
            boolean r12 = r3.equals(r5)
            if (r12 == 0) goto L_0x0077
            r12 = 2
            goto L_0x0078
        L_0x005b:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 1
            goto L_0x0078
        L_0x0065:
            boolean r12 = r3.equals(r6)
            if (r12 == 0) goto L_0x0077
            r12 = 4
            goto L_0x0078
        L_0x006d:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 0
            goto L_0x0078
        L_0x0077:
            r12 = -1
        L_0x0078:
            if (r12 == 0) goto L_0x00c7
            if (r12 == r7) goto L_0x00c7
            if (r12 == r8) goto L_0x0088
            if (r12 == r10) goto L_0x00c7
            if (r12 == r9) goto L_0x0085
            if (r12 == r4) goto L_0x0085
            return r2
        L_0x0085:
            int r0 = r0 * r1
            goto L_0x00ca
        L_0x0088:
            java.lang.String r12 = com.applovin.exoplayer2.l.ai.f13528d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x00c6
            java.lang.String r12 = com.applovin.exoplayer2.l.ai.f13527c
            java.lang.String r3 = "Amazon"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00b5
            java.lang.String r12 = com.applovin.exoplayer2.l.ai.f13528d
            java.lang.String r3 = "KFSOWI"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L_0x00c6
            java.lang.String r12 = com.applovin.exoplayer2.l.ai.f13528d
            java.lang.String r3 = "AFTS"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00b5
            boolean r11 = r11.f12550g
            if (r11 == 0) goto L_0x00b5
            goto L_0x00c6
        L_0x00b5:
            r11 = 16
            int r12 = com.applovin.exoplayer2.l.ai.a((int) r0, (int) r11)
            int r0 = com.applovin.exoplayer2.l.ai.a((int) r1, (int) r11)
            int r12 = r12 * r0
            int r12 = r12 * 16
            int r0 = r12 * 16
            goto L_0x00c9
        L_0x00c6:
            return r2
        L_0x00c7:
            int r0 = r0 * r1
        L_0x00c9:
            r9 = 2
        L_0x00ca:
            int r0 = r0 * 3
            int r9 = r9 * 2
            int r0 = r0 / r9
            return r0
        L_0x00d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.h.c(com.applovin.exoplayer2.f.i, com.applovin.exoplayer2.v):int");
    }

    private static boolean g(long j2) {
        return j2 < -30000;
    }

    private static boolean h(long j2) {
        return j2 < -500000;
    }

    /* access modifiers changed from: package-private */
    public void B() {
        this.u = true;
        if (!this.s) {
            this.s = true;
            this.f13716h.a((Object) this.o);
            this.q = true;
        }
    }

    /* access modifiers changed from: protected */
    public void C() {
        super.C();
        T();
    }

    /* access modifiers changed from: protected */
    public boolean F() {
        return this.K && ai.f13525a < 23;
    }

    /* access modifiers changed from: protected */
    public void M() {
        super.M();
        this.A = 0;
    }

    /* access modifiers changed from: protected */
    public float a(float f2, v vVar, v[] vVarArr) {
        float f3 = -1.0f;
        for (v vVar2 : vVarArr) {
            float f4 = vVar2.s;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f2;
    }

    /* access modifiers changed from: protected */
    public int a(k kVar, v vVar) throws l.b {
        int i2 = 0;
        if (!u.b(vVar.l)) {
            return as.CC.b(0);
        }
        boolean z2 = vVar.o != null;
        List<i> a2 = a(kVar, vVar, z2, false);
        if (z2 && a2.isEmpty()) {
            a2 = a(kVar, vVar, false, false);
        }
        if (a2.isEmpty()) {
            return as.CC.b(1);
        }
        if (!c(vVar)) {
            return as.CC.b(2);
        }
        i iVar = a2.get(0);
        boolean a3 = iVar.a(vVar);
        int i3 = iVar.c(vVar) ? 16 : 8;
        if (a3) {
            List<i> a4 = a(kVar, vVar, z2, true);
            if (!a4.isEmpty()) {
                i iVar2 = a4.get(0);
                if (iVar2.a(vVar) && iVar2.c(vVar)) {
                    i2 = 32;
                }
            }
        }
        return as.CC.a(a3 ? 4 : 3, i3, i2);
    }

    /* access modifiers changed from: protected */
    public MediaFormat a(v vVar, String str, a aVar, float f2, boolean z2, int i2) {
        Pair<Integer, Integer> a2;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(IabUtils.KEY_WIDTH, vVar.q);
        mediaFormat.setInteger(IabUtils.KEY_HEIGHT, vVar.r);
        t.a(mediaFormat, vVar.n);
        t.a(mediaFormat, "frame-rate", vVar.s);
        t.a(mediaFormat, "rotation-degrees", vVar.t);
        t.a(mediaFormat, vVar.x);
        if ("video/dolby-vision".equals(vVar.l) && (a2 = l.a(vVar)) != null) {
            t.a(mediaFormat, Scopes.PROFILE, ((Integer) a2.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f13717a);
        mediaFormat.setInteger("max-height", aVar.f13718b);
        t.a(mediaFormat, "max-input-size", aVar.f13719c);
        if (ai.f13525a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z2) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i2 != 0) {
            a(mediaFormat, i2);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public com.applovin.exoplayer2.c.h a(i iVar, v vVar, v vVar2) {
        com.applovin.exoplayer2.c.h a2 = iVar.a(vVar, vVar2);
        int i2 = a2.f11431e;
        if (vVar2.q > this.l.f13717a || vVar2.r > this.l.f13718b) {
            i2 |= 256;
        }
        if (a(iVar, vVar2) > this.l.f13719c) {
            i2 |= 64;
        }
        int i3 = i2;
        return new com.applovin.exoplayer2.c.h(iVar.f12544a, vVar, vVar2, i3 != 0 ? 0 : a2.f11430d, i3);
    }

    /* access modifiers changed from: protected */
    public com.applovin.exoplayer2.c.h a(w wVar) throws p {
        com.applovin.exoplayer2.c.h a2 = super.a(wVar);
        this.f13716h.a(wVar.f13939b, a2);
        return a2;
    }

    /* access modifiers changed from: protected */
    public g.a a(i iVar, v vVar, MediaCrypto mediaCrypto, float f2) {
        d dVar = this.p;
        if (!(dVar == null || dVar.f13683a == iVar.f12550g)) {
            this.p.release();
            this.p = null;
        }
        String str = iVar.f12546c;
        a a2 = a(iVar, vVar, u());
        this.l = a2;
        MediaFormat a3 = a(vVar, str, a2, f2, this.k, this.K ? this.L : 0);
        if (this.o == null) {
            if (b(iVar)) {
                if (this.p == null) {
                    this.p = d.a(this.f13714f, iVar.f12550g);
                }
                this.o = this.p;
            } else {
                throw new IllegalStateException();
            }
        }
        return g.a.a(iVar, a3, vVar, this.o, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    public com.applovin.exoplayer2.f.h a(Throwable th, i iVar) {
        return new g(th, iVar, this.o);
    }

    /* access modifiers changed from: protected */
    public a a(i iVar, v vVar, v[] vVarArr) {
        int c2;
        int i2 = vVar.q;
        int i3 = vVar.r;
        int a2 = a(iVar, vVar);
        if (vVarArr.length == 1) {
            if (!(a2 == -1 || (c2 = c(iVar, vVar)) == -1)) {
                a2 = Math.min((int) (((float) a2) * 1.5f), c2);
            }
            return new a(i2, i3, a2);
        }
        int length = vVarArr.length;
        boolean z2 = false;
        for (int i4 = 0; i4 < length; i4++) {
            v vVar2 = vVarArr[i4];
            if (vVar.x != null && vVar2.x == null) {
                vVar2 = vVar2.a().a(vVar.x).a();
            }
            if (iVar.a(vVar, vVar2).f11430d != 0) {
                z2 |= vVar2.q == -1 || vVar2.r == -1;
                i2 = Math.max(i2, vVar2.q);
                i3 = Math.max(i3, vVar2.r);
                a2 = Math.max(a2, a(iVar, vVar2));
            }
        }
        if (z2) {
            q.c("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i2 + "x" + i3);
            Point b2 = b(iVar, vVar);
            if (b2 != null) {
                i2 = Math.max(i2, b2.x);
                i3 = Math.max(i3, b2.y);
                a2 = Math.max(a2, c(iVar, vVar.a().g(i2).h(i3).a()));
                q.c("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i2 + "x" + i3);
            }
        }
        return new a(i2, i3, a2);
    }

    /* access modifiers changed from: protected */
    public List<i> a(k kVar, v vVar, boolean z2) throws l.b {
        return a(kVar, vVar, z2, this.K);
    }

    public void a(float f2, float f3) throws p {
        super.a(f2, f3);
        this.f13715g.a(f2);
    }

    public void a(int i2, Object obj) throws p {
        if (i2 == 1) {
            a(obj);
        } else if (i2 == 7) {
            this.M = (l) obj;
        } else if (i2 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.L != intValue) {
                this.L = intValue;
                if (this.K) {
                    J();
                }
            }
        } else if (i2 == 4) {
            this.r = ((Integer) obj).intValue();
            g G2 = G();
            if (G2 != null) {
                G2.c(this.r);
            }
        } else if (i2 != 5) {
            super.a(i2, obj);
        } else {
            this.f13715g.a(((Integer) obj).intValue());
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z2) throws p {
        super.a(j2, z2);
        T();
        this.f13715g.c();
        this.B = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.z = 0;
        if (z2) {
            S();
        } else {
            this.w = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    public void a(com.applovin.exoplayer2.c.g gVar) throws p {
        if (!this.K) {
            this.A++;
        }
        if (ai.f13525a < 23 && this.K) {
            e(gVar.f11421d);
        }
    }

    /* access modifiers changed from: protected */
    public void a(g gVar, int i2, long j2) {
        ah.a("skipVideoBuffer");
        gVar.a(i2, false);
        ah.a();
        this.f12553a.f11415f++;
    }

    /* access modifiers changed from: protected */
    public void a(g gVar, int i2, long j2, long j3) {
        W();
        ah.a("releaseOutputBuffer");
        gVar.a(i2, j3);
        ah.a();
        this.C = SystemClock.elapsedRealtime() * 1000;
        this.f12553a.f11414e++;
        this.z = 0;
        B();
    }

    /* access modifiers changed from: protected */
    public void a(g gVar, Surface surface) {
        gVar.a(surface);
    }

    /* access modifiers changed from: protected */
    public void a(v vVar, MediaFormat mediaFormat) {
        g G2 = G();
        if (G2 != null) {
            G2.c(this.r);
        }
        if (this.K) {
            this.F = vVar.q;
            this.G = vVar.r;
        } else {
            com.applovin.exoplayer2.l.a.b(mediaFormat);
            boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.F = z2 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(IabUtils.KEY_WIDTH);
            this.G = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(IabUtils.KEY_HEIGHT);
        }
        this.I = vVar.u;
        if (ai.f13525a < 21) {
            this.H = vVar.t;
        } else if (vVar.t == 90 || vVar.t == 270) {
            int i2 = this.F;
            this.F = this.G;
            this.G = i2;
            this.I = 1.0f / this.I;
        }
        this.f13715g.b(vVar.s);
    }

    /* access modifiers changed from: protected */
    public void a(Exception exc) {
        q.c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f13716h.a(exc);
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        this.f13716h.a(str);
    }

    /* access modifiers changed from: protected */
    public void a(String str, long j2, long j3) {
        this.f13716h.a(str, j2, j3);
        this.m = b(str);
        this.n = ((i) com.applovin.exoplayer2.l.a.b(I())).b();
        if (ai.f13525a >= 23 && this.K) {
            this.f13713b = new b((g) com.applovin.exoplayer2.l.a.b(G()));
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z2, boolean z3) throws p {
        super.a(z2, z3);
        boolean z4 = v().f11139b;
        com.applovin.exoplayer2.l.a.b(!z4 || this.L != 0);
        if (this.K != z4) {
            this.K = z4;
            J();
        }
        this.f13716h.a(this.f12553a);
        this.f13715g.a();
        this.t = z3;
        this.u = false;
    }

    /* access modifiers changed from: protected */
    public boolean a(long j2, long j3, g gVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z2, boolean z3, v vVar) throws p {
        long j5;
        boolean z4;
        long j6;
        long j7;
        int i5;
        g gVar2;
        h hVar;
        long j8 = j2;
        g gVar3 = gVar;
        int i6 = i2;
        long j9 = j4;
        com.applovin.exoplayer2.l.a.b(gVar);
        if (this.v == -9223372036854775807L) {
            this.v = j8;
        }
        if (j9 != this.B) {
            this.f13715g.a(j9);
            this.B = j9;
        }
        long Q = Q();
        long j10 = j9 - Q;
        if (!z2 || z3) {
            double O = (double) O();
            boolean z5 = d_() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j11 = (long) (((double) (j9 - j8)) / O);
            if (z5) {
                j11 -= elapsedRealtime - j3;
            }
            if (this.o != this.p) {
                long j12 = elapsedRealtime - this.C;
                if (this.u ? this.s : !z5 && !this.t) {
                    j5 = j12;
                    z4 = false;
                } else {
                    j5 = j12;
                    z4 = true;
                }
                if (this.w == -9223372036854775807L && j8 >= Q && (z4 || (z5 && b(j11, j5)))) {
                    long nanoTime = System.nanoTime();
                    a(j10, nanoTime, vVar);
                    if (ai.f13525a >= 21) {
                        hVar = this;
                        gVar2 = gVar;
                        i5 = i2;
                        j7 = j10;
                        j6 = nanoTime;
                        hVar.a(gVar2, i5, j7, j6);
                    }
                    c(gVar3, i6, j10);
                } else {
                    if (z5 && j8 != this.v) {
                        long nanoTime2 = System.nanoTime();
                        long b2 = this.f13715g.b((j11 * 1000) + nanoTime2);
                        long j13 = (b2 - nanoTime2) / 1000;
                        long j14 = j13;
                        boolean z6 = this.w != -9223372036854775807L;
                        if (b(j13, j3, z3) && b(j8, z6)) {
                            return false;
                        }
                        if (a(j14, j3, z3)) {
                            if (z6) {
                                a(gVar3, i6, j10);
                            } else {
                                b(gVar3, i6, j10);
                            }
                            j11 = j14;
                        } else {
                            j11 = j14;
                            if (ai.f13525a >= 21) {
                                if (j11 < 50000) {
                                    hVar = this;
                                    hVar.a(j10, b2, vVar);
                                    gVar2 = gVar;
                                    i5 = i2;
                                    j7 = j10;
                                    j6 = b2;
                                    hVar.a(gVar2, i5, j7, j6);
                                }
                            } else if (j11 < 30000) {
                                if (j11 > 11000) {
                                    try {
                                        Thread.sleep((j11 - 10000) / 1000);
                                    } catch (InterruptedException unused) {
                                        Thread.currentThread().interrupt();
                                        return false;
                                    }
                                }
                                a(j10, b2, vVar);
                                c(gVar3, i6, j10);
                            }
                        }
                    }
                    return false;
                }
                f(j11);
                return true;
            } else if (!g(j11)) {
                return false;
            } else {
                a(gVar3, i6, j10);
                f(j11);
                return true;
            }
        } else {
            a(gVar3, i6, j10);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(long j2, long j3, boolean z2) {
        return g(j2) && !z2;
    }

    /* access modifiers changed from: protected */
    public boolean a(i iVar) {
        return this.o != null || b(iVar);
    }

    /* access modifiers changed from: protected */
    public void b(com.applovin.exoplayer2.c.g gVar) throws p {
        if (this.n) {
            ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(gVar.f11422e);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s2 = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s2 == 60 && s3 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a(G(), bArr);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(g gVar, int i2, long j2) {
        ah.a("dropVideoBuffer");
        gVar.a(i2, false);
        ah.a();
        e(1);
    }

    /* access modifiers changed from: protected */
    public boolean b(long j2, long j3) {
        return g(j2) && j3 > 100000;
    }

    /* access modifiers changed from: protected */
    public boolean b(long j2, long j3, boolean z2) {
        return h(j2) && !z2;
    }

    /* access modifiers changed from: protected */
    public boolean b(long j2, boolean z2) throws p {
        int b2 = b(j2);
        if (b2 == 0) {
            return false;
        }
        this.f12553a.i++;
        int i2 = this.A + b2;
        if (z2) {
            this.f12553a.f11415f += i2;
        } else {
            e(i2);
        }
        K();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean b(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!f13711d) {
                f13712e = ab();
                f13711d = true;
            }
        }
        return f13712e;
    }

    /* access modifiers changed from: protected */
    public void c(g gVar, int i2, long j2) {
        W();
        ah.a("releaseOutputBuffer");
        gVar.a(i2, true);
        ah.a();
        this.C = SystemClock.elapsedRealtime() * 1000;
        this.f12553a.f11414e++;
        this.z = 0;
        B();
    }

    /* access modifiers changed from: protected */
    public void d(long j2) {
        super.d(j2);
        if (!this.K) {
            this.A--;
        }
    }

    /* access modifiers changed from: protected */
    public void e(int i2) {
        this.f12553a.f11416g += i2;
        this.y += i2;
        this.z += i2;
        this.f12553a.f11417h = Math.max(this.z, this.f12553a.f11417h);
        int i3 = this.j;
        if (i3 > 0 && this.y >= i3) {
            Y();
        }
    }

    /* access modifiers changed from: protected */
    public void e(long j2) throws p {
        c(j2);
        W();
        this.f12553a.f11414e++;
        B();
        d(j2);
    }

    /* access modifiers changed from: protected */
    public void f(long j2) {
        this.f12553a.a(j2);
        this.D += j2;
        this.E++;
    }

    /* access modifiers changed from: protected */
    public void p() {
        super.p();
        this.y = 0;
        this.x = SystemClock.elapsedRealtime();
        this.C = SystemClock.elapsedRealtime() * 1000;
        this.D = 0;
        this.E = 0;
        this.f13715g.b();
    }

    /* access modifiers changed from: protected */
    public void q() {
        this.w = -9223372036854775807L;
        Y();
        Z();
        this.f13715g.d();
        super.q();
    }

    /* access modifiers changed from: protected */
    public void r() {
        V();
        T();
        this.q = false;
        this.f13715g.e();
        this.f13713b = null;
        try {
            super.r();
        } finally {
            this.f13716h.b(this.f12553a);
        }
    }

    /* access modifiers changed from: protected */
    public void s() {
        try {
            super.s();
        } finally {
            d dVar = this.p;
            if (dVar != null) {
                if (this.o == dVar) {
                    this.o = null;
                }
                this.p.release();
                this.p = null;
            }
        }
    }

    public String y() {
        return "MediaCodecVideoRenderer";
    }

    public boolean z() {
        d dVar;
        if (super.z() && (this.s || (((dVar = this.p) != null && this.o == dVar) || G() == null || this.K))) {
            this.w = -9223372036854775807L;
            return true;
        } else if (this.w == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.w) {
                return true;
            }
            this.w = -9223372036854775807L;
            return false;
        }
    }
}
