package com.bytedance.sdk.component.adexpress.dynamic.interact.a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.dynamic.interact.c;

/* compiled from: LongPressTouch */
public class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private float f18639a;

    /* renamed from: b  reason: collision with root package name */
    private float f18640b;

    /* renamed from: c  reason: collision with root package name */
    private long f18641c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18642d;

    /* renamed from: e  reason: collision with root package name */
    private InteractViewContainer f18643e;

    /* renamed from: f  reason: collision with root package name */
    private c f18644f;

    public a(InteractViewContainer interactViewContainer, c cVar) {
        this.f18643e = interactViewContainer;
        this.f18644f = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18641c = System.currentTimeMillis();
            this.f18639a = motionEvent.getX();
            this.f18640b = motionEvent.getY();
            this.f18643e.c();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f18639a) >= b.a(com.bytedance.sdk.component.adexpress.c.a(), 10.0f) || Math.abs(y - this.f18640b) >= b.a(com.bytedance.sdk.component.adexpress.c.a(), 10.0f)) {
                    this.f18642d = true;
                    this.f18643e.d();
                }
            }
        } else if (this.f18642d) {
            return false;
        } else {
            if (System.currentTimeMillis() - this.f18641c >= 1500) {
                c cVar = this.f18644f;
                if (cVar != null) {
                    cVar.a();
                }
            } else {
                this.f18643e.d();
            }
        }
        return true;
    }
}
