package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgox extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgox zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgpa zze;

    static {
        zzgox zzgox = new zzgox();
        zzb = zzgox;
        zzgyd.zzaS(zzgox.class, zzgox);
    }

    private zzgox() {
    }

    public static zzgow zzc() {
        return (zzgow) zzb.zzaz();
    }

    public static zzgox zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgox) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzh(zzgox zzgox, zzgpa zzgpa) {
        zzgpa.getClass();
        zzgox.zze = zzgpa;
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
            return new zzgox();
        } else {
            if (i2 == 4) {
                return new zzgow((zzgov) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpa zzf() {
        zzgpa zzgpa = this.zze;
        return zzgpa == null ? zzgpa.zze() : zzgpa;
    }
}
