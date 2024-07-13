package com.ironsource.mediationsdk.a;

import android.os.Handler;
import android.os.HandlerThread;
import com.ironsource.mediationsdk.logger.c;

public final class i extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private static i f8433b;

    /* renamed from: a  reason: collision with root package name */
    private a f8434a;

    class a extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        Handler f8435a;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new c());
        }
    }

    private i() {
        a aVar = new a(getClass().getSimpleName());
        this.f8434a = aVar;
        aVar.start();
        a aVar2 = this.f8434a;
        aVar2.f8435a = new Handler(aVar2.getLooper());
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (f8433b == null) {
                f8433b = new i();
            }
            iVar = f8433b;
        }
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.Runnable r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.a.i$a r0 = r1.f8434a     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            com.ironsource.mediationsdk.a.i$a r0 = r1.f8434a     // Catch:{ all -> 0x0012 }
            android.os.Handler r0 = r0.f8435a     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0010
            r0.post(r2)     // Catch:{ all -> 0x0012 }
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.a.i.a(java.lang.Runnable):void");
    }
}
