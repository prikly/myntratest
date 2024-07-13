package com.yandex.metrica.billing.v4.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetailsParams;
import com.appodeal.ads.modules.common.internal.Constants;
import com.yandex.metrica.billing_interface.e;
import com.yandex.metrica.billing_interface.f;
import com.yandex.metrica.billing_interface.g;
import com.yandex.metrica.impl.ob.C0392g;
import com.yandex.metrica.impl.ob.C0442i;
import com.yandex.metrica.impl.ob.C0466j;
import com.yandex.metrica.impl.ob.C0516l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b&\u0010'J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ)\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\b\u0010\rJ9\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0003¢\u0006\u0004\b\b\u0010\u0011J'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0013\u0010\tR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/yandex/metrica/billing/v4/library/PurchaseHistoryResponseListenerImpl;", "Lcom/android/billingclient/api/PurchaseHistoryResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchaseHistoryRecords", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "", "", "Lcom/yandex/metrica/billing_interface/a;", "(Ljava/util/List;)Ljava/util/Map;", "newSkus", "Lkotlin/Function0;", "billingInfoSentListener", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "list", "onPurchaseHistoryResponse", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/yandex/metrica/impl/ob/j;", "c", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "Lcom/yandex/metrica/impl/ob/i;", "Lcom/yandex/metrica/impl/ob/i;", "config", "Lcom/yandex/metrica/billing/v4/library/b;", "e", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "d", "Ljava/lang/String;", "type", "<init>", "(Lcom/yandex/metrica/impl/ob/i;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;Ljava/lang/String;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
public final class PurchaseHistoryResponseListenerImpl implements PurchaseHistoryResponseListener {

    /* renamed from: a  reason: collision with root package name */
    private final C0442i f3496a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final BillingClient f3497b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0466j f3498c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f3499d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final b f3500e;

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f3501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BillingResult f3502b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f3503c;

        a(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, BillingResult billingResult, List list) {
            this.f3501a = purchaseHistoryResponseListenerImpl;
            this.f3502b = billingResult;
            this.f3503c = list;
        }

        public void a() {
            this.f3501a.a(this.f3502b, this.f3503c);
            this.f3501a.f3500e.b(this.f3501a);
        }
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f3504a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f3505b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f3506c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, Map map, Map map2) {
            super(0);
            this.f3504a = purchaseHistoryResponseListenerImpl;
            this.f3505b = map;
            this.f3506c = map2;
        }

        public Object invoke() {
            C0392g gVar = C0392g.f5833a;
            Map map = this.f3505b;
            Map map2 = this.f3506c;
            String access$getType$p = this.f3504a.f3499d;
            C0516l e2 = this.f3504a.f3498c.e();
            Intrinsics.checkNotNullExpressionValue(e2, "utilsProvider.billingInfoManager");
            C0392g.a(gVar, map, map2, access$getType$p, e2, (g) null, 16);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f3507a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuDetailsParams f3508b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SkuDetailsResponseListenerImpl f3509c;

        public static final class a extends f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f3510a;

            a(c cVar) {
                this.f3510a = cVar;
            }

            public void a() {
                this.f3510a.f3507a.f3500e.b(this.f3510a.f3509c);
            }
        }

        c(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, SkuDetailsParams skuDetailsParams, SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl) {
            this.f3507a = purchaseHistoryResponseListenerImpl;
            this.f3508b = skuDetailsParams;
            this.f3509c = skuDetailsResponseListenerImpl;
        }

        public void a() {
            if (this.f3507a.f3497b.isReady()) {
                this.f3507a.f3497b.querySkuDetailsAsync(this.f3508b, this.f3509c);
            } else {
                this.f3507a.f3498c.a().execute(new a(this));
            }
        }
    }

    public PurchaseHistoryResponseListenerImpl(C0442i iVar, BillingClient billingClient, C0466j jVar, String str, b bVar) {
        Intrinsics.checkNotNullParameter(iVar, Constants.CONFIG);
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(jVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f3496a = iVar;
        this.f3497b = billingClient;
        this.f3498c = jVar;
        this.f3499d = str;
        this.f3500e = bVar;
    }

    /* access modifiers changed from: private */
    public final void a(BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        if (billingResult.getResponseCode() == 0 && list != null) {
            Map<String, com.yandex.metrica.billing_interface.a> a2 = a(list);
            Map<String, com.yandex.metrica.billing_interface.a> a3 = this.f3498c.f().a(this.f3496a, a2, this.f3498c.e());
            Intrinsics.checkNotNullExpressionValue(a3, "utilsProvider.updatePoli…lingInfoManager\n        )");
            if (a3.isEmpty()) {
                C0392g gVar = C0392g.f5833a;
                String str = this.f3499d;
                C0516l e2 = this.f3498c.e();
                Intrinsics.checkNotNullExpressionValue(e2, "utilsProvider.billingInfoManager");
                C0392g.a(gVar, a2, a3, str, e2, (g) null, 16);
                return;
            }
            a(list, CollectionsKt.toList(a3.keySet()), new b(this, a2, a3));
        }
    }

    public void onPurchaseHistoryResponse(BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f3498c.a().execute(new a(this, billingResult, list));
    }

    private final Map<String, com.yandex.metrica.billing_interface.a> a(List<? extends PurchaseHistoryRecord> list) {
        e eVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
            Iterator<String> it = purchaseHistoryRecord.getSkus().iterator();
            while (it.hasNext()) {
                String next = it.next();
                String str = this.f3499d;
                Intrinsics.checkNotNullParameter(str, "type");
                int hashCode = str.hashCode();
                if (hashCode != 3541555) {
                    if (hashCode == 100343516 && str.equals("inapp")) {
                        eVar = e.INAPP;
                        com.yandex.metrica.billing_interface.a aVar = new com.yandex.metrica.billing_interface.a(eVar, next, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0);
                        Intrinsics.checkNotNullExpressionValue(next, "info.sku");
                        linkedHashMap.put(next, aVar);
                    }
                } else if (str.equals("subs")) {
                    eVar = e.SUBS;
                    com.yandex.metrica.billing_interface.a aVar2 = new com.yandex.metrica.billing_interface.a(eVar, next, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0);
                    Intrinsics.checkNotNullExpressionValue(next, "info.sku");
                    linkedHashMap.put(next, aVar2);
                }
                eVar = e.UNKNOWN;
                com.yandex.metrica.billing_interface.a aVar22 = new com.yandex.metrica.billing_interface.a(eVar, next, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0);
                Intrinsics.checkNotNullExpressionValue(next, "info.sku");
                linkedHashMap.put(next, aVar22);
            }
        }
        return linkedHashMap;
    }

    private final void a(List<? extends PurchaseHistoryRecord> list, List<String> list2, Function0<Unit> function0) {
        SkuDetailsParams build = SkuDetailsParams.newBuilder().setType(this.f3499d).setSkusList(list2).build();
        Intrinsics.checkNotNullExpressionValue(build, "SkuDetailsParams.newBuil…kus)\n            .build()");
        SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl = new SkuDetailsResponseListenerImpl(this.f3499d, this.f3497b, this.f3498c, function0, list, this.f3500e);
        this.f3500e.a((Object) skuDetailsResponseListenerImpl);
        this.f3498c.c().execute(new c(this, build, skuDetailsResponseListenerImpl));
    }
}
