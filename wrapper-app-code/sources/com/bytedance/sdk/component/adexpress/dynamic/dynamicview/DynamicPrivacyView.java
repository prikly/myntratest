package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;

public class DynamicPrivacyView extends DynamicBaseWidgetImp {

    /* renamed from: a  reason: collision with root package name */
    private TextView f18604a = new TextView(this.k);

    /* renamed from: b  reason: collision with root package name */
    private TextView f18605b = new TextView(this.k);
    private TextView s = new TextView(this.k);
    private LinearLayout t = new LinearLayout(this.k);

    public DynamicPrivacyView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        this.f18604a.setTag(9);
        this.f18605b.setTag(10);
        addView(this.t, getWidgetLayoutParams());
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        this.f18604a.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f18604a.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.f18605b.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f18605b.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f18592g, this.f18593h);
    }

    public boolean h() {
        this.f18605b.setText("权限列表");
        this.s.setText(" | ");
        this.f18604a.setText("隐私政策");
        if (this.l != null) {
            this.f18605b.setTextColor(this.l.g());
            this.f18605b.setTextSize(this.l.e());
            this.s.setTextColor(this.l.g());
            this.f18604a.setTextColor(this.l.g());
            this.f18604a.setTextSize(this.l.e());
        } else {
            this.f18605b.setTextColor(-1);
            this.f18605b.setTextSize(12.0f);
            this.s.setTextColor(-1);
            this.f18604a.setTextColor(-1);
            this.f18604a.setTextSize(12.0f);
        }
        this.t.addView(this.f18605b);
        this.t.addView(this.s);
        this.t.addView(this.f18604a);
        return false;
    }
}
