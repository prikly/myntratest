package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.StrictMode;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, Point> f15821a = CollectionUtils.map(2);

    public static Point a(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        if (f15821a.containsKey(Integer.valueOf(orientation))) {
            return f15821a.get(Integer.valueOf(orientation));
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (b()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        f15821a.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 17;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 33;
    }
}
