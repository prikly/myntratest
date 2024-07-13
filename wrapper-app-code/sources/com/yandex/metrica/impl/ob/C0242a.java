package com.yandex.metrica.impl.ob;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.a  reason: case insensitive filesystem */
public class C0242a {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final long f5434f = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a  reason: collision with root package name */
    private final b f5435a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5436b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Thread f5437c = new c();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f5438d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f5439e = new C0050a();

    /* renamed from: com.yandex.metrica.impl.ob.a$a  reason: collision with other inner class name */
    class C0050a implements Runnable {
        C0050a() {
        }

        public void run() {
            C0242a.this.f5438d.set(true);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a$b */
    public interface b {
        void a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.a$c */
    private class c extends Thread {
        public c() {
        }

        public void run() {
            boolean z = false;
            int i = 0;
            while (!isInterrupted()) {
                if (!z) {
                    C0242a.this.f5438d.set(false);
                    C0242a.this.f5436b.post(C0242a.this.f5439e);
                    i = 0;
                }
                try {
                    Thread.sleep(C0242a.f5434f);
                    if (!C0242a.this.f5438d.get()) {
                        i++;
                        if (i == 4 && !Debug.isDebuggerConnected()) {
                            C0242a.this.b();
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public C0242a(b bVar) {
        this.f5435a = bVar;
    }

    public void b() {
        this.f5435a.a();
    }

    public void c() {
        try {
            this.f5437c.setName("CR-WatchDog");
        } catch (SecurityException unused) {
        }
        this.f5437c.start();
    }
}
