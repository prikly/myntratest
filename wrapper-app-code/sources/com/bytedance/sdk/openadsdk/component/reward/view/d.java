package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.a.c;
import com.bytedance.sdk.openadsdk.component.reward.a.e;
import com.bytedance.sdk.openadsdk.core.b.g;
import com.bytedance.sdk.openadsdk.core.e.l;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.j.a;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.c;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RewardFullVideoLayout */
public class d {
    /* access modifiers changed from: private */
    public String A;
    private int B;
    private boolean C = false;

    /* renamed from: a  reason: collision with root package name */
    int f850a = 3;

    /* renamed from: b  reason: collision with root package name */
    Activity f851b;

    /* renamed from: c  reason: collision with root package name */
    n f852c;

    /* renamed from: d  reason: collision with root package name */
    c f853d;

    /* renamed from: e  reason: collision with root package name */
    public View f854e;

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f855f;

    /* renamed from: g  reason: collision with root package name */
    ImageView f856g;

    /* renamed from: h  reason: collision with root package name */
    RelativeLayout f857h;
    TTRoundRectImageView i;
    TextView j;
    TextView k;
    TextView l;
    FrameLayout m;
    FrameLayout n;
    FrameLayout o;
    TTRatingBar2 p;
    TextView q;
    TextView r;
    RelativeLayout s;
    com.bytedance.sdk.openadsdk.component.reward.a.d t;
    boolean u = true;
    protected int v = 0;
    protected final AtomicBoolean w = new AtomicBoolean(false);
    public l x;
    Runnable y = new Runnable() {
        public void run() {
            try {
                if (d.this.f853d != null && d.this.f857h != null) {
                    int[] iArr = new int[2];
                    d.this.f857h.getLocationOnScreen(iArr);
                    d.this.f853d.b(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };
    private boolean z;

    private void a(a aVar) {
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return true;
    }

    public d(Activity activity) {
        this.f851b = activity;
    }

    public void a(n nVar, String str, int i2, boolean z2, c cVar) {
        if (!this.C) {
            this.C = true;
            this.f852c = nVar;
            this.A = str;
            this.B = i2;
            this.z = z2;
            this.f853d = cVar;
            if (this.f851b != null && a()) {
                com.bytedance.sdk.openadsdk.component.reward.a.d dVar = new com.bytedance.sdk.openadsdk.component.reward.a.d(this.f851b);
                this.t = dVar;
                dVar.a(nVar, this.A, this.B);
            }
            s();
            l lVar = new l(this.f851b, this.f852c, str, this.m);
            this.x = lVar;
            lVar.a();
        }
    }

    private void s() {
        RelativeLayout relativeLayout;
        Activity activity = this.f851b;
        this.f854e = activity.findViewById(t.e(activity, "tt_reward_root"));
        Activity activity2 = this.f851b;
        this.f855f = (RelativeLayout) activity2.findViewById(t.e(activity2, "tt_video_reward_bar"));
        Activity activity3 = this.f851b;
        this.l = (TextView) activity3.findViewById(t.e(activity3, "tt_reward_ad_download"));
        Activity activity4 = this.f851b;
        this.i = (TTRoundRectImageView) activity4.findViewById(t.e(activity4, "tt_reward_ad_icon"));
        Activity activity5 = this.f851b;
        this.j = (TextView) activity5.findViewById(t.e(activity5, "tt_reward_ad_appname"));
        Activity activity6 = this.f851b;
        this.k = (TextView) activity6.findViewById(t.e(activity6, "tt_comment_vertical"));
        Activity activity7 = this.f851b;
        this.q = (TextView) activity7.findViewById(t.e(activity7, "tt_ad_logo"));
        Activity activity8 = this.f851b;
        this.f856g = (ImageView) activity8.findViewById(t.e(activity8, "tt_video_ad_close"));
        Activity activity9 = this.f851b;
        this.f857h = (RelativeLayout) activity9.findViewById(t.e(activity9, "tt_video_ad_close_layout"));
        Activity activity10 = this.f851b;
        this.m = (FrameLayout) activity10.findViewById(t.e(activity10, "tt_video_reward_container"));
        Activity activity11 = this.f851b;
        this.n = (FrameLayout) activity11.findViewById(t.e(activity11, "tt_click_upper_non_content_layout"));
        Activity activity12 = this.f851b;
        this.o = (FrameLayout) activity12.findViewById(t.e(activity12, "tt_click_lower_non_content_layout"));
        Activity activity13 = this.f851b;
        this.p = (TTRatingBar2) activity13.findViewById(t.e(activity13, "tt_rb_score"));
        Activity activity14 = this.f851b;
        this.s = (RelativeLayout) activity14.findViewById(t.e(activity14, "tt_full_reward_video_loading_container"));
        TTRatingBar2 tTRatingBar2 = this.p;
        if (tTRatingBar2 != null) {
            v.a((TextView) null, tTRatingBar2, this.f852c, (Context) this.f851b);
        }
        com.bytedance.sdk.openadsdk.component.reward.a.d dVar = this.t;
        if (!(dVar == null || !dVar.d() || this.t.c() == null || (relativeLayout = this.s) == null)) {
            relativeLayout.addView(this.t.c(), new LinearLayout.LayoutParams(-1, -1));
            this.t.a();
        }
        n nVar = this.f852c;
        if (nVar != null && nVar.aw()) {
            Activity activity15 = this.f851b;
            this.r = (TextView) activity15.findViewById(t.e(activity15, "tt_reward_ad_description"));
        }
    }

    public void a(String str, boolean z2) {
        g();
        v.a((View) this.q, p.i(this.f852c) ? 8 : 0);
        f();
        a(str);
        a(z2);
        d();
        if (this.z) {
            c();
        }
        n nVar = this.f852c;
        if (nVar != null && nVar.ax() != null) {
            a(this.f852c.ax());
        }
    }

    public void a(int i2, int i3) {
        FrameLayout frameLayout;
        if (!this.u) {
            a(4);
        }
        try {
            if (this.B == 2 && this.f852c.v() == 1) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
                layoutParams.height = (int) v.b(this.f851b, 55.0f);
                layoutParams.topMargin = (int) v.b(this.f851b, 20.0f);
                this.l.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f855f.getLayoutParams();
                layoutParams2.bottomMargin = (int) v.b(this.f851b, 12.0f);
                this.f855f.setLayoutParams(layoutParams2);
            }
        } catch (Throwable unused) {
        }
        n nVar = this.f852c;
        if (nVar != null && nVar.v() == 1 && (frameLayout = this.m) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int c2 = v.c((Context) this.f851b);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
            layoutParams3.width = c2;
            int i4 = (c2 * 9) / 16;
            layoutParams3.height = i4;
            this.m.setLayoutParams(layoutParams3);
            this.v = (v.d((Context) this.f851b) - i4) / 2;
            com.bytedance.sdk.component.utils.l.e("RewardFullVideoLayout", "NonContentAreaHeight:" + this.v);
        }
    }

    public void a(com.bytedance.sdk.openadsdk.core.b.c cVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener, e eVar) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        n nVar;
        com.bytedance.sdk.openadsdk.core.b.c cVar2 = cVar;
        View.OnTouchListener onTouchListener2 = onTouchListener;
        final View.OnClickListener onClickListener2 = onClickListener;
        final e eVar2 = eVar;
        n nVar2 = this.f852c;
        if (!(nVar2 == null || nVar2.w() == null)) {
            if (this.f852c.v() != 5) {
                if (this.f852c.w().f1060e) {
                    this.l.setOnClickListener(cVar);
                    this.l.setOnTouchListener(onTouchListener2);
                } else {
                    this.l.setOnClickListener(onClickListener2);
                }
            }
            if (this.f852c.v() == 1) {
                if (this.f852c.w().f1056a) {
                    v.a((View) this.f855f, (View.OnClickListener) cVar, "TTBaseVideoActivity#mRlDownloadBar");
                    v.a((View) this.f855f, onTouchListener2, "TTBaseVideoActivity#mRlDownloadBar");
                    this.j.setOnClickListener(cVar);
                    this.j.setOnTouchListener(onTouchListener2);
                    this.k.setOnClickListener(cVar);
                    this.k.setOnTouchListener(onTouchListener2);
                    this.p.setOnClickListener(cVar);
                    this.p.setOnTouchListener(onTouchListener2);
                    this.i.setOnClickListener(cVar);
                    this.i.setOnTouchListener(onTouchListener2);
                } else {
                    v.a((View) this.f855f, onClickListener2, "TTBaseVideoActivity#mRlDownloadBar");
                    this.j.setOnClickListener(onClickListener2);
                    this.k.setOnClickListener(onClickListener2);
                    this.p.setOnClickListener(onClickListener2);
                    this.i.setOnClickListener(onClickListener2);
                }
            } else if (this.f852c.v() == 5) {
                if (this.f852c.w().f1060e) {
                    com.bytedance.sdk.openadsdk.core.b.c cVar3 = cVar;
                    final e eVar3 = eVar;
                    AnonymousClass1 r0 = new g("VAST_ACTION_BUTTON", this.f852c.ax(), cVar3) {
                        public void a() {
                            if (d.this.f852c != null && d.this.f852c.ax() != null) {
                                d.this.f852c.ax().a().g(eVar3.s());
                            }
                        }
                    };
                    AnonymousClass2 r02 = new g("VAST_ICON", this.f852c.ax(), cVar3) {
                        public void a() {
                            if (d.this.f852c != null && d.this.f852c.ax() != null && d.this.f852c.ax().b() != null) {
                                d.this.f852c.ax().b().a(eVar3.s());
                            }
                        }
                    };
                    TextView textView = this.l;
                    if (textView != null) {
                        textView.setOnClickListener(r0);
                        this.l.setOnTouchListener(r0);
                    }
                    TTRoundRectImageView tTRoundRectImageView = this.i;
                    if (tTRoundRectImageView != null) {
                        tTRoundRectImageView.setOnClickListener(r02);
                        this.i.setOnTouchListener(r02);
                    }
                    TextView textView2 = this.j;
                    if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                        this.j.setOnClickListener(r0);
                        this.j.setOnTouchListener(r0);
                    }
                    TextView textView3 = this.r;
                    if (textView3 != null && !TextUtils.isEmpty(textView3.getText())) {
                        this.r.setOnClickListener(r0);
                        this.r.setOnTouchListener(r0);
                    }
                } else {
                    AnonymousClass3 r03 = new View.OnClickListener() {
                        public void onClick(View view) {
                            View.OnClickListener onClickListener = onClickListener2;
                            if (onClickListener != null) {
                                onClickListener.onClick(view);
                            }
                            if (d.this.f852c != null && d.this.f852c.ax() != null) {
                                d.this.f852c.ax().a().g(eVar2.s());
                            }
                        }
                    };
                    TextView textView4 = this.l;
                    if (textView4 != null) {
                        textView4.setOnClickListener(r03);
                    }
                    TextView textView5 = this.j;
                    if (textView5 != null && !TextUtils.isEmpty(textView5.getText())) {
                        this.j.setOnClickListener(r03);
                    }
                    TextView textView6 = this.r;
                    if (textView6 != null && !TextUtils.isEmpty(textView6.getText())) {
                        this.r.setOnClickListener(r03);
                    }
                    TTRoundRectImageView tTRoundRectImageView2 = this.i;
                    if (tTRoundRectImageView2 != null) {
                        tTRoundRectImageView2.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                View.OnClickListener onClickListener = onClickListener2;
                                if (onClickListener != null) {
                                    onClickListener.onClick(view);
                                }
                                if (d.this.f852c != null && d.this.f852c.ax() != null && d.this.f852c.ax().b() != null) {
                                    d.this.f852c.ax().b().a(eVar2.s());
                                }
                            }
                        });
                    }
                }
            } else if (this.f852c.w().f1058c) {
                v.a((View) this.f855f, (View.OnClickListener) cVar, "TTBaseVideoActivity#mRlDownloadBar");
                v.a((View) this.f855f, onTouchListener2, "TTBaseVideoActivity#mRlDownloadBar");
            } else {
                v.a((View) this.f855f, onClickListener2, "TTBaseVideoActivity#mRlDownloadBar");
            }
        }
        if (!(this.m == null || (nVar = this.f852c) == null || nVar.w() == null)) {
            if (!this.f852c.w().f1061f || l.b(this.f852c)) {
                a(onClickListener2);
            } else {
                a((View.OnClickListener) cVar);
                a(cVar);
            }
        }
        n nVar3 = this.f852c;
        if (nVar3 != null && nVar3.v() == 1) {
            if (!(this.f852c.w() == null || (frameLayout2 = this.n) == null)) {
                v.a((View) frameLayout2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.n.getLayoutParams();
                layoutParams.height = this.v;
                this.n.setLayoutParams(layoutParams);
                if (this.f852c.w().f1057b) {
                    this.n.setOnClickListener(cVar);
                    this.n.setOnTouchListener(onTouchListener2);
                } else {
                    this.n.setOnClickListener(onClickListener2);
                }
            }
            if (!(this.f852c.w() == null || (frameLayout = this.o) == null)) {
                v.a((View) frameLayout, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
                layoutParams2.height = this.v;
                this.o.setLayoutParams(layoutParams2);
                if (this.f852c.w().f1059d) {
                    this.o.setOnClickListener(cVar);
                    this.o.setOnTouchListener(onTouchListener2);
                } else {
                    this.o.setOnClickListener(onClickListener2);
                }
            }
        }
        TextView textView7 = this.q;
        if (textView7 != null) {
            textView7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    com.bytedance.sdk.component.utils.l.c("mAdLogo", "mAdLogo,,,,,,,onClick,,,,,");
                    try {
                        TTWebsiteActivity.a(d.this.f851b, d.this.f852c, d.this.A);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    public void b() {
        v.a((View) this.m, 8);
        v.a((View) this.n, 8);
        v.a((View) this.o, 8);
        v.a((View) this.f855f, 8);
        v.a((View) this.j, 8);
        v.a((View) this.i, 8);
        v.a((View) this.k, 8);
        v.a((View) this.p, 8);
        v.a((View) this.f856g, 8);
        v.a((View) this.f857h, 8);
        v.a((View) this.l, 8);
        v.a((View) this.q, 8);
        v.a((View) this.s, 8);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int z2 = this.f852c.z();
        this.f850a = z2;
        if (z2 == -200) {
            f h2 = m.h();
            this.f850a = h2.k(u.f(this.f852c) + "");
        }
        if (this.f850a == -1 && this.u) {
            v.a((View) this.f855f, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.f852c.v() == 3) {
            int[] iArr = {Color.parseColor("#0070FF")};
            int e2 = v.e(this.f851b, 17.0f);
            int parseColor = Color.parseColor("#80000000");
            c.a e3 = new c.a().a(iArr[0]).b(parseColor).a(iArr).c(e2).d(0).e(v.e(this.f851b, 3.0f));
            Activity activity = this.f851b;
            com.bytedance.sdk.openadsdk.core.widget.c.a((LinearLayout) activity.findViewById(t.e(activity, "tt_reward_ad_download_layout")), e3);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        if (this.B == 1) {
            TextView textView = this.j;
            if (textView != null) {
                textView.setMaxWidth((int) v.b(this.f851b, 153.0f));
            }
        } else {
            TextView textView2 = this.j;
            if (textView2 != null) {
                textView2.setMaxWidth((int) v.b(this.f851b, 404.0f));
            }
            RelativeLayout relativeLayout = this.f857h;
            if (relativeLayout != null && z2) {
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    int b2 = b("status_bar_height");
                    int b3 = b("navigation_bar_height");
                    if (b2 > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (b2 > marginLayoutParams.topMargin) {
                            marginLayoutParams.topMargin = b2;
                            this.f853d.a(b2);
                        }
                    }
                    if (b3 > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (b3 > marginLayoutParams2.rightMargin) {
                            marginLayoutParams2.rightMargin = b3;
                        }
                    }
                }
            }
        }
        if (!this.z) {
            v.a((View) this.f855f, 0);
        }
    }

    private int b(String str) {
        Resources resources = this.f851b.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        TextView textView;
        if (!this.f852c.aw()) {
            TextView textView2 = this.l;
            if (textView2 != null) {
                if (this.f852c.v() == 3) {
                    str = e();
                }
                textView2.setText(str);
            }
        } else if (this.f852c.ax() != null && TextUtils.isEmpty(this.f852c.ax().f()) && (textView = this.l) != null) {
            v.a((View) textView, 8);
        }
    }

    /* access modifiers changed from: protected */
    public String e() {
        String j2 = u.j((Context) this.f851b);
        if (j2 == null) {
            j2 = "";
        }
        boolean z2 = false;
        boolean z3 = true;
        try {
            if (!j2.equals(Locale.CHINESE.getLanguage()) && !j2.equals(Locale.CHINA.getLanguage())) {
                if (!j2.equals(Locale.TRADITIONAL_CHINESE.getLanguage())) {
                    z3 = false;
                }
            }
            z2 = j2.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
        }
        n nVar = this.f852c;
        String str = "Install";
        if (nVar == null) {
            return str;
        }
        if (!TextUtils.isEmpty(nVar.W())) {
            str = this.f852c.W();
            if (str == null || !u.i(str) || str.length() <= 2) {
                if (str != null && !u.i(str) && str.length() > 7 && (z3 || z2)) {
                    str = t();
                }
            } else if (z3 || z2) {
                str = t();
            }
        } else if (this.f852c.L() != 4) {
            str = "View";
        }
        if (z2 && !u.i(str)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams.bottomMargin = v.e(this.f851b, 4.0f);
            this.l.setLayoutParams(layoutParams);
        }
        return str;
    }

    private String t() {
        n nVar = this.f852c;
        if (nVar == null) {
            return null;
        }
        return nVar.L() != 4 ? "View" : "Install";
    }

    /* access modifiers changed from: protected */
    public void f() {
        TextView textView = this.k;
        if (textView != null) {
            v.a(textView, this.f852c, (Context) this.f851b, "tt_comment_num");
        }
    }

    /* access modifiers changed from: protected */
    public void g() {
        if (!(this.i == null || this.f852c.M() == null || TextUtils.isEmpty(this.f852c.M().a()))) {
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f852c.M(), (ImageView) this.i);
            if (!(this.f852c.ax() == null || this.f852c.ax().b() == null)) {
                this.f852c.ax().b().b(0);
            }
        }
        if (this.j != null) {
            if (this.B != 1 || this.f852c.aa() == null || TextUtils.isEmpty(this.f852c.aa().b())) {
                this.j.setText(this.f852c.U());
            } else {
                this.j.setText(this.f852c.aa().b());
            }
        }
        TextView textView = this.r;
        if (textView != null) {
            textView.setText(this.f852c.V());
        }
    }

    public void b(boolean z2) {
        this.u = z2;
    }

    public void a(int i2) {
        v.a((View) this.f855f, i2);
    }

    public int a(n nVar) {
        int f2 = t.f(this.f851b, "tt_activity_full_reward_video_default_style");
        if (l.b(nVar)) {
            nVar.k(4);
            return t.f(this.f851b, "tt_activity_full_reward_video_landingpage_style");
        } else if (l.c(nVar)) {
            nVar.k(4);
            return t.f(this.f851b, "tt_activity_full_reward_landingpage_style");
        } else {
            int v2 = nVar.v();
            if (v2 == 0) {
                return t.f(this.f851b, "tt_activity_full_reward_video_default_style");
            }
            if (v2 == 1) {
                return p.i(this.f852c) ? t.f(this.f851b, "tt_activity_full_reward_video_default_style") : t.f(this.f851b, "tt_activity_full_reward_video_no_bar_style");
            } else if (v2 == 3) {
                return t.f(this.f851b, "tt_activity_full_reward_video_new_bar_style");
            } else {
                if (v2 != 5) {
                    return f2;
                }
                return t.f(this.f851b, "tt_activity_full_reward_video_vast_bar_style");
            }
        }
    }

    public FrameLayout h() {
        return this.m;
    }

    public void b(int i2) {
        v.a((View) this.q, i2);
    }

    public void c(int i2) {
        int i3 = this.f850a;
        if (i3 != -1 && i2 == i3 && !this.w.get()) {
            this.f855f.setVisibility(0);
            this.w.set(true);
            i();
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (this.f855f != null) {
            Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
            Keyframe ofFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
            Keyframe ofFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
            Keyframe ofFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
            Keyframe ofFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
            Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe("scaleX", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
            PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe("scaleY", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f855f, new PropertyValuesHolder[]{ofKeyframe, ofKeyframe2});
            ofPropertyValuesHolder.setDuration(1000);
            ofPropertyValuesHolder.start();
        }
    }

    public void d(int i2) {
        v.a((View) this.f856g, i2);
        v.a((View) this.f857h, i2);
        RelativeLayout relativeLayout = this.f857h;
        if (relativeLayout != null) {
            relativeLayout.post(this.y);
        }
    }

    public boolean j() {
        ImageView imageView = this.f856g;
        if (imageView == null || this.f857h == null || imageView.getVisibility() != 0 || this.f857h.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void a(View.OnClickListener onClickListener) {
        v.a((View) this.m, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void a(com.bytedance.sdk.openadsdk.core.b.c cVar) {
        v.a((View) this.m, (View.OnTouchListener) cVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public View k() {
        return this.f857h;
    }

    public View l() {
        return this.f855f;
    }

    public void a(float f2) {
        v.a((View) this.f856g, f2);
        v.a((View) this.f857h, f2);
    }

    public void a(Animation animation) {
        RelativeLayout relativeLayout = this.s;
        if (relativeLayout != null) {
            relativeLayout.setAnimation(animation);
        }
    }

    public void m() {
        try {
            if (this.t != null) {
                this.t.b();
            }
            if (this.f854e != null && this.s != null) {
                ((ViewGroup) this.f854e).removeView(this.s);
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout = this.s;
            if (relativeLayout != null) {
                relativeLayout.setAlpha(0.0f);
            }
        }
    }

    public void n() {
        l lVar = this.x;
        if (lVar != null) {
            lVar.e();
        }
        RelativeLayout relativeLayout = this.f857h;
        if (relativeLayout != null) {
            relativeLayout.removeCallbacks(this.y);
        }
    }

    public void o() {
        l lVar = this.x;
        if (lVar != null) {
            lVar.f();
        }
    }

    public void p() {
        l lVar = this.x;
        if (lVar != null) {
            lVar.g();
        }
    }

    public void q() {
        l lVar = this.x;
        if (lVar != null) {
            lVar.h();
        }
    }

    public void r() {
        RelativeLayout relativeLayout = this.f855f;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            this.f855f.setLayoutParams(layoutParams);
            this.f855f.setVisibility(0);
        }
    }
}
