package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbfq extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbfq zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbfq zzbfq = new zzbfq();
        zzb = zzbfq;
        zzgyd.zzaS(zzbfq.class, zzbfq);
    }

    private zzbfq() {
    }

    public static zzbfp zza() {
        return (zzbfp) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbfq zzbfq, boolean z) {
        zzbfq.zzd |= 1;
        zzbfq.zze = z;
    }

    static /* synthetic */ void zze(zzbfq zzbfq, boolean z) {
        zzbfq.zzd |= 2;
        zzbfq.zzf = z;
    }

    static /* synthetic */ void zzf(zzbfq zzbfq, int i) {
        zzbfq.zzd |= 4;
        zzbfq.zzg = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzbfq();
        } else {
            if (i2 == 4) {
                return new zzbfp((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
