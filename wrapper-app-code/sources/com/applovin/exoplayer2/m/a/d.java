package com.applovin.exoplayer2.m.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

final class d implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f13634a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f13635b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f13636c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f13637d;

    /* renamed from: e  reason: collision with root package name */
    private final Display f13638e;

    /* renamed from: f  reason: collision with root package name */
    private final a[] f13639f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13640g;

    public interface a {
        void a(float[] fArr, float f2);
    }

    private void a(float[] fArr) {
        if (!this.f13640g) {
            c.a(this.f13636c, fArr);
            this.f13640g = true;
        }
        float[] fArr2 = this.f13635b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f13635b, 0, this.f13636c, 0);
    }

    private void a(float[] fArr, float f2) {
        for (a a2 : this.f13639f) {
            a2.a(fArr, f2);
        }
    }

    private void a(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 130;
            int i3 = 129;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = 129;
                i3 = 130;
            } else if (i == 3) {
                i3 = 1;
            } else {
                throw new IllegalStateException();
            }
            float[] fArr2 = this.f13635b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f13635b, i2, i3, fArr);
        }
    }

    private float b(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f13635b);
        SensorManager.getOrientation(this.f13635b, this.f13637d);
        return this.f13637d[2];
    }

    private static void c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f13634a, sensorEvent.values);
        a(this.f13634a, this.f13638e.getRotation());
        float b2 = b(this.f13634a);
        c(this.f13634a);
        a(this.f13634a);
        a(this.f13634a, b2);
    }
}
