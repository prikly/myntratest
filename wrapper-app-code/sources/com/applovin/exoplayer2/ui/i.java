package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;

final class i {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* renamed from: a  reason: collision with root package name */
    private final float f13905a;

    /* renamed from: b  reason: collision with root package name */
    private final float f13906b;

    /* renamed from: c  reason: collision with root package name */
    private final float f13907c;

    /* renamed from: d  reason: collision with root package name */
    private final float f13908d;

    /* renamed from: e  reason: collision with root package name */
    private final float f13909e;

    /* renamed from: f  reason: collision with root package name */
    private final TextPaint f13910f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f13911g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f13912h;
    private CharSequence i;
    private Layout.Alignment j;
    private Bitmap k;
    private float l;
    private int m;
    private int n;
    private float o;
    private int p;
    private float q;
    private float r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private float x;
    private float y;
    private float z;

    public i(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f13909e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f13908d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f13905a = round;
        this.f13906b = round;
        this.f13907c = round;
        TextPaint textPaint = new TextPaint();
        this.f13910f = textPaint;
        textPaint.setAntiAlias(true);
        this.f13910f.setSubpixelText(true);
        Paint paint = new Paint();
        this.f13911g = paint;
        paint.setAntiAlias(true);
        this.f13911g.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f13912h = paint2;
        paint2.setAntiAlias(true);
        this.f13912h.setFilterBitmap(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r26 = this;
            r0 = r26
            java.lang.CharSequence r1 = r0.i
            boolean r2 = r1 instanceof android.text.SpannableStringBuilder
            if (r2 == 0) goto L_0x000b
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            goto L_0x0012
        L_0x000b:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r2 = r0.i
            r1.<init>(r2)
        L_0x0012:
            int r2 = r0.C
            int r3 = r0.A
            int r2 = r2 - r3
            int r3 = r0.D
            int r4 = r0.B
            int r11 = r3 - r4
            android.text.TextPaint r3 = r0.f13910f
            float r4 = r0.x
            r3.setTextSize(r4)
            float r3 = r0.x
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r12 = (int) r3
            int r13 = r12 * 2
            int r3 = r2 - r13
            float r4 = r0.q
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
        L_0x003f:
            r15 = r3
            java.lang.String r10 = "SubtitlePainter"
            if (r15 > 0) goto L_0x004a
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            com.applovin.exoplayer2.l.q.c(r10, r1)
            return
        L_0x004a:
            float r3 = r0.y
            r16 = 0
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0064
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r5 = r0.y
            int r5 = (int) r5
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x0064:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r1)
            int r3 = r0.w
            r7 = 1
            if (r3 != r7) goto L_0x0087
            int r3 = r8.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r5 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r3 = r8.getSpans(r9, r3, r5)
            android.text.style.ForegroundColorSpan[] r3 = (android.text.style.ForegroundColorSpan[]) r3
            int r5 = r3.length
            r6 = 0
        L_0x007c:
            if (r6 >= r5) goto L_0x0087
            r7 = r3[r6]
            r8.removeSpan(r7)
            int r6 = r6 + 1
            r7 = 1
            goto L_0x007c
        L_0x0087:
            int r3 = r0.t
            int r3 = android.graphics.Color.alpha(r3)
            r7 = 2
            if (r3 <= 0) goto L_0x00b4
            int r3 = r0.w
            if (r3 == 0) goto L_0x00a6
            if (r3 != r7) goto L_0x0097
            goto L_0x00a6
        L_0x0097:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.t
            r3.<init>(r5)
            int r5 = r8.length()
            r8.setSpan(r3, r9, r5, r4)
            goto L_0x00b4
        L_0x00a6:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.t
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x00b4:
            android.text.Layout$Alignment r3 = r0.j
            if (r3 != 0) goto L_0x00ba
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00ba:
            r21 = r3
            android.text.StaticLayout r6 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f13910f
            float r4 = r0.f13908d
            float r3 = r0.f13909e
            r18 = 1
            r19 = r3
            r3 = r6
            r20 = r4
            r4 = r1
            r14 = r6
            r6 = r15
            r7 = r21
            r23 = r8
            r8 = r20
            r25 = r12
            r12 = 0
            r9 = r19
            r12 = r10
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.E = r14
            int r3 = r14.getHeight()
            android.text.StaticLayout r4 = r0.E
            int r4 = r4.getLineCount()
            r5 = 0
            r9 = 0
        L_0x00ed:
            if (r9 >= r4) goto L_0x0102
            android.text.StaticLayout r6 = r0.E
            float r6 = r6.getLineWidth(r9)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r5 = java.lang.Math.max(r6, r5)
            int r9 = r9 + 1
            goto L_0x00ed
        L_0x0102:
            float r4 = r0.q
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x010e
            if (r5 >= r15) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r15 = r5
        L_0x010f:
            int r15 = r15 + r13
            float r4 = r0.o
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x013d
            float r2 = (float) r2
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r0.A
            int r2 = r2 + r4
            int r4 = r0.p
            r5 = 1
            r6 = 2
            if (r4 == r5) goto L_0x012b
            if (r4 == r6) goto L_0x0129
            goto L_0x012f
        L_0x0129:
            int r2 = r2 - r15
            goto L_0x012f
        L_0x012b:
            int r2 = r2 * 2
            int r2 = r2 - r15
            int r2 = r2 / r6
        L_0x012f:
            int r4 = r0.A
            int r2 = java.lang.Math.max(r2, r4)
            int r15 = r15 + r2
            int r4 = r0.C
            int r4 = java.lang.Math.min(r15, r4)
            goto L_0x0146
        L_0x013d:
            r5 = 1
            r6 = 2
            int r2 = r2 - r15
            int r2 = r2 / r6
            int r4 = r0.A
            int r2 = r2 + r4
            int r4 = r2 + r15
        L_0x0146:
            int r20 = r4 - r2
            if (r20 > 0) goto L_0x0150
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            com.applovin.exoplayer2.l.q.c(r12, r1)
            return
        L_0x0150:
            float r4 = r0.l
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x01af
            int r7 = r0.m
            if (r7 != 0) goto L_0x0173
            float r7 = (float) r11
            float r7 = r7 * r4
            int r4 = java.lang.Math.round(r7)
            int r7 = r0.B
            int r4 = r4 + r7
            int r7 = r0.n
            if (r7 != r6) goto L_0x016c
            goto L_0x019f
        L_0x016c:
            if (r7 != r5) goto L_0x01a0
            int r4 = r4 * 2
            int r4 = r4 - r3
            int r4 = r4 / r6
            goto L_0x01a0
        L_0x0173:
            android.text.StaticLayout r4 = r0.E
            r5 = 0
            int r4 = r4.getLineBottom(r5)
            android.text.StaticLayout r6 = r0.E
            int r5 = r6.getLineTop(r5)
            int r4 = r4 - r5
            float r5 = r0.l
            int r6 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r6 < 0) goto L_0x0192
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.B
            int r4 = r4 + r5
            goto L_0x01a0
        L_0x0192:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.D
            int r4 = r4 + r5
        L_0x019f:
            int r4 = r4 - r3
        L_0x01a0:
            int r5 = r4 + r3
            int r6 = r0.D
            if (r5 <= r6) goto L_0x01a9
            int r4 = r6 - r3
            goto L_0x01b9
        L_0x01a9:
            int r3 = r0.B
            if (r4 >= r3) goto L_0x01b9
            r11 = r3
            goto L_0x01ba
        L_0x01af:
            int r4 = r0.D
            int r4 = r4 - r3
            float r3 = (float) r11
            float r5 = r0.z
            float r3 = r3 * r5
            int r3 = (int) r3
            int r4 = r4 - r3
        L_0x01b9:
            r11 = r4
        L_0x01ba:
            android.text.StaticLayout r12 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f13910f
            float r8 = r0.f13908d
            float r9 = r0.f13909e
            r10 = 1
            r3 = r12
            r4 = r1
            r6 = r20
            r7 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.E = r12
            android.text.StaticLayout r1 = new android.text.StaticLayout
            android.text.TextPaint r3 = r0.f13910f
            float r4 = r0.f13908d
            float r5 = r0.f13909e
            r24 = 1
            r17 = r1
            r18 = r23
            r19 = r3
            r22 = r4
            r23 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.F = r1
            r0.G = r2
            r0.H = r11
            r1 = r25
            r0.I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.i.a():void");
    }

    private void a(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate((float) this.G, (float) this.H);
            if (Color.alpha(this.u) > 0) {
                this.f13911g.setColor(this.u);
                canvas.drawRect((float) (-this.I), 0.0f, (float) (staticLayout.getWidth() + this.I), (float) staticLayout.getHeight(), this.f13911g);
            }
            int i2 = this.w;
            boolean z2 = true;
            if (i2 == 1) {
                this.f13910f.setStrokeJoin(Paint.Join.ROUND);
                this.f13910f.setStrokeWidth(this.f13905a);
                this.f13910f.setColor(this.v);
                this.f13910f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i2 == 2) {
                TextPaint textPaint = this.f13910f;
                float f2 = this.f13906b;
                float f3 = this.f13907c;
                textPaint.setShadowLayer(f2, f3, f3, this.v);
            } else if (i2 == 3 || i2 == 4) {
                if (this.w != 3) {
                    z2 = false;
                }
                int i3 = -1;
                int i4 = z2 ? -1 : this.v;
                if (z2) {
                    i3 = this.v;
                }
                float f4 = this.f13906b / 2.0f;
                this.f13910f.setColor(this.s);
                this.f13910f.setStyle(Paint.Style.FILL);
                float f5 = -f4;
                this.f13910f.setShadowLayer(this.f13906b, f5, f5, i4);
                staticLayout2.draw(canvas);
                this.f13910f.setShadowLayer(this.f13906b, f4, f4, i3);
            }
            this.f13910f.setColor(this.s);
            this.f13910f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f13910f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    private void a(Canvas canvas, boolean z2) {
        if (z2) {
            a(canvas);
            return;
        }
        a.b(this.J);
        a.b(this.k);
        b(canvas);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x002c
            goto L_0x0038
        L_0x002c:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
        L_0x0038:
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            int r3 = r7.p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L_0x0047
            float r3 = (float) r1
        L_0x0045:
            float r2 = r2 - r3
            goto L_0x004d
        L_0x0047:
            if (r3 != r5) goto L_0x004d
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L_0x0045
        L_0x004d:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.n
            if (r3 != r6) goto L_0x0058
            float r3 = (float) r0
        L_0x0056:
            float r4 = r4 - r3
            goto L_0x005e
        L_0x0058:
            if (r3 != r5) goto L_0x005e
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L_0x0056
        L_0x005e:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.i.b():void");
    }

    private void b(Canvas canvas) {
        canvas.drawBitmap(this.k, (Rect) null, this.J, this.f13912h);
    }

    public void a(com.applovin.exoplayer2.i.a aVar, c cVar, float f2, float f3, float f4, Canvas canvas, int i2, int i3, int i4, int i5) {
        boolean z2 = aVar.f12911e == null;
        int i6 = -16777216;
        if (z2) {
            if (!TextUtils.isEmpty(aVar.f12908b)) {
                i6 = aVar.m ? aVar.n : cVar.f13862d;
            } else {
                return;
            }
        }
        if (a(this.i, aVar.f12908b) && ai.a((Object) this.j, (Object) aVar.f12909c) && this.k == aVar.f12911e && this.l == aVar.f12912f && this.m == aVar.f12913g && ai.a((Object) Integer.valueOf(this.n), (Object) Integer.valueOf(aVar.f12914h)) && this.o == aVar.i && ai.a((Object) Integer.valueOf(this.p), (Object) Integer.valueOf(aVar.j)) && this.q == aVar.k && this.r == aVar.l && this.s == cVar.f13860b && this.t == cVar.f13861c && this.u == i6 && this.w == cVar.f13863e && this.v == cVar.f13864f && ai.a((Object) this.f13910f.getTypeface(), (Object) cVar.f13865g) && this.x == f2 && this.y == f3 && this.z == f4 && this.A == i2 && this.B == i3 && this.C == i4 && this.D == i5) {
            a(canvas, z2);
            return;
        }
        this.i = aVar.f12908b;
        this.j = aVar.f12909c;
        this.k = aVar.f12911e;
        this.l = aVar.f12912f;
        this.m = aVar.f12913g;
        this.n = aVar.f12914h;
        this.o = aVar.i;
        this.p = aVar.j;
        this.q = aVar.k;
        this.r = aVar.l;
        this.s = cVar.f13860b;
        this.t = cVar.f13861c;
        this.u = i6;
        this.w = cVar.f13863e;
        this.v = cVar.f13864f;
        this.f13910f.setTypeface(cVar.f13865g);
        this.x = f2;
        this.y = f3;
        this.z = f4;
        this.A = i2;
        this.B = i3;
        this.C = i4;
        this.D = i5;
        if (z2) {
            a.b(this.i);
            a();
        } else {
            a.b(this.k);
            b();
        }
        a(canvas, z2);
    }
}
