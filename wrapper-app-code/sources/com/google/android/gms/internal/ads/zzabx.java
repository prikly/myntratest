package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzabx implements zzzj {
    private final zzef zza = new zzef(6);
    private zzzm zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf = -1;
    private zzadu zzg;
    private zzzk zzh;
    private zzaca zzi;
    private zzafr zzj;

    private final int zze(zzzk zzzk) throws IOException {
        this.zza.zzC(2);
        ((zzyz) zzzk).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbp[0]);
        zzzm zzzm = this.zzb;
        if (zzzm != null) {
            zzzm.zzC();
            this.zzb.zzN(new zzaal(-9223372036854775807L, 0));
            this.zzc = 6;
            return;
        }
        throw null;
    }

    public final int zza(zzzk zzzk, zzaaj zzaaj) throws IOException {
        String zzv;
        zzabz zza2;
        long j;
        zzzk zzzk2 = zzzk;
        zzaaj zzaaj2 = zzaaj;
        int i = this.zzc;
        if (i == 0) {
            this.zza.zzC(2);
            ((zzyz) zzzk2).zzn(this.zza.zzH(), 0, 2, false);
            int zzo = this.zza.zzo();
            this.zzd = zzo;
            if (zzo == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzf();
                }
            } else if ((zzo < 65488 || zzo > 65497) && zzo != 65281) {
                this.zzc = 1;
            }
            return 0;
        } else if (i != 1) {
            zzadu zzadu = null;
            if (i == 2) {
                if (this.zzd == 65505) {
                    zzef zzef = new zzef(this.zze);
                    ((zzyz) zzzk2).zzn(zzef.zzH(), 0, this.zze, false);
                    if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzef.zzv(0)) && (zzv = zzef.zzv(0)) != null) {
                        long zzd2 = zzzk.zzd();
                        if (!(zzd2 == -1 || (zza2 = zzacd.zza(zzv)) == null || zza2.zzb.size() < 2)) {
                            long j2 = -1;
                            long j3 = -1;
                            long j4 = -1;
                            long j5 = -1;
                            boolean z = false;
                            for (int size = zza2.zzb.size() - 1; size >= 0; size--) {
                                zzaby zzaby = (zzaby) zza2.zzb.get(size);
                                z |= "video/mp4".equals(zzaby.zza);
                                if (size == 0) {
                                    zzd2 -= zzaby.zzd;
                                    j = 0;
                                } else {
                                    j = zzd2 - zzaby.zzc;
                                }
                                long j6 = zzd2;
                                zzd2 = j;
                                long j7 = j6;
                                if (z && zzd2 != j7) {
                                    j5 = j7 - zzd2;
                                    j4 = zzd2;
                                    z = false;
                                }
                                if (size == 0) {
                                    j3 = j7;
                                }
                                if (size == 0) {
                                    j2 = zzd2;
                                }
                            }
                            zzadu = (j4 == -1 || j5 == -1 || j2 == -1 || j3 == -1) ? null : new zzadu(j2, j3, zza2.zza, j4, j5);
                        }
                        this.zzg = zzadu;
                        if (zzadu != null) {
                            this.zzf = zzadu.zzd;
                        }
                    }
                } else {
                    ((zzyz) zzzk2).zzo(this.zze, false);
                }
                this.zzc = 0;
                return 0;
            } else if (i == 4) {
                long zzf2 = zzzk.zzf();
                long j8 = this.zzf;
                if (zzf2 == j8) {
                    if (!zzzk2.zzm(this.zza.zzH(), 0, 1, true)) {
                        zzf();
                    } else {
                        zzzk.zzj();
                        if (this.zzj == null) {
                            this.zzj = new zzafr(0);
                        }
                        zzaca zzaca = new zzaca(zzzk2, this.zzf);
                        this.zzi = zzaca;
                        if (this.zzj.zzd(zzaca)) {
                            zzafr zzafr = this.zzj;
                            long j9 = this.zzf;
                            zzzm zzzm = this.zzb;
                            if (zzzm != null) {
                                zzafr.zzb(new zzacc(j9, zzzm));
                                zzbp[] zzbpArr = new zzbp[1];
                                zzadu zzadu2 = this.zzg;
                                if (zzadu2 != null) {
                                    zzbpArr[0] = zzadu2;
                                    zzg(zzbpArr);
                                    this.zzc = 5;
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            zzf();
                        }
                    }
                    return 0;
                }
                zzaaj2.zza = j8;
                return 1;
            } else if (i == 5) {
                if (this.zzi == null || zzzk2 != this.zzh) {
                    this.zzh = zzzk2;
                    this.zzi = new zzaca(zzzk2, this.zzf);
                }
                zzafr zzafr2 = this.zzj;
                if (zzafr2 != null) {
                    int zza3 = zzafr2.zza(this.zzi, zzaaj2);
                    if (zza3 == 1) {
                        zzaaj2.zza += this.zzf;
                    }
                    return zza3;
                }
                throw null;
            } else if (i == 6) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        } else {
            this.zza.zzC(2);
            ((zzyz) zzzk2).zzn(this.zza.zzH(), 0, 2, false);
            this.zze = this.zza.zzo() - 2;
            this.zzc = 2;
            return 0;
        }
    }

    public final void zzb(zzzm zzzm) {
        this.zzb = zzzm;
    }

    public final boolean zzd(zzzk zzzk) throws IOException {
        if (zze(zzzk) != 65496) {
            return false;
        }
        int zze2 = zze(zzzk);
        this.zzd = zze2;
        if (zze2 == 65504) {
            this.zza.zzC(2);
            zzyz zzyz = (zzyz) zzzk;
            zzyz.zzm(this.zza.zzH(), 0, 2, false);
            zzyz.zzl(this.zza.zzo() - 2, false);
            zze2 = zze(zzzk);
            this.zzd = zze2;
        }
        if (zze2 == 65505) {
            zzyz zzyz2 = (zzyz) zzzk;
            zzyz2.zzl(2, false);
            this.zza.zzC(6);
            zzyz2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzafr zzafr = this.zzj;
            if (zzafr != null) {
                zzafr.zzc(j, j2);
                return;
            }
            throw null;
        }
    }

    private final void zzg(zzbp... zzbpArr) {
        zzzm zzzm = this.zzb;
        if (zzzm != null) {
            zzaaq zzv = zzzm.zzv(1024, 4);
            zzad zzad = new zzad();
            zzad.zzz("image/jpeg");
            zzad.zzM(new zzbq(-9223372036854775807L, zzbpArr));
            zzv.zzk(zzad.zzY());
            return;
        }
        throw null;
    }
}
