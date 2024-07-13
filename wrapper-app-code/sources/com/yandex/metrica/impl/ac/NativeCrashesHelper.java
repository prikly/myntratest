package com.yandex.metrica.impl.ac;

public class NativeCrashesHelper {
    public static native void cancelSetUpNativeUncaughtExceptionHandler();

    public static native void logsEnabled(boolean z);

    public static native void setUpNativeUncaughtExceptionHandler(String str);
}
