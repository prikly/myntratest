package com.explorestack.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.explorestack.iab.vast.view.IabTextView;

public class f extends g<IabTextView> {
    public f(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    public void a(Context context, IabTextView iabTextView, IabElementStyle iabElementStyle) {
        super.a(context, iabTextView, iabElementStyle);
        iabTextView.setText(!TextUtils.isEmpty(iabElementStyle.getContent()) ? iabElementStyle.getContent() : "Learn more");
    }

    public IabElementStyle c(Context context, IabElementStyle iabElementStyle) {
        return Assets.defCtaStyle;
    }

    /* renamed from: d */
    public IabTextView b(Context context, IabElementStyle iabElementStyle) {
        return new IabTextView(context);
    }
}
