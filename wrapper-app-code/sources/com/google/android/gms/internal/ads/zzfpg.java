package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfpg extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzfpg zzb;
    /* access modifiers changed from: private */
    public zzgym zzd = zzaL();

    static {
        zzfpg zzfpg = new zzfpg();
        zzb = zzfpg;
        zzgyd.zzaS(zzfpg.class, zzfpg);
    }

    private zzfpg() {
    }

    public static zzfpd zzc() {
        return (zzfpd) zzb.zzaz();
    }

    static /* synthetic */ void zzf(zzfpg zzfpg, zzfpf zzfpf) {
        zzfpf.getClass();
        zzgym zzgym = zzfpg.zzd;
        if (!zzgym.zzc()) {
            zzfpg.zzd = zzgyd.zzaM(zzgym);
        }
        zzfpg.zzd.add(zzfpf);
    }

    public final int zza() {
        return this.zzd.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfpf.class});
        } else if (i2 == 3) {
            return new zzfpg();
        } else {
            if (i2 == 4) {
                return new zzfpd((zzfpc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
