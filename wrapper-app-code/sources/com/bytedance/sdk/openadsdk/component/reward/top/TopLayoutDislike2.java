package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;

public class TopLayoutDislike2 extends FrameLayout implements a<TopLayoutDislike2> {

    /* renamed from: a  reason: collision with root package name */
    private View f808a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ImageView f809b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f810c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f811d;

    /* renamed from: e  reason: collision with root package name */
    private n f812e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f813f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public b f814g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f815h;
    private CharSequence i;

    public TopLayoutDislike2(Context context) {
        this(context, (AttributeSet) null);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f815h = "";
        this.i = "";
    }

    public TopLayoutDislike2 a(boolean z, n nVar) {
        this.f811d = z;
        this.f812e = nVar;
        LayoutInflater.from(getContext()).inflate(t.f(getContext(), "tt_top_reward_dislike_2"), this, true);
        this.f808a = findViewById(t.e(getContext(), "tt_top_dislike"));
        if (nVar.aw()) {
            this.f808a.setVisibility(8);
        }
        ((TextView) this.f808a).setText(t.a(m.a(), "tt_reward_feedback"));
        this.f809b = (ImageView) findViewById(t.e(getContext(), "tt_top_mute"));
        TextView textView = (TextView) findViewById(t.e(getContext(), "tt_top_skip"));
        this.f810c = textView;
        textView.setVisibility(0);
        this.f810c.setText("");
        this.f810c.setEnabled(false);
        this.f810c.setClickable(false);
        d();
        return this;
    }

    private void d() {
        View view = this.f808a;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TopLayoutDislike2.this.f814g != null) {
                        TopLayoutDislike2.this.f814g.c(view);
                    }
                }
            });
        }
        ImageView imageView = this.f809b;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int i;
                    TopLayoutDislike2 topLayoutDislike2 = TopLayoutDislike2.this;
                    boolean unused = topLayoutDislike2.f813f = !topLayoutDislike2.f813f;
                    if (TopLayoutDislike2.this.f813f) {
                        i = t.d(TopLayoutDislike2.this.getContext(), "tt_mute");
                    } else {
                        i = t.d(TopLayoutDislike2.this.getContext(), "tt_unmute");
                    }
                    TopLayoutDislike2.this.f809b.setImageResource(i);
                    if (TopLayoutDislike2.this.f814g != null) {
                        TopLayoutDislike2.this.f814g.b(view);
                    }
                }
            });
        }
        TextView textView = this.f810c;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TopLayoutDislike2.this.f814g != null) {
                        TopLayoutDislike2.this.f814g.a(view);
                    }
                }
            });
        }
    }

    public void setShowSkip(boolean z) {
        TextView textView = this.f810c;
        if (textView != null) {
            if (!z) {
                textView.setText("");
            }
            if (this.f810c.getVisibility() != 4) {
                this.f810c.setVisibility(z ? 0 : 8);
            }
        }
    }

    public void setSkipEnable(boolean z) {
        TextView textView = this.f810c;
        if (textView != null) {
            textView.setEnabled(z);
            this.f810c.setClickable(z);
        }
    }

    public void setShowSound(boolean z) {
        ImageView imageView = this.f809b;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setSoundMute(boolean z) {
        int i2;
        this.f813f = z;
        if (z) {
            i2 = t.d(getContext(), "tt_mute");
        } else {
            i2 = t.d(getContext(), "tt_unmute");
        }
        this.f809b.setImageResource(i2);
    }

    public void a(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f815h = charSequence;
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            this.i = charSequence2;
        }
        if (this.f810c != null) {
            CharSequence charSequence3 = this.f815h;
            if (!TextUtils.isEmpty(this.i)) {
                charSequence3 = charSequence3 + " | " + this.i;
            }
            this.f810c.setText(charSequence3);
        }
    }

    public void setShowDislike(boolean z) {
        View view = this.f808a;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setListener(b bVar) {
        this.f814g = bVar;
    }

    public void a() {
        TextView textView = this.f810c;
        if (textView != null) {
            textView.performClick();
        }
    }

    public void b() {
        ImageView imageView = this.f809b;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    public void c() {
        this.f810c.setWidth(20);
        this.f810c.setVisibility(4);
    }
}
