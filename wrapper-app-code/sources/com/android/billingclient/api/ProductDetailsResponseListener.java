package com.android.billingclient.api;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public interface ProductDetailsResponseListener {
    void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list);
}
