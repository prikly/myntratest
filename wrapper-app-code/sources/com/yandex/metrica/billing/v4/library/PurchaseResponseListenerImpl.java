package com.yandex.metrica.billing.v4.library;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
import com.yandex.metrica.billing_interface.d;
import com.yandex.metrica.billing_interface.f;
import com.yandex.metrica.impl.ob.C0271b3;
import com.yandex.metrica.impl.ob.C0342e;
import com.yandex.metrica.impl.ob.C0466j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\f\u0010\rJ)\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0003¢\u0006\u0004\b\b\u0010\rJ%\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006#"}, d2 = {"Lcom/yandex/metrica/billing/v4/library/PurchaseResponseListenerImpl;", "Lcom/android/billingclient/api/PurchasesResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/Purchase;", "purchases", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "", "", "b", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchaseHistoryRecords", "onQueryPurchasesResponse", "Lcom/yandex/metrica/impl/ob/j;", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "Lcom/android/billingclient/api/SkuDetails;", "d", "Ljava/util/List;", "skuDetails", "Lcom/yandex/metrica/billing/v4/library/b;", "e", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "c", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "billingInfoSentListener", "type", "<init>", "(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/j;Lkotlin/jvm/functions/Function0;Ljava/util/List;Ljava/util/List;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
public final class PurchaseResponseListenerImpl implements PurchasesResponseListener {

    /* renamed from: a  reason: collision with root package name */
    private final C0466j f3511a;

    /* renamed from: b  reason: collision with root package name */
    private final Function0<Unit> f3512b;

    /* renamed from: c  reason: collision with root package name */
    private final List<PurchaseHistoryRecord> f3513c;

    /* renamed from: d  reason: collision with root package name */
    private final List<SkuDetails> f3514d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final b f3515e;

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PurchaseResponseListenerImpl f3516a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BillingResult f3517b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f3518c;

        a(PurchaseResponseListenerImpl purchaseResponseListenerImpl, BillingResult billingResult, List list) {
            this.f3516a = purchaseResponseListenerImpl;
            this.f3517b = billingResult;
            this.f3518c = list;
        }

        public void a() {
            this.f3516a.a(this.f3517b, this.f3518c);
            this.f3516a.f3515e.b(this.f3516a);
        }
    }

    public PurchaseResponseListenerImpl(String str, C0466j jVar, Function0<Unit> function0, List<? extends PurchaseHistoryRecord> list, List<? extends SkuDetails> list2, b bVar) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(jVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(function0, "billingInfoSentListener");
        Intrinsics.checkNotNullParameter(list, "purchaseHistoryRecords");
        Intrinsics.checkNotNullParameter(list2, "skuDetails");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f3511a = jVar;
        this.f3512b = function0;
        this.f3513c = list;
        this.f3514d = list2;
        this.f3515e = bVar;
    }

    /* access modifiers changed from: private */
    public final void a(BillingResult billingResult, List<? extends Purchase> list) {
        d dVar;
        if (billingResult.getResponseCode() == 0) {
            Map<String, Purchase> b2 = b(list);
            Map<String, PurchaseHistoryRecord> a2 = a(this.f3513c);
            List<SkuDetails> list2 = this.f3514d;
            ArrayList arrayList = new ArrayList();
            for (SkuDetails skuDetails : list2) {
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) ((LinkedHashMap) a2).get(skuDetails.getSku());
                if (purchaseHistoryRecord != null) {
                    dVar = C0342e.f5696a.a(purchaseHistoryRecord, skuDetails, (Purchase) ((LinkedHashMap) b2).get(skuDetails.getSku()));
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    arrayList.add(dVar);
                }
            }
            ((C0271b3) this.f3511a.d()).a((List<d>) arrayList);
            this.f3512b.invoke();
        }
    }

    private final Map<String, Purchase> b(List<? extends Purchase> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Purchase purchase : list) {
            Iterator<String> it = purchase.getSkus().iterator();
            while (it.hasNext()) {
                String next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                linkedHashMap.put(next, purchase);
            }
        }
        return linkedHashMap;
    }

    public void onQueryPurchasesResponse(BillingResult billingResult, List<? extends Purchase> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(list, "purchases");
        this.f3511a.a().execute(new a(this, billingResult, list));
    }

    private final Map<String, PurchaseHistoryRecord> a(List<? extends PurchaseHistoryRecord> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
            Iterator<String> it = purchaseHistoryRecord.getSkus().iterator();
            while (it.hasNext()) {
                String next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                linkedHashMap.put(next, purchaseHistoryRecord);
            }
        }
        return linkedHashMap;
    }
}
