package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.component.video.a.d.d;
import com.bykv.vk.openvk.component.video.api.a;
import com.bykv.vk.openvk.component.video.api.d.b;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.e;
import com.bytedance.sdk.openadsdk.utils.u;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* compiled from: NativeVideoController */
public class b extends com.bytedance.sdk.openadsdk.core.video.a.a {
    private String A;
    private boolean B;
    private boolean C;
    private WeakReference<c.b> D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    /* access modifiers changed from: private */
    public WeakReference<c.d> I;
    /* access modifiers changed from: private */
    public WeakReference<a> J;
    private int K;
    private int L;
    private int M;
    /* access modifiers changed from: private */
    public boolean N;
    private boolean O;
    private com.bykv.vk.openvk.component.video.api.c.c P;
    /* access modifiers changed from: private */
    public long Q;
    private j R;
    private a.C0220a S;
    private int T;
    private long U;
    private long V;
    private long W;
    private long X;
    private final BroadcastReceiver Y;
    private int Z;
    private boolean aa;
    Runnable s;
    private final WeakReference<ViewGroup> t;
    /* access modifiers changed from: private */
    public long u = 0;
    /* access modifiers changed from: private */
    public long v = 0;
    /* access modifiers changed from: private */
    public c.a w;
    /* access modifiers changed from: private */
    public final boolean x;
    private boolean y;
    private boolean z;

    /* compiled from: NativeVideoController */
    public interface a {
        void a(int i);

        void f();
    }

    public void a(int i) {
    }

    public void a(Map<String, Object> map) {
    }

    public void g(boolean z2) {
        this.H = z2;
    }

    public void a(final NativeVideoTsView.a aVar) {
        if (this.m && this.f1588d != null) {
            this.f1588d.a((NativeVideoTsView.a) new NativeVideoTsView.a() {
                public void a(View view, int i) {
                    NativeVideoTsView.a aVar = aVar;
                    if (aVar != null) {
                        aVar.a(view, i);
                    }
                }
            });
        }
    }

    public void a(TTNativeAd tTNativeAd) {
        if (this.m && this.f1588d != null) {
            this.f1588d.a(tTNativeAd);
        }
    }

    public void a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            this.K = i;
            this.L = i2;
            l.b("CSJ_VIDEO_NativeController", "width=" + i + "height=" + i2);
        }
    }

    private void a(Context context) {
        View view;
        EnumSet<E> noneOf = EnumSet.noneOf(b.a.class);
        noneOf.add(b.a.hideCloseBtn);
        noneOf.add(b.a.hideBackBtn);
        if (this.m) {
            view = b(context);
        } else {
            view = LayoutInflater.from(context.getApplicationContext()).inflate(t.f(context, "tt_video_detail_layout"), (ViewGroup) null, false);
        }
        View view2 = view;
        if (view2 != null) {
            if (this.m) {
                this.f1588d = new d(context, view2, true, noneOf, this.f1589e, this, G());
            } else {
                this.f1588d = new c(context, view2, true, noneOf, this.f1589e, this, false);
            }
            this.f1588d.a((com.bykv.vk.openvk.component.video.api.d.a) this);
        }
    }

    private View b(Context context) {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(t.e(context, "tt_root_view"));
        relativeLayout.setBackgroundColor(-16777216);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout2.setId(t.e(context, "tt_video_loading_retry_layout"));
        relativeLayout2.setBackgroundColor(0);
        relativeLayout2.setGravity(17);
        relativeLayout2.setLayoutParams(layoutParams);
        relativeLayout.addView(relativeLayout2);
        ImageView imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        imageView.setId(t.e(context, "tt_video_loading_cover_image"));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(layoutParams2);
        relativeLayout2.addView(imageView);
        ProgressBar progressBar = new ProgressBar(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        progressBar.setId(t.e(context, "tt_video_loading_progress"));
        layoutParams3.addRule(13, -1);
        progressBar.setLayoutParams(layoutParams3);
        progressBar.setIndeterminateDrawable(t.c(context, "tt_video_loading_progress_bar"));
        relativeLayout2.addView(progressBar);
        ImageView imageView2 = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        imageView2.setId(t.e(context, "tt_video_play"));
        layoutParams4.addRule(13, -1);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(t.d(context, "tt_play_movebar_textpage"));
        imageView2.setVisibility(8);
        imageView2.setLayoutParams(layoutParams4);
        relativeLayout.addView(imageView2);
        ViewStub viewStub = new ViewStub(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        viewStub.setId(t.e(context, "tt_video_ad_cover"));
        viewStub.setLayoutParams(layoutParams5);
        viewStub.setLayoutResource(t.f(context, "tt_video_ad_cover_layout"));
        relativeLayout.addView(viewStub);
        ViewStub viewStub2 = new ViewStub(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13, -1);
        viewStub2.setId(t.e(context, "tt_video_draw_layout_viewStub"));
        viewStub2.setLayoutParams(layoutParams6);
        viewStub2.setLayoutResource(t.f(context, "tt_video_draw_btn_layout"));
        relativeLayout.addView(viewStub2);
        return relativeLayout;
    }

    public b(Context context, ViewGroup viewGroup, n nVar, String str, boolean z2, boolean z3, boolean z4, j jVar) {
        boolean z5 = false;
        this.y = false;
        this.z = false;
        this.A = "embeded_ad";
        this.B = false;
        this.C = true;
        this.E = false;
        this.F = false;
        this.G = true;
        this.H = true;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = false;
        this.O = true;
        this.S = new a.C0220a() {
            public void b(com.bykv.vk.openvk.component.video.api.a aVar, int i) {
            }

            public void c(com.bykv.vk.openvk.component.video.api.a aVar) {
            }

            public void d(com.bykv.vk.openvk.component.video.api.a aVar) {
            }

            public void e(com.bykv.vk.openvk.component.video.api.a aVar) {
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        b.this.x();
                    }
                });
                b.this.a(4);
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, long j) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        if (b.this.f1588d != null) {
                            b.this.f1588d.b();
                            b.this.k.removeCallbacks(b.this.s);
                            boolean unused = b.this.N = false;
                        }
                        if (!(!b.this.m || b.this.J == null || b.this.J.get() == null)) {
                            ((a) b.this.J.get()).f();
                        }
                        b.this.L();
                        b.this.k.removeCallbacks(b.this.s);
                    }
                });
                b.this.z();
                long unused = b.this.Q = System.currentTimeMillis();
            }

            public void b(com.bykv.vk.openvk.component.video.api.a aVar) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        if (!(b.this.I == null || b.this.I.get() == null)) {
                            ((c.d) b.this.I.get()).e_();
                        }
                        if (!b.this.x) {
                            b.this.z();
                        }
                        if (b.this.f1588d != null) {
                            b.this.f1588d.b();
                        }
                        b.this.k.removeCallbacks(b.this.s);
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, final com.bykv.vk.openvk.component.video.api.c.a aVar2) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        int a2 = aVar2.a();
                        int b2 = aVar2.b();
                        b.this.b(a2, b2);
                        l.e("CSJ_VIDEO_NativeController", "CALLBACK_ON_ERROR、、before isVideoPlaying、、、、、");
                        if (!b.this.u() || b2 == -1004) {
                            l.e("CSJ_VIDEO_NativeController", "Video play error： errorcode,extra、、、、、、、" + a2 + "," + b2);
                            if (b.this.d(a2, b2)) {
                                l.e("CSJ_VIDEO_NativeController", "Play video error，show result page、、、、、、、");
                                b.this.f1588d.a(b.this.f1589e, (WeakReference<Context>) b.this.f1592h, false);
                                b.this.c(true);
                                b.this.f();
                            }
                            if (b.this.f1588d != null) {
                                b.this.f1588d.b();
                            }
                            if (b.this.w != null) {
                                b.this.w.b(b.this.v, com.bykv.vk.openvk.component.video.a.e.a.a(b.this.f1590f, b.this.q));
                            }
                            if (b.this.I != null && b.this.I.get() != null && !b.this.u()) {
                                ((c.d) b.this.I.get()).a(a2, b2);
                            }
                        }
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, boolean z) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        if (b.this.f1588d != null) {
                            b.this.f1588d.b();
                        }
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, int i, int i2) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        b.this.H();
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, int i, int i2, int i3) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        if (b.this.f1588d != null) {
                            b.this.f1588d.u();
                            b.this.k.postDelayed(b.this.s, 8000);
                            boolean unused = b.this.N = true;
                        }
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, int i) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        b.this.f1588d.b();
                        b.this.k.removeCallbacks(b.this.s);
                        boolean unused = b.this.N = false;
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, long j, long j2) {
                if (Math.abs(j - b.this.f1590f) >= 50) {
                    final long j3 = j;
                    final long j4 = j2;
                    b.this.k.post(new Runnable() {
                        public void run() {
                            b.this.a(j3, j4);
                        }
                    });
                }
            }
        };
        this.T = 0;
        this.U = 0;
        this.s = new Runnable() {
            public void run() {
                if (b.this.f1588d != null) {
                    b.this.f1588d.a(b.this.f1589e, (WeakReference<Context>) b.this.f1592h, false);
                    b.this.f1588d.b();
                    b.this.c(true);
                    l.e("CSJ_VIDEO_NativeController", "Show result page after error.......showAdCard");
                }
            }
        };
        this.V = 0;
        this.W = 0;
        this.Y = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    b.this.b();
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
                    b.this.c(context, i);
                }
            }
        };
        this.Z = 1;
        this.aa = false;
        this.Z = o.c(context);
        a(z2);
        this.A = str;
        try {
            this.K = viewGroup.getWidth();
            this.L = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        this.t = new WeakReference<>(viewGroup);
        this.f1592h = new WeakReference(context);
        this.f1589e = nVar;
        a(context);
        this.x = Build.VERSION.SDK_INT >= 17 ? true : z5;
        this.B = z3;
        this.C = z4;
        if (jVar != null) {
            this.R = jVar;
        }
    }

    public b(Context context, ViewGroup viewGroup, n nVar, String str, boolean z2, boolean z3, j jVar) {
        boolean z4 = false;
        this.y = false;
        this.z = false;
        this.A = "embeded_ad";
        this.B = false;
        this.C = true;
        this.E = false;
        this.F = false;
        this.G = true;
        this.H = true;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = false;
        this.O = true;
        this.S = new a.C0220a() {
            public void b(com.bykv.vk.openvk.component.video.api.a aVar, int i) {
            }

            public void c(com.bykv.vk.openvk.component.video.api.a aVar) {
            }

            public void d(com.bykv.vk.openvk.component.video.api.a aVar) {
            }

            public void e(com.bykv.vk.openvk.component.video.api.a aVar) {
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        b.this.x();
                    }
                });
                b.this.a(4);
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, long j) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        if (b.this.f1588d != null) {
                            b.this.f1588d.b();
                            b.this.k.removeCallbacks(b.this.s);
                            boolean unused = b.this.N = false;
                        }
                        if (!(!b.this.m || b.this.J == null || b.this.J.get() == null)) {
                            ((a) b.this.J.get()).f();
                        }
                        b.this.L();
                        b.this.k.removeCallbacks(b.this.s);
                    }
                });
                b.this.z();
                long unused = b.this.Q = System.currentTimeMillis();
            }

            public void b(com.bykv.vk.openvk.component.video.api.a aVar) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        if (!(b.this.I == null || b.this.I.get() == null)) {
                            ((c.d) b.this.I.get()).e_();
                        }
                        if (!b.this.x) {
                            b.this.z();
                        }
                        if (b.this.f1588d != null) {
                            b.this.f1588d.b();
                        }
                        b.this.k.removeCallbacks(b.this.s);
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, final com.bykv.vk.openvk.component.video.api.c.a aVar2) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        int a2 = aVar2.a();
                        int b2 = aVar2.b();
                        b.this.b(a2, b2);
                        l.e("CSJ_VIDEO_NativeController", "CALLBACK_ON_ERROR、、before isVideoPlaying、、、、、");
                        if (!b.this.u() || b2 == -1004) {
                            l.e("CSJ_VIDEO_NativeController", "Video play error： errorcode,extra、、、、、、、" + a2 + "," + b2);
                            if (b.this.d(a2, b2)) {
                                l.e("CSJ_VIDEO_NativeController", "Play video error，show result page、、、、、、、");
                                b.this.f1588d.a(b.this.f1589e, (WeakReference<Context>) b.this.f1592h, false);
                                b.this.c(true);
                                b.this.f();
                            }
                            if (b.this.f1588d != null) {
                                b.this.f1588d.b();
                            }
                            if (b.this.w != null) {
                                b.this.w.b(b.this.v, com.bykv.vk.openvk.component.video.a.e.a.a(b.this.f1590f, b.this.q));
                            }
                            if (b.this.I != null && b.this.I.get() != null && !b.this.u()) {
                                ((c.d) b.this.I.get()).a(a2, b2);
                            }
                        }
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, boolean z) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        if (b.this.f1588d != null) {
                            b.this.f1588d.b();
                        }
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, int i, int i2) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        b.this.H();
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, int i, int i2, int i3) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        if (b.this.f1588d != null) {
                            b.this.f1588d.u();
                            b.this.k.postDelayed(b.this.s, 8000);
                            boolean unused = b.this.N = true;
                        }
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, int i) {
                b.this.k.post(new Runnable() {
                    public void run() {
                        b.this.f1588d.b();
                        b.this.k.removeCallbacks(b.this.s);
                        boolean unused = b.this.N = false;
                    }
                });
            }

            public void a(com.bykv.vk.openvk.component.video.api.a aVar, long j, long j2) {
                if (Math.abs(j - b.this.f1590f) >= 50) {
                    final long j3 = j;
                    final long j4 = j2;
                    b.this.k.post(new Runnable() {
                        public void run() {
                            b.this.a(j3, j4);
                        }
                    });
                }
            }
        };
        this.T = 0;
        this.U = 0;
        this.s = new Runnable() {
            public void run() {
                if (b.this.f1588d != null) {
                    b.this.f1588d.a(b.this.f1589e, (WeakReference<Context>) b.this.f1592h, false);
                    b.this.f1588d.b();
                    b.this.c(true);
                    l.e("CSJ_VIDEO_NativeController", "Show result page after error.......showAdCard");
                }
            }
        };
        this.V = 0;
        this.W = 0;
        this.Y = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    b.this.b();
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
                    b.this.c(context, i);
                }
            }
        };
        this.Z = 1;
        this.aa = false;
        this.Z = o.c(context);
        try {
            this.K = viewGroup.getWidth();
            this.L = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        this.t = new WeakReference<>(viewGroup);
        this.A = str;
        this.f1592h = new WeakReference(context);
        this.f1589e = nVar;
        a(context);
        this.x = Build.VERSION.SDK_INT >= 17 ? true : z4;
        this.B = z2;
        this.C = z3;
        if (jVar != null) {
            this.R = jVar;
        }
    }

    /* renamed from: F */
    public d o() {
        return this.f1588d;
    }

    public void a(c.d dVar) {
        this.I = new WeakReference<>(dVar);
    }

    public boolean a(com.bykv.vk.openvk.component.video.api.c.c cVar) {
        c(false);
        l.b("tag_video_play", "[video] start NativeVideoController#playVideoUrl and video url is :\r\n" + cVar.j());
        if (TextUtils.isEmpty(cVar.j())) {
            l.e("tag_video_play", "[video] play video stop , because no video info");
            return false;
        }
        this.P = cVar;
        M();
        this.n = cVar.f();
        if (!com.bytedance.sdk.openadsdk.core.nativeexpress.o.b(this.A) || this.f1590f <= 0) {
            this.f1590f = cVar.e();
        }
        if (cVar.e() <= 0) {
            this.z = false;
            this.y = false;
        }
        if (cVar.e() > 0) {
            this.f1590f = cVar.e();
            this.f1591g = this.f1591g > this.f1590f ? this.f1591g : this.f1590f;
        }
        if (this.f1588d != null) {
            this.f1588d.a();
            if (this.T == 0) {
                this.f1588d.g();
            }
            this.f1588d.c(cVar.c(), cVar.d());
            this.f1588d.c((ViewGroup) this.t.get());
            this.f1588d.a(cVar.c(), cVar.d());
        }
        if (!(this.f1587c != null || cVar.l() == -2 || cVar.l() == 1)) {
            this.f1587c = new d();
        }
        if (this.f1587c != null) {
            this.f1587c.a(this.S);
        }
        A();
        l.b("tag_video_play", "[video] new MediaPlayer");
        this.v = 0;
        try {
            c(cVar);
            return true;
        } catch (Exception e2) {
            l.e("tag_video_play", "[video] invoke NativeVideoController#playVideo cause exception :" + e2.toString());
            return false;
        }
    }

    public int l() {
        return com.bykv.vk.openvk.component.video.a.e.a.a(this.f1591g, this.q);
    }

    private void c(com.bykv.vk.openvk.component.video.api.c.c cVar) {
        l.b("tag_video_play", "[video] NativeVideoController#playVideo has invoke !");
        if (cVar == null) {
            l.b("tag_video_play", "VideoUrlModel is null  !!!");
            return;
        }
        if (this.f1587c != null) {
            if (this.f1589e != null) {
                cVar.d(String.valueOf(u.f(this.f1589e)));
            }
            cVar.c(0);
            this.f1587c.a(cVar);
            l.b("tag_video_play", "[video] MediaPlayerProxy has setDataSource !");
        }
        this.u = System.currentTimeMillis();
        if (!TextUtils.isEmpty(cVar.j())) {
            this.f1588d.d(8);
            this.f1588d.d(0);
            a((Runnable) new Runnable() {
                public void run() {
                    long unused = b.this.u = System.currentTimeMillis();
                    b.this.f1588d.c(0);
                    if (b.this.f1587c != null && b.this.f1590f == 0) {
                        b.this.f1587c.a(true, 0, b.this.n);
                    } else if (b.this.f1587c != null) {
                        b.this.f1587c.a(true, b.this.f1590f, b.this.n);
                    }
                }
            });
        }
        if (this.m) {
            v();
        }
    }

    public void a(c.b bVar) {
        this.D = new WeakReference<>(bVar);
    }

    public long h() {
        if (n() == null) {
            return 0;
        }
        return n().o();
    }

    public int i() {
        if (n() == null) {
            return 0;
        }
        return n().p();
    }

    public long j() {
        if (n() == null) {
            return 0;
        }
        return n().q();
    }

    /* access modifiers changed from: private */
    public void x() {
        this.T++;
        if (C() && this.f1588d != null) {
            this.f1588d.b();
            c.a aVar = this.w;
            if (aVar != null) {
                aVar.a(this.v, com.bykv.vk.openvk.component.video.a.e.a.a(this.f1590f, this.q));
            }
            this.v = System.currentTimeMillis() - this.u;
            if ((!u.b(this.f1589e) || this.T >= 2) && this.H) {
                this.f1588d.a(this.f1589e, (WeakReference<Context>) this.f1592h, true);
            }
            if (!this.z) {
                this.z = true;
                a(this.q, this.q);
                long j = this.q;
                this.f1590f = j;
                this.f1591g = j;
                o.a aVar2 = new o.a();
                aVar2.a(g());
                aVar2.c(j());
                aVar2.b(h());
                aVar2.f(i());
                com.bytedance.sdk.openadsdk.b.b.a.a.b(this.f1588d, aVar2, this.R);
            }
            if (!this.m && this.p) {
                e(this.f1588d, (View) null);
            }
            this.l = true;
            if (u.b(this.f1589e) && this.T < 2) {
                a();
            }
        }
    }

    public void a(c.a aVar) {
        this.w = aVar;
    }

    public void b() {
        if (this.f1587c != null) {
            this.f1587c.b();
        }
        if (!this.z && this.y) {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                if (com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_single_app_data_class", "IsCanLoadPauseLog", true)) {
                    o.a aVar = new o.a();
                    aVar.a(g());
                    aVar.c(j());
                    aVar.b(h());
                    com.bytedance.sdk.openadsdk.b.b.a.a.a((com.bykv.vk.openvk.component.video.api.b.a) this.f1588d, aVar);
                }
                com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_single_app_data_class", "IsCanLoadPauseLog", (Boolean) true);
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.t.a().b()) {
                o.a aVar2 = new o.a();
                aVar2.a(g());
                aVar2.c(j());
                aVar2.b(h());
                com.bytedance.sdk.openadsdk.b.b.a.a.a((com.bykv.vk.openvk.component.video.api.b.a) this.f1588d, aVar2);
            }
            com.bytedance.sdk.openadsdk.core.t.a().a(true);
        }
    }

    public void d() {
        if (this.f1588d != null) {
            this.f1588d.a();
        }
        if (this.f1588d != null) {
            this.f1588d.v();
        }
        y();
    }

    public void h(boolean z2) {
        if (this.f1588d != null) {
            this.f1588d.a();
        }
        if (this.f1588d != null && z2) {
            this.f1588d.v();
        }
        y();
    }

    private void y() {
        l.a("CSJ_VIDEO_NativeController", "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.j));
        if (this.f1587c != null) {
            if (this.f1587c.m()) {
                if (this.j) {
                    E();
                } else {
                    b(this.r);
                }
                l.a("CSJ_VIDEO_NativeController", "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.j));
            } else {
                this.f1587c.a(false, this.f1590f, this.n);
            }
        }
        if (this.y) {
            o.a aVar = new o.a();
            aVar.a(g());
            aVar.c(j());
            aVar.b(h());
            com.bytedance.sdk.openadsdk.b.b.a.a.b(o(), aVar);
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
        a(true, 3);
    }

    public void a(boolean z2, int i) {
        if (this.m) {
            this.U = j();
            a(1);
        }
        if (!this.z && this.y) {
            if (z2) {
                o.a aVar = new o.a();
                aVar.a(g());
                aVar.c(j());
                aVar.b(h());
                aVar.e(i);
                aVar.f(i());
                com.bytedance.sdk.openadsdk.b.b.a.a.a((com.bykv.vk.openvk.component.video.api.b.a) this.f1588d, aVar, this.R);
                this.z = false;
            } else {
                o.a aVar2 = new o.a();
                aVar2.a(g());
                aVar2.c(j());
                aVar2.b(h());
                com.bytedance.sdk.openadsdk.b.b.a.a.a((com.bykv.vk.openvk.component.video.api.b.a) this.f1588d, aVar2);
            }
        }
        f();
    }

    public void f() {
        if (this.f1587c != null) {
            this.f1587c.d();
            this.f1587c = null;
        }
        if (!u.b(this.f1589e) || this.T == 2) {
            if (this.H) {
                this.f1588d.a(this.f1589e, (WeakReference<Context>) this.f1592h, true);
            } else {
                return;
            }
        }
        if (this.k != null) {
            this.k.removeCallbacksAndMessages((Object) null);
        }
        if (this.i != null) {
            this.i.clear();
        }
        if (this.m) {
            w();
        }
    }

    /* access modifiers changed from: private */
    public void z() {
        if (!this.y) {
            o.a aVar = new o.a();
            aVar.a(this.G);
            aVar.c(j());
            com.bytedance.sdk.openadsdk.b.b.a.a.a(m.a(), (com.bykv.vk.openvk.component.video.api.b.a) this.f1588d, aVar, this.R);
            this.y = true;
        }
    }

    /* access modifiers changed from: private */
    public void b(int i, int i2) {
        if (this.f1589e != null) {
            o.a aVar = new o.a();
            aVar.b(h());
            aVar.c(j());
            aVar.a(g());
            aVar.a(i);
            aVar.b(i2);
            com.bytedance.sdk.openadsdk.b.b.a.a.c(o(), aVar);
        }
    }

    /* access modifiers changed from: private */
    public void H() {
        int i;
        int i2;
        l.b("ChangeVideoSize", "[step-0]  TAG is 'ChangeVideoSize' ....... start  changeVideoSize >>>>>>>>>>>>>>>>>>>>>>>");
        try {
            if (!(this.f1592h == null || this.f1592h.get() == null || I() == null || this.f1587c == null || this.t == null)) {
                if (this.t.get() != null) {
                    int j = this.f1587c.j();
                    int k = this.f1587c.k();
                    int width = ((ViewGroup) this.t.get()).getWidth();
                    int height = ((ViewGroup) this.t.get()).getHeight();
                    if (width > 0 && height > 0 && k > 0) {
                        if (j > 0) {
                            if (j == k) {
                                i2 = width > height ? height : width;
                                i = i2;
                            } else if (j > k) {
                                i2 = (int) ((((double) width) * 1.0d) / ((double) ((((float) j) * 1.0f) / ((float) k))));
                                i = width;
                            } else {
                                i = (int) ((((double) height) * 1.0d) / ((double) ((((float) k) * 1.0f) / ((float) j))));
                                i2 = height;
                            }
                            if (i2 <= height) {
                                if (i2 > 0) {
                                    height = i2;
                                }
                            }
                            if (i <= width) {
                                if (i > 0) {
                                    width = i;
                                }
                            }
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                            layoutParams.addRule(13);
                            if (I() instanceof TextureView) {
                                ((TextureView) I()).setLayoutParams(layoutParams);
                                l.b("ChangeVideoSize", "[step-9] >>>>> setLayoutParams to TextureView complete ! >>>>>>>");
                                return;
                            } else if (I() instanceof SurfaceView) {
                                ((SurfaceView) I()).setLayoutParams(layoutParams);
                                l.b("ChangeVideoSize", "[step-9] >>>>> setLayoutParams to SurfaceView complete !>>>>>>>");
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    l.b("ChangeVideoSize", " container or video exist size <= 0");
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[step-1] >>>>> mContextRef=");
            sb.append(this.f1592h);
            sb.append(",mContextRef.get()=");
            sb.append(this.f1592h != null ? (Context) this.f1592h.get() : null);
            sb.append(",getIRenderView() =");
            sb.append(I());
            l.b("ChangeVideoSize", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[step-1] >>>>> mMediaPlayerProxy == null:");
            boolean z2 = true;
            sb2.append(this.f1587c == null);
            sb2.append(",mMediaPlayerProxy.getMediaPlayer() == null:");
            if (this.f1587c == null) {
                z2 = false;
            }
            sb2.append(z2);
            l.b("ChangeVideoSize", sb2.toString());
        } catch (Throwable th) {
            l.b("ChangeVideoSize", "[step-11] >>>>> changeVideoSize error !!!!! ：" + th.toString());
        }
    }

    private com.bykv.vk.openvk.component.video.api.renderview.b I() {
        if (this.f1592h == null || this.f1592h.get() == null || ((Context) this.f1592h.get()).getResources().getConfiguration().orientation != 1 || this.f1588d == null) {
            return null;
        }
        return this.f1588d.q();
    }

    public void a(com.bykv.vk.openvk.component.video.api.d.b bVar, View view) {
        if (this.f1587c != null && C()) {
            if (this.f1587c.l()) {
                b();
                this.f1588d.b(true, false);
                this.f1588d.f();
            } else if (!this.f1587c.m()) {
                if (this.f1588d != null) {
                    this.f1588d.c((ViewGroup) this.t.get());
                }
                d(this.f1590f);
                if (this.f1588d != null) {
                    this.f1588d.b(false, false);
                }
            } else {
                h(false);
                if (this.f1588d != null) {
                    this.f1588d.b(false, false);
                }
            }
        }
    }

    public void a(com.bykv.vk.openvk.component.video.api.d.b bVar, int i) {
        if (this.f1587c != null) {
            a(this.X, c(i));
        }
    }

    public void b(com.bykv.vk.openvk.component.video.api.d.b bVar, int i) {
        if (this.f1588d != null) {
            this.f1588d.f();
        }
    }

    public void a(com.bykv.vk.openvk.component.video.api.d.b bVar, int i, boolean z2) {
        if (C()) {
            long n = (long) ((((float) (((long) i) * this.q)) * 1.0f) / ((float) t.n((Context) this.f1592h.get(), "tt_video_progress_max")));
            if (this.q > 0) {
                this.X = (long) ((int) n);
            } else {
                this.X = 0;
            }
            if (this.f1588d != null) {
                this.f1588d.a(this.X);
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
            if (this.w != null) {
                this.w.a(j, j2);
            }
        } catch (Throwable th) {
            l.c("CSJ_VIDEO_NativeController", "onProgressUpdate error: ", th);
        }
    }

    public void b(com.bykv.vk.openvk.component.video.api.d.b bVar, View view) {
        b(bVar, view, false, false);
    }

    public void b(com.bykv.vk.openvk.component.video.api.d.b bVar, View view, boolean z2, boolean z3) {
        if (C()) {
            f(!this.p);
            if (!(this.f1592h.get() instanceof Activity)) {
                l.b("CSJ_VIDEO_NativeController", "context is not activity, not support this function.");
                return;
            }
            if (this.p) {
                b(z2 ? 8 : 0);
                if (this.f1588d != null) {
                    this.f1588d.a((ViewGroup) this.t.get());
                    this.f1588d.c(false);
                }
            } else {
                b(1);
                if (this.f1588d != null) {
                    this.f1588d.b((ViewGroup) this.t.get());
                    this.f1588d.c(false);
                }
            }
            WeakReference<c.b> weakReference = this.D;
            c.b bVar2 = weakReference != null ? (c.b) weakReference.get() : null;
            if (bVar2 != null) {
                bVar2.a(this.p);
            }
        }
    }

    public void b(int i) {
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

    public void c(com.bykv.vk.openvk.component.video.api.d.b bVar, View view) {
        if (this.f1588d != null) {
            this.f1588d.i();
        }
        e();
    }

    public void a(com.bykv.vk.openvk.component.video.api.d.b bVar, View view, boolean z2, boolean z3) {
        if (this.m) {
            b();
        }
        if (z2 && !this.m && !t()) {
            this.f1588d.b(!u(), false);
            this.f1588d.a(z3, true, false);
        }
        if (this.f1587c == null || !this.f1587c.l()) {
            this.f1588d.f();
            return;
        }
        this.f1588d.f();
        this.f1588d.e();
    }

    public void d(com.bykv.vk.openvk.component.video.api.d.b bVar, View view) {
        if (this.p) {
            f(false);
            if (this.f1588d != null) {
                this.f1588d.b((ViewGroup) this.t.get());
            }
            b(1);
            return;
        }
        e();
    }

    public void e(com.bykv.vk.openvk.component.video.api.d.b bVar, View view) {
        a(bVar, view, false);
    }

    public void a(com.bykv.vk.openvk.component.video.api.d.b bVar, View view, boolean z2) {
        J();
    }

    private void J() {
        if (C()) {
            f(!this.p);
            if (!(this.f1592h.get() instanceof Activity)) {
                l.b("CSJ_VIDEO_NativeController", "context is not activity, not support this function.");
                return;
            }
            if (this.f1588d != null) {
                this.f1588d.b((ViewGroup) this.t.get());
                this.f1588d.c(false);
            }
            b(1);
            WeakReference<c.b> weakReference = this.D;
            c.b bVar = weakReference != null ? (c.b) weakReference.get() : null;
            if (bVar != null) {
                bVar.a(this.p);
            }
        }
    }

    public boolean t() {
        return this.f1587c == null || this.f1587c.h();
    }

    public void a() {
        if (com.bytedance.sdk.component.utils.o.c(m.a()) != 0) {
            f();
            com.bykv.vk.openvk.component.video.api.c.c cVar = this.P;
            if (cVar != null) {
                cVar.b(this.f1589e.Y());
                this.P.a(this.K);
                this.P.b(this.L);
                this.P.a((List<String>) null);
                this.P.c(this.f1589e.ac());
                this.P.a(0);
                this.P.a(p());
                com.bykv.vk.openvk.component.video.api.c.c cVar2 = this.P;
                cVar2.a(cVar2.a());
                a(this.P);
                c(false);
            }
        }
    }

    public boolean u() {
        return this.f1587c != null && this.f1587c.l();
    }

    private void a(long j, boolean z2) {
        if (this.f1587c != null) {
            if (z2) {
                K();
            }
            this.f1587c.a(j);
        }
    }

    private boolean c(int i) {
        return this.f1588d.b(i);
    }

    private void K() {
        if (this.f1588d != null) {
            this.f1588d.c(0);
            this.f1588d.a(false, false);
            this.f1588d.c(false);
            this.f1588d.e();
            this.f1588d.g();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.b$6  reason: invalid class name */
    /* compiled from: NativeVideoController */
    static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1671a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.widget.e$a[] r0 = com.bytedance.sdk.openadsdk.core.widget.e.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1671a = r0
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.e.a.PAUSE_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1671a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.e.a.RELEASE_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1671a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.e.a.START_VIDEO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.b.AnonymousClass6.<clinit>():void");
        }
    }

    public void a(e.a aVar, String str) {
        int i = AnonymousClass6.f1671a[aVar.ordinal()];
        if (i == 1) {
            b();
        } else if (i == 2) {
            e();
        } else if (i == 3) {
            d();
            this.o = false;
            this.E = true;
        }
    }

    private boolean c(int i, int i2) {
        if (i2 == 0) {
            b();
            this.o = true;
            if (this.f1588d != null) {
                this.f1588d.a(this.f1589e, (WeakReference<Context>) this.f1592h, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            if (this.f1588d != null) {
                this.f1588d.a();
            }
            b();
            this.o = true;
            this.E = false;
            if (!(this.f1588d == null || this.f1589e == null)) {
                return this.f1588d.a(i, this.f1589e.J(), this.C);
            }
        } else if (i2 == 4) {
            this.o = false;
            if (this.f1588d != null) {
                this.f1588d.s();
            }
        }
        return true;
    }

    private void b(Context context, int i) {
        if (C() && context != null && this.Z != i) {
            this.Z = i;
            if (!(i == 4 || i == 0)) {
                this.E = false;
            }
            if (!this.E && !q() && this.B) {
                c(2, i);
            }
            WeakReference<a> weakReference = this.J;
            if (weakReference != null && weakReference.get() != null) {
                ((a) this.J.get()).a(this.Z);
            }
        }
    }

    /* access modifiers changed from: private */
    public void c(Context context, int i) {
        b(context, i);
        if (i == 4) {
            this.o = false;
        }
    }

    public void a(Context context, int i) {
        b(context, i);
        if (i == 4) {
            this.o = false;
            d();
        }
    }

    public void v() {
        if (!this.aa && this.O) {
            Context applicationContext = m.a().getApplicationContext();
            this.aa = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                applicationContext.registerReceiver(this.Y, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    public void w() {
        if (this.aa && this.O) {
            Context applicationContext = m.a().getApplicationContext();
            this.aa = false;
            try {
                applicationContext.unregisterReceiver(this.Y);
            } catch (Exception unused) {
            }
        }
    }

    public void a(a aVar) {
        this.J = new WeakReference<>(aVar);
    }

    public void c(boolean z2) {
        this.l = z2;
    }

    public void d(boolean z2) {
        this.G = z2;
    }

    public boolean r() {
        return this.N;
    }

    public void e(boolean z2) {
        this.O = z2;
    }

    public void b(com.bykv.vk.openvk.component.video.api.c.c cVar) {
        this.P = cVar;
    }

    /* access modifiers changed from: private */
    public boolean d(int i, int i2) {
        l.b("TTVideoLandingPage", "OnError - Error code: " + i + " Extra code: " + i2);
        boolean z2 = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z2;
    }

    public long k() {
        return g() + h();
    }

    /* access modifiers changed from: private */
    public void L() {
        if (this.f1589e != null) {
            m.g().a(com.bytedance.sdk.openadsdk.k.e.a(this.f1589e.T(), true, this.f1589e));
        }
    }

    private void M() {
        if (this.f1592h != null) {
            com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f1589e, (com.bykv.vk.openvk.component.video.api.b.a) this.f1588d, this.P);
        }
    }
}
