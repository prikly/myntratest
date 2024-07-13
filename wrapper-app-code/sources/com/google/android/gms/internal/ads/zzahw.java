package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzahw implements zzyu {
    private final zzel zza;
    private final zzef zzb = new zzef();

    /* synthetic */ zzahw(zzel zzel, zzahv zzahv) {
        this.zza = zzel;
    }

    public final zzyt zza(zzzk zzzk, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzzk.zzf();
        int min = (int) Math.min(20000, zzzk.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzyz) zzzk).zzm(this.zzb.zzH(), 0, min, false);
        zzef zzef = this.zzb;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (zzef.zza() >= 4) {
            if (zzahx.zzh(zzef.zzH(), zzef.zzc()) != 442) {
                zzef.zzG(1);
            } else {
                zzef.zzG(4);
                long zzc = zzahy.zzc(zzef);
                if (zzc != -9223372036854775807L) {
                    long zzb2 = this.zza.zzb(zzc);
                    if (zzb2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzyt.zzd(zzb2, zzf);
                        }
                        j2 = (long) i2;
                    } else if (100000 + zzb2 > j) {
                        j2 = (long) zzef.zzc();
                    } else {
                        i2 = zzef.zzc();
                        j3 = zzb2;
                    }
                    return zzyt.zze(zzf + j2);
                }
                int zzd = zzef.zzd();
                if (zzef.zza() >= 10) {
                    zzef.zzG(9);
                    int zzk = zzef.zzk() & 7;
                    if (zzef.zza() >= zzk) {
                        zzef.zzG(zzk);
                        if (zzef.zza() >= 4) {
                            if (zzahx.zzh(zzef.zzH(), zzef.zzc()) == 443) {
                                zzef.zzG(4);
                                int zzo = zzef.zzo();
                                if (zzef.zza() < zzo) {
                                    zzef.zzF(zzd);
                                } else {
                                    zzef.zzG(zzo);
                                }
                            }
                            while (true) {
                                if (zzef.zza() < 4 || (zzh = zzahx.zzh(zzef.zzH(), zzef.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzef.zzG(4);
                                if (zzef.zza() < 2) {
                                    zzef.zzF(zzd);
                                    break;
                                }
                                zzef.zzF(Math.min(zzef.zzd(), zzef.zzc() + zzef.zzo()));
                            }
                        } else {
                            zzef.zzF(zzd);
                        }
                    } else {
                        zzef.zzF(zzd);
                    }
                } else {
                    zzef.zzF(zzd);
                }
                i = zzef.zzc();
            }
        }
        return j3 != -9223372036854775807L ? zzyt.zzf(j3, zzf + ((long) i)) : zzyt.zza;
    }

    public final void zzb() {
        zzef zzef = this.zzb;
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        zzef.zzD(bArr, 0);
    }
}
