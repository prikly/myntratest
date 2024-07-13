package io.bidmachine.ads.networks.notsy;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Map;

class InternalNotsyData {
    private final String adUnitId;
    private final float price;
    private final float score;

    InternalNotsyData(String str, float f2, float f3) {
        this.adUnitId = str;
        this.score = f2;
        this.price = f3;
    }

    /* access modifiers changed from: package-private */
    public String getAdUnitId() {
        return this.adUnitId;
    }

    /* access modifiers changed from: package-private */
    public float getScore() {
        return this.score;
    }

    /* access modifiers changed from: package-private */
    public float getPrice() {
        return this.price;
    }

    public String toString() {
        return String.format("InternalNotsyData(adUnitId - %s, score - %s, price - %s)", new Object[]{this.adUnitId, Float.valueOf(this.score), Float.valueOf(this.price)});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InternalNotsyData internalNotsyData = (InternalNotsyData) obj;
        if (this.adUnitId.equals(internalNotsyData.adUnitId) && Float.compare(internalNotsyData.score, this.score) == 0 && Float.compare(internalNotsyData.price, this.price) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.adUnitId.hashCode() * 31) + Float.floatToIntBits(this.score)) * 31) + Float.floatToIntBits(this.price);
    }

    static class Factory {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class<InternalNotsyData> cls = InternalNotsyData.class;
        }

        Factory() {
        }

        static InternalNotsyData create(Map<String, String> map) {
            if (map == null || map.isEmpty()) {
                return null;
            }
            String str = map.get("ad_unit_id");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String str2 = map.get("score");
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            String str3 = map.get(InAppPurchaseMetaData.KEY_PRICE);
            if (TextUtils.isEmpty(str3)) {
                return null;
            }
            return create(str, str2, str3);
        }

        static InternalNotsyData create(String str, String str2, String str3) {
            return new InternalNotsyData(str, Float.parseFloat(str2), Float.parseFloat(str3));
        }
    }
}
