package com.yandex.metrica.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

public class d implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Intent f3645a;

    /* renamed from: b  reason: collision with root package name */
    private IBinder f3646b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f3647c = new Object();

    public d(Intent intent, String str) {
        this.f3645a = intent;
        String.format("[AdServiceConnection-%s]", new Object[]{str});
    }

    public Intent a() {
        return this.f3645a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(2:7|8)|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IBinder a(long r3) {
        /*
            r2 = this;
            android.os.IBinder r0 = r2.f3646b
            if (r0 != 0) goto L_0x0015
            java.lang.Object r0 = r2.f3647c
            monitor-enter(r0)
            android.os.IBinder r1 = r2.f3646b     // Catch:{ all -> 0x0012 }
            if (r1 != 0) goto L_0x0010
            java.lang.Object r1 = r2.f3647c     // Catch:{ InterruptedException -> 0x0010 }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x0010 }
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r3
        L_0x0015:
            android.os.IBinder r3 = r2.f3646b
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.identifiers.impl.d.a(long):android.os.IBinder");
    }

    public boolean a(Context context) {
        return context.bindService(this.f3645a, this, 1);
    }

    public void b(Context context) {
        synchronized (this.f3647c) {
            this.f3646b = null;
            this.f3647c.notifyAll();
        }
        context.unbindService(this);
    }

    public void onBindingDied(ComponentName componentName) {
        synchronized (this.f3647c) {
            this.f3646b = null;
            this.f3647c.notifyAll();
        }
    }

    public void onNullBinding(ComponentName componentName) {
        synchronized (this.f3647c) {
            this.f3647c.notifyAll();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f3647c) {
            this.f3646b = iBinder;
            this.f3647c.notifyAll();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3647c) {
            this.f3646b = null;
            this.f3647c.notifyAll();
        }
    }
}
