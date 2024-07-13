package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfok {
    public static zzfol zza(Context context, int i) {
        boolean z;
        if (zzfoy.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        z = ((Boolean) zzbks.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        z = ((Boolean) zzbks.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        z = ((Boolean) zzbks.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                z = ((Boolean) zzbks.zze.zze()).booleanValue();
            }
            if (z) {
                return new zzfon(context, i);
            }
        }
        return new zzfph();
    }

    public static zzfol zzb(Context context, int i, int i2, zzl zzl) {
        zzfol zza = zza(context, i);
        if (!(zza instanceof zzfon)) {
            return zza;
        }
        zza.zzh();
        zza.zzm(i2);
        if (zzfov.zze(zzl.zzp)) {
            zza.zze(zzl.zzp);
        }
        return zza;
    }
}
