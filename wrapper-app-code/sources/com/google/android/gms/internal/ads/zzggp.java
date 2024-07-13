package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzggp {
    private final zzgtb zza;

    private zzggp(zzgtb zzgtb) {
        this.zza = zzgtb;
    }

    public static zzggp zze(String str, byte[] bArr, int i) {
        zzgta zza2 = zzgtb.zza();
        zza2.zzb(str);
        zza2.zzc(zzgwv.zzv(bArr));
        int i2 = i - 1;
        zza2.zza(i2 != 0 ? i2 != 1 ? zzguc.RAW : zzguc.LEGACY : zzguc.TINK);
        return new zzggp((zzgtb) zza2.zzak());
    }

    /* access modifiers changed from: package-private */
    public final zzgtb zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzg();
    }

    public final byte[] zzc() {
        return this.zza.zzf().zzE();
    }

    public final int zzd() {
        zzguc zze = this.zza.zze();
        zzguc zzguc = zzguc.UNKNOWN_PREFIX;
        int ordinal = zze.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
