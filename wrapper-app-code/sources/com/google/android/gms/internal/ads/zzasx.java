package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzasx {
    public final zzayj zza;
    public final Object zzb;
    public final int zzc;
    public final zzayv[] zzd;
    public final boolean[] zze;
    public final long zzf;
    public int zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public zzasx zzl;
    public zzazp zzm;
    private final zzati[] zzn;
    private final zzatj[] zzo;
    private final zzazo zzp;
    private final zzayl zzq;
    private zzazp zzr;
    private final zzcku zzs;

    public final long zza(long j, boolean z) {
        return zzb(j, false, new boolean[2]);
    }

    public final long zzb(long j, boolean z, boolean[] zArr) {
        zzazm zzazm = this.zzm.zzb;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.zze;
            if (z || !this.zzm.zza(this.zzr, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long zzB = this.zza.zzB(zzazm.zzb(), this.zze, this.zzd, zArr, j);
        this.zzr = this.zzm;
        this.zzk = false;
        int i2 = 0;
        while (true) {
            zzayv[] zzayvArr = this.zzd;
            if (i2 < 2) {
                if (zzayvArr[i2] != null) {
                    zzbaj.zze(zzazm.zza(i2) != null);
                    this.zzk = true;
                } else {
                    zzbaj.zze(zzazm.zza(i2) == null);
                }
                i2++;
            } else {
                this.zzs.zzd(this.zzn, this.zzm.zza, zzazm);
                return zzB;
            }
        }
    }

    public final void zzc() {
        try {
            this.zzq.zzc(this.zza);
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e2);
        }
    }

    public final boolean zzd() {
        return this.zzj && (!this.zzk || this.zza.zzg() == Long.MIN_VALUE);
    }

    public final boolean zze() throws zzasp {
        zzazp zzc2 = this.zzp.zzc(this.zzo, this.zza.zzn());
        zzazp zzazp = this.zzr;
        if (zzazp != null) {
            int i = 0;
            while (i < 2) {
                if (zzc2.zza(zzazp, i)) {
                    i++;
                }
            }
            return false;
        }
        this.zzm = zzc2;
        return true;
    }

    public zzasx(zzati[] zzatiArr, zzatj[] zzatjArr, long j, zzazo zzazo, zzcku zzcku, zzayl zzayl, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.zzn = zzatiArr;
        this.zzo = zzatjArr;
        this.zzf = j;
        this.zzp = zzazo;
        this.zzs = zzcku;
        this.zzq = zzayl;
        if (obj != null) {
            this.zzb = obj;
            this.zzc = i;
            this.zzg = i2;
            this.zzi = z;
            this.zzh = j2;
            this.zzd = new zzayv[2];
            this.zze = new boolean[2];
            this.zza = zzayl.zze(i2, zzcku.zzl());
            return;
        }
        throw null;
    }
}
