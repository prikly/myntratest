package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzflo {
    private final zzfks zza;
    private final zzflm zzb;
    private final zzfko zzc;
    /* access modifiers changed from: private */
    public final ArrayDeque zzd;
    /* access modifiers changed from: private */
    public zzflu zze;
    /* access modifiers changed from: private */
    public int zzf = 1;

    public zzflo(zzfks zzfks, zzfko zzfko, zzflm zzflm) {
        this.zza = zzfks;
        this.zzc = zzfko;
        this.zzb = zzflm;
        this.zzd = new ArrayDeque();
        this.zzc.zzb(new zzflj(this));
    }

    /* access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfK)).booleanValue()) {
            if (!zzt.zzo().zzh().zzh().zzh()) {
                this.zzd.clear();
                return;
            }
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfln zzfln = (zzfln) this.zzd.pollFirst();
                if (zzfln == null || (zzfln.zza() != null && this.zza.zze(zzfln.zza()))) {
                    zzflu zzflu = new zzflu(this.zza, this.zzb, zzfln);
                    this.zze = zzflu;
                    zzflu.zzd(new zzflk(this, zzfln));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized zzgfb zza(zzfln zzfln) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfln);
    }

    public final synchronized void zze(zzfln zzfln) {
        this.zzd.add(zzfln);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
