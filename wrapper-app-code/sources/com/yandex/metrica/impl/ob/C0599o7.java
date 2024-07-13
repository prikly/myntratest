package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ac.NativeCrashesHelper;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.o7  reason: case insensitive filesystem */
public class C0599o7 implements C0499k7 {
    public String a() {
        return "YandexMetricaNativeCrashes";
    }

    public void a(String str) {
    }

    public void a(String str, String str2, String str3) {
        NativeCrashesHelper.setUpNativeUncaughtExceptionHandler(str2);
    }

    public void b() {
        NativeCrashesHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    public String c() {
        return "YandexMetricaNativeModule";
    }

    public void a(boolean z) {
        NativeCrashesHelper.logsEnabled(z);
    }
}
