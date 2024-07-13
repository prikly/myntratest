package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzakn;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbh implements zzaki {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbl zzb;

    zzbh(zzbo zzbo, String str, zzbl zzbl) {
        this.zza = str;
        this.zzb = zzbl;
    }

    public final void zza(zzakn zzakn) {
        String str = this.zza;
        String zzakn2 = zzakn.toString();
        zze.zzj("Failed to load URL: " + str + "\n" + zzakn2);
        this.zzb.zza((Object) null);
    }
}
