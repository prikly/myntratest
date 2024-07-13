package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgsw extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgsw zzb;
    /* access modifiers changed from: private */
    public String zzd = "";
    /* access modifiers changed from: private */
    public zzgwv zze = zzgwv.zzb;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgsw zzgsw = new zzgsw();
        zzb = zzgsw;
        zzgyd.zzaS(zzgsw.class, zzgsw);
    }

    private zzgsw() {
    }

    public static zzgst zza() {
        return (zzgst) zzb.zzaz();
    }

    public static zzgsw zze() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgsw();
        } else {
            if (i2 == 4) {
                return new zzgst((zzgss) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgsv zzc() {
        zzgsv zzb2 = zzgsv.zzb(this.zzf);
        return zzb2 == null ? zzgsv.UNRECOGNIZED : zzb2;
    }

    public final zzgwv zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
