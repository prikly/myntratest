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
import com.applovin.impl.sdk.n;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class j implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final n f15826a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f15827b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f15828c;

    /* renamed from: d  reason: collision with root package name */
    private final a f15829d;

    /* renamed from: e  reason: collision with root package name */
    private float f15830e;

    public interface a {
        void d();

        void e();
    }

    public j(n nVar, a aVar) {
        this.f15826a = nVar;
        SensorManager sensorManager = (SensorManager) nVar.P().getSystemService("sensor");
        this.f15827b = sensorManager;
        this.f15828c = sensorManager.getDefaultSensor(1);
        this.f15829d = aVar;
    }

    public void a() {
        this.f15827b.unregisterListener(this);
        this.f15827b.registerListener(this, this.f15828c, (int) TimeUnit.MILLISECONDS.toMicros(50));
        this.f15826a.am().unregisterReceiver(this);
        this.f15826a.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        this.f15826a.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f15827b.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f2 = this.f15830e;
            float f3 = (f2 * 0.5f) + (max * 0.5f);
            this.f15830e = f3;
            if (f2 < 0.8f && f3 > 0.8f) {
                this.f15829d.e();
            } else if (f2 > -0.8f && this.f15830e < -0.8f) {
                this.f15829d.d();
            }
        }
    }
}
