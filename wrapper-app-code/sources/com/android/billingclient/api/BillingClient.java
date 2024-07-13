package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public abstract class BillingClient {

    /* compiled from: com.android.billingclient:billing@@5.1.0 */
    public static final class Builder {
        private volatile String zza;
        private volatile boolean zzb;
        private final Context zzc;
        private volatile PurchasesUpdatedListener zzd;
        private volatile zzbf zze;
        private volatile zzc zzf;

        /* synthetic */ Builder(Context context, zzq zzq) {
            this.zzc = context;
        }

        public BillingClient build() {
            if (this.zzc == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (this.zzd != null) {
                PurchasesUpdatedListener purchasesUpdatedListener = this.zzd;
                if (this.zzb) {
                    PurchasesUpdatedListener purchasesUpdatedListener2 = this.zzd;
                    if (this.zzd != null) {
                        return new BillingClientImpl((String) null, this.zzb, this.zzc, this.zzd, (zzc) null);
                    }
                    return new BillingClientImpl((String) null, this.zzb, this.zzc, (zzbf) null);
                }
                throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
            } else {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
        }

        public Builder enablePendingPurchases() {
            this.zzb = true;
            return this;
        }

        public Builder setListener(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.zzd = purchasesUpdatedListener;
            return this;
        }
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context, (zzq) null);
    }

    public abstract void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void endConnection();

    public abstract boolean isReady();

    public abstract BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams);

    public abstract void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener);

    @Deprecated
    public abstract void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    public abstract void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);
}
