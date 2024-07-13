package com.android.billingclient.api;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public interface PurchasesResponseListener {
    void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list);
}
