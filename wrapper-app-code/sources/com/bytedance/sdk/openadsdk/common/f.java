package com.bytedance.sdk.openadsdk.common;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTTitleNewStyleManager */
public class f {

    /* renamed from: a  reason: collision with root package name */
    TTAdDislikeDialog f471a;

    /* renamed from: b  reason: collision with root package name */
    TTAdDislikeToast f472b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicBoolean f473c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f474d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f475e;

    /* renamed from: f  reason: collision with root package name */
    private final n f476f;

    /* renamed from: g  reason: collision with root package name */
    private Context f477g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f478h;
    private TextView i;
    private ImageView j;
    private ProgressBar k;
    private final int l;
    /* access modifiers changed from: private */
    public boolean m;

    public f(Context context, RelativeLayout relativeLayout, n nVar) {
        this.f477g = context;
        this.f475e = relativeLayout;
        this.f476f = nVar;
        this.l = v.e(m.a(), 44.0f);
        e();
    }

    private void e() {
        this.f478h = (ImageView) this.f475e.findViewById(t.e(this.f477g, "tt_title_bar_close"));
        this.i = (TextView) this.f475e.findViewById(t.e(this.f477g, "tt_title_bar_title"));
        this.j = (ImageView) this.f475e.findViewById(t.e(this.f477g, "tt_title_bar_feedback"));
        this.k = (ProgressBar) this.f475e.findViewById(t.e(this.f477g, "tt_title_bar_browser_progress"));
        n nVar = this.f476f;
        if (nVar != null) {
            this.i.setText(TextUtils.isEmpty(nVar.U()) ? t.a(this.f477g, "tt_web_title_default") : this.f476f.U());
        }
        this.j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                f.this.d();
            }
        });
    }

    public void a(WebView webView, int i2) {
        if (i2 == 100) {
            this.k.setVisibility(8);
            return;
        }
        this.k.setVisibility(0);
        this.k.setProgress(i2);
    }

    public void a() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f475e.getLayoutParams();
            if (!this.m && marginLayoutParams.topMargin == (-this.l)) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{-this.l, 0});
                ofInt.setDuration(300);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        f.this.f475e.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                        boolean unused = f.this.m = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        boolean unused = f.this.m = false;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f475e.getLayoutParams();
            if (!this.m && marginLayoutParams.topMargin == 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, -this.l});
                ofInt.setDuration(300);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        f.this.f475e.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                        boolean unused = f.this.m = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        boolean unused = f.this.m = false;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public ImageView c() {
        return this.f478h;
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (this.f474d.get()) {
            g();
            return;
        }
        if (this.f471a == null) {
            f();
        }
        this.f471a.a();
    }

    private void f() {
        try {
            if (this.f471a == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.f477g, this.f476f);
                this.f471a = tTAdDislikeDialog;
                tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.a() {
                    public void c(View view) {
                    }

                    public void a(View view) {
                        f.this.f473c.set(true);
                    }

                    public void b(View view) {
                        f.this.f473c.set(false);
                    }

                    public void a(int i, FilterWord filterWord) {
                        if (!f.this.f474d.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                            f.this.f474d.set(true);
                        }
                    }
                });
            }
            ((FrameLayout) this.f475e.getRootView().findViewById(16908290)).addView(this.f471a);
            if (this.f472b == null) {
                this.f472b = new TTAdDislikeToast(this.f477g);
                ((FrameLayout) this.f475e.getRootView().findViewById(16908290)).addView(this.f472b);
            }
        } catch (Throwable unused) {
        }
    }

    private void g() {
        this.f472b.a(com.bytedance.sdk.openadsdk.core.i.f.f1255d);
    }
}
