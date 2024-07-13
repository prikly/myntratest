package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;
import com.apm.insight.h;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private static MonitorCrash f10873a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f10874b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static int f10875c;

    public static MonitorCrash a() {
        if (f10873a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(h.g(), "239017", 1030820, "1.3.8.nourl-alpha.0", "com.apm.insight");
            f10873a = initSDK;
            initSDK.config().setChannel("release");
        }
        return f10873a;
    }

    public static void a(Throwable th, String str) {
        if (h.g() != null && b()) {
            a().reportCustomErr(str, "INNER", th);
        }
    }

    private static boolean b() {
        if (f10874b == -1) {
            f10874b = 5;
        }
        int i = f10875c;
        if (i >= f10874b) {
            return false;
        }
        f10875c = i + 1;
        return true;
    }
}
