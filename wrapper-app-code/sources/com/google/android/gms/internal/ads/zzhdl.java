package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhdl extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzhdl zzb;
    private zzgym zzA = zzaL();
    private zzhci zzB;
    private String zzC = "";
    private zzhca zzD;
    private zzgym zzE = zzaL();
    private byte zzF = 2;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzhce zzj;
    private zzgym zzk = zzaL();
    private zzgym zzl = zzaL();
    private String zzm = "";
    private zzhcz zzn;
    private boolean zzo;
    private zzgym zzp = zzgyd.zzaL();
    private String zzq = "";
    private boolean zzr;
    private boolean zzs;
    private zzgwv zzt = zzgwv.zzb;
    private zzhdh zzu;
    private boolean zzv;
    private String zzw = "";
    private zzgym zzx = zzgyd.zzaL();
    private zzgym zzy = zzgyd.zzaL();
    private zzhdk zzz;

    static {
        zzhdl zzhdl = new zzhdl();
        zzb = zzhdl;
        zzgyd.zzaS(zzhdl.class, zzhdl);
    }

    private zzhdl() {
    }

    public static zzhcc zza() {
        return (zzhcc) zzb.zzaz();
    }

    static /* synthetic */ void zzg(zzhdl zzhdl, String str) {
        str.getClass();
        zzhdl.zzd |= 4;
        zzhdl.zzg = str;
    }

    static /* synthetic */ void zzh(zzhdl zzhdl, String str) {
        str.getClass();
        zzhdl.zzd |= 8;
        zzhdl.zzh = str;
    }

    static /* synthetic */ void zzi(zzhdl zzhdl, zzhce zzhce) {
        zzhce.getClass();
        zzhdl.zzj = zzhce;
        zzhdl.zzd |= 32;
    }

    static /* synthetic */ void zzj(zzhdl zzhdl, zzhdf zzhdf) {
        zzhdf.getClass();
        zzgym zzgym = zzhdl.zzk;
        if (!zzgym.zzc()) {
            zzhdl.zzk = zzgyd.zzaM(zzgym);
        }
        zzhdl.zzk.add(zzhdf);
    }

    static /* synthetic */ void zzk(zzhdl zzhdl, String str) {
        zzhdl.zzd |= 64;
        zzhdl.zzm = str;
    }

    static /* synthetic */ void zzl(zzhdl zzhdl) {
        zzhdl.zzd &= -65;
        zzhdl.zzm = zzb.zzm;
    }

    static /* synthetic */ void zzm(zzhdl zzhdl, zzhcz zzhcz) {
        zzhcz.getClass();
        zzhdl.zzn = zzhcz;
        zzhdl.zzd |= 128;
    }

    static /* synthetic */ void zzn(zzhdl zzhdl, zzhdh zzhdh) {
        zzhdh.getClass();
        zzhdl.zzu = zzhdh;
        zzhdl.zzd |= 8192;
    }

    static /* synthetic */ void zzo(zzhdl zzhdl, Iterable iterable) {
        zzgym zzgym = zzhdl.zzx;
        if (!zzgym.zzc()) {
            zzhdl.zzx = zzgyd.zzaM(zzgym);
        }
        zzgwe.zzau(iterable, zzhdl.zzx);
    }

    static /* synthetic */ void zzp(zzhdl zzhdl, Iterable iterable) {
        zzgym zzgym = zzhdl.zzy;
        if (!zzgym.zzc()) {
            zzhdl.zzy = zzgyd.zzaM(zzgym);
        }
        zzgwe.zzau(iterable, zzhdl.zzy);
    }

    static /* synthetic */ void zzq(zzhdl zzhdl, int i) {
        zzhdl.zze = i - 1;
        zzhdl.zzd |= 1;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzF);
        }
        byte b2 = 1;
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0007\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", zzhdf.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", zzhda.zza, "zzf", zzhcb.zza, "zzj", "zzm", "zzn", "zzt", "zzl", zzhdp.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzhdv.class, "zzB", "zzC", "zzD", "zzE", zzhcm.class});
        } else if (i2 == 3) {
            return new zzhdl();
        } else {
            if (i2 == 4) {
                return new zzhcc((zzhbs) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b2 = 0;
            }
            this.zzF = b2;
            return null;
        }
    }
}
