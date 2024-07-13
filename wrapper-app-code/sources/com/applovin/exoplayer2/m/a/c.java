package com.applovin.exoplayer2.m.a;

import android.opengl.Matrix;
import com.applovin.exoplayer2.l.af;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final af<float[]> f13632a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13633b;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((double) ((fArr2[10] * fArr2[10]) + (fArr2[8] * fArr2[8])));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }

    public void a() {
        this.f13632a.a();
        this.f13633b = false;
    }

    public void a(long j, float[] fArr) {
        this.f13632a.a(j, fArr);
    }
}
