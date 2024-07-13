package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgsl extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgsl zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgsl zzgsl = new zzgsl();
        zzb = zzgsl;
        zzgyd.zzaS(zzgsl.class, zzgsl);
    }

    private zzgsl() {
    }

    public static zzgsk zza() {
        return (zzgsk) zzb.zzaz();
    }

    public static zzgsl zzd() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgsl();
        } else {
            if (i2 == 4) {
                return new zzgsk((zzgsj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zze() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzf() {
        int i = this.zze;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzg() {
        int i = this.zzd;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
