package com.applovin.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ao;
import com.applovin.exoplayer2.ay;
import com.applovin.exoplayer2.b;
import com.applovin.exoplayer2.b.d;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.c;
import com.applovin.exoplayer2.c.e;
import com.applovin.exoplayer2.e.f;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.r;
import com.applovin.exoplayer2.j.h;
import com.applovin.exoplayer2.j.j;
import com.applovin.exoplayer2.k;
import com.applovin.exoplayer2.k.n;
import com.applovin.exoplayer2.l.aa;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.g;
import com.applovin.exoplayer2.m.a.i;
import com.applovin.exoplayer2.m.n;
import com.applovin.exoplayer2.m.o;
import com.applovin.exoplayer2.q;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

public class aw extends d implements q {
    private int A;
    private int B;
    /* access modifiers changed from: private */
    public e C;
    /* access modifiers changed from: private */
    public e D;
    private int E;
    private d F;
    private float G;
    /* access modifiers changed from: private */
    public boolean H;
    /* access modifiers changed from: private */
    public List<com.applovin.exoplayer2.i.a> I;
    private boolean J;
    private boolean K;
    /* access modifiers changed from: private */
    public aa L;
    /* access modifiers changed from: private */
    public boolean M;
    private boolean N;
    /* access modifiers changed from: private */
    public o O;
    /* access modifiers changed from: private */
    public o P;

    /* renamed from: b  reason: collision with root package name */
    protected final ar[] f11147b;

    /* renamed from: c  reason: collision with root package name */
    private final g f11148c = new g();

    /* renamed from: d  reason: collision with root package name */
    private final Context f11149d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final r f11150e;

    /* renamed from: f  reason: collision with root package name */
    private final b f11151f;

    /* renamed from: g  reason: collision with root package name */
    private final c f11152g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final CopyOnWriteArraySet<an.d> f11153h;
    /* access modifiers changed from: private */
    public final com.applovin.exoplayer2.a.a i;
    private final b j;
    private final c k;
    /* access modifiers changed from: private */
    public final ay l;
    private final bb m;
    private final bc n;
    private final long o;
    /* access modifiers changed from: private */
    public v p;
    /* access modifiers changed from: private */
    public v q;
    private AudioTrack r;
    /* access modifiers changed from: private */
    public Object s;
    private Surface t;
    private SurfaceHolder u;
    private i v;
    /* access modifiers changed from: private */
    public boolean w;
    private TextureView x;
    private int y;
    private int z;

    @Deprecated
    public static final class a {
        private boolean A;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Context f11154a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final au f11155b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public com.applovin.exoplayer2.l.d f11156c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public long f11157d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public j f11158e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public r f11159f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public aa f11160g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public com.applovin.exoplayer2.k.d f11161h;
        /* access modifiers changed from: private */
        public com.applovin.exoplayer2.a.a i;
        /* access modifiers changed from: private */
        public Looper j;
        /* access modifiers changed from: private */
        public aa k;
        /* access modifiers changed from: private */
        public d l;
        /* access modifiers changed from: private */
        public boolean m;
        /* access modifiers changed from: private */
        public int n;
        /* access modifiers changed from: private */
        public boolean o;
        /* access modifiers changed from: private */
        public boolean p;
        /* access modifiers changed from: private */
        public int q;
        /* access modifiers changed from: private */
        public int r;
        /* access modifiers changed from: private */
        public boolean s;
        /* access modifiers changed from: private */
        public av t;
        /* access modifiers changed from: private */
        public long u;
        /* access modifiers changed from: private */
        public long v;
        /* access modifiers changed from: private */
        public z w;
        /* access modifiers changed from: private */
        public long x;
        /* access modifiers changed from: private */
        public long y;
        /* access modifiers changed from: private */
        public boolean z;

        @Deprecated
        public a(Context context) {
            this(context, new n(context), new f());
        }

        @Deprecated
        public a(Context context, au auVar, l lVar) {
            this(context, auVar, new com.applovin.exoplayer2.j.c(context), new com.applovin.exoplayer2.h.f(context, lVar), new l(), n.a(context), new com.applovin.exoplayer2.a.a(com.applovin.exoplayer2.l.d.f13534a));
        }

        @Deprecated
        public a(Context context, au auVar, j jVar, r rVar, aa aaVar, com.applovin.exoplayer2.k.d dVar, com.applovin.exoplayer2.a.a aVar) {
            this.f11154a = context;
            this.f11155b = auVar;
            this.f11158e = jVar;
            this.f11159f = rVar;
            this.f11160g = aaVar;
            this.f11161h = dVar;
            this.i = aVar;
            this.j = ai.c();
            this.l = d.f11211a;
            this.n = 0;
            this.q = 1;
            this.r = 0;
            this.s = true;
            this.t = av.f11144e;
            this.u = 5000;
            this.v = 15000;
            this.w = new k.a().a();
            this.f11156c = com.applovin.exoplayer2.l.d.f13534a;
            this.x = 500;
            this.y = 2000;
        }

        @Deprecated
        public aw a() {
            com.applovin.exoplayer2.l.a.b(!this.A);
            this.A = true;
            return new aw(this);
        }
    }

    private final class b implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, an.b, ay.a, b.C0107b, com.applovin.exoplayer2.b.g, c.b, com.applovin.exoplayer2.g.e, com.applovin.exoplayer2.i.l, i.a, com.applovin.exoplayer2.m.n, q.a {
        private b() {
        }

        public void a() {
            aw.this.a(false, -1, 3);
        }

        public void a(float f2) {
            aw.this.W();
        }

        public void a(int i) {
            boolean x = aw.this.x();
            aw.this.a(x, i, aw.b(x, i));
        }

        public void a(int i, long j) {
            aw.this.i.a(i, j);
        }

        public void a(int i, long j, long j2) {
            aw.this.i.a(i, j, j2);
        }

        public void a(int i, boolean z) {
            Iterator it = aw.this.f11153h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(i, z);
            }
        }

        public void a(long j) {
            aw.this.i.a(j);
        }

        public void a(long j, int i) {
            aw.this.i.a(j, i);
        }

        public void a(Surface surface) {
            aw.this.a((Object) null);
        }

        public /* synthetic */ void a(ab abVar, int i) {
            an.b.CC.$default$a((an.b) this, abVar, i);
        }

        public /* synthetic */ void a(ac acVar) {
            an.b.CC.$default$a((an.b) this, acVar);
        }

        public /* synthetic */ void a(ak akVar) {
            an.b.CC.$default$a((an.b) this, akVar);
        }

        public /* synthetic */ void a(am amVar) {
            an.b.CC.$default$a((an.b) this, amVar);
        }

        public /* synthetic */ void a(an.a aVar) {
            an.b.CC.$default$a((an.b) this, aVar);
        }

        public /* synthetic */ void a(an.e eVar, an.e eVar2, int i) {
            an.b.CC.$default$a(this, eVar, eVar2, i);
        }

        public /* synthetic */ void a(an anVar, an.c cVar) {
            an.b.CC.$default$a((an.b) this, anVar, cVar);
        }

        public /* synthetic */ void a(ba baVar, int i) {
            an.b.CC.$default$a((an.b) this, baVar, i);
        }

        public void a(e eVar) {
            e unused = aw.this.C = eVar;
            aw.this.i.a(eVar);
        }

        public void a(com.applovin.exoplayer2.g.a aVar) {
            aw.this.i.a(aVar);
            aw.this.f11150e.a(aVar);
            Iterator it = aw.this.f11153h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(aVar);
            }
        }

        public /* synthetic */ void a(ad adVar, h hVar) {
            an.b.CC.$default$a((an.b) this, adVar, hVar);
        }

        public void a(o oVar) {
            o unused = aw.this.P = oVar;
            aw.this.i.a(oVar);
            Iterator it = aw.this.f11153h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(oVar);
            }
        }

        @Deprecated
        public /* synthetic */ void a(v vVar) {
            g.CC.$default$a((com.applovin.exoplayer2.b.g) this, vVar);
        }

        public void a(v vVar, com.applovin.exoplayer2.c.h hVar) {
            v unused = aw.this.p = vVar;
            aw.this.i.a(vVar, hVar);
        }

        public void a(Exception exc) {
            aw.this.i.a(exc);
        }

        public void a(Object obj, long j) {
            aw.this.i.a(obj, j);
            if (aw.this.s == obj) {
                Iterator it = aw.this.f11153h.iterator();
                while (it.hasNext()) {
                    ((an.d) it.next()).a();
                }
            }
        }

        public void a(String str) {
            aw.this.i.a(str);
        }

        public void a(String str, long j, long j2) {
            aw.this.i.a(str, j, j2);
        }

        public void a(List<com.applovin.exoplayer2.i.a> list) {
            List unused = aw.this.I = list;
            Iterator it = aw.this.f11153h.iterator();
            while (it.hasNext()) {
                ((an.d) it.next()).a(list);
            }
        }

        public /* synthetic */ void a(boolean z) {
            q.a.CC.$default$a(this, z);
        }

        @Deprecated
        public /* synthetic */ void a(boolean z, int i) {
            an.b.CC.$default$a((an.b) this, z, i);
        }

        @Deprecated
        public /* synthetic */ void a_(v vVar) {
            n.CC.$default$a_(this, vVar);
        }

        public void a_(boolean z) {
            if (aw.this.H != z) {
                boolean unused = aw.this.H = z;
                aw.this.X();
            }
        }

        @Deprecated
        public /* synthetic */ void b() {
            an.b.CC.$default$b(this);
        }

        public void b(int i) {
            aw.this.Y();
        }

        public /* synthetic */ void b(ak akVar) {
            an.b.CC.$default$b((an.b) this, akVar);
        }

        public void b(e eVar) {
            aw.this.i.b(eVar);
            v unused = aw.this.p = null;
            e unused2 = aw.this.C = null;
        }

        public void b(v vVar, com.applovin.exoplayer2.c.h hVar) {
            v unused = aw.this.q = vVar;
            aw.this.i.b(vVar, hVar);
        }

        public void b(Exception exc) {
            aw.this.i.b(exc);
        }

        public void b(String str) {
            aw.this.i.b(str);
        }

        public void b(String str, long j, long j2) {
            aw.this.i.b(str, j, j2);
        }

        public void b(boolean z) {
            aw.this.Y();
        }

        public void b(boolean z, int i) {
            aw.this.Y();
        }

        public void b_(boolean z) {
            aw awVar;
            if (aw.this.L != null) {
                boolean z2 = false;
                if (z && !aw.this.M) {
                    aw.this.L.a(0);
                    awVar = aw.this;
                    z2 = true;
                } else if (!z && aw.this.M) {
                    aw.this.L.b(0);
                    awVar = aw.this;
                } else {
                    return;
                }
                boolean unused = awVar.M = z2;
            }
        }

        public /* synthetic */ void c(int i) {
            an.b.CC.$default$c((an.b) this, i);
        }

        public void c(e eVar) {
            e unused = aw.this.D = eVar;
            aw.this.i.c(eVar);
        }

        public void c(Exception exc) {
            aw.this.i.c(exc);
        }

        @Deprecated
        public /* synthetic */ void c(boolean z) {
            an.b.CC.$default$c((an.b) this, z);
        }

        public /* synthetic */ void d(int i) {
            an.b.CC.$default$d((an.b) this, i);
        }

        public void d(e eVar) {
            aw.this.i.d(eVar);
            v unused = aw.this.q = null;
            e unused2 = aw.this.D = null;
        }

        public /* synthetic */ void d(boolean z) {
            an.b.CC.$default$d((an.b) this, z);
        }

        @Deprecated
        public /* synthetic */ void e(int i) {
            an.b.CC.$default$e((an.b) this, i);
        }

        public /* synthetic */ void e(boolean z) {
            an.b.CC.$default$e((an.b) this, z);
        }

        public void f(int i) {
            o a2 = aw.b(aw.this.l);
            if (!a2.equals(aw.this.O)) {
                o unused = aw.this.O = a2;
                Iterator it = aw.this.f11153h.iterator();
                while (it.hasNext()) {
                    ((an.d) it.next()).a(a2);
                }
            }
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            aw.this.a(surfaceTexture);
            aw.this.a(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            aw.this.a((Object) null);
            aw.this.a(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            aw.this.a(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            aw.this.a(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (aw.this.w) {
                aw.this.a((Object) surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (aw.this.w) {
                aw.this.a((Object) null);
            }
            aw.this.a(0, 0);
        }
    }

    private static final class c implements ao.b, com.applovin.exoplayer2.m.a.a, com.applovin.exoplayer2.m.l {

        /* renamed from: a  reason: collision with root package name */
        private com.applovin.exoplayer2.m.l f11163a;

        /* renamed from: b  reason: collision with root package name */
        private com.applovin.exoplayer2.m.a.a f11164b;

        /* renamed from: c  reason: collision with root package name */
        private com.applovin.exoplayer2.m.l f11165c;

        /* renamed from: d  reason: collision with root package name */
        private com.applovin.exoplayer2.m.a.a f11166d;

        private c() {
        }

        public void a() {
            com.applovin.exoplayer2.m.a.a aVar = this.f11166d;
            if (aVar != null) {
                aVar.a();
            }
            com.applovin.exoplayer2.m.a.a aVar2 = this.f11164b;
            if (aVar2 != null) {
                aVar2.a();
            }
        }

        public void a(int i, Object obj) {
            com.applovin.exoplayer2.m.a.a aVar;
            if (i == 7) {
                this.f11163a = (com.applovin.exoplayer2.m.l) obj;
            } else if (i == 8) {
                this.f11164b = (com.applovin.exoplayer2.m.a.a) obj;
            } else if (i == 10000) {
                i iVar = (i) obj;
                if (iVar == null) {
                    aVar = null;
                    this.f11165c = null;
                } else {
                    this.f11165c = iVar.getVideoFrameMetadataListener();
                    aVar = iVar.getCameraMotionListener();
                }
                this.f11166d = aVar;
            }
        }

        public void a(long j, long j2, v vVar, MediaFormat mediaFormat) {
            com.applovin.exoplayer2.m.l lVar = this.f11165c;
            if (lVar != null) {
                lVar.a(j, j2, vVar, mediaFormat);
            }
            com.applovin.exoplayer2.m.l lVar2 = this.f11163a;
            if (lVar2 != null) {
                lVar2.a(j, j2, vVar, mediaFormat);
            }
        }

        public void a(long j, float[] fArr) {
            com.applovin.exoplayer2.m.a.a aVar = this.f11166d;
            if (aVar != null) {
                aVar.a(j, fArr);
            }
            com.applovin.exoplayer2.m.a.a aVar2 = this.f11164b;
            if (aVar2 != null) {
                aVar2.a(j, fArr);
            }
        }
    }

    protected aw(a aVar) {
        aw awVar;
        try {
            this.f11149d = aVar.f11154a.getApplicationContext();
            this.i = aVar.i;
            this.L = aVar.k;
            this.F = aVar.l;
            this.y = aVar.q;
            this.z = aVar.r;
            this.H = aVar.p;
            this.o = aVar.y;
            this.f11151f = new b();
            this.f11152g = new c();
            this.f11153h = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(aVar.j);
            this.f11147b = aVar.f11155b.a(handler, this.f11151f, this.f11151f, this.f11151f, this.f11151f);
            this.G = 1.0f;
            this.E = ai.f13525a < 21 ? d(0) : h.a(this.f11149d);
            this.I = Collections.emptyList();
            this.J = true;
            Handler handler2 = handler;
            r rVar = r1;
            try {
                r rVar2 = new r(this.f11147b, aVar.f11158e, aVar.f11159f, aVar.f11160g, aVar.f11161h, this.i, aVar.s, aVar.t, aVar.u, aVar.v, aVar.w, aVar.x, aVar.z, aVar.f11156c, aVar.j, this, new an.a.C0105a().a(20, 21, 22, 23, 24, 25, 26, 27).a());
                awVar = this;
                try {
                    awVar.f11150e = rVar;
                    rVar.a((an.b) awVar.f11151f);
                    awVar.f11150e.a((q.a) awVar.f11151f);
                    if (aVar.f11157d > 0) {
                        awVar.f11150e.b(aVar.f11157d);
                    }
                    Handler handler3 = handler2;
                    b bVar = new b(aVar.f11154a, handler3, awVar.f11151f);
                    awVar.j = bVar;
                    bVar.a(aVar.o);
                    c cVar = new c(aVar.f11154a, handler3, awVar.f11151f);
                    awVar.k = cVar;
                    cVar.a(aVar.m ? awVar.F : null);
                    ay ayVar = new ay(aVar.f11154a, handler3, awVar.f11151f);
                    awVar.l = ayVar;
                    ayVar.a(ai.g(awVar.F.f11215d));
                    bb bbVar = new bb(aVar.f11154a);
                    awVar.m = bbVar;
                    bbVar.a(aVar.n != 0);
                    bc bcVar = new bc(aVar.f11154a);
                    awVar.n = bcVar;
                    bcVar.a(aVar.n == 2);
                    awVar.O = b(awVar.l);
                    awVar.P = o.f13756a;
                    awVar.a(1, 10, (Object) Integer.valueOf(awVar.E));
                    awVar.a(2, 10, (Object) Integer.valueOf(awVar.E));
                    awVar.a(1, 3, (Object) awVar.F);
                    awVar.a(2, 4, (Object) Integer.valueOf(awVar.y));
                    awVar.a(2, 5, (Object) Integer.valueOf(awVar.z));
                    awVar.a(1, 9, (Object) Boolean.valueOf(awVar.H));
                    awVar.a(2, 7, (Object) awVar.f11152g);
                    awVar.a(6, 8, (Object) awVar.f11152g);
                    awVar.f11148c.a();
                } catch (Throwable th) {
                    th = th;
                    awVar.f11148c.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                awVar = this;
                awVar.f11148c.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            awVar = this;
            awVar.f11148c.a();
            throw th;
        }
    }

    private void U() {
        if (this.v != null) {
            this.f11150e.a((ao.b) this.f11152g).a(10000).a((Object) null).i();
            this.v.b(this.f11151f);
            this.v = null;
        }
        TextureView textureView = this.x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f11151f) {
                com.applovin.exoplayer2.l.q.c("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.x.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.x = null;
        }
        SurfaceHolder surfaceHolder = this.u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f11151f);
            this.u = null;
        }
    }

    /* access modifiers changed from: private */
    public void W() {
        a(1, 2, (Object) Float.valueOf(this.G * this.k.a()));
    }

    /* access modifiers changed from: private */
    public void X() {
        this.i.a_(this.H);
        Iterator<an.d> it = this.f11153h.iterator();
        while (it.hasNext()) {
            it.next().a_(this.H);
        }
    }

    /* access modifiers changed from: private */
    public void Y() {
        int t2 = t();
        boolean z2 = true;
        if (t2 != 1) {
            if (t2 == 2 || t2 == 3) {
                boolean q2 = q();
                bb bbVar = this.m;
                if (!x() || q2) {
                    z2 = false;
                }
                bbVar.b(z2);
                this.n.b(x());
                return;
            } else if (t2 != 4) {
                throw new IllegalStateException();
            }
        }
        this.m.b(false);
        this.n.b(false);
    }

    private void Z() {
        this.f11148c.d();
        if (Thread.currentThread() != r().getThread()) {
            String a2 = ai.a("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), r().getThread().getName());
            if (!this.J) {
                com.applovin.exoplayer2.l.q.b("SimpleExoPlayer", a2, this.K ? null : new IllegalStateException());
                this.K = true;
                return;
            }
            throw new IllegalStateException(a2);
        }
    }

    /* access modifiers changed from: private */
    public void a(int i2, int i3) {
        if (i2 != this.A || i3 != this.B) {
            this.A = i2;
            this.B = i3;
            this.i.a(i2, i3);
            Iterator<an.d> it = this.f11153h.iterator();
            while (it.hasNext()) {
                it.next().a(i2, i3);
            }
        }
    }

    private void a(int i2, int i3, Object obj) {
        for (ar arVar : this.f11147b) {
            if (arVar.a() == i2) {
                this.f11150e.a((ao.b) arVar).a(i3).a(obj).i();
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a((Object) surface);
        this.t = surface;
    }

    /* access modifiers changed from: private */
    public void a(Object obj) {
        boolean z2;
        ArrayList<ao> arrayList = new ArrayList<>();
        ar[] arVarArr = this.f11147b;
        int length = arVarArr.length;
        int i2 = 0;
        while (true) {
            z2 = true;
            if (i2 >= length) {
                break;
            }
            ar arVar = arVarArr[i2];
            if (arVar.a() == 2) {
                arrayList.add(this.f11150e.a((ao.b) arVar).a(1).a(obj).i());
            }
            i2++;
        }
        Object obj2 = this.s;
        if (obj2 == null || obj2 == obj) {
            z2 = false;
        } else {
            try {
                for (ao a2 : arrayList) {
                    a2.a(this.o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z2 = false;
            Object obj3 = this.s;
            Surface surface = this.t;
            if (obj3 == surface) {
                surface.release();
                this.t = null;
            }
        }
        this.s = obj;
        if (z2) {
            this.f11150e.a(false, p.a((RuntimeException) new u(3), 1003));
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z2, int i2, int i3) {
        int i4 = 0;
        boolean z3 = z2 && i2 != -1;
        if (z3 && i2 != 1) {
            i4 = 1;
        }
        this.f11150e.a(z3, i4, i3);
    }

    /* access modifiers changed from: private */
    public static int b(boolean z2, int i2) {
        return (!z2 || i2 == 1) ? 1 : 2;
    }

    /* access modifiers changed from: private */
    public static o b(ay ayVar) {
        return new o(0, ayVar.a(), ayVar.b());
    }

    private void c(SurfaceHolder surfaceHolder) {
        this.w = false;
        this.u = surfaceHolder;
        surfaceHolder.addCallback(this.f11151f);
        Surface surface = this.u.getSurface();
        if (surface == null || !surface.isValid()) {
            a(0, 0);
            return;
        }
        Rect surfaceFrame = this.u.getSurfaceFrame();
        a(surfaceFrame.width(), surfaceFrame.height());
    }

    private int d(int i2) {
        AudioTrack audioTrack = this.r;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i2)) {
            this.r.release();
            this.r = null;
        }
        if (this.r == null) {
            this.r = new AudioTrack(3, TTAdSdk.INIT_LOCAL_FAIL_CODE, 4, 2, 2, 0, i2);
        }
        return this.r.getAudioSessionId();
    }

    public long A() {
        Z();
        return this.f11150e.A();
    }

    public long B() {
        Z();
        return this.f11150e.B();
    }

    public long C() {
        Z();
        return this.f11150e.C();
    }

    public am D() {
        Z();
        return this.f11150e.D();
    }

    public void E() {
        AudioTrack audioTrack;
        Z();
        if (ai.f13525a < 21 && (audioTrack = this.r) != null) {
            audioTrack.release();
            this.r = null;
        }
        this.j.a(false);
        this.l.c();
        this.m.b(false);
        this.n.b(false);
        this.k.b();
        this.f11150e.E();
        this.i.c();
        U();
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        if (this.M) {
            ((aa) com.applovin.exoplayer2.l.a.b(this.L)).b(0);
            this.M = false;
        }
        this.I = Collections.emptyList();
        this.N = true;
    }

    public int F() {
        Z();
        return this.f11150e.F();
    }

    public int G() {
        Z();
        return this.f11150e.G();
    }

    public long H() {
        Z();
        return this.f11150e.H();
    }

    public long I() {
        Z();
        return this.f11150e.I();
    }

    public long J() {
        Z();
        return this.f11150e.J();
    }

    public boolean K() {
        Z();
        return this.f11150e.K();
    }

    public int L() {
        Z();
        return this.f11150e.L();
    }

    public int M() {
        Z();
        return this.f11150e.M();
    }

    public long N() {
        Z();
        return this.f11150e.N();
    }

    public long O() {
        Z();
        return this.f11150e.O();
    }

    public ad P() {
        Z();
        return this.f11150e.P();
    }

    public h Q() {
        Z();
        return this.f11150e.Q();
    }

    public ac R() {
        return this.f11150e.R();
    }

    public ba S() {
        Z();
        return this.f11150e.S();
    }

    public o T() {
        return this.P;
    }

    public List<com.applovin.exoplayer2.i.a> V() {
        Z();
        return this.I;
    }

    public void a(float f2) {
        Z();
        float a2 = ai.a(f2, 0.0f, 1.0f);
        if (this.G != a2) {
            this.G = a2;
            W();
            this.i.a(a2);
            Iterator<an.d> it = this.f11153h.iterator();
            while (it.hasNext()) {
                it.next().a(a2);
            }
        }
    }

    public void a(int i2, long j2) {
        Z();
        this.i.d();
        this.f11150e.a(i2, j2);
    }

    public void a(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null) {
            v();
            return;
        }
        U();
        this.w = true;
        this.u = surfaceHolder;
        surfaceHolder.addCallback(this.f11151f);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            a((Object) null);
            a(0, 0);
            return;
        }
        a((Object) surface);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        a(surfaceFrame.width(), surfaceFrame.height());
    }

    public void a(SurfaceView surfaceView) {
        Z();
        if (surfaceView instanceof com.applovin.exoplayer2.m.k) {
            U();
            a((Object) surfaceView);
        } else if (surfaceView instanceof i) {
            U();
            this.v = (i) surfaceView;
            this.f11150e.a((ao.b) this.f11152g).a(10000).a((Object) this.v).i();
            this.v.a(this.f11151f);
            a((Object) this.v.getVideoSurface());
        } else {
            a(surfaceView == null ? null : surfaceView.getHolder());
            return;
        }
        c(surfaceView.getHolder());
    }

    public void a(TextureView textureView) {
        Z();
        if (textureView == null) {
            v();
            return;
        }
        U();
        this.x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            com.applovin.exoplayer2.l.q.c("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f11151f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Object) null);
            a(0, 0);
            return;
        }
        a(surfaceTexture);
        a(textureView.getWidth(), textureView.getHeight());
    }

    @Deprecated
    public void a(an.b bVar) {
        com.applovin.exoplayer2.l.a.b(bVar);
        this.f11150e.a(bVar);
    }

    public void a(an.d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.f11153h.add(dVar);
        a((an.b) dVar);
    }

    public void a(p pVar) {
        Z();
        this.f11150e.a(pVar);
    }

    public void a(boolean z2) {
        Z();
        int a2 = this.k.a(z2, t());
        a(z2, a2, b(z2, a2));
    }

    /* renamed from: b */
    public p e() {
        Z();
        return this.f11150e.e();
    }

    public void b(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder != null && surfaceHolder == this.u) {
            v();
        }
    }

    public void b(SurfaceView surfaceView) {
        Z();
        b(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void b(TextureView textureView) {
        Z();
        if (textureView != null && textureView == this.x) {
            v();
        }
    }

    @Deprecated
    public void b(an.b bVar) {
        this.f11150e.b(bVar);
    }

    public void b(an.d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.f11153h.remove(dVar);
        b((an.b) dVar);
    }

    public void b(boolean z2) {
        Z();
        this.f11150e.b(z2);
    }

    public void c(int i2) {
        Z();
        this.f11150e.c(i2);
    }

    public boolean q() {
        Z();
        return this.f11150e.q();
    }

    public Looper r() {
        return this.f11150e.r();
    }

    public an.a s() {
        Z();
        return this.f11150e.s();
    }

    public int t() {
        Z();
        return this.f11150e.t();
    }

    public int u() {
        Z();
        return this.f11150e.u();
    }

    public void v() {
        Z();
        U();
        a((Object) null);
        a(0, 0);
    }

    public void w() {
        Z();
        boolean x2 = x();
        int a2 = this.k.a(x2, 2);
        a(x2, a2, b(x2, a2));
        this.f11150e.w();
    }

    public boolean x() {
        Z();
        return this.f11150e.x();
    }

    public int y() {
        Z();
        return this.f11150e.y();
    }

    public boolean z() {
        Z();
        return this.f11150e.z();
    }
}
