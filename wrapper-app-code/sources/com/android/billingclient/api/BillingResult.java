package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final class BillingResult {
    /* access modifiers changed from: private */
    public int zza;
    /* access modifiers changed from: private */
    public String zzb;

    /* compiled from: com.android.billingclient:billing@@5.1.0 */
    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        /* synthetic */ Builder(zzbb zzbb) {
        }

        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        public Builder setDebugMessage(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder((zzbb) null);
    }

    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    public String toString() {
        String zzl = zzb.zzl(this.zza);
        String str = this.zzb;
        return "Response Code: " + zzl + ", Debug Message: " + str;
    }
}
