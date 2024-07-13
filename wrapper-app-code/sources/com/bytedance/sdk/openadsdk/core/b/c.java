package com.bytedance.sdk.openadsdk.core.b;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.i.e;
import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: InteractionListener */
public abstract class c implements View.OnClickListener, View.OnTouchListener {
    protected static int B = ViewConfiguration.get(m.a()).getScaledTouchSlop();

    /* renamed from: a  reason: collision with root package name */
    private static float f946a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private static float f947b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private static float f948c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    private static float f949d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    private static long f950e = 0;
    protected int A = -1;
    protected boolean C = true;
    protected View D;
    public SparseArray<a> E = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private int f951f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f952g = 0;
    protected float s = -1.0f;
    protected float t = -1.0f;
    protected float u = -1.0f;
    protected float v = -1.0f;
    protected long w = -1;
    protected long x = -1;
    protected int y = -1;
    protected int z = -1024;

    /* access modifiers changed from: protected */
    public abstract void a(View view, float f2, float f3, float f4, float f5, SparseArray<a> sparseArray, boolean z2);

    static {
        if (ViewConfiguration.get(m.a()) != null) {
        }
    }

    public void onClick(View view) {
        if (e.a()) {
            a(view, this.s, this.t, this.u, this.v, this.E, this.C);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2;
        this.z = motionEvent.getDeviceId();
        this.y = motionEvent.getToolType(0);
        this.A = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f951f = (int) motionEvent.getRawX();
            this.f952g = (int) motionEvent.getRawY();
            this.s = motionEvent.getRawX();
            this.t = motionEvent.getRawY();
            this.w = System.currentTimeMillis();
            this.y = motionEvent.getToolType(0);
            this.z = motionEvent.getDeviceId();
            this.A = motionEvent.getSource();
            f950e = System.currentTimeMillis();
            this.C = true;
            this.D = view;
            i = 0;
        } else if (actionMasked == 1) {
            this.u = motionEvent.getRawX();
            this.v = motionEvent.getRawY();
            this.x = System.currentTimeMillis();
            if (Math.abs(this.u - ((float) this.f951f)) >= ((float) m.f1375a) || Math.abs(this.v - ((float) this.f952g)) >= ((float) m.f1375a)) {
                this.C = false;
            }
            Point point = new Point((int) this.u, (int) this.v);
            if (view != null && !b.c(view) && a((View) view.getParent(), point)) {
                return true;
            }
            i = 3;
        } else if (actionMasked != 2) {
            i = actionMasked != 3 ? -1 : 4;
        } else {
            f948c += Math.abs(motionEvent.getX() - f946a);
            f949d += Math.abs(motionEvent.getY() - f947b);
            f946a = motionEvent.getX();
            f947b = motionEvent.getY();
            if (System.currentTimeMillis() - f950e > 200) {
                float f2 = f948c;
                int i3 = B;
                if (f2 > ((float) i3) || f949d > ((float) i3)) {
                    i2 = 1;
                    this.u = motionEvent.getRawX();
                    this.v = motionEvent.getRawY();
                    if (Math.abs(this.u - ((float) this.f951f)) >= ((float) m.f1375a) || Math.abs(this.v - ((float) this.f952g)) >= ((float) m.f1375a)) {
                        this.C = false;
                    }
                    i = i2;
                }
            }
            i2 = 2;
            this.u = motionEvent.getRawX();
            this.v = motionEvent.getRawY();
            this.C = false;
            i = i2;
        }
        this.E.put(motionEvent.getActionMasked(), new a(i, (double) motionEvent.getSize(), (double) motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }

    private boolean a(View view, Point point) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                if (b.c(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    if (!view.isShown() || point.x < iArr[0] || point.x > iArr[0] + childAt.getWidth() || point.y < iArr[1] || point.y > iArr[1] + childAt.getHeight()) {
                        return false;
                    }
                    return true;
                } else if (a(childAt, point)) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /* compiled from: InteractionListener */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f953a = -1;

        /* renamed from: b  reason: collision with root package name */
        public double f954b = -1.0d;

        /* renamed from: c  reason: collision with root package name */
        public double f955c = -1.0d;

        /* renamed from: d  reason: collision with root package name */
        public long f956d = -1;

        public a(int i, double d2, double d3, long j) {
            this.f953a = i;
            this.f954b = d2;
            this.f955c = d3;
            this.f956d = j;
        }
    }
}
