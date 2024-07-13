package com.apm.insight.a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.runtime.p;

public class a implements ICrashCallback {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f10437d;

    /* renamed from: a  reason: collision with root package name */
    private volatile String f10438a;

    /* renamed from: b  reason: collision with root package name */
    private volatile b f10439b;

    /* renamed from: c  reason: collision with root package name */
    private volatile c f10440c;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f10441e = false;

    private a() {
    }

    public static a a() {
        if (f10437d == null) {
            synchronized (a.class) {
                if (f10437d == null) {
                    f10437d = new a();
                }
            }
        }
        return f10437d;
    }

    public void a(CrashType crashType, long j, String str) {
    }

    public void a(String str) {
    }

    public void a(String str, b bVar, c cVar) {
        this.f10438a = str;
        this.f10439b = bVar;
        this.f10440c = cVar;
        if (!this.f10441e) {
            this.f10441e = true;
            p.b().a((Runnable) new Runnable() {
                public void run() {
                }
            });
        }
    }

    public void b() {
    }

    public void onCrash(CrashType crashType, String str, Thread thread) {
        boolean equals = crashType.equals(CrashType.NATIVE);
    }
}
