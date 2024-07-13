package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.dynamic.c.l;
import com.bytedance.sdk.component.utils.t;

public class DynamicLogoAd extends DynamicBaseWidgetImp {
    public DynamicLogoAd(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        this.o = new TextView(context);
        this.o.setTag(Integer.valueOf(getClickArea()));
        addView(this.o, getWidgetLayoutParams());
    }

    public boolean h() {
        super.h();
        if (Build.VERSION.SDK_INT >= 17) {
            this.o.setTextAlignment(this.l.h());
        }
        ((TextView) this.o).setTextColor(this.l.g());
        ((TextView) this.o).setTextSize(this.l.e());
        if (c.b()) {
            ((TextView) this.o).setIncludeFontPadding(false);
            ((TextView) this.o).setTextSize(Math.min(((float) ((b.b(c.a(), (float) this.f18593h) - this.l.b()) - this.l.a())) - 0.5f, this.l.e()));
            ((TextView) this.o).setText(t.b(getContext(), "tt_logo_en"));
            return true;
        } else if (!a()) {
            ((TextView) this.o).setText(t.b(getContext(), "tt_logo_cn"));
            return true;
        } else if (l.b()) {
            ((TextView) this.o).setText(l.a());
            return true;
        } else {
            ((TextView) this.o).setText(l.a(this.l.f18518b));
            return true;
        }
    }

    private boolean a() {
        if (c.b()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.l.f18518b) || !this.l.f18518b.contains("adx:")) && !l.b()) {
            return false;
        }
        return true;
    }
}
