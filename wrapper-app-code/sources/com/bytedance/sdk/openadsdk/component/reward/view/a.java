package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.a.g;
import com.bytedance.sdk.openadsdk.core.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: RewardFullBackUpEndCard */
public class a {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f830a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f831b;

    /* renamed from: c  reason: collision with root package name */
    TTRoundRectImageView f832c;

    /* renamed from: d  reason: collision with root package name */
    TextView f833d;

    /* renamed from: e  reason: collision with root package name */
    TTRatingBar2 f834e;

    /* renamed from: f  reason: collision with root package name */
    TextView f835f;

    /* renamed from: g  reason: collision with root package name */
    TextView f836g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Activity f837h;
    private boolean i;
    private TextView j;
    private g k;

    public a(Activity activity) {
        this.f837h = activity;
    }

    public void a() {
        if (!this.i) {
            this.i = true;
            d();
        }
    }

    private void d() {
        Activity activity = this.f837h;
        this.f831b = (FrameLayout) activity.findViewById(t.e(activity, "tt_reward_full_endcard_backup_container"));
        Activity activity2 = this.f837h;
        this.f830a = (LinearLayout) activity2.findViewById(t.e(activity2, "tt_reward_full_endcard_backup"));
        Activity activity3 = this.f837h;
        this.f832c = (TTRoundRectImageView) activity3.findViewById(t.e(activity3, "tt_reward_ad_icon_backup"));
        Activity activity4 = this.f837h;
        this.f833d = (TextView) activity4.findViewById(t.e(activity4, "tt_reward_ad_appname_backup"));
        Activity activity5 = this.f837h;
        this.f834e = (TTRatingBar2) activity5.findViewById(t.e(activity5, "tt_rb_score_backup"));
        Activity activity6 = this.f837h;
        this.f835f = (TextView) activity6.findViewById(t.e(activity6, "tt_comment_backup"));
        Activity activity7 = this.f837h;
        this.f836g = (TextView) activity7.findViewById(t.e(activity7, "tt_reward_ad_download_backup"));
        Activity activity8 = this.f837h;
        this.j = (TextView) activity8.findViewById(t.e(activity8, "tt_ad_endcard_logo"));
    }

    public void a(e eVar) {
        v.a((View) this.f831b, (View.OnClickListener) new View.OnClickListener() {
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        this.f836g.setOnClickListener(eVar);
        this.f836g.setOnTouchListener(eVar);
        if (this.k == null) {
            this.k = new g(this.f837h);
        }
        this.k.a(eVar);
    }

    public void b() {
        v.a((View) this.f831b, 0);
        v.a((View) this.f830a, 0);
        g gVar = this.k;
        if (gVar != null) {
            gVar.a();
        }
    }

    public void c() {
        TTRoundRectImageView tTRoundRectImageView = this.f832c;
        if (tTRoundRectImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tTRoundRectImageView.getLayoutParams();
            layoutParams.setMargins(0, (int) v.b(this.f837h, 50.0f), 0, 0);
            this.f832c.setLayoutParams(layoutParams);
        }
    }

    public void a(n nVar) {
        if (nVar.aw()) {
            if (this.k == null) {
                this.k = new g(this.f837h);
            }
            this.k.a(nVar);
            return;
        }
        if (!(this.f832c == null || nVar.M() == null || TextUtils.isEmpty(nVar.M().a()))) {
            d.a().a(nVar.M(), (ImageView) this.f832c);
        }
        TTRatingBar2 tTRatingBar2 = this.f834e;
        if (tTRatingBar2 != null) {
            v.a((TextView) null, tTRatingBar2, nVar, (Context) this.f837h);
        }
        if (this.f833d != null) {
            if (nVar.aa() == null || TextUtils.isEmpty(nVar.aa().b())) {
                this.f833d.setText(nVar.U());
            } else {
                this.f833d.setText(nVar.aa().b());
            }
        }
        TextView textView = this.f835f;
        if (textView != null) {
            v.a(textView, nVar, (Context) this.f837h, "tt_comment_num_backup");
        }
    }

    public void a(String str) {
        TextView textView;
        if (!TextUtils.isEmpty(str) && (textView = this.f836g) != null) {
            textView.setText(str);
        }
    }

    public void a(final n nVar, final String str) {
        this.j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.a(a.this.f837h, nVar, str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public boolean a(com.bytedance.sdk.openadsdk.component.reward.a.e eVar) {
        g gVar = this.k;
        if (gVar == null || !gVar.a(eVar)) {
            return false;
        }
        v.a((View) this.f831b, 0);
        v.a((View) this.f830a, 8);
        return true;
    }
}
