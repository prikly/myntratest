package com.bytedance.sdk.component.adexpress.dynamic.interact.a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.c;

/* compiled from: TapTouch */
public class d implements View.OnTouchListener {

    /* renamed from: c  reason: collision with root package name */
    private static int f18654c = 10;

    /* renamed from: a  reason: collision with root package name */
    private float f18655a;

    /* renamed from: b  reason: collision with root package name */
    private float f18656b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18657d;

    /* renamed from: e  reason: collision with root package name */
    private c f18658e;

    public d(c cVar) {
        this.f18658e = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18655a = motionEvent.getX();
            this.f18656b = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f18655a) >= ((float) f18654c) || Math.abs(y - this.f18656b) >= ((float) f18654c)) {
                    this.f18657d = true;
                }
            } else if (action == 3) {
                this.f18657d = false;
            }
        } else if (this.f18657d) {
            this.f18657d = false;
            return false;
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.f18655a) >= ((float) f18654c) || Math.abs(y2 - this.f18656b) >= ((float) f18654c)) {
                this.f18657d = false;
            } else {
                c cVar = this.f18658e;
                if (cVar != null) {
                    cVar.a();
                }
            }
        }
        return true;
    }
}
