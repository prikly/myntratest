package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzard implements Callable {
    private final zzaqj zza;
    private final zzaml zzb;

    public zzard(zzaqj zzaqj, zzaml zzaml) {
        this.zza = zzaqj;
        this.zzb = zzaml;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzanf zzc = this.zza.zzc();
        if (zzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                zzaml zzaml = this.zzb;
                byte[] zzaw = zzc.zzaw();
                zzaml.zzaj(zzaw, 0, zzaw.length, zzgxp.zza());
            }
            return null;
        } catch (zzgyp | NullPointerException unused) {
            return null;
        }
    }
}
