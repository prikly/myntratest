package com.bytedance.sdk.component.adexpress.c;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.a.a.a;
import java.lang.reflect.Method;

/* compiled from: ScreenUtils */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18409a;

    public static int a(float f2, float f3, float f4, float f5) {
        return (((int) ((f2 * 255.0f) + 0.5f)) << 24) | (((int) ((f3 * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 8) | ((int) ((f5 * 255.0f) + 0.5f));
    }

    public static float a(Context context, float f2) {
        if (context == null) {
            context = a.a().c().b();
        }
        return (f2 * d(context)) + 0.5f;
    }

    public static int b(Context context, float f2) {
        if (context == null) {
            context = a.a().c().b();
        }
        float d2 = d(context);
        if (d2 <= 0.0f) {
            d2 = 1.0f;
        }
        return (int) ((f2 / d2) + 0.5f);
    }

    public static float c(Context context, float f2) {
        if (context == null) {
            context = a.a().c().b();
        }
        return f2 * d(context);
    }

    private static float d(Context context) {
        try {
            if (f18409a) {
                Class<?> loadClass = context.getClassLoader().loadClass("android.util.DisplayMetrics");
                Method declaredMethod = loadClass.getDeclaredMethod("getDeviceDensity", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((float) ((Integer) declaredMethod.invoke(loadClass, new Object[0])).intValue()) / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int a(Context context) {
        if (context == null) {
            context = a.a().c().b();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int b(Context context) {
        if (context == null) {
            context = a.a().c().b();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int c(Context context) {
        if (context == null) {
            context = a.a().c().b();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }
}
