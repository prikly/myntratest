package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzdmz {
    private final zzdoe zza;
    private final zzcno zzb;

    public zzdmz(zzdoe zzdoe, zzcno zzcno) {
        this.zza = zzdoe;
        this.zzb = zzcno;
    }

    public static final zzdlu zzh(zzfoi zzfoi) {
        return new zzdlu(zzfoi, zzcib.zzf);
    }

    public static final zzdlu zzi(zzdoj zzdoj) {
        return new zzdlu(zzdoj, zzcib.zzf);
    }

    public final View zza() {
        zzcno zzcno = this.zzb;
        if (zzcno == null) {
            return null;
        }
        return zzcno.zzI();
    }

    public final View zzb() {
        zzcno zzcno = this.zzb;
        if (zzcno != null) {
            return zzcno.zzI();
        }
        return null;
    }

    public final zzcno zzc() {
        return this.zzb;
    }

    public final zzdlu zzd(Executor executor) {
        return new zzdlu(new zzdmx(this.zzb), executor);
    }

    public final zzdoe zze() {
        return this.zza;
    }

    public Set zzf(zzddn zzddn) {
        return Collections.singleton(new zzdlu(zzddn, zzcib.zzf));
    }

    public Set zzg(zzddn zzddn) {
        return Collections.singleton(new zzdlu(zzddn, zzcib.zzf));
    }
}
