package com.explorestack.iab.utils;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import kotlin.KotlinVersion;

public class b extends Drawable implements Animatable {

    /* renamed from: g  reason: collision with root package name */
    public static final Interpolator f3084g = new LinearInterpolator();

    /* renamed from: h  reason: collision with root package name */
    public static final Interpolator f3085h = new a();
    public static final int[] i = {-16777216};

    /* renamed from: a  reason: collision with root package name */
    public final d f3086a;

    /* renamed from: b  reason: collision with root package name */
    public float f3087b;

    /* renamed from: c  reason: collision with root package name */
    public Resources f3088c;

    /* renamed from: d  reason: collision with root package name */
    public Animator f3089d;

    /* renamed from: e  reason: collision with root package name */
    public float f3090e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3091f;

    public class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public final float[] f3092a = {0.0f, 1.0E-4f, 2.0E-4f, 5.0E-4f, 9.0E-4f, 0.0014f, 0.002f, 0.0027f, 0.0036f, 0.0046f, 0.0058f, 0.0071f, 0.0085f, 0.0101f, 0.0118f, 0.0137f, 0.0158f, 0.018f, 0.0205f, 0.0231f, 0.0259f, 0.0289f, 0.0321f, 0.0355f, 0.0391f, 0.043f, 0.0471f, 0.0514f, 0.056f, 0.0608f, 0.066f, 0.0714f, 0.0771f, 0.083f, 0.0893f, 0.0959f, 0.1029f, 0.1101f, 0.1177f, 0.1257f, 0.1339f, 0.1426f, 0.1516f, 0.161f, 0.1707f, 0.1808f, 0.1913f, 0.2021f, 0.2133f, 0.2248f, 0.2366f, 0.2487f, 0.2611f, 0.2738f, 0.2867f, 0.2998f, 0.3131f, 0.3265f, 0.34f, 0.3536f, 0.3673f, 0.381f, 0.3946f, 0.4082f, 0.4217f, 0.4352f, 0.4485f, 0.4616f, 0.4746f, 0.4874f, 0.5f, 0.5124f, 0.5246f, 0.5365f, 0.5482f, 0.5597f, 0.571f, 0.582f, 0.5928f, 0.6033f, 0.6136f, 0.6237f, 0.6335f, 0.6431f, 0.6525f, 0.6616f, 0.6706f, 0.6793f, 0.6878f, 0.6961f, 0.7043f, 0.7122f, 0.7199f, 0.7275f, 0.7349f, 0.7421f, 0.7491f, 0.7559f, 0.7626f, 0.7692f, 0.7756f, 0.7818f, 0.7879f, 0.7938f, 0.7996f, 0.8053f, 0.8108f, 0.8162f, 0.8215f, 0.8266f, 0.8317f, 0.8366f, 0.8414f, 0.8461f, 0.8507f, 0.8551f, 0.8595f, 0.8638f, 0.8679f, 0.872f, 0.876f, 0.8798f, 0.8836f, 0.8873f, 0.8909f, 0.8945f, 0.8979f, 0.9013f, 0.9046f, 0.9078f, 0.9109f, 0.9139f, 0.9169f, 0.9198f, 0.9227f, 0.9254f, 0.9281f, 0.9307f, 0.9333f, 0.9358f, 0.9382f, 0.9406f, 0.9429f, 0.9452f, 0.9474f, 0.9495f, 0.9516f, 0.9536f, 0.9556f, 0.9575f, 0.9594f, 0.9612f, 0.9629f, 0.9646f, 0.9663f, 0.9679f, 0.9695f, 0.971f, 0.9725f, 0.9739f, 0.9753f, 0.9766f, 0.9779f, 0.9791f, 0.9803f, 0.9815f, 0.9826f, 0.9837f, 0.9848f, 0.9858f, 0.9867f, 0.9877f, 0.9885f, 0.9894f, 0.9902f, 0.991f, 0.9917f, 0.9924f, 0.9931f, 0.9937f, 0.9944f, 0.9949f, 0.9955f, 0.996f, 0.9964f, 0.9969f, 0.9973f, 0.9977f, 0.998f, 0.9984f, 0.9986f, 0.9989f, 0.9991f, 0.9993f, 0.9995f, 0.9997f, 0.9998f, 0.9999f, 0.9999f, 1.0f, 1.0f};

        /* renamed from: b  reason: collision with root package name */
        public final float f3093b = (1.0f / ((float) 200));

        public float getInterpolation(float f2) {
            if (f2 >= 1.0f) {
                return 1.0f;
            }
            if (f2 <= 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f3092a;
            int min = Math.min((int) (((float) (fArr.length - 1)) * f2), fArr.length - 2);
            float f3 = this.f3093b;
            float f4 = (f2 - (((float) min) * f3)) / f3;
            float[] fArr2 = this.f3092a;
            return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
        }
    }

    /* renamed from: com.explorestack.iab.utils.b$b  reason: collision with other inner class name */
    public class C0034b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3094a;

        public C0034b(d dVar) {
            this.f3094a = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.b(floatValue, this.f3094a);
            b.this.a(floatValue, this.f3094a, false);
            b.this.invalidateSelf();
        }
    }

    public class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3096a;

        public c(d dVar) {
            this.f3096a = dVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            b.this.a(1.0f, this.f3096a, true);
            this.f3096a.l();
            this.f3096a.j();
            if (b.this.f3091f) {
                boolean unused = b.this.f3091f = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                return;
            }
            b bVar = b.this;
            float unused2 = bVar.f3090e = bVar.f3090e + 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            float unused = b.this.f3090e = 0.0f;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f3098a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public final Paint f3099b;

        /* renamed from: c  reason: collision with root package name */
        public final Paint f3100c;

        /* renamed from: d  reason: collision with root package name */
        public final Paint f3101d;

        /* renamed from: e  reason: collision with root package name */
        public final Paint f3102e;

        /* renamed from: f  reason: collision with root package name */
        public float f3103f;

        /* renamed from: g  reason: collision with root package name */
        public float f3104g;

        /* renamed from: h  reason: collision with root package name */
        public float f3105h;
        public float i;
        public int[] j;
        public int k;
        public float l;
        public float m;
        public float n;
        public float o;
        public int p;
        public int q;

        public d() {
            Paint paint = new Paint();
            this.f3099b = paint;
            Paint paint2 = new Paint();
            this.f3100c = paint2;
            Paint paint3 = new Paint();
            this.f3101d = paint3;
            Paint paint4 = new Paint();
            this.f3102e = paint4;
            this.f3103f = 0.0f;
            this.f3104g = 0.0f;
            this.f3105h = 0.0f;
            this.i = 5.0f;
            this.p = KotlinVersion.MAX_COMPONENT_VALUE;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
            paint4.setColor(0);
        }

        public int a() {
            return this.p;
        }

        public void a(float f2) {
            this.o = f2;
        }

        public void a(int i2) {
            this.p = i2;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f3098a;
            float f2 = this.o;
            float f3 = (this.i / 2.0f) + f2;
            if (f2 <= 0.0f) {
                f3 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - (this.i / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f3, ((float) rect.centerY()) - f3, ((float) rect.centerX()) + f3, ((float) rect.centerY()) + f3);
            float f4 = this.f3103f;
            float f5 = this.f3105h;
            float f6 = (f4 + f5) * 360.0f;
            this.f3099b.setColor(this.q);
            this.f3099b.setAlpha(this.p);
            float f7 = this.i / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f3101d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f6, ((this.f3104g + f5) * 360.0f) - f6, false, this.f3099b);
        }

        public void a(ColorFilter colorFilter) {
            this.f3099b.setColorFilter(colorFilter);
        }

        public void a(Paint.Cap cap) {
            this.f3099b.setStrokeCap(cap);
        }

        public void a(int[] iArr) {
            this.j = iArr;
            c(0);
        }

        public float b() {
            return this.f3104g;
        }

        public void b(float f2) {
            this.f3104g = f2;
        }

        public void b(int i2) {
            this.q = i2;
        }

        public int c() {
            return this.j[d()];
        }

        public void c(float f2) {
            this.f3105h = f2;
        }

        public void c(int i2) {
            this.k = i2;
            this.q = this.j[i2];
        }

        public int d() {
            return (this.k + 1) % this.j.length;
        }

        public void d(float f2) {
            this.f3103f = f2;
        }

        public float e() {
            return this.f3103f;
        }

        public void e(float f2) {
            this.i = f2;
            this.f3099b.setStrokeWidth(f2);
        }

        public int f() {
            return this.j[this.k];
        }

        public float g() {
            return this.m;
        }

        public float h() {
            return this.n;
        }

        public float i() {
            return this.l;
        }

        public void j() {
            c(d());
        }

        public void k() {
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 0.0f;
            d(0.0f);
            b(0.0f);
            c(0.0f);
        }

        public void l() {
            this.l = this.f3103f;
            this.m = this.f3104g;
            this.n = this.f3105h;
        }
    }

    public b(Context context) {
        this.f3088c = context.getResources();
        d dVar = new d();
        this.f3086a = dVar;
        dVar.a(i);
        c(2.5f);
        b();
    }

    public float a() {
        return this.f3086a.i;
    }

    public final int a(float f2, int i2, int i3) {
        int i4 = (i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i5 = (i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i6 = (i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i7 = i2 & KotlinVersion.MAX_COMPONENT_VALUE;
        return ((i4 + ((int) (((float) (((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) - i4)) * f2))) << 24) | ((i5 + ((int) (((float) (((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - i5)) * f2))) << 16) | ((i6 + ((int) (((float) (((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - i6)) * f2))) << 8) | (i7 + ((int) (f2 * ((float) ((i3 & KotlinVersion.MAX_COMPONENT_VALUE) - i7)))));
    }

    public void a(float f2) {
        this.f3086a.a(f2);
        invalidateSelf();
    }

    public final void a(float f2, d dVar) {
        b(f2, dVar);
        dVar.d(dVar.i() + (((dVar.g() - 0.01f) - dVar.i()) * f2));
        dVar.b(dVar.g());
        dVar.c(dVar.h() + ((((float) (Math.floor((double) (dVar.h() / 0.8f)) + 1.0d)) - dVar.h()) * f2));
    }

    public final void a(float f2, d dVar, boolean z) {
        float f3;
        float f4;
        if (this.f3091f) {
            a(f2, dVar);
        } else if (f2 != 1.0f || z) {
            float h2 = dVar.h();
            if (f2 < 0.5f) {
                f3 = dVar.i();
                f4 = (f3085h.getInterpolation(f2 / 0.5f) * 0.79f) + f3 + 0.01f;
            } else {
                float i2 = dVar.i() + 0.79f;
                float f5 = i2;
                f3 = i2 - (((1.0f - f3085h.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f4 = f5;
            }
            dVar.d(f3);
            dVar.b(f4);
            dVar.c(h2 + (0.20999998f * f2));
            b((f2 + this.f3090e) * 216.0f);
        }
    }

    public void a(Paint.Cap cap) {
        this.f3086a.a(cap);
        invalidateSelf();
    }

    public void a(int... iArr) {
        this.f3086a.a(iArr);
        this.f3086a.c(0);
        invalidateSelf();
    }

    public final void b() {
        d dVar = this.f3086a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C0034b(dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f3084g);
        ofFloat.addListener(new c(dVar));
        this.f3089d = ofFloat;
    }

    public final void b(float f2) {
        this.f3087b = f2;
    }

    public final void b(float f2, d dVar) {
        dVar.b(f2 > 0.75f ? a((f2 - 0.75f) / 0.25f, dVar.f(), dVar.c()) : dVar.f());
    }

    public void c(float f2) {
        this.f3086a.e(f2);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f3087b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f3086a.a(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.f3086a.a();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f3089d.isRunning();
    }

    public void setAlpha(int i2) {
        this.f3086a.a(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3086a.a(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j;
        Animator animator;
        this.f3089d.cancel();
        this.f3086a.l();
        if (this.f3086a.b() != this.f3086a.e()) {
            this.f3091f = true;
            animator = this.f3089d;
            j = 666;
        } else {
            this.f3086a.c(0);
            this.f3086a.k();
            animator = this.f3089d;
            j = 1332;
        }
        animator.setDuration(j);
        this.f3089d.start();
    }

    public void stop() {
        this.f3089d.cancel();
        b(0.0f);
        this.f3086a.c(0);
        this.f3086a.k();
        invalidateSelf();
    }
}
