package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import com.apm.insight.b.f;
import com.apm.insight.l.q;
import java.util.ArrayList;
import java.util.List;

public class l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static Printer f10866a;

    /* renamed from: b  reason: collision with root package name */
    private static l f10867b;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Printer f10868f = new Printer() {
        public void println(String str) {
            if (str != null) {
                if (str.charAt(0) == '>') {
                    l.a().a(str);
                } else if (str.charAt(0) == '<') {
                    l.a().b(str);
                }
                if (l.f10866a != null && l.f10866a != l.f10868f) {
                    l.f10866a.println(str);
                }
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private long f10869c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final List<Printer> f10870d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final List<Printer> f10871e = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f10872g = false;

    private l() {
    }

    public static l a() {
        if (f10867b == null) {
            synchronized (l.class) {
                if (f10867b == null) {
                    f10867b = new l();
                }
            }
        }
        return f10867b;
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list != null && !list.isEmpty()) {
            try {
                int size = list.size();
                int i = 0;
                while (i < size) {
                    Printer printer = (Printer) list.get(i);
                    if (printer != null) {
                        printer.println(str);
                        i++;
                    } else {
                        return;
                    }
                }
            } catch (Throwable th) {
                q.a(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        f.a(false);
        this.f10869c = -1;
        try {
            a(this.f10870d, str);
        } catch (Exception e2) {
            q.a((Throwable) e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        this.f10869c = SystemClock.uptimeMillis();
        try {
            a(this.f10871e, str);
        } catch (Exception e2) {
            q.b((Throwable) e2);
        }
    }

    public boolean b() {
        return this.f10869c != -1 && SystemClock.uptimeMillis() - this.f10869c > 5000;
    }
}
