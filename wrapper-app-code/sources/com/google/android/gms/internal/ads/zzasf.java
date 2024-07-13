package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzasf extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzasf zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzasf zzasf = new zzasf();
        zzb = zzasf;
        zzgyd.zzaS(zzasf.class, zzasf);
    }

    private zzasf() {
    }

    public static zzase zze() {
        return (zzase) zzb.zzaz();
    }

    public static zzasf zzg() {
        return zzb;
    }

    public static zzasf zzh(zzgwv zzgwv) throws zzgyp {
        return (zzasf) zzgyd.zzaD(zzb, zzgwv);
    }

    public static zzasf zzi(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzasf) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzl(zzasf zzasf, String str) {
        str.getClass();
        zzasf.zzd |= 1;
        zzasf.zze = str;
    }

    static /* synthetic */ void zzm(zzasf zzasf, long j) {
        zzasf.zzd |= 16;
        zzasf.zzi = j;
    }

    static /* synthetic */ void zzn(zzasf zzasf, String str) {
        str.getClass();
        zzasf.zzd |= 2;
        zzasf.zzf = str;
    }

    static /* synthetic */ void zzo(zzasf zzasf, long j) {
        zzasf.zzd |= 4;
        zzasf.zzg = j;
    }

    static /* synthetic */ void zzp(zzasf zzasf, long j) {
        zzasf.zzd |= 8;
        zzasf.zzh = j;
    }

    public final long zza() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzasf();
        } else {
            if (i2 == 4) {
                return new zzase((zzasd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}
