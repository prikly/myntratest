package com.yandex.metrica.billing.v4.library;

import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Object> f3532a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final BillingClient f3533b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f3534c;

    public b(BillingClient billingClient, Handler handler) {
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(handler, "mainHandler");
        this.f3533b = billingClient;
        this.f3534c = handler;
        this.f3532a = new LinkedHashSet();
    }

    public final void b(Object obj) {
        Intrinsics.checkNotNullParameter(obj, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f3532a.remove(obj);
        if (this.f3532a.size() == 0) {
            this.f3534c.post(new a(this));
        }
    }

    public final void a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f3532a.add(obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(BillingClient billingClient, Handler handler, int i) {
        this(billingClient, (i & 2) != 0 ? new Handler(Looper.getMainLooper()) : null);
    }
}
