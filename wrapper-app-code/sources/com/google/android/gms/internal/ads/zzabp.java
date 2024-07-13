package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzabp implements zzzj {
    public static final zzzq zza = zzabo.zza;
    private final byte[] zzb;
    private final zzef zzc;
    private final zzzr zzd;
    private zzzm zze;
    private zzaaq zzf;
    private int zzg;
    private zzbq zzh;
    private zzzw zzi;
    private int zzj;
    private int zzk;
    private zzabn zzl;
    private int zzm;
    private long zzn;

    public zzabp() {
        this(0);
    }

    public zzabp(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzef(new byte[32768], 0);
        this.zzd = new zzzr();
        this.zzg = 0;
    }

    private final long zze(zzef zzef, boolean z) {
        boolean z2;
        if (this.zzi != null) {
            int zzc2 = zzef.zzc();
            while (zzc2 <= zzef.zzd() - 16) {
                zzef.zzF(zzc2);
                if (zzzs.zzc(zzef, this.zzi, this.zzk, this.zzd)) {
                    zzef.zzF(zzc2);
                    return this.zzd.zza;
                }
                zzc2++;
            }
            if (z) {
                while (zzc2 <= zzef.zzd() - this.zzj) {
                    zzef.zzF(zzc2);
                    try {
                        z2 = zzzs.zzc(zzef, this.zzi, this.zzk, this.zzd);
                    } catch (IndexOutOfBoundsException unused) {
                        z2 = false;
                    }
                    if (zzef.zzc() <= zzef.zzd() && z2) {
                        zzef.zzF(zzc2);
                        return this.zzd.zza;
                    }
                    zzc2++;
                }
                zzef.zzF(zzef.zzd());
                return -1;
            }
            zzef.zzF(zzc2);
            return -1;
        }
        throw null;
    }

    private final void zzf() {
        long j = this.zzn;
        zzzw zzzw = this.zzi;
        int i = zzen.zza;
        this.zzf.zzs((j * 1000000) / ((long) zzzw.zze), 1, this.zzm, 0, (zzaap) null);
    }

    public final void zzb(zzzm zzzm) {
        this.zze = zzzm;
        this.zzf = zzzm.zzv(0, 1);
        zzzm.zzC();
    }

    public final boolean zzd(zzzk zzzk) throws IOException {
        zzzt.zza(zzzk, false);
        zzef zzef = new zzef(4);
        ((zzyz) zzzk).zzm(zzef.zzH(), 0, 4, false);
        if (zzef.zzs() == 1716281667) {
            return true;
        }
        return false;
    }

    public final void zzc(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzabn zzabn = this.zzl;
            if (zzabn != null) {
                zzabn.zzd(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.zzn = j3;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    public final int zza(zzzk zzzk, zzaaj zzaaj) throws IOException {
        boolean zzl2;
        zzaam zzaam;
        zzzk zzzk2 = zzzk;
        int i = this.zzg;
        boolean z = true;
        if (i == 0) {
            zzzk.zzj();
            long zze2 = zzzk.zze();
            zzbq zza2 = zzzt.zza(zzzk2, true);
            ((zzyz) zzzk2).zzo((int) (zzzk.zze() - zze2), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i == 1) {
            ((zzyz) zzzk2).zzm(this.zzb, 0, 42, false);
            zzzk.zzj();
            this.zzg = 2;
            return 0;
        } else if (i == 2) {
            zzef zzef = new zzef(4);
            ((zzyz) zzzk2).zzn(zzef.zzH(), 0, 4, false);
            if (zzef.zzs() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzbu.zza("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i == 3) {
            zzzw zzzw = this.zzi;
            do {
                zzzk.zzj();
                zzee zzee = new zzee(new byte[4], 4);
                zzyz zzyz = (zzyz) zzzk2;
                zzyz.zzm(zzee.zza, 0, 4, false);
                zzl2 = zzee.zzl();
                int zzc2 = zzee.zzc(7);
                int zzc3 = zzee.zzc(24) + 4;
                if (zzc2 == 0) {
                    byte[] bArr = new byte[38];
                    zzyz.zzn(bArr, 0, 38, false);
                    zzzw = new zzzw(bArr, 4);
                } else if (zzzw == null) {
                    throw new IllegalArgumentException();
                } else if (zzc2 == 3) {
                    zzef zzef2 = new zzef(zzc3);
                    zzyz.zzn(zzef2.zzH(), 0, zzc3, false);
                    zzzw = zzzw.zzf(zzzt.zzb(zzef2));
                } else if (zzc2 == 4) {
                    zzef zzef3 = new zzef(zzc3);
                    zzyz.zzn(zzef3.zzH(), 0, zzc3, false);
                    zzef3.zzG(4);
                    zzzw = zzzw.zzg(Arrays.asList(zzaaw.zzc(zzef3, false, false).zzb));
                } else if (zzc2 == 6) {
                    zzef zzef4 = new zzef(zzc3);
                    zzyz.zzn(zzef4.zzH(), 0, zzc3, false);
                    zzef4.zzG(4);
                    zzzw = zzzw.zze(zzgau.zzp(zzacj.zzb(zzef4)));
                } else {
                    zzyz.zzo(zzc3, false);
                }
                int i2 = zzen.zza;
                this.zzi = zzzw;
            } while (!zzl2);
            if (zzzw != null) {
                this.zzj = Math.max(zzzw.zzc, 6);
                this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
                this.zzg = 4;
                return 0;
            }
            throw null;
        } else if (i == 4) {
            zzzk.zzj();
            zzef zzef5 = new zzef(2);
            ((zzyz) zzzk2).zzm(zzef5.zzH(), 0, 2, false);
            int zzo = zzef5.zzo();
            if ((zzo >> 2) == 16382) {
                zzzk.zzj();
                this.zzk = zzo;
                zzzm zzzm = this.zze;
                int i3 = zzen.zza;
                long zzf2 = zzzk.zzf();
                long zzd2 = zzzk.zzd();
                zzzw zzzw2 = this.zzi;
                if (zzzw2 != null) {
                    if (zzzw2.zzk != null) {
                        zzaam = new zzzu(zzzw2, zzf2);
                    } else if (zzd2 == -1 || zzzw2.zzj <= 0) {
                        zzaam = new zzaal(zzzw2.zza(), 0);
                    } else {
                        zzabn zzabn = new zzabn(zzzw2, this.zzk, zzf2, zzd2);
                        this.zzl = zzabn;
                        zzaam = zzabn.zzb();
                    }
                    zzzm.zzN(zzaam);
                    this.zzg = 5;
                    return 0;
                }
                throw null;
            }
            zzzk.zzj();
            throw zzbu.zza("First frame does not start with sync code.", (Throwable) null);
        } else if (this.zzf != null) {
            zzzw zzzw3 = this.zzi;
            if (zzzw3 != null) {
                zzabn zzabn2 = this.zzl;
                if (zzabn2 != null && zzabn2.zze()) {
                    return zzabn2.zza(zzzk2, zzaaj);
                }
                if (this.zzn == -1) {
                    this.zzn = zzzs.zzb(zzzk2, zzzw3);
                    return 0;
                }
                zzef zzef6 = this.zzc;
                int zzd3 = zzef6.zzd();
                if (zzd3 < 32768) {
                    int zza3 = zzzk2.zza(zzef6.zzH(), zzd3, 32768 - zzd3);
                    if (zza3 != -1) {
                        z = false;
                    }
                    if (!z) {
                        this.zzc.zzE(zzd3 + zza3);
                    } else if (this.zzc.zza() == 0) {
                        zzf();
                        return -1;
                    }
                } else {
                    z = false;
                }
                zzef zzef7 = this.zzc;
                int zzc4 = zzef7.zzc();
                int i4 = this.zzm;
                int i5 = this.zzj;
                if (i4 < i5) {
                    zzef7.zzG(Math.min(i5 - i4, zzef7.zza()));
                }
                long zze3 = zze(this.zzc, z);
                zzef zzef8 = this.zzc;
                int zzc5 = zzef8.zzc() - zzc4;
                zzef8.zzF(zzc4);
                zzaao.zzb(this.zzf, this.zzc, zzc5);
                this.zzm += zzc5;
                if (zze3 != -1) {
                    zzf();
                    this.zzm = 0;
                    this.zzn = zze3;
                }
                zzef zzef9 = this.zzc;
                if (zzef9.zza() >= 16) {
                    return 0;
                }
                int zza4 = zzef9.zza();
                System.arraycopy(zzef9.zzH(), zzef9.zzc(), zzef9.zzH(), 0, zza4);
                this.zzc.zzF(0);
                this.zzc.zzE(zza4);
                return 0;
            }
            throw null;
        } else {
            throw null;
        }
    }
}
