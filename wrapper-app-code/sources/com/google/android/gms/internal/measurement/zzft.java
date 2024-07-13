package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzft extends zzkf implements zzln {
    /* access modifiers changed from: private */
    public static final zzft zza;
    private int zzd;
    /* access modifiers changed from: private */
    public zzkm zze = zzbE();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        zzft zzft = new zzft();
        zza = zzft;
        zzkf.zzbL(zzft.class, zzft);
    }

    private zzft() {
    }

    public static zzfs zze() {
        return (zzfs) zza.zzbx();
    }

    static /* synthetic */ void zzj(zzft zzft, int i, zzfx zzfx) {
        zzfx.getClass();
        zzft.zzv();
        zzft.zze.set(i, zzfx);
    }

    static /* synthetic */ void zzk(zzft zzft, zzfx zzfx) {
        zzfx.getClass();
        zzft.zzv();
        zzft.zze.add(zzfx);
    }

    static /* synthetic */ void zzm(zzft zzft, Iterable iterable) {
        zzft.zzv();
        zzio.zzbt(iterable, zzft.zze);
    }

    static /* synthetic */ void zzo(zzft zzft, int i) {
        zzft.zzv();
        zzft.zze.remove(i);
    }

    static /* synthetic */ void zzp(zzft zzft, String str) {
        str.getClass();
        zzft.zzd |= 1;
        zzft.zzf = str;
    }

    static /* synthetic */ void zzq(zzft zzft, long j) {
        zzft.zzd |= 2;
        zzft.zzg = j;
    }

    static /* synthetic */ void zzr(zzft zzft, long j) {
        zzft.zzd |= 4;
        zzft.zzh = j;
    }

    private final void zzv() {
        zzkm zzkm = this.zze;
        if (!zzkm.zzc()) {
            this.zze = zzkf.zzbF(zzkm);
        }
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final zzfx zzg(int i) {
        return (zzfx) this.zze.get(i);
    }

    public final String zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbI(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", zzfx.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzft();
        } else {
            if (i2 == 4) {
                return new zzfs((zzfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final boolean zzs() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 2) != 0;
    }
}
