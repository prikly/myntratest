package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import java.util.Locale;

public class PlayableLoadingView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ProgressBar f1723a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f1724b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f1725c;

    public PlayableLoadingView(Context context) {
        super(context);
        a(context);
    }

    public PlayableLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PlayableLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        setBackgroundColor(Color.parseColor("#0D1833"));
        setClickable(true);
        setVisibility(8);
        LayoutInflater.from(context).inflate(t.f(context, "tt_playable_loading_layout"), this, true);
        this.f1723a = (ProgressBar) findViewById(t.e(context, "tt_playable_pb_view"));
        this.f1724b = (TextView) findViewById(t.e(context, "tt_playable_progress_tip"));
        TextView textView = (TextView) findViewById(t.e(context, "tt_playable_play"));
        this.f1725c = textView;
        textView.setText(t.a(context, "tt_try_now"));
    }

    public void setProgress(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        ProgressBar progressBar = this.f1723a;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
        TextView textView = this.f1724b;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf(i)}));
        }
    }

    public void a() {
        setVisibility(8);
    }

    public void b() {
        setVisibility(0);
    }

    public TextView getPlayView() {
        return this.f1725c;
    }
}
