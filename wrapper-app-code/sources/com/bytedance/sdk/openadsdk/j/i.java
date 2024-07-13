package com.bytedance.sdk.openadsdk.j;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;

/* compiled from: SensorHub */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static SensorManager f2080a;

    private static int a(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 2;
    }

    private static SensorManager b(Context context) {
        if (f2080a == null) {
            synchronized (i.class) {
                if (f2080a == null) {
                    f2080a = (SensorManager) context.getSystemService("sensor");
                }
            }
        }
        return f2080a;
    }

    public static void a(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener != null && context != null) {
            try {
                SensorManager b2 = b(context);
                b2.registerListener(sensorEventListener, b2.getDefaultSensor(1), a(i));
            } catch (Throwable th) {
                f.a("SensorHub", "startListenAccelerometer error", th);
            }
        }
    }

    public static void b(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener != null && context != null) {
            try {
                SensorManager b2 = b(context);
                b2.registerListener(sensorEventListener, b2.getDefaultSensor(4), a(i));
            } catch (Throwable th) {
                f.a("SensorHub", "startListenGyroscope error", th);
            }
        }
    }

    public static void a(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener != null && context != null) {
            try {
                b(context).unregisterListener(sensorEventListener);
            } catch (Throwable th) {
                f.a("SensorHub", "stopListen error", th);
            }
        }
    }

    public static void a(Context context) {
        if (context != null) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate(300);
        }
    }
}
