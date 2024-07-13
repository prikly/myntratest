package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.b;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.k;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.RatioImageView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ms.bd.o.Pgl.c;

public class BannerExpressBackupView extends BackupView {

    /* renamed from: a  reason: collision with root package name */
    public static k[] f968a = {new k(1, 6.4f, 320, 50), new k(4, 1.2f, c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED)};
    private View m;
    private NativeExpressView n;
    private com.com.bytedance.overseas.sdk.a.c o;
    private int p = 1;
    private String q;

    public void setClosedListenerKey(String str) {
        this.q = str;
    }

    public BannerExpressBackupView(Context context) {
        super(context);
        this.f1386b = context;
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i, j jVar) {
        if (this.n != null) {
            if (i == 1 || i == 2) {
                View findViewById = this.m.findViewById(t.e(this.f1386b, "tt_bu_close"));
                if (i == 1) {
                    this.n.getClickListener().b(findViewById);
                } else {
                    this.n.getClickCreativeListener().b(findViewById);
                }
            }
            this.n.a(view, i, (b) jVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(n nVar, NativeExpressView nativeExpressView, com.com.bytedance.overseas.sdk.a.c cVar) {
        setBackgroundColor(-1);
        this.f1387c = nVar;
        this.n = nativeExpressView;
        this.o = cVar;
        this.f1390f = "banner_ad";
        this.n.addView(this, new ViewGroup.LayoutParams(-2, -2));
        b();
    }

    private void b() {
        k a2 = a(this.n.getExpectExpressWidth(), this.n.getExpectExpressHeight());
        if (this.n.getExpectExpressWidth() <= 0 || this.n.getExpectExpressHeight() <= 0) {
            this.f1391g = v.c(this.f1386b);
            this.f1392h = Float.valueOf(((float) this.f1391g) / a2.f1466b).intValue();
        } else {
            this.f1391g = v.e(this.f1386b, (float) this.n.getExpectExpressWidth());
            this.f1392h = v.e(this.f1386b, (float) this.n.getExpectExpressHeight());
        }
        if (this.f1391g > 0 && this.f1391g > v.c(this.f1386b)) {
            float c2 = ((float) v.c(this.f1386b)) / ((float) this.f1391g);
            this.f1391g = v.c(this.f1386b);
            this.f1392h = Float.valueOf(((float) this.f1392h) * c2).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f1391g, this.f1392h);
        }
        layoutParams.width = this.f1391g;
        layoutParams.height = this.f1392h;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (a2.f1465a == 1) {
            c();
        } else if (a2.f1465a == 4) {
            d();
        } else {
            d();
        }
    }

    private void a(ImageView imageView) {
        d.a().a(this.f1387c.P().get(0), imageView);
    }

    private void c() {
        float e2 = (((float) this.f1392h) * 1.0f) / ((float) v.e(this.f1386b, 50.0f));
        if ((((float) this.f1392h) * 1.0f) / ((float) this.f1391g) > 0.21875f) {
            e2 = (((float) this.f1391g) * 1.0f) / ((float) v.e(this.f1386b, 320.0f));
        }
        View inflate = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_backup_banner_layout1"), this, true);
        this.m = inflate;
        View findViewById = inflate.findViewById(t.e(this.f1386b, "tt_bu_close"));
        ImageView imageView = (ImageView) this.m.findViewById(t.e(this.f1386b, "tt_bu_icon"));
        TextView textView = (TextView) this.m.findViewById(t.e(this.f1386b, "tt_bu_title"));
        TextView textView2 = (TextView) this.m.findViewById(t.e(this.f1386b, "tt_bu_score"));
        TTRatingBar2 tTRatingBar2 = (TTRatingBar2) this.m.findViewById(t.e(this.f1386b, "tt_bu_score_bar"));
        TextView textView3 = (TextView) this.m.findViewById(t.e(this.f1386b, "tt_bu_download"));
        textView.setTextSize(2, ((float) v.a(this.f1386b, textView.getTextSize())) * e2);
        textView2.setTextSize(2, ((float) v.a(this.f1386b, textView2.getTextSize())) * e2);
        textView3.setTextSize(2, ((float) v.a(this.f1386b, textView3.getTextSize())) * e2);
        View findViewById2 = this.m.findViewById(t.e(this.f1386b, "tt_backup_logoLayout"));
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTWebsiteActivity.a(BannerExpressBackupView.this.f1386b, BannerExpressBackupView.this.f1387c, BannerExpressBackupView.this.f1390f);
                }
            });
        }
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BannerExpressBackupView.this.a();
            }
        });
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (((float) v.e(this.f1386b, 45.0f)) * e2);
            layoutParams.height = (int) (((float) v.e(this.f1386b, 45.0f)) * e2);
        }
        if (this.f1387c.M() != null && !TextUtils.isEmpty(this.f1387c.M().a())) {
            d.a().a(this.f1387c.M().a(), imageView);
        }
        textView.setText(getTitle());
        if (!TextUtils.isEmpty(this.f1387c.W())) {
            textView3.setText(this.f1387c.W());
        } else {
            textView3.setVisibility(8);
        }
        v.a(textView2, tTRatingBar2, this.f1387c, this.f1386b);
        a(imageView, true);
        imageView.setTag(t.e(m.a(), "tt_id_is_video_picture"), true);
        a(this, true);
        a(textView3, true);
    }

    private void d() {
        String str;
        if (this.f1387c != null) {
            int ad = this.f1387c.ad();
            float e2 = (((float) this.f1392h) * 1.0f) / ((float) v.e(this.f1386b, 250.0f));
            if (this.f1387c.J() == null) {
                View inflate = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_backup_banner_layout4"), this, true);
                this.m = inflate;
                View findViewById = inflate.findViewById(t.e(this.f1386b, "tt_bu_close"));
                RatioImageView ratioImageView = (RatioImageView) this.m.findViewById(t.e(this.f1386b, "ratio_image_view"));
                ImageView imageView = (ImageView) this.m.findViewById(t.e(this.f1386b, "tt_bu_icon"));
                TextView textView = (TextView) this.m.findViewById(t.e(this.f1386b, "tt_bu_title"));
                TextView textView2 = (TextView) this.m.findViewById(t.e(this.f1386b, "tt_bu_desc"));
                TextView textView3 = (TextView) this.m.findViewById(t.e(this.f1386b, "tt_bu_name"));
                TextView textView4 = (TextView) this.m.findViewById(t.e(this.f1386b, "tt_bu_download"));
                FrameLayout frameLayout = (FrameLayout) this.m.findViewById(t.e(this.f1386b, "tt_image_layout"));
                LinearLayout linearLayout = (LinearLayout) this.m.findViewById(t.e(this.f1386b, "tt_bu_total_title"));
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    str = "tt_id_is_video_picture";
                    layoutParams.width = (int) (((float) v.e(this.f1386b, 45.0f)) * e2);
                    layoutParams.height = (int) (((float) v.e(this.f1386b, 45.0f)) * e2);
                } else {
                    str = "tt_id_is_video_picture";
                }
                textView.setTextSize(2, ((float) v.a(this.f1386b, textView.getTextSize())) * e2);
                textView2.setTextSize(2, ((float) v.a(this.f1386b, textView2.getTextSize())) * e2);
                textView3.setTextSize(2, ((float) v.a(this.f1386b, textView3.getTextSize())) * e2);
                textView4.setTextSize(2, ((float) v.a(this.f1386b, textView4.getTextSize())) * e2);
                try {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                    float f2 = e2 - 1.0f;
                    if (f2 > 0.0f) {
                        layoutParams2.topMargin = v.e(this.f1386b, f2 * 8.0f);
                    }
                    ((LinearLayout.LayoutParams) textView4.getLayoutParams()).setMargins(0, (int) (((float) v.e(this.f1386b, 16.0f)) * e2), 0, 0);
                } catch (Throwable unused) {
                }
                View findViewById2 = this.m.findViewById(t.e(this.f1386b, "tt_backup_logoLayout"));
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            TTWebsiteActivity.a(BannerExpressBackupView.this.f1386b, BannerExpressBackupView.this.f1387c, BannerExpressBackupView.this.f1390f);
                        }
                    });
                }
                if (ad == 33) {
                    ratioImageView.setRatio(1.0f);
                } else {
                    ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 2.5f;
                    ratioImageView.setRatio(1.91f);
                }
                findViewById.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        BannerExpressBackupView.this.a();
                    }
                });
                int b2 = (int) v.b(this.f1386b, 15.0f);
                v.a(findViewById, b2, b2, b2, b2);
                a((ImageView) ratioImageView);
                if (this.f1387c.M() != null && !TextUtils.isEmpty(this.f1387c.M().a())) {
                    d.a().a(this.f1387c.M().a(), imageView);
                }
                textView3.setText(getNameOrSource());
                textView.setText(getNameOrSource());
                textView2.setText(getDescription());
                if (!TextUtils.isEmpty(this.f1387c.W())) {
                    textView4.setText(this.f1387c.W());
                } else {
                    textView4.setVisibility(8);
                }
                a(ratioImageView, true);
                ratioImageView.setTag(t.e(m.a(), str), true);
                a(this, true);
                a(textView4, true);
                return;
            }
            String str2 = "tt_id_is_video_picture";
            View inflate2 = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_backup_banner_layout4_video"), this, true);
            this.m = inflate2;
            View findViewById3 = inflate2.findViewById(t.e(this.f1386b, "tt_bu_close"));
            TextView textView5 = (TextView) this.m.findViewById(t.e(this.f1386b, "tt_bu_title"));
            TextView textView6 = (TextView) this.m.findViewById(t.e(this.f1386b, "tt_bu_desc"));
            TextView textView7 = (TextView) this.m.findViewById(t.e(this.f1386b, "tt_bu_download"));
            RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) this.m.findViewById(t.e(this.f1386b, "ratio_frame_layout"));
            textView5.setTextSize(2, ((float) v.a(this.f1386b, textView5.getTextSize())) * e2);
            textView6.setTextSize(2, ((float) v.a(this.f1386b, textView6.getTextSize())) * e2);
            textView7.setTextSize(2, ((float) v.a(this.f1386b, textView7.getTextSize())) * e2);
            View findViewById4 = this.m.findViewById(t.e(this.f1386b, "tt_backup_logoLayout"));
            if (findViewById4 != null) {
                findViewById4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.a(BannerExpressBackupView.this.f1386b, BannerExpressBackupView.this.f1387c, BannerExpressBackupView.this.f1390f);
                    }
                });
            }
            if (ad == 15) {
                ratioFrameLayout.setRatio(0.5625f);
            } else if (ad == 5) {
                ratioFrameLayout.setRatio(1.7777778f);
            } else {
                ratioFrameLayout.setRatio(1.0f);
            }
            ratioFrameLayout.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            View videoView = getVideoView();
            if (videoView != null) {
                ratioFrameLayout.addView(videoView, layoutParams3);
            }
            textView5.setText(getNameOrSource());
            textView6.setText(getDescription());
            if (!TextUtils.isEmpty(this.f1387c.W())) {
                textView7.setText(this.f1387c.W());
            } else {
                textView7.setVisibility(8);
            }
            findViewById3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    BannerExpressBackupView.this.a();
                }
            });
            int b3 = (int) v.b(this.f1386b, 15.0f);
            v.a(findViewById3, b3, b3, b3, b3);
            a(videoView, true);
            videoView.setTag(t.e(m.a(), str2), true);
            a(this, true);
            a(textView7, true);
            a((View) ratioFrameLayout);
        }
    }

    public static k a(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? f968a[1] : f968a[0];
        } catch (Throwable unused) {
            return f968a[0];
        }
    }

    public void a() {
        if (this.f1389e != null) {
            this.f1389e.show();
        } else if (this.f1388d != null) {
            this.f1388d.showDislikeDialog();
        } else {
            TTDelegateActivity.a(this.f1387c, this.q);
        }
    }
}
