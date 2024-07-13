package com.yandex.metrica.billing.v4.library;

import android.os.Handler;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.appodeal.ads.modules.common.internal.Constants;
import com.yandex.metrica.billing_interface.f;
import com.yandex.metrica.impl.ob.C0442i;
import com.yandex.metrica.impl.ob.C0466j;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/yandex/metrica/billing/v4/library/BillingClientStateListenerImpl;", "Lcom/android/billingclient/api/BillingClientStateListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "a", "(Lcom/android/billingclient/api/BillingResult;)V", "onBillingSetupFinished", "onBillingServiceDisconnected", "()V", "Lcom/yandex/metrica/impl/ob/i;", "Lcom/yandex/metrica/impl/ob/i;", "config", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/yandex/metrica/impl/ob/j;", "c", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "Lcom/yandex/metrica/billing/v4/library/b;", "d", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "<init>", "(Lcom/yandex/metrica/impl/ob/i;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;Lcom/yandex/metrica/billing/v4/library/b;)V", "(Lcom/yandex/metrica/impl/ob/i;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;)V", "billing-v4_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
public final class BillingClientStateListenerImpl implements BillingClientStateListener {

    /* renamed from: a  reason: collision with root package name */
    private final C0442i f3486a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final BillingClient f3487b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0466j f3488c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final b f3489d;

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BillingClientStateListenerImpl f3490a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BillingResult f3491b;

        a(BillingClientStateListenerImpl billingClientStateListenerImpl, BillingResult billingResult) {
            this.f3490a = billingClientStateListenerImpl;
            this.f3491b = billingResult;
        }

        public void a() {
            this.f3490a.a(this.f3491b);
        }
    }

    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3492a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f3493b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BillingClientStateListenerImpl f3494c;

        public static final class a extends f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f3495a;

            a(b bVar) {
                this.f3495a = bVar;
            }

            public void a() {
                this.f3495a.f3494c.f3489d.b(this.f3495a.f3493b);
            }
        }

        b(String str, PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, BillingClientStateListenerImpl billingClientStateListenerImpl) {
            this.f3492a = str;
            this.f3493b = purchaseHistoryResponseListenerImpl;
            this.f3494c = billingClientStateListenerImpl;
        }

        public void a() {
            if (this.f3494c.f3487b.isReady()) {
                this.f3494c.f3487b.queryPurchaseHistoryAsync(this.f3492a, this.f3493b);
            } else {
                this.f3494c.f3488c.a().execute(new a(this));
            }
        }
    }

    public BillingClientStateListenerImpl(C0442i iVar, BillingClient billingClient, C0466j jVar, b bVar) {
        Intrinsics.checkNotNullParameter(iVar, Constants.CONFIG);
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(jVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f3486a = iVar;
        this.f3487b = billingClient;
        this.f3488c = jVar;
        this.f3489d = bVar;
    }

    /* access modifiers changed from: private */
    public final void a(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            for (String str : CollectionsKt.listOf("inapp", "subs")) {
                PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl = new PurchaseHistoryResponseListenerImpl(this.f3486a, this.f3487b, this.f3488c, str, this.f3489d);
                this.f3489d.a((Object) purchaseHistoryResponseListenerImpl);
                this.f3488c.c().execute(new b(str, purchaseHistoryResponseListenerImpl, this));
            }
        }
    }

    public void onBillingServiceDisconnected() {
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f3488c.a().execute(new a(this, billingResult));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BillingClientStateListenerImpl(C0442i iVar, BillingClient billingClient, C0466j jVar) {
        this(iVar, billingClient, jVar, new b(billingClient, (Handler) null, 2));
        Intrinsics.checkNotNullParameter(iVar, Constants.CONFIG);
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(jVar, "utilsProvider");
    }
}
