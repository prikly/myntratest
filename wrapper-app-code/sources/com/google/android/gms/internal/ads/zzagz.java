package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzagz implements zzahd {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzee zzc = new zzee(new byte[7], 7);
    private final zzef zzd = new zzef(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzaaq zzg;
    private zzaaq zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzaaq zzu;
    private long zzv;

    public zzagz(boolean z, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzaaq zzaaq, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzaaq;
        this.zzv = j;
        this.zzs = i2;
    }

    private final boolean zzk(zzef zzef, byte[] bArr, int i) {
        int min = Math.min(zzef.zza(), i - this.zzj);
        zzef.zzB(bArr, this.zzj, min);
        int i2 = this.zzj + min;
        this.zzj = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b2, byte b3) {
        return zzf((b3 & 255) | Ascii.NUL);
    }

    private static final boolean zzm(zzef zzef, byte[] bArr, int i) {
        if (zzef.zza() < i) {
            return false;
        }
        zzef.zzB(bArr, 0, i);
        return true;
    }

    public final void zza(zzef zzef) throws zzbu {
        int i;
        byte b2;
        int i2;
        zzef zzef2 = zzef;
        if (this.zzg != null) {
            int i3 = zzen.zza;
            while (zzef.zza() > 0) {
                int i4 = this.zzi;
                int i5 = 13;
                int i6 = 2;
                if (i4 == 0) {
                    byte[] zzH = zzef.zzH();
                    int zzc2 = zzef.zzc();
                    int zzd2 = zzef.zzd();
                    while (true) {
                        if (zzc2 >= zzd2) {
                            zzef2.zzF(zzc2);
                            break;
                        }
                        i = zzc2 + 1;
                        b2 = zzH[zzc2] & 255;
                        if (this.zzk == 512 && zzl((byte) -1, (byte) b2)) {
                            if (this.zzm) {
                                break;
                            }
                            int i7 = i - 2;
                            zzef2.zzF(i7 + 1);
                            if (zzm(zzef2, this.zzc.zza, 1)) {
                                this.zzc.zzh(4);
                                int zzc3 = this.zzc.zzc(1);
                                int i8 = this.zzn;
                                if (i8 == -1 || zzc3 == i8) {
                                    if (this.zzo != -1) {
                                        if (!zzm(zzef2, this.zzc.zza, 1)) {
                                            break;
                                        }
                                        this.zzc.zzh(i6);
                                        if (this.zzc.zzc(4) == this.zzo) {
                                            zzef2.zzF(i7 + 2);
                                        }
                                    }
                                    if (!zzm(zzef2, this.zzc.zza, 4)) {
                                        break;
                                    }
                                    this.zzc.zzh(14);
                                    int zzc4 = this.zzc.zzc(i5);
                                    if (zzc4 >= 7) {
                                        byte[] zzH2 = zzef.zzH();
                                        int zzd3 = zzef.zzd();
                                        int i9 = i7 + zzc4;
                                        if (i9 < zzd3) {
                                            byte b3 = zzH2[i9];
                                            if (b3 != -1) {
                                                if (b3 == 73) {
                                                    int i10 = i9 + 1;
                                                    if (i10 != zzd3) {
                                                        if (zzH2[i10] == 68) {
                                                            int i11 = i9 + 2;
                                                            if (i11 != zzd3) {
                                                                if (zzH2[i11] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i12 = i9 + 1;
                                                if (i12 == zzd3) {
                                                    break;
                                                }
                                                byte b4 = zzH2[i12];
                                                if (zzl((byte) -1, b4) && ((b4 & 8) >> 3) == zzc3) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        int i13 = this.zzk;
                        byte b5 = i13 | b2;
                        if (b5 == 329) {
                            i2 = 768;
                        } else if (b5 == 511) {
                            i2 = 512;
                        } else if (b5 != 836) {
                            if (b5 == 1075) {
                                this.zzi = 2;
                                this.zzj = 3;
                                this.zzs = 0;
                                this.zzd.zzF(0);
                                zzef2.zzF(i);
                                break;
                            } else if (i13 != 256) {
                                this.zzk = 256;
                                zzc2 = i - 1;
                                i5 = 13;
                                i6 = 2;
                            } else {
                                zzc2 = i;
                                i5 = 13;
                                i6 = 2;
                            }
                        } else {
                            i2 = 1024;
                        }
                        this.zzk = i2;
                        zzc2 = i;
                        i5 = 13;
                        i6 = 2;
                    }
                    this.zzp = (b2 & 8) >> 3;
                    this.zzl = 1 == ((b2 & 1) ^ 1);
                    if (!this.zzm) {
                        this.zzi = 1;
                        this.zzj = 0;
                    } else {
                        zzi();
                    }
                    zzef2.zzF(i);
                } else if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            int min = Math.min(zzef.zza(), this.zzs - this.zzj);
                            this.zzu.zzq(zzef2, min);
                            int i14 = this.zzj + min;
                            this.zzj = i14;
                            int i15 = this.zzs;
                            if (i14 == i15) {
                                long j = this.zzt;
                                if (j != -9223372036854775807L) {
                                    this.zzu.zzs(j, 1, i15, 0, (zzaap) null);
                                    this.zzt += this.zzv;
                                }
                                zzh();
                            }
                        } else {
                            if (zzk(zzef2, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                                this.zzc.zzh(0);
                                if (!this.zzq) {
                                    int zzc5 = this.zzc.zzc(2) + 1;
                                    if (zzc5 != 2) {
                                        zzdw.zze("AdtsReader", "Detected audio object type: " + zzc5 + ", but assuming AAC LC.");
                                    }
                                    this.zzc.zzj(5);
                                    int zzc6 = this.zzc.zzc(3);
                                    int i16 = this.zzo;
                                    int i17 = zzyh.zza;
                                    byte[] bArr = {(byte) (((i16 >> 1) & 7) | 16), (byte) (((zzc6 << 3) & 120) | ((i16 << 7) & 128))};
                                    zzyg zza2 = zzyh.zza(bArr);
                                    zzad zzad = new zzad();
                                    zzad.zzH(this.zzf);
                                    zzad.zzS("audio/mp4a-latm");
                                    zzad.zzx(zza2.zzc);
                                    zzad.zzw(zza2.zzb);
                                    zzad.zzT(zza2.zza);
                                    zzad.zzI(Collections.singletonList(bArr));
                                    zzad.zzK(this.zze);
                                    zzaf zzY = zzad.zzY();
                                    this.zzr = 1024000000 / ((long) zzY.zzA);
                                    this.zzg.zzk(zzY);
                                    this.zzq = true;
                                } else {
                                    this.zzc.zzj(10);
                                }
                                this.zzc.zzj(4);
                                int zzc7 = this.zzc.zzc(13) - 7;
                                if (this.zzl) {
                                    zzc7 -= 2;
                                }
                                zzj(this.zzg, this.zzr, 0, zzc7);
                            }
                        }
                    } else if (zzk(zzef2, this.zzd.zzH(), 10)) {
                        this.zzh.zzq(this.zzd, 10);
                        this.zzd.zzF(6);
                        zzj(this.zzh, 0, 10, 10 + this.zzd.zzj());
                    }
                } else if (zzef.zza() != 0) {
                    zzee zzee = this.zzc;
                    zzee.zza[0] = zzef.zzH()[zzef.zzc()];
                    zzee.zzh(2);
                    int zzc8 = this.zzc.zzc(4);
                    int i18 = this.zzo;
                    if (i18 == -1 || zzc8 == i18) {
                        if (!this.zzm) {
                            this.zzm = true;
                            this.zzn = this.zzp;
                            this.zzo = zzc8;
                        }
                        zzi();
                    } else {
                        zzg();
                    }
                }
            }
            return;
        }
        throw null;
    }

    public final void zzb(zzzm zzzm, zzaip zzaip) {
        zzaip.zzc();
        this.zzf = zzaip.zzb();
        zzaaq zzv2 = zzzm.zzv(zzaip.zza(), 1);
        this.zzg = zzv2;
        this.zzu = zzv2;
        if (this.zzb) {
            zzaip.zzc();
            zzaaq zzv3 = zzzm.zzv(zzaip.zza(), 5);
            this.zzh = zzv3;
            zzad zzad = new zzad();
            zzad.zzH(zzaip.zzb());
            zzad.zzS("application/id3");
            zzv3.zzk(zzad.zzY());
            return;
        }
        this.zzh = new zzzi();
    }

    public final void zzc() {
    }

    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzt = j;
        }
    }

    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
