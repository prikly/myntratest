package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f10519a;

    /* renamed from: b  reason: collision with root package name */
    private static Printer f10520b;

    /* renamed from: c  reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f10521c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private static e f10522d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f10523e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f10524f = false;

    /* renamed from: g  reason: collision with root package name */
    private static long f10525g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static int f10526h = 0;

    public interface a {
        void a(long j);
    }

    public static void a() {
        if (!f10519a) {
            f10519a = true;
            f10520b = new Printer() {
                public void println(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        boolean z = false;
                        if (str.charAt(0) == '>') {
                            z = true;
                        } else if (str.charAt(0) != '<') {
                            return;
                        }
                        i.a(z, str);
                    }
                }
            };
            j.a();
            j.a(f10520b);
        }
    }

    public static void a(e eVar) {
        synchronized (f10521c) {
            f10521c.add(eVar);
        }
    }

    public static void a(boolean z, String str) {
        e eVar;
        e eVar2;
        long nanoTime = System.nanoTime();
        e.f10467a = nanoTime / 1000000;
        e.f10468b = SystemClock.currentThreadTimeMillis();
        if (z && (eVar2 = f10522d) != null && eVar2.a()) {
            f10522d.a(str);
        }
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f10521c;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            e eVar3 = copyOnWriteArrayList.get(i);
            if (eVar3 != null && eVar3.a()) {
                boolean z2 = eVar3.f10469c;
                if (z) {
                    if (!z2) {
                        eVar3.a(str);
                    }
                } else if (z2) {
                    eVar3.b(str);
                }
            } else if (!z && eVar3.f10469c) {
                eVar3.b("");
            }
        }
        if (!z && (eVar = f10522d) != null && eVar.a()) {
            f10522d.b("");
        }
        if (f10524f) {
            f10525g += System.nanoTime() - nanoTime;
            int i2 = f10526h;
            f10526h = i2 + 1;
            if (i2 >= 1000) {
                if (f10523e != null) {
                    f10523e.a(f10525g);
                }
                f10526h = 0;
                f10525g = 0;
                f10524f = false;
            }
        }
    }
}
