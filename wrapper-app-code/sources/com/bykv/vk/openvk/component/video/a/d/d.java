package com.bykv.vk.openvk.component.video.a.d;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bykv.vk.openvk.component.video.a.d.c;
import com.bykv.vk.openvk.component.video.api.a;
import com.bykv.vk.openvk.component.video.api.b;
import com.bykv.vk.openvk.component.video.api.f.d;
import com.explorestack.protobuf.openrtb.LossReason;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: SSMediaPlayerWrapper */
public class d implements c.a, c.b, c.C0218c, c.d, c.e, c.f, c.g, com.bykv.vk.openvk.component.video.api.a, d.a {
    private static boolean v = false;
    private static final SparseIntArray x = new SparseIntArray();
    private com.bykv.vk.openvk.component.video.api.c.c A;
    /* access modifiers changed from: private */
    public boolean B;
    /* access modifiers changed from: private */
    public volatile int C;
    private Surface D;
    private Runnable E;
    private a F;
    /* access modifiers changed from: private */
    public boolean G;
    private final Object H;
    private StringBuilder I;
    private long J;
    private long K;
    private boolean L;

    /* renamed from: a  reason: collision with root package name */
    private SurfaceTexture f18121a;

    /* renamed from: b  reason: collision with root package name */
    private SurfaceHolder f18122b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f18123c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18124d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public c f18125e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f18126f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f18127g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18128h;
    /* access modifiers changed from: private */
    public boolean i;
    /* access modifiers changed from: private */
    public volatile int j;
    /* access modifiers changed from: private */
    public long k;
    /* access modifiers changed from: private */
    public final Handler l;
    /* access modifiers changed from: private */
    public boolean m;
    /* access modifiers changed from: private */
    public long n;
    /* access modifiers changed from: private */
    public long o;
    /* access modifiers changed from: private */
    public long p;
    private long q;
    private long r;
    private boolean s;
    private ArrayList<Runnable> t;
    private int u;
    private String w;
    private boolean y;
    /* access modifiers changed from: private */
    public final List<WeakReference<a.C0220a>> z;

    /* access modifiers changed from: private */
    public void a(long j2, long j3) {
        for (WeakReference next : this.z) {
            if (!(next == null || next.get() == null)) {
                ((a.C0220a) next.get()).a((com.bykv.vk.openvk.component.video.api.a) this, j2, j3);
            }
        }
    }

    public d() {
        boolean z2 = false;
        this.f18123c = 0;
        this.f18124d = false;
        this.f18125e = null;
        this.f18126f = false;
        this.f18127g = false;
        this.j = 201;
        this.k = -1;
        this.m = false;
        this.n = 0;
        this.o = Long.MIN_VALUE;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.u = 0;
        this.w = BuildConfig.ADAPTER_VERSION;
        this.z = Collections.synchronizedList(new ArrayList());
        this.A = null;
        this.B = false;
        this.C = 200;
        this.D = null;
        this.E = new Runnable() {
            public void run() {
                long s = d.this.s();
                if (s > 0 && Build.VERSION.SDK_INT >= 23 && d.this.l() && d.this.o != Long.MIN_VALUE) {
                    if (d.this.o == s) {
                        if (!d.this.m && d.this.p >= 400) {
                            d.this.b(701, 800);
                            boolean unused = d.this.m = true;
                        }
                        d dVar = d.this;
                        long unused2 = dVar.p = dVar.p + ((long) d.this.C);
                    } else {
                        if (d.this.m) {
                            d dVar2 = d.this;
                            long unused3 = dVar2.n = dVar2.n + d.this.p;
                            d.this.b(702, 800);
                            com.bykv.vk.openvk.component.video.api.f.c.b("CSJ_VIDEO_MEDIA", "handleMsg:  bufferingDuration =", Long.valueOf(d.this.n), "  bufferCount =", Integer.valueOf(d.this.f18123c));
                        }
                        long unused4 = d.this.p = 0;
                        boolean unused5 = d.this.m = false;
                    }
                }
                if (d.this.q() > 0) {
                    if (d.this.o != s) {
                        if (b.f()) {
                            com.bykv.vk.openvk.component.video.api.f.c.b("CSJ_VIDEO_MEDIA", "run: lastCur = ", Long.valueOf(d.this.o), "  curPosition = ", Long.valueOf(s));
                        }
                        d dVar3 = d.this;
                        dVar3.a(s, dVar3.q());
                    }
                    long unused6 = d.this.o = s;
                }
                if (!d.this.h()) {
                    d.this.l.postDelayed(this, (long) d.this.C);
                    return;
                }
                d dVar4 = d.this;
                dVar4.a(dVar4.q(), d.this.q());
            }
        };
        this.F = new a();
        this.H = new Object();
        this.I = null;
        this.J = 0;
        this.K = 0;
        this.L = false;
        this.u = 0;
        HandlerThread handlerThread = new HandlerThread("tt_pangle_thread_SSMediaPlayerWrapper", -1);
        handlerThread.start();
        this.l = new com.bykv.vk.openvk.component.video.api.f.d(handlerThread.getLooper(), this);
        this.L = Build.VERSION.SDK_INT >= 17 ? true : z2;
        this.l.post(new Runnable() {
            public void run() {
                d.this.u();
            }
        });
    }

    private void t() {
        this.n = 0;
        this.f18123c = 0;
        this.p = 0;
        this.m = false;
        this.o = Long.MIN_VALUE;
    }

    public void b(final boolean z2) {
        this.y = z2;
        c cVar = this.f18125e;
        if (cVar != null) {
            cVar.a(z2);
        } else {
            this.l.post(new Runnable() {
                public void run() {
                    if (d.this.f18125e != null) {
                        d.this.f18125e.a(z2);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void u() {
        if (this.f18125e == null) {
            b bVar = new b();
            this.f18125e = bVar;
            this.w = BuildConfig.ADAPTER_VERSION;
            bVar.a((c.e) this);
            this.f18125e.a((c.b) this);
            this.f18125e.a((c.C0218c) this);
            this.f18125e.a((c.a) this);
            this.f18125e.a((c.f) this);
            this.f18125e.a((c.d) this);
            this.f18125e.a((c.g) this);
            try {
                this.f18125e.c(this.f18126f);
            } catch (Throwable th) {
                com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "setLooping error: ", th);
            }
            this.f18127g = false;
        }
    }

    public void a(boolean z2, long j2, boolean z3) {
        com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start firstSeekToPosition=" + j2 + ",firstPlay :" + z2 + ",isPauseOtherMusicVolume=" + z3);
        if (this.f18125e != null) {
            this.B = z3;
            this.G = false;
            a(z3);
            if (z2) {
                com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "[video] first start , SSMediaPlayer  start method !");
                this.k = j2;
                v();
            } else {
                this.F.a(j2);
                if (this.y) {
                    b((Runnable) this.F);
                } else {
                    a((Runnable) this.F);
                }
            }
            this.l.postDelayed(this.E, (long) this.C);
        }
    }

    public void a() {
        Handler handler = this.l;
        if (handler != null) {
            handler.post(new Runnable() {
                public void run() {
                    if (d.this.m() && d.this.f18125e != null) {
                        try {
                            d.this.f18125e.e();
                            com.bykv.vk.openvk.component.video.api.f.c.b("CSJ_VIDEO_MEDIA", "resume play exec start ");
                            for (WeakReference weakReference : d.this.z) {
                                if (!(weakReference == null || weakReference.get() == null)) {
                                    ((a.C0220a) weakReference.get()).e(d.this);
                                }
                            }
                            int unused = d.this.j = LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE_VALUE;
                        } catch (Throwable th) {
                            com.bykv.vk.openvk.component.video.api.f.c.b("CSJ_VIDEO_MEDIA", "play: catch exception ", th.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* compiled from: SSMediaPlayerWrapper */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private long f18149b;

        a() {
        }

        public void a(long j) {
            this.f18149b = j;
        }

        public void run() {
            if (d.this.f18125e != null) {
                try {
                    long unused = d.this.k = Math.max(this.f18149b, d.this.f18125e.i());
                } catch (Throwable th) {
                    com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start  error: getCurrentPosition :" + th.toString());
                }
            }
            d.this.l.sendEmptyMessageDelayed(100, 0);
            com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start not first play ! sendMsg --> OP_START , video start to play !");
        }
    }

    public void b() {
        com.bykv.vk.openvk.component.video.api.f.c.b("CSJ_VIDEO_MEDIA", "pause: ");
        this.l.removeMessages(100);
        this.G = true;
        this.l.sendEmptyMessage(101);
    }

    public void d() {
        this.j = LossReason.LOSS_REASON_CREATIVE_FILTERED_SIZE_NOT_ALLOWED_VALUE;
        B();
        if (this.l != null) {
            try {
                b("release");
                this.l.removeCallbacksAndMessages((Object) null);
                if (this.f18125e != null) {
                    this.i = true;
                    this.l.sendEmptyMessage(103);
                }
            } catch (Throwable th) {
                x();
                throw th;
            }
            x();
        }
    }

    private void v() {
        com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke !");
        b((Runnable) new Runnable() {
            public void run() {
                if (d.this.l != null) {
                    d.this.l.sendEmptyMessage(104);
                    com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke ! sendMsg --> OP_PREPARE_ASYNC");
                }
            }
        });
    }

    public void c() {
        b((Runnable) new Runnable() {
            public void run() {
                if (d.this.l != null) {
                    d.this.l.sendEmptyMessage(105);
                }
            }
        });
    }

    public void a(final long j2) {
        if (this.j == 207 || this.j == 206 || this.j == 209) {
            b((Runnable) new Runnable() {
                public void run() {
                    if (d.this.l != null) {
                        d.this.l.obtainMessage(106, Long.valueOf(j2)).sendToTarget();
                    }
                }
            });
        }
    }

    public boolean e() {
        return this.f18124d;
    }

    public void a(final SurfaceTexture surfaceTexture) {
        this.f18121a = surfaceTexture;
        b(true);
        b((Runnable) new Runnable() {
            public void run() {
                d.this.u();
                if (d.this.l != null) {
                    d.this.l.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void a(final SurfaceHolder surfaceHolder) {
        this.f18122b = surfaceHolder;
        b(true);
        b((Runnable) new Runnable() {
            public void run() {
                d.this.u();
                if (d.this.l != null) {
                    d.this.l.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void a(final com.bykv.vk.openvk.component.video.api.c.c cVar) {
        this.A = cVar;
        b((Runnable) new Runnable() {
            public void run() {
                d.this.u();
                if (d.this.l != null) {
                    d.this.l.obtainMessage(107, cVar).sendToTarget();
                }
            }
        });
    }

    public boolean l() {
        return (this.j == 206 || this.l.hasMessages(100)) && !this.G;
    }

    public boolean i() {
        return r() || l() || m();
    }

    public boolean m() {
        return (this.j == 207 || this.G) && !this.l.hasMessages(100);
    }

    public boolean n() {
        return this.j == 203;
    }

    public boolean r() {
        return this.j == 205;
    }

    public boolean h() {
        return this.j == 209;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ea, code lost:
        r5 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.os.Message r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            int r2 = r0.what
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[video]  execute , mCurrentState = "
            r3.append(r4)
            int r4 = r1.j
            r3.append(r4)
            java.lang.String r4 = " handlerMsg="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "CSJ_VIDEO_MEDIA"
            com.bykv.vk.openvk.component.video.api.f.c.a((java.lang.String) r4, (java.lang.String) r3)
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f18125e
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x02e7
            int r3 = r0.what
            java.lang.String r7 = "[video] OP_RELEASE execute , releaseMediaplayer !"
            r8 = 203(0xcb, float:2.84E-43)
            r11 = 201(0xc9, float:2.82E-43)
            r12 = 202(0xca, float:2.83E-43)
            r13 = 205(0xcd, float:2.87E-43)
            r14 = 208(0xd0, float:2.91E-43)
            r15 = 209(0xd1, float:2.93E-43)
            r9 = 206(0xce, float:2.89E-43)
            r10 = 207(0xcf, float:2.9E-43)
            switch(r3) {
                case 100: goto L_0x02a6;
                case 101: goto L_0x024c;
                case 102: goto L_0x0238;
                case 103: goto L_0x0201;
                case 104: goto L_0x01e1;
                case 105: goto L_0x01bc;
                case 106: goto L_0x0199;
                case 107: goto L_0x008d;
                case 108: goto L_0x0043;
                case 109: goto L_0x0043;
                case 110: goto L_0x006d;
                case 111: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x02e7
        L_0x0045:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0065 }
            r7 = 14
            if (r3 < r7) goto L_0x005b
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0065 }
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0     // Catch:{ all -> 0x0065 }
            android.view.Surface r3 = new android.view.Surface     // Catch:{ all -> 0x0065 }
            r3.<init>(r0)     // Catch:{ all -> 0x0065 }
            r1.D = r3     // Catch:{ all -> 0x0065 }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f18125e     // Catch:{ all -> 0x0065 }
            r0.a((android.view.Surface) r3)     // Catch:{ all -> 0x0065 }
        L_0x005b:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f18125e     // Catch:{ all -> 0x0065 }
            r0.b(r6)     // Catch:{ all -> 0x0065 }
            r16.A()     // Catch:{ all -> 0x0065 }
            goto L_0x02e7
        L_0x0065:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_SURFACE error: "
            com.bykv.vk.openvk.component.video.api.f.c.a(r4, r3, r0)
            goto L_0x02e7
        L_0x006d:
            java.lang.String r3 = "resumeVideo:  OP_SET_DISPLAY "
            com.bykv.vk.openvk.component.video.api.f.c.b((java.lang.String) r4, (java.lang.String) r3)
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0085 }
            android.view.SurfaceHolder r0 = (android.view.SurfaceHolder) r0     // Catch:{ all -> 0x0085 }
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f18125e     // Catch:{ all -> 0x0085 }
            r3.a((android.view.SurfaceHolder) r0)     // Catch:{ all -> 0x0085 }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f18125e     // Catch:{ all -> 0x0085 }
            r0.b(r6)     // Catch:{ all -> 0x0085 }
            r16.A()     // Catch:{ all -> 0x0085 }
            goto L_0x02e7
        L_0x0085:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_DISPLAY error: "
            com.bykv.vk.openvk.component.video.api.f.c.a(r4, r3, r0)
            goto L_0x02e7
        L_0x008d:
            r16.t()
            int r3 = r1.j
            if (r3 == r11) goto L_0x0098
            int r3 = r1.j
            if (r3 != r8) goto L_0x01ea
        L_0x0098:
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x0191 }
            com.bykv.vk.openvk.component.video.api.c.c r0 = (com.bykv.vk.openvk.component.video.api.c.c) r0     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r0.a()     // Catch:{ all -> 0x0191 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = com.bykv.vk.openvk.component.video.api.b.b()     // Catch:{ all -> 0x0191 }
            r0.a((java.lang.String) r3)     // Catch:{ all -> 0x0191 }
        L_0x00ad:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.a()     // Catch:{ all -> 0x0191 }
            java.lang.String r8 = r0.k()     // Catch:{ all -> 0x0191 }
            r3.<init>(r7, r8)     // Catch:{ all -> 0x0191 }
            boolean r7 = r3.exists()     // Catch:{ all -> 0x0191 }
            if (r7 == 0) goto L_0x00f2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r0.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： try paly local:"
            r0.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r0.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.vk.openvk.component.video.api.f.c.a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            boolean r0 = com.bykv.vk.openvk.component.video.api.b.d()     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r1.a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x00e7:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f18125e     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0191 }
            r0.a((java.lang.String) r3)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x00f2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： paly net:"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.j()     // Catch:{ all -> 0x0191 }
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.vk.openvk.component.video.api.f.c.a((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ all -> 0x0191 }
            int r3 = r0.f18172b     // Catch:{ all -> 0x0191 }
            r7 = 23
            if (r3 != r6) goto L_0x0136
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0191 }
            if (r3 >= r7) goto L_0x0136
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f18125e     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r0.j()     // Catch:{ all -> 0x0191 }
            r3.a((java.lang.String) r7)     // Catch:{ all -> 0x0191 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 直接设置 url"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.j()     // Catch:{ all -> 0x0191 }
            r3.append(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.vk.openvk.component.video.api.f.c.a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0136:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0191 }
            if (r3 < r7) goto L_0x0158
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f18125e     // Catch:{ all -> 0x0191 }
            r3.a((com.bykv.vk.openvk.component.video.api.c.c) r0)     // Catch:{ all -> 0x0191 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r3.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 使用MediaDataSource接口 url"
            r3.append(r7)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.j()     // Catch:{ all -> 0x0191 }
            r3.append(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0191 }
            com.bykv.vk.openvk.component.video.api.f.c.a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0158:
            com.bykv.vk.openvk.component.video.a.b.f.a r3 = com.bykv.vk.openvk.component.video.a.b.f.a.a()     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r3.b(r0)     // Catch:{ all -> 0x0191 }
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = "setDataSource： 本地代理模式 local url = "
            r3[r5] = r7     // Catch:{ all -> 0x0191 }
            r3[r6] = r0     // Catch:{ all -> 0x0191 }
            com.bykv.vk.openvk.component.video.api.f.c.a((java.lang.String) r4, (java.lang.Object[]) r3)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0188
            boolean r3 = com.bykv.vk.openvk.component.video.api.b.d()     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x0188
            java.lang.String r3 = "file"
            boolean r3 = r0.startsWith(r3)     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x0188
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0191 }
            r1.a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            goto L_0x018d
        L_0x0188:
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f18125e     // Catch:{ all -> 0x0191 }
            r3.a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
        L_0x018d:
            r1.j = r12     // Catch:{ all -> 0x0191 }
            goto L_0x02e7
        L_0x0191:
            r0 = move-exception
            java.lang.String r3 = "OP_SET_DATASOURCE error: "
            com.bykv.vk.openvk.component.video.api.f.c.a(r4, r3, r0)
            goto L_0x02e7
        L_0x0199:
            int r3 = r1.j
            if (r3 == r9) goto L_0x01a5
            int r3 = r1.j
            if (r3 == r10) goto L_0x01a5
            int r3 = r1.j
            if (r3 != r15) goto L_0x01ea
        L_0x01a5:
            com.bykv.vk.openvk.component.video.a.d.c r3 = r1.f18125e     // Catch:{ all -> 0x01b4 }
            java.lang.Object r0 = r0.obj     // Catch:{ all -> 0x01b4 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01b4 }
            long r7 = r0.longValue()     // Catch:{ all -> 0x01b4 }
            r3.a((long) r7)     // Catch:{ all -> 0x01b4 }
            goto L_0x02e7
        L_0x01b4:
            r0 = move-exception
            java.lang.String r3 = "OP_SEEKTO error: "
            com.bykv.vk.openvk.component.video.api.f.c.a(r4, r3, r0)
            goto L_0x02e7
        L_0x01bc:
            int r0 = r1.j
            if (r0 == r13) goto L_0x01d0
            int r0 = r1.j
            if (r0 == r9) goto L_0x01d0
            int r0 = r1.j
            if (r0 == r14) goto L_0x01d0
            int r0 = r1.j
            if (r0 == r10) goto L_0x01d0
            int r0 = r1.j
            if (r0 != r15) goto L_0x01ea
        L_0x01d0:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f18125e     // Catch:{ all -> 0x01d9 }
            r0.f()     // Catch:{ all -> 0x01d9 }
            r1.j = r14     // Catch:{ all -> 0x01d9 }
            goto L_0x02e7
        L_0x01d9:
            r0 = move-exception
            java.lang.String r3 = "OP_STOP error: "
            com.bykv.vk.openvk.component.video.api.f.c.a(r4, r3, r0)
            goto L_0x02e7
        L_0x01e1:
            int r0 = r1.j
            if (r0 == r12) goto L_0x01ed
            int r0 = r1.j
            if (r0 != r14) goto L_0x01ea
            goto L_0x01ed
        L_0x01ea:
            r5 = 1
            goto L_0x02e7
        L_0x01ed:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f18125e     // Catch:{ all -> 0x01f9 }
            r0.h()     // Catch:{ all -> 0x01f9 }
            java.lang.String r0 = "[video] OP_PREPARE_ASYNC execute , mMediaPlayer real prepareAsync !"
            com.bykv.vk.openvk.component.video.api.f.c.a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x01f9 }
            goto L_0x02e7
        L_0x01f9:
            r0 = move-exception
            java.lang.String r3 = "OP_PREPARE_ASYNC error: "
            com.bykv.vk.openvk.component.video.api.f.c.c(r4, r3, r0)
            goto L_0x02e7
        L_0x0201:
            r16.w()     // Catch:{ all -> 0x0208 }
            com.bykv.vk.openvk.component.video.api.f.c.a((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ all -> 0x0208 }
            goto L_0x020e
        L_0x0208:
            r0 = move-exception
            java.lang.String r3 = "OP_RELEASE error: "
            com.bykv.vk.openvk.component.video.api.f.c.c(r4, r3, r0)
        L_0x020e:
            r1.i = r5
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r0 = r1.z
            java.util.Iterator r0 = r0.iterator()
        L_0x0216:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0234
            java.lang.Object r3 = r0.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L_0x0216
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L_0x0216
            java.lang.Object r3 = r3.get()
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.vk.openvk.component.video.api.a.C0220a) r3
            r3.c(r1)
            goto L_0x0216
        L_0x0234:
            r1.j = r8
            goto L_0x02e7
        L_0x0238:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f18125e     // Catch:{ all -> 0x0244 }
            r0.l()     // Catch:{ all -> 0x0244 }
            com.bykv.vk.openvk.component.video.api.f.c.a((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ all -> 0x0244 }
            r1.j = r11     // Catch:{ all -> 0x0244 }
            goto L_0x02e7
        L_0x0244:
            r0 = move-exception
            java.lang.String r3 = "OP_RESET error: "
            com.bykv.vk.openvk.component.video.api.f.c.a(r4, r3, r0)
            goto L_0x02e7
        L_0x024c:
            boolean r0 = r1.m
            if (r0 == 0) goto L_0x0257
            long r7 = r1.n
            long r11 = r1.p
            long r7 = r7 + r11
            r1.n = r7
        L_0x0257:
            r1.m = r5
            r7 = 0
            r1.p = r7
            r7 = -9223372036854775808
            r1.o = r7
            int r0 = r1.j
            if (r0 == r9) goto L_0x026d
            int r0 = r1.j
            if (r0 == r10) goto L_0x026d
            int r0 = r1.j
            if (r0 != r15) goto L_0x01ea
        L_0x026d:
            java.lang.String r0 = "[video] OP_PAUSE execute , mMediaPlayer  OP_PAUSE !"
            com.bykv.vk.openvk.component.video.api.f.c.a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x029f }
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f18125e     // Catch:{ all -> 0x029f }
            r0.g()     // Catch:{ all -> 0x029f }
            r1.j = r10     // Catch:{ all -> 0x029f }
            r1.G = r5     // Catch:{ all -> 0x029f }
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r0 = r1.z     // Catch:{ all -> 0x029f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x029f }
        L_0x0281:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x029f }
            if (r3 == 0) goto L_0x02e7
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x029f }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x029f }
            if (r3 == 0) goto L_0x0281
            java.lang.Object r7 = r3.get()     // Catch:{ all -> 0x029f }
            if (r7 == 0) goto L_0x0281
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x029f }
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.vk.openvk.component.video.api.a.C0220a) r3     // Catch:{ all -> 0x029f }
            r3.d(r1)     // Catch:{ all -> 0x029f }
            goto L_0x0281
        L_0x029f:
            r0 = move-exception
            java.lang.String r3 = "OP_PAUSE error: "
            com.bykv.vk.openvk.component.video.api.f.c.a(r4, r3, r0)
            goto L_0x02e7
        L_0x02a6:
            int r0 = r1.j
            if (r0 == r13) goto L_0x02b2
            int r0 = r1.j
            if (r0 == r10) goto L_0x02b2
            int r0 = r1.j
            if (r0 != r15) goto L_0x01ea
        L_0x02b2:
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f18125e     // Catch:{ all -> 0x02e1 }
            r0.e()     // Catch:{ all -> 0x02e1 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02e1 }
            r1.r = r7     // Catch:{ all -> 0x02e1 }
            java.lang.String r0 = "[video] OP_START execute , mMediaPlayer real start !"
            com.bykv.vk.openvk.component.video.api.f.c.a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x02e1 }
            r1.j = r9     // Catch:{ all -> 0x02e1 }
            long r7 = r1.k     // Catch:{ all -> 0x02e1 }
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d7
            com.bykv.vk.openvk.component.video.a.d.c r0 = r1.f18125e     // Catch:{ all -> 0x02e1 }
            long r7 = r1.k     // Catch:{ all -> 0x02e1 }
            r0.a((long) r7)     // Catch:{ all -> 0x02e1 }
            r7 = -1
            r1.k = r7     // Catch:{ all -> 0x02e1 }
        L_0x02d7:
            com.bykv.vk.openvk.component.video.api.c.c r0 = r1.A     // Catch:{ all -> 0x02e1 }
            if (r0 == 0) goto L_0x02e7
            boolean r0 = r1.B     // Catch:{ all -> 0x02e1 }
            r1.a((boolean) r0)     // Catch:{ all -> 0x02e1 }
            goto L_0x02e7
        L_0x02e1:
            r0 = move-exception
            java.lang.String r3 = "OP_START error: "
            com.bykv.vk.openvk.component.video.api.f.c.a(r4, r3, r0)
        L_0x02e7:
            if (r5 == 0) goto L_0x031e
            r0 = 200(0xc8, float:2.8E-43)
            r1.j = r0
            boolean r0 = r1.f18127g
            if (r0 != 0) goto L_0x031e
            com.bykv.vk.openvk.component.video.api.c.a r0 = new com.bykv.vk.openvk.component.video.api.c.a
            r3 = 308(0x134, float:4.32E-43)
            r0.<init>(r3, r2)
            java.util.List<java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.api.a$a>> r2 = r1.z
            java.util.Iterator r2 = r2.iterator()
        L_0x02fe:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x031c
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L_0x02fe
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L_0x02fe
            java.lang.Object r3 = r3.get()
            com.bykv.vk.openvk.component.video.api.a$a r3 = (com.bykv.vk.openvk.component.video.api.a.C0220a) r3
            r3.a((com.bykv.vk.openvk.component.video.api.a) r1, (com.bykv.vk.openvk.component.video.api.c.a) r0)
            goto L_0x02fe
        L_0x031c:
            r1.f18127g = r6
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.a.d.d.a(android.os.Message):void");
    }

    private void a(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.f18125e.a(fileInputStream.getFD());
        fileInputStream.close();
    }

    private void w() {
        com.bykv.vk.openvk.component.video.api.f.c.b("CSJ_VIDEO_MEDIA", "releaseMediaPlayer: ");
        c cVar = this.f18125e;
        if (cVar != null) {
            try {
                cVar.l();
            } catch (Throwable th) {
                com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "releaseMediaplayer error1: ", th);
            }
            this.f18125e.a((c.b) null);
            this.f18125e.a((c.g) null);
            this.f18125e.a((c.a) null);
            this.f18125e.a((c.d) null);
            this.f18125e.a((c.C0218c) null);
            this.f18125e.a((c.e) null);
            this.f18125e.a((c.f) null);
            try {
                this.f18125e.k();
            } catch (Throwable th2) {
                com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "releaseMediaplayer error2: ", th2);
            }
        }
    }

    private void x() {
        Handler handler = this.l;
        if (handler != null && handler.getLooper() != null) {
            this.l.post(new Runnable() {
                public void run() {
                    if (d.this.l.getLooper() != null) {
                        try {
                            com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "onDestory............");
                            d.this.l.getLooper().quit();
                        } catch (Throwable th) {
                            com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "onDestroy error: ", th);
                        }
                    }
                }
            });
        }
    }

    public void a(c cVar, int i2) {
        if (this.f18125e == cVar) {
            for (WeakReference next : this.z) {
                if (!(next == null || next.get() == null)) {
                    ((a.C0220a) next.get()).b(this, i2);
                }
            }
        }
    }

    private void y() {
        Integer valueOf = Integer.valueOf(x.get(this.u));
        if (valueOf == null) {
            x.put(this.u, 1);
        } else {
            x.put(this.u, Integer.valueOf(valueOf.intValue() + 1).intValue());
        }
    }

    public void a(c cVar) {
        this.j = !this.f18126f ? LossReason.LOSS_REASON_CREATIVE_FILTERED_CREATIVE_ATTRIBUTE_EXCLUSIONS_VALUE : LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE_VALUE;
        x.delete(this.u);
        for (WeakReference next : this.z) {
            if (!(next == null || next.get() == null)) {
                ((a.C0220a) next.get()).a(this);
            }
        }
        b("completion");
    }

    public boolean a(c cVar, int i2, int i3) {
        com.bykv.vk.openvk.component.video.api.f.c.c("CSJ_VIDEO_MEDIA", "what=" + i2 + "extra=" + i3);
        y();
        this.j = 200;
        Handler handler = this.l;
        if (handler != null) {
            handler.removeCallbacks(this.E);
        }
        if (a(i2, i3)) {
            x();
        }
        if (!this.f18127g) {
            com.bykv.vk.openvk.component.video.api.c.a aVar = new com.bykv.vk.openvk.component.video.api.c.a(308, i3);
            for (WeakReference next : this.z) {
                if (!(next == null || next.get() == null)) {
                    ((a.C0220a) next.get()).a((com.bykv.vk.openvk.component.video.api.a) this, aVar);
                }
            }
            this.f18127g = true;
            return true;
        }
        com.bykv.vk.openvk.component.video.api.c.a aVar2 = new com.bykv.vk.openvk.component.video.api.c.a(i2, i3);
        for (WeakReference next2 : this.z) {
            if (!(next2 == null || next2.get() == null)) {
                ((a.C0220a) next2.get()).a((com.bykv.vk.openvk.component.video.api.a) this, aVar2);
            }
        }
        return true;
    }

    private boolean a(int i2, int i3) {
        com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "OnError - Error code: " + i2 + " Extra code: " + i3);
        boolean z2 = i2 == -1010 || i2 == -1007 || i2 == -1004 || i2 == -110 || i2 == 100 || i2 == 200;
        if (i3 == 1 || i3 == 700 || i3 == 800) {
            return true;
        }
        return z2;
    }

    public boolean b(c cVar, int i2, int i3) {
        com.bykv.vk.openvk.component.video.api.f.c.c("CSJ_VIDEO_MEDIA", "what,extra:" + i2 + "," + i3);
        if (this.f18125e != cVar) {
            return false;
        }
        if (i3 == -1004) {
            com.bykv.vk.openvk.component.video.api.c.a aVar = new com.bykv.vk.openvk.component.video.api.c.a(i2, i3);
            for (WeakReference next : this.z) {
                if (!(next == null || next.get() == null)) {
                    ((a.C0220a) next.get()).a((com.bykv.vk.openvk.component.video.api.a) this, aVar);
                }
            }
        }
        b(i2, i3);
        return false;
    }

    /* access modifiers changed from: private */
    public void b(int i2, int i3) {
        String str;
        int i4 = i2;
        if (i4 == 701) {
            this.J = SystemClock.elapsedRealtime();
            this.f18123c++;
            for (WeakReference next : this.z) {
                if (!(next == null || next.get() == null)) {
                    ((a.C0220a) next.get()).a(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            com.bykv.vk.openvk.component.video.api.f.c.b("CSJ_VIDEO_MEDIA", "bufferCount = ", Integer.valueOf(this.f18123c));
        } else if (i4 == 702) {
            if (this.J > 0) {
                str = "CSJ_VIDEO_MEDIA";
                this.K += SystemClock.elapsedRealtime() - this.J;
                this.J = 0;
            } else {
                str = "CSJ_VIDEO_MEDIA";
            }
            for (WeakReference next2 : this.z) {
                if (!(next2 == null || next2.get() == null)) {
                    ((a.C0220a) next2.get()).a((com.bykv.vk.openvk.component.video.api.a) this, Integer.MAX_VALUE);
                }
            }
            com.bykv.vk.openvk.component.video.api.f.c.b(str, "bufferCount = ", Integer.valueOf(this.f18123c), " mBufferTotalTime = ", Long.valueOf(this.K));
        } else {
            String str2 = "CSJ_VIDEO_MEDIA";
            if (this.L && i4 == 3) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.r;
                this.f18124d = true;
                for (WeakReference next3 : this.z) {
                    if (!(next3 == null || next3.get() == null)) {
                        ((a.C0220a) next3.get()).a((com.bykv.vk.openvk.component.video.api.a) this, elapsedRealtime);
                    }
                }
                a(this.B);
                com.bykv.vk.openvk.component.video.api.f.c.b(str2, "onRenderStart");
            }
        }
    }

    public void b(c cVar) {
        this.j = LossReason.LOSS_REASON_CREATIVE_FILTERED_ADVERTISER_EXCLUSIONS_VALUE;
        if (this.G) {
            this.l.post(new Runnable() {
                public void run() {
                    try {
                        d.this.f18125e.g();
                        int unused = d.this.j = LossReason.LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS_VALUE;
                        boolean unused2 = d.this.G = false;
                    } catch (Throwable th) {
                        com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "onPrepared error: ", th);
                    }
                }
            });
        } else {
            Handler handler = this.l;
            handler.sendMessage(handler.obtainMessage(100, -1, -1));
        }
        x.delete(this.u);
        if (!this.L && !this.s) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.r;
            for (WeakReference next : this.z) {
                if (!(next == null || next.get() == null)) {
                    ((a.C0220a) next.get()).a((com.bykv.vk.openvk.component.video.api.a) this, elapsedRealtime);
                }
            }
            this.f18124d = true;
            this.s = true;
        }
        for (WeakReference next2 : this.z) {
            if (!(next2 == null || next2.get() == null)) {
                ((a.C0220a) next2.get()).b(this);
            }
        }
    }

    public void c(c cVar) {
        for (WeakReference next : this.z) {
            if (!(next == null || next.get() == null)) {
                ((a.C0220a) next.get()).a((com.bykv.vk.openvk.component.video.api.a) this, true);
            }
        }
    }

    private void a(Runnable runnable) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(runnable);
    }

    private void z() {
        if (!this.f18128h) {
            this.f18128h = true;
            Iterator it = new ArrayList(this.t).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.t.clear();
            this.f18128h = false;
        }
    }

    private void A() {
        ArrayList<Runnable> arrayList = this.t;
        if (arrayList != null && !arrayList.isEmpty()) {
            z();
        }
    }

    private void B() {
        ArrayList<Runnable> arrayList = this.t;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.t.clear();
        }
    }

    private void b(Runnable runnable) {
        if (runnable != null) {
            if (!this.i) {
                runnable.run();
            } else {
                a(runnable);
            }
        }
    }

    public void a(final boolean z2) {
        b.c().post(new Runnable() {
            public void run() {
                com.bykv.vk.openvk.component.video.api.f.c.b("CSJ_VIDEO_MEDIA", "run:before setQuietPlay ", Boolean.valueOf(z2));
                if (!d.this.i && d.this.j != 203 && d.this.f18125e != null) {
                    try {
                        com.bykv.vk.openvk.component.video.api.f.c.b("CSJ_VIDEO_MEDIA", "run:exec  setQuietPlay ", Boolean.valueOf(z2));
                        boolean unused = d.this.B = z2;
                        d.this.f18125e.d(z2);
                    } catch (Throwable th) {
                        com.bykv.vk.openvk.component.video.api.f.c.a("CSJ_VIDEO_MEDIA", "setQuietPlay error: ", th);
                    }
                }
            }
        });
    }

    private void b(String str) {
        Handler handler = this.l;
        if (handler != null) {
            handler.removeMessages(201);
        }
        synchronized (this.H) {
            if (this.I != null) {
                this.I = null;
            }
        }
    }

    public long o() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.K;
        }
        if (this.m) {
            long j2 = this.p;
            if (j2 > 0) {
                return this.n + j2;
            }
        }
        return this.n;
    }

    public int j() {
        c cVar = this.f18125e;
        if (cVar != null) {
            return cVar.m();
        }
        return 0;
    }

    public int k() {
        c cVar = this.f18125e;
        if (cVar != null) {
            return cVar.n();
        }
        return 0;
    }

    public int p() {
        return this.f18123c;
    }

    public void a(c cVar, int i2, int i3, int i4, int i5) {
        for (WeakReference next : this.z) {
            if (!(next == null || next.get() == null)) {
                ((a.C0220a) next.get()).a((com.bykv.vk.openvk.component.video.api.a) this, i2, i3);
            }
        }
    }

    public long q() {
        long j2 = this.q;
        if (j2 != 0) {
            return j2;
        }
        if (this.j == 206 || this.j == 207) {
            try {
                this.q = this.f18125e.j();
            } catch (Throwable unused) {
            }
        }
        return this.q;
    }

    public long s() {
        if (this.j != 206 && this.j != 207) {
            return 0;
        }
        try {
            return this.f18125e.i();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void a(a.C0220a aVar) {
        if (aVar != null) {
            for (WeakReference next : this.z) {
                if (next != null && next.get() == aVar) {
                    return;
                }
            }
            this.z.add(new WeakReference(aVar));
        }
    }

    public SurfaceHolder f() {
        return this.f18122b;
    }

    public SurfaceTexture g() {
        return this.f18121a;
    }
}
