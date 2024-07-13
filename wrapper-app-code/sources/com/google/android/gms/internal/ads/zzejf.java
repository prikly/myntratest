package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzejf implements zzfmm {
    public final /* synthetic */ zzejg zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzejf(zzejg zzejg, long j) {
        this.zza = zzejg;
        this.zzb = j;
    }

    public final Object zza(Object obj) {
        zzejg zzejg = this.zza;
        long j = this.zzb;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzejg.zzf()) {
            return null;
        }
        zzbhe zzg = zzbhf.zzg();
        zzg.zzh(j);
        byte[] zzaw = ((zzbhf) zzg.zzak()).zzaw();
        zzejn.zzg(sQLiteDatabase, false, false);
        zzejn.zzd(sQLiteDatabase, j, zzaw);
        return null;
    }
}
