package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzeix implements zzgen {
    final /* synthetic */ zzfmm zza;

    zzeix(zzeiy zzeiy, zzfmm zzfmm) {
        this.zza = zzfmm;
    }

    public final void zza(Throwable th) {
        zze.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e2) {
            zze.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
