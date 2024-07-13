package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzezv implements zzezl {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzezv(String str, int i, int i2, int i3, boolean z, int i4) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
        this.zzf = i4;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zza;
        boolean z = true;
        zzfjr.zzf(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i = this.zzb;
        if (i == -2) {
            z = false;
        }
        zzfjr.zze(bundle, "cnt", i, z);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle zza2 = zzfjr.zza(bundle, "device");
        bundle.putBundle("device", zza2);
        Bundle zza3 = zzfjr.zza(zza2, "network");
        zza2.putBundle("network", zza3);
        zza3.putInt("active_network_state", this.zzf);
        zza3.putBoolean("active_network_metered", this.zze);
    }
}
