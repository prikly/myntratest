package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.b;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public class NativeVideoTsView extends FrameLayout implements c.a, x.a, b.a {
    private static Integer v = 0;
    private static Integer w = 1;
    private long A;
    private boolean B;
    private final x C;
    private boolean D;
    private final String E;
    private ViewStub F;
    private c.C0221c G;
    private boolean H;
    private final AtomicBoolean I;
    private boolean J;
    private AtomicBoolean K;

    /* renamed from: a  reason: collision with root package name */
    protected final n f1642a;

    /* renamed from: b  reason: collision with root package name */
    protected c f1643b;

    /* renamed from: c  reason: collision with root package name */
    protected FrameLayout f1644c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f1645d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1646e;

    /* renamed from: f  reason: collision with root package name */
    public j f1647f;

    /* renamed from: g  reason: collision with root package name */
    protected RelativeLayout f1648g;

    /* renamed from: h  reason: collision with root package name */
    protected ImageView f1649h;
    protected ImageView i;
    protected ImageView j;
    protected boolean k;
    protected String l;
    protected int m;
    AtomicBoolean n;
    boolean o;
    public b p;
    private final Context q;
    /* access modifiers changed from: private */
    public ViewGroup r;
    private boolean s;
    private boolean t;
    private String u;
    private boolean x;
    private boolean y;
    private boolean z;

    public interface a {
        void a(View view, int i);
    }

    public interface b {
        void a(boolean z, long j, long j2, long j3, boolean z2);
    }

    public void a() {
    }

    public void b(long j2, int i2) {
    }

    public void setIsNeedShowDetail(boolean z2) {
        this.H = z2;
    }

    public void setAdCreativeClickListener(a aVar) {
        c cVar = this.f1643b;
        if (cVar != null) {
            ((b) cVar).a(aVar);
        }
    }

    public void setControllerStatusCallBack(b bVar) {
        this.p = bVar;
    }

    public void a(long j2, int i2) {
        c.C0221c cVar = this.G;
        if (cVar != null) {
            cVar.d_();
        }
    }

    private void d() {
        a(0, 0);
        this.G = null;
    }

    public void a(long j2, long j3) {
        c.C0221c cVar = this.G;
        if (cVar != null) {
            cVar.a(j2, j3);
        }
    }

    public NativeVideoTsView(Context context, n nVar, boolean z2, j jVar) {
        this(context, nVar, z2, "embeded_ad", false, false, jVar);
    }

    public NativeVideoTsView(Context context, n nVar, String str, boolean z2, boolean z3, j jVar) {
        this(context, nVar, false, str, z2, z3, jVar);
    }

    public NativeVideoTsView(Context context, n nVar, j jVar) {
        this(context, nVar, false, jVar);
    }

    public NativeVideoTsView(Context context, n nVar, boolean z2, String str, boolean z3, boolean z4, j jVar) {
        super(context);
        this.s = true;
        this.f1645d = true;
        this.t = false;
        this.f1646e = false;
        this.x = false;
        this.y = true;
        this.k = true;
        this.l = "embeded_ad";
        this.m = 50;
        this.z = true;
        this.n = new AtomicBoolean(false);
        this.B = false;
        this.C = new x(this);
        this.D = false;
        this.E = Build.MODEL;
        this.o = false;
        this.H = true;
        this.I = new AtomicBoolean(false);
        this.J = true;
        this.K = new AtomicBoolean(false);
        if (jVar != null) {
            this.f1647f = jVar;
        }
        this.l = str;
        this.q = context;
        this.f1642a = nVar;
        this.t = z2;
        setContentDescription("NativeVideoAdView");
        this.x = z3;
        this.y = z4;
        b();
        e();
    }

    /* access modifiers changed from: protected */
    public void b() {
        n nVar = this.f1642a;
        if (nVar != null) {
            int f2 = u.f(nVar);
            int c2 = m.h().c(f2);
            int c3 = o.c(m.a());
            if (c2 == 1) {
                this.s = u.e(c3);
            } else if (c2 == 2) {
                this.s = u.f(c3) || u.e(c3) || u.g(c3);
            } else if (c2 == 3) {
                this.s = false;
            } else if (c2 == 4) {
                this.o = true;
            } else if (c2 == 5) {
                this.s = u.e(c3) || u.g(c3);
            }
            if (this.t) {
                this.f1645d = false;
            } else if (!this.f1646e || !com.bytedance.sdk.openadsdk.core.nativeexpress.o.b(this.l)) {
                this.f1645d = m.h().a(f2);
            }
            if ("open_ad".equals(this.l)) {
                this.s = true;
                this.f1645d = true;
            }
            c cVar = this.f1643b;
            if (cVar != null) {
                cVar.d(this.s);
            }
            this.f1646e = true;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar;
        c cVar;
        if (!(this.t || (bVar = this.p) == null || (cVar = this.f1643b) == null)) {
            bVar.a(cVar.q(), this.f1643b.j(), this.f1643b.k(), this.f1643b.g(), this.s);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private View a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.setId(t.e(this.q, "tt_native_video_layout"));
        layoutParams.gravity = 17;
        frameLayout.setVisibility(8);
        this.r = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout2.setId(t.e(this.q, "tt_native_video_frame"));
        layoutParams2.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout.addView(frameLayout2);
        this.f1644c = frameLayout2;
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setId(t.e(this.q, "tt_native_video_img_cover_viewStub"));
        viewStub.setLayoutResource(t.f(this.q, "tt_native_video_img_cover_layout"));
        viewStub.setLayoutParams(layoutParams3);
        frameLayout.addView(viewStub);
        this.F = viewStub;
        return frameLayout;
    }

    private void e() {
        addView(a(this.q));
        o();
    }

    public void setVideoAdClickListenerTTNativeAd(TTNativeAd tTNativeAd) {
        c cVar = this.f1643b;
        if (cVar != null) {
            ((b) cVar).a(tTNativeAd);
        }
    }

    public void g() {
        ViewStub viewStub;
        if (this.q != null && (viewStub = this.F) != null && viewStub.getParent() != null && this.f1642a != null && this.f1648g == null) {
            this.f1648g = (RelativeLayout) this.F.inflate();
            this.f1649h = (ImageView) findViewById(t.e(this.q, "tt_native_video_img_id"));
            ImageView imageView = (ImageView) findViewById(t.e(this.q, "tt_native_video_play"));
            this.j = imageView;
            if (this.k) {
                v.a((View) imageView, 0);
            }
            if (!(this.f1642a.J() == null || this.f1642a.J().h() == null)) {
                d.a().a(this.f1642a.J().h(), this.f1649h);
            }
            ImageView imageView2 = this.j;
            if (imageView2 != null) {
                imageView2.setClickable(true);
                this.j.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        NativeVideoTsView.this.c();
                    }
                });
            }
            n();
        }
    }

    private void n() {
        if ((this instanceof NativeDrawVideoTsView) && !this.n.get() && h.d().r() != null) {
            this.j.setImageBitmap(h.d().r());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
            int b2 = (int) v.b(getContext(), (float) this.m);
            layoutParams.width = b2;
            layoutParams.height = b2;
            this.j.setLayoutParams(layoutParams);
            this.n.set(true);
        }
    }

    private void o() {
        this.f1643b = new b(this.q, this.f1644c, this.f1642a, this.l, !A(), this.x, this.y, this.f1647f);
        p();
        this.r.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (NativeVideoTsView.this.r != null && NativeVideoTsView.this.r.getViewTreeObserver() != null && NativeVideoTsView.this.f1643b != null) {
                    ((b) NativeVideoTsView.this.f1643b).a(NativeVideoTsView.this.r.getWidth(), NativeVideoTsView.this.r.getHeight());
                    NativeVideoTsView.this.r.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
    }

    public void setVideoAdLoadListener(c.d dVar) {
        c cVar = this.f1643b;
        if (cVar != null) {
            cVar.a(dVar);
        }
    }

    public void setNativeVideoAdListener(c.a aVar) {
        c cVar = this.f1643b;
        if (cVar != null) {
            cVar.a(aVar);
        }
    }

    public boolean a(long j2, boolean z2, boolean z3) {
        boolean z4 = false;
        this.r.setVisibility(0);
        if (this.f1643b == null) {
            this.f1643b = new b(this.q, this.f1644c, this.f1642a, this.l, this.x, this.y, this.f1647f);
            p();
        }
        this.A = j2;
        if (!A()) {
            return true;
        }
        this.f1643b.a(false);
        n nVar = this.f1642a;
        if (!(nVar == null || nVar.J() == null)) {
            com.bykv.vk.openvk.component.video.api.c.c a2 = n.a(CacheDirFactory.getICacheDir(this.f1642a.aD()).a(), this.f1642a);
            a2.b(this.f1642a.Y());
            a2.a(this.r.getWidth());
            a2.b(this.r.getHeight());
            a2.c(this.f1642a.ac());
            a2.a(j2);
            a2.a(z());
            if (z3) {
                this.f1643b.b(a2);
                return true;
            }
            z4 = this.f1643b.a(a2);
        }
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (((i2 > 0 && !z2 && !z3) || (i2 > 0 && z2 && !this.B)) && this.f1643b != null) {
            o.a aVar = new o.a();
            aVar.a(this.f1643b.g());
            aVar.c(this.f1643b.j());
            aVar.b(this.f1643b.h());
            com.bytedance.sdk.openadsdk.b.b.a.a.b(this.f1643b.o(), aVar);
        }
        return z4;
    }

    private void p() {
        c cVar = this.f1643b;
        if (cVar != null) {
            cVar.d(this.s);
            ((b) this.f1643b).a((b.a) this);
            this.f1643b.a((c.a) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        q();
    }

    private void q() {
        c cVar = this.f1643b;
        if (cVar == null) {
            o();
        } else if ((cVar instanceof b) && !A()) {
            ((b) this.f1643b).v();
        }
        if (this.f1643b != null && this.I.get()) {
            this.I.set(false);
            b();
            if (h()) {
                v.a((View) this.f1648g, 8);
                ImageView imageView = this.i;
                if (imageView != null) {
                    v.a((View) imageView, 8);
                }
                n nVar = this.f1642a;
                if (nVar == null || nVar.J() == null) {
                    l.e("NativeVideoAdView", "attachTask materialMeta.getVideo() is null !!");
                    return;
                }
                com.bykv.vk.openvk.component.video.api.c.c a2 = n.a(CacheDirFactory.getICacheDir(this.f1642a.aD()).a(), this.f1642a);
                a2.b(this.f1642a.Y());
                a2.a(this.r.getWidth());
                a2.b(this.r.getHeight());
                a2.c(this.f1642a.ac());
                a2.a(0);
                a2.a(z());
                this.f1643b.a(a2);
                this.f1643b.c(false);
            } else if (this.f1643b.q()) {
                l.b("NativeVideoAdView", "attachTask-mNativeVideoController.isPlayComplete()=" + this.f1643b.q());
                b(true);
            } else {
                l.c("NativeVideoAdView", "attachTask.......mRlImgCover.....VISIBLE");
                g();
                v.a((View) this.f1648g, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        r();
    }

    private void r() {
        this.p = null;
        i();
        a(false);
        s();
    }

    private void s() {
        if (!this.I.get()) {
            this.I.set(true);
            c cVar = this.f1643b;
            if (cVar != null) {
                cVar.a(true, 3);
            }
        }
        this.K.set(false);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 4 || i2 == 8) {
            s();
        }
    }

    public void a(Message message) {
        if (message.what == 1) {
            t();
        }
    }

    private void t() {
        a(j(), v.intValue());
        this.C.sendEmptyMessageDelayed(1, 500);
    }

    private boolean u() {
        if (A()) {
            return false;
        }
        boolean a2 = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
        if (com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || a2) {
            return true;
        }
        return false;
    }

    private void v() {
        if (!A()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) false);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_from_detail_page", (Boolean) false);
        }
    }

    private void a(boolean z2, int i2) {
        if (this.f1642a != null && this.f1643b != null) {
            boolean u2 = u();
            v();
            if (u2 && this.f1643b.q()) {
                l.b("NativeVideoAdView", "changeVideoStatus---isFromDetailPage()=" + u2 + "，mNativeVideoController.isPlayComplete()=" + this.f1643b.q());
                b(true);
                d();
            } else if (!z2 || this.f1643b.q() || this.f1643b.m()) {
                if (this.f1643b.n() != null && this.f1643b.n().l()) {
                    this.f1643b.b();
                    a(true);
                    c.C0221c cVar = this.G;
                    if (cVar != null) {
                        cVar.b_();
                    }
                }
            } else if (this.f1643b.n() == null || !this.f1643b.n().m()) {
                if (this.s && this.f1643b.n() == null) {
                    if (!this.I.get()) {
                        this.I.set(true);
                    }
                    this.K.set(false);
                    q();
                }
            } else if (this.s || i2 == 1) {
                c cVar2 = this.f1643b;
                if (cVar2 != null) {
                    setIsQuiet(cVar2.p());
                }
                if ("ALP-AL00".equals(this.E)) {
                    this.f1643b.d();
                } else {
                    if (!h.d().q()) {
                        u2 = true;
                    }
                    ((b) this.f1643b).h(u2);
                }
                a(false);
                c.C0221c cVar3 = this.G;
                if (cVar3 != null) {
                    cVar3.c_();
                }
            }
        }
    }

    public void onWindowFocusChanged(boolean z2) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        super.onWindowFocusChanged(z2);
        w();
        if (!u() || (cVar4 = this.f1643b) == null || !cVar4.q()) {
            b();
            if (A() || !h() || (cVar2 = this.f1643b) == null || cVar2.m()) {
                if (h()) {
                    return;
                }
                if (!z2 && (cVar = this.f1643b) != null && cVar.n() != null && this.f1643b.n().l()) {
                    this.C.removeMessages(1);
                    a(false, v.intValue());
                } else if (z2) {
                    this.C.obtainMessage(1).sendToTarget();
                }
            } else if (this.C == null) {
            } else {
                if (!z2 || (cVar3 = this.f1643b) == null || cVar3.q()) {
                    this.C.removeMessages(1);
                    a(false, v.intValue());
                    return;
                }
                this.C.obtainMessage(1).sendToTarget();
            }
        } else {
            v();
            v.a((View) this.f1648g, 8);
            b(true);
            d();
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        c cVar;
        n nVar;
        c cVar2;
        c cVar3;
        super.onWindowVisibilityChanged(i2);
        w();
        if (this.J) {
            this.J = i2 == 0;
        }
        if (!u() || (cVar3 = this.f1643b) == null || !cVar3.q()) {
            b();
            if (!A() && h() && (cVar = this.f1643b) != null && !cVar.m() && (nVar = this.f1642a) != null) {
                if (!this.z || nVar.J() == null) {
                    l.e("NativeVideoAdView", "attachTask materialMeta.getVideo() is null !!");
                } else {
                    this.f1642a.J();
                    com.bykv.vk.openvk.component.video.api.c.c a2 = n.a(CacheDirFactory.getICacheDir(this.f1642a.aD()).a(), this.f1642a);
                    a2.b(this.f1642a.Y());
                    a2.a(this.r.getWidth());
                    a2.b(this.r.getHeight());
                    a2.c(this.f1642a.ac());
                    a2.a(this.A);
                    a2.a(z());
                    this.f1643b.a(a2);
                    this.z = false;
                    v.a((View) this.f1648g, 8);
                }
                if (i2 == 0 && this.C != null && (cVar2 = this.f1643b) != null && !cVar2.q()) {
                    this.C.obtainMessage(1).sendToTarget();
                    return;
                }
                return;
            }
            return;
        }
        v();
        v.a((View) this.f1648g, 8);
        b(true);
        d();
    }

    private void w() {
        if (!(this.f1643b == null || A() || !com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_update_flag", false))) {
            boolean a2 = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_native_video_complete", false);
            long a3 = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_current_play_position", 0);
            long a4 = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_total_play_duration", this.f1643b.j() + this.f1643b.h());
            long a5 = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_duration", this.f1643b.j());
            this.f1643b.c(a2);
            this.f1643b.a(a3);
            this.f1643b.b(a4);
            this.f1643b.c(a5);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) false);
            l.e("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + a2 + ",position=" + a3 + ",totalPlayDuration=" + a4 + ",duration=" + a5);
        }
    }

    public void setNativeVideoController(c cVar) {
        this.f1643b = cVar;
    }

    public c getNativeVideoController() {
        return this.f1643b;
    }

    public boolean h() {
        return this.s;
    }

    public void setIsAutoPlay(boolean z2) {
        if (!this.D) {
            int c2 = m.h().c(u.f(this.f1642a));
            if (z2 && c2 != 4 && (!com.bytedance.sdk.component.utils.o.e(this.q) ? !(!com.bytedance.sdk.component.utils.o.f(this.q) ? com.bytedance.sdk.component.utils.o.d(this.q) : x() || y()) : !x())) {
                z2 = false;
            }
            this.s = z2;
            c cVar = this.f1643b;
            if (cVar != null) {
                cVar.d(z2);
            }
            if (!this.s) {
                g();
                RelativeLayout relativeLayout = this.f1648g;
                if (relativeLayout != null) {
                    v.a((View) relativeLayout, 0);
                    n nVar = this.f1642a;
                    if (!(nVar == null || nVar.J() == null)) {
                        d.a().a(this.f1642a.J().h(), this.f1649h);
                    }
                }
            } else {
                v.a((View) this.f1648g, 8);
            }
            this.D = true;
        }
    }

    private boolean x() {
        return 2 == m.h().c(u.f(this.f1642a));
    }

    private boolean y() {
        return 5 == m.h().c(u.f(this.f1642a));
    }

    private boolean z() {
        return this.f1645d;
    }

    public void setIsQuiet(boolean z2) {
        this.f1645d = z2;
        c cVar = this.f1643b;
        if (cVar != null) {
            cVar.b(z2);
        }
    }

    private boolean A() {
        return this.t;
    }

    public void setVideoAdInteractionListener(c.C0221c cVar) {
        this.G = cVar;
    }

    public void f() {
        c.C0221c cVar = this.G;
        if (cVar != null) {
            cVar.a_();
        }
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z2) {
        this.k = z2;
    }

    public void a(int i2) {
        b();
    }

    /* access modifiers changed from: protected */
    public void c() {
        if (!k()) {
            m();
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z2) {
        if (this.i == null) {
            this.i = new ImageView(getContext());
            if (h.d().r() != null) {
                this.i.setImageBitmap(h.d().r());
            } else {
                this.i.setImageResource(t.d(m.a(), "tt_new_play_video"));
            }
            this.i.setScaleType(ImageView.ScaleType.FIT_XY);
            int b2 = (int) v.b(getContext(), (float) this.m);
            int b3 = (int) v.b(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2, b2);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = b3;
            layoutParams.bottomMargin = b3;
            this.r.addView(this.i, layoutParams);
            this.i.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    NativeVideoTsView.this.m();
                }
            });
        }
        if (z2) {
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
    }

    public void b(boolean z2) {
        c cVar = this.f1643b;
        if (cVar != null) {
            cVar.c(z2);
            com.bykv.vk.openvk.component.video.api.d.b o2 = this.f1643b.o();
            if (o2 != null) {
                o2.b();
                View c2 = o2.c();
                if (c2 != null) {
                    if (c2.getParent() != null) {
                        ((ViewGroup) c2.getParent()).removeView(c2);
                    }
                    c2.setVisibility(0);
                    addView(c2);
                    o2.a(this.f1642a, new WeakReference(this.q), false);
                }
            }
        }
    }

    public void i() {
        com.bykv.vk.openvk.component.video.api.d.b o2;
        c cVar = this.f1643b;
        if (cVar != null && (o2 = cVar.o()) != null) {
            o2.a();
            View c2 = o2.c();
            if (c2 != null) {
                c2.setVisibility(8);
                if (c2.getParent() != null) {
                    ((ViewGroup) c2.getParent()).removeView(c2);
                }
            }
        }
    }

    private void B() {
        v.e((View) this.i);
        v.e((View) this.f1648g);
    }

    public void setVideoCacheUrl(String str) {
        this.u = str;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return com.bytedance.sdk.openadsdk.core.x.a(this, 50, com.bytedance.sdk.openadsdk.core.nativeexpress.o.b(this.l) ? 1 : 5);
    }

    public boolean k() {
        boolean z2 = false;
        if (com.bytedance.sdk.component.utils.o.c(m.a()) == 0) {
            return false;
        }
        if (this.f1643b.n() != null && this.f1643b.n().l()) {
            a(false, v.intValue());
            x xVar = this.C;
            z2 = true;
            if (xVar != null) {
                xVar.removeMessages(1);
            }
        }
        return z2;
    }

    public void l() {
        if (getNativeVideoController() != null && (getNativeVideoController() instanceof b)) {
            b bVar = (b) getNativeVideoController();
            bVar.a((com.bykv.vk.openvk.component.video.api.d.b) bVar.o(), (View) this);
        }
    }

    public void m() {
        if (com.bytedance.sdk.component.utils.o.c(m.a()) == 0 || !j()) {
            return;
        }
        if (this.f1643b.n() != null && this.f1643b.n().m()) {
            a(true, w.intValue());
            b();
            x xVar = this.C;
            if (xVar != null) {
                xVar.sendEmptyMessageDelayed(1, 500);
            }
        } else if (!h() && !this.K.get()) {
            this.K.set(true);
            B();
            n nVar = this.f1642a;
            if (!(nVar == null || nVar.J() == null)) {
                B();
                this.f1642a.J();
                com.bykv.vk.openvk.component.video.api.c.c a2 = n.a(CacheDirFactory.getICacheDir(this.f1642a.aD()).a(), this.f1642a);
                a2.b(this.f1642a.Y());
                a2.a(this.r.getWidth());
                a2.b(this.r.getHeight());
                a2.c(this.f1642a.ac());
                a2.a(this.A);
                a2.a(z());
                a2.a(CacheDirFactory.getICacheDir(this.f1642a.aD()).a());
                this.f1643b.a(a2);
            }
            x xVar2 = this.C;
            if (xVar2 != null) {
                xVar2.sendEmptyMessageDelayed(1, 500);
            }
            a(false);
        }
    }

    public double getCurrentPlayTime() {
        c cVar = this.f1643b;
        if (cVar != null) {
            return (((double) cVar.g()) * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }
}
