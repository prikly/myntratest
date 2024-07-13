package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C0268b0;
import java.util.ArrayList;
import java.util.List;

public class J2 implements C0519l2 {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0539lm<Context, Intent, Void>> f4303a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4304b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4305c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f4306d;

    /* renamed from: e  reason: collision with root package name */
    private final C0268b0 f4307e;

    class a implements C0514km<Context, Intent> {
        a() {
        }

        public void a(Object obj, Object obj2) {
            J2.a(J2.this, (Context) obj, (Intent) obj2);
        }
    }

    public J2(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, new C0268b0.a());
    }

    public synchronized void a() {
        this.f4305c = true;
        if (!this.f4303a.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f4307e.a(this.f4306d, intentFilter);
            this.f4304b = true;
        }
    }

    public synchronized void b() {
        this.f4305c = false;
        if (this.f4304b) {
            this.f4307e.a(this.f4306d);
            this.f4304b = false;
        }
    }

    J2(Context context, ICommonExecutor iCommonExecutor, C0268b0.a aVar) {
        this.f4303a = new ArrayList();
        this.f4304b = false;
        this.f4305c = false;
        this.f4306d = context;
        this.f4307e = aVar.a(new Kl(new a(), iCommonExecutor));
    }

    public synchronized void b(C0539lm<Context, Intent, Void> lmVar) {
        this.f4303a.remove(lmVar);
        if (this.f4303a.isEmpty() && this.f4304b) {
            this.f4307e.a(this.f4306d);
            this.f4304b = false;
        }
    }

    public synchronized void a(C0539lm<Context, Intent, Void> lmVar) {
        this.f4303a.add(lmVar);
        if (this.f4305c && !this.f4304b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f4307e.a(this.f4306d, intentFilter);
            this.f4304b = true;
        }
    }

    static void a(J2 j2, Context context, Intent intent) {
        synchronized (j2) {
            for (C0539lm<Context, Intent, Void> a2 : j2.f4303a) {
                a2.a(context, intent);
            }
        }
    }
}
