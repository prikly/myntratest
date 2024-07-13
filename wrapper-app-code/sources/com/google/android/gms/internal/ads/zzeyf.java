package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeyf implements zzezl {
    private final String zza;
    private final String zzb;

    public zzeyf(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgr)).booleanValue()) {
            bundle.putString("request_id", this.zzb);
        } else {
            bundle.putString("request_id", this.zza);
        }
    }
}
