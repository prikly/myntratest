package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: VideoOnTouchLayout */
public class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a f1832a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f1833b = false;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f1834c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public float f1835d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public float f1836e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f1837f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f1838g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f1839h = true;
    /* access modifiers changed from: private */
    public boolean i = false;
    private final View.OnTouchListener j = new View.OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!d.this.f1832a.o()) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int action = motionEvent.getAction();
                if (action == 0) {
                    d dVar = d.this;
                    boolean unused = dVar.k = dVar.a(motionEvent);
                    float unused2 = d.this.f1835d = x;
                    float unused3 = d.this.f1836e = y;
                    int unused4 = d.this.f1837f = (int) x;
                    int unused5 = d.this.f1838g = (int) y;
                    boolean unused6 = d.this.f1839h = true;
                    if (d.this.f1832a != null && d.this.f1834c && !d.this.f1833b) {
                        d.this.f1832a.a(view, true);
                    }
                } else if (action == 1) {
                    if (Math.abs(x - ((float) d.this.f1837f)) > 20.0f || Math.abs(y - ((float) d.this.f1838g)) > 20.0f) {
                        boolean unused7 = d.this.f1839h = false;
                    }
                    if (!d.this.f1833b) {
                        boolean unused8 = d.this.f1839h = true;
                    }
                    boolean unused9 = d.this.i = false;
                    float unused10 = d.this.f1835d = 0.0f;
                    float unused11 = d.this.f1836e = 0.0f;
                    int unused12 = d.this.f1837f = 0;
                    if (d.this.f1832a != null) {
                        d.this.f1832a.a(view, d.this.f1839h);
                    }
                    boolean unused13 = d.this.k = false;
                } else if (action != 2) {
                    if (action == 3) {
                        boolean unused14 = d.this.k = false;
                    }
                } else if (d.this.f1833b && !d.this.k) {
                    float abs = Math.abs(x - d.this.f1835d);
                    float abs2 = Math.abs(y - d.this.f1836e);
                    if (!d.this.i) {
                        if (abs <= 20.0f && abs2 <= 20.0f) {
                            return true;
                        }
                        boolean unused15 = d.this.i = true;
                    }
                    if (d.this.f1832a != null) {
                        d.this.f1832a.n();
                    }
                    float unused16 = d.this.f1835d = x;
                    float unused17 = d.this.f1836e = y;
                }
                if (d.this.f1833b || !d.this.f1834c) {
                    return true;
                }
                return false;
            } else if (d.this.f1833b || !d.this.f1834c) {
                return true;
            } else {
                return false;
            }
        }
    };
    /* access modifiers changed from: private */
    public boolean k;

    /* compiled from: VideoOnTouchLayout */
    public interface a {
        void a(View view, boolean z);

        void n();

        boolean o();
    }

    public d(a aVar) {
        this.f1832a = aVar;
    }

    public void a(View view) {
        if (view != null) {
            view.setOnTouchListener(this.j);
        }
    }

    public void a(boolean z) {
        this.f1834c = z;
    }

    /* access modifiers changed from: private */
    public boolean a(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int c2 = v.c(m.a().getApplicationContext());
        int d2 = v.d(m.a().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f2 = (float) c2;
        if (rawX > f2 * 0.01f && rawX < f2 * 0.99f) {
            float f3 = (float) d2;
            if (rawY <= 0.01f * f3 || rawY >= f3 * 0.99f) {
                return true;
            }
            return false;
        }
        return true;
    }
}
