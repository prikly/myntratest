package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgtn extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgtn zzb;
    private String zzd = "";
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgtn zzgtn = new zzgtn();
        zzb = zzgtn;
        zzgyd.zzaS(zzgtn.class, zzgtn);
    }

    private zzgtn() {
    }

    public static zzgtm zza() {
        return (zzgtm) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzgtn zzgtn, String str) {
        str.getClass();
        zzgtn.zzd = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgtn();
        } else {
            if (i2 == 4) {
                return new zzgtm((zzgtk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
