package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public class Purchase {
    private final String zza;
    private final String zzb;
    private final JSONObject zzc = new JSONObject(this.zza);

    public Purchase(String str, String str2) throws JSONException {
        this.zza = str;
        this.zzb = str2;
    }

    private final ArrayList zza() {
        ArrayList arrayList = new ArrayList();
        if (this.zzc.has("productIds")) {
            JSONArray optJSONArray = this.zzc.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (this.zzc.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(this.zzc.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.zza, purchase.getOriginalJson()) && TextUtils.equals(this.zzb, purchase.getSignature());
    }

    public String getOriginalJson() {
        return this.zza;
    }

    public List<String> getProducts() {
        return zza();
    }

    public int getPurchaseState() {
        return this.zzc.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public String getPurchaseToken() {
        JSONObject jSONObject = this.zzc;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String getSignature() {
        return this.zzb;
    }

    @Deprecated
    public ArrayList<String> getSkus() {
        return zza();
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public boolean isAcknowledged() {
        return this.zzc.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.zzc.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.zza));
    }
}
