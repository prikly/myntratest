package com.bytedance.sdk.component.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ProcessUtil */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static String f19262a;

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        return context.getApplicationContext().getPackageName().equals(b(context));
    }

    public static String b(Context context) {
        if (!TextUtils.isEmpty(f19262a)) {
            return f19262a;
        }
        String a2 = a();
        f19262a = a2;
        if (!TextUtils.isEmpty(a2)) {
            return f19262a;
        }
        String b2 = b();
        f19262a = b2;
        if (!TextUtils.isEmpty(b2)) {
            return f19262a;
        }
        String c2 = c(context);
        f19262a = c2;
        return c2;
    }

    private static String a() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String b() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static String c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null)) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        }
        return null;
    }
}
