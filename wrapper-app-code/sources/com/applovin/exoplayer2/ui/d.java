package com.applovin.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.k;
import com.applovin.sdk.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

public class d extends View implements k {
    private int A;
    private long B;
    private int C;
    private Rect D;
    private ValueAnimator E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long[] N;
    private boolean[] O;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f13866a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f13867b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f13868c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f13869d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f13870e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f13871f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f13872g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f13873h;
    private final Paint i;
    private final Paint j;
    private final Drawable k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final StringBuilder u;
    private final Formatter v;
    private final Runnable w;
    private final CopyOnWriteArraySet<k.a> x;
    private final Point y;
    private final float z;

    public d(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
        this(context, attributeSet, i2, attributeSet2, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2, int i3) {
        super(context, attributeSet, i2);
        int i4;
        int i5;
        AttributeSet attributeSet3 = attributeSet2;
        this.f13866a = new Rect();
        this.f13867b = new Rect();
        this.f13868c = new Rect();
        this.f13869d = new Rect();
        this.f13870e = new Paint();
        this.f13871f = new Paint();
        this.f13872g = new Paint();
        this.f13873h = new Paint();
        this.i = new Paint();
        Paint paint = new Paint();
        this.j = paint;
        paint.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet<>();
        this.y = new Point();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.z = f2;
        this.t = a(f2, -50);
        int a2 = a(this.z, 4);
        int a3 = a(this.z, 26);
        int a4 = a(this.z, 4);
        int a5 = a(this.z, 12);
        int a6 = a(this.z, 0);
        int a7 = a(this.z, 16);
        if (attributeSet3 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, R.styleable.AppLovinDefaultTimeBar, i2, i3);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.k = drawable;
                if (drawable != null) {
                    a(drawable);
                    a3 = Math.max(this.k.getMinimumHeight(), a3);
                }
                this.l = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_bar_height, a2);
                this.m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, a3);
                this.n = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.o = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, a4);
                this.p = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, a5);
                this.q = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, a6);
                this.r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, a7);
                int i6 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i7 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i8 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_buffered_color, -855638017);
                int i9 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, 872415231);
                int i10 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, -1291845888);
                int i11 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, 872414976);
                this.f13870e.setColor(i6);
                this.j.setColor(i7);
                this.f13871f.setColor(i8);
                this.f13872g.setColor(i9);
                this.f13873h.setColor(i10);
                this.i.setColor(i11);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.l = a2;
            this.m = a3;
            this.n = 0;
            this.o = a4;
            this.p = a5;
            this.q = a6;
            this.r = a7;
            this.f13870e.setColor(-1);
            this.j.setColor(-1);
            this.f13871f.setColor(-855638017);
            this.f13872g.setColor(872415231);
            this.f13873h.setColor(-1291845888);
            this.i.setColor(872414976);
            this.k = null;
        }
        this.u = new StringBuilder();
        this.v = new Formatter(this.u, Locale.getDefault());
        this.w = new Runnable() {
            public final void run() {
                d.this.c();
            }
        };
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            i5 = drawable2.getMinimumWidth();
            i4 = 1;
        } else {
            i4 = 1;
            i5 = Math.max(this.q, Math.max(this.p, this.r));
        }
        this.s = (i5 + i4) / 2;
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.this.a(valueAnimator);
            }
        });
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int a(float f2, int i2) {
        return (int) ((((float) i2) * f2) + 0.5f);
    }

    private Point a(MotionEvent motionEvent) {
        this.y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.y;
    }

    private void a() {
        this.f13868c.set(this.f13867b);
        this.f13869d.set(this.f13867b);
        long j2 = this.H ? this.I : this.K;
        if (this.J > 0) {
            this.f13868c.right = Math.min(this.f13867b.left + ((int) ((((long) this.f13867b.width()) * this.L) / this.J)), this.f13867b.right);
            this.f13869d.right = Math.min(this.f13867b.left + ((int) ((((long) this.f13867b.width()) * j2) / this.J)), this.f13867b.right);
        } else {
            this.f13868c.right = this.f13867b.left;
            this.f13869d.right = this.f13867b.left;
        }
        invalidate(this.f13866a);
    }

    private void a(float f2) {
        this.f13869d.right = ai.a((int) f2, this.f13867b.left, this.f13867b.right);
    }

    private void a(int i2, int i3) {
        Rect rect = this.D;
        if (rect == null || rect.width() != i2 || this.D.height() != i3) {
            Rect rect2 = new Rect(0, 0, i2, i3);
            this.D = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
    }

    private void a(long j2) {
        this.I = j2;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<k.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(this, j2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f13866a);
    }

    private void a(Canvas canvas) {
        int height = this.f13867b.height();
        int centerY = this.f13867b.centerY() - (height / 2);
        int i2 = height + centerY;
        if (this.J <= 0) {
            canvas.drawRect((float) this.f13867b.left, (float) centerY, (float) this.f13867b.right, (float) i2, this.f13872g);
            return;
        }
        int i3 = this.f13868c.left;
        int i4 = this.f13868c.right;
        int max = Math.max(Math.max(this.f13867b.left, i4), this.f13869d.right);
        if (max < this.f13867b.right) {
            canvas.drawRect((float) max, (float) centerY, (float) this.f13867b.right, (float) i2, this.f13872g);
        }
        int max2 = Math.max(i3, this.f13869d.right);
        if (i4 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i4, (float) i2, this.f13871f);
        }
        if (this.f13869d.width() > 0) {
            canvas.drawRect((float) this.f13869d.left, (float) centerY, (float) this.f13869d.right, (float) i2, this.f13870e);
        }
        if (this.M != 0) {
            long[] jArr = (long[]) a.b(this.N);
            boolean[] zArr = (boolean[]) a.b(this.O);
            int i5 = this.o / 2;
            for (int i6 = 0; i6 < this.M; i6++) {
                int min = this.f13867b.left + Math.min(this.f13867b.width() - this.o, Math.max(0, ((int) ((((long) this.f13867b.width()) * ai.a(jArr[i6], 0, this.J)) / this.J)) - i5));
                canvas.drawRect((float) min, (float) centerY, (float) (min + this.o), (float) i2, zArr[i6] ? this.i : this.f13873h);
            }
        }
    }

    private void a(boolean z2) {
        removeCallbacks(this.w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<k.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.I, z2);
        }
    }

    private boolean a(float f2, float f3) {
        return this.f13866a.contains((int) f2, (int) f3);
    }

    private boolean a(Drawable drawable) {
        return ai.f13525a >= 23 && a(drawable, getLayoutDirection());
    }

    private static boolean a(Drawable drawable, int i2) {
        return ai.f13525a >= 23 && drawable.setLayoutDirection(i2);
    }

    private static int b(float f2, int i2) {
        return (int) (((float) i2) / f2);
    }

    private void b() {
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && this.k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void b(long j2) {
        if (this.I != j2) {
            this.I = j2;
            Iterator<k.a> it = this.x.iterator();
            while (it.hasNext()) {
                it.next().b(this, j2);
            }
        }
    }

    private void b(Canvas canvas) {
        if (this.J > 0) {
            int a2 = ai.a(this.f13869d.right, this.f13869d.left, this.f13867b.right);
            int centerY = this.f13869d.centerY();
            Drawable drawable = this.k;
            if (drawable == null) {
                canvas.drawCircle((float) a2, (float) centerY, (float) ((int) ((((float) ((this.H || isFocused()) ? this.r : isEnabled() ? this.p : this.q)) * this.F) / 2.0f)), this.j);
                return;
            }
            int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.F)) / 2;
            int intrinsicHeight = ((int) (((float) this.k.getIntrinsicHeight()) * this.F)) / 2;
            this.k.setBounds(a2 - intrinsicWidth, centerY - intrinsicHeight, a2 + intrinsicWidth, centerY + intrinsicHeight);
            this.k.draw(canvas);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(false);
    }

    private boolean c(long j2) {
        if (this.J <= 0) {
            return false;
        }
        long j3 = this.H ? this.I : this.K;
        long a2 = ai.a(j3 + j2, 0, this.J);
        if (a2 == j3) {
            return false;
        }
        if (!this.H) {
            a(a2);
        } else {
            b(a2);
        }
        a();
        return true;
    }

    private long getPositionIncrement() {
        long j2 = this.B;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        long j3 = this.J;
        if (j3 == -9223372036854775807L) {
            return 0;
        }
        return j3 / ((long) this.A);
    }

    private String getProgressText() {
        return ai.a(this.u, this.v, this.K);
    }

    private long getScrubberPosition() {
        if (this.f13867b.width() <= 0 || this.J == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f13869d.width()) * this.J) / ((long) this.f13867b.width());
    }

    public void a(k.a aVar) {
        a.b(aVar);
        this.x.add(aVar);
    }

    public void a(long[] jArr, boolean[] zArr, int i2) {
        a.a(i2 == 0 || !(jArr == null || zArr == null));
        this.M = i2;
        this.N = jArr;
        this.O = zArr;
        a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        b();
    }

    public long getPreferredUpdateDelay() {
        int b2 = b(this.z, this.f13867b.width());
        if (b2 != 0) {
            long j2 = this.J;
            if (!(j2 == 0 || j2 == -9223372036854775807L)) {
                return j2 / ((long) b2);
            }
        }
        return Long.MAX_VALUE;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        a(canvas);
        b(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.H && !z2) {
            a(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J > 0) {
            if (ai.f13525a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                return;
            }
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (c(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.w);
        postDelayed(r4.w, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.c(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.H
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.a((boolean) r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.d.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        int i10 = this.G ? 0 : this.s;
        if (this.n == 1) {
            i7 = (i9 - getPaddingBottom()) - this.m;
            int i11 = this.l;
            i6 = ((i9 - getPaddingBottom()) - i11) - Math.max(i10 - (i11 / 2), 0);
        } else {
            i7 = (i9 - this.m) / 2;
            i6 = (i9 - this.l) / 2;
        }
        this.f13866a.set(paddingLeft, i7, paddingRight, this.m + i7);
        this.f13867b.set(this.f13866a.left + i10, i6, this.f13866a.right - i10, this.l + i6);
        if (ai.f13525a >= 29) {
            a(i8, i9);
        }
        a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 0) {
            size = this.m;
        } else if (mode != 1073741824) {
            size = Math.min(this.m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), size);
        b();
    }

    public void onRtlPropertiesChanged(int i2) {
        Drawable drawable = this.k;
        if (drawable != null && a(drawable, i2)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x006d
            long r2 = r7.J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            goto L_0x006d
        L_0x0010:
            android.graphics.Point r0 = r7.a((android.view.MotionEvent) r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x005a
            r5 = 3
            if (r3 == r4) goto L_0x004b
            r6 = 2
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x004b
            goto L_0x006d
        L_0x0028:
            boolean r8 = r7.H
            if (r8 == 0) goto L_0x006d
            int r8 = r7.t
            if (r0 >= r8) goto L_0x0037
            int r8 = r7.C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            goto L_0x003a
        L_0x0037:
            r7.C = r2
            float r8 = (float) r2
        L_0x003a:
            r7.a((float) r8)
            long r0 = r7.getScrubberPosition()
            r7.b((long) r0)
        L_0x0044:
            r7.a()
            r7.invalidate()
            return r4
        L_0x004b:
            boolean r0 = r7.H
            if (r0 == 0) goto L_0x006d
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0056
            r1 = 1
        L_0x0056:
            r7.a((boolean) r1)
            return r4
        L_0x005a:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.a((float) r8, (float) r0)
            if (r0 == 0) goto L_0x006d
            r7.a((float) r8)
            long r0 = r7.getScrubberPosition()
            r7.a((long) r0)
            goto L_0x0044
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (c(getPositionIncrement()) != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (c(-getPositionIncrement()) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performAccessibilityAction(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            boolean r8 = super.performAccessibilityAction(r7, r8)
            r0 = 1
            if (r8 == 0) goto L_0x0008
            return r0
        L_0x0008:
            long r1 = r6.J
            r3 = 0
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0012
            return r8
        L_0x0012:
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r7 != r1) goto L_0x0025
            long r1 = r6.getPositionIncrement()
            long r1 = -r1
            boolean r7 = r6.c(r1)
            if (r7 == 0) goto L_0x0034
        L_0x0021:
            r6.a((boolean) r8)
            goto L_0x0034
        L_0x0025:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r7 != r1) goto L_0x0039
            long r1 = r6.getPositionIncrement()
            boolean r7 = r6.c(r1)
            if (r7 == 0) goto L_0x0034
            goto L_0x0021
        L_0x0034:
            r7 = 4
            r6.sendAccessibilityEvent(r7)
            return r0
        L_0x0039:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.d.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setAdMarkerColor(int i2) {
        this.f13873h.setColor(i2);
        invalidate(this.f13866a);
    }

    public void setBufferedColor(int i2) {
        this.f13871f.setColor(i2);
        invalidate(this.f13866a);
    }

    public void setBufferedPosition(long j2) {
        if (this.L != j2) {
            this.L = j2;
            a();
        }
    }

    public void setDuration(long j2) {
        if (this.J != j2) {
            this.J = j2;
            if (this.H && j2 == -9223372036854775807L) {
                a(true);
            }
            a();
        }
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (this.H && !z2) {
            a(true);
        }
    }

    public void setKeyCountIncrement(int i2) {
        a.a(i2 > 0);
        this.A = i2;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j2) {
        a.a(j2 > 0);
        this.A = -1;
        this.B = j2;
    }

    public void setPlayedAdMarkerColor(int i2) {
        this.i.setColor(i2);
        invalidate(this.f13866a);
    }

    public void setPlayedColor(int i2) {
        this.f13870e.setColor(i2);
        invalidate(this.f13866a);
    }

    public void setPosition(long j2) {
        if (this.K != j2) {
            this.K = j2;
            setContentDescription(getProgressText());
            a();
        }
    }

    public void setScrubberColor(int i2) {
        this.j.setColor(i2);
        invalidate(this.f13866a);
    }

    public void setUnplayedColor(int i2) {
        this.f13872g.setColor(i2);
        invalidate(this.f13866a);
    }
}
