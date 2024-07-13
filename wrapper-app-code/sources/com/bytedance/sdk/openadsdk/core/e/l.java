package com.bytedance.sdk.openadsdk.core.e;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.core.b.a;
import com.bytedance.sdk.openadsdk.core.b.b;
import com.bytedance.sdk.openadsdk.core.k;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.a.d;
import com.bytedance.sdk.openadsdk.core.z;
import com.bytedance.sdk.openadsdk.utils.i;
import com.bytedance.sdk.openadsdk.utils.j;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.com.bytedance.overseas.sdk.a.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LandingPageModel */
public class l {
    private LinearLayout A;
    /* access modifiers changed from: private */
    public View B;
    private ImageView C;
    private View D;
    /* access modifiers changed from: private */
    public long E;
    /* access modifiers changed from: private */
    public AtomicBoolean F = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public Activity G;
    /* access modifiers changed from: private */
    public String H;
    /* access modifiers changed from: private */
    public c I;
    private n J;
    private AtomicBoolean K = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public boolean L = false;

    /* renamed from: a  reason: collision with root package name */
    ImageView f1104a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f1105b;

    /* renamed from: c  reason: collision with root package name */
    TextView f1106c;

    /* renamed from: d  reason: collision with root package name */
    FrameLayout f1107d;

    /* renamed from: e  reason: collision with root package name */
    TextView f1108e;

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f1109f;

    /* renamed from: g  reason: collision with root package name */
    n f1110g;

    /* renamed from: h  reason: collision with root package name */
    FrameLayout f1111h;
    ObjectAnimator i;
    ObjectAnimator j;
    ObjectAnimator k;
    ObjectAnimator l;
    ObjectAnimator m;
    c.a n;
    a o;
    b p;
    private View q;
    private View r;
    private TextView s;
    private TextView t;
    private TTRoundRectImageView u;
    private TextView v;
    private w w;
    /* access modifiers changed from: private */
    public SSWebView x;
    /* access modifiers changed from: private */
    public FrameLayout y;
    private AnimatorSet z;

    public l(Activity activity, n nVar, String str, FrameLayout frameLayout) {
        this.G = activity;
        this.f1110g = nVar;
        this.H = str;
        if (b(nVar)) {
            this.H = "landingpage_split_screen";
        } else if (c(nVar)) {
            this.H = "landingpage_direct";
        }
        this.o = new a(m.a(), this.f1110g, this.H, u.a(str));
        this.p = new b(m.a(), this.f1110g, this.H, u.a(str), true);
        this.f1111h = frameLayout;
        try {
            if (c(this.f1110g)) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "timeDown", new int[]{0, (int) (this.f1110g.a().b() * 1000)});
                this.k = ofInt;
                ofInt.setDuration(this.f1110g.a().b() * 1000);
                this.k.setInterpolator(new LinearInterpolator());
                this.k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (l.this.n != null && l.this.f1110g.a() != null) {
                            l.this.n.a(((Integer) valueAnimator.getAnimatedValue()).longValue(), l.this.f1110g.a().b() * 1000);
                        }
                    }
                });
                this.k.start();
            }
        } catch (Exception unused) {
        }
    }

    public void a(c.a aVar) {
        this.n = aVar;
    }

    public void a() {
        Activity activity = this.G;
        SSWebView sSWebView = (SSWebView) activity.findViewById(t.e(activity, "tt_reward_browser_webview_loading"));
        this.x = sSWebView;
        if (sSWebView == null || n.a(this.f1110g)) {
            v.a((View) this.x, 8);
        } else {
            this.x.a();
        }
        Activity activity2 = this.G;
        this.y = (FrameLayout) activity2.findViewById(t.e(activity2, "tt_reward_loading_container"));
        Activity activity3 = this.G;
        this.A = (LinearLayout) activity3.findViewById(t.e(activity3, "wave_container"));
        Activity activity4 = this.G;
        this.B = activity4.findViewById(t.e(activity4, "tt_up_slide"));
        Activity activity5 = this.G;
        this.C = (ImageView) activity5.findViewById(t.e(activity5, "tt_up_slide_image"));
        Activity activity6 = this.G;
        this.D = activity6.findViewById(t.e(activity6, "tt_video_container_root"));
        Activity activity7 = this.G;
        this.f1105b = (FrameLayout) activity7.findViewById(t.e(activity7, "tt_image_reward_container"));
        Activity activity8 = this.G;
        this.f1104a = (ImageView) activity8.findViewById(t.e(activity8, "tt_image_reward"));
        Activity activity9 = this.G;
        this.f1109f = (RelativeLayout) activity9.findViewById(t.e(activity9, "tt_browser_webview_page_loading"));
        Activity activity10 = this.G;
        this.f1106c = (TextView) activity10.findViewById(t.e(activity10, "tt_loading_tip"));
        Activity activity11 = this.G;
        this.f1107d = (FrameLayout) activity11.findViewById(t.e(activity11, "tt_video_container_back"));
        Activity activity12 = this.G;
        this.r = activity12.findViewById(t.e(activity12, "tt_back_container"));
        Activity activity13 = this.G;
        this.q = activity13.findViewById(t.e(activity13, "tt_loading_container"));
        Activity activity14 = this.G;
        this.s = (TextView) activity14.findViewById(t.e(activity14, "tt_back_container_title"));
        Activity activity15 = this.G;
        this.t = (TextView) activity15.findViewById(t.e(activity15, "tt_back_container_des"));
        Activity activity16 = this.G;
        this.u = (TTRoundRectImageView) activity16.findViewById(t.e(activity16, "tt_back_container_icon"));
        Activity activity17 = this.G;
        this.v = (TextView) activity17.findViewById(t.e(activity17, "tt_back_container_download"));
        if (!(this.f1106c == null || this.f1110g.a() == null)) {
            this.f1106c.setText(this.f1110g.a().c());
        }
        Activity activity18 = this.G;
        this.f1108e = (TextView) activity18.findViewById(t.e(activity18, "tt_ad_loading_logo"));
        if ((c(this.f1110g) || b(this.f1110g)) && this.f1110g.a() != null) {
            TextView textView = this.f1108e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            k.d().postDelayed(new Runnable() {
                public void run() {
                    if (!l.this.F.get()) {
                        e.a(m.a(), l.this.f1110g, l.this.H, System.currentTimeMillis() - l.this.E, false);
                        l.this.m();
                    }
                }
            }, this.f1110g.a().a() * 1000);
        }
        i();
        if (b(this.f1110g)) {
            o();
            if (!c()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.y.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.y.setLayoutParams(layoutParams);
            }
        }
        if (c(this.f1110g)) {
            this.D.setVisibility(8);
        }
    }

    private void i() {
        SSWebView sSWebView = this.x;
        if (!(sSWebView == null || sSWebView.getWebView() == null)) {
            com.bytedance.sdk.openadsdk.core.widget.a.b.a(m.a()).a(false).b(false).a(this.x.getWebView());
            SSWebView sSWebView2 = this.x;
            if (!(sSWebView2 == null || sSWebView2.getWebView() == null)) {
                n a2 = new n(m.a(), this.f1110g, this.x.getWebView()).a(true);
                this.J = a2;
                a2.a(this.H);
            }
            j();
            this.x.setLandingPage(true);
            this.x.setTag(this.H);
            this.x.setMaterialMeta(this.f1110g.aC());
            this.x.setWebViewClient(new d(m.a(), this.w, this.f1110g.Y(), this.J, true) {
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    l.this.k();
                }

                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (l.this.G instanceof com.bytedance.sdk.openadsdk.core.video.c.c) {
                        ((com.bytedance.sdk.openadsdk.core.video.c.c) l.this.G).f();
                    }
                    long unused = l.this.E = System.currentTimeMillis();
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    String b2 = b(str2);
                    if (this.f1802f != null) {
                        this.f1802f.a(webView, i, str, str2, b(str2));
                    }
                    boolean z = true;
                    boolean z2 = b2 != null && b2.startsWith("image");
                    if (b2 == null || !b2.startsWith("mp4")) {
                        z = false;
                    }
                    if (!z2 && !z && !l.this.F.get()) {
                        l.this.m();
                    }
                }

                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        l.this.m();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }
            });
            this.x.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.w, this.J) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (l.this.G != null && !l.this.G.isFinishing() && i == 100) {
                        l.this.k();
                    }
                }
            });
            if (this.I == null) {
                this.I = com.com.bytedance.overseas.sdk.a.d.a(m.a(), this.f1110g, this.H);
            }
            this.x.setDownloadListener(new DownloadListener() {
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (l.this.I != null) {
                        l.this.I.d();
                    }
                }
            });
            SSWebView sSWebView3 = this.x;
            if (sSWebView3 != null) {
                sSWebView3.setUserAgentString(i.a(sSWebView3.getWebView(), (int) BuildConfig.VERSION_CODE));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.x.setMixedContentMode(0);
            }
            this.x.getWebView().setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!l.this.L) {
                        l.this.p.onTouch(view, motionEvent);
                    }
                    if (l.this.L || motionEvent.getAction() != 1) {
                        return false;
                    }
                    l.this.x.getWebView().performClick();
                    boolean unused = l.this.L = true;
                    return false;
                }
            });
            this.x.getWebView().setOnClickListener(this.p);
            e.a(m.a(), this.f1110g, this.H);
            j.a(this.x, this.f1110g.O());
        }
        if (this.x != null) {
            q();
        }
    }

    private void j() {
        w wVar = new w(m.a());
        this.w = wVar;
        wVar.b(this.x).d(this.f1110g.Y()).e(this.f1110g.ac()).a(this.f1110g).b(-1).a(this.f1110g.F()).c(this.H).f(u.i(this.f1110g)).a(this.x);
    }

    public static boolean a(n nVar) {
        if (nVar == null) {
            return false;
        }
        return c(nVar) || b(nVar);
    }

    /* access modifiers changed from: private */
    public void k() {
        if (!this.F.get() && !this.K.get()) {
            this.F.set(true);
            e.a(m.a(), this.f1110g, this.H, System.currentTimeMillis() - this.E, true);
            l();
        }
    }

    private void l() {
        this.f1109f.setVisibility(8);
        if (!c(this.f1110g) && c()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "timeVisible", new float[]{0.0f, 1.0f});
            this.m = ofFloat;
            ofFloat.setDuration(100);
            this.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) l.this.y.getLayoutParams();
                    layoutParams.weight = (float) (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.25d);
                    l.this.a((float) (1.0d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.2d)));
                    l.this.y.setLayoutParams(layoutParams);
                }
            });
            this.m.start();
        }
    }

    /* access modifiers changed from: private */
    public void m() {
        if (!this.F.get()) {
            n();
            this.K.set(true);
            Activity activity = this.G;
            if (activity instanceof com.bytedance.sdk.openadsdk.core.video.c.c) {
                ((com.bytedance.sdk.openadsdk.core.video.c.c) activity).k();
            }
            this.q.setVisibility(8);
            this.r.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.r.getLayoutParams();
            layoutParams.addRule(13);
            layoutParams.addRule(10, 0);
            this.r.setLayoutParams(layoutParams);
            if (this.f1110g.M() != null && !TextUtils.isEmpty(this.f1110g.M().a())) {
                com.bytedance.sdk.openadsdk.i.d.a().a(this.f1110g.M().a(), (ImageView) this.u);
            }
            this.s.setText(this.f1110g.K());
            this.t.setText(this.f1110g.V());
            if (this.v != null) {
                b();
                this.v.setClickable(true);
                this.v.setOnClickListener(this.o);
                this.v.setOnTouchListener(this.o);
            }
        }
    }

    private void n() {
        if (c(this.f1110g)) {
            Activity activity = this.G;
            if (activity instanceof com.bytedance.sdk.openadsdk.core.video.c.c) {
                ((com.bytedance.sdk.openadsdk.core.video.c.c) activity).f();
                ((com.bytedance.sdk.openadsdk.core.video.c.c) this.G).e();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        n nVar = this.f1110g;
        if (nVar != null && !TextUtils.isEmpty(nVar.W())) {
            this.v.setText(this.f1110g.W());
        }
    }

    private void o() {
        if (c()) {
            this.B.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.C, "translationY", new float[]{16.0f, 0.0f}).setDuration(500);
            this.i = duration;
            duration.setRepeatMode(2);
            this.i.setRepeatCount(-1);
            this.i.start();
            this.B.setClickable(true);
            this.B.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!l.this.L) {
                        l.this.p.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    l.this.l = ObjectAnimator.ofFloat(this, "timeSlide", new float[]{0.0f, 1.0f});
                    l.this.l.setDuration(200);
                    l.this.l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) l.this.y.getLayoutParams();
                            layoutParams.weight = (float) (((double) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f)) + 0.25d);
                            l.this.a((float) (0.800000011920929d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.5d)));
                            l.this.y.setLayoutParams(layoutParams);
                        }
                    });
                    l.this.B.performClick();
                    boolean unused = l.this.L = true;
                    l.this.l.start();
                    l.this.B.setVisibility(8);
                    return true;
                }
            });
            this.B.setOnClickListener(this.p);
        }
        if (!p()) {
            this.f1111h.setVisibility(8);
            this.f1105b.setVisibility(0);
            this.f1104a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f1104a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    e.b(m.a(), l.this.f1110g, l.this.H);
                }
            });
            n nVar = this.f1110g;
            if (!(nVar == null || nVar.P() == null || this.f1110g.P().size() <= 0 || this.f1110g.P().get(0) == null || TextUtils.isEmpty(this.f1110g.P().get(0).a()))) {
                com.bytedance.sdk.openadsdk.i.d.a().a(this.f1110g.P().get(0), this.f1104a);
            }
        }
        try {
            com.bytedance.sdk.openadsdk.d.a.a().a(this.f1110g.P().get(0).a()).a(com.bytedance.sdk.component.d.t.BITMAP).a((com.bytedance.sdk.component.d.n) new com.bytedance.sdk.component.d.n<Bitmap>() {
                public void a(int i, String str, Throwable th) {
                }

                public void a(com.bytedance.sdk.component.d.j<Bitmap> jVar) {
                    Bitmap a2;
                    try {
                        Bitmap b2 = jVar.b();
                        if (Build.VERSION.SDK_INT >= 17 && (a2 = com.bytedance.sdk.component.adexpress.c.a.a(m.a(), b2, 25)) != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(m.a().getResources(), a2);
                            if (!l.this.p()) {
                                l.this.f1105b.setBackground(bitmapDrawable);
                                return;
                            }
                            l.this.f1107d.setBackground(bitmapDrawable);
                            View view = null;
                            if (l.this.G instanceof com.bytedance.sdk.openadsdk.core.video.c.c) {
                                view = ((com.bytedance.sdk.openadsdk.core.video.c.c) l.this.G).m();
                            }
                            if (view != null && (view.getParent() instanceof View)) {
                                ((View) view.getParent()).setBackground(bitmapDrawable);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public boolean p() {
        return n.c(this.f1110g);
    }

    private void q() {
        this.z = new AnimatorSet();
        LinearLayout linearLayout = this.A;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            this.j = duration;
            duration.setRepeatMode(2);
            this.j.setRepeatCount(-1);
            AnimatorSet.Builder play = this.z.play(this.j);
            for (int i2 = 1; i2 < this.A.getChildCount(); i2++) {
                float f2 = i2 % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.A.getChildAt(i2), "translationY", new float[]{-f2, f2}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.z.start();
        }
    }

    public boolean c() {
        return this.f1110g.ad() == 15 || this.f1110g.ad() == 16;
    }

    public void a(float f2) {
        try {
            ((com.bytedance.sdk.openadsdk.core.video.c.c) this.G).l();
        } catch (Throwable unused) {
        }
    }

    public static boolean b(n nVar) {
        if (nVar.L() == 3 && nVar.f() == 6 && !p.a(nVar) && nVar.am() == 1 && (nVar.an() == 0.0f || nVar.an() == 100.0f)) {
            return true;
        }
        return false;
    }

    public static boolean c(n nVar) {
        if (nVar == null || nVar.L() != 3 || nVar.f() != 5 || p.a(nVar)) {
            return false;
        }
        if (nVar.an() == 0.0f || nVar.an() == 100.0f) {
            return true;
        }
        return false;
    }

    public static boolean d(n nVar) {
        if (nVar != null && m.h().g() && nVar.E() && !b(nVar) && !c(nVar)) {
            return true;
        }
        return false;
    }

    public void d() {
        FrameLayout frameLayout = this.y;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            this.D.setVisibility(0);
        }
    }

    public void e() {
        SSWebView sSWebView;
        n nVar = this.J;
        if (!(nVar == null || (sSWebView = this.x) == null)) {
            nVar.a(sSWebView);
        }
        ObjectAnimator objectAnimator = this.k;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.k.cancel();
        }
        ObjectAnimator objectAnimator2 = this.l;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.l.cancel();
        }
        ObjectAnimator objectAnimator3 = this.m;
        if (objectAnimator3 != null) {
            objectAnimator3.removeAllUpdateListeners();
            this.m.cancel();
        }
        AnimatorSet animatorSet = this.z;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator4 = this.j;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        ObjectAnimator objectAnimator5 = this.i;
        if (objectAnimator5 != null) {
            objectAnimator5.cancel();
        }
        if (this.x != null) {
            z.a(m.a(), this.x.getWebView());
            z.a(this.x.getWebView());
        }
        this.x = null;
        w wVar = this.w;
        if (wVar != null) {
            wVar.n();
        }
        n nVar2 = this.J;
        if (nVar2 != null) {
            nVar2.f();
        }
    }

    public void f() {
        w wVar = this.w;
        if (wVar != null) {
            wVar.l();
        }
        n nVar = this.J;
        if (nVar != null) {
            nVar.d();
        }
    }

    public void g() {
        n nVar = this.J;
        if (nVar != null) {
            nVar.e();
        }
    }

    public void h() {
        com.bytedance.sdk.openadsdk.core.t.a().b(true);
        w wVar = this.w;
        if (wVar != null) {
            wVar.m();
        }
    }
}
