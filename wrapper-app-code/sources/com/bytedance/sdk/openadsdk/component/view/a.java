package com.bytedance.sdk.openadsdk.component.view;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: TTAppOpenAdUserInfo */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f879a;

    /* renamed from: b  reason: collision with root package name */
    private static Drawable f880b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f881c;

    /* renamed from: d  reason: collision with root package name */
    private TTRoundRectImageView f882d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f883e;

    public void a(Activity activity) {
        this.f881c = (LinearLayout) activity.findViewById(t.e(activity, "tt_user_info"));
        this.f882d = (TTRoundRectImageView) activity.findViewById(t.e(activity, "tt_app_icon"));
        this.f883e = (TextView) activity.findViewById(t.e(activity, "tt_app_name"));
        this.f881c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
    }

    public void a() {
        String g2 = h.d().g();
        if (TextUtils.isEmpty(g2)) {
            this.f883e.setVisibility(8);
        } else {
            this.f883e.setText(g2);
        }
        b();
        try {
            if (f880b == null) {
                this.f882d.setVisibility(8);
                return;
            }
            this.f882d.setImageDrawable(f880b);
            if (this.f883e.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f882d.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.f882d.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.f882d.setVisibility(8);
        }
    }

    public void b() {
        if (!f879a) {
            try {
                int h2 = h.d().h();
                if (h2 != 0) {
                    f880b = m.a().getResources().getDrawable(h2);
                }
            } catch (Throwable unused) {
            }
            f879a = true;
        }
    }

    public static Drawable c() {
        return f880b;
    }

    public void a(n nVar, float f2, float f3) {
        int i;
        int i2;
        int d2 = nVar.d();
        if (d2 == 1 || d2 == 3) {
            if (n.c(nVar)) {
                i2 = nVar.J().c();
                i = nVar.J().b();
            } else {
                i2 = nVar.P().get(0).b();
                i = nVar.P().get(0).c();
            }
            if (i2 > 0 && i > 0) {
                float f4 = (float) i;
                float min = f3 - (f4 * Math.min(f2 / ((float) i2), f3 / f4));
                try {
                    float e2 = (float) v.e(m.a(), 60.0f);
                    if (min < e2) {
                        min = e2;
                    }
                    this.f881c.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) min));
                } catch (Throwable unused) {
                }
            }
        }
    }
}
