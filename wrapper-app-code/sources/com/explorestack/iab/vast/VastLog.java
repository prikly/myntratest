package com.explorestack.iab.vast;

import com.explorestack.iab.utils.LogListener;
import com.explorestack.iab.utils.Logger;

public class VastLog {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f3137a = new Logger("VastLog");

    public static void a(String str) {
        f3137a.a(str);
    }

    public static void a(String str, String str2) {
        f3137a.b(str, str2);
    }

    public static void a(String str, String str2, Throwable th) {
        f3137a.a(str, str2, th);
    }

    public static void a(String str, Throwable th) {
        f3137a.a(str, th);
    }

    public static void addLogListener(LogListener logListener) {
        f3137a.a(logListener);
    }

    public static void d(String str, String str2) {
        f3137a.a(str, str2);
    }

    public static void setLoggingLevel(Logger.LogLevel logLevel) {
        f3137a.b(logLevel);
    }
}
