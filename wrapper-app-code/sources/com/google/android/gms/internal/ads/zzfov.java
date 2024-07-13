package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfov {
    public static void zza(zzgfb zzgfb, zzfow zzfow, zzfol zzfol) {
        zzg(zzgfb, zzfow, zzfol, false);
    }

    public static void zzb(zzgfb zzgfb, zzfow zzfow, zzfol zzfol) {
        zzg(zzgfb, zzfow, zzfol, true);
    }

    public static void zzc(zzgfb zzgfb, zzfow zzfow, zzfol zzfol) {
        if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
            zzger.zzr(zzgei.zzv(zzgfb), new zzfou(zzfow, zzfol), zzcib.zzf);
        }
    }

    public static void zzd(zzgfb zzgfb, zzfol zzfol) {
        if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
            zzger.zzr(zzgei.zzv(zzgfb), new zzfos(zzfol), zzcib.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) zzba.zzc().zzb(zzbjj.zzhS), str);
    }

    public static int zzf(zzfjg zzfjg) {
        int zze = zzf.zze(zzfjg) - 1;
        return (zze == 0 || zze == 1) ? 7 : 23;
    }

    private static void zzg(zzgfb zzgfb, zzfow zzfow, zzfol zzfol, boolean z) {
        if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
            zzger.zzr(zzgei.zzv(zzgfb), new zzfot(zzfow, zzfol, z), zzcib.zzf);
        }
    }
}
