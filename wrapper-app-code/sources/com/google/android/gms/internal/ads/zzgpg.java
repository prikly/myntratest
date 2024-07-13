package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgpg extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgpg zzb;
    private zzgpm zzd;
    private zzgsa zze;

    static {
        zzgpg zzgpg = new zzgpg();
        zzb = zzgpg;
        zzgyd.zzaS(zzgpg.class, zzgpg);
    }

    private zzgpg() {
    }

    public static zzgpf zza() {
        return (zzgpf) zzb.zzaz();
    }

    public static zzgpg zzd(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgpg) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzg(zzgpg zzgpg, zzgpm zzgpm) {
        zzgpm.getClass();
        zzgpg.zzd = zzgpm;
    }

    static /* synthetic */ void zzh(zzgpg zzgpg, zzgsa zzgsa) {
        zzgsa.getClass();
        zzgpg.zze = zzgsa;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzgpg();
        } else {
            if (i2 == 4) {
                return new zzgpf((zzgpe) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpm zze() {
        zzgpm zzgpm = this.zzd;
        return zzgpm == null ? zzgpm.zze() : zzgpm;
    }

    public final zzgsa zzf() {
        zzgsa zzgsa = this.zze;
        return zzgsa == null ? zzgsa.zze() : zzgsa;
    }
}
