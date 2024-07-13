package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;

/* compiled from: ShakeUtils */
public class v implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private long f19269a = 2000;

    /* renamed from: b  reason: collision with root package name */
    private volatile long f19270b;

    /* renamed from: c  reason: collision with root package name */
    private float f19271c;

    /* renamed from: d  reason: collision with root package name */
    private float f19272d;

    /* renamed from: e  reason: collision with root package name */
    private float f19273e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f19274f = false;

    /* renamed from: g  reason: collision with root package name */
    private volatile long f19275g;

    /* renamed from: h  reason: collision with root package name */
    private float f19276h = 20.0f;
    private float i = 50.0f;
    private boolean j;
    private SensorManager k = null;
    private a l = null;

    /* compiled from: ShakeUtils */
    public interface a {
        void a(int i);
    }

    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public v(Context context) {
        this.k = (SensorManager) context.getSystemService("sensor");
    }

    public void a(a aVar) {
        this.l = aVar;
    }

    public void a() {
        SensorManager sensorManager = this.k;
        if (sensorManager != null && !this.j) {
            try {
                this.f19274f = false;
                sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
                if (Build.VERSION.SDK_INT > 18) {
                    this.k.registerListener(this, this.k.getDefaultSensor(15), 1);
                }
                this.j = true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void b() {
        SensorManager sensorManager = this.k;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.j = false;
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[1]);
        float abs3 = Math.abs(fArr[2]);
        if (type == 1) {
            float f2 = this.f19276h;
            if ((abs > f2 || abs2 > f2 || abs3 > f2) && this.l != null && System.currentTimeMillis() - this.f19270b > this.f19269a) {
                this.l.a(1);
                this.f19270b = System.currentTimeMillis();
            }
        } else if (type == 15) {
            float abs4 = Math.abs(fArr[0]);
            float abs5 = Math.abs(fArr[1]);
            float abs6 = Math.abs(fArr[2]);
            if (abs4 != 0.0f || abs5 != 0.0f || abs6 != 0.0f) {
                if (!this.f19274f) {
                    this.f19274f = true;
                    this.f19271c = abs4;
                    this.f19272d = abs5;
                    this.f19273e = abs6;
                    return;
                }
                float abs7 = Math.abs(abs5 - this.f19272d) * 180.0f;
                float abs8 = Math.abs(abs6 - this.f19273e) * 180.0f;
                float f3 = this.i;
                if ((Math.abs(abs4 - this.f19271c) * 180.0f > f3 || abs7 > f3 || abs8 > f3) && this.l != null && System.currentTimeMillis() - this.f19275g > this.f19269a) {
                    this.l.a(2);
                    this.f19275g = System.currentTimeMillis();
                }
            }
        }
    }

    public void a(float f2) {
        this.f19276h = f2;
    }

    public void b(float f2) {
        this.i = f2;
    }
}
