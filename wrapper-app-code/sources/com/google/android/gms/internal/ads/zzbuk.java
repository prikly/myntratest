package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbuk {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbut zzc;
    private zzbut zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbut zza(Context context, zzchu zzchu, zzfoy zzfoy) {
        zzbut zzbut;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbut(zzc(context), zzchu, (String) zzba.zzc().zzb(zzbjj.zza), zzfoy);
            }
            zzbut = this.zzc;
        }
        return zzbut;
    }

    public final zzbut zzb(Context context, zzchu zzchu, zzfoy zzfoy) {
        zzbut zzbut;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbut(zzc(context), zzchu, (String) zzbli.zzb.zze(), zzfoy);
            }
            zzbut = this.zzd;
        }
        return zzbut;
    }
}
