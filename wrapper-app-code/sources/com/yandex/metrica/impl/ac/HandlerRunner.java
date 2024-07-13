package com.yandex.metrica.impl.ac;

import com.yandex.metrica.impl.ob.A2;
import dalvik.system.PathClassLoader;

public class HandlerRunner {
    private static void a(String str) {
        try {
            String findLibrary = new PathClassLoader(System.getProperty("java.class.path"), System.getProperty("java.library.path"), ClassLoader.getSystemClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                System.load(findLibrary);
            }
        } catch (Throwable unused) {
        }
    }

    public static void main(String[] strArr) {
        if (A2.a(24)) {
            try {
                System.loadLibrary("appmetrica-native-runner");
            } catch (Throwable unused) {
                a("appmetrica-native-runner");
            }
        } else {
            a("appmetrica-native-runner");
        }
        runHandler(strArr);
    }

    private static native void runHandler(String[] strArr);
}
