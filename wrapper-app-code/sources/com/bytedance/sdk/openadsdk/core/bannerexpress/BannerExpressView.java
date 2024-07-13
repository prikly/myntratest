package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.v;

public class BannerExpressView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f976a;

    /* renamed from: b  reason: collision with root package name */
    protected NativeExpressView f977b;

    /* renamed from: c  reason: collision with root package name */
    protected NativeExpressView f978c;

    /* renamed from: d  reason: collision with root package name */
    protected n f979d;

    /* renamed from: e  reason: collision with root package name */
    protected AdSlot f980e;

    /* renamed from: f  reason: collision with root package name */
    protected TTNativeExpressAd.ExpressAdInteractionListener f981f;

    /* renamed from: g  reason: collision with root package name */
    protected TTNativeExpressAd.ExpressVideoAdListener f982g;

    /* renamed from: h  reason: collision with root package name */
    protected int f983h;
    protected boolean i;
    protected String j = "banner_ad";

    public BannerExpressView(Context context, n nVar, AdSlot adSlot) {
        super(context);
        this.f976a = context;
        this.f979d = nVar;
        this.f980e = adSlot;
        a();
    }

    /* access modifiers changed from: protected */
    public void a() {
        NativeExpressView nativeExpressView = new NativeExpressView(this.f976a, this.f979d, this.f980e, this.j);
        this.f977b = nativeExpressView;
        addView(nativeExpressView, new ViewGroup.LayoutParams(-1, -1));
    }

    public void a(n nVar, AdSlot adSlot) {
        NativeExpressView nativeExpressView = new NativeExpressView(this.f976a, nVar, adSlot, this.j);
        this.f978c = nativeExpressView;
        nativeExpressView.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
            }

            public void onAdClicked(View view, int i) {
                if (BannerExpressView.this.f981f != null) {
                    BannerExpressView.this.f981f.onAdClicked(BannerExpressView.this, i);
                }
            }

            public void onRenderSuccess(View view, float f2, float f3) {
                BannerExpressView.this.a(f2, f3);
                if (BannerExpressView.this.f978c != null) {
                    BannerExpressView.this.f978c.setSoundMute(true);
                }
                BannerExpressView.this.e();
            }
        });
        v.a((View) this.f978c, 8);
        addView(this.f978c, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        this.f982g = expressVideoAdListener;
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f981f = expressAdInteractionListener;
        NativeExpressView nativeExpressView = this.f977b;
        if (nativeExpressView != null) {
            nativeExpressView.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
                public void onAdShow(View view, int i) {
                }

                public void onAdClicked(View view, int i) {
                    if (BannerExpressView.this.f981f != null) {
                        BannerExpressView.this.f981f.onAdClicked(BannerExpressView.this, i);
                    }
                }

                public void onRenderFail(View view, String str, int i) {
                    if (BannerExpressView.this.f981f != null) {
                        BannerExpressView.this.f981f.onRenderFail(BannerExpressView.this, str, i);
                    }
                }

                public void onRenderSuccess(View view, float f2, float f3) {
                    if (BannerExpressView.this.f977b != null) {
                        BannerExpressView.this.f977b.setSoundMute(true);
                    }
                    BannerExpressView.this.a(f2, f3);
                    if (BannerExpressView.this.f981f != null) {
                        BannerExpressView.this.f981f.onRenderSuccess(BannerExpressView.this, f2, f3);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void a(float f2, float f3) {
        int b2 = (int) v.b(this.f976a, f2);
        int b3 = (int) v.b(this.f976a, f3);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(b2, b3);
        }
        layoutParams.width = b2;
        layoutParams.height = b3;
        setLayoutParams(layoutParams);
    }

    public void b() {
        NativeExpressView nativeExpressView = this.f977b;
        if (nativeExpressView != null) {
            nativeExpressView.j();
        }
    }

    public void c() {
        if (this.f977b != null) {
            h.d().f(this.f977b.getClosedListenerKey());
            removeView(this.f977b);
            this.f977b.l();
            this.f977b = null;
        }
        if (this.f978c != null) {
            h.d().f(this.f978c.getClosedListenerKey());
            removeView(this.f978c);
            this.f978c.l();
            this.f978c = null;
        }
        h.d().w();
    }

    public NativeExpressView getCurView() {
        return this.f977b;
    }

    public NativeExpressView getNextView() {
        return this.f978c;
    }

    public void setDuration(int i2) {
        this.f983h = i2;
    }

    private ObjectAnimator a(NativeExpressView nativeExpressView) {
        return ObjectAnimator.ofFloat(nativeExpressView, "translationX", new float[]{0.0f, (float) (-getWidth())});
    }

    private ObjectAnimator b(NativeExpressView nativeExpressView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nativeExpressView, "translationX", new float[]{(float) getWidth(), 0.0f});
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                BannerExpressView.this.i = false;
                BannerExpressView.this.g();
            }
        });
        return ofFloat;
    }

    public void d() {
        NativeExpressView nativeExpressView = this.f978c;
        if (nativeExpressView != null) {
            nativeExpressView.j();
        }
    }

    /* access modifiers changed from: protected */
    public void e() {
        try {
            if (!this.i && this.f978c != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(a(this.f977b)).with(b(this.f978c));
                animatorSet.setDuration((long) this.f983h).start();
                v.a((View) this.f978c, 0);
                this.i = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean f() {
        return this.f978c != null;
    }

    /* access modifiers changed from: private */
    public void g() {
        NativeExpressView nativeExpressView = this.f977b;
        this.f977b = this.f978c;
        this.f978c = nativeExpressView;
        if (nativeExpressView != null) {
            removeView(nativeExpressView);
            this.f978c.l();
            this.f978c = null;
        }
    }
}
