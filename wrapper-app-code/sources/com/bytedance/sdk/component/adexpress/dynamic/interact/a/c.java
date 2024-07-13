package com.bytedance.sdk.component.adexpress.dynamic.interact.a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.c.b;

/* compiled from: SlideUpTouch */
public class c implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private float f18649a;

    /* renamed from: b  reason: collision with root package name */
    private float f18650b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f18651c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.interact.c f18652d;

    /* renamed from: e  reason: collision with root package name */
    private int f18653e;

    public c(com.bytedance.sdk.component.adexpress.dynamic.interact.c cVar, int i) {
        this.f18652d = cVar;
        this.f18653e = i;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.interact.c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18649a = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.f18650b = y;
                if (Math.abs(y - this.f18649a) > 10.0f) {
                    this.f18651c = true;
                }
            }
        } else if (!this.f18651c) {
            return false;
        } else {
            int b2 = b.b(com.bytedance.sdk.component.adexpress.c.a(), Math.abs(this.f18650b - this.f18649a));
            if (this.f18650b - this.f18649a < 0.0f && b2 > this.f18653e && (cVar = this.f18652d) != null) {
                cVar.a();
            }
        }
        return true;
    }
}
