package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.utils.t;

/* compiled from: AnimationWrapper */
public class a {

    /* renamed from: a  reason: collision with root package name */
    Paint f18475a;

    /* renamed from: b  reason: collision with root package name */
    Path f18476b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private int f18477c;

    /* renamed from: d  reason: collision with root package name */
    private int f18478d;

    public a() {
        Paint paint = new Paint();
        this.f18475a = paint;
        paint.setAntiAlias(true);
    }

    public void a(Canvas canvas, b bVar, View view) {
        int i;
        int i2;
        Canvas canvas2 = canvas;
        View view2 = view;
        if (bVar.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.a.a.a.a().c() != null) {
                float[] fArr = null;
                try {
                    fArr = g.b((String) view2.getTag(t.e(com.bytedance.sdk.component.adexpress.a.a.a.a().c().b(), "tt_id_ripple_bg")));
                } catch (Exception unused) {
                }
                if (fArr != null) {
                    this.f18475a.setColor(b.a(fArr[3] * (1.0f - bVar.getRippleValue()), fArr[0] / 256.0f, fArr[1] / 256.0f, fArr[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            int i3 = this.f18477c;
            int i4 = this.f18478d;
            canvas2.drawCircle((float) i3, (float) i4, ((float) (Math.min(i3, i4) * 2)) * bVar.getRippleValue(), this.f18475a);
        }
        if (bVar.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.f18476b.reset();
            try {
                i2 = ((Integer) view2.getTag(t.e(view.getContext(), "tt_id_shine_width"))).intValue();
            } catch (Exception unused2) {
                i2 = 0;
            }
            if (i2 >= 0) {
                int a2 = (int) b.a(view.getContext(), (float) i2);
                Path path = this.f18476b;
                float shineValue = ((float) ((this.f18477c * 2) + a2 + (this.f18478d * 2))) * bVar.getShineValue();
                int i5 = this.f18478d;
                path.moveTo((shineValue - ((float) ((i5 * 2) + a2))) + ((float) (i5 * 2)), 0.0f);
                Path path2 = this.f18476b;
                float shineValue2 = ((float) ((this.f18477c * 2) + a2 + (this.f18478d * 2))) * bVar.getShineValue();
                int i6 = this.f18478d;
                float f2 = (float) a2;
                path2.lineTo((shineValue2 - ((float) ((i6 * 2) + a2))) + f2 + ((float) (i6 * 2)), 0.0f);
                Path path3 = this.f18476b;
                float shineValue3 = ((float) ((this.f18477c * 2) + a2 + (this.f18478d * 2))) * bVar.getShineValue();
                int i7 = this.f18478d;
                path3.lineTo((shineValue3 - ((float) ((i7 * 2) + a2))) + f2, (float) (i7 * 2));
                Path path4 = this.f18476b;
                float shineValue4 = ((float) ((this.f18477c * 2) + a2 + (this.f18478d * 2))) * bVar.getShineValue();
                int i8 = this.f18478d;
                path4.lineTo(shineValue4 - ((float) ((i8 * 2) + a2)), (float) (i8 * 2));
                this.f18476b.close();
                float shineValue5 = ((float) ((this.f18477c * 2) + a2 + (this.f18478d * 2))) * bVar.getShineValue();
                int i9 = this.f18478d;
                float f3 = ((float) i9) + (shineValue5 - ((float) ((i9 * 2) + a2)));
                float shineValue6 = ((float) ((this.f18477c * 2) + a2 + (i9 * 2))) * bVar.getShineValue();
                int i10 = this.f18478d;
                this.f18475a.setShader(new LinearGradient(f3, 0.0f, ((float) (a2 / 2)) + (shineValue6 - ((float) ((i10 * 2) + a2))) + ((float) i10), (float) i10, Color.parseColor("#10ffffff"), Color.parseColor("#50ffffff"), Shader.TileMode.MIRROR));
                canvas2.drawPath(this.f18476b, this.f18475a);
            }
        }
        if (bVar.getMarqueeValue() != 0.0f) {
            try {
                i = ((Integer) view2.getTag(t.e(view.getContext(), "tt_id_width"))).intValue();
            } catch (Exception unused3) {
                i = 0;
            }
            if (i >= 0) {
                this.f18476b.reset();
                this.f18476b.moveTo(0.0f, 0.0f);
                this.f18476b.lineTo((float) (this.f18477c * 2), 0.0f);
                this.f18476b.lineTo((float) (this.f18477c * 2), (float) (this.f18478d * 2));
                this.f18476b.lineTo(0.0f, (float) (this.f18478d * 2));
                this.f18476b.lineTo(0.0f, 0.0f);
                this.f18475a.setShader(new LinearGradient(0.0f, 0.0f, (float) (this.f18477c * 2), (float) (this.f18478d * 2), new int[]{(int) (bVar.getMarqueeValue() * -65536.0f), (int) ((1.0f - bVar.getMarqueeValue()) * -65536.0f)}, (float[]) null, Shader.TileMode.CLAMP));
                this.f18475a.setColor(-65536);
                this.f18475a.setStyle(Paint.Style.STROKE);
                this.f18475a.setStrokeWidth((float) i);
                canvas2.drawPath(this.f18476b, this.f18475a);
            }
        }
    }

    public void a(View view, int i, int i2) {
        String str;
        this.f18477c = i / 2;
        this.f18478d = i2 / 2;
        try {
            str = (String) view.getTag(t.e(view.getContext(), "tt_id_direction"));
        } catch (Exception unused) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX((float) (this.f18477c * 2));
            view.setPivotY((float) this.f18478d);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY((float) this.f18478d);
        } else {
            view.setPivotX((float) this.f18477c);
            view.setPivotY((float) this.f18478d);
        }
    }
}
