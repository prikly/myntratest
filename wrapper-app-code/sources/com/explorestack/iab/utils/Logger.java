package com.explorestack.iab.utils;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Logger {

    /* renamed from: c  reason: collision with root package name */
    public static LogLevel f3067c = LogLevel.error;

    /* renamed from: a  reason: collision with root package name */
    public final List<LogListener> f3068a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final String f3069b;

    public enum LogLevel {
        debug(1),
        info(2),
        warning(3),
        error(4),
        none(5);
        

        /* renamed from: a  reason: collision with root package name */
        public int f3070a;

        private LogLevel(int i) {
            this.f3070a = i;
        }

        public int getValue() {
            return this.f3070a;
        }
    }

    public Logger(String str) {
        this.f3069b = str;
    }

    public LogLevel a() {
        return f3067c;
    }

    public void a(LogListener logListener) {
        if (logListener != null) {
            this.f3068a.add(logListener);
        }
    }

    public final void a(LogLevel logLevel, String... strArr) {
        if (!this.f3068a.isEmpty()) {
            for (LogListener onLog : this.f3068a) {
                onLog.onLog(logLevel, this.f3069b, Arrays.toString(strArr));
            }
        }
    }

    public void a(String str) {
        LogLevel logLevel = LogLevel.error;
        if (a(logLevel, str)) {
            Log.e(this.f3069b, str);
        }
        a(logLevel, str);
    }

    public void a(String str, String str2) {
        LogLevel logLevel = LogLevel.debug;
        if (a(logLevel, str2)) {
            String str3 = this.f3069b;
            Log.d(str3, "[" + str + "] " + str2);
        }
        a(logLevel, "[" + str + "] " + str2);
    }

    public void a(String str, String str2, Throwable th) {
        LogLevel logLevel = LogLevel.error;
        if (a(logLevel, str2)) {
            String str3 = this.f3069b;
            Log.e(str3, "[" + str + "] " + str2, th);
        }
        a(logLevel, "[" + str + "] " + str2, th.toString());
    }

    public void a(String str, Throwable th) {
        LogLevel logLevel = LogLevel.error;
        if (a(logLevel, str)) {
            Log.e(this.f3069b, str, th);
        }
        a(logLevel, str, th.toString());
    }

    public final boolean a(LogLevel logLevel) {
        LogLevel logLevel2 = f3067c;
        return (logLevel2 == null || logLevel == null || logLevel2.getValue() > logLevel.getValue()) ? false : true;
    }

    public final boolean a(LogLevel logLevel, String str) {
        return !TextUtils.isEmpty(str) && a(logLevel);
    }

    public void b(LogLevel logLevel) {
        Log.d(this.f3069b, String.format("Changing logging level. From: %s, To: %s", new Object[]{f3067c, logLevel}));
        f3067c = logLevel;
    }

    public void b(String str, String str2) {
        LogLevel logLevel = LogLevel.error;
        if (a(logLevel, str2)) {
            String str3 = this.f3069b;
            Log.e(str3, "[" + str + "] " + str2);
        }
        a(logLevel, "[" + str + "] " + str2);
    }

    public void c(String str, String str2) {
        LogLevel logLevel = LogLevel.warning;
        if (a(logLevel, str2)) {
            String str3 = this.f3069b;
            Log.w(str3, "[" + str + "] " + str2);
        }
        a(logLevel, "[" + str + "] " + str2);
    }
}
