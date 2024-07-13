package com.appsgeyser.sdk.inapp.billing;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.appsgeyser.sdk.inapp.models.BillingProduct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BillingAdapter {
    private final BillingClient billingClient;
    /* access modifiers changed from: private */
    public BillingEventListener eventListener;
    private final List<String> inappList;
    /* access modifiers changed from: private */
    public List<ProductDetails> productList;
    private final String productsType;
    /* access modifiers changed from: private */
    public List<Purchase> purchaseList;
    /* access modifiers changed from: private */
    public ProductDetails purchasedProduct;

    public interface BillingEventListener {
        void onConnectionError();

        void onProductReceiveError(String str);

        void onProductReceiveSuccess(List<BillingProduct> list);

        void onPurchaseError(int i, String str);

        void onPurchaseSuccess(String str, String str2, String str3);
    }

    public BillingAdapter(Context context, List<String> list, String str, BillingEventListener billingEventListener) {
        this.eventListener = billingEventListener;
        this.inappList = list;
        this.productsType = str;
        BillingClient build = BillingClient.newBuilder(context).setListener(new PurchasesListener()).enablePendingPurchases().build();
        this.billingClient = build;
        build.startConnection(new BillingStateListener());
    }

    public void purchase(Activity activity, String str) {
        List<ProductDetails> list = this.productList;
        if (list == null) {
            this.eventListener.onPurchaseError(0, "product list is empty");
            return;
        }
        ProductDetails productDetails = null;
        for (ProductDetails next : list) {
            if (next.getProductId().equals(str)) {
                productDetails = next;
            }
        }
        if (productDetails == null) {
            Log.e("BillingAdapter", "ПРИ ПОКУПКИ ПЕРЕДАН НЕПРАВЛЬНЫЙ ИДЕНТИФИКАТОР ТОВАРА");
            return;
        }
        this.purchasedProduct = productDetails;
        this.billingClient.launchBillingFlow(activity, BillingFlowParams.newBuilder().setProductDetailsParamsList(Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build())).build());
        Log.d("BillingAdapter", getValue(getPrice(productDetails.getOneTimePurchaseOfferDetails())));
        Log.d("BillingAdapter", getCurrency(getPrice(productDetails.getOneTimePurchaseOfferDetails())));
    }

    /* access modifiers changed from: private */
    public void initBilling() {
        ArrayList arrayList = new ArrayList();
        for (String productId : this.inappList) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(productId).setProductType(this.productsType).build());
        }
        QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(this.productsType).build(), (PurchasesResponseListener) new PurchaseResponseListener());
        this.billingClient.queryProductDetailsAsync(build, new ProductResponseListener());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void createBillingProductList() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.List<com.android.billingclient.api.ProductDetails> r0 = r11.productList     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0082
            java.util.List<com.android.billingclient.api.Purchase> r0 = r11.purchaseList     // Catch:{ all -> 0x0084 }
            if (r0 != 0) goto L_0x000b
            goto L_0x0082
        L_0x000b:
            java.util.List<com.android.billingclient.api.ProductDetails> r0 = r11.productList     // Catch:{ all -> 0x0084 }
            int r0 = r0.size()     // Catch:{ all -> 0x0084 }
            if (r0 != 0) goto L_0x001c
            com.appsgeyser.sdk.inapp.billing.BillingAdapter$BillingEventListener r0 = r11.eventListener     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "ПРИШЛИ ПУСТЫЕ СПИСКИ ТОВАРОВ"
            r0.onProductReceiveError(r1)     // Catch:{ all -> 0x0084 }
            monitor-exit(r11)
            return
        L_0x001c:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0084 }
            r0.<init>()     // Catch:{ all -> 0x0084 }
            java.util.List<com.android.billingclient.api.ProductDetails> r1 = r11.productList     // Catch:{ all -> 0x0084 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0084 }
        L_0x0027:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x007b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0084 }
            com.android.billingclient.api.ProductDetails r2 = (com.android.billingclient.api.ProductDetails) r2     // Catch:{ all -> 0x0084 }
            java.util.List<com.android.billingclient.api.Purchase> r3 = r11.purchaseList     // Catch:{ all -> 0x0084 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0084 }
            r4 = 0
            r10 = 0
        L_0x003b:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0084 }
            if (r5 == 0) goto L_0x005d
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0084 }
            com.android.billingclient.api.Purchase r5 = (com.android.billingclient.api.Purchase) r5     // Catch:{ all -> 0x0084 }
            java.util.List r5 = r5.getProducts()     // Catch:{ all -> 0x0084 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = r2.getProductId()     // Catch:{ all -> 0x0084 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0084 }
            if (r5 == 0) goto L_0x003b
            r10 = 1
            goto L_0x003b
        L_0x005d:
            com.appsgeyser.sdk.inapp.models.BillingProduct r3 = new com.appsgeyser.sdk.inapp.models.BillingProduct     // Catch:{ all -> 0x0084 }
            com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails r4 = r2.getOneTimePurchaseOfferDetails()     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = r11.getPrice(r4)     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = r2.getProductId()     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = r2.getName()     // Catch:{ all -> 0x0084 }
            java.lang.String r9 = r2.getDescription()     // Catch:{ all -> 0x0084 }
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0084 }
            r0.add(r3)     // Catch:{ all -> 0x0084 }
            goto L_0x0027
        L_0x007b:
            com.appsgeyser.sdk.inapp.billing.BillingAdapter$BillingEventListener r1 = r11.eventListener     // Catch:{ all -> 0x0084 }
            r1.onProductReceiveSuccess(r0)     // Catch:{ all -> 0x0084 }
            monitor-exit(r11)
            return
        L_0x0082:
            monitor-exit(r11)
            return
        L_0x0084:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsgeyser.sdk.inapp.billing.BillingAdapter.createBillingProductList():void");
    }

    /* access modifiers changed from: private */
    public void acknowledgePurchase(Purchase purchase) {
        if (purchase.getPurchaseState() == 1 && !purchase.isAcknowledged()) {
            this.billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new AcknowledgeResponseListener());
        }
    }

    /* access modifiers changed from: private */
    public String getValue(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == ',' || charAt == '.') {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public String getCurrency(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!(Character.isDigit(charAt) || charAt == ',' || charAt == '.' || charAt == 160 || Character.isWhitespace(charAt))) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    private class AcknowledgeResponseListener implements AcknowledgePurchaseResponseListener {
        private AcknowledgeResponseListener() {
        }

        public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
            Log.e("BillingAdapter", "onAcknowledgePurchaseResponse billingResultCode = " + billingResult.getResponseCode() + " message = " + billingResult.getDebugMessage());
            if (billingResult.getResponseCode() == 0) {
                BillingAdapter billingAdapter = BillingAdapter.this;
                String access$600 = billingAdapter.getPrice(billingAdapter.purchasedProduct.getOneTimePurchaseOfferDetails());
                BillingAdapter.this.eventListener.onPurchaseSuccess(BillingAdapter.this.getValue(access$600), BillingAdapter.this.getCurrency(access$600), BillingAdapter.this.purchasedProduct.getProductId());
            }
        }
    }

    private class PurchaseResponseListener implements PurchasesResponseListener {
        private PurchaseResponseListener() {
        }

        public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
            Log.w("BillingAdapter", "onQueryPurchasesResponse");
            Log.w("BillingAdapter", "billingResult = " + billingResult);
            if (billingResult.getResponseCode() == 0) {
                List unused = BillingAdapter.this.purchaseList = list;
                BillingAdapter.this.createBillingProductList();
            }
        }
    }

    private class ProductResponseListener implements ProductDetailsResponseListener {
        private ProductResponseListener() {
        }

        public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
            Log.e("BillingAdapter", "onProductDetailsResponse = " + billingResult.getResponseCode());
            if (billingResult.getResponseCode() == 0) {
                List unused = BillingAdapter.this.productList = list;
                BillingAdapter.this.createBillingProductList();
                Log.e("BillingAdapter", "List size = " + list.size());
            }
        }
    }

    private class BillingStateListener implements BillingClientStateListener {
        private BillingStateListener() {
        }

        public void onBillingServiceDisconnected() {
            Log.e("BillingAdapter", "onBillingServiceDisconnected");
            BillingAdapter.this.eventListener.onConnectionError();
        }

        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult.getResponseCode() == 0) {
                Log.d("BillingAdapter", "onBillingSetupFinished CONNECTION SUCCESS!");
                BillingAdapter.this.initBilling();
                return;
            }
            BillingAdapter.this.eventListener.onConnectionError();
        }
    }

    private class PurchasesListener implements PurchasesUpdatedListener {
        private PurchasesListener() {
        }

        public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
            Log.d("BillingAdapter", "onPurchasesUpdated responseCode = " + billingResult.getResponseCode());
            if (billingResult.getResponseCode() == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("onPurchasesUpdated list == null -> = ");
                sb.append(list == null);
                Log.d("BillingAdapter", sb.toString());
                if (list != null) {
                    BillingAdapter.this.acknowledgePurchase(list.get(list.size() - 1));
                    return;
                }
                return;
            }
            BillingAdapter.this.eventListener.onPurchaseError(billingResult.getResponseCode(), billingResult.getDebugMessage());
        }
    }

    /* access modifiers changed from: private */
    public String getPrice(ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails) {
        return oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getFormattedPrice() : "???";
    }
}
