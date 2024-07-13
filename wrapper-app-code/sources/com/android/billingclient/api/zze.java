package com.android.billingclient.api;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final class zze {
    private final String zza;
    private final String zzb;
    private final String zzc;

    /* synthetic */ zze(JSONObject jSONObject, zzd zzd) {
        this.zza = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.zzb = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.zzc = true == optString.isEmpty() ? null : optString;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r4.zzc;
        r5 = r5.zzc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.android.billingclient.api.zze
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.android.billingclient.api.zze r5 = (com.android.billingclient.api.zze) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r4.zzc
            java.lang.String r5 = r5.zzc
            if (r1 == r5) goto L_0x002e
            if (r1 == 0) goto L_0x002f
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x002f
        L_0x002e:
            return r0
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zze.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", new Object[]{this.zza, this.zzb, this.zzc});
    }
}
