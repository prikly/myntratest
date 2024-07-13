package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.adexpress.dynamic.c.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import java.util.ArrayList;
import java.util.List;

public class AnimationText extends TextSwitcher implements ViewSwitcher.ViewFactory, x.a {

    /* renamed from: a  reason: collision with root package name */
    Animation.AnimationListener f18687a = new Animation.AnimationListener() {
        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            if (AnimationText.this.f18692f != null) {
                AnimationText.this.f18692f.setText("");
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private List<String> f18688b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private int f18689c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final int f18690d = 1;

    /* renamed from: e  reason: collision with root package name */
    private Context f18691e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public TextView f18692f;

    /* renamed from: g  reason: collision with root package name */
    private int f18693g;

    /* renamed from: h  reason: collision with root package name */
    private int f18694h;
    private float i;
    private int j;
    private int k;
    private int l;
    private int m;
    private Handler n = new x(Looper.getMainLooper(), this);

    public AnimationText(Context context, int i2, float f2, int i3, int i4) {
        super(context);
        this.f18694h = i2;
        this.i = f2;
        this.j = i3;
        this.m = i4;
        c();
    }

    private void c() {
        setFactory(this);
    }

    public void setAnimationType(int i2) {
        this.l = i2;
    }

    public void setAnimationDuration(int i2) {
        this.f18693g = i2;
    }

    public void a() {
        int i2 = this.l;
        if (i2 == 1) {
            setInAnimation(getContext(), t.l(this.f18691e, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), t.l(this.f18691e, "tt_text_animation_y_out"));
        } else if (i2 == 0) {
            setInAnimation(getContext(), t.l(this.f18691e, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), t.l(this.f18691e, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.f18687a);
            getOutAnimation().setAnimationListener(this.f18687a);
        }
        this.n.sendEmptyMessage(1);
    }

    public void setAnimationText(List<String> list) {
        this.f18688b = list;
    }

    public void b() {
        List<String> list = this.f18688b;
        if (list != null && list.size() > 0) {
            int i2 = this.f18689c;
            this.f18689c = i2 + 1;
            this.k = i2;
            setText(this.f18688b.get(i2));
            if (this.f18689c > this.f18688b.size() - 1) {
                this.f18689c = 0;
            }
        }
    }

    public void setTextColor(int i2) {
        this.f18694h = i2;
    }

    public void setTextSize(float f2) {
        this.i = f2;
    }

    public void setMaxLines(int i2) {
        this.j = i2;
    }

    public View makeView() {
        TextView textView = new TextView(getContext());
        this.f18692f = textView;
        textView.setTextColor(this.f18694h);
        this.f18692f.setTextSize(this.i);
        this.f18692f.setMaxLines(this.j);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f18692f.setTextAlignment(this.m);
        }
        return this.f18692f;
    }

    public void a(Message message) {
        if (message.what == 1) {
            b();
            this.n.sendEmptyMessageDelayed(1, (long) this.f18693g);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(l.a(this.f18688b.get(this.k), this.i, false)[0], 1073741824), i2);
        } catch (Exception unused) {
            super.onMeasure(i2, i3);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.removeMessages(1);
    }
}
