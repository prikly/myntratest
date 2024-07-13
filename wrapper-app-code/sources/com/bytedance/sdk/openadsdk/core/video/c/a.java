package com.bytedance.sdk.openadsdk.core.video.c;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.component.video.api.a;
import com.bykv.vk.openvk.component.video.api.d.b;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.d;
import com.bytedance.sdk.openadsdk.core.widget.e;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Map;

/* compiled from: BaseVideoController */
public abstract class a extends com.bytedance.sdk.openadsdk.core.video.a.a {
    /* access modifiers changed from: private */
    public long A = 0;
    /* access modifiers changed from: private */
    public long B = 0;
    /* access modifiers changed from: private */
    public c.a C;
    /* access modifiers changed from: private */
    public boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private WeakReference<c.b> G;
    private int H;
    /* access modifiers changed from: private */
    public boolean I = false;
    private boolean J = true;
    /* access modifiers changed from: private */
    public long K;
    private boolean L = false;
    /* access modifiers changed from: private */
    public boolean M;
    /* access modifiers changed from: private */
    public final Runnable N = new Runnable() {
        public void run() {
            if (a.this.C != null) {
                a.this.z();
                a.this.C.a();
            }
        }
    };
    private long O;
    private final BroadcastReceiver P = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    a.this.b();
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    int i = 0;
                    if (!intent.getBooleanExtra("noConnectivity", false)) {
                        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                        if (networkInfo != null) {
                            int type = networkInfo.getType();
                            if (type == 1) {
                                i = 4;
                            } else if (type == 0) {
                                i = 1;
                            }
                        } else {
                            i = o.c(context);
                        }
                    }
                    a.this.a(context, i);
                }
            } catch (Throwable unused) {
            }
        }
    };
    private int Q = 1;
    private boolean R = false;
    protected Map<String, Object> s = null;
    protected long t = 0;
    protected long u = 0;
    protected boolean v = false;
    protected boolean w = false;
    protected com.bykv.vk.openvk.component.video.api.c.c x;
    a.C0220a y = new a.C0220a() {
        public void d(com.bykv.vk.openvk.component.video.api.a aVar) {
        }

        public void e(com.bykv.vk.openvk.component.video.api.a aVar) {
        }

        public void a(com.bykv.vk.openvk.component.video.api.a aVar) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onCompletion: ");
            a.this.k.post(new Runnable() {
                public void run() {
                    a.this.O();
                }
            });
            if (a.this.f1589e.ax() != null && a.this.f1589e.ax().a() != null) {
                a.this.f1589e.ax().a().d(a.this.g());
                a.this.f1589e.ax().a().e(a.this.g());
            }
        }

        public void a(com.bykv.vk.openvk.component.video.api.a aVar, final long j) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onRenderStart: ");
            a.this.k.post(new Runnable() {
                public void run() {
                    if (a.this.f1588d != null) {
                        a.this.f1588d.b();
                        a.this.k.removeCallbacks(a.this.N);
                        boolean unused = a.this.I = false;
                    }
                    if (!a.this.D) {
                        a.this.u = j;
                        a.this.x();
                        a.this.V();
                        boolean unused2 = a.this.D = true;
                        a.this.w = true;
                    }
                }
            });
            long unused = a.this.K = System.currentTimeMillis();
        }

        public void b(com.bykv.vk.openvk.component.video.api.a aVar) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onPrepared: ");
            a.this.k.post(new Runnable() {
                public void run() {
                    if (a.this.k != null) {
                        a.this.k.removeCallbacks(a.this.N);
                    }
                    if (a.this.f1588d != null) {
                        a.this.f1588d.b();
                    }
                }
            });
        }

        public void a(com.bykv.vk.openvk.component.video.api.a aVar, final com.bykv.vk.openvk.component.video.api.c.a aVar2) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onError: ");
            if (aVar2 != null) {
                a.this.k.post(new Runnable() {
                    public void run() {
                        a.this.a(aVar2.a(), aVar2.b());
                        a.this.k.removeCallbacks(a.this.N);
                        if (a.this.f1588d != null) {
                            a.this.f1588d.b();
                        }
                        if (a.this.C != null) {
                            a.this.C.b(a.this.B, com.bykv.vk.openvk.component.video.a.e.a.a(a.this.f1590f, a.this.q));
                        }
                    }
                });
                aVar2.a();
                aVar2.c();
            }
        }

        public void a(com.bykv.vk.openvk.component.video.api.a aVar, boolean z) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onSeekCompletion: ");
            a.this.k.post(new Runnable() {
                public void run() {
                    a.this.k.removeCallbacks(a.this.N);
                    if (a.this.f1588d != null) {
                        a.this.f1588d.b();
                    }
                }
            });
        }

        public void c(com.bykv.vk.openvk.component.video.api.a aVar) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onRelease: ");
        }

        public void a(com.bykv.vk.openvk.component.video.api.a aVar, int i, int i2) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onVideoSizeChanged: ");
            a.this.k.post(new Runnable() {
                public void run() {
                    if (!a.this.P()) {
                        a.this.Q();
                    } else if (a.this.f1589e != null && (com.bytedance.sdk.openadsdk.core.e.l.b(a.this.f1589e) || a.this.M)) {
                        a.this.g(true);
                    } else if (a.this.f1589e != null && a.this.f1589e.t() == 3) {
                        a.this.g(true);
                    } else if (a.this.f1589e == null || a.this.f1589e.t() != 0) {
                        a.this.S();
                    } else {
                        a.this.T();
                    }
                }
            });
        }

        public void a(com.bykv.vk.openvk.component.video.api.a aVar, int i, int i2, int i3) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferStart: ");
            a.this.k.post(new Runnable() {
                public void run() {
                    if (a.this.f1588d != null) {
                        a.this.f1588d.u();
                        a.this.N();
                        boolean unused = a.this.I = true;
                    }
                }
            });
        }

        public void a(com.bykv.vk.openvk.component.video.api.a aVar, int i) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferEnd: ");
            a.this.k.post(new Runnable() {
                public void run() {
                    if (a.this.f1588d != null) {
                        a.this.f1588d.b();
                        a.this.k.removeCallbacks(a.this.N);
                        boolean unused = a.this.I = false;
                    }
                }
            });
        }

        public void b(com.bykv.vk.openvk.component.video.api.a aVar, int i) {
            l.c("CSJ_VIDEO_BaseController", "IVideoPlayerCallback onBufferingUpdate: ");
        }

        public void a(com.bykv.vk.openvk.component.video.api.a aVar, long j, long j2) {
            if (Math.abs(j - a.this.f1590f) >= 50) {
                final long j3 = j;
                final long j4 = j2;
                a.this.k.post(new Runnable() {
                    public void run() {
                        a.this.a(j3, j4);
                    }
                });
                if (a.this.f1589e.ax() != null && a.this.f1589e.ax().a() != null) {
                    a.this.f1589e.ax().a().a(j, j2);
                }
            }
        }
    };
    private final ViewGroup z;

    /* access modifiers changed from: protected */
    public abstract void a(int i, int i2);

    public void a(b bVar, View view, boolean z2) {
    }

    public void a(c.d dVar) {
    }

    public void d(boolean z2) {
    }

    /* access modifiers changed from: protected */
    public abstract int t();

    /* access modifiers changed from: protected */
    public abstract void u();

    /* access modifiers changed from: protected */
    public abstract void v();

    /* access modifiers changed from: protected */
    public abstract void w();

    /* access modifiers changed from: protected */
    public abstract void x();

    /* access modifiers changed from: protected */
    public abstract void y();

    /* access modifiers changed from: protected */
    public abstract void z();

    public void H() {
        a.C0220a aVar = this.y;
        if (aVar != null) {
            aVar.a((com.bykv.vk.openvk.component.video.api.a) null, 0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void g(boolean z2) {
        try {
            l.c("changeVideoSize", "landingPageChangeVideoSize start.......mMaterialMeta.getAdSlot()=" + this.f1589e.x());
            if (!R() || z2) {
                l.c("changeVideoSize", "landingPageChangeVideoSize start check condition complete ... go ..");
                float j = (float) this.f1587c.j();
                float k = (float) this.f1587c.k();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) j, (int) k);
                layoutParams.addRule(13);
                if (J() != null) {
                    if (J() instanceof TextureView) {
                        ((TextureView) J()).setLayoutParams(layoutParams);
                    } else if (J() instanceof SurfaceView) {
                        ((SurfaceView) J()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.z.getLayoutParams();
                    if (this.z.getHeight() > 0) {
                        float min = Math.min(((float) this.z.getWidth()) / j, ((float) this.z.getHeight()) / k);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (j * min);
                            layoutParams.height = (int) (k * min);
                            if (J() instanceof TextureView) {
                                ((TextureView) J()).setLayoutParams(layoutParams);
                            } else if (J() instanceof SurfaceView) {
                                ((SurfaceView) J()).setLayoutParams(layoutParams);
                            }
                            if (this.M) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.z.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
                l.b("changeVideoSize", "changeVideoSize .... complete ... end !!!");
            }
        } catch (Throwable th) {
            l.c("changeVideoSize", "changeSize error", th);
        }
    }

    private void a(Context context) {
        EnumSet<E> noneOf = EnumSet.noneOf(b.a.class);
        noneOf.add(b.a.hideCloseBtn);
        noneOf.add(b.a.hideBackBtn);
        this.f1588d = new d(context.getApplicationContext(), LayoutInflater.from(context.getApplicationContext()).inflate(t.f(context, "tt_video_play_layout_for_live"), (ViewGroup) null, false), true, noneOf, this.f1589e, this);
        this.f1588d.a((com.bykv.vk.openvk.component.video.api.d.a) this);
    }

    protected a(Context context, ViewGroup viewGroup, n nVar) {
        this.Q = o.c(context);
        this.z = viewGroup;
        this.f1592h = new WeakReference(context);
        this.f1589e = nVar;
        a(context);
        this.H = u.f(this.f1589e);
    }

    public boolean a(com.bykv.vk.openvk.component.video.api.c.c cVar) {
        c(false);
        if (cVar == null) {
            return false;
        }
        if (this.f1587c == null || !this.f1587c.m()) {
            this.x = cVar;
            l.b("CSJ_VIDEO_BaseController", "video local url " + cVar.j());
            if (TextUtils.isEmpty(cVar.j())) {
                l.e("CSJ_VIDEO_BaseController", "No video info");
                return false;
            }
            y();
            this.v = !cVar.j().startsWith("http");
            this.n = cVar.f();
            if (cVar.e() > 0) {
                this.f1590f = cVar.e();
                this.f1591g = this.f1591g > this.f1590f ? this.f1591g : this.f1590f;
            }
            if (this.f1588d != null) {
                this.f1588d.a();
                this.f1588d.g();
                this.f1588d.c(cVar.c(), cVar.d());
                this.f1588d.c(this.z);
            }
            if (!(this.f1587c != null || cVar.l() == -2 || cVar.l() == 1)) {
                this.f1587c = new com.bykv.vk.openvk.component.video.a.d.d();
            }
            if (this.f1587c != null) {
                this.f1587c.a(this.y);
            }
            A();
            this.B = 0;
            try {
                c(cVar);
                return true;
            } catch (Exception unused) {
                return false;
            }
        } else {
            this.f1587c.a();
            return true;
        }
    }

    public boolean r() {
        return this.I;
    }

    public void e(boolean z2) {
        this.J = z2;
    }

    public void b(com.bykv.vk.openvk.component.video.api.c.c cVar) {
        this.x = cVar;
    }

    public int l() {
        return com.bykv.vk.openvk.component.video.a.e.a.a(this.f1591g, this.q);
    }

    public void a(Map<String, Object> map) {
        this.s = map;
    }

    private void c(com.bykv.vk.openvk.component.video.api.c.c cVar) throws Exception {
        if (cVar != null) {
            this.x = cVar;
            if (this.f1587c != null) {
                if (this.f1589e != null) {
                    this.f1589e.J();
                    cVar.d(String.valueOf(u.f(this.f1589e)));
                }
                cVar.c(1);
                this.f1587c.a(cVar);
            }
            this.A = System.currentTimeMillis();
            if (!TextUtils.isEmpty(cVar.j())) {
                this.f1588d.d(8);
                this.f1588d.d(0);
                a((Runnable) new Runnable() {
                    public void run() {
                        long unused = a.this.A = System.currentTimeMillis();
                        a.this.f1588d.c(0);
                        if (a.this.f1587c != null && a.this.f1590f == 0) {
                            a.this.f1587c.a(true, 0, a.this.n);
                        } else if (a.this.f1587c != null) {
                            a.this.f1587c.a(true, a.this.f1590f, a.this.n);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public void N() {
        int i;
        int t2 = t();
        if (t2 == 2 || t2 == 1) {
            i = m.h().y() * 1000;
        } else {
            i = t2 == 3 ? m.h().e(String.valueOf(this.H)) : 5;
        }
        this.k.removeCallbacks(this.N);
        this.k.postDelayed(this.N, (long) i);
    }

    public void a(c.b bVar) {
        this.G = new WeakReference<>(bVar);
    }

    /* access modifiers changed from: private */
    public void O() {
        if (C() && this.f1588d != null) {
            this.k.removeCallbacks(this.N);
            this.f1588d.b();
            long currentTimeMillis = System.currentTimeMillis() - this.A;
            this.B = currentTimeMillis;
            c.a aVar = this.C;
            if (aVar != null) {
                aVar.a(currentTimeMillis, com.bykv.vk.openvk.component.video.a.e.a.a(this.f1590f, this.q));
            }
            if (!this.E) {
                this.E = true;
                a(this.q, this.q);
                long j = this.q;
                this.f1590f = j;
                this.f1591g = j;
                u();
            }
            this.l = true;
        }
    }

    public void a(c.a aVar) {
        this.C = aVar;
    }

    public void b() {
        if (this.f1587c != null) {
            this.f1587c.b();
        }
        if (!this.E && this.D) {
            v();
            if (this.f1589e.ax() != null && this.f1589e.ax().a() != null) {
                this.f1589e.ax().a().b(this.f1590f);
            }
        }
    }

    public void d() {
        if (this.f1588d != null) {
            this.f1588d.a();
            this.f1588d.s();
            this.f1588d.v();
        }
        l.a("CSJ_VIDEO_BaseController", "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.j));
        if (this.f1587c != null) {
            if (this.f1587c.m()) {
                if (this.j) {
                    E();
                } else {
                    b(this.r);
                }
                l.a("CSJ_VIDEO_BaseController", "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.j));
            } else {
                this.f1587c.a(false, this.f1590f, this.n);
            }
        }
        if (!this.E && this.D) {
            w();
            if (this.f1589e.ax() != null && this.f1589e.ax().a() != null) {
                this.f1589e.ax().a().c(g());
            }
        }
    }

    public void I() {
        if (!this.E && this.D) {
            w();
            if (this.f1589e.ax() != null && this.f1589e.ax().a() != null) {
                this.f1589e.ax().a().c(g());
            }
        }
    }

    public void d(long j) {
        this.f1590f = j;
        this.f1591g = this.f1591g > this.f1590f ? this.f1591g : this.f1590f;
        if (this.f1588d != null) {
            this.f1588d.a();
        }
        if (this.f1587c != null) {
            this.f1587c.a(true, this.f1590f, this.n);
        }
    }

    public void e() {
        if (this.f1587c != null) {
            this.f1587c.d();
            this.f1587c = null;
        }
        if (this.f1588d != null) {
            this.f1588d.i();
        }
        if (this.k != null) {
            this.k.removeCallbacks(this.N);
            this.k.removeCallbacksAndMessages((Object) null);
        }
    }

    public void a(boolean z2, int i) {
        e();
    }

    public void f() {
        e();
    }

    /* access modifiers changed from: private */
    public boolean P() {
        if (this.f1589e == null || this.f1589e.an() == 100.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void Q() {
        try {
            if (J() != null && this.f1587c != null) {
                if (this.z != null) {
                    int width = this.z.getWidth();
                    int height = this.z.getHeight();
                    float j = (float) this.f1587c.j();
                    float k = (float) this.f1587c.k();
                    float f2 = (float) width;
                    float f3 = (float) height;
                    if (j / (f2 * 1.0f) <= k / (f3 * 1.0f)) {
                        f2 = (f3 / (k * 1.0f)) * j;
                    } else {
                        f3 = (f2 / (j * 1.0f)) * k;
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f2, (int) f3);
                    layoutParams.addRule(13);
                    if (J() instanceof TextureView) {
                        ((TextureView) J()).setLayoutParams(layoutParams);
                    } else if (J() instanceof SurfaceView) {
                        ((SurfaceView) J()).setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (Throwable th) {
            l.c("changeVideoSize", "changeVideoSizeSupportInteraction error", th);
        }
    }

    private boolean R() throws Throwable {
        if (this.f1592h == null || this.f1592h.get() == null || J() == null || this.f1587c == null || this.f1589e == null || this.f1589e.G() != null || this.f1589e.v() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011c A[Catch:{ all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0139 A[Catch:{ all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014d A[Catch:{ all -> 0x0187 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S() {
        /*
            r15 = this;
            java.lang.String r0 = ",videoWidth="
            java.lang.String r1 = "changeVideoSize"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r2.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = "changeVideoSize start.......mMaterialMeta.getAdSlot()="
            r2.append(r3)     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.openadsdk.core.e.n r3 = r15.f1589e     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.openadsdk.AdSlot r3 = r3.x()     // Catch:{ all -> 0x0187 }
            r2.append(r3)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.l.c(r1, r2)     // Catch:{ all -> 0x0187 }
            boolean r2 = r15.R()     // Catch:{ all -> 0x0187 }
            if (r2 == 0) goto L_0x0025
            return
        L_0x0025:
            java.lang.String r2 = "changeVideoSize start check condition complete ... go .."
            com.bytedance.sdk.component.utils.l.c(r1, r2)     // Catch:{ all -> 0x0187 }
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.m.a()     // Catch:{ all -> 0x0187 }
            int[] r2 = com.bytedance.sdk.openadsdk.utils.v.b((android.content.Context) r2)     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.openadsdk.core.e.n r3 = r15.f1589e     // Catch:{ all -> 0x0187 }
            int r3 = r3.am()     // Catch:{ all -> 0x0187 }
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            r6 = r2[r4]     // Catch:{ all -> 0x0187 }
            float r8 = (float) r6     // Catch:{ all -> 0x0187 }
            r2 = r2[r5]     // Catch:{ all -> 0x0187 }
            float r9 = (float) r2     // Catch:{ all -> 0x0187 }
            com.bykv.vk.openvk.component.video.api.a r2 = r15.f1587c     // Catch:{ all -> 0x0187 }
            int r2 = r2.j()     // Catch:{ all -> 0x0187 }
            float r10 = (float) r2     // Catch:{ all -> 0x0187 }
            com.bykv.vk.openvk.component.video.api.a r2 = r15.f1587c     // Catch:{ all -> 0x0187 }
            int r2 = r2.k()     // Catch:{ all -> 0x0187 }
            float r11 = (float) r2     // Catch:{ all -> 0x0187 }
            if (r3 == 0) goto L_0x0064
            int r2 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0073
            java.lang.String r0 = "Separate adaptation for landscape to portrait ....."
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            r12 = 1
            r7 = r15
            r7.a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0187 }
            return
        L_0x0064:
            int r2 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x0073
            java.lang.String r0 = "Separate adaptation for portrait to landscape....."
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            r12 = 0
            r7 = r15
            r7.a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0187 }
            return
        L_0x0073:
            float r2 = r10 / r11
            float r6 = r8 / r9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r7.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = "screenHeight="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r7.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = ",screenWidth="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r7.append(r8)     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r7.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = "videoHeight="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r7.append(r11)     // Catch:{ all -> 0x0187 }
            r7.append(r0)     // Catch:{ all -> 0x0187 }
            r7.append(r10)     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r7.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = "video w/h,videoScale="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r7.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = ",screen  w/h .screenScale="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r7.append(r6)     // Catch:{ all -> 0x0187 }
            java.lang.String r12 = ",VERTICAL_SCALE(9:16)="
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            r12 = 1058013184(0x3f100000, float:0.5625)
            r7.append(r12)     // Catch:{ all -> 0x0187 }
            java.lang.String r13 = ",HORIZONTAL_SCALE(16:9) ="
            r7.append(r13)     // Catch:{ all -> 0x0187 }
            r13 = 1071877689(0x3fe38e39, float:1.7777778)
            r7.append(r13)     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ all -> 0x0187 }
            r7 = 1098907648(0x41800000, float:16.0)
            r14 = 1091567616(0x41100000, float:9.0)
            if (r3 == 0) goto L_0x00f2
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0100
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0100
            float r14 = r14 * r9
            float r10 = r14 / r7
            r11 = r9
            goto L_0x00ff
        L_0x00f2:
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x0100
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0100
            float r14 = r14 * r8
            float r11 = r14 / r7
            r10 = r8
        L_0x00ff:
            r4 = 1
        L_0x0100:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r2.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = "适配后宽高：videoHeight="
            r2.append(r3)     // Catch:{ all -> 0x0187 }
            r2.append(r11)     // Catch:{ all -> 0x0187 }
            r2.append(r0)     // Catch:{ all -> 0x0187 }
            r2.append(r10)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.l.c(r1, r0)     // Catch:{ all -> 0x0187 }
            if (r4 != 0) goto L_0x0139
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r0.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " Screen w/h == Video w/h and in other cases，use screen width and height，videoHeight="
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            r0.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = "，videoWidth="
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            r0.append(r8)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0187 }
            com.bytedance.sdk.component.utils.l.c(r1, r0)     // Catch:{ all -> 0x0187 }
            goto L_0x013b
        L_0x0139:
            r8 = r10
            r9 = r11
        L_0x013b:
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0187 }
            int r2 = (int) r8     // Catch:{ all -> 0x0187 }
            int r3 = (int) r9     // Catch:{ all -> 0x0187 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0187 }
            r4 = 13
            r0.addRule(r4)     // Catch:{ all -> 0x0187 }
            com.bykv.vk.openvk.component.video.api.renderview.b r4 = r15.J()     // Catch:{ all -> 0x0187 }
            if (r4 == 0) goto L_0x0181
            com.bykv.vk.openvk.component.video.api.renderview.b r4 = r15.J()     // Catch:{ all -> 0x0187 }
            boolean r4 = r4 instanceof android.view.TextureView     // Catch:{ all -> 0x0187 }
            if (r4 == 0) goto L_0x015f
            com.bykv.vk.openvk.component.video.api.renderview.b r4 = r15.J()     // Catch:{ all -> 0x0187 }
            android.view.TextureView r4 = (android.view.TextureView) r4     // Catch:{ all -> 0x0187 }
            r4.setLayoutParams(r0)     // Catch:{ all -> 0x0187 }
            goto L_0x0170
        L_0x015f:
            com.bykv.vk.openvk.component.video.api.renderview.b r4 = r15.J()     // Catch:{ all -> 0x0187 }
            boolean r4 = r4 instanceof android.view.SurfaceView     // Catch:{ all -> 0x0187 }
            if (r4 == 0) goto L_0x0170
            com.bykv.vk.openvk.component.video.api.renderview.b r4 = r15.J()     // Catch:{ all -> 0x0187 }
            android.view.SurfaceView r4 = (android.view.SurfaceView) r4     // Catch:{ all -> 0x0187 }
            r4.setLayoutParams(r0)     // Catch:{ all -> 0x0187 }
        L_0x0170:
            android.view.ViewGroup r0 = r15.z     // Catch:{ all -> 0x0187 }
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0181
            r0.height = r3     // Catch:{ all -> 0x0187 }
            r0.width = r2     // Catch:{ all -> 0x0187 }
            android.view.ViewGroup r2 = r15.z     // Catch:{ all -> 0x0187 }
            r2.setLayoutParams(r0)     // Catch:{ all -> 0x0187 }
        L_0x0181:
            java.lang.String r0 = "changeVideoSize .... complete ... end !!!"
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            goto L_0x018d
        L_0x0187:
            r0 = move-exception
            java.lang.String r2 = "changeSize error"
            com.bytedance.sdk.component.utils.l.c(r1, r2, r0)
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.c.a.S():void");
    }

    /* access modifiers changed from: private */
    public void T() {
        try {
            if (this.f1592h != null && this.f1592h.get() != null && J() != null && this.f1587c != null) {
                if (this.f1589e != null) {
                    boolean z2 = this.f1589e.am() == 1;
                    int[] b2 = v.b(m.a());
                    a((float) b2[0], (float) b2[1], (float) this.f1587c.j(), (float) this.f1587c.k(), z2);
                    l.b("changeVideoSize", "changeSize=end");
                }
            }
        } catch (Throwable th) {
            l.a("changeVideoSize", "changeSize error", th);
        }
    }

    private void a(float f2, float f3, float f4, float f5, boolean z2) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            l.b("changeVideoSize", "screenWidth=" + f2 + ",screenHeight=" + f3);
            l.b("changeVideoSize", "videoHeight=" + f5 + ",videoWidth=" + f4);
            if (f4 <= 0.0f || f5 <= 0.0f) {
                f4 = (float) this.f1589e.J().c();
                f5 = (float) this.f1589e.J().b();
            }
            if (f5 <= 0.0f) {
                return;
            }
            if (f4 > 0.0f) {
                if (z2) {
                    if (f4 >= f5) {
                        l.b("changeVideoSize", "Vertical screen mode use video width compute scale value");
                        layoutParams = new RelativeLayout.LayoutParams((int) f2, (int) ((f5 * f2) / f4));
                        layoutParams.addRule(13);
                    } else {
                        return;
                    }
                } else if (f4 <= f5) {
                    l.b("changeVideoSize", "Landscape screen mode use video height compute scale value");
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) ((f4 * f3) / f5), (int) f3);
                    layoutParams2.addRule(13);
                    layoutParams = layoutParams2;
                } else {
                    return;
                }
                if (J() == null) {
                    return;
                }
                if (J() instanceof TextureView) {
                    ((TextureView) J()).setLayoutParams(layoutParams);
                } else if (J() instanceof SurfaceView) {
                    ((SurfaceView) J()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            l.a("changeVideoSize", "changeSize error", th);
        }
    }

    public void a(b bVar, View view) {
        if (this.f1587c != null && C()) {
            if (this.f1587c.l()) {
                b();
                this.f1588d.b(true, false);
                this.f1588d.f();
            } else if (!this.f1587c.m()) {
                if (this.f1588d != null) {
                    this.f1588d.c(this.z);
                }
                d(this.f1590f);
                if (this.f1588d != null) {
                    this.f1588d.b(false, false);
                }
            } else {
                d();
                if (this.f1588d != null) {
                    this.f1588d.b(false, false);
                }
            }
        }
    }

    public void a(b bVar, int i) {
        if (this.f1587c != null) {
            a(this.O, b(i));
        }
    }

    public void b(b bVar, int i) {
        if (this.f1588d != null) {
            this.f1588d.f();
        }
    }

    public void a(b bVar, int i, boolean z2) {
        if (C()) {
            long n = (long) ((((float) (((long) i) * this.q)) * 1.0f) / ((float) t.n((Context) this.f1592h.get(), "tt_video_progress_max")));
            if (this.q > 0) {
                this.O = (long) ((int) n);
            } else {
                this.O = 0;
            }
            if (this.f1588d != null) {
                this.f1588d.a(this.O);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(long j, long j2) {
        this.f1590f = j;
        this.q = j2;
        this.f1588d.a(j, j2);
        this.f1588d.a(com.bykv.vk.openvk.component.video.a.e.a.a(j, j2));
        try {
            if (this.C != null) {
                this.C.a(j, j2);
            }
        } catch (Throwable th) {
            l.c("CSJ_VIDEO_BaseController", "onProgressUpdate error: ", th);
        }
    }

    public void b(b bVar, View view) {
        b(bVar, view, false, false);
    }

    public void b(b bVar, View view, boolean z2, boolean z3) {
        if (C()) {
            f(!this.p);
            if (!(this.f1592h.get() instanceof Activity)) {
                l.b("CSJ_VIDEO_BaseController", "context is not activity, not support this function.");
                return;
            }
            if (this.p) {
                a(z2 ? 8 : 0);
                if (this.f1588d != null) {
                    this.f1588d.a(this.z);
                    this.f1588d.c(false);
                }
            } else {
                a(1);
                if (this.f1588d != null) {
                    this.f1588d.b(this.z);
                    this.f1588d.c(false);
                }
            }
            WeakReference<c.b> weakReference = this.G;
            c.b bVar2 = weakReference != null ? (c.b) weakReference.get() : null;
            if (bVar2 != null) {
                bVar2.a(this.p);
            }
        }
    }

    public void a(int i) {
        if (C()) {
            boolean z2 = i == 0 || i == 8;
            Context context = (Context) this.f1592h.get();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                try {
                    activity.setRequestedOrientation(i);
                } catch (Throwable unused) {
                }
                if (!z2) {
                    activity.getWindow().setFlags(1024, 1024);
                } else {
                    activity.getWindow().clearFlags(1024);
                }
            }
        }
    }

    public void c(b bVar, View view) {
        if (this.f1588d != null) {
            this.f1588d.i();
        }
        a(true, 3);
    }

    public void a(b bVar, View view, boolean z2, boolean z3) {
        if (this.m) {
            b();
        }
        if (z2 && !this.m && !K()) {
            this.f1588d.b(!L(), false);
            this.f1588d.a(z3, true, false);
        }
        if (this.f1587c == null || !this.f1587c.l()) {
            this.f1588d.f();
            return;
        }
        this.f1588d.f();
        this.f1588d.e();
    }

    public void d(b bVar, View view) {
        if (this.p) {
            f(false);
            if (this.f1588d != null) {
                this.f1588d.b(this.z);
            }
            a(1);
            return;
        }
        a(true, 3);
    }

    public void e(b bVar, View view) {
        a(bVar, view, false);
    }

    public com.bykv.vk.openvk.component.video.api.renderview.b J() {
        if (this.f1592h == null || this.f1592h.get() == null || this.f1588d == null) {
            return null;
        }
        return this.f1588d.q();
    }

    public boolean K() {
        return this.f1587c.h();
    }

    public void a() {
        if (this.f1588d != null) {
            this.f1588d.e();
            this.f1588d.a();
        }
        if (this.f1588d != null) {
            this.f1588d.v();
        }
        d(-1);
    }

    public boolean L() {
        return this.f1587c != null && this.f1587c.l();
    }

    private void a(long j, boolean z2) {
        if (this.f1587c != null) {
            if (z2) {
                U();
            }
            this.f1587c.a(j);
        }
    }

    private boolean b(int i) {
        return this.f1588d.b(i);
    }

    private void U() {
        if (this.f1588d != null) {
            this.f1588d.c(0);
            this.f1588d.a(false, false);
            this.f1588d.c(false);
            this.f1588d.e();
            this.f1588d.g();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.c.a$5  reason: invalid class name */
    /* compiled from: BaseVideoController */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1635a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.widget.e$a[] r0 = com.bytedance.sdk.openadsdk.core.widget.e.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1635a = r0
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.e.a.PAUSE_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1635a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.e.a.RELEASE_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1635a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.e.a.START_VIDEO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.c.a.AnonymousClass5.<clinit>():void");
        }
    }

    public void a(e.a aVar, String str) {
        int i = AnonymousClass5.f1635a[aVar.ordinal()];
        if (i == 1) {
            b();
        } else if (i == 2) {
            a(true, 3);
        } else if (i == 3) {
            d();
            this.o = false;
            this.F = true;
        }
    }

    private boolean b(int i, int i2) {
        if (i2 != 4 && i2 != 0) {
            b();
            this.o = true;
            this.F = false;
            if (!(this.f1588d == null || this.f1589e == null)) {
                return this.f1588d.a(i, this.f1589e.J(), true);
            }
        } else if (i2 == 4) {
            this.o = false;
            if (this.f1588d != null) {
                this.f1588d.s();
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void a(Context context, int i) {
        if (C() && this.Q != i) {
            if (!this.F) {
                b(2, i);
            }
            this.Q = i;
        }
    }

    public void M() {
        this.M = true;
    }

    /* access modifiers changed from: private */
    public void V() {
        if (this.f1589e != null) {
            m.g().a(com.bytedance.sdk.openadsdk.k.e.a(this.f1589e.T(), true, this.f1589e));
        }
    }

    public long k() {
        return g() + h();
    }
}
