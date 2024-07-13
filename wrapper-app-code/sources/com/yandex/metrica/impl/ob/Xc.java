package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Xc implements J0 {

    /* renamed from: a  reason: collision with root package name */
    private final C0352e9 f5334a;

    /* renamed from: b  reason: collision with root package name */
    private final C0810x2 f5335b;

    /* renamed from: c  reason: collision with root package name */
    private Xb f5336c;

    /* renamed from: d  reason: collision with root package name */
    private final H2 f5337d;

    /* renamed from: e  reason: collision with root package name */
    private final TimeProvider f5338e;

    /* renamed from: f  reason: collision with root package name */
    private final a f5339f;

    /* renamed from: g  reason: collision with root package name */
    private final Wc f5340g;

    static class a {
        a() {
        }
    }

    public Xc(Context context, Xb xb) {
        this(xb, H2.a(context));
    }

    public void a(Xb xb) {
        if (!A2.a((Object) this.f5336c, (Object) xb)) {
            this.f5336c = xb;
            if (xb != null && xb.f5332a.f4823a) {
                this.f5340g.a(this.f5337d.b());
            }
        }
    }

    public void b() {
        Xb xb = this.f5336c;
        if (xb != null && xb.f5333b != null && this.f5335b.b(this.f5334a.f(0), this.f5336c.f5333b.f5261b, "last wifi scan attempt time")) {
            this.f5339f.getClass();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (this.f5337d.a(countDownLatch, this.f5340g)) {
                this.f5334a.k(this.f5338e.currentTimeSeconds());
                try {
                    countDownLatch.await(5, TimeUnit.SECONDS);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private Xc(Xb xb, H2 h2) {
        this(h2, F0.g().s(), new C0810x2(), new SystemTimeProvider(), new a(), xb, new Wc((V<List<F2>>) null, h2.a()));
    }

    public void a() {
        Xb xb = this.f5336c;
        if (xb != null && xb.f5332a.f4823a) {
            this.f5340g.a(this.f5337d.b());
        }
    }

    Xc(H2 h2, C0352e9 e9Var, C0810x2 x2Var, TimeProvider timeProvider, a aVar, Xb xb, Wc wc) {
        this.f5337d = h2;
        this.f5334a = e9Var;
        this.f5335b = x2Var;
        this.f5339f = aVar;
        this.f5336c = xb;
        this.f5338e = timeProvider;
        this.f5340g = wc;
    }
}
