package com.yandex.metrica.billing.v3.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.yandex.metrica.billing_interface.c;
import com.yandex.metrica.billing_interface.d;
import com.yandex.metrica.billing_interface.f;
import com.yandex.metrica.impl.ob.C0267b;
import com.yandex.metrica.impl.ob.C0271b3;
import com.yandex.metrica.impl.ob.C0466j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

class SkuDetailsResponseListenerImpl implements SkuDetailsResponseListener {

    /* renamed from: a  reason: collision with root package name */
    private final String f3463a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3464b;

    /* renamed from: c  reason: collision with root package name */
    private final BillingClient f3465c;

    /* renamed from: d  reason: collision with root package name */
    private final C0466j f3466d;

    /* renamed from: e  reason: collision with root package name */
    private final Callable<Void> f3467e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, com.yandex.metrica.billing_interface.a> f3468f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final b f3469g;

    class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BillingResult f3470a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f3471b;

        a(BillingResult billingResult, List list) {
            this.f3470a = billingResult;
            this.f3471b = list;
        }

        public void a() throws Throwable {
            SkuDetailsResponseListenerImpl.this.a(this.f3470a, this.f3471b);
            SkuDetailsResponseListenerImpl.this.f3469g.b(SkuDetailsResponseListenerImpl.this);
        }
    }

    SkuDetailsResponseListenerImpl(String str, Executor executor, BillingClient billingClient, C0466j jVar, Callable<Void> callable, Map<String, com.yandex.metrica.billing_interface.a> map, b bVar) {
        this.f3463a = str;
        this.f3464b = executor;
        this.f3465c = billingClient;
        this.f3466d = jVar;
        this.f3467e = callable;
        this.f3468f = map;
        this.f3469g = bVar;
    }

    private int b(SkuDetails skuDetails) {
        if (!skuDetails.getFreeTrialPeriod().isEmpty()) {
            return 1;
        }
        try {
            return skuDetails.getIntroductoryPriceCycles();
        } catch (Throwable unused) {
        }
        return 0;
    }

    private c c(SkuDetails skuDetails) {
        if (skuDetails.getFreeTrialPeriod().isEmpty()) {
            return c.a(skuDetails.getIntroductoryPricePeriod());
        }
        return c.a(skuDetails.getFreeTrialPeriod());
    }

    public void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
        this.f3464b.execute(new a(billingResult, list));
    }

    /* access modifiers changed from: private */
    public void a(BillingResult billingResult, List<SkuDetails> list) throws Throwable {
        if (billingResult.getResponseCode() == 0 && list != null && !list.isEmpty()) {
            Map<String, Purchase> a2 = a();
            ArrayList arrayList = new ArrayList();
            for (SkuDetails next : list) {
                com.yandex.metrica.billing_interface.a aVar = this.f3468f.get(next.getSku());
                Purchase purchase = (Purchase) ((HashMap) a2).get(next.getSku());
                if (aVar != null) {
                    arrayList.add(a(next, aVar, purchase));
                }
            }
            ((C0271b3) this.f3466d.d()).a((List<d>) arrayList);
            this.f3467e.call();
        }
    }

    private Map<String, Purchase> a() {
        HashMap hashMap = new HashMap();
        Purchase.PurchasesResult queryPurchases = this.f3465c.queryPurchases(this.f3463a);
        List<Purchase> purchasesList = queryPurchases.getPurchasesList();
        if (queryPurchases.getResponseCode() == 0 && purchasesList != null) {
            for (Purchase purchase : purchasesList) {
                hashMap.put(purchase.getSku(), purchase);
            }
        }
        return hashMap;
    }

    private d a(SkuDetails skuDetails, com.yandex.metrica.billing_interface.a aVar, Purchase purchase) {
        com.yandex.metrica.billing_interface.a aVar2 = aVar;
        return new d(C0267b.d(skuDetails.getType()), skuDetails.getSku(), 1, skuDetails.getPriceAmountMicros(), skuDetails.getPriceCurrencyCode(), a(skuDetails), c(skuDetails), b(skuDetails), c.a(skuDetails.getSubscriptionPeriod()), purchase != null ? purchase.getSignature() : "", aVar2.f3546c, aVar2.f3547d, purchase != null ? purchase.isAutoRenewing() : false, purchase != null ? purchase.getOriginalJson() : JsonUtils.EMPTY_JSON);
    }

    private long a(SkuDetails skuDetails) {
        if (skuDetails.getFreeTrialPeriod().isEmpty()) {
            return skuDetails.getIntroductoryPriceAmountMicros();
        }
        return 0;
    }
}
