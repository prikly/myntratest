package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;

public class DynamicLogoUnion extends DynamicBaseWidgetImp {
    public DynamicLogoUnion(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        this.o = new ImageView(context);
        this.o.setTag(Integer.valueOf(getClickArea()));
        if (c.b()) {
            this.f18593h = Math.max(dynamicRootView.getLogoUnionHeight(), this.f18593h);
        }
        addView(this.o, getWidgetLayoutParams());
    }

    public boolean h() {
        super.h();
        if (c.b()) {
            ((ImageView) this.o).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.o).setImageResource(t.d(getContext(), "tt_ad_logo_reward_full"));
        } else {
            ((ImageView) this.o).setImageResource(t.d(getContext(), "tt_ad_logo"));
        }
        ((ImageView) this.o).setColorFilter(this.l.g());
        return true;
    }
}
