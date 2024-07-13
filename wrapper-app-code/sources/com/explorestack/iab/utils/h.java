package com.explorestack.iab.utils;

import android.content.Context;
import android.view.View;

public class h extends g<CircularProgressBar> {
    public h(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    public IabElementStyle c(Context context, IabElementStyle iabElementStyle) {
        return Assets.defLoadingStyle;
    }

    /* renamed from: d */
    public CircularProgressBar b(Context context, IabElementStyle iabElementStyle) {
        return new CircularProgressBar(context);
    }
}
