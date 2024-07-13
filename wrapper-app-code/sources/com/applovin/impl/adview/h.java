package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.webkit.WebView;

public class h extends WebView {

    /* renamed from: a  reason: collision with root package name */
    private PointF f14163a = new PointF();

    public h(Context context) {
        super(context);
    }

    public PointF getAndClearLastClickLocation() {
        PointF pointF = this.f14163a;
        this.f14163a = new PointF();
        return pointF;
    }

    public PointF getLastClickLocation() {
        return this.f14163a;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f14163a = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        return super.onTouchEvent(motionEvent);
    }
}
