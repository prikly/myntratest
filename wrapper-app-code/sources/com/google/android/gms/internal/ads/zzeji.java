package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeji implements zzfmm {
    public final /* synthetic */ zzejj zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ ArrayList zzc;
    public final /* synthetic */ zzbha zzd;
    public final /* synthetic */ zzbhj zze;

    public /* synthetic */ zzeji(zzejj zzejj, boolean z, ArrayList arrayList, zzbha zzbha, zzbhj zzbhj) {
        this.zza = zzejj;
        this.zzb = z;
        this.zzc = arrayList;
        this.zzd = zzbha;
        this.zze = zzbhj;
    }

    public final Object zza(Object obj) {
        zzejj zzejj = this.zza;
        boolean z = this.zzb;
        ArrayList arrayList = this.zzc;
        zzbha zzbha = this.zzd;
        zzbhj zzbhj = this.zze;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzejj.zzb.zzf()) {
            return null;
        }
        byte[] zze2 = zzejk.zze(zzejj.zzb, z, arrayList, zzbha, zzbhj);
        zzejn.zzg(sQLiteDatabase, z, true);
        zzejn.zzd(sQLiteDatabase, zzejj.zzb.zzf.zzd(), zze2);
        return null;
    }
}
