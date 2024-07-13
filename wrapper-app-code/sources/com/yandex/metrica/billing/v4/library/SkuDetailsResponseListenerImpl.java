package com.yandex.metrica.billing.v4.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.yandex.metrica.billing_interface.f;
import com.yandex.metrica.impl.ob.C0466j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\n\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/yandex/metrica/billing/v4/library/SkuDetailsResponseListenerImpl;", "Lcom/android/billingclient/api/SkuDetailsResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/SkuDetails;", "skuDetails", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "onSkuDetailsResponse", "Lcom/yandex/metrica/impl/ob/j;", "c", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "e", "Ljava/util/List;", "purchaseHistoryRecords", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/Function0;", "billingInfoSentListener", "", "Ljava/lang/String;", "type", "Lcom/yandex/metrica/billing/v4/library/b;", "f", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "<init>", "(Ljava/lang/String;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;Lkotlin/jvm/functions/Function0;Ljava/util/List;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
public final class SkuDetailsResponseListenerImpl implements SkuDetailsResponseListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f3519a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final BillingClient f3520b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0466j f3521c;

    /* renamed from: d  reason: collision with root package name */
    private final Function0<Unit> f3522d;

    /* renamed from: e  reason: collision with root package name */
    private final List<PurchaseHistoryRecord> f3523e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final b f3524f;

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuDetailsResponseListenerImpl f3525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BillingResult f3526b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f3527c;

        a(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl, BillingResult billingResult, List list) {
            this.f3525a = skuDetailsResponseListenerImpl;
            this.f3526b = billingResult;
            this.f3527c = list;
        }

        public void a() {
            this.f3525a.a(this.f3526b, this.f3527c);
            this.f3525a.f3524f.b(this.f3525a);
        }
    }

    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuDetailsResponseListenerImpl f3528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PurchaseResponseListenerImpl f3529b;

        public static final class a extends f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f3530a;

            a(b bVar) {
                this.f3530a = bVar;
            }

            public void a() {
                this.f3530a.f3528a.f3524f.b(this.f3530a.f3529b);
            }
        }

        b(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl, PurchaseResponseListenerImpl purchaseResponseListenerImpl) {
            this.f3528a = skuDetailsResponseListenerImpl;
            this.f3529b = purchaseResponseListenerImpl;
        }

        public void a() {
            if (this.f3528a.f3520b.isReady()) {
                this.f3528a.f3520b.queryPurchasesAsync(this.f3528a.f3519a, (PurchasesResponseListener) this.f3529b);
            } else {
                this.f3528a.f3521c.a().execute(new a(this));
            }
        }
    }

    public SkuDetailsResponseListenerImpl(String str, BillingClient billingClient, C0466j jVar, Function0<Unit> function0, List<? extends PurchaseHistoryRecord> list, b bVar) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(jVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(function0, "billingInfoSentListener");
        Intrinsics.checkNotNullParameter(list, "purchaseHistoryRecords");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f3519a = str;
        this.f3520b = billingClient;
        this.f3521c = jVar;
        this.f3522d = function0;
        this.f3523e = list;
        this.f3524f = bVar;
    }

    /* access modifiers changed from: private */
    public final void a(BillingResult billingResult, List<? extends SkuDetails> list) {
        if (billingResult.getResponseCode() == 0) {
            if (!(list == null || list.isEmpty())) {
                PurchaseResponseListenerImpl purchaseResponseListenerImpl = new PurchaseResponseListenerImpl(this.f3519a, this.f3521c, this.f3522d, this.f3523e, list, this.f3524f);
                this.f3524f.a((Object) purchaseResponseListenerImpl);
                this.f3521c.c().execute(new b(this, purchaseResponseListenerImpl));
            }
        }
    }

    public void onSkuDetailsResponse(BillingResult billingResult, List<? extends SkuDetails> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f3521c.a().execute(new a(this, billingResult, list));
    }
}
