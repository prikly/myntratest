package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class o implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final int f15924a;

    /* renamed from: b  reason: collision with root package name */
    private final float f15925b;

    /* renamed from: c  reason: collision with root package name */
    private final SensorManager f15926c;

    /* renamed from: d  reason: collision with root package name */
    private final Sensor f15927d;

    /* renamed from: e  reason: collision with root package name */
    private final Sensor f15928e = this.f15926c.getDefaultSensor(4);

    /* renamed from: f  reason: collision with root package name */
    private final n f15929f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f15930g;

    /* renamed from: h  reason: collision with root package name */
    private float f15931h;

    public o(n nVar) {
        this.f15929f = nVar;
        SensorManager sensorManager = (SensorManager) nVar.P().getSystemService("sensor");
        this.f15926c = sensorManager;
        this.f15927d = sensorManager.getDefaultSensor(9);
        this.f15924a = ((Integer) nVar.a(b.ea)).intValue();
        this.f15925b = ((Float) nVar.a(b.dZ)).floatValue();
        nVar.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        nVar.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a() {
        this.f15926c.unregisterListener(this);
        if (((Boolean) this.f15929f.O().a(b.dX)).booleanValue()) {
            this.f15926c.registerListener(this, this.f15927d, (int) TimeUnit.MILLISECONDS.toMicros((long) this.f15924a));
        }
        if (((Boolean) this.f15929f.O().a(b.dY)).booleanValue()) {
            this.f15926c.registerListener(this, this.f15928e, (int) TimeUnit.MILLISECONDS.toMicros((long) this.f15924a));
        }
    }

    public float b() {
        return this.f15931h;
    }

    public float c() {
        float[] fArr = this.f15930g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos((double) (fArr[2] / 9.81f)));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f15926c.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f15930g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f2 = this.f15931h * this.f15925b;
            this.f15931h = f2;
            this.f15931h = f2 + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
