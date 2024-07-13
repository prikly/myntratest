package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfpf extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzfpf zzb;
    private zzfpb zzd;

    static {
        zzfpf zzfpf = new zzfpf();
        zzb = zzfpf;
        zzgyd.zzaS(zzfpf.class, zzfpf);
    }

    private zzfpf() {
    }

    public static zzfpe zza() {
        return (zzfpe) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzfpf zzfpf, zzfpb zzfpb) {
        zzfpb.getClass();
        zzfpf.zzd = zzfpb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzfpf();
        } else {
            if (i2 == 4) {
                return new zzfpe((zzfpc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
