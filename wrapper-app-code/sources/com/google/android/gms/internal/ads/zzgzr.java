package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgzr implements zzhag {
    private final zzgzn zza;
    private final zzhax zzb;
    private final boolean zzc;
    private final zzgxq zzd;

    private zzgzr(zzhax zzhax, zzgxq zzgxq, zzgzn zzgzn) {
        this.zzb = zzhax;
        this.zzc = zzgxq.zzh(zzgzn);
        this.zzd = zzgxq;
        this.zza = zzgzn;
    }

    static zzgzr zzc(zzhax zzhax, zzgxq zzgxq, zzgzn zzgzn) {
        return new zzgzr(zzhax, zzgxq, zzgzn);
    }

    public final int zza(Object obj) {
        zzhax zzhax = this.zzb;
        int zzb2 = zzhax.zzb(zzhax.zzd(obj));
        if (!this.zzc) {
            return zzb2;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final Object zze() {
        zzgzn zzgzn = this.zza;
        if (zzgzn instanceof zzgyd) {
            return ((zzgyd) zzgzn).zzaC();
        }
        return zzgzn.zzaN().zzam();
    }

    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzhai.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzhai.zzE(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzgzy zzgzy, zzgxp zzgxp) throws IOException {
        boolean z;
        zzhax zzhax = this.zzb;
        zzgxq zzgxq = this.zzd;
        Object zzc2 = zzhax.zzc(obj);
        zzgxu zzb2 = zzgxq.zzb(obj);
        while (zzgzy.zzc() != Integer.MAX_VALUE) {
            int zzd2 = zzgzy.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzc3 = zzgxq.zzc(zzgxp, this.zza, zzd2 >>> 3);
                    if (zzc3 != null) {
                        zzgxq.zzf(zzgzy, zzc3, zzgxp, zzb2);
                    } else {
                        z = zzhax.zzp(zzc2, zzgzy);
                    }
                } else {
                    z = zzgzy.zzO();
                }
                if (!z) {
                    zzhax.zzn(obj, zzc2);
                    return;
                }
            } else {
                int i = 0;
                Object obj2 = null;
                zzgwv zzgwv = null;
                while (true) {
                    try {
                        if (zzgzy.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd3 = zzgzy.zzd();
                        if (zzd3 == 16) {
                            i = zzgzy.zzj();
                            obj2 = zzgxq.zzc(zzgxp, this.zza, i);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzgxq.zzf(zzgzy, obj2, zzgxp, zzb2);
                            } else {
                                zzgwv = zzgzy.zzp();
                            }
                        } else if (!zzgzy.zzO()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzhax.zzn(obj, zzc2);
                        throw th;
                    }
                }
                if (zzgzy.zzd() != 12) {
                    throw zzgyp.zzb();
                } else if (zzgwv != null) {
                    if (obj2 != null) {
                        zzgxq.zzg(zzgwv, obj2, zzgxp, zzb2);
                    } else {
                        zzhax.zzk(zzc2, i, zzgwv);
                    }
                }
            }
        }
        zzhax.zzn(obj, zzc2);
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgwh zzgwh) throws IOException {
        zzgyd zzgyd = (zzgyd) obj;
        if (zzgyd.zzc == zzhay.zzc()) {
            zzgyd.zzc = zzhay.zzf();
        }
        zzgya zzgya = (zzgya) obj;
        throw null;
    }

    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    public final void zzn(Object obj, zzgxl zzgxl) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
