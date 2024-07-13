package com.yandex.metrica.billing.v3.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.yandex.metrica.billing_interface.f;
import com.yandex.metrica.billing_interface.g;
import com.yandex.metrica.impl.ob.C0442i;
import com.yandex.metrica.impl.ob.C0466j;
import java.util.Arrays;
import java.util.concurrent.Executor;

class BillingClientStateListenerImpl implements BillingClientStateListener {

    /* renamed from: a  reason: collision with root package name */
    private final C0442i f3433a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f3434b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3435c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final BillingClient f3436d;

    /* renamed from: e  reason: collision with root package name */
    private final C0466j f3437e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final b f3438f;

    class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BillingResult f3439a;

        a(BillingResult billingResult) {
            this.f3439a = billingResult;
        }

        public void a() throws Throwable {
            BillingClientStateListenerImpl.this.a(this.f3439a);
        }
    }

    class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3441a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f3442b;

        class a extends f {
            a() {
            }

            public void a() {
                BillingClientStateListenerImpl.this.f3438f.b(b.this.f3442b);
            }
        }

        b(String str, PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl) {
            this.f3441a = str;
            this.f3442b = purchaseHistoryResponseListenerImpl;
        }

        public void a() throws Throwable {
            if (BillingClientStateListenerImpl.this.f3436d.isReady()) {
                BillingClientStateListenerImpl.this.f3436d.queryPurchaseHistoryAsync(this.f3441a, this.f3442b);
            } else {
                BillingClientStateListenerImpl.this.f3434b.execute(new a());
            }
        }
    }

    BillingClientStateListenerImpl(C0442i iVar, Executor executor, Executor executor2, BillingClient billingClient, C0466j jVar, b bVar) {
        this.f3433a = iVar;
        this.f3434b = executor;
        this.f3435c = executor2;
        this.f3436d = billingClient;
        this.f3437e = jVar;
        this.f3438f = bVar;
    }

    public void onBillingServiceDisconnected() {
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        this.f3434b.execute(new a(billingResult));
    }

    /* access modifiers changed from: private */
    public void a(BillingResult billingResult) throws Throwable {
        if (billingResult.getResponseCode() == 0) {
            for (String str : Arrays.asList(new String[]{"inapp", "subs"})) {
                C0442i iVar = this.f3433a;
                Executor executor = this.f3434b;
                Executor executor2 = this.f3435c;
                BillingClient billingClient = this.f3436d;
                C0466j jVar = this.f3437e;
                b bVar = this.f3438f;
                PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl = new PurchaseHistoryResponseListenerImpl(iVar, executor, executor2, billingClient, jVar, str, bVar, new g());
                bVar.a((Object) purchaseHistoryResponseListenerImpl);
                this.f3435c.execute(new b(str, purchaseHistoryResponseListenerImpl));
            }
        }
    }
}
