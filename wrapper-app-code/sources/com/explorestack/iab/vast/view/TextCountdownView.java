package com.explorestack.iab.vast.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.explorestack.iab.utils.IabElementStyle;

public class TextCountdownView extends IabTextView {

    /* renamed from: e  reason: collision with root package name */
    public String f3333e = "%1.0fs";

    public TextCountdownView(Context context) {
        super(context);
    }

    public void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(getText())) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setProgress(int i) {
        setText(this.f3333e.replace("%1.0f", String.valueOf(i)));
    }

    public void setRemaining(int i) {
        setText(this.f3333e.replace("%1.0f", String.valueOf(i)));
    }

    public void setStyle(IabElementStyle iabElementStyle) {
        super.setStyle(iabElementStyle);
        String content = iabElementStyle.getContent();
        if (content != null) {
            this.f3333e = content;
        }
    }
}
