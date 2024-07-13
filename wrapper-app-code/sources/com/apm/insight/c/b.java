package com.apm.insight.c;

import com.apm.insight.h;
import com.apm.insight.runtime.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f10540a = new AtomicBoolean(false);

    public static boolean a() {
        synchronized (f10540a) {
            if (f10540a.get()) {
                return false;
            }
            f10540a.set(true);
            return b();
        }
    }

    public static boolean b() {
        if (!a.h()) {
            return false;
        }
        try {
            File file = new File(h.h().getFilesDir(), "apminsight/crashCommand");
            file.mkdirs();
            new File(file, "0_" + System.currentTimeMillis()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
