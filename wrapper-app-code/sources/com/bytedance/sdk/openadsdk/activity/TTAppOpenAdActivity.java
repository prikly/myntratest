package com.bytedance.sdk.openadsdk.activity;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.e;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.a;
import com.bytedance.sdk.openadsdk.component.e.b;
import com.bytedance.sdk.openadsdk.component.view.ButtonFlash;
import com.bytedance.sdk.openadsdk.component.view.a;
import com.bytedance.sdk.openadsdk.core.b.b;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.p;
import com.bytedance.sdk.openadsdk.utils.g;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import io.bidmachine.utils.IabUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class TTAppOpenAdActivity extends Activity implements x.a {
    private static TTAppOpenAd.AppOpenAdInteractionListener F;
    /* access modifiers changed from: private */
    public int A;
    /* access modifiers changed from: private */
    public String B;
    /* access modifiers changed from: private */
    public n C;
    private IListenerManager D;
    /* access modifiers changed from: private */
    public TTAppOpenAd.AppOpenAdInteractionListener E;
    /* access modifiers changed from: private */
    public int G;

    /* renamed from: a  reason: collision with root package name */
    TTAdDislikeDialog f7a;

    /* renamed from: b  reason: collision with root package name */
    TTAdDislikeToast f8b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicBoolean f9c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f10d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    protected boolean f11e = false;

    /* renamed from: f  reason: collision with root package name */
    protected final AtomicBoolean f12f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    protected final x f13g = new x(Looper.getMainLooper(), this);

    /* renamed from: h  reason: collision with root package name */
    private final String f14h = "open_ad";
    private RelativeLayout i;
    private FrameLayout j;
    private ImageView k;
    private TextView l;
    private ButtonFlash m;
    /* access modifiers changed from: private */
    public b n = new b();
    /* access modifiers changed from: private */
    public ValueAnimator o;
    /* access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.component.g.b p;
    /* access modifiers changed from: private */
    public long q;
    private com.bytedance.sdk.openadsdk.component.a.b r;
    private final a s = new a();
    private float t;
    private float u;
    private ImageView v;
    /* access modifiers changed from: private */
    public long w = 0;
    /* access modifiers changed from: private */
    public j x;
    /* access modifiers changed from: private */
    public AtomicBoolean y = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public boolean z;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (b(bundle)) {
            if (!TTAdSdk.isInitSuccess()) {
                finish();
            }
            this.z = n.c(this.C);
            f();
            g();
            h();
            i();
            j();
            k();
        }
    }

    private void f() {
        int f2 = t.f(this, "tt_app_open_view");
        int d2 = this.C.d();
        if (d2 == 2) {
            f2 = t.f(this, "tt_app_open_view2");
        } else if (d2 == 3) {
            f2 = t.f(this, "tt_app_open_view3");
        }
        setContentView(f2);
    }

    private void g() {
        int i2;
        int i3;
        int am = this.C.am();
        if (this.C.d() == 3) {
            am = 2;
        }
        if (am != 2) {
            setRequestedOrientation(1);
        } else if (e()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        int i4 = v.i(getApplicationContext());
        int h2 = v.h(getApplicationContext());
        if (am == 2) {
            i2 = Math.max(i4, h2);
            i3 = Math.min(i4, h2);
        } else {
            i2 = Math.min(i4, h2);
            i3 = Math.max(i4, h2);
        }
        this.t = (float) i3;
        this.u = (float) i2;
        float j2 = v.j(getApplicationContext());
        if (!v.c((Activity) this)) {
            return;
        }
        if (am == 1) {
            this.t -= j2;
        } else if (am == 2) {
            this.u -= j2;
        }
    }

    private void h() {
        this.i = (RelativeLayout) findViewById(t.e(this, "tt_open_ad_container"));
        this.v = (ImageView) findViewById(t.e(this, "tt_open_ad_back_image"));
        this.j = (FrameLayout) findViewById(t.e(this, "tt_open_ad_video_container"));
        this.k = (ImageView) findViewById(t.e(this, "tt_open_ad_image"));
        this.m = (ButtonFlash) findViewById(t.e(this, "tt_open_ad_click_button"));
        this.l = (TextView) findViewById(t.e(this, "tt_ad_logo"));
        this.s.a(this);
        this.n.a((Activity) this);
    }

    private void i() {
        this.s.a(this.C, this.u, this.t);
    }

    private void j() {
        this.l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.a(TTAppOpenAdActivity.this, TTAppOpenAdActivity.this.C, "open_ad");
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        this.n.a((com.bytedance.sdk.openadsdk.component.e.a) new com.bytedance.sdk.openadsdk.component.e.a() {
            public void a(View view) {
                p.c(TTAppOpenAdActivity.this.A);
                TTAppOpenAdActivity.this.t();
                if (TTAppOpenAdActivity.this.p != null) {
                    TTAppOpenAdActivity.this.p.a(4);
                }
                com.bytedance.sdk.openadsdk.component.c.a.a(TTAppOpenAdActivity.this.C, TTAppOpenAdActivity.this.n.d(), TTAppOpenAdActivity.this.n.f(), TTAppOpenAdActivity.this.n.e());
                TTAppOpenAdActivity.this.finish();
            }

            public void b(View view) {
                TTAppOpenAdActivity.this.a();
            }

            public void a() {
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    TTAppOpenAdActivity.this.a("onAdTimeOver");
                } else if (TTAppOpenAdActivity.this.E != null) {
                    TTAppOpenAdActivity.this.E.onAdCountdownToZero();
                }
                TTAppOpenAdActivity.this.finish();
            }
        });
        com.bytedance.sdk.openadsdk.component.a.b bVar = new com.bytedance.sdk.openadsdk.component.a.b(this.C, this);
        this.r = bVar;
        bVar.a((b.a) new b.a() {
            public void a(View view, int i) {
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    TTAppOpenAdActivity.this.a("onAdClicked");
                } else if (TTAppOpenAdActivity.this.E != null) {
                    TTAppOpenAdActivity.this.E.onAdClicked();
                }
            }
        });
        com.bytedance.sdk.openadsdk.component.a.a a2 = this.r.a();
        if (this.C.c() == 1) {
            this.i.setOnClickListener(a2);
            this.i.setOnTouchListener(a2);
        }
        this.m.setOnClickListener(a2);
        this.m.setOnTouchListener(a2);
    }

    private void k() {
        this.s.a();
        this.m.setText(this.C.W());
        this.n.b(m.h().i(this.A));
        if (this.z) {
            a(0);
            b(8);
            this.n.a((float) this.C.J().f());
            this.o = this.n.b();
            this.n.a(0);
            m();
            return;
        }
        int j2 = m.h().j(this.A);
        a(8);
        b(0);
        this.n.a((float) j2);
        this.o = this.n.b();
        this.n.a(0);
        l();
    }

    private void l() {
        s();
        k kVar = this.C.P().get(0);
        g.a(new com.bytedance.sdk.openadsdk.i.a(kVar.a(), kVar.g()), kVar.b(), kVar.c(), new g.a() {
            public void a() {
            }

            public void b() {
            }

            public void a(com.bytedance.sdk.openadsdk.i.a.b bVar) {
                if (bVar.c()) {
                    TTAppOpenAdActivity.this.a(bVar);
                    TTAppOpenAdActivity.this.a(bVar.a());
                }
            }
        }, com.bytedance.sdk.openadsdk.component.f.a.b(TextUtils.isEmpty(kVar.g()) ? e.a(kVar.a()) : kVar.g(), this.A).getParent());
    }

    /* access modifiers changed from: private */
    public void a(Bitmap bitmap) {
        Bitmap a2;
        if (bitmap != null) {
            try {
                if (Build.VERSION.SDK_INT >= 17 && (a2 = com.bytedance.sdk.component.adexpress.c.a.a(m.a(), bitmap, 25)) != null) {
                    this.v.setImageDrawable(new BitmapDrawable(m.a().getResources(), a2));
                }
            } catch (Throwable unused) {
                l.e("TTAppOpenAdActivity", "bindBackGroundImage error");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(com.bytedance.sdk.openadsdk.i.a.b bVar) {
        if (bVar.a() != null) {
            this.k.setImageBitmap(bVar.a());
        } else if (this.C.P() != null && this.C.P().get(0) != null) {
            Drawable a2 = g.a(bVar.b(), this.C.P().get(0).b());
            this.k.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.k.setImageDrawable(a2);
        }
    }

    private void m() {
        boolean z2;
        s();
        com.bytedance.sdk.openadsdk.component.g.b bVar = new com.bytedance.sdk.openadsdk.component.g.b(this);
        this.p = bVar;
        bVar.a(this.j, this.C);
        this.p.a((c.a) new c.a() {
            public void a(long j, int i) {
                l.b("TTAppOpenAdActivity", "onComplete");
            }

            public void b(long j, int i) {
                l.b("TTAppOpenAdActivity", "onError");
                TTAppOpenAdActivity.this.t();
                TTAppOpenAdActivity.this.finish();
            }

            public void a() {
                l.b("TTAppOpenAdActivity", "onTimeOut");
                TTAppOpenAdActivity.this.t();
                TTAppOpenAdActivity.this.finish();
            }

            public void a(long j, long j2) {
                long unused = TTAppOpenAdActivity.this.q = j;
                if (!TTAppOpenAdActivity.this.f11e && TTAppOpenAdActivity.this.p.b()) {
                    TTAppOpenAdActivity.this.p.d();
                }
                TTAppOpenAdActivity.this.p();
            }
        });
        try {
            z2 = this.p.a();
        } catch (Throwable th) {
            l.e("TTAppOpenAdActivity", "ttAppOpenAd playVideo error: " + th.getMessage());
            z2 = false;
        }
        if (z2) {
            o();
        } else {
            finish();
        }
        com.bytedance.sdk.openadsdk.component.a.a(this.C, (a.d) new a.d() {
            public void a() {
            }

            public void a(Bitmap bitmap) {
                TTAppOpenAdActivity.this.a(bitmap);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        v.a((View) this.j, i2);
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        v.a((View) this.k, i2);
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (!isFinishing()) {
            if (this.f10d.get()) {
                q();
                return;
            }
            if (this.f7a == null) {
                n();
            }
            this.f7a.a();
        }
    }

    private void n() {
        if (this.f7a == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog((Context) this, this.C);
            this.f7a = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.a() {
                public void c(View view) {
                }

                public void a(View view) {
                    TTAppOpenAdActivity.this.f9c.set(true);
                    TTAppOpenAdActivity.this.c();
                }

                public void b(View view) {
                    TTAppOpenAdActivity.this.f9c.set(false);
                    TTAppOpenAdActivity.this.b();
                }

                public void a(int i, FilterWord filterWord) {
                    if (!TTAppOpenAdActivity.this.f10d.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                        TTAppOpenAdActivity.this.f10d.set(true);
                        TTAppOpenAdActivity.this.r();
                    }
                }
            });
        }
        ((FrameLayout) findViewById(16908290)).addView(this.f7a);
        if (this.f8b == null) {
            this.f8b = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(16908290)).addView(this.f8b);
        }
    }

    private void o() {
        if (this.z) {
            this.f13g.sendEmptyMessageDelayed(100, 5000);
        }
    }

    /* access modifiers changed from: private */
    public void p() {
        this.f13g.removeMessages(100);
    }

    private void q() {
        this.f8b.a(f.f1255d);
    }

    /* access modifiers changed from: private */
    public void r() {
        this.f8b.a(f.f1256e);
    }

    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.component.e.b bVar;
        if (m.h().h(this.A) == 1) {
            if (((long) this.n.d()) >= ((long) m.h().i(this.A)) * 1000 && (bVar = this.n) != null) {
                bVar.c();
            }
        }
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2 || !this.y.get()) {
            this.w = System.currentTimeMillis();
            return;
        }
        if (this.w > 0) {
            com.bytedance.sdk.openadsdk.b.e.a((System.currentTimeMillis() - this.w) + "", this.C, "open_ad", this.x);
        }
        this.w = 0;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f11e = true;
        if (this.f12f.getAndSet(true)) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f11e = false;
        c();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.z) {
            com.bytedance.sdk.openadsdk.component.c.a.a(this.C, this.q, this.n.e(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.c.a.a(this.C, -1, this.n.e(), false);
        }
        if (this.w > 0 && this.y.get()) {
            com.bytedance.sdk.openadsdk.b.e.a((System.currentTimeMillis() - this.w) + "", this.C, "open_ad", this.x);
            this.w = 0;
        }
        ButtonFlash buttonFlash = this.m;
        if (buttonFlash != null) {
            buttonFlash.a();
        }
        com.bytedance.sdk.openadsdk.component.g.b bVar = this.p;
        if (bVar != null) {
            bVar.f();
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            a("recycleRes");
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        F = null;
        this.E = null;
        TTAdDislikeDialog tTAdDislikeDialog = this.f7a;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.setCallback((TTAdDislikeDialog.a) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.z) {
            if (this.p.c()) {
                this.p.e();
            }
            o();
        }
        if (this.o != null && Build.VERSION.SDK_INT >= 19) {
            this.o.resume();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.z) {
            if (this.p.b()) {
                this.p.d();
            }
            p();
        }
        if (this.o != null && Build.VERSION.SDK_INT >= 19) {
            this.o.pause();
        }
    }

    private void s() {
        try {
            getWindow().getDecorView().post(new Runnable() {
                public void run() {
                    j unused = TTAppOpenAdActivity.this.x = new j();
                    TTAppOpenAdActivity.this.x.a(System.currentTimeMillis(), 1.0f);
                    long unused2 = TTAppOpenAdActivity.this.w = System.currentTimeMillis();
                    if (TTAppOpenAdActivity.this.o != null && !TTAppOpenAdActivity.this.o.isStarted()) {
                        TTAppOpenAdActivity.this.o.start();
                    }
                    if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                        TTAppOpenAdActivity.this.a("onAdShow");
                    } else if (TTAppOpenAdActivity.this.E != null) {
                        TTAppOpenAdActivity.this.E.onAdShow();
                    }
                    View findViewById = TTAppOpenAdActivity.this.findViewById(16908290);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IabUtils.KEY_WIDTH, findViewById.getWidth());
                        jSONObject.put(IabUtils.KEY_HEIGHT, findViewById.getHeight());
                        jSONObject.put("alpha", (double) findViewById.getAlpha());
                        HashMap hashMap = new HashMap();
                        hashMap.put("root_view", jSONObject.toString());
                        hashMap.put("ad_root", Integer.valueOf(TTAppOpenAdActivity.this.G));
                        hashMap.put("openad_creative_type", TTAppOpenAdActivity.this.z ? "video_normal_ad" : "image_normal_ad");
                        if (com.bytedance.sdk.openadsdk.component.view.a.c() == null) {
                            hashMap.put("appicon_acquirefail", "1");
                        }
                        com.bytedance.sdk.openadsdk.b.e.a(m.a(), TTAppOpenAdActivity.this.C, "open_ad", (Map<String, Object>) hashMap, (Double) null);
                        TTAppOpenAdActivity.this.y.set(true);
                    } catch (JSONException unused3) {
                        TTAppOpenAdActivity.this.finish();
                    }
                }
            });
        } catch (Throwable unused) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    public void t() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            a("onAdSkip");
            return;
        }
        TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener = this.E;
        if (appOpenAdInteractionListener != null) {
            appOpenAdInteractionListener.onAdSkip();
        }
    }

    /* access modifiers changed from: private */
    public void a(final String str) {
        com.bytedance.sdk.component.f.e.c(new com.bytedance.sdk.component.f.g("AppOpenAd_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTAppOpenAdActivity.this.d().executeAppOpenAdCallback(TTAppOpenAdActivity.this.B, str);
                } catch (Throwable th) {
                    l.c("TTAppOpenAdActivity", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    public IListenerManager d() {
        if (this.D == null) {
            this.D = com.bytedance.sdk.openadsdk.multipro.aidl.a.a.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a()).a(7));
        }
        return this.D;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v.a((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (!TTAppOpenAdActivity.this.isFinishing()) {
                            TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() {
                                public void run() {
                                    v.a((Activity) TTAppOpenAdActivity.this);
                                }
                            }, 2500);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    private boolean b(Bundle bundle) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.C = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(stringExtra));
                    } catch (Exception e2) {
                        l.c("TTAppOpenAdActivity", "initData MultiGlobalInfo throws ", e2);
                    }
                }
                this.B = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.C = com.bytedance.sdk.openadsdk.core.t.a().c();
            this.E = com.bytedance.sdk.openadsdk.core.t.a().f();
            com.bytedance.sdk.openadsdk.core.t.a().h();
        }
        a(getIntent());
        a(bundle);
        n nVar = this.C;
        if (nVar == null) {
            l.b("TTAppOpenAdActivity", "mMaterialMeta is null , no data to display ,the TTOpenAdActivity finished !!");
            finish();
            return false;
        }
        this.A = u.f(nVar);
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
        if (intent != null) {
            this.G = intent.getIntExtra(FullscreenAdService.DATA_KEY_AD_SOURCE, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
        if (bundle != null) {
            if (this.E == null) {
                this.E = F;
                F = null;
            }
            try {
                String string = bundle.getString("material_meta");
                this.B = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.G = bundle.getInt(FullscreenAdService.DATA_KEY_AD_SOURCE, 0);
                this.C = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(string));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.C != null ? this.C.ar().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.B);
            bundle.putInt(FullscreenAdService.DATA_KEY_AD_SOURCE, this.G);
        } catch (Throwable unused) {
        }
        F = this.E;
        super.onSaveInstanceState(bundle);
    }

    public void a(Message message) {
        if (message.what == 100) {
            com.bytedance.sdk.openadsdk.component.g.b bVar = this.p;
            if (bVar != null) {
                bVar.a(1);
            }
            t();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public boolean e() {
        try {
            if (getIntent().getIntExtra("orientation_angle", 0) == 3) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
