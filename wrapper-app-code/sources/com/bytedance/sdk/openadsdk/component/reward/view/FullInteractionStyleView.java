package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.b.e;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.d.a;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.com.bytedance.overseas.sdk.a.b;
import com.com.bytedance.overseas.sdk.a.c;
import java.util.List;

public class FullInteractionStyleView extends BackupView {

    /* renamed from: a  reason: collision with root package name */
    private float f820a;
    private boolean m;
    private int n;
    private int o;
    private int p = 1;
    private View q;
    private View r;
    private FrameLayout s;
    private e t;

    /* access modifiers changed from: protected */
    public void a(View view, int i, j jVar) {
    }

    public FullInteractionStyleView(Context context, String str) {
        super(context, str);
        this.f1386b = context;
    }

    public void a(n nVar, float f2, int i, int i2, int i3) {
        this.f820a = f2;
        this.p = i;
        this.f1387c = nVar;
        this.f1390f = "fullscreen_interstitial_ad";
        this.n = i2;
        this.o = i3;
        a(this.i);
        b();
    }

    private void b() {
        this.f1391g = v.e(this.f1386b, (float) this.n);
        this.f1392h = v.e(this.f1386b, (float) this.o);
        int i = (int) (this.f820a * 1000.0f);
        if (this.p == 1) {
            if (i == 666) {
                e();
            } else if (i == 1000) {
                c();
            } else if (i == 1500) {
                k();
            } else if (i != 1777) {
                a(0.562f);
                l();
            } else {
                m();
            }
        } else if (i == 562) {
            i();
        } else if (i == 666) {
            g();
        } else if (i == 1000) {
            c();
        } else if (i != 1500) {
            a(1.777f);
            j();
        } else {
            h();
        }
    }

    private void c() {
        this.q = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_interaction_style_1_1"), this, true);
        d();
        f();
    }

    private void d() {
        this.s = (FrameLayout) this.q.findViewById(t.e(this.f1386b, "tt_ad_container"));
        ImageView imageView = (ImageView) this.q.findViewById(t.e(this.f1386b, "tt_full_img"));
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) this.q.findViewById(t.e(this.f1386b, "tt_full_ad_icon"));
        TextView textView = (TextView) this.q.findViewById(t.e(this.f1386b, "tt_full_ad_app_name"));
        TextView textView2 = (TextView) this.q.findViewById(t.e(this.f1386b, "tt_full_ad_download"));
        LinearLayout linearLayout = (LinearLayout) this.q.findViewById(t.e(this.f1386b, "tt_ad_logo_layout"));
        if (!TextUtils.isEmpty(this.f1387c.W())) {
            textView2.setText(this.f1387c.W());
        }
        a(this.s, imageView);
        if (this.f1387c.M() != null && !TextUtils.isEmpty(this.f1387c.M().a())) {
            d.a().a(this.f1387c.M().a(), (ImageView) tTRoundRectImageView);
        }
        textView.setText(getTitle());
        b((View) this.s);
        b((View) imageView);
        b((View) tTRoundRectImageView);
        b((View) textView);
        b((View) textView2);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.a(FullInteractionStyleView.this.f1386b, FullInteractionStyleView.this.f1387c, FullInteractionStyleView.this.f1390f);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private void e() {
        this.q = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_interaction_style_2_3"), this, true);
        d();
        f();
    }

    private void f() {
        TextView textView = (TextView) this.q.findViewById(t.e(this.f1386b, "tt_full_ad_desc"));
        if (textView != null) {
            textView.setText(getDescription());
            b((View) textView);
        }
    }

    private void g() {
        this.q = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_interaction_style_2_3_h"), this, true);
        d();
        f();
    }

    private void h() {
        this.q = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_interaction_style_3_2_h"), this, true);
        d();
    }

    private void i() {
        this.q = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_interaction_style_9_16_h"), this, true);
        d();
        f();
    }

    private void j() {
        this.q = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_interaction_style_16_9_h"), this, true);
        d();
    }

    private void k() {
        View inflate = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_interaction_style_3_2"), this, true);
        this.q = inflate;
        this.s = (FrameLayout) inflate.findViewById(t.e(this.f1386b, "tt_ad_container"));
        ImageView imageView = (ImageView) this.q.findViewById(t.e(this.f1386b, "tt_bu_img"));
        TextView textView = (TextView) this.q.findViewById(t.e(this.f1386b, "tt_bu_desc"));
        a(this.s, imageView);
        textView.setText(getDescription());
        b((View) this.s);
        b((View) imageView);
        b((View) textView);
        ((LinearLayout) this.q.findViewById(t.e(this.f1386b, "tt_ad_logo_layout"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.a(FullInteractionStyleView.this.f1386b, FullInteractionStyleView.this.f1387c, FullInteractionStyleView.this.f1390f);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private void a(FrameLayout frameLayout, ImageView imageView) {
        if (this.f1387c != null) {
            boolean c2 = n.c(this.f1387c);
            if (this.f1387c.J() == null || !c2) {
                a(imageView);
                v.a((View) imageView, 0);
                v.a((View) frameLayout, 8);
                return;
            }
            v.a((View) imageView, 8);
            v.a((View) frameLayout, 0);
        }
    }

    private void a(ImageView imageView) {
        List<k> P;
        if (this.f1387c != null && (P = this.f1387c.P()) != null && P.size() > 0) {
            a.a(P.get(0)).a(imageView);
        }
    }

    private void l() {
        this.q = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_interaction_style_9_16_v"), this, true);
        d();
    }

    private void m() {
        this.q = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_interaction_style_16_9_v"), this, true);
        d();
        f();
    }

    private void b(View view) {
        if (view != null) {
            com.bytedance.sdk.openadsdk.core.b.a aVar = this.t;
            if (aVar == null) {
                aVar = new com.bytedance.sdk.openadsdk.core.b.a(this.f1386b, this.f1387c, this.f1390f, u.a(this.f1390f));
                aVar.a(a(this.f1387c, this.f1386b));
            }
            view.setOnTouchListener(aVar);
            view.setOnClickListener(aVar);
        }
    }

    private c a(n nVar, Context context) {
        if (nVar != null && nVar.L() == 4) {
            return new b(context, nVar, this.f1390f);
        }
        return null;
    }

    public View getInteractionStyleRootView() {
        return this.q;
    }

    public void setIsMute(boolean z) {
        this.m = z;
        View view = this.r;
        if (view != null && (view instanceof NativeVideoTsView)) {
            ((NativeVideoTsView) view).setIsQuiet(z);
        }
    }

    public FrameLayout getVideoContainer() {
        return this.s;
    }

    public void setDownloadListener(e eVar) {
        this.t = eVar;
    }

    private float getHeightDp() {
        return (float) v.d(this.f1386b, (float) v.h(this.f1386b));
    }

    private float getWidthDp() {
        return (float) v.d(this.f1386b, (float) v.i(this.f1386b));
    }

    private void a(float f2) {
        float f3;
        float f4;
        int i;
        int i2;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.p == 2) {
            f3 = Math.max(heightDp, widthDp);
            f4 = Math.min(heightDp, widthDp);
        } else {
            f3 = Math.min(heightDp, widthDp);
            f4 = Math.max(heightDp, widthDp);
        }
        if (this.p != 2 && v.c((Activity) this.f1386b)) {
            f4 -= (float) v.d(this.f1386b, v.j(this.f1386b));
        }
        int i3 = 20;
        int i4 = 0;
        if (this.p != 2) {
            if (!(f2 == 0.0f || f2 == 100.0f)) {
                float f5 = (float) 20;
                i = (int) Math.max((f4 - (((f3 - f5) - f5) / f2)) / 2.0f, 0.0f);
                i3 = i;
                i2 = 20;
                i4 = 20;
                int e2 = v.e(this.f1386b, (float) i3);
                int e3 = v.e(this.f1386b, (float) i);
                ((Activity) this.f1386b).getWindow().getDecorView().setPadding(v.e(this.f1386b, (float) i4), e2, v.e(this.f1386b, (float) i2), e3);
            }
        } else if (!(f2 == 0.0f || f2 == 100.0f)) {
            float f6 = (float) 20;
            i2 = (int) Math.max((f3 - (((f4 - f6) - f6) * f2)) / 2.0f, 0.0f);
            i4 = i2;
            i = 20;
            int e22 = v.e(this.f1386b, (float) i3);
            int e32 = v.e(this.f1386b, (float) i);
            ((Activity) this.f1386b).getWindow().getDecorView().setPadding(v.e(this.f1386b, (float) i4), e22, v.e(this.f1386b, (float) i2), e32);
        }
        i = 0;
        i2 = 0;
        i3 = 0;
        int e222 = v.e(this.f1386b, (float) i3);
        int e322 = v.e(this.f1386b, (float) i);
        ((Activity) this.f1386b).getWindow().getDecorView().setPadding(v.e(this.f1386b, (float) i4), e222, v.e(this.f1386b, (float) i2), e322);
    }
}
