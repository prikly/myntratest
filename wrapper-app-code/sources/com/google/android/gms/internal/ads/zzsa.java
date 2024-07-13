package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzsa extends zzrv {
    public static final Object zzd = new Object();
    private final Object zze;
    /* access modifiers changed from: private */
    public final Object zzf;

    private zzsa(zzcn zzcn, Object obj, Object obj2) {
        super(zzcn);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzsa zzq(zzbg zzbg) {
        return new zzsa(new zzsb(zzbg), zzcm.zza, zzd);
    }

    public static zzsa zzr(zzcn zzcn, Object obj, Object obj2) {
        return new zzsa(zzcn, obj, obj2);
    }

    public final int zza(Object obj) {
        Object obj2;
        zzcn zzcn = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzcn.zza(obj);
    }

    public final zzck zzd(int i, zzck zzck, boolean z) {
        this.zzc.zzd(i, zzck, z);
        if (zzen.zzT(zzck.zzc, this.zzf) && z) {
            zzck.zzc = zzd;
        }
        return zzck;
    }

    public final zzcm zze(int i, zzcm zzcm, long j) {
        this.zzc.zze(i, zzcm, j);
        if (zzen.zzT(zzcm.zzc, this.zze)) {
            zzcm.zzc = zzcm.zza;
        }
        return zzcm;
    }

    public final Object zzf(int i) {
        Object zzf2 = this.zzc.zzf(i);
        return zzen.zzT(zzf2, this.zzf) ? zzd : zzf2;
    }

    public final zzsa zzp(zzcn zzcn) {
        return new zzsa(zzcn, this.zze, this.zzf);
    }
}
