package com.appodeal.ads;

import android.text.Editable;
import android.text.TextWatcher;
import com.appodeal.ads.utils.h;

public final class z0 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f17744a;

    public z0(h hVar) {
        this.f17744a = hVar;
    }

    public final void afterTextChanged(Editable editable) {
        this.f17744a.f17519c.filter(editable.toString());
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
