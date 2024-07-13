package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zztp extends zzri implements zztg {
    private final zzbg zza;
    private final zzay zzb;
    private final zzew zzc;
    private final zzpo zzd;
    private final int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;
    private zzfz zzj;
    private final zztm zzk;
    private final zzwm zzl;

    /* synthetic */ zztp(zzbg zzbg, zzew zzew, zztm zztm, zzpo zzpo, zzwm zzwm, int i, zzto zzto, byte[] bArr) {
        zzay zzay = zzbg.zzd;
        if (zzay != null) {
            this.zzb = zzay;
            this.zza = zzbg;
            this.zzc = zzew;
            this.zzk = zztm;
            this.zzd = zzpo;
            this.zzl = zzwm;
            this.zze = i;
            this.zzf = true;
            this.zzg = -9223372036854775807L;
            return;
        }
        throw null;
    }

    private final void zzv() {
        long j = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        zzbg zzbg = this.zza;
        zzuc zzuc = r1;
        zzuc zzuc2 = new zzuc(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0, 0, z, false, false, (Object) null, zzbg, z2 ? zzbg.zzf : null);
        zzo(this.zzf ? new zztl(this, zzuc) : zzuc);
    }

    public final void zzF(zzsf zzsf) {
        ((zztk) zzsf).zzM();
    }

    public final zzsf zzH(zzsh zzsh, zzwi zzwi, long j) {
        zzex zza2 = this.zzc.zza();
        zzfz zzfz = this.zzj;
        if (zzfz != null) {
            zza2.zzf(zzfz);
        }
        Uri uri = this.zzb.zza;
        zztm zztm = this.zzk;
        zzb();
        zzrk zzrk = new zzrk(zztm.zza);
        zzpo zzpo = this.zzd;
        zzpi zzc2 = zzc(zzsh);
        zzwm zzwm = this.zzl;
        zzsq zze2 = zze(zzsh);
        String str = this.zzb.zzf;
        return new zztk(uri, zza2, zzrk, zzpo, zzc2, zzwm, zze2, this, zzwi, (String) null, this.zze, (byte[]) null);
    }

    public final zzbg zzI() {
        return this.zza;
    }

    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zzg;
        }
        if (this.zzf || this.zzg != j || this.zzh != z || this.zzi != z2) {
            this.zzg = j;
            this.zzh = z;
            this.zzi = z2;
            this.zzf = false;
            zzv();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzfz zzfz) {
        this.zzj = zzfz;
        if (Looper.myLooper() != null) {
            zzb();
            zzv();
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
    }

    public final void zzy() {
    }
}
