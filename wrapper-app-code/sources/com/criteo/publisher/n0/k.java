package com.criteo.publisher.n0;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.model.AdSize;

/* compiled from: DeviceUtil */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2900a;

    public k(Context context) {
        h.b(getClass());
        this.f2900a = context;
    }

    public boolean c() {
        DisplayMetrics b2 = b();
        return ((float) Math.min(b2.widthPixels, b2.heightPixels)) >= b2.density * 600.0f;
    }

    public AdSize a() {
        DisplayMetrics b2 = b();
        return new AdSize(Math.round(((float) b2.widthPixels) / b2.density), Math.round(((float) b2.heightPixels) / b2.density));
    }

    private DisplayMetrics b() {
        return this.f2900a.getResources().getDisplayMetrics();
    }

    public boolean d() {
        return Build.VERSION.SDK_INT >= 19;
    }
}
