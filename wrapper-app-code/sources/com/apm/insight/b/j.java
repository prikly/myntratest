package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class j {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static int f10527a = 5;

    /* renamed from: b  reason: collision with root package name */
    private static b f10528b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static a f10529c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f10530d;

    /* renamed from: e  reason: collision with root package name */
    private static Printer f10531e;

    public interface a {
        void a(long j);
    }

    static class b implements Printer {

        /* renamed from: a  reason: collision with root package name */
        List<Printer> f10532a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        List<Printer> f10533b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        List<Printer> f10534c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        boolean f10535d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f10536e = false;

        b() {
        }

        public void println(String str) {
            if (!TextUtils.isEmpty(str)) {
                long currentTimeMillis = j.f10529c != null ? System.currentTimeMillis() : 0;
                if (str.charAt(0) == '>' && this.f10536e) {
                    for (Printer next : this.f10534c) {
                        if (!this.f10532a.contains(next)) {
                            this.f10532a.add(next);
                        }
                    }
                    this.f10534c.clear();
                    this.f10536e = false;
                }
                if (this.f10532a.size() > j.f10527a) {
                    Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
                }
                for (Printer next2 : this.f10532a) {
                    if (next2 != null) {
                        next2.println(str);
                    }
                }
                if (str.charAt(0) == '<' && this.f10535d) {
                    for (Printer next3 : this.f10533b) {
                        this.f10532a.remove(next3);
                        this.f10534c.remove(next3);
                    }
                    this.f10533b.clear();
                    this.f10535d = false;
                }
                if (j.f10529c != null && currentTimeMillis > 0) {
                    j.f10529c.a(System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }
    }

    public static void a() {
        if (!f10530d) {
            f10530d = true;
            f10528b = new b();
            Printer d2 = d();
            f10531e = d2;
            if (d2 != null) {
                f10528b.f10532a.add(f10531e);
            }
            Looper.getMainLooper().setMessageLogging(f10528b);
        }
    }

    public static void a(Printer printer) {
        if (printer != null && !f10528b.f10534c.contains(printer)) {
            f10528b.f10534c.add(printer);
            f10528b.f10536e = true;
        }
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }
}
