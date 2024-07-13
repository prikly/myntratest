package com.apm.insight.l;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.h;
import java.io.File;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static String f10757a;

    /* renamed from: b  reason: collision with root package name */
    private static File f10758b;

    /* renamed from: c  reason: collision with root package name */
    private static File f10759c;

    /* renamed from: d  reason: collision with root package name */
    private static File f10760d;

    public static File a() {
        File file = f10759c;
        return file == null ? d(h.g()) : file;
    }

    public static File a(Context context) {
        return new File(j(context), "apminsight/CrashLogJava");
    }

    public static File a(Context context, String str) {
        return new File(j(context) + '/' + "apminsight/CrashCommonLog" + '/' + str);
    }

    public static File a(File file) {
        return new File(file, "flog.txt");
    }

    public static File a(File file, String str) {
        return new File(file, file.getName() + str);
    }

    public static String a(String str) {
        return "dart_" + str;
    }

    public static File b(Context context) {
        return new File(j(context), "apminsight/CrashLogSimple");
    }

    public static File b(File file) {
        return new File(file, "tombstone.txt");
    }

    public static File b(String str) {
        return new File(a(h.g(), str), "fds.txt");
    }

    public static String b() {
        return "anr_" + h.e();
    }

    public static File c(Context context) {
        return new File(j(context), "apminsight/RuntimeContext");
    }

    public static File c(File file) {
        return new File(file, "header.bin");
    }

    public static File c(String str) {
        return new File(a(h.g(), str), "threads.txt");
    }

    public static String c() {
        return String.format("ensure_%s", new Object[]{h.e()});
    }

    public static File d(Context context) {
        if (f10759c == null) {
            if (context == null) {
                context = h.g();
            }
            f10759c = new File(j(context), "apminsight/CrashLogNative");
        }
        return f10759c;
    }

    public static File d(File file) {
        return new File(a(h.g(), file.getName()), "maps.txt");
    }

    public static File d(String str) {
        return new File(a(h.g(), str), "meminfo.txt");
    }

    public static File e(Context context) {
        if (f10760d == null) {
            f10760d = new File(j(context) + '/' + "apminsight/CrashCommonLog" + '/' + h.f());
        }
        return f10760d;
    }

    public static File e(File file) {
        return new File(file, "callback.json");
    }

    public static File e(String str) {
        return new File(a(h.g(), str), "pthreads.txt");
    }

    public static File f(Context context) {
        return new File(j(context), "apminsight/CrashCommonLog");
    }

    public static File f(File file) {
        return new File(file, "upload.json");
    }

    public static File f(String str) {
        return new File(a(h.g(), str), "rountines.txt");
    }

    public static File g(Context context) {
        return new File(j(context), "apminsight/issueCrashTimes");
    }

    public static File g(File file) {
        return new File(file, "javastack.txt");
    }

    public static File g(String str) {
        return new File(a(h.g(), str), "leakd_threads.txt");
    }

    public static File h(Context context) {
        return new File(j(context) + '/' + "apminsight/issueCrashTimes" + '/' + "current.times");
    }

    public static File h(File file) {
        return new File(a(h.g(), file.getName()), "logcat.txt");
    }

    public static File i(Context context) {
        return new File(j(context), "apminsight/alogCrash");
    }

    public static File i(File file) {
        return new File(a(h.g(), file.getName()), "fds.txt");
    }

    public static File j(File file) {
        return new File(a(h.g(), file.getName()), "threads.txt");
    }

    public static String j(Context context) {
        if (TextUtils.isEmpty(f10757a)) {
            try {
                f10757a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e2) {
                f10757a = "/sdcard/";
                e2.printStackTrace();
            }
        }
        return f10757a;
    }

    public static File k(File file) {
        return new File(a(h.g(), file.getName()), "meminfo.txt");
    }

    public static File l(File file) {
        return new File(a(h.g(), file.getName()), "pthreads.txt");
    }

    public static File m(File file) {
        return new File(a(h.g(), file.getName()), "rountines.txt");
    }

    public static File n(File file) {
        return new File(a(h.g(), file.getName()), "leakd_threads.txt");
    }

    public static File o(File file) {
        return new File(file, "abortmsg.txt");
    }
}
