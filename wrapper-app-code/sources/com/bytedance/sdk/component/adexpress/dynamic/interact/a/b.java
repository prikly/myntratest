package com.bytedance.sdk.component.adexpress.dynamic.interact.a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.c;

/* compiled from: SlideRightTouch */
public class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private float f18645a;

    /* renamed from: b  reason: collision with root package name */
    private float f18646b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f18647c;

    /* renamed from: d  reason: collision with root package name */
    private c f18648d;

    public b(c cVar) {
        this.f18648d = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18645a = motionEvent.getX();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                this.f18646b = x;
                if (Math.abs(x - this.f18645a) > 10.0f) {
                    this.f18647c = true;
                }
            }
        } else if (!this.f18647c) {
            return false;
        } else {
            int b2 = com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.c.a(), Math.abs(this.f18646b - this.f18645a));
            if (this.f18646b > this.f18645a && b2 > 5 && (cVar = this.f18648d) != null) {
                cVar.a();
            }
        }
        return true;
    }
}
