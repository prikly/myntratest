package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzu;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final class ProductDetails {
    private final String zza;
    private final JSONObject zzb;
    private final String zzc;
    private final String zzd = this.zzb.optString("type");
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final String zzi;
    private final List zzj;
    private final List zzk;
    private final zzbi zzl;

    /* compiled from: com.android.billingclient:billing@@5.1.0 */
    public static final class OneTimePurchaseOfferDetails {
        private final String zza;
        private final long zzb;
        private final String zzc;
        private final String zzd;
        private final String zze;
        private final zzu zzf;

        OneTimePurchaseOfferDetails(JSONObject jSONObject) throws JSONException {
            this.zza = jSONObject.optString("formattedPrice");
            this.zzb = jSONObject.optLong("priceAmountMicros");
            this.zzc = jSONObject.optString("priceCurrencyCode");
            this.zzd = jSONObject.optString("offerIdToken");
            this.zze = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.zzf = zzu.zzk(arrayList);
        }

        public String getFormattedPrice() {
            return this.zza;
        }

        public final String zza() {
            return this.zzd;
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.1.0 */
    public static final class PricingPhase {
        private final int billingCycleCount;
        private final String billingPeriod;
        private final String formattedPrice;
        private final long priceAmountMicros;
        private final String priceCurrencyCode;
        private final int recurrenceMode;

        PricingPhase(JSONObject jSONObject) {
            this.billingPeriod = jSONObject.optString("billingPeriod");
            this.priceCurrencyCode = jSONObject.optString("priceCurrencyCode");
            this.formattedPrice = jSONObject.optString("formattedPrice");
            this.priceAmountMicros = jSONObject.optLong("priceAmountMicros");
            this.recurrenceMode = jSONObject.optInt("recurrenceMode");
            this.billingCycleCount = jSONObject.optInt("billingCycleCount");
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.1.0 */
    public static class PricingPhases {
        private final List<PricingPhase> pricingPhaseList;

        PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new PricingPhase(optJSONObject));
                    }
                }
            }
            this.pricingPhaseList = arrayList;
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.1.0 */
    public static final class SubscriptionOfferDetails {
        private final String zza;
        private final String zzb;
        private final String zzc;
        private final PricingPhases zzd;
        private final List zze;
        private final zzbh zzf;

        SubscriptionOfferDetails(JSONObject jSONObject) throws JSONException {
            this.zza = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            zzbh zzbh = null;
            this.zzb = true == optString.isEmpty() ? null : optString;
            this.zzc = jSONObject.getString("offerIdToken");
            this.zzd = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.zzf = optJSONObject != null ? new zzbh(optJSONObject) : zzbh;
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.zze = arrayList;
        }
    }

    ProductDetails(String str) throws JSONException {
        ArrayList arrayList;
        this.zza = str;
        JSONObject jSONObject = new JSONObject(this.zza);
        this.zzb = jSONObject;
        this.zzc = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        if (TextUtils.isEmpty(this.zzc)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        } else if (!TextUtils.isEmpty(this.zzd)) {
            this.zze = this.zzb.optString("title");
            this.zzf = this.zzb.optString("name");
            this.zzg = this.zzb.optString("description");
            this.zzh = this.zzb.optString("skuDetailsToken");
            this.zzi = this.zzb.optString("serializedDocid");
            JSONArray optJSONArray = this.zzb.optJSONArray("subscriptionOfferDetails");
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList2.add(new SubscriptionOfferDetails(optJSONArray.getJSONObject(i)));
                }
                this.zzj = arrayList2;
            } else {
                if (this.zzd.equals("subs") || this.zzd.equals("play_pass_subs")) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                this.zzj = arrayList;
            }
            JSONObject optJSONObject = this.zzb.optJSONObject("oneTimePurchaseOfferDetails");
            JSONArray optJSONArray2 = this.zzb.optJSONArray("oneTimePurchaseOfferDetailsList");
            ArrayList arrayList3 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    arrayList3.add(new OneTimePurchaseOfferDetails(optJSONArray2.getJSONObject(i2)));
                }
                this.zzk = arrayList3;
            } else if (optJSONObject != null) {
                arrayList3.add(new OneTimePurchaseOfferDetails(optJSONObject));
                this.zzk = arrayList3;
            } else {
                this.zzk = null;
            }
            JSONObject optJSONObject2 = this.zzb.optJSONObject("limitedQuantityInfo");
            if (optJSONObject2 != null) {
                this.zzl = new zzbi(optJSONObject2);
            } else {
                this.zzl = null;
            }
        } else {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetails)) {
            return false;
        }
        return TextUtils.equals(this.zza, ((ProductDetails) obj).zza);
    }

    public String getDescription() {
        return this.zzg;
    }

    public String getName() {
        return this.zzf;
    }

    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        List list = this.zzk;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) this.zzk.get(0);
    }

    public String getProductId() {
        return this.zzc;
    }

    public String getProductType() {
        return this.zzd;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public String toString() {
        String str = this.zza;
        String obj = this.zzb.toString();
        String str2 = this.zzc;
        String str3 = this.zzd;
        String str4 = this.zze;
        String str5 = this.zzh;
        String valueOf = String.valueOf(this.zzj);
        return "ProductDetails{jsonString='" + str + "', parsedJson=" + obj + ", productId='" + str2 + "', productType='" + str3 + "', title='" + str4 + "', productDetailsToken='" + str5 + "', subscriptionOfferDetails=" + valueOf + "}";
    }

    public final String zza() {
        return this.zzb.optString("packageName");
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzh;
    }

    public String zzc() {
        return this.zzi;
    }
}
