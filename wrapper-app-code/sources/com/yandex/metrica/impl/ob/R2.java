package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.e;
import com.yandex.metrica.i;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class R2 implements O0 {

    /* renamed from: f  reason: collision with root package name */
    private static volatile R2 f4841f = null;

    /* renamed from: g  reason: collision with root package name */
    private static volatile boolean f4842g = false;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f4843a;

    /* renamed from: b  reason: collision with root package name */
    private final Q2 f4844b;

    /* renamed from: c  reason: collision with root package name */
    private final FutureTask<T0> f4845c;

    /* renamed from: d  reason: collision with root package name */
    private final S0 f4846d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Im f4847e;

    class a implements Callable<T0> {
        a() {
        }

        public Object call() throws Exception {
            return R2.a(R2.this);
        }
    }

    private R2(Context context, Q2 q2, Im im) {
        this(context, q2, q2.a(context, im), im);
    }

    public static R2 a(Context context) {
        if (f4841f == null) {
            synchronized (R2.class) {
                if (f4841f == null) {
                    f4841f = new R2(context.getApplicationContext(), new Q2(), P.g().d());
                    R2 r2 = f4841f;
                    r2.f4847e.b().execute(new S2(r2));
                }
            }
        }
        return f4841f;
    }

    private static C0568n1 f() {
        if (i()) {
            return f4841f.g();
        }
        return P.g().f();
    }

    private T0 g() {
        try {
            return this.f4845c.get();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static synchronized boolean h() {
        boolean z;
        synchronized (R2.class) {
            z = f4842g;
        }
        return z;
    }

    public static synchronized boolean i() {
        boolean z;
        synchronized (R2.class) {
            z = (f4841f == null || !f4841f.f4845c.isDone() || f4841f.g().d() == null) ? false : true;
        }
        return z;
    }

    public static synchronized void j() {
        synchronized (R2.class) {
            f4842g = true;
        }
    }

    public static R2 k() {
        return f4841f;
    }

    public C0493k1 d() {
        return g().d();
    }

    public Eb e() {
        return this.f4846d.d();
    }

    public static void b(boolean z) {
        f().a(z);
    }

    public static void c(boolean z) {
        f().setStatisticsSending(z);
    }

    R2(Context context, Q2 q2, S0 s0, Im im) {
        this.f4843a = context;
        this.f4844b = q2;
        this.f4846d = s0;
        this.f4847e = im;
        FutureTask<T0> futureTask = new FutureTask<>(new a());
        this.f4845c = futureTask;
        im.b().execute(futureTask);
    }

    public void b(i iVar) {
        this.f4846d.a(iVar, this);
    }

    public void c(e eVar) {
        g().c(eVar);
    }

    public void b(YandexMetricaConfig yandexMetricaConfig, i iVar) {
        g().a(yandexMetricaConfig, iVar);
    }

    public String c() {
        return g().c();
    }

    public void b(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        g().a(appMetricaDeviceIDListener);
    }

    public N0 b() {
        return g().b();
    }

    public static void a(Location location) {
        f().a(location);
    }

    public static void a(boolean z) {
        f().b(z);
    }

    public static void a(String str, String str2) {
        f().c(str, str2);
    }

    public static void a(String str) {
        f().setUserProfileID(str);
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        g().a(deferredDeeplinkParametersListener);
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        g().a(deferredDeeplinkListener);
    }

    public M0 a(e eVar) {
        return g().a(eVar);
    }

    public String a() {
        return g().a();
    }

    public void a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        g().a(iIdentifierCallback, list);
    }

    public void a(Map<String, Object> map) {
        this.f4846d.a(map);
    }

    static T0 a(R2 r2) {
        return r2.f4844b.a(r2.f4843a, r2.f4846d);
    }
}
