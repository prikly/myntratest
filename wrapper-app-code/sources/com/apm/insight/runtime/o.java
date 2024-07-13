package com.apm.insight.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import com.apm.insight.b.g;
import com.apm.insight.f;
import com.apm.insight.g.a;
import com.apm.insight.g.c;
import com.apm.insight.g.d;
import com.apm.insight.h;
import com.apm.insight.i.b;
import com.apm.insight.k.e;
import com.apm.insight.l.q;
import com.apm.insight.nativecrash.NativeImpl;
import java.io.File;
import java.util.Map;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f10877a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f10878b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f10879c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f10880d = false;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f10881e = false;

    /* renamed from: f  reason: collision with root package name */
    private static c f10882f = new c();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static volatile boolean f10883g = false;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f10884h = false;

    public static c a() {
        return f10882f;
    }

    public static void a(long j) {
        NativeImpl.a(j);
    }

    public static synchronized void a(Application application, Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (o.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!f10877a) {
                f10877a = true;
                if (context == null || application == null) {
                    throw new IllegalArgumentException("context or Application must be not null.");
                }
                h.a(application, context);
                if (z || z2) {
                    a a2 = a.a();
                    if (z2) {
                        a2.a((c) new b(context));
                    }
                    if (z) {
                        a2.b((c) new d(context));
                    }
                    f10878b = true;
                }
                NativeImpl.a();
                if (z3) {
                    boolean a3 = NativeImpl.a(context);
                    f10880d = a3;
                    if (!a3) {
                        f10881e = true;
                    }
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    f10883g = true;
                    NativeImpl.h();
                }
                c(z4);
                q.a((Object) "Npth.init takes " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms.");
            }
        }
    }

    public static synchronized void a(Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        String str;
        Application application;
        synchronized (o.class) {
            if (h.h() != null) {
                application = h.h();
            } else if (context instanceof Application) {
                application = (Application) context;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("初始化时传入的Application还未attach, 请在init时传入attachBaseContext的参数, 并在init之前手动调用Npth.setApplication(Application).");
                }
            } else {
                try {
                    application = (Application) context.getApplicationContext();
                    if (application == null) {
                        throw new IllegalArgumentException(str);
                    } else if (application.getBaseContext() != null) {
                        context = application.getBaseContext();
                    }
                } finally {
                    str = "初始化时传入了baseContext, 导致无法获取Application实例, 请在init之前手动调用Npth.setApplication(Application).";
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
                }
            }
            a(application, context, z, z2, z3, z4, j);
        }
    }

    public static void a(ICrashCallback iCrashCallback, CrashType crashType) {
        a().a(iCrashCallback, crashType);
    }

    public static void a(IOOMCallback iOOMCallback) {
        a().a(iOOMCallback);
    }

    public static void a(IOOMCallback iOOMCallback, CrashType crashType) {
        a().b(iOOMCallback);
    }

    public static void a(com.apm.insight.d dVar) {
        h.i().setEncryptImpl(dVar);
    }

    public static void a(com.apm.insight.k.h hVar) {
        e.a(hVar);
    }

    public static void a(j jVar) {
        k.a(jVar);
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            com.apm.insight.d.a.a(str);
        }
    }

    public static void a(String str, com.apm.insight.a.b bVar, com.apm.insight.a.c cVar) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            com.apm.insight.a.a.a().a(str, bVar, cVar);
        }
    }

    public static void a(final String str, final com.apm.insight.e eVar) {
        p.b().a((Runnable) new Runnable() {
            public void run() {
                if (com.apm.insight.l.a.b(h.g())) {
                    com.apm.insight.b.d.a(str, eVar);
                }
            }
        });
    }

    public static void a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, f fVar) {
        if (!TextUtils.isEmpty(str)) {
            com.apm.insight.d.a.a(str, map, map2, fVar);
        }
    }

    public static void a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, f fVar) {
        if (!TextUtils.isEmpty(str)) {
            com.apm.insight.d.a.a(str, map, map2, map3, fVar);
        }
    }

    @Deprecated
    public static void a(Throwable th) {
        if (h.i().isReportErrorEnable()) {
            a.a(th);
        }
    }

    public static void b(long j) {
        NativeImpl.b(j);
    }

    public static void b(ICrashCallback iCrashCallback, CrashType crashType) {
        a().b(iCrashCallback, crashType);
    }

    @Deprecated
    public static void b(String str) {
        if (h.i().isReportErrorEnable()) {
            a.c(str);
        }
    }

    public static boolean b() {
        return f10878b;
    }

    public static void c(long j) {
        NativeImpl.c(j);
    }

    public static void c(String str) {
        NativeImpl.b(str);
    }

    private static void c(final boolean z) {
        p.b().a((Runnable) new Runnable() {
            public void run() {
                if (!o.f10883g) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public void run() {
                            boolean unused = o.f10883g = true;
                            NativeImpl.h();
                        }
                    });
                }
                o.d(z);
            }
        }, 0);
    }

    public static boolean c() {
        return f10879c;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(boolean r3) {
        /*
            android.content.Context r0 = com.apm.insight.h.g()
            com.apm.insight.runtime.a.f.a()
            com.apm.insight.runtime.m.a()
            java.lang.String r1 = "Npth.initAsync-createCallbackThread"
            com.apm.insight.j.a(r1)
            int r1 = com.apm.insight.nativecrash.NativeImpl.b()
            com.apm.insight.j.a()
            com.apm.insight.nativecrash.NativeImpl.c()
            boolean r2 = f10881e
            if (r2 == 0) goto L_0x0027
            com.apm.insight.c r1 = com.apm.insight.b.a()
            java.lang.String r2 = "NativeLibraryLoad faild"
        L_0x0023:
            r1.a((java.lang.String) r2)
            goto L_0x0030
        L_0x0027:
            if (r1 >= 0) goto L_0x0030
            com.apm.insight.c r1 = com.apm.insight.b.a()
            java.lang.String r2 = "createCallbackThread faild"
            goto L_0x0023
        L_0x0030:
            java.lang.String r1 = "Npth.initAsync-NpthDataManager"
            com.apm.insight.j.a(r1)
            com.apm.insight.e.a r1 = com.apm.insight.e.a.a()
            r1.a((android.content.Context) r0)
            com.apm.insight.j.a()
            com.apm.insight.b.a()
            java.lang.String r1 = "Npth.initAsync-LaunchScanner"
            com.apm.insight.j.a(r1)
            com.apm.insight.k.i.a(r0)
            com.apm.insight.j.a()
            if (r3 == 0) goto L_0x0060
            java.lang.String r1 = "Npth.initAsync-CrashANRHandler"
            com.apm.insight.j.a(r1)
            com.apm.insight.b.g r1 = com.apm.insight.b.g.a(r0)
            r1.c()
            com.apm.insight.j.a()
            f10879c = r3
        L_0x0060:
            java.lang.String r3 = "Npth.initAsync-EventUploadQueue"
            com.apm.insight.j.a(r3)
            com.apm.insight.k.g r3 = com.apm.insight.k.g.a()
            r3.b()
            com.apm.insight.j.a()
            java.lang.String r3 = "Npth.initAsync-BlockMonitor"
            com.apm.insight.j.a(r3)
            com.apm.insight.j.a()
            java.lang.String r3 = "Npth.initAsync-OriginExceptionMonitor"
            com.apm.insight.j.a(r3)
            com.apm.insight.j.a()
            com.apm.insight.nativecrash.NativeImpl.f()
            com.apm.insight.i.a()
            java.lang.String r3 = "fastbot"
            java.io.File r3 = r0.getExternalFilesDir(r3)     // Catch:{ all -> 0x00a9 }
            android.content.Context r0 = com.apm.insight.h.g()     // Catch:{ all -> 0x00a9 }
            boolean r0 = com.apm.insight.l.a.b(r0)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a9
            if (r3 == 0) goto L_0x00a9
            boolean r0 = r3.exists()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x00a9 }
            com.apm.insight.runtime.o$3 r0 = new com.apm.insight.runtime.o$3     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            com.apm.insight.b.d.a((java.lang.String) r3, (com.apm.insight.e) r0)     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            com.apm.insight.k.k.d()
            com.apm.insight.nativecrash.NativeImpl.j()
            java.lang.String r3 = "afterNpthInitAsync"
            java.lang.String r0 = "noValue"
            com.apm.insight.runtime.r.a((java.lang.String) r3, (java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.o.d(boolean):void");
    }

    public static boolean d() {
        return f10880d;
    }

    public static boolean e() {
        return f10877a;
    }

    public static void f() {
        if (f10877a && !f10878b) {
            Context g2 = h.g();
            a a2 = a.a();
            a2.a((c) new b(g2));
            a2.b((c) new d(g2));
        }
    }

    public static void g() {
        if (f10877a) {
            g.a(h.g()).c();
            f10879c = true;
        }
    }

    public static boolean h() {
        if (f10877a && !f10880d) {
            boolean a2 = NativeImpl.a(h.g());
            f10880d = a2;
            if (!a2) {
                f10881e = true;
            }
        }
        return f10880d;
    }

    public static boolean i() {
        return com.apm.insight.b.c.c();
    }

    public static void j() {
        if (f10877a) {
            g.a(h.g()).d();
            f10879c = false;
        }
    }

    public static boolean k() {
        return a.b() || NativeImpl.d();
    }

    public static boolean l() {
        return a.c() || NativeImpl.d();
    }

    public static boolean m() {
        return a.b();
    }

    public static boolean n() {
        return f10884h;
    }

    public static void o() {
        f10884h = true;
    }
}
