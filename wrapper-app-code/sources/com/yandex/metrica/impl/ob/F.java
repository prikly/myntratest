package com.yandex.metrica.impl.ob;

import android.content.Context;

public class F extends V1<Boolean> {
    public F(Context context, String str) {
        super(context, str, "bool");
    }

    /* access modifiers changed from: protected */
    public Object a(int i) {
        return Boolean.valueOf(this.f5202a.getResources().getBoolean(i));
    }
}
