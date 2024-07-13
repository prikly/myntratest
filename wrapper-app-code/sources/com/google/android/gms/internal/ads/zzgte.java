package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgte extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgte zzb;
    private String zzd = "";
    private String zze = "";
    private int zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        zzgte zzgte = new zzgte();
        zzb = zzgte;
        zzgyd.zzaS(zzgte.class, zzgte);
    }

    private zzgte() {
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgte();
        } else {
            if (i2 == 4) {
                return new zzgtd((zzgtc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzg;
    }
}
