package com.android.billingclient.api;

import android.text.TextUtils;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final class zzbv {
    private String zza;

    private zzbv() {
    }

    /* synthetic */ zzbv(zzbu zzbu) {
    }

    public final zzbv zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzbx zzb() {
        if (!TextUtils.isEmpty(this.zza)) {
            return new zzbx(this.zza, (String) null, (String) null, 0, (zzbw) null);
        }
        throw new IllegalArgumentException("SKU must be set.");
    }
}
