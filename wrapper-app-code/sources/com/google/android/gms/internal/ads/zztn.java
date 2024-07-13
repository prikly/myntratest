package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zztn implements zzst {
    private final zzew zzc;
    private int zzd = 1048576;
    private final zztm zze;
    private final zzwm zzf;
    private final zzpf zzg;

    public zztn(zzew zzew, zztm zztm, byte[] bArr) {
        zzpf zzpf = new zzpf();
        zzwm zzwm = new zzwm(-1);
        this.zzc = zzew;
        this.zze = zztm;
        this.zzg = zzpf;
        this.zzf = zzwm;
    }

    public final zztn zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zztp zzb(zzbg zzbg) {
        if (zzbg.zzd != null) {
            return new zztp(zzbg, this.zzc, this.zze, zzpo.zza, this.zzf, this.zzd, (zzto) null, (byte[]) null);
        }
        throw null;
    }
}
