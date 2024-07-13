package com.ironsource.environment;

import android.os.Build;
import java.lang.Thread;

public final class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f8051a;

    d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f8051a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (Build.VERSION.SDK_INT >= 19) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            sb.append(System.lineSeparator());
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append(";" + System.lineSeparator());
                if (stackTraceElement.toString().contains(e.a().f8057b)) {
                    z = true;
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                sb.append("--CAUSE");
                sb.append(System.lineSeparator());
                sb.append(cause.toString());
                sb.append(System.lineSeparator());
                for (StackTraceElement stackTraceElement2 : cause.getStackTrace()) {
                    sb.append(stackTraceElement2.toString());
                    sb.append(";" + System.lineSeparator());
                    if (stackTraceElement2.toString().contains(e.a().f8057b)) {
                        z = true;
                    }
                }
            }
            if (z) {
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(System.currentTimeMillis());
                new c(sb2, sb3.toString(), "Crash").d();
            }
            this.f8051a.uncaughtException(thread, th);
        }
    }
}
