package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.a.a.a;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.widget.TTRoundRectImageView;
import com.bytedance.sdk.component.d.i;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.d.n;
import com.bytedance.sdk.component.utils.t;
import io.bidmachine.utils.IabUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class DynamicImageView extends DynamicBaseWidgetImp {

    /* renamed from: a  reason: collision with root package name */
    private String f18602a;

    public DynamicImageView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        if (this.l.o() > 0.0f) {
            this.o = new TTRoundRectImageView(context);
            ((TTRoundRectImageView) this.o).setXRound((int) b.a(context, this.l.o()));
            ((TTRoundRectImageView) this.o).setYRound((int) b.a(context, this.l.o()));
        } else {
            this.o = new ImageView(context);
        }
        this.f18602a = getImageKey();
        this.o.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(hVar.i().b())) {
            if (this.l.b() > 0 || this.l.a() > 0) {
                this.f18592g = Math.min(this.f18592g, this.f18593h);
                this.f18593h = Math.min(this.f18592g, this.f18593h);
                this.i = (int) (((float) this.i) + b.a(context, ((float) (this.l.b() + (this.l.a() / 2))) + 0.5f));
            } else {
                this.f18592g = Math.max(this.f18592g, this.f18593h);
                this.f18593h = Math.max(this.f18592g, this.f18593h);
            }
            this.l.a((float) (this.f18592g / 2));
        }
        addView(this.o, new FrameLayout.LayoutParams(this.f18592g, this.f18593h));
    }

    public boolean h() {
        super.h();
        if ("arrowButton".equals(this.m.i().b())) {
            ((ImageView) this.o).setImageResource(t.d(this.k, "tt_white_righterbackicon_titlebar"));
            this.o.setPadding(0, 0, 0, 0);
            ((ImageView) this.o).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.o.setBackgroundColor(this.l.w());
        if ("user".equals(this.m.i().c())) {
            ((ImageView) this.o).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.o).setColorFilter(this.l.g());
            ((ImageView) this.o).setImageDrawable(t.c(getContext(), "tt_user"));
            ((ImageView) this.o).setPadding(this.f18592g / 10, this.f18593h / 5, this.f18592g / 10, 0);
        }
        if (!a() || Build.VERSION.SDK_INT < 17) {
            i a2 = a.a().e().a(this.l.k()).a(this.f18602a);
            String o = this.n.getRenderRequest().o();
            if (!TextUtils.isEmpty(o)) {
                a2.b(o);
            }
            a2.a((ImageView) this.o);
            ((ImageView) this.o).setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            ((ImageView) this.o).setScaleType(ImageView.ScaleType.FIT_CENTER);
            a.a().e().a(this.l.k()).a(com.bytedance.sdk.component.d.t.BITMAP).a((n) new n<Bitmap>() {
                public void a(int i, String str, Throwable th) {
                }

                public void a(j<Bitmap> jVar) {
                    Bitmap a2 = com.bytedance.sdk.component.adexpress.c.a.a(DynamicImageView.this.k, jVar.b(), 25);
                    if (a2 != null) {
                        DynamicImageView.this.o.setBackground(new BitmapDrawable(DynamicImageView.this.getResources(), a2));
                    }
                }
            });
        }
        return true;
    }

    private boolean a() {
        String l = this.l.l();
        if (this.l.s()) {
            return true;
        }
        if (TextUtils.isEmpty(l)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(l);
            if (Math.abs((((float) this.f18592g) / (((float) this.f18593h) * 1.0f)) - (((float) jSONObject.optInt(IabUtils.KEY_WIDTH)) / (((float) jSONObject.optInt(IabUtils.KEY_HEIGHT)) * 1.0f))) <= 0.01f) {
                return false;
            }
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> l = this.n.getRenderRequest().l();
        if (l == null || l.size() <= 0) {
            return null;
        }
        return l.get(this.l.k());
    }
}
