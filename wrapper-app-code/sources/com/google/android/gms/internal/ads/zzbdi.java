package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbdi implements Comparator {
    public zzbdi(zzbdj zzbdj) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbcx zzbcx = (zzbcx) obj;
        zzbcx zzbcx2 = (zzbcx) obj2;
        if (zzbcx.zzd() >= zzbcx2.zzd()) {
            if (zzbcx.zzd() > zzbcx2.zzd()) {
                return 1;
            }
            if (zzbcx.zzb() >= zzbcx2.zzb()) {
                if (zzbcx.zzb() > zzbcx2.zzb()) {
                    return 1;
                }
                float zza = (zzbcx.zza() - zzbcx.zzd()) * (zzbcx.zzc() - zzbcx.zzb());
                float zza2 = (zzbcx2.zza() - zzbcx2.zzd()) * (zzbcx2.zzc() - zzbcx2.zzb());
                if (zza <= zza2) {
                    if (zza < zza2) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return -1;
    }
}
