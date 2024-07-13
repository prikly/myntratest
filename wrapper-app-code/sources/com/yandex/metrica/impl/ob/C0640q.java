package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.q  reason: case insensitive filesystem */
public class C0640q extends C0492k0 {

    /* renamed from: a  reason: collision with root package name */
    private Application f6488a;

    /* renamed from: b  reason: collision with root package name */
    private volatile c f6489b = c.NOT_WATCHING_YET;

    /* renamed from: c  reason: collision with root package name */
    private final C0686rm<a, b> f6490c = new C0686rm<>(true);

    /* renamed from: com.yandex.metrica.impl.ob.q$a */
    public enum a {
        CREATED,
        RESUMED,
        PAUSED,
        STARTED,
        STOPPED,
        DESTROYED
    }

    /* renamed from: com.yandex.metrica.impl.ob.q$b */
    interface b {
        void a(Activity activity, a aVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.q$c */
    public enum c {
        WATCHING((String) null),
        NO_APPLICATION("Bad application object"),
        NOT_WATCHING_YET("Internal inconsistency");
        

        /* renamed from: a  reason: collision with root package name */
        public final String f6502a;

        private c(String str) {
            this.f6502a = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.q$c r0 = r2.f6489b     // Catch:{ all -> 0x0025 }
            com.yandex.metrica.impl.ob.q$c r1 = com.yandex.metrica.impl.ob.C0640q.c.WATCHING     // Catch:{ all -> 0x0025 }
            if (r0 == r1) goto L_0x0023
            com.yandex.metrica.impl.ob.rm<com.yandex.metrica.impl.ob.q$a, com.yandex.metrica.impl.ob.q$b> r0 = r2.f6490c     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0010
            goto L_0x0023
        L_0x0010:
            android.app.Application r0 = r2.f6488a     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x001a
            com.yandex.metrica.impl.ob.q$c r0 = com.yandex.metrica.impl.ob.C0640q.c.NO_APPLICATION     // Catch:{ all -> 0x0025 }
            r2.f6489b = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)
            return
        L_0x001a:
            r2.f6489b = r1     // Catch:{ all -> 0x0025 }
            android.app.Application r0 = r2.f6488a     // Catch:{ all -> 0x0025 }
            r0.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)
            return
        L_0x0023:
            monitor-exit(r2)
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0640q.b():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:4|5)|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.app.Application r0 = r1.f6488a     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x000d
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x000d }
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x000d }
            r1.f6488a = r2     // Catch:{ all -> 0x000d }
        L_0x000d:
            r1.b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0640q.a(android.content.Context):void");
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        a(a.CREATED, activity);
    }

    public void onActivityDestroyed(Activity activity) {
        a(a.DESTROYED, activity);
    }

    public void onActivityPaused(Activity activity) {
        a(a.PAUSED, activity);
    }

    public void onActivityResumed(Activity activity) {
        a(a.RESUMED, activity);
    }

    public void onActivityStarted(Activity activity) {
        a(a.STARTED, activity);
    }

    public void onActivityStopped(Activity activity) {
        a(a.STOPPED, activity);
    }

    public synchronized void a(Application application) {
        if (this.f6488a == null) {
            this.f6488a = application;
        }
        b();
    }

    public c a() {
        return this.f6489b;
    }

    private void a(a aVar, Activity activity) {
        Collection<b> a2;
        synchronized (this) {
            a2 = this.f6490c.a(aVar);
        }
        if (a2 != null) {
            for (b a3 : a2) {
                a3.a(activity, aVar);
            }
        }
    }

    public synchronized void a(b bVar, a... aVarArr) {
        if (aVarArr.length == 0) {
            aVarArr = a.values();
        }
        for (a a2 : aVarArr) {
            this.f6490c.a(a2, bVar);
        }
        b();
    }
}
