package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgtx extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgtx zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgua zze;

    static {
        zzgtx zzgtx = new zzgtx();
        zzb = zzgtx;
        zzgyd.zzaS(zzgtx.class, zzgtx);
    }

    private zzgtx() {
    }

    public static zzgtw zzc() {
        return (zzgtw) zzb.zzaz();
    }

    public static zzgtx zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgtx) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzh(zzgtx zzgtx, zzgua zzgua) {
        zzgua.getClass();
        zzgtx.zze = zzgua;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzgtx();
        } else {
            if (i2 == 4) {
                return new zzgtw((zzgtv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgua zzf() {
        zzgua zzgua = this.zze;
        return zzgua == null ? zzgua.zzd() : zzgua;
    }
}
