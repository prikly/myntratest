package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzepv implements zzdfw {
    boolean zza = false;
    final /* synthetic */ zzekt zzb;
    final /* synthetic */ zzcig zzc;
    final /* synthetic */ zzepw zzd;

    zzepv(zzepw zzepw, zzekt zzekt, zzcig zzcig) {
        this.zzd = zzepw;
        this.zzb = zzekt;
        this.zzc = zzcig;
    }

    private final synchronized void zze(zze zze) {
        int i = 1;
        if (true == ((Boolean) zzba.zzc().zzb(zzbjj.zzeT)).booleanValue()) {
            i = 3;
        }
        this.zzc.zze(new zzeku(i, zze));
    }

    public final synchronized void zza(int i) {
        if (!this.zza) {
            this.zza = true;
            zze(new zze(i, zzepw.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzb(zze zze) {
        if (!this.zza) {
            this.zza = true;
            zze(zze);
        }
    }

    public final synchronized void zzc(int i, String str) {
        if (!this.zza) {
            this.zza = true;
            if (str == null) {
                str = zzepw.zze(this.zzb.zza, i);
            }
            zze(new zze(i, str, AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzd() {
        this.zzc.zzd((Object) null);
    }
}
