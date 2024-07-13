package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.a.e.b;
import com.bykv.vk.openvk.component.video.api.b.a;
import com.bykv.vk.openvk.component.video.api.d.b;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderSurfaceView;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.b.b;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.RoundImageView;
import com.bytedance.sdk.openadsdk.core.widget.d;
import com.bytedance.sdk.openadsdk.core.widget.e;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.com.bytedance.overseas.sdk.a.c;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* compiled from: NativeVideoLayout */
public class d implements a, b<n>, com.bykv.vk.openvk.component.video.api.renderview.a, x.a, d.a, e.b {
    a A;
    boolean B;
    c C;
    com.bykv.vk.openvk.component.video.api.d.c D;
    com.bytedance.sdk.openadsdk.core.b.a E;
    com.bytedance.sdk.openadsdk.core.b.a F;
    boolean G;
    private View H;
    private TextView I;
    private TextView J;
    /* access modifiers changed from: private */
    public NativeVideoTsView.a K;
    private final String L;

    /* renamed from: a  reason: collision with root package name */
    View f1680a;

    /* renamed from: b  reason: collision with root package name */
    com.bykv.vk.openvk.component.video.api.renderview.b f1681b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f1682c;

    /* renamed from: d  reason: collision with root package name */
    View f1683d;

    /* renamed from: e  reason: collision with root package name */
    View f1684e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f1685f;

    /* renamed from: g  reason: collision with root package name */
    ViewStub f1686g;

    /* renamed from: h  reason: collision with root package name */
    View f1687h;
    ImageView i;
    View j;
    RoundImageView k;
    TextView l;
    TextView m;
    TextView n;
    ViewStub o;
    int p;
    int q;
    int r;
    int s;
    boolean t;
    boolean u;
    int v;
    EnumSet<b.a> w;
    n x;
    Context y;
    e z;

    public void a(long j2) {
    }

    public void a(long j2, long j3) {
    }

    public void a(Message message) {
    }

    public void a(View view, boolean z2) {
    }

    public void a(ViewGroup viewGroup) {
    }

    public void a(String str) {
    }

    public void b(SurfaceTexture surfaceTexture) {
    }

    public void b(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    public void b(ViewGroup viewGroup) {
    }

    public void b(boolean z2) {
    }

    public boolean b(int i2) {
        return false;
    }

    public void c(boolean z2) {
    }

    public void e() {
    }

    public void f() {
    }

    public boolean j() {
        return false;
    }

    public void n() {
    }

    public d(Context context, View view, boolean z2, EnumSet<b.a> enumSet, n nVar, com.bykv.vk.openvk.component.video.api.d.c cVar, boolean z3) {
        this.t = true;
        this.B = true;
        this.G = true;
        this.L = Build.MODEL;
        if (!(this instanceof c)) {
            this.y = m.a().getApplicationContext();
            d(z3);
            this.f1680a = view;
            this.t = z2;
            this.w = enumSet == null ? EnumSet.noneOf(b.a.class) : enumSet;
            this.D = cVar;
            this.x = nVar;
            c(8);
            a(context, this.f1680a);
            d();
            p();
        }
    }

    public d(Context context, View view, boolean z2, EnumSet<b.a> enumSet, n nVar, com.bykv.vk.openvk.component.video.api.d.c cVar) {
        this(context, view, z2, enumSet, nVar, cVar, true);
    }

    /* access modifiers changed from: package-private */
    public void p() {
        int i2;
        String str;
        com.bytedance.sdk.openadsdk.core.b.a aVar;
        String str2 = this.B ? "embeded_ad" : "embeded_ad_landingpage";
        if (u.b(this.x)) {
            str = this.B ? "draw_ad" : "draw_ad_landingpage";
            i2 = 6;
        } else if (u.c(this.x)) {
            str = "rewarded_video";
            i2 = 7;
        } else if (u.d(this.x)) {
            str = "fullscreen_interstitial_ad";
            i2 = 5;
        } else {
            str = str2;
            i2 = 1;
        }
        if (this.x.L() == 4) {
            this.C = com.com.bytedance.overseas.sdk.a.d.a(this.y, this.x, str);
        }
        z();
        com.bytedance.sdk.openadsdk.core.b.a aVar2 = new com.bytedance.sdk.openadsdk.core.b.a(this.y, this.x, str, i2);
        this.E = aVar2;
        aVar2.b(true);
        if (this.B) {
            this.E.a(true);
        } else {
            this.E.a(false);
            this.E.c(true);
        }
        this.E.a(this.D);
        this.E.d(true);
        this.E.a((b.a) new b.a() {
            public void a(View view, int i) {
                if (d.this.K != null) {
                    d.this.K.a(view, i);
                }
            }
        });
        c cVar = this.C;
        if (!(cVar == null || (aVar = this.E) == null)) {
            aVar.a(cVar);
        }
        if (y()) {
            AnonymousClass2 r3 = new com.bytedance.sdk.openadsdk.core.b.a(this.y, this.x, str, i2) {
                public boolean b() {
                    boolean a2 = d.this.z != null ? d.this.z.a() : false;
                    StringBuilder sb = new StringBuilder();
                    sb.append("isVisible=");
                    sb.append(a2);
                    sb.append(",mPlayBtn.getVisibility() == VISIBLE->");
                    sb.append(d.this.f1682c.getVisibility() == 0);
                    l.c("ClickCreativeListener", sb.toString());
                    if (a2 || d.this.f1682c.getVisibility() == 0) {
                        return true;
                    }
                    return false;
                }

                public boolean c() {
                    return (d.this.f1687h != null && d.this.f1687h.getVisibility() == 0) || (d.this.j != null && d.this.j.getVisibility() == 0) || ((d.this.k != null && d.this.k.getVisibility() == 0) || (d.this.l != null && d.this.l.getVisibility() == 0));
                }
            };
            this.F = r3;
            r3.a((b.a) new b.a() {
                public void a(View view, int i) {
                    if (d.this.K != null) {
                        d.this.K.a(view, i);
                    }
                }
            });
            this.F.b(true);
            if (this.B) {
                this.F.a(true);
            } else {
                this.F.a(false);
            }
            this.F.a(this.D);
            this.F.d(true);
            c cVar2 = this.C;
            if (cVar2 != null) {
                this.F.a(cVar2);
            }
            View view = this.f1680a;
            if (view != null) {
                view.setOnClickListener(this.F);
                this.f1680a.setOnTouchListener(this.F);
            }
        }
    }

    private boolean y() {
        return n.c(this.x) && this.x.G() == null && this.x.p() == 1;
    }

    public void a(NativeVideoTsView.a aVar) {
        this.K = aVar;
    }

    public void a(TTNativeAd tTNativeAd) {
        com.bytedance.sdk.openadsdk.core.b.a aVar = this.E;
        if (aVar != null) {
            aVar.a(tTNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.b.a aVar2 = this.F;
        if (aVar2 != null) {
            aVar2.a(tTNativeAd);
        }
    }

    private void z() {
        if (this.y != null && this.f1680a != null) {
            AnonymousClass4 r0 = new View(this.y) {
                private void a() {
                }

                private void b() {
                }

                public void onFinishTemporaryDetach() {
                    super.onFinishTemporaryDetach();
                    a();
                }

                /* access modifiers changed from: protected */
                public void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    b();
                }

                public void onStartTemporaryDetach() {
                    super.onStartTemporaryDetach();
                    b();
                }
            };
            View view = this.f1680a;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).addView(r0, 0, new RelativeLayout.LayoutParams(0, 0));
            }
        }
    }

    public com.bykv.vk.openvk.component.video.api.renderview.b q() {
        return this.f1681b;
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, View view) {
        View view2;
        long currentTimeMillis = System.currentTimeMillis();
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.component.video.api.d.c cVar = this.D;
        if (cVar == null || !cVar.s()) {
            view2 = new SSRenderSurfaceView(this.y);
            l.b("NewLiveViewLayout", "use SurfaceView......");
        } else {
            view2 = new SSRenderTextureView(this.y);
            l.b("NewLiveViewLayout", "use TextureView......");
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(view2, 0, layoutParams);
        }
        v.a(view2, 8);
        this.f1681b = (com.bykv.vk.openvk.component.video.api.renderview.b) view2;
        this.f1682c = (ImageView) view.findViewById(t.e(context, "tt_video_play"));
        this.f1683d = view.findViewById(t.e(context, "tt_video_loading_retry_layout"));
        this.f1684e = view.findViewById(t.e(context, "tt_video_loading_progress"));
        this.f1685f = (ImageView) view.findViewById(t.e(context, "tt_video_loading_cover_image"));
        this.f1686g = (ViewStub) view.findViewById(t.e(context, "tt_video_ad_cover"));
        this.o = (ViewStub) view.findViewById(t.e(context, "tt_video_draw_layout_viewStub"));
        l.b("useTime", "NativeVideoLayout**findViews use time :" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* access modifiers changed from: package-private */
    public void a(View view, Context context) {
        ViewStub viewStub;
        if (view != null && context != null && (viewStub = this.f1686g) != null && viewStub.getParent() != null && this.f1687h == null) {
            this.f1687h = this.f1686g.inflate();
            this.i = (ImageView) view.findViewById(t.e(context, "tt_video_ad_finish_cover_image"));
            this.j = view.findViewById(t.e(context, "tt_video_ad_cover_center_layout"));
            this.k = (RoundImageView) view.findViewById(t.e(context, "tt_video_ad_logo_image"));
            this.l = (TextView) view.findViewById(t.e(context, "tt_video_btn_ad_image_tv"));
            this.m = (TextView) view.findViewById(t.e(context, "tt_video_ad_name"));
            this.n = (TextView) view.findViewById(t.e(context, "tt_video_ad_button"));
        }
    }

    private void b(View view, Context context) {
        ViewStub viewStub;
        if (view != null && context != null && (viewStub = this.o) != null && viewStub.getParent() != null && this.H == null) {
            this.o.inflate();
            this.H = view.findViewById(t.e(context, "tt_video_ad_cover_center_layout_draw"));
            this.I = (TextView) view.findViewById(t.e(context, "tt_video_ad_button_draw"));
            this.J = (TextView) view.findViewById(t.e(context, "tt_video_ad_replay"));
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        if (this.A != null && this.z == null) {
            long currentTimeMillis = System.currentTimeMillis();
            e eVar = new e();
            this.z = eVar;
            eVar.a(this.y, this.f1680a);
            this.z.a(this.A, (e.b) this);
            l.b("useTime", "mVideoTrafficTipLayout use time :" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public boolean a(int i2, com.bykv.vk.openvk.component.video.api.c.b bVar, boolean z2) {
        e eVar = this.z;
        return eVar == null || eVar.a(i2, bVar, z2);
    }

    public void s() {
        e eVar = this.z;
        if (eVar != null) {
            eVar.a(false);
        }
    }

    public void a(com.bykv.vk.openvk.component.video.api.d.a aVar) {
        if (aVar instanceof a) {
            this.A = (a) aVar;
            r();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        if (this.A != null) {
            return true;
        }
        l.e("NewLiveViewLayout", "callback is null");
        return false;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f1681b.a(this);
        this.f1682c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!d.this.t()) {
                    return;
                }
                if (d.this.n == null || d.this.n.getVisibility() != 0) {
                    d.this.A.a((com.bykv.vk.openvk.component.video.api.d.b) d.this, view);
                }
            }
        });
    }

    public void d(int i2) {
        v.a(this.f1680a, 0);
        com.bykv.vk.openvk.component.video.api.renderview.b bVar = this.f1681b;
        if (bVar != null) {
            bVar.setVisibility(i2);
        }
    }

    public void d(boolean z2) {
        this.B = z2;
        if (z2) {
            com.bytedance.sdk.openadsdk.core.b.a aVar = this.E;
            if (aVar != null) {
                aVar.a(true);
            }
            com.bytedance.sdk.openadsdk.core.b.a aVar2 = this.F;
            if (aVar2 != null) {
                aVar2.a(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.b.a aVar3 = this.E;
        if (aVar3 != null) {
            aVar3.a(false);
        }
        com.bytedance.sdk.openadsdk.core.b.a aVar4 = this.F;
        if (aVar4 != null) {
            aVar4.a(false);
        }
    }

    public void a(int i2, int i3) {
        if (i2 == -1) {
            i2 = v.c(this.y);
        }
        if (i2 > 0) {
            this.p = i2;
            if (k() || j() || this.w.contains(b.a.fixedSize)) {
                this.q = i3;
            } else {
                this.q = e(i2);
            }
            b(this.p, this.q);
        }
    }

    public void b(boolean z2, boolean z3) {
        ImageView imageView = this.f1682c;
        if (imageView == null) {
            return;
        }
        if (z2) {
            imageView.setImageResource(t.d(this.y, "tt_play_movebar_textpage"));
        } else {
            imageView.setImageResource(t.d(this.y, "tt_stop_movebar_textpage"));
        }
    }

    public void b(int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = this.f1680a.getLayoutParams();
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.width = i2;
        }
        if (i3 == -1 || i3 == -2 || i3 > 0) {
            layoutParams.height = i3;
        }
        this.f1680a.setLayoutParams(layoutParams);
    }

    private int e(int i2) {
        if (this.r <= 0 || this.s <= 0) {
            return 0;
        }
        int dimensionPixelSize = this.y.getResources().getDimensionPixelSize(t.i(this.y, "tt_video_container_maxheight"));
        int dimensionPixelSize2 = this.y.getResources().getDimensionPixelSize(t.i(this.y, "tt_video_container_minheight"));
        int i3 = (int) (((float) this.s) * ((((float) i2) * 1.0f) / ((float) this.r)));
        if (i3 > dimensionPixelSize) {
            return dimensionPixelSize;
        }
        return i3 < dimensionPixelSize2 ? dimensionPixelSize2 : i3;
    }

    public void c(int i2, int i3) {
        this.r = i2;
        this.s = i3;
    }

    public void a(int i2) {
        l.c("Progress", "setSeekProgress-percent=" + i2);
    }

    public void c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            if (this.f1680a.getParent() == null) {
                viewGroup.addView(this.f1680a);
            }
            c(0);
        }
    }

    public View c() {
        return this.f1680a;
    }

    public void g() {
        n nVar;
        v.f(this.f1683d);
        v.f(this.f1684e);
        if (!(this.f1685f == null || (nVar = this.x) == null || nVar.J() == null || this.x.J().h() == null)) {
            v.f((View) this.f1685f);
            com.bytedance.sdk.openadsdk.i.d.a().a(this.x.J().h(), this.f1685f);
        }
        if (this.f1682c.getVisibility() == 0) {
            v.a((View) this.f1682c, 8);
        }
    }

    public void u() {
        v.f(this.f1683d);
        v.f(this.f1684e);
        if (this.f1682c.getVisibility() == 0) {
            v.a((View) this.f1682c, 8);
        }
    }

    public void a() {
        a(false, this.t);
        w();
    }

    public void v() {
        v.a(this.f1680a, 0);
        com.bykv.vk.openvk.component.video.api.renderview.b bVar = this.f1681b;
        if (bVar != null) {
            v.a(bVar.getView(), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        try {
            v.a(this.f1687h, 8);
            v.a((View) this.i, 8);
            v.a(this.j, 8);
            v.a((View) this.k, 8);
            v.a((View) this.l, 8);
            v.a((View) this.m, 8);
            v.a((View) this.n, 8);
        } catch (Exception unused) {
        }
    }

    private void f(int i2) {
        v.a(this.j, i2);
        v.a(this.H, i2);
    }

    public void a(boolean z2) {
        this.G = z2;
    }

    public void a(n nVar, WeakReference<Context> weakReference, boolean z2) {
        String str;
        n nVar2;
        n nVar3;
        n nVar4;
        if (nVar != null) {
            a(false, this.t);
            a(this.f1680a, m.a());
            View view = this.f1687h;
            if (view != null) {
                v.a(view, 0);
            }
            ImageView imageView = this.i;
            if (imageView != null) {
                v.a((View) imageView, 0);
            }
            if (u.b(this.x)) {
                b(this.f1680a, m.a());
                v.a(this.j, 8);
                v.a((View) this.i, 0);
                v.a(this.H, 0);
                v.a((View) this.I, 0);
                v.a((View) this.J, 0);
                if (this.J != null && o.c(m.a()) == 0) {
                    v.a((View) this.J, 8);
                }
                View view2 = this.f1687h;
                if (view2 != null) {
                    view2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            if (d.this.D != null) {
                                ((com.bykv.vk.openvk.component.video.api.d.a) d.this.D).a();
                            }
                        }
                    });
                }
                if (!(this.i == null || (nVar4 = this.x) == null || nVar4.J() == null || this.x.J().h() == null)) {
                    com.bykv.vk.openvk.component.video.a.e.b.a((long) this.x.J().f(), this.x.J().i(), new b.C0219b() {
                        public void a(Bitmap bitmap) {
                            if (bitmap != null) {
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) d.this.i.getLayoutParams();
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    layoutParams.width = v.c(m.a());
                                    layoutParams.height = (int) ((float) ((bitmap.getHeight() * v.c(m.a())) / bitmap.getWidth()));
                                    layoutParams.addRule(13);
                                    d.this.i.setLayoutParams(layoutParams);
                                }
                                d.this.i.setImageBitmap(bitmap);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.i.d.a().a(d.this.x.J().h(), d.this.i);
                        }
                    });
                }
            } else {
                v.a(this.j, 0);
                if (!(this.i == null || (nVar3 = this.x) == null || nVar3.J() == null || this.x.J().h() == null)) {
                    com.bytedance.sdk.openadsdk.i.d.a().a(this.x.J().h(), this.i);
                }
            }
            if (!TextUtils.isEmpty(nVar.K())) {
                str = nVar.K();
            } else if (!TextUtils.isEmpty(nVar.U())) {
                str = nVar.U();
            } else {
                str = !TextUtils.isEmpty(nVar.V()) ? nVar.V() : "";
            }
            if (this.k != null && (nVar2 = this.x) != null && nVar2.M() != null && this.x.M().a() != null) {
                v.a((View) this.k, 0);
                v.a((View) this.l, 4);
                com.bytedance.sdk.openadsdk.i.d.a().a(this.x.M(), (ImageView) this.k);
                if (y()) {
                    this.k.setOnClickListener(this.F);
                    this.k.setOnTouchListener(this.F);
                } else {
                    this.k.setOnClickListener(this.E);
                    this.k.setOnTouchListener(this.E);
                }
            } else if (!TextUtils.isEmpty(str)) {
                v.a((View) this.k, 4);
                v.a((View) this.l, 0);
                TextView textView = this.l;
                if (textView != null) {
                    textView.setText(str.substring(0, 1));
                    if (y()) {
                        this.l.setOnClickListener(this.F);
                        this.l.setOnTouchListener(this.F);
                    } else {
                        this.l.setOnClickListener(this.E);
                        this.l.setOnTouchListener(this.E);
                    }
                }
            }
            if (this.m != null && !TextUtils.isEmpty(str)) {
                this.m.setText(str);
            }
            v.a((View) this.m, 0);
            v.a((View) this.n, 0);
            String W = nVar.W();
            if (TextUtils.isEmpty(W)) {
                int L2 = nVar.L();
                if (L2 == 2 || L2 == 3) {
                    W = t.a(this.y, "tt_video_mobile_go_detail");
                } else if (L2 != 4) {
                    W = L2 != 5 ? t.a(this.y, "tt_video_mobile_go_detail") : t.a(this.y, "tt_video_dial_phone");
                } else {
                    W = t.a(this.y, "tt_video_download_apk");
                }
            }
            TextView textView2 = this.n;
            if (textView2 != null) {
                textView2.setText(W);
                this.n.setOnClickListener(this.E);
                this.n.setOnTouchListener(this.E);
            }
            TextView textView3 = this.I;
            if (textView3 != null) {
                textView3.setText(W);
                this.I.setOnClickListener(this.E);
                this.I.setOnTouchListener(this.E);
            }
            if (!this.G) {
                f(4);
            }
        }
    }

    public void b() {
        v.e(this.f1683d);
        v.e(this.f1684e);
        ImageView imageView = this.f1685f;
        if (imageView != null) {
            v.e((View) imageView);
        }
    }

    public void h() {
        v.e(this.f1683d);
    }

    public void a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f1681b.getHolder()) {
            this.u = true;
            if (t()) {
                this.A.a((com.bykv.vk.openvk.component.video.api.d.b) this, surfaceHolder);
            }
        }
    }

    public void a(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        if (surfaceHolder == this.f1681b.getHolder() && t()) {
            this.A.a(this, surfaceHolder, i2, i3, i4);
        }
    }

    public void b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f1681b.getHolder()) {
            this.u = false;
            if (t()) {
                this.A.b((com.bykv.vk.openvk.component.video.api.d.b) this, surfaceHolder);
            }
        }
    }

    public void a(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.u = true;
        if (t()) {
            this.A.a((com.bykv.vk.openvk.component.video.api.d.b) this, surfaceTexture);
        }
    }

    public boolean a(SurfaceTexture surfaceTexture) {
        this.u = false;
        if (!t()) {
            return true;
        }
        this.A.b((com.bykv.vk.openvk.component.video.api.d.b) this, surfaceTexture);
        return true;
    }

    public void i() {
        c(8);
        if (x()) {
            this.f1681b.setVisibility(8);
        }
        ImageView imageView = this.f1685f;
        if (imageView != null) {
            imageView.setImageDrawable((Drawable) null);
        }
        c(8);
        v.a(this.f1687h, 8);
        v.a((View) this.i, 8);
        v.a(this.j, 8);
        v.a((View) this.k, 8);
        v.a((View) this.l, 8);
        v.a((View) this.m, 8);
        e eVar = this.z;
        if (eVar != null) {
            eVar.a(true);
        }
    }

    public boolean k() {
        return this.t;
    }

    public void a(boolean z2, boolean z3, boolean z4) {
        v.a((View) this.f1682c, (!z2 || this.f1683d.getVisibility() == 0) ? 8 : 0);
    }

    public void a(boolean z2, boolean z3) {
        v.a((View) this.f1682c, 8);
    }

    public void l() {
        a(true, false);
    }

    public boolean m() {
        return this.u;
    }

    public void c(int i2) {
        this.v = i2;
        v.a(this.f1680a, i2);
    }

    public boolean o() {
        e eVar = this.z;
        return eVar != null && eVar.a();
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        return !this.w.contains(b.a.alwayShowMediaView) || this.t;
    }

    public void a(Drawable drawable) {
        View view = this.f1680a;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }
}
