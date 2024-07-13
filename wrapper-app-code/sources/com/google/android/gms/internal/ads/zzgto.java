package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgto extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgto zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgym zze = zzaL();

    static {
        zzgto zzgto = new zzgto();
        zzb = zzgto;
        zzgyd.zzaS(zzgto.class, zzgto);
    }

    private zzgto() {
    }

    public static zzgtl zza() {
        return (zzgtl) zzb.zzaz();
    }

    static /* synthetic */ void zze(zzgto zzgto, zzgtn zzgtn) {
        zzgtn.getClass();
        zzgym zzgym = zzgto.zze;
        if (!zzgym.zzc()) {
            zzgto.zze = zzgyd.zzaM(zzgym);
        }
        zzgto.zze.add(zzgtn);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgtn.class});
        } else if (i2 == 3) {
            return new zzgto();
        } else {
            if (i2 == 4) {
                return new zzgtl((zzgtk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
