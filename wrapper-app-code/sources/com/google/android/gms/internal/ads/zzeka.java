package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeka implements zzfmm {
    public final /* synthetic */ zzekc zza;
    public final /* synthetic */ zzcht zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzeka(zzekc zzekc, zzcht zzcht, String str) {
        this.zza = zzekc;
        this.zzb = zzcht;
        this.zzc = str;
    }

    public final Object zza(Object obj) {
        this.zza.zzg((SQLiteDatabase) obj, this.zzb, this.zzc);
        return null;
    }
}
