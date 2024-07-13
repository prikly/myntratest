package com.appsgeyser.sdk.inapp.models.statuses;

import com.appsgeyser.sdk.inapp.models.BillingProduct;
import com.appsgeyser.sdk.inapp.models.configdata.ConfigInappData;

public class SuccessStatus implements Status {
    private ConfigInappData configData;
    private boolean isFeatureActive;
    private boolean isFeaturePurchased;
    private BillingProduct product;

    public SuccessStatus(BillingProduct billingProduct, ConfigInappData configInappData, boolean z, boolean z2) {
        this.configData = configInappData;
        this.product = billingProduct;
        this.isFeatureActive = z;
        this.isFeaturePurchased = z2;
    }

    public ConfigInappData getConfigData() {
        return this.configData;
    }

    public BillingProduct getProduct() {
        return this.product;
    }

    public boolean isFeatureActive() {
        return this.isFeatureActive;
    }

    public boolean isFeaturePurchased() {
        return this.isFeaturePurchased;
    }
}
