package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbfr extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbfr zzb;
    private zzgym zzd = zzaL();

    static {
        zzbfr zzbfr = new zzbfr();
        zzb = zzbfr;
        zzgyd.zzaS(zzbfr.class, zzbfr);
    }

    private zzbfr() {
    }

    public static zzbfl zza() {
        return (zzbfl) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbfr zzbfr, zzbfk zzbfk) {
        zzbfk.getClass();
        zzgym zzgym = zzbfr.zzd;
        if (!zzgym.zzc()) {
            zzbfr.zzd = zzgyd.zzaM(zzgym);
        }
        zzbfr.zzd.add(zzbfk);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzbfk.class});
        } else if (i2 == 3) {
            return new zzbfr();
        } else {
            if (i2 == 4) {
                return new zzbfl((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
