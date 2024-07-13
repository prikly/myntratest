package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public abstract class i extends View {

    /* renamed from: a  reason: collision with root package name */
    protected float f14164a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f14165b;

    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f14171e;

        private a(int i) {
            this.f14171e = i;
        }

        public int a() {
            return this.f14171e;
        }
    }

    protected i(Context context) {
        super(context);
        this.f14165b = context;
    }

    public static i a(a aVar, Context context) {
        return aVar.equals(a.INVISIBLE) ? new p(context) : aVar.equals(a.WHITE_ON_TRANSPARENT) ? new q(context) : aVar.equals(a.TRANSPARENT_SKIP) ? new r(context) : new w(context);
    }

    public void a(int i) {
        setViewScale(((float) i) / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f14164a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f2) {
        this.f14164a = f2;
    }
}
