package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzejw implements Runnable {
    public final /* synthetic */ SQLiteDatabase zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzcht zzc;

    public /* synthetic */ zzejw(SQLiteDatabase sQLiteDatabase, String str, zzcht zzcht) {
        this.zza = sQLiteDatabase;
        this.zzb = str;
        this.zzc = zzcht;
    }

    public final void run() {
        zzekc.zzf(this.zza, this.zzb, this.zzc);
    }
}
