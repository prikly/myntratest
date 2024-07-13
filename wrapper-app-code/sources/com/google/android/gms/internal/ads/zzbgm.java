package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbgm extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzbgm zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private int zzg;
    private int zzh = 1000;
    private zzbhw zzi;
    /* access modifiers changed from: private */
    public zzgyl zzj = zzaK();
    private zzbge zzk;
    private zzbgh zzl;
    private zzbha zzm;
    private zzbfi zzn;
    private zzbhk zzo;
    private zzbir zzp;
    private zzbfr zzq;

    static {
        zzbgm zzbgm = new zzbgm();
        zzb = zzbgm;
        zzgyd.zzaS(zzbgm.class, zzbgm);
    }

    private zzbgm() {
    }

    public static zzbgl zzd() {
        return (zzbgl) zzb.zzaz();
    }

    static /* synthetic */ void zzg(zzbgm zzbgm, String str) {
        str.getClass();
        zzbgm.zzd |= 2;
        zzbgm.zzf = str;
    }

    static /* synthetic */ void zzh(zzbgm zzbgm, Iterable iterable) {
        zzgyl zzgyl = zzbgm.zzj;
        if (!zzgyl.zzc()) {
            int size = zzgyl.size();
            zzbgm.zzj = zzgyl.zza(size == 0 ? 10 : size + size);
        }
        zzgwe.zzau(iterable, zzbgm.zzj);
    }

    static /* synthetic */ void zzj(zzbgm zzbgm, zzbge zzbge) {
        zzbge.getClass();
        zzbgm.zzk = zzbge;
        zzbgm.zzd |= 32;
    }

    static /* synthetic */ void zzk(zzbgm zzbgm, zzbfi zzbfi) {
        zzbfi.getClass();
        zzbgm.zzn = zzbfi;
        zzbgm.zzd |= 256;
    }

    static /* synthetic */ void zzl(zzbgm zzbgm, zzbhk zzbhk) {
        zzbhk.getClass();
        zzbgm.zzo = zzbhk;
        zzbgm.zzd |= 512;
    }

    static /* synthetic */ void zzm(zzbgm zzbgm, zzbir zzbir) {
        zzbir.getClass();
        zzbgm.zzp = zzbir;
        zzbgm.zzd |= 1024;
    }

    static /* synthetic */ void zzn(zzbgm zzbgm, zzbfr zzbfr) {
        zzbfr.getClass();
        zzbgm.zzq = zzbfr;
        zzbgm.zzd |= 2048;
    }

    public final zzbfi zza() {
        zzbfi zzbfi = this.zzn;
        return zzbfi == null ? zzbfi.zzc() : zzbfi;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzbgj.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        } else if (i2 == 3) {
            return new zzbgm();
        } else {
            if (i2 == 4) {
                return new zzbgl((zzbfd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzbge zzc() {
        zzbge zzbge = this.zzk;
        return zzbge == null ? zzbge.zzc() : zzbge;
    }

    public final String zzf() {
        return this.zzf;
    }
}
