package com.yandex.metrica.billing.v3.library;

import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import java.util.HashSet;
import java.util.Set;

class b {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f3474a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final BillingClient f3475b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Object> f3476c;

    b(BillingClient billingClient) {
        this(billingClient, new Handler(Looper.getMainLooper()));
    }

    /* access modifiers changed from: package-private */
    public void b(Object obj) {
        this.f3476c.remove(obj);
        if (this.f3476c.size() == 0) {
            this.f3474a.post(new a(this));
        }
    }

    b(BillingClient billingClient, Handler handler) {
        this.f3475b = billingClient;
        this.f3476c = new HashSet();
        this.f3474a = handler;
    }

    /* access modifiers changed from: package-private */
    public void a(Object obj) {
        this.f3476c.add(obj);
    }
}
