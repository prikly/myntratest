package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzejz implements zzfmm {
    public final /* synthetic */ zzekc zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzejz(zzekc zzekc, String str) {
        this.zza = zzekc;
        this.zzb = str;
    }

    public final Object zza(Object obj) {
        zzekc.zzi((SQLiteDatabase) obj, this.zzb);
        return null;
    }
}
