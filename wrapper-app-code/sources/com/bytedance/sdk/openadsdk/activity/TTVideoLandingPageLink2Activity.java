package com.bytedance.sdk.openadsdk.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.k;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.b;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.a.c;
import com.bytedance.sdk.openadsdk.e.d;
import org.json.JSONObject;

public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements d {
    AnimatorSet R;
    private LinearLayout S;
    /* access modifiers changed from: private */
    public View T;
    /* access modifiers changed from: private */
    public View U;
    /* access modifiers changed from: private */
    public View V;
    /* access modifiers changed from: private */
    public boolean W;
    private TextView X;
    private TextView Y;
    private TextView Z;
    /* access modifiers changed from: private */
    public TextView aa;
    private TTRoundRectImageView ab;
    private TextView ac;
    private TextView ad;
    /* access modifiers changed from: private */
    public long ae;
    /* access modifiers changed from: private */
    public boolean af = false;
    /* access modifiers changed from: private */
    public boolean ag;
    /* access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.common.d ah;
    /* access modifiers changed from: private */
    public LinearLayout ai;

    /* access modifiers changed from: protected */
    public String a() {
        return "tt_activity_videolandingpage_link2";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "tt_top_back";
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.ag = m.h().g();
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess() || this.p == null || this.f144a == null) {
            finish();
            return;
        }
        this.f144a.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(this.f148e, this.i, this.f150g, this.M, true) {
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.T != null && !TTVideoLandingPageLink2Activity.this.W) {
                        TTVideoLandingPageLink2Activity.this.T.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.ai != null) {
                        TTVideoLandingPageLink2Activity.this.ai.setVisibility(0);
                    }
                    boolean unused = TTVideoLandingPageLink2Activity.this.af = true;
                    TTVideoLandingPageLink2Activity.this.n();
                    e.a((Context) TTVideoLandingPageLink2Activity.this, TTVideoLandingPageLink2Activity.this.p, TTVideoLandingPageLink2Activity.this.F, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.ae, true);
                } catch (Throwable unused2) {
                }
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                long unused = TTVideoLandingPageLink2Activity.this.ae = System.currentTimeMillis();
            }
        });
        this.f144a.setWebChromeClient(new c(this.i, this.M) {
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.ag && TTVideoLandingPageLink2Activity.this.ah != null && i == 100) {
                    TTVideoLandingPageLink2Activity.this.ah.a(webView);
                }
                if (TTVideoLandingPageLink2Activity.this.C != null && !TTVideoLandingPageLink2Activity.this.isFinishing() && i == 100 && TTVideoLandingPageLink2Activity.this.C.isShown() && !TTVideoLandingPageLink2Activity.this.W) {
                    if (TTVideoLandingPageLink2Activity.this.T != null) {
                        TTVideoLandingPageLink2Activity.this.T.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.ai != null) {
                        TTVideoLandingPageLink2Activity.this.ai.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.this.n();
                }
            }
        });
        TextView textView = (TextView) findViewById(t.e(this, "tt_loading_tip"));
        this.ac = textView;
        if (!(textView == null || this.p.a() == null)) {
            this.ac.setText(this.p.a().c());
        }
        long j = 10000;
        if (!(this.p == null || this.p.a() == null)) {
            j = this.p.a().a() * 1000;
        }
        k.d().postDelayed(new Runnable() {
            public void run() {
                try {
                    boolean unused = TTVideoLandingPageLink2Activity.this.W = true;
                    TTVideoLandingPageLink2Activity.this.U.setVisibility(8);
                    TTVideoLandingPageLink2Activity.this.V.setVisibility(0);
                    if (!TTVideoLandingPageLink2Activity.this.af) {
                        e.a((Context) TTVideoLandingPageLink2Activity.this, TTVideoLandingPageLink2Activity.this.p, TTVideoLandingPageLink2Activity.this.F, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.ae, false);
                    }
                } catch (Exception unused2) {
                }
            }
        }, j);
    }

    /* access modifiers changed from: protected */
    public void d() {
        super.d();
        TextView textView = (TextView) findViewById(t.e(this, "tt_top_dislike"));
        this.Z = textView;
        if (textView != null) {
            textView.setText(t.a(m.a(), "tt_reward_feedback"));
            this.Z.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTDelegateActivity.a(TTVideoLandingPageLink2Activity.this.p, "");
                }
            });
        }
        this.aa = (TextView) findViewById(t.e(this, "tt_top_skip"));
        this.S = (LinearLayout) findViewById(t.e(this.f148e, "wave_container"));
        this.T = findViewById(t.e(this.f148e, "tt_browser_webview_loading"));
        this.V = findViewById(t.e(this.f148e, "tt_back_container"));
        this.U = findViewById(t.e(this.f148e, "tt_loading_container"));
        this.X = (TextView) findViewById(t.e(this.f148e, "tt_back_container_title"));
        this.Y = (TextView) findViewById(t.e(this.f148e, "tt_back_container_des"));
        this.ab = (TTRoundRectImageView) findViewById(t.e(this.f148e, "tt_back_container_icon"));
        this.ad = (TextView) findViewById(t.e(this.f148e, "tt_back_container_download"));
        if (this.p.M() != null && !TextUtils.isEmpty(this.p.M().a())) {
            com.bytedance.sdk.openadsdk.i.d.a().a(this.p.M().a(), (ImageView) this.ab);
        }
        this.X.setText(this.p.K());
        this.Y.setText(this.p.V());
        ((TextView) findViewById(t.e(this, "tt_ad_loading_logo"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.a(TTVideoLandingPageLink2Activity.this.f148e, TTVideoLandingPageLink2Activity.this.p, TTVideoLandingPageLink2Activity.this.F);
            }
        });
        if (this.ag) {
            ((ViewStub) findViewById(t.e(this, "tt_browser_new_bottom_bar_view_stub"))).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(t.e(this, "tt_bottom_bar"));
            this.ai = linearLayout;
            linearLayout.setVisibility(8);
            this.ah = new com.bytedance.sdk.openadsdk.common.d(this, this.ai, this.f144a, this.p, "landingpage_split_screen");
            if (this.f144a.getWebView() != null) {
                this.f144a.getWebView().setOnTouchListener(new View.OnTouchListener() {

                    /* renamed from: a  reason: collision with root package name */
                    float f170a = 0.0f;

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.f170a = motionEvent.getY();
                        }
                        if (motionEvent.getAction() == 2) {
                            float y = motionEvent.getY();
                            float f2 = this.f170a;
                            if (y - f2 > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.ah != null) {
                                    TTVideoLandingPageLink2Activity.this.ah.a();
                                }
                                return false;
                            } else if (y - f2 < -8.0f && TTVideoLandingPageLink2Activity.this.ah != null) {
                                TTVideoLandingPageLink2Activity.this.ah.b();
                            }
                        }
                        return false;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        e.a(this.f148e, this.p, "landingpage_split_screen", str, (JSONObject) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    private void m() {
        this.R = new AnimatorSet();
        LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.R.play(duration);
            for (int i = 1; i < this.S.getChildCount(); i++) {
                float f2 = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.S.getChildAt(i), "translationY", new float[]{-f2, f2}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.R.start();
        }
    }

    /* access modifiers changed from: protected */
    public void e() {
        if (f()) {
            super.e();
            if (this.n.getNativeVideoController() != null) {
                this.n.getNativeVideoController().a(false);
                ((b) this.n.getNativeVideoController()).g(false);
                this.n.setIsNeedShowDetail(false);
                this.l.setClickable(true);
                this.l.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.a("click_video");
                        return false;
                    }
                });
            }
            ((b) this.n.getNativeVideoController()).a((c.a) new c.a() {
                public void a() {
                }

                public void a(long j, int i) {
                }

                public void b(long j, int i) {
                }

                public void a(long j, long j2) {
                    if (TTVideoLandingPageLink2Activity.this.aa != null) {
                        int max = (int) Math.max(0, (j2 - j) / 1000);
                        TextView k = TTVideoLandingPageLink2Activity.this.aa;
                        k.setText(max + "");
                        if (max <= 0) {
                            TTVideoLandingPageLink2Activity.this.aa.setVisibility(8);
                        }
                    }
                }
            });
            return;
        }
        try {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.openadsdk.i.d.a().a(this.p.P().get(0), imageView);
            this.l.setVisibility(0);
            this.l.removeAllViews();
            this.l.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    e.b(m.a(), TTVideoLandingPageLink2Activity.this.p, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public boolean f() {
        return this.m == 5 || this.m == 15 || this.m == 50;
    }

    public void j() {
        super.j();
        if (this.p != null) {
            this.p.a(true);
        }
        TextView textView = this.ad;
        if (textView != null) {
            textView.setText(b());
            this.ad.setClickable(true);
            this.ad.setOnClickListener(this.Q);
            this.ad.setOnTouchListener(this.Q);
        }
    }

    /* access modifiers changed from: private */
    public void n() {
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.R.removeAllListeners();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        n();
        if (!this.W && this.M != null && this.f144a != null && this.U.getVisibility() == 8) {
            this.M.a(this.f144a);
        }
        super.onDestroy();
    }
}
