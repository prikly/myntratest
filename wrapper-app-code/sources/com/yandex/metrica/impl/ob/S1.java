package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;
import java.util.concurrent.TimeUnit;

public class S1<C extends L3> extends C0786w2<C> {

    /* renamed from: e  reason: collision with root package name */
    private Runnable f4909e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final ICommonExecutor f4910f;

    class a implements Runnable {
        a() {
        }

        public void run() {
            S1.this.d();
        }
    }

    public S1(C c2, C0850yi yiVar, ICommonExecutor iCommonExecutor) {
        super(c2, yiVar);
        this.f4910f = iCommonExecutor;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f4910f.remove(this.f4909e);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        super.f();
        Lg m = ((L3) e()).m();
        if (m.F()) {
            String B = m.B();
            if (!TextUtils.isEmpty(B) && !"-1".equals(B)) {
                try {
                    NetworkServiceLocator.getInstance().getNetworkCore().startTask(C0677rd.a((L3) e()));
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void g() {
        synchronized (this.f7017b) {
            if (!this.f7018c) {
                c();
                if (((L3) e()).m().G() > 0) {
                    this.f4910f.executeDelayed(this.f4909e, TimeUnit.SECONDS.toMillis((long) ((L3) e()).m().G()));
                }
            }
        }
    }
}
