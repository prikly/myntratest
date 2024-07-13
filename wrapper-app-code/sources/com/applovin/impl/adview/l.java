package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.i;
import com.applovin.impl.sdk.ad.a;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.d.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdkUtils;

class l extends Dialog implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f14182a;

    /* renamed from: b  reason: collision with root package name */
    private final n f14183b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final v f14184c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final d f14185d;

    /* renamed from: e  reason: collision with root package name */
    private final a f14186e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public RelativeLayout f14187f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public i f14188g;

    l(a aVar, d dVar, Activity activity, n nVar) {
        super(activity, 16973840);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (dVar == null) {
            throw new IllegalArgumentException("No main view specified");
        } else if (nVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (activity != null) {
            this.f14183b = nVar;
            this.f14184c = nVar.D();
            this.f14182a = activity;
            this.f14185d = dVar;
            this.f14186e = aVar;
            requestWindowFeature(1);
            setCancelable(false);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    private int a(int i) {
        return AppLovinSdkUtils.dpToPx(this.f14182a, i);
    }

    private void a(i.a aVar) {
        if (this.f14188g == null) {
            i a2 = i.a(aVar, this.f14182a);
            this.f14188g = a2;
            a2.setVisibility(8);
            this.f14188g.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    l.this.d();
                }
            });
            this.f14188g.setClickable(false);
            int a3 = a(((Integer) this.f14183b.a(b.cc)).intValue());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a3, a3);
            layoutParams.addRule(10);
            int i = 9;
            layoutParams.addRule(((Boolean) this.f14183b.a(b.cf)).booleanValue() ? 9 : 11);
            this.f14188g.a(a3);
            int a4 = a(((Integer) this.f14183b.a(b.ce)).intValue());
            int a5 = a(((Integer) this.f14183b.a(b.cd)).intValue());
            layoutParams.setMargins(a5, a4, a5, 0);
            this.f14187f.addView(this.f14188g, layoutParams);
            this.f14188g.bringToFront();
            int a6 = a(((Integer) this.f14183b.a(b.cg)).intValue());
            View view = new View(this.f14182a);
            view.setBackgroundColor(0);
            int i2 = a3 + a6;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
            layoutParams2.addRule(10);
            if (!((Boolean) this.f14183b.a(b.cf)).booleanValue()) {
                i = 11;
            }
            layoutParams2.addRule(i);
            layoutParams2.setMargins(a5 - a(5), a4 - a(5), a5 - a(5), 0);
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (l.this.f14188g.isClickable()) {
                        l.this.f14188g.performClick();
                    }
                }
            });
            this.f14187f.addView(view, layoutParams2);
            view.bringToFront();
        } else if (v.a()) {
            this.f14184c.d("ExpandedAdDialog", "Attempting to create duplicate close button");
        }
    }

    private void c() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f14185d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f14182a);
        this.f14187f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f14187f.setBackgroundColor(-1157627904);
        this.f14187f.addView(this.f14185d);
        if (!this.f14186e.m()) {
            a(this.f14186e.n());
            e();
        }
        setContentView(this.f14187f);
    }

    /* access modifiers changed from: private */
    public void d() {
        this.f14185d.a("javascript:al_onCloseTapped();", (Runnable) new Runnable() {
            public void run() {
                l.this.dismiss();
            }
        });
    }

    private void e() {
        this.f14182a.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (l.this.f14188g == null) {
                        l.this.d();
                    }
                    l.this.f14188g.setVisibility(0);
                    l.this.f14188g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationEnd(Animation animation) {
                            l.this.f14188g.setClickable(true);
                        }

                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    l.this.f14188g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    v unused = l.this.f14184c;
                    if (v.a()) {
                        l.this.f14184c.b("ExpandedAdDialog", "Unable to fade in close button", th);
                    }
                    l.this.d();
                }
            }
        });
    }

    public a a() {
        return this.f14186e;
    }

    public d b() {
        return this.f14185d;
    }

    public void dismiss() {
        d statsManagerHelper = this.f14185d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.e();
        }
        this.f14182a.runOnUiThread(new Runnable() {
            public void run() {
                l.this.f14187f.removeView(l.this.f14185d);
                l.super.dismiss();
            }
        });
    }

    public void onBackPressed() {
        this.f14185d.a("javascript:al_onBackPressed();", (Runnable) new Runnable() {
            public void run() {
                l.this.dismiss();
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f14182a.getWindow().getAttributes().flags, this.f14182a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (v.a()) {
                this.f14184c.e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (v.a()) {
                this.f14184c.b("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }
}
