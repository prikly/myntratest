package com.yandex.metrica.billing.v3.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetailsParams;
import com.yandex.metrica.billing_interface.e;
import com.yandex.metrica.billing_interface.f;
import com.yandex.metrica.billing_interface.g;
import com.yandex.metrica.impl.ob.C0267b;
import com.yandex.metrica.impl.ob.C0442i;
import com.yandex.metrica.impl.ob.C0466j;
import com.yandex.metrica.impl.ob.C0516l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

class PurchaseHistoryResponseListenerImpl implements PurchaseHistoryResponseListener {

    /* renamed from: a  reason: collision with root package name */
    private final C0442i f3445a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f3446b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3447c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final BillingClient f3448d;

    /* renamed from: e  reason: collision with root package name */
    private final C0466j f3449e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3450f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final b f3451g;

    /* renamed from: h  reason: collision with root package name */
    private final g f3452h;

    class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BillingResult f3453a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f3454b;

        a(BillingResult billingResult, List list) {
            this.f3453a = billingResult;
            this.f3454b = list;
        }

        public void a() throws Throwable {
            PurchaseHistoryResponseListenerImpl.this.a(this.f3453a, (List<PurchaseHistoryRecord>) this.f3454b);
            PurchaseHistoryResponseListenerImpl.this.f3451g.b(PurchaseHistoryResponseListenerImpl.this);
        }
    }

    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f3456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f3457b;

        b(Map map, Map map2) {
            this.f3456a = map;
            this.f3457b = map2;
        }

        public Object call() throws Exception {
            PurchaseHistoryResponseListenerImpl.this.a((Map<String, com.yandex.metrica.billing_interface.a>) this.f3456a, (Map<String, com.yandex.metrica.billing_interface.a>) this.f3457b);
            return null;
        }
    }

    class c extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuDetailsParams f3459a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuDetailsResponseListenerImpl f3460b;

        class a extends f {
            a() {
            }

            public void a() {
                PurchaseHistoryResponseListenerImpl.this.f3451g.b(c.this.f3460b);
            }
        }

        c(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl) {
            this.f3459a = skuDetailsParams;
            this.f3460b = skuDetailsResponseListenerImpl;
        }

        public void a() throws Throwable {
            if (PurchaseHistoryResponseListenerImpl.this.f3448d.isReady()) {
                PurchaseHistoryResponseListenerImpl.this.f3448d.querySkuDetailsAsync(this.f3459a, this.f3460b);
            } else {
                PurchaseHistoryResponseListenerImpl.this.f3446b.execute(new a());
            }
        }
    }

    PurchaseHistoryResponseListenerImpl(C0442i iVar, Executor executor, Executor executor2, BillingClient billingClient, C0466j jVar, String str, b bVar, g gVar) {
        this.f3445a = iVar;
        this.f3446b = executor;
        this.f3447c = executor2;
        this.f3448d = billingClient;
        this.f3449e = jVar;
        this.f3450f = str;
        this.f3451g = bVar;
        this.f3452h = gVar;
    }

    public void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
        this.f3446b.execute(new a(billingResult, list));
    }

    /* access modifiers changed from: private */
    public void a(BillingResult billingResult, List<PurchaseHistoryRecord> list) throws Throwable {
        if (billingResult.getResponseCode() == 0 && list != null) {
            Map<String, com.yandex.metrica.billing_interface.a> a2 = a(list);
            Map<String, com.yandex.metrica.billing_interface.a> a3 = this.f3449e.f().a(this.f3445a, a2, this.f3449e.e());
            if (a3.isEmpty()) {
                a(a2, a3);
            } else {
                a(a3, (Callable<Void>) new b(a2, a3));
            }
        }
    }

    private Map<String, com.yandex.metrica.billing_interface.a> a(List<PurchaseHistoryRecord> list) {
        HashMap hashMap = new HashMap();
        for (PurchaseHistoryRecord next : list) {
            e d2 = C0267b.d(this.f3450f);
            String sku = next.getSku();
            hashMap.put(sku, new com.yandex.metrica.billing_interface.a(d2, sku, next.getPurchaseToken(), next.getPurchaseTime(), 0));
        }
        return hashMap;
    }

    private void a(Map<String, com.yandex.metrica.billing_interface.a> map, Callable<Void> callable) {
        SkuDetailsParams build = SkuDetailsParams.newBuilder().setType(this.f3450f).setSkusList(new ArrayList(map.keySet())).build();
        String str = this.f3450f;
        Executor executor = this.f3446b;
        BillingClient billingClient = this.f3448d;
        C0466j jVar = this.f3449e;
        b bVar = this.f3451g;
        SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl = new SkuDetailsResponseListenerImpl(str, executor, billingClient, jVar, callable, map, bVar);
        bVar.a((Object) skuDetailsResponseListenerImpl);
        this.f3447c.execute(new c(build, skuDetailsResponseListenerImpl));
    }

    /* access modifiers changed from: protected */
    public void a(Map<String, com.yandex.metrica.billing_interface.a> map, Map<String, com.yandex.metrica.billing_interface.a> map2) {
        C0516l e2 = this.f3449e.e();
        this.f3452h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        for (com.yandex.metrica.billing_interface.a next : map.values()) {
            if (map2.containsKey(next.f3545b)) {
                next.f3548e = currentTimeMillis;
            } else {
                com.yandex.metrica.billing_interface.a a2 = e2.a(next.f3545b);
                if (a2 != null) {
                    next.f3548e = a2.f3548e;
                }
            }
        }
        e2.a(map);
        if (!e2.a() && "inapp".equals(this.f3450f)) {
            e2.b();
        }
    }
}
