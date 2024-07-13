package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzkc {
    private final zzhk zza;

    @Deprecated
    public zzkc(Context context, zzcmx zzcmx, byte[] bArr) {
        this.zza = new zzhk(context, zzcmx, (byte[]) null);
    }

    @Deprecated
    public final zzkc zza(zzjf zzjf) {
        zzhk zzhk = this.zza;
        zzdd.zzf(!zzhk.zzq);
        if (zzjf != null) {
            zzhk.zzf = new zzhc(zzjf);
            return this;
        }
        throw null;
    }

    @Deprecated
    public final zzkc zzb(zzvz zzvz) {
        zzhk zzhk = this.zza;
        zzdd.zzf(!zzhk.zzq);
        if (zzvz != null) {
            zzhk.zze = new zzhd(zzvz);
            return this;
        }
        throw null;
    }

    @Deprecated
    public final zzkd zzc() {
        zzhk zzhk = this.zza;
        zzdd.zzf(!zzhk.zzq);
        zzhk.zzq = true;
        return new zzkd(zzhk);
    }
}
