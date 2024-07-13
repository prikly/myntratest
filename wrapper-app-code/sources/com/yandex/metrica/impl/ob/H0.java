package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

public class H0 {

    /* renamed from: a  reason: collision with root package name */
    private final ICommonExecutor f4065a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final J0 f4066b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final d f4067c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f4068d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f4069e = new b();

    class a implements Runnable {
        a() {
        }

        public void run() {
            H0.this.f4066b.a();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            if (((C0762v2) H0.this.f4067c).b()) {
                H0.this.f4068d.run();
            }
        }
    }

    public static class c {
        public H0 a(ICommonExecutor iCommonExecutor, J0 j0, d dVar) {
            return new H0(iCommonExecutor, j0, dVar);
        }
    }

    public interface d {
    }

    public H0(ICommonExecutor iCommonExecutor, J0 j0, d dVar) {
        this.f4065a = iCommonExecutor;
        this.f4066b = j0;
        this.f4067c = dVar;
    }

    public void d() {
        this.f4065a.remove(this.f4068d);
        this.f4065a.remove(this.f4069e);
    }

    public void a() {
        this.f4065a.remove(this.f4068d);
        this.f4065a.executeDelayed(this.f4068d, 90, TimeUnit.SECONDS);
    }

    public void b() {
        this.f4065a.execute(this.f4069e);
    }

    public void c() {
        this.f4065a.remove(this.f4068d);
        this.f4065a.executeDelayed(this.f4068d, 90, TimeUnit.SECONDS);
    }
}
