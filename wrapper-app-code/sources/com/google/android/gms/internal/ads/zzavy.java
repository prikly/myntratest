package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzavy implements zzavg {
    public static final zzavi zza = new zzavt();
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */
    public static final UUID zzd = new UUID(72057594037932032L, -9223371306706625679L);
    private boolean zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private zzbam zzE;
    private zzbam zzF;
    private boolean zzG;
    private int zzH;
    private long zzI;
    private long zzJ;
    private int zzK;
    private int zzL;
    private int[] zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private byte zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    private boolean zzaa;
    private zzavh zzab;
    private final zzavs zzac;
    private final zzawa zze;
    private final SparseArray zzf;
    private final boolean zzg;
    private final zzbar zzh;
    private final zzbar zzi;
    private final zzbar zzj;
    private final zzbar zzk;
    private final zzbar zzl;
    private final zzbar zzm;
    private final zzbar zzn;
    private final zzbar zzo;
    private final zzbar zzp;
    private ByteBuffer zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private zzavx zzw;
    private boolean zzx;
    private int zzy;
    private long zzz;

    public zzavy() {
        this(0);
    }

    static final int zzl(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static final boolean zzm(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    private final long zzn(long j) throws zzatg {
        long j2 = this.zzt;
        if (j2 != -9223372036854775807L) {
            return zzbay.zzj(j, j2, 1000);
        }
        throw new zzatg("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void zzo(zzavx zzavx, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(zzavx.zza)) {
            byte[] bArr2 = this.zzn.zza;
            long j2 = this.zzJ;
            if (j2 == -9223372036854775807L) {
                bArr = zzc;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = zzbay.zzq(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (i3 * 1000000))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            zzavp zzavp = zzavx.zzN;
            zzbar zzbar = this.zzn;
            zzavp.zzb(zzbar, zzbar.zzd());
            this.zzY += this.zzn.zzd();
        }
        zzavx.zzN.zzc(j, this.zzP, this.zzY, 0, zzavx.zzg);
        this.zzZ = true;
        zzp();
    }

    private final void zzp() {
        this.zzQ = 0;
        this.zzY = 0;
        this.zzX = 0;
        this.zzR = false;
        this.zzS = false;
        this.zzU = false;
        this.zzW = 0;
        this.zzV = 0;
        this.zzT = false;
        this.zzm.zzr();
    }

    private static int[] zzq(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final int zzr(zzavf zzavf, zzavp zzavp, int i) throws IOException, InterruptedException {
        int i2;
        int zza2 = this.zzm.zza();
        if (zza2 > 0) {
            i2 = Math.min(i, zza2);
            zzavp.zzb(this.zzm, i2);
        } else {
            i2 = zzavp.zzd(zzavf, i, false);
        }
        this.zzQ += i2;
        this.zzY += i2;
        return i2;
    }

    private final void zzs(zzavf zzavf, int i) throws IOException, InterruptedException {
        if (this.zzj.zzd() < i) {
            if (this.zzj.zzb() < i) {
                zzbar zzbar = this.zzj;
                byte[] bArr = zzbar.zza;
                int length = bArr.length;
                zzbar.zzt(Arrays.copyOf(bArr, Math.max(length + length, i)), this.zzj.zzd());
            }
            zzbar zzbar2 = this.zzj;
            zzavf.zzh(zzbar2.zza, zzbar2.zzd(), i - this.zzj.zzd(), false);
            this.zzj.zzu(i);
        }
    }

    private final void zzt(zzavf zzavf, zzavx zzavx, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzavx.zza)) {
            int i3 = i + 32;
            if (this.zzn.zzb() < i3) {
                this.zzn.zza = Arrays.copyOf(zzb, i3 + i);
            }
            zzavf.zzh(this.zzn.zza, 32, i, false);
            this.zzn.zzv(0);
            this.zzn.zzu(i3);
            return;
        }
        zzavp zzavp = zzavx.zzN;
        if (!this.zzR) {
            if (zzavx.zze) {
                this.zzP &= -1073741825;
                int i4 = 128;
                if (!this.zzS) {
                    zzavf.zzh(this.zzj.zza, 0, 1, false);
                    this.zzQ++;
                    byte b2 = this.zzj.zza[0];
                    if ((b2 & 128) != 128) {
                        this.zzV = b2;
                        this.zzS = true;
                    } else {
                        throw new zzatg("Extension bit is set in signal byte");
                    }
                }
                byte b3 = this.zzV;
                if ((b3 & 1) == 1) {
                    byte b4 = b3 & 2;
                    this.zzP |= 1073741824;
                    if (!this.zzT) {
                        zzavf.zzh(this.zzo.zza, 0, 8, false);
                        this.zzQ += 8;
                        this.zzT = true;
                        zzbar zzbar = this.zzj;
                        byte[] bArr = zzbar.zza;
                        if (b4 != 2) {
                            i4 = 0;
                        }
                        bArr[0] = (byte) (i4 | 8);
                        zzbar.zzv(0);
                        zzavp.zzb(this.zzj, 1);
                        this.zzY++;
                        this.zzo.zzv(0);
                        zzavp.zzb(this.zzo, 8);
                        this.zzY += 8;
                    }
                    if (b4 == 2) {
                        if (!this.zzU) {
                            zzavf.zzh(this.zzj.zza, 0, 1, false);
                            this.zzQ++;
                            this.zzj.zzv(0);
                            this.zzW = this.zzj.zzg();
                            this.zzU = true;
                        }
                        int i5 = this.zzW * 4;
                        this.zzj.zzs(i5);
                        zzavf.zzh(this.zzj.zza, 0, i5, false);
                        this.zzQ += i5;
                        int i6 = (this.zzW >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzq;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.zzq = ByteBuffer.allocate(i7);
                        }
                        this.zzq.position(0);
                        this.zzq.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.zzW;
                            if (i8 >= i2) {
                                break;
                            }
                            int zzi2 = this.zzj.zzi();
                            if (i8 % 2 == 0) {
                                this.zzq.putShort((short) (zzi2 - i9));
                            } else {
                                this.zzq.putInt(zzi2 - i9);
                            }
                            i8++;
                            i9 = zzi2;
                        }
                        int i10 = (i - this.zzQ) - i9;
                        if ((i2 & 1) == 1) {
                            this.zzq.putInt(i10);
                        } else {
                            this.zzq.putShort((short) i10);
                            this.zzq.putInt(0);
                        }
                        this.zzp.zzt(this.zzq.array(), i7);
                        zzavp.zzb(this.zzp, i7);
                        this.zzY += i7;
                    }
                }
            } else {
                byte[] bArr2 = zzavx.zzf;
                if (bArr2 != null) {
                    this.zzm.zzt(bArr2, bArr2.length);
                }
            }
            this.zzR = true;
        }
        int zzd2 = i + this.zzm.zzd();
        if (!"V_MPEG4/ISO/AVC".equals(zzavx.zza) && !"V_MPEGH/ISO/HEVC".equals(zzavx.zza)) {
            while (true) {
                int i11 = this.zzQ;
                if (i11 >= zzd2) {
                    break;
                }
                zzr(zzavf, zzavp, zzd2 - i11);
            }
        } else {
            byte[] bArr3 = this.zzi.zza;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i12 = zzavx.zzO;
            int i13 = 4 - i12;
            while (this.zzQ < zzd2) {
                int i14 = this.zzX;
                if (i14 == 0) {
                    int min = Math.min(i12, this.zzm.zza());
                    zzavf.zzh(bArr3, i13 + min, i12 - min, false);
                    if (min > 0) {
                        this.zzm.zzq(bArr3, i13, min);
                    }
                    this.zzQ += i12;
                    this.zzi.zzv(0);
                    this.zzX = this.zzi.zzi();
                    this.zzh.zzv(0);
                    zzavp.zzb(this.zzh, 4);
                    this.zzY += 4;
                } else {
                    this.zzX = i14 - zzr(zzavf, zzavp, i14);
                }
            }
        }
        if ("A_VORBIS".equals(zzavx.zza)) {
            this.zzk.zzv(0);
            zzavp.zzb(this.zzk, 4);
            this.zzY += 4;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(int i, double d2) {
        if (i == 181) {
            this.zzw.zzI = (int) d2;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.zzw.zzw = (float) d2;
                    return;
                case 21970:
                    this.zzw.zzx = (float) d2;
                    return;
                case 21971:
                    this.zzw.zzy = (float) d2;
                    return;
                case 21972:
                    this.zzw.zzz = (float) d2;
                    return;
                case 21973:
                    this.zzw.zzA = (float) d2;
                    return;
                case 21974:
                    this.zzw.zzB = (float) d2;
                    return;
                case 21975:
                    this.zzw.zzC = (float) d2;
                    return;
                case 21976:
                    this.zzw.zzD = (float) d2;
                    return;
                case 21977:
                    this.zzw.zzE = (float) d2;
                    return;
                case 21978:
                    this.zzw.zzF = (float) d2;
                    return;
                default:
                    return;
            }
        } else {
            this.zzu = (long) d2;
        }
    }

    public final void zzd(zzavh zzavh) {
        this.zzab = zzavh;
    }

    public final void zze(long j, long j2) {
        this.zzD = -9223372036854775807L;
        this.zzH = 0;
        this.zzac.zza();
        this.zze.zzd();
        zzp();
    }

    public final int zzf(zzavf zzavf, zzavl zzavl) throws IOException, InterruptedException {
        this.zzZ = false;
        while (!this.zzZ) {
            if (!this.zzac.zzc(zzavf)) {
                return -1;
            }
            long zzd2 = zzavf.zzd();
            if (this.zzA) {
                this.zzC = zzd2;
                zzavl.zza = this.zzB;
                this.zzA = false;
                return 1;
            } else if (this.zzx) {
                long j = this.zzC;
                if (j != -1) {
                    zzavl.zza = j;
                    this.zzC = -1;
                    return 1;
                }
            }
        }
        return 0;
    }

    public final boolean zzg(zzavf zzavf) throws IOException, InterruptedException {
        return new zzavz().zza(zzavf);
    }

    /* access modifiers changed from: package-private */
    public final void zzi(int i, long j, long j2) throws zzatg {
        if (i == 160) {
            this.zzaa = false;
        } else if (i == 174) {
            this.zzw = new zzavx((zzavw) null);
        } else if (i == 187) {
            this.zzG = false;
        } else if (i == 19899) {
            this.zzy = -1;
            this.zzz = -1;
        } else if (i == 20533) {
            this.zzw.zze = true;
        } else if (i == 21968) {
            this.zzw.zzq = true;
        } else if (i == 408125543) {
            long j3 = this.zzs;
            if (j3 == -1 || j3 == j) {
                this.zzs = j;
                this.zzr = j2;
                return;
            }
            throw new zzatg("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.zzE = new zzbam(32);
            this.zzF = new zzbam(32);
        } else if (i != 524531317 || this.zzx) {
        } else {
            if (!this.zzg || this.zzB == -1) {
                this.zzab.zzc(new zzavm(this.zzv));
                this.zzx = true;
                return;
            }
            this.zzA = true;
        }
    }

    public zzavy(int i) {
        zzavs zzavs = new zzavs();
        this.zzs = -1;
        this.zzt = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzB = -1;
        this.zzC = -1;
        this.zzD = -9223372036854775807L;
        this.zzac = zzavs;
        zzavs.zzb(new zzavv(this, (zzavu) null));
        this.zzg = true;
        this.zze = new zzawa();
        this.zzf = new SparseArray();
        this.zzj = new zzbar(4);
        this.zzk = new zzbar(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzl = new zzbar(4);
        this.zzh = new zzbar(zzbap.zza);
        this.zzi = new zzbar(4);
        this.zzm = new zzbar();
        this.zzn = new zzbar();
        this.zzo = new zzbar(8);
        this.zzp = new zzbar();
    }

    /* access modifiers changed from: package-private */
    public final void zzj(int i, String str) throws zzatg {
        if (i == 134) {
            this.zzw.zza = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                this.zzw.zzP = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new zzatg("DocType " + str + " not supported");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzh(int i, long j) throws zzatg {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.zzw.zzc = (int) j;
                        return;
                    case 136:
                        zzavx zzavx = this.zzw;
                        if (j == 1) {
                            z = true;
                        }
                        zzavx.zzL = z;
                        return;
                    case 155:
                        this.zzJ = zzn(j);
                        return;
                    case 159:
                        this.zzw.zzG = (int) j;
                        return;
                    case 176:
                        this.zzw.zzj = (int) j;
                        return;
                    case 179:
                        this.zzE.zzc(zzn(j));
                        return;
                    case 186:
                        this.zzw.zzk = (int) j;
                        return;
                    case 215:
                        this.zzw.zzb = (int) j;
                        return;
                    case 231:
                        this.zzD = zzn(j);
                        return;
                    case 241:
                        if (!this.zzG) {
                            this.zzF.zzc(j);
                            this.zzG = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzaa = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw new zzatg("ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw new zzatg("DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw new zzatg("EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw new zzatg("ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw new zzatg("AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case 21420:
                        this.zzz = j + this.zzs;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.zzw.zzp = 0;
                            return;
                        } else if (i2 == 1) {
                            this.zzw.zzp = 2;
                            return;
                        } else if (i2 == 3) {
                            this.zzw.zzp = 1;
                            return;
                        } else if (i2 == 15) {
                            this.zzw.zzp = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.zzw.zzl = (int) j;
                        return;
                    case 21682:
                        this.zzw.zzn = (int) j;
                        return;
                    case 21690:
                        this.zzw.zzm = (int) j;
                        return;
                    case 21930:
                        zzavx zzavx2 = this.zzw;
                        if (j == 1) {
                            z = true;
                        }
                        zzavx2.zzM = z;
                        return;
                    case 22186:
                        this.zzw.zzJ = j;
                        return;
                    case 22203:
                        this.zzw.zzK = j;
                        return;
                    case 25188:
                        this.zzw.zzH = (int) j;
                        return;
                    case 2352003:
                        this.zzw.zzd = (int) j;
                        return;
                    case 2807729:
                        this.zzt = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    this.zzw.zzt = 2;
                                    return;
                                } else if (i3 == 2) {
                                    this.zzw.zzt = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        this.zzw.zzs = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        this.zzw.zzs = 7;
                                        return;
                                    } else if (!(i4 == 6 || i4 == 7)) {
                                        return;
                                    }
                                }
                                this.zzw.zzs = 3;
                                return;
                            case 21947:
                                zzavx zzavx3 = this.zzw;
                                zzavx3.zzq = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    zzavx3.zzr = 1;
                                    return;
                                } else if (i5 == 9) {
                                    zzavx3.zzr = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    zzavx3.zzr = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.zzw.zzu = (int) j;
                                return;
                            case 21949:
                                this.zzw.zzv = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw new zzatg("ContentEncodingScope " + j + " not supported");
            }
        } else if (j != 0) {
            throw new zzatg("ContentEncodingOrder " + j + " not supported");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f1, code lost:
        throw new com.google.android.gms.internal.ads.zzatg("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzk(int r19, int r20, com.google.android.gms.internal.ads.zzavf r21) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r7 = 0
            if (r1 == r4) goto L_0x008f
            if (r1 == r5) goto L_0x008f
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0083
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0074
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0055
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x0049
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0032
            com.google.android.gms.internal.ads.zzavx r1 = r0.zzw
            byte[] r4 = new byte[r2]
            r1.zzo = r4
            byte[] r1 = r1.zzo
            r3.zzh(r1, r7, r2, r7)
            return
        L_0x0032:
            com.google.android.gms.internal.ads.zzatg r2 = new com.google.android.gms.internal.ads.zzatg
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0049:
            com.google.android.gms.internal.ads.zzavx r1 = r0.zzw
            byte[] r4 = new byte[r2]
            r1.zzh = r4
            byte[] r1 = r1.zzh
            r3.zzh(r1, r7, r2, r7)
            return
        L_0x0055:
            com.google.android.gms.internal.ads.zzbar r1 = r0.zzl
            byte[] r1 = r1.zza
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.zzbar r1 = r0.zzl
            byte[] r1 = r1.zza
            int r4 = 4 - r2
            r3.zzh(r1, r4, r2, r7)
            com.google.android.gms.internal.ads.zzbar r1 = r0.zzl
            r1.zzv(r7)
            com.google.android.gms.internal.ads.zzbar r1 = r0.zzl
            long r1 = r1.zzm()
            int r2 = (int) r1
            r0.zzy = r2
            return
        L_0x0074:
            byte[] r1 = new byte[r2]
            r3.zzh(r1, r7, r2, r7)
            com.google.android.gms.internal.ads.zzavx r2 = r0.zzw
            com.google.android.gms.internal.ads.zzavo r3 = new com.google.android.gms.internal.ads.zzavo
            r3.<init>(r6, r1)
            r2.zzg = r3
            return
        L_0x0083:
            com.google.android.gms.internal.ads.zzavx r1 = r0.zzw
            byte[] r4 = new byte[r2]
            r1.zzf = r4
            byte[] r1 = r1.zzf
            r3.zzh(r1, r7, r2, r7)
            return
        L_0x008f:
            int r4 = r0.zzH
            r8 = 8
            if (r4 != 0) goto L_0x00b4
            com.google.android.gms.internal.ads.zzawa r4 = r0.zze
            long r9 = r4.zze(r3, r7, r6, r8)
            int r4 = (int) r9
            r0.zzN = r4
            com.google.android.gms.internal.ads.zzawa r4 = r0.zze
            int r4 = r4.zza()
            r0.zzO = r4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzJ = r9
            r0.zzH = r6
            com.google.android.gms.internal.ads.zzbar r4 = r0.zzj
            r4.zzr()
        L_0x00b4:
            android.util.SparseArray r4 = r0.zzf
            int r9 = r0.zzN
            java.lang.Object r4 = r4.get(r9)
            com.google.android.gms.internal.ads.zzavx r4 = (com.google.android.gms.internal.ads.zzavx) r4
            if (r4 != 0) goto L_0x00ca
            int r1 = r0.zzO
            int r1 = r2 - r1
            r3.zzi(r1, r7)
            r0.zzH = r7
            return
        L_0x00ca:
            int r9 = r0.zzH
            if (r9 != r6) goto L_0x025c
            r9 = 3
            r0.zzs(r3, r9)
            com.google.android.gms.internal.ads.zzbar r10 = r0.zzj
            byte[] r10 = r10.zza
            r11 = 2
            byte r10 = r10[r11]
            r10 = r10 & 6
            int r10 = r10 >> r6
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00f3
            r0.zzL = r6
            int[] r9 = r0.zzM
            int[] r9 = zzq(r9, r6)
            r0.zzM = r9
            int r10 = r0.zzO
            int r2 = r2 - r10
            int r2 = r2 + -3
            r9[r7] = r2
            goto L_0x0203
        L_0x00f3:
            if (r1 != r5) goto L_0x0254
            r13 = 4
            r0.zzs(r3, r13)
            com.google.android.gms.internal.ads.zzbar r14 = r0.zzj
            byte[] r14 = r14.zza
            byte r14 = r14[r9]
            r14 = r14 & r12
            int r14 = r14 + r6
            r0.zzL = r14
            int[] r15 = r0.zzM
            int[] r14 = zzq(r15, r14)
            r0.zzM = r14
            if (r10 != r11) goto L_0x011a
            int r9 = r0.zzO
            int r10 = r0.zzL
            int r2 = r2 - r9
            int r2 = r2 + -4
            int r2 = r2 / r10
            java.util.Arrays.fill(r14, r7, r10, r2)
            goto L_0x0203
        L_0x011a:
            if (r10 != r6) goto L_0x014f
            r9 = 0
            r10 = 0
        L_0x011e:
            int r14 = r0.zzL
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x0144
            int[] r14 = r0.zzM
            r14[r9] = r7
        L_0x0128:
            int r13 = r13 + r6
            r0.zzs(r3, r13)
            com.google.android.gms.internal.ads.zzbar r14 = r0.zzj
            byte[] r14 = r14.zza
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r0.zzM
            r16 = r15[r9]
            int r16 = r16 + r14
            r15[r9] = r16
            if (r14 == r12) goto L_0x0128
            int r10 = r10 + r16
            int r9 = r9 + 1
            goto L_0x011e
        L_0x0144:
            int[] r9 = r0.zzM
            int r15 = r0.zzO
            int r2 = r2 - r15
            int r2 = r2 - r13
            int r2 = r2 - r10
            r9[r14] = r2
            goto L_0x0203
        L_0x014f:
            if (r10 != r9) goto L_0x024c
            r9 = 0
            r10 = 0
        L_0x0153:
            int r14 = r0.zzL
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x01fa
            int[] r14 = r0.zzM
            r14[r9] = r7
            int r13 = r13 + 1
            r0.zzs(r3, r13)
            int r14 = r13 + -1
            com.google.android.gms.internal.ads.zzbar r15 = r0.zzj
            byte[] r15 = r15.zza
            byte r15 = r15[r14]
            if (r15 == 0) goto L_0x01f2
            r15 = 0
        L_0x016d:
            if (r15 >= r8) goto L_0x01c1
            int r16 = 7 - r15
            int r5 = r6 << r16
            com.google.android.gms.internal.ads.zzbar r11 = r0.zzj
            byte[] r11 = r11.zza
            byte r11 = r11[r14]
            r11 = r11 & r5
            if (r11 == 0) goto L_0x01b6
            int r13 = r13 + r15
            r0.zzs(r3, r13)
            int r11 = r14 + 1
            com.google.android.gms.internal.ads.zzbar r6 = r0.zzj
            byte[] r6 = r6.zza
            byte r6 = r6[r14]
            r6 = r6 & r12
            int r5 = ~r5
            r5 = r5 & r6
            long r5 = (long) r5
        L_0x018c:
            if (r11 >= r13) goto L_0x01a4
            int r14 = r11 + 1
            long r5 = r5 << r8
            com.google.android.gms.internal.ads.zzbar r8 = r0.zzj
            byte[] r8 = r8.zza
            byte r8 = r8[r11]
            r8 = r8 & r12
            r17 = r13
            long r12 = (long) r8
            long r5 = r5 | r12
            r11 = r14
            r13 = r17
            r8 = 8
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x018c
        L_0x01a4:
            r17 = r13
            if (r9 <= 0) goto L_0x01b3
            r12 = 1
            int r15 = r15 * 7
            int r15 = r15 + 6
            long r12 = r12 << r15
            r14 = -1
            long r12 = r12 + r14
            long r5 = r5 - r12
        L_0x01b3:
            r13 = r17
            goto L_0x01c3
        L_0x01b6:
            int r15 = r15 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r8 = 8
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x016d
        L_0x01c1:
            r5 = 0
        L_0x01c3:
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 < 0) goto L_0x01ea
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 > 0) goto L_0x01ea
            int r6 = (int) r5
            int[] r5 = r0.zzM
            if (r9 == 0) goto L_0x01db
            int r8 = r9 + -1
            r8 = r5[r8]
            int r6 = r6 + r8
        L_0x01db:
            r5[r9] = r6
            int r10 = r10 + r6
            int r9 = r9 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r8 = 8
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0153
        L_0x01ea:
            com.google.android.gms.internal.ads.zzatg r1 = new com.google.android.gms.internal.ads.zzatg
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01f2:
            com.google.android.gms.internal.ads.zzatg r1 = new com.google.android.gms.internal.ads.zzatg
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x01fa:
            int[] r5 = r0.zzM
            int r6 = r0.zzO
            int r2 = r2 - r6
            int r2 = r2 - r13
            int r2 = r2 - r10
            r5[r14] = r2
        L_0x0203:
            com.google.android.gms.internal.ads.zzbar r2 = r0.zzj
            byte[] r2 = r2.zza
            byte r5 = r2[r7]
            r6 = 1
            byte r2 = r2[r6]
            long r8 = r0.zzD
            r6 = 8
            int r5 = r5 << r6
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = (long) r2
            long r5 = r0.zzn(r5)
            long r8 = r8 + r5
            r0.zzI = r8
            com.google.android.gms.internal.ads.zzbar r2 = r0.zzj
            byte[] r2 = r2.zza
            r5 = 2
            byte r2 = r2[r5]
            r6 = r2 & 8
            int r8 = r4.zzc
            if (r8 == r5) goto L_0x023a
            r5 = 163(0xa3, float:2.28E-43)
            if (r1 != r5) goto L_0x0238
            r1 = 128(0x80, float:1.794E-43)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x0236
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x023a
        L_0x0236:
            r1 = 163(0xa3, float:2.28E-43)
        L_0x0238:
            r2 = 0
            goto L_0x023b
        L_0x023a:
            r2 = 1
        L_0x023b:
            r5 = 8
            if (r6 != r5) goto L_0x0242
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0243
        L_0x0242:
            r5 = 0
        L_0x0243:
            r2 = r2 | r5
            r0.zzP = r2
            r2 = 2
            r0.zzH = r2
            r0.zzK = r7
            goto L_0x025c
        L_0x024c:
            com.google.android.gms.internal.ads.zzatg r1 = new com.google.android.gms.internal.ads.zzatg
            java.lang.String r2 = "Unexpected lacing value: 2"
            r1.<init>(r2)
            throw r1
        L_0x0254:
            com.google.android.gms.internal.ads.zzatg r1 = new com.google.android.gms.internal.ads.zzatg
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x025c:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x0286
        L_0x0260:
            int r1 = r0.zzK
            int r2 = r0.zzL
            if (r1 >= r2) goto L_0x0283
            int[] r2 = r0.zzM
            r1 = r2[r1]
            r0.zzt(r3, r4, r1)
            long r1 = r0.zzI
            int r5 = r0.zzK
            int r6 = r4.zzd
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.zzo(r4, r1)
            int r1 = r0.zzK
            r2 = 1
            int r1 = r1 + r2
            r0.zzK = r1
            goto L_0x0260
        L_0x0283:
            r0.zzH = r7
            return
        L_0x0286:
            int[] r1 = r0.zzM
            r1 = r1[r7]
            r0.zzt(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavy.zzk(int, int, com.google.android.gms.internal.ads.zzavf):void");
    }

    /* access modifiers changed from: package-private */
    public final void zzb(int i) throws zzatg {
        zzavn zzavn;
        zzbam zzbam;
        zzbam zzbam2;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.zzw.zza;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    zzavx zzavx = this.zzw;
                    zzavx.zzb(this.zzab, zzavx.zzb);
                    SparseArray sparseArray = this.zzf;
                    zzavx zzavx2 = this.zzw;
                    sparseArray.put(zzavx2.zzb, zzavx2);
                }
                this.zzw = null;
            } else if (i == 19899) {
                int i4 = this.zzy;
                if (i4 != -1) {
                    long j = this.zzz;
                    if (j != -1) {
                        if (i4 == 475249515) {
                            this.zzB = j;
                            return;
                        }
                        return;
                    }
                }
                throw new zzatg("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                zzavx zzavx3 = this.zzw;
                if (!zzavx3.zze) {
                    return;
                }
                if (zzavx3.zzg != null) {
                    zzavx3.zzi = new zzavc(new zzavb(zzaso.zzb, MimeTypes.VIDEO_WEBM, this.zzw.zzg.zzb, false));
                    return;
                }
                throw new zzatg("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == 28032) {
                zzavx zzavx4 = this.zzw;
                if (zzavx4.zze && zzavx4.zzf != null) {
                    throw new zzatg("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.zzt == -9223372036854775807L) {
                    this.zzt = 1000000;
                }
                long j2 = this.zzu;
                if (j2 != -9223372036854775807L) {
                    this.zzv = zzn(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515 && !this.zzx) {
                    zzavh zzavh = this.zzab;
                    if (this.zzs == -1 || this.zzv == -9223372036854775807L || (zzbam = this.zzE) == null || zzbam.zza() == 0 || (zzbam2 = this.zzF) == null || zzbam2.zza() != zzbam.zza()) {
                        this.zzE = null;
                        this.zzF = null;
                        zzavn = new zzavm(this.zzv);
                    } else {
                        int zza2 = zzbam.zza();
                        int[] iArr = new int[zza2];
                        long[] jArr = new long[zza2];
                        long[] jArr2 = new long[zza2];
                        long[] jArr3 = new long[zza2];
                        for (int i5 = 0; i5 < zza2; i5++) {
                            jArr3[i5] = this.zzE.zzb(i5);
                            jArr[i5] = this.zzs + this.zzF.zzb(i5);
                        }
                        while (true) {
                            i2 = zza2 - 1;
                            if (i3 >= i2) {
                                break;
                            }
                            int i6 = i3 + 1;
                            iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                            jArr2[i3] = jArr3[i6] - jArr3[i3];
                            i3 = i6;
                        }
                        iArr[i2] = (int) ((this.zzs + this.zzr) - jArr[i2]);
                        jArr2[i2] = this.zzv - jArr3[i2];
                        this.zzE = null;
                        this.zzF = null;
                        zzavn = new zzave(iArr, jArr, jArr2, jArr3);
                    }
                    zzavh.zzc(zzavn);
                    this.zzx = true;
                }
            } else if (this.zzf.size() != 0) {
                this.zzab.zzb();
            } else {
                throw new zzatg("No valid tracks were found");
            }
        } else if (this.zzH == 2) {
            if (!this.zzaa) {
                this.zzP |= 1;
            }
            zzo((zzavx) this.zzf.get(this.zzN), this.zzI);
            this.zzH = 0;
        }
    }
}
