package com.explorestack.iab.utils;

import android.content.Context;
import android.view.View;
import com.explorestack.iab.vast.view.CircleCountdownView;
import com.explorestack.iab.vast.view.TextCountdownView;

public class e extends g<View> {
    public e(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    public void a(int i, int i2) {
        T t = this.f3108b;
        if (t instanceof TextCountdownView) {
            TextCountdownView textCountdownView = (TextCountdownView) t;
            if (i2 == 0) {
                textCountdownView.setText("");
            } else {
                textCountdownView.setRemaining(i2);
            }
        } else if (t instanceof CircleCountdownView) {
            ((CircleCountdownView) t).changePercentage((float) i, i2);
        }
    }

    public View b(Context context, IabElementStyle iabElementStyle) {
        return "text".equals(iabElementStyle.getStyle()) ? new TextCountdownView(context) : new CircleCountdownView(context);
    }

    public IabElementStyle c(Context context, IabElementStyle iabElementStyle) {
        return (iabElementStyle == null || !"text".equals(iabElementStyle.getStyle())) ? Assets.defCountDownStyle : Assets.defTextCountDownStyle;
    }
}
