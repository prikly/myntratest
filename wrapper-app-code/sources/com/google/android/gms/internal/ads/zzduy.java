package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzduy implements zza, zzo, zzz, zzbow, zzboy {
    private zza zza;
    private zzbow zzb;
    private zzo zzc;
    private zzboy zzd;
    private zzz zze;

    private zzduy() {
    }

    /* synthetic */ zzduy(zzdux zzdux) {
    }

    /* access modifiers changed from: private */
    public final synchronized void zzi(zza zza2, zzbow zzbow, zzo zzo, zzboy zzboy, zzz zzz) {
        this.zza = zza2;
        this.zzb = zzbow;
        this.zzc = zzo;
        this.zzd = zzboy;
        this.zze = zzz;
    }

    public final synchronized void onAdClicked() {
        zza zza2 = this.zza;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final synchronized void zza(String str, Bundle bundle) {
        zzbow zzbow = this.zzb;
        if (zzbow != null) {
            zzbow.zza(str, bundle);
        }
    }

    public final synchronized void zzb() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzb();
        }
    }

    public final synchronized void zzbE() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbE();
        }
    }

    public final synchronized void zzbF(String str, String str2) {
        zzboy zzboy = this.zzd;
        if (zzboy != null) {
            zzboy.zzbF(str, str2);
        }
    }

    public final synchronized void zzbM() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbM();
        }
    }

    public final synchronized void zzbs() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbs();
        }
    }

    public final synchronized void zze() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zze();
        }
    }

    public final synchronized void zzf(int i) {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzf(i);
        }
    }

    public final synchronized void zzg() {
        zzz zzz = this.zze;
        if (zzz != null) {
            ((zzduz) zzz).zza.zzb();
        }
    }
}
