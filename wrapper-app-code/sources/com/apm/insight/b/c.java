package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.b;
import com.apm.insight.runtime.p;

public class c {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static long f10455b;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f10456a;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f10457c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f10458d = new Runnable() {
        public void run() {
            if (!c.this.f10457c) {
                c.this.f10456a.d();
                long unused = c.f10455b = SystemClock.uptimeMillis();
                boolean a2 = f.a();
                p.b().a(c.this.f10458d, 500);
                b.a(c.f10455b);
            }
        }
    };

    c(b bVar) {
        this.f10456a = bVar;
        p.b().a(this.f10458d, 5000);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f10455b <= 15000;
    }

    public void a() {
        if (!this.f10457c) {
            p.b().a(this.f10458d, 5000);
        }
    }

    public void b() {
        this.f10457c = true;
    }
}
