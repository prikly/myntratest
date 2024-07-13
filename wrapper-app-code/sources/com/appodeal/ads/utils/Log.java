package com.appodeal.ads.utils;

import android.text.TextUtils;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.modules.common.internal.log.InternalLogEvent;
import com.appodeal.ads.modules.common.internal.log.InternalLogKt;
import com.appodeal.ads.utils.x;
import java.net.UnknownHostException;
import java.util.HashMap;

public class Log {

    public enum LogLevel {
        none(0),
        debug(1),
        verbose(2);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f17478a;

        /* access modifiers changed from: public */
        LogLevel(int i) {
            this.f17478a = i;
        }

        public static String[] names() {
            LogLevel[] values = values();
            String[] strArr = new String[values.length];
            for (int i = 0; i < values.length; i++) {
                strArr[i] = values[i].name();
            }
            return strArr;
        }

        public int getValue() {
            return this.f17478a;
        }
    }

    public static void debug(String str, String str2, String str3) {
        log(str, str2, str3, LogLevel.debug);
    }

    public static void log(String str, String str2) {
        log(str, str2, (String) null);
    }

    public static void log(String str, String str2, LogLevel logLevel) {
        log(str, str2, (String) null, logLevel);
    }

    public static void log(String str, String str2, String str3) {
        log(str, str2, str3, LogLevel.debug);
    }

    public static void log(String str, String str2, String str3, LogLevel logLevel) {
        String str4;
        String name = logLevel.name();
        HashMap hashMap = x.l;
        x a2 = x.a.a();
        InternalLogKt.observer.invoke(new InternalLogEvent(str, str2, str3, name, a2.j(), Long.valueOf(a2.i())));
        if (Appodeal.getLogLevel() != LogLevel.none) {
            int i = 0;
            if (TextUtils.isEmpty(str3)) {
                str4 = String.format("%s [%s]", new Object[]{str, str2});
                if (Appodeal.getLogLevel().getValue() < logLevel.getValue()) {
                    return;
                }
                if (str4.length() > 1000) {
                    int length = ((str4.length() + 1000) - 1) / 1000;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1000;
                        android.util.Log.d("Appodeal", str4.substring(i2, Math.min(str4.length(), i3)));
                        i++;
                        i2 = i3;
                    }
                    return;
                }
            } else {
                str4 = String.format("%s [%s]: %s", new Object[]{str, str2, str3});
                if (Appodeal.getLogLevel().getValue() < logLevel.getValue()) {
                    return;
                }
                if (str4.length() > 1000) {
                    int length2 = ((str4.length() + 1000) - 1) / 1000;
                    int i4 = 0;
                    while (i < length2) {
                        int i5 = i4 + 1000;
                        android.util.Log.d("Appodeal", str4.substring(i4, Math.min(str4.length(), i5)));
                        i++;
                        i4 = i5;
                    }
                    return;
                }
            }
            android.util.Log.d("Appodeal", str4);
        }
    }

    public static void log(Throwable th) {
        if (th != null && Appodeal.getLogLevel().getValue() >= LogLevel.debug.getValue()) {
            if (th instanceof UnknownHostException) {
                android.util.Log.d("Appodeal", th.toString());
            } else {
                android.util.Log.d("Appodeal", "Exception", th);
            }
        }
    }

    public static void logObject(String str, String str2, Object obj, LogLevel logLevel) {
        if (Appodeal.getLogLevel() != LogLevel.none) {
            log(str, str2, obj != null ? obj.toString() : null, logLevel);
        }
    }
}
