package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgua extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgua zzb;
    private String zzd = "";
    private zzgtb zze;

    static {
        zzgua zzgua = new zzgua();
        zzb = zzgua;
        zzgyd.zzaS(zzgua.class, zzgua);
    }

    private zzgua() {
    }

    public static zzgua zzd() {
        return zzb;
    }

    public static zzgua zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgua) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    public final zzgtb zza() {
        zzgtb zzgtb = this.zze;
        return zzgtb == null ? zzgtb.zzd() : zzgtb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzgua();
        } else {
            if (i2 == 4) {
                return new zzgtz((zzgty) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze != null;
    }
}
