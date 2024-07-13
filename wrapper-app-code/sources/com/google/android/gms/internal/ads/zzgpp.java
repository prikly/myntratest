package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgpp extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgpp zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        zzgpp zzgpp = new zzgpp();
        zzb = zzgpp;
        zzgyd.zzaS(zzgpp.class, zzgpp);
    }

    private zzgpp() {
    }

    public static zzgpo zzc() {
        return (zzgpo) zzb.zzaz();
    }

    public static zzgpp zze() {
        return zzb;
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
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzgpp();
        } else {
            if (i2 == 4) {
                return new zzgpo((zzgpn) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
