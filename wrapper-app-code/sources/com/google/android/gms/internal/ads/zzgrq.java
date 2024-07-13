package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgrq extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgrq zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgwv zzf = zzgwv.zzb;

    static {
        zzgrq zzgrq = new zzgrq();
        zzb = zzgrq;
        zzgyd.zzaS(zzgrq.class, zzgrq);
    }

    private zzgrq() {
    }

    public static zzgrp zza() {
        return (zzgrp) zzb.zzaz();
    }

    public static zzgrq zzd() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgrq();
        } else {
            if (i2 == 4) {
                return new zzgrp((zzgro) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgwv zze() {
        return this.zzf;
    }

    public final int zzg() {
        int i = this.zzd;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int zzb2 = zzgru.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
