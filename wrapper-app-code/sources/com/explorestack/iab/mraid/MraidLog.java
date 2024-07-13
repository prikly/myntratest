package com.explorestack.iab.mraid;

import com.explorestack.iab.utils.LogListener;
import com.explorestack.iab.utils.Logger;

public class MraidLog {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f2958a = new Logger("MraidLog");

    public static Logger.LogLevel a() {
        return f2958a.a();
    }

    public static void a(String str) {
        f2958a.a(str);
    }

    public static void a(String str, String str2) {
        f2958a.b(str, str2);
    }

    public static void a(String str, Throwable th) {
        f2958a.a(str, th);
    }

    public static void addLogListener(LogListener logListener) {
        f2958a.a(logListener);
    }

    public static void b(String str, String str2) {
        f2958a.c(str, str2);
    }

    public static void d(String str, String str2) {
        f2958a.a(str, str2);
    }

    public static void setLoggingLevel(Logger.LogLevel logLevel) {
        f2958a.b(logLevel);
    }
}
