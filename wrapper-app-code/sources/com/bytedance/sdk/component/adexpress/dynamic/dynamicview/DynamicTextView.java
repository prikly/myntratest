package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.widget.AnimationText;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class DynamicTextView extends DynamicBaseWidgetImp {
    public DynamicTextView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        if (this.l.A()) {
            this.o = new AnimationText(context, this.l.g(), this.l.e(), 1, this.l.h());
            ((AnimationText) this.o).setMaxLines(1);
        } else {
            this.o = new TextView(context);
        }
        this.o.setTag(Integer.valueOf(getClickArea()));
        addView(this.o, getWidgetLayoutParams());
    }

    public boolean h() {
        int i;
        super.h();
        if (TextUtils.isEmpty(getText())) {
            this.o.setVisibility(4);
            return true;
        } else if (this.l.A()) {
            k();
            return true;
        } else {
            ((TextView) this.o).setText(this.l.f());
            if (Build.VERSION.SDK_INT >= 17) {
                this.o.setTextAlignment(this.l.h());
            }
            ((TextView) this.o).setTextColor(this.l.g());
            ((TextView) this.o).setTextSize(this.l.e());
            if (!this.l.t()) {
                ((TextView) this.o).setMaxLines(1);
                ((TextView) this.o).setGravity(17);
                ((TextView) this.o).setEllipsize(TextUtils.TruncateAt.END);
            } else {
                int u = this.l.u();
                if (u > 0) {
                    ((TextView) this.o).setLines(u);
                    ((TextView) this.o).setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            if (!(this.m == null || this.m.i() == null)) {
                if (!c.b() || !a() || (!TextUtils.equals(this.m.i().b(), "text_star") && !TextUtils.equals(this.m.i().b(), "score-count") && !TextUtils.equals(this.m.i().b(), "score-count-type-1") && !TextUtils.equals(this.m.i().b(), "score-count-type-2"))) {
                    if (TextUtils.equals(this.m.i().b(), "score-count") || TextUtils.equals(this.m.i().b(), "score-count-type-2")) {
                        try {
                            i = Integer.parseInt(getText());
                        } catch (NumberFormatException unused) {
                            i = -1;
                        }
                        if (i < 0) {
                            try {
                                if (c.b()) {
                                    setVisibility(8);
                                    return true;
                                }
                                this.o.setVisibility(0);
                            } catch (Exception unused2) {
                            }
                        }
                        i();
                        if (TextUtils.equals(this.m.i().b(), "score-count-type-2")) {
                            ((TextView) this.o).setText(String.format(new DecimalFormat("(###,###,###)").format((long) i), new Object[]{Integer.valueOf(i)}));
                            ((TextView) this.o).setGravity(17);
                            return true;
                        }
                        a((TextView) this.o, i, getContext(), "tt_comment_num");
                    } else if (TextUtils.equals(this.m.i().b(), "text_star")) {
                        double d2 = -1.0d;
                        try {
                            d2 = Double.parseDouble(getText());
                        } catch (Exception e2) {
                            l.e("DynamicStarView applyNativeStyle", e2.toString());
                        }
                        if (d2 < 0.0d || d2 > 5.0d) {
                            if (c.b()) {
                                setVisibility(8);
                                return true;
                            }
                            this.o.setVisibility(0);
                        }
                        i();
                        ((TextView) this.o).setIncludeFontPadding(false);
                        ((TextView) this.o).setGravity(17);
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.o.setTextAlignment(4);
                        }
                        ((TextView) this.o).setText(String.format("%.1f", new Object[]{Double.valueOf(d2)}));
                    } else if (TextUtils.equals("privacy-detail", this.m.i().b())) {
                        ((TextView) this.o).setText("权限列表 | 隐私政策");
                    } else if (TextUtils.equals(this.m.i().b(), "development-name")) {
                        ((TextView) this.o).setText("开发者：" + getText());
                    } else if (TextUtils.equals(this.m.i().b(), "app-version")) {
                        ((TextView) this.o).setText("版本号：V" + getText());
                    } else {
                        ((TextView) this.o).setText(getText());
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.o.setTextAlignment(this.l.h());
                        ((TextView) this.o).setGravity(this.l.i());
                    }
                    if (c.b()) {
                        j();
                    }
                } else {
                    setVisibility(8);
                    return true;
                }
            }
            return true;
        }
    }

    private boolean a() {
        return (this.n == null || this.n.getRenderRequest() == null || this.n.getRenderRequest().k() == 4) ? false : true;
    }

    private void i() {
        if ((this.l.a() != 0 || this.l.b() <= 0) && c.b()) {
            this.o.setTranslationY((float) (-(((int) ((((float) this.f18593h) - ((TextView) this.o).getTextSize()) - b.a(getContext(), (float) (this.l.b() + this.l.a())))) / 2)));
        }
    }

    private void j() {
        if ((TextUtils.equals(this.m.i().b(), "source") || TextUtils.equals(this.m.i().b(), "title")) && Build.VERSION.SDK_INT >= 17) {
            this.o.setTextAlignment(2);
        }
        if ((TextUtils.equals(this.m.i().b(), "text_star") || TextUtils.equals(this.m.i().b(), "fillButton")) && Build.VERSION.SDK_INT >= 17) {
            this.o.setTextAlignment(2);
            ((TextView) this.o).setGravity(17);
        }
    }

    public String getText() {
        String f2 = this.l.f();
        if (TextUtils.isEmpty(f2)) {
            if (!c.b() && TextUtils.equals(this.m.i().b(), "text_star")) {
                f2 = "5";
            }
            if (!c.b() && TextUtils.equals(this.m.i().b(), "score-count")) {
                f2 = "6870";
            }
        }
        return (TextUtils.equals(this.m.i().b(), "title") || TextUtils.equals(this.m.i().b(), "subtitle")) ? f2.replace("\n", "") : f2;
    }

    public void a(TextView textView, int i, Context context, String str) {
        String format = String.format(t.a(context, str), new Object[]{Integer.valueOf(i)});
        textView.setText("(" + format + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    private void k() {
        if (this.o instanceof AnimationText) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                arrayList.add(text);
            }
            ((AnimationText) this.o).setMaxLines(1);
            ((AnimationText) this.o).setTextColor(this.l.g());
            ((AnimationText) this.o).setTextSize(this.l.e());
            ((AnimationText) this.o).setAnimationText(arrayList);
            ((AnimationText) this.o).setAnimationType(this.l.C());
            ((AnimationText) this.o).setAnimationDuration(this.l.B() * 1000);
            ((AnimationText) this.o).a();
        }
    }
}
