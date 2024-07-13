package com.explorestack.iab.utils;

import android.content.Context;
import android.view.View;
import com.explorestack.iab.vast.view.CircleCountdownView;
import com.explorestack.iab.vast.view.LinearCountdownView;
import com.explorestack.iab.vast.view.TextCountdownView;

public class j extends g<View> {
    public j(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    public void a(float f2, int i, int i2) {
        IabElementStyle iabElementStyle = this.f3109c;
        if (iabElementStyle != null) {
            int i3 = 0;
            boolean z = iabElementStyle.getStyle() != null && this.f3109c.getStyle().endsWith("reverse");
            T t = this.f3108b;
            if (t instanceof TextCountdownView) {
                TextCountdownView textCountdownView = (TextCountdownView) t;
                if (i2 == 0) {
                    textCountdownView.setText("");
                    return;
                }
                if (z) {
                    i = i2 - i;
                }
                textCountdownView.setRemaining(Math.max(1, i));
            } else if (t instanceof CircleCountdownView) {
                CircleCountdownView circleCountdownView = (CircleCountdownView) t;
                if (z) {
                    if (i2 != 0) {
                        i3 = Math.max(1, i2 - i);
                    }
                    circleCountdownView.changePercentage(f2, i3);
                    return;
                }
                circleCountdownView.changePercentage(100.0f - f2, i);
            } else if (t instanceof LinearCountdownView) {
                LinearCountdownView linearCountdownView = (LinearCountdownView) t;
                if (z) {
                    f2 = 100.0f - f2;
                }
                linearCountdownView.changePercentage(f2);
            }
        }
    }

    public View b(Context context, IabElementStyle iabElementStyle) {
        return ("text".equals(iabElementStyle.getStyle()) || "text-reverse".equals(iabElementStyle.getStyle())) ? new TextCountdownView(context) : ("circular".equals(iabElementStyle.getStyle()) || "circular-reverse".equals(iabElementStyle.getStyle())) ? new CircleCountdownView(context) : new LinearCountdownView(context);
    }

    public IabElementStyle c(Context context, IabElementStyle iabElementStyle) {
        if (iabElementStyle != null) {
            if ("text".equals(iabElementStyle.getStyle()) || "text-reverse".equals(iabElementStyle.getStyle())) {
                return Assets.defTextProgressStyle;
            }
            if ("circular".equals(iabElementStyle.getStyle()) || "circular-reverse".equals(iabElementStyle.getStyle())) {
                return Assets.defCountDownProgressStyle;
            }
        }
        return Assets.defLinearProgressStyle;
    }
}
