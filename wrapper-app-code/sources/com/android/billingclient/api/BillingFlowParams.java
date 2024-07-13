package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzm;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public class BillingFlowParams {
    /* access modifiers changed from: private */
    public boolean zza;
    /* access modifiers changed from: private */
    public String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public SubscriptionUpdateParams zzd;
    /* access modifiers changed from: private */
    public zzu zze;
    /* access modifiers changed from: private */
    public ArrayList zzf;
    /* access modifiers changed from: private */
    public boolean zzg;

    /* compiled from: com.android.billingclient:billing@@5.1.0 */
    public static class Builder {
        private String zza;
        private String zzb;
        private List zzc;
        private ArrayList zzd;
        private boolean zze;
        private SubscriptionUpdateParams.Builder zzf;

        private Builder() {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder unused = newBuilder.zzb = true;
            this.zzf = newBuilder;
        }

        public BillingFlowParams build() {
            zzu zzu;
            ArrayList arrayList = this.zzd;
            boolean z = true;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            List list = this.zzc;
            boolean z3 = list != null && !list.isEmpty();
            if (!z2 && !z3) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            } else if (!z2 || !z3) {
                if (!z2) {
                    ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.zzc.get(0);
                    int i = 0;
                    while (i < this.zzc.size()) {
                        ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.zzc.get(i);
                        if (productDetailsParams2 == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        } else if (i == 0 || productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) || productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                            i++;
                        } else {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                    String zza2 = productDetailsParams.zza().zza();
                    for (ProductDetailsParams productDetailsParams3 : this.zzc) {
                        if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !zza2.equals(productDetailsParams3.zza().zza())) {
                            throw new IllegalArgumentException("All products must have the same package name.");
                        }
                    }
                } else if (this.zzd.contains((Object) null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                } else if (this.zzd.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.zzd.get(0);
                    String type = skuDetails.getType();
                    ArrayList arrayList2 = this.zzd;
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i2);
                        if (type.equals("play_pass_subs") || skuDetails2.getType().equals("play_pass_subs") || type.equals(skuDetails2.getType())) {
                            i2++;
                        } else {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String zzd2 = skuDetails.zzd();
                    ArrayList arrayList3 = this.zzd;
                    int size2 = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i3);
                        if (type.equals("play_pass_subs") || skuDetails3.getType().equals("play_pass_subs") || zzd2.equals(skuDetails3.zzd())) {
                            i3++;
                        } else {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
                BillingFlowParams billingFlowParams = new BillingFlowParams((zzba) null);
                if ((!z2 || ((SkuDetails) this.zzd.get(0)).zzd().isEmpty()) && (!z3 || ((ProductDetailsParams) this.zzc.get(0)).zza().zza().isEmpty())) {
                    z = false;
                }
                billingFlowParams.zza = z;
                billingFlowParams.zzb = this.zza;
                billingFlowParams.zzc = this.zzb;
                billingFlowParams.zzd = this.zzf.build();
                ArrayList arrayList4 = this.zzd;
                billingFlowParams.zzf = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
                billingFlowParams.zzg = this.zze;
                List list2 = this.zzc;
                if (list2 != null) {
                    zzu = zzu.zzk(list2);
                } else {
                    zzu = zzu.zzl();
                }
                billingFlowParams.zze = zzu;
                return billingFlowParams;
            } else {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
        }

        public Builder setProductDetailsParamsList(List<ProductDetailsParams> list) {
            this.zzc = new ArrayList(list);
            return this;
        }

        /* synthetic */ Builder(zzav zzav) {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder unused = newBuilder.zzb = true;
            this.zzf = newBuilder;
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.1.0 */
    public static final class ProductDetailsParams {
        private final ProductDetails zza;
        private final String zzb;

        /* compiled from: com.android.billingclient:billing@@5.1.0 */
        public static class Builder {
            /* access modifiers changed from: private */
            public ProductDetails zza;
            /* access modifiers changed from: private */
            public String zzb;

            private Builder() {
            }

            /* synthetic */ Builder(zzaw zzaw) {
            }

            public ProductDetailsParams build() {
                zzm.zzc(this.zza, "ProductDetails is required for constructing ProductDetailsParams.");
                zzm.zzc(this.zzb, "offerToken is required for constructing ProductDetailsParams.");
                return new ProductDetailsParams(this, (zzax) null);
            }

            public Builder setProductDetails(ProductDetails productDetails) {
                this.zza = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                        this.zzb = productDetails.getOneTimePurchaseOfferDetails().zza();
                    } else {
                        throw null;
                    }
                }
                return this;
            }
        }

        /* synthetic */ ProductDetailsParams(Builder builder, zzax zzax) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        public static Builder newBuilder() {
            return new Builder((zzaw) null);
        }

        public final ProductDetails zza() {
            return this.zza;
        }

        public final String zzb() {
            return this.zzb;
        }
    }

    /* compiled from: com.android.billingclient:billing@@5.1.0 */
    public static class SubscriptionUpdateParams {
        /* access modifiers changed from: private */
        public String zza;
        /* access modifiers changed from: private */
        public int zzb = 0;

        /* compiled from: com.android.billingclient:billing@@5.1.0 */
        public static class Builder {
            private String zza;
            /* access modifiers changed from: private */
            public boolean zzb;
            private int zzc = 0;

            private Builder() {
            }

            /* synthetic */ Builder(zzay zzay) {
            }

            public SubscriptionUpdateParams build() {
                boolean z = !TextUtils.isEmpty(this.zza) || !TextUtils.isEmpty((CharSequence) null);
                boolean isEmpty = true ^ TextUtils.isEmpty((CharSequence) null);
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                } else if (this.zzb || z || isEmpty) {
                    SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams((zzaz) null);
                    subscriptionUpdateParams.zza = this.zza;
                    subscriptionUpdateParams.zzb = this.zzc;
                    return subscriptionUpdateParams;
                } else {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
            }
        }

        private SubscriptionUpdateParams() {
        }

        /* synthetic */ SubscriptionUpdateParams(zzaz zzaz) {
        }

        public static Builder newBuilder() {
            return new Builder((zzay) null);
        }

        /* access modifiers changed from: package-private */
        public final int zza() {
            return this.zzb;
        }

        /* access modifiers changed from: package-private */
        public final String zzc() {
            return this.zza;
        }
    }

    private BillingFlowParams() {
    }

    /* synthetic */ BillingFlowParams(zzba zzba) {
    }

    public static Builder newBuilder() {
        return new Builder((zzav) null);
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd.zzc();
    }

    public final ArrayList zze() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zzf);
        return arrayList;
    }

    public final List zzf() {
        return this.zze;
    }

    public final boolean zzn() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzo() {
        return (this.zzb == null && this.zzc == null && this.zzd.zza() == 0 && !this.zza && !this.zzg) ? false : true;
    }
}
