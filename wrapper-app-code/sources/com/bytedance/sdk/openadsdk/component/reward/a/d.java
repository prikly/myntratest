package com.bytedance.sdk.openadsdk.component.reward.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.d.a;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: RewardFullVideoLoadingManager */
public class d {

    /* renamed from: a  reason: collision with root package name */
    TTRoundRectImageView f606a;

    /* renamed from: b  reason: collision with root package name */
    TextView f607b;

    /* renamed from: c  reason: collision with root package name */
    ProgressBar f608c;

    /* renamed from: d  reason: collision with root package name */
    TextView f609d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public n f610e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Context f611f;

    /* renamed from: g  reason: collision with root package name */
    private int f612g = 0;

    /* renamed from: h  reason: collision with root package name */
    private View f613h;
    private boolean i = false;
    private LinearLayout j;
    private TwoSemicirclesView k;
    private TwoSemicirclesView l;
    private TextView m;
    /* access modifiers changed from: private */
    public String n;
    private int o;
    private AnimatorSet p;
    private AnimatorSet q;

    public d(Context context) {
        this.f611f = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|(2:13|(2:15|(2:17|(2:19|29)(2:20|30))(2:21|31))(2:22|32))(2:23|33)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f A[Catch:{ all -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.bytedance.sdk.openadsdk.core.e.n r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            r2.f610e = r3     // Catch:{ all -> 0x0054 }
            boolean r3 = com.bytedance.sdk.openadsdk.core.e.n.c((com.bytedance.sdk.openadsdk.core.e.n) r3)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0053
            com.bytedance.sdk.openadsdk.core.e.n r3 = r2.f610e     // Catch:{ all -> 0x0054 }
            boolean r3 = com.bytedance.sdk.openadsdk.core.e.p.i(r3)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0015
            goto L_0x0053
        L_0x0015:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002c }
            com.bytedance.sdk.openadsdk.core.e.n r1 = r2.f610e     // Catch:{ JSONException -> 0x002c }
            com.bytedance.sdk.openadsdk.core.e.n$a r1 = r1.G()     // Catch:{ JSONException -> 0x002c }
            java.lang.String r1 = r1.g()     // Catch:{ JSONException -> 0x002c }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x002c }
            java.lang.String r1 = "loading_page_type"
            int r3 = r3.optInt(r1, r0)     // Catch:{ JSONException -> 0x002c }
            r2.f612g = r3     // Catch:{ JSONException -> 0x002c }
        L_0x002c:
            r2.n = r4     // Catch:{ all -> 0x0054 }
            r2.o = r5     // Catch:{ all -> 0x0054 }
            r3 = 1
            r2.i = r3     // Catch:{ all -> 0x0054 }
            int r4 = r2.f612g     // Catch:{ all -> 0x0054 }
            if (r4 == r3) goto L_0x004f
            r3 = 2
            if (r4 == r3) goto L_0x004b
            r3 = 3
            if (r4 == r3) goto L_0x0047
            r3 = 4
            if (r4 == r3) goto L_0x0043
            r2.i = r0     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0043:
            r2.h()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0047:
            r2.g()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x004b:
            r2.f()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x004f:
            r2.e()     // Catch:{ all -> 0x0054 }
            goto L_0x0056
        L_0x0053:
            return
        L_0x0054:
            r2.i = r0
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.a.d.a(com.bytedance.sdk.openadsdk.core.e.n, java.lang.String, int):void");
    }

    public void a() {
        try {
            int i2 = this.f612g;
            if (i2 == 1) {
                i();
            } else if (i2 == 2) {
                j();
            } else if (i2 == 3) {
                k();
            } else if (i2 == 4) {
                l();
            }
        } catch (Throwable unused) {
        }
    }

    private void e() {
        View inflate = LayoutInflater.from(this.f611f).inflate(t.f(this.f611f, "tt_full_reward_video_loading"), (ViewGroup) null, false);
        this.f613h = inflate;
        this.f606a = (TTRoundRectImageView) inflate.findViewById(t.e(this.f611f, "tt_loading_icon"));
        this.f607b = (TextView) this.f613h.findViewById(t.e(this.f611f, "tt_loading_appname"));
        this.f608c = (ProgressBar) this.f613h.findViewById(t.e(this.f611f, "tt_loading_progressbar"));
        this.f609d = (TextView) this.f613h.findViewById(t.e(this.f611f, "tt_loading_progress_number"));
        this.m = (TextView) this.f613h.findViewById(t.e(this.f611f, "tt_ad_loading_logo"));
        if (this.o == 1 && this.f610e.aa() != null && !TextUtils.isEmpty(this.f610e.aa().b())) {
            this.f607b.setText(this.f610e.aa().b());
        } else if (!TextUtils.isEmpty(this.f610e.U())) {
            this.f607b.setText(this.f610e.U());
        } else {
            this.f607b.setVisibility(8);
        }
        m();
        this.m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.a(d.this.f611f, d.this.f610e, d.this.n);
            }
        });
    }

    private void f() {
        View inflate = LayoutInflater.from(this.f611f).inflate(t.f(this.f611f, "tt_full_reward_video_loading2"), (ViewGroup) null, false);
        this.f613h = inflate;
        this.f606a = (TTRoundRectImageView) inflate.findViewById(t.e(this.f611f, "tt_loading_icon"));
        this.f609d = (TextView) this.f613h.findViewById(t.e(this.f611f, "tt_loading_progress_number"));
        this.m = (TextView) this.f613h.findViewById(t.e(this.f611f, "tt_ad_loading_logo"));
        m();
        this.m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.a(d.this.f611f, d.this.f610e, d.this.n);
            }
        });
    }

    private void g() {
        View inflate = LayoutInflater.from(this.f611f).inflate(t.f(this.f611f, "tt_full_reward_video_loading3"), (ViewGroup) null, false);
        this.f613h = inflate;
        this.j = (LinearLayout) inflate.findViewById(t.e(this.f611f, "wave_container"));
        this.f609d = (TextView) this.f613h.findViewById(t.e(this.f611f, "tt_loading_progress_number"));
        TextView textView = (TextView) this.f613h.findViewById(t.e(this.f611f, "tt_ad_loading_logo"));
        this.m = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.a(d.this.f611f, d.this.f610e, d.this.n);
            }
        });
    }

    private void h() {
        View inflate = LayoutInflater.from(this.f611f).inflate(t.f(this.f611f, "tt_full_reward_video_loading4"), (ViewGroup) null, false);
        this.f613h = inflate;
        this.k = (TwoSemicirclesView) inflate.findViewById(t.e(this.f611f, "inner_circle"));
        this.l = (TwoSemicirclesView) this.f613h.findViewById(t.e(this.f611f, "outer_circle"));
        this.k.setRadius((float) v.e(this.f611f, 80.0f));
        Paint paintTwo = this.k.getPaintTwo();
        paintTwo.setColor(Color.parseColor("#C4C4C4"));
        this.k.setPaintTwo(paintTwo);
        this.l.setRadius((float) v.e(this.f611f, 95.0f));
        Paint paintTwo2 = this.l.getPaintTwo();
        paintTwo2.setStrokeWidth(6.0f);
        paintTwo2.setColor(Color.parseColor("#118BFF"));
        this.l.setPaintTwo(paintTwo2);
        this.f609d = (TextView) this.f613h.findViewById(t.e(this.f611f, "tt_loading_progress_number"));
        TextView textView = (TextView) this.f613h.findViewById(t.e(this.f611f, "tt_ad_loading_logo"));
        this.m = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.a(d.this.f611f, d.this.f610e, d.this.n);
            }
        });
    }

    private void i() {
        n();
    }

    private void j() {
        Context context = this.f611f;
        this.f606a.setAnimation(AnimationUtils.loadAnimation(context, t.l(context, "tt_loading_two_icon_scale")));
        n();
    }

    private void k() {
        this.p = new AnimatorSet();
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.p.play(duration);
            for (int i2 = 1; i2 < this.j.getChildCount(); i2++) {
                float f2 = i2 % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.j.getChildAt(i2), "translationY", new float[]{-f2, f2}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.p.start();
        }
        n();
    }

    private void l() {
        this.p = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.k, "rotation", new float[]{0.0f, 360.0f}).setDuration(1500);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatCount(-1);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.l, "rotation", new float[]{0.0f, 360.0f}).setDuration(2500);
        duration2.setRepeatCount(-1);
        this.p.playTogether(new Animator[]{duration, duration2});
        this.p.start();
        n();
    }

    private void m() {
        if (this.f610e.M() == null || TextUtils.isEmpty(this.f610e.M().a())) {
            this.f606a.setVisibility(8);
            return;
        }
        try {
            a.a(this.f610e.M()).a((com.bytedance.sdk.component.d.n) new com.bytedance.sdk.component.d.n<Bitmap>() {
                public void a(j<Bitmap> jVar) {
                    if (jVar != null) {
                        try {
                            if (jVar.b() != null) {
                                d.this.f606a.setImageBitmap(jVar.b());
                                return;
                            }
                        } catch (Throwable unused) {
                            d.this.f606a.setVisibility(8);
                            return;
                        }
                    }
                    d.this.f606a.setVisibility(8);
                }

                public void a(int i, String str, Throwable th) {
                    d.this.f606a.setVisibility(8);
                }
            });
        } catch (Throwable unused) {
            this.f606a.setVisibility(8);
        }
    }

    private void n() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, 80});
        ofInt.setDuration(2000);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (d.this.f608c != null) {
                    d.this.f608c.setProgress(intValue);
                }
                d.this.f609d.setText(String.valueOf(intValue));
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{81, 99});
        ofInt2.setDuration(3000);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (d.this.f608c != null) {
                    d.this.f608c.setProgress(intValue);
                }
                d.this.f609d.setText(String.valueOf(intValue));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt).before(ofInt2);
        animatorSet.start();
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.q = animatorSet2;
        animatorSet2.play(ofInt).before(ofInt2);
        this.q.start();
    }

    public void b() {
        AnimatorSet animatorSet = this.p;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.q;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    public View c() {
        return this.f613h;
    }

    public boolean d() {
        return this.i;
    }
}
