package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaym implements zzayi, zzayj {
    public final zzayj[] zza;
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzayi zzc;
    private int zzd;
    private zzaza zze;
    private zzayj[] zzf;
    private zzayx zzg;

    public zzaym(zzayj... zzayjArr) {
        this.zza = zzayjArr;
    }

    public final long zzB(zzaze[] zzazeArr, boolean[] zArr, zzayv[] zzayvArr, boolean[] zArr2, long j) {
        int length;
        int i;
        zzaze[] zzazeArr2 = zzazeArr;
        zzayv[] zzayvArr2 = zzayvArr;
        int length2 = zzazeArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = zzazeArr2.length;
            if (i2 >= length) {
                break;
            }
            zzayv zzayv = zzayvArr2[i2];
            if (zzayv == null) {
                i = -1;
            } else {
                i = ((Integer) this.zzb.get(zzayv)).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            zzaze zzaze = zzazeArr2[i2];
            if (zzaze != null) {
                zzayz zzd2 = zzaze.zzd();
                int i3 = 0;
                while (true) {
                    zzayj[] zzayjArr = this.zza;
                    if (i3 >= zzayjArr.length) {
                        break;
                    } else if (zzayjArr[i3].zzn().zza(zzd2) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.zzb.clear();
        zzayv[] zzayvArr3 = new zzayv[length];
        zzayv[] zzayvArr4 = new zzayv[length];
        zzaze[] zzazeArr3 = new zzaze[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.zza.length) {
            for (int i5 = 0; i5 < zzazeArr2.length; i5++) {
                zzaze zzaze2 = null;
                zzayvArr4[i5] = iArr[i5] == i4 ? zzayvArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zzaze2 = zzazeArr2[i5];
                }
                zzazeArr3[i5] = zzaze2;
            }
            int i6 = i4;
            zzaze[] zzazeArr4 = zzazeArr3;
            ArrayList arrayList2 = arrayList;
            long zzB = this.zza[i4].zzB(zzazeArr3, zArr, zzayvArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = zzB;
            } else if (zzB != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzazeArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    zzbaj.zze(zzayvArr4[i7] != null);
                    zzayv zzayv2 = zzayvArr4[i7];
                    zzayvArr3[i7] = zzayv2;
                    this.zzb.put(zzayv2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (zzayvArr4[i7] != null) {
                        z2 = false;
                    }
                    zzbaj.zze(z2);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzazeArr3 = zzazeArr4;
            zzayvArr2 = zzayvArr;
        }
        zzayv[] zzayvArr5 = zzayvArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzayvArr3, 0, zzayvArr5, 0, length);
        zzayj[] zzayjArr2 = new zzayj[arrayList3.size()];
        this.zzf = zzayjArr2;
        arrayList3.toArray(zzayjArr2);
        this.zzg = new zzaxx(this.zzf);
        return j2;
    }

    public final long zza() {
        return this.zzg.zza();
    }

    public final boolean zzbj(long j) {
        return this.zzg.zzbj(j);
    }

    public final /* bridge */ /* synthetic */ void zze(zzayx zzayx) {
        zzayj zzayj = (zzayj) zzayx;
        if (this.zze != null) {
            this.zzc.zze(this);
        }
    }

    public final void zzf(zzayj zzayj) {
        int i = this.zzd - 1;
        this.zzd = i;
        if (i <= 0) {
            int i2 = 0;
            for (zzayj zzn : this.zza) {
                i2 += zzn.zzn().zzb;
            }
            zzayz[] zzayzArr = new zzayz[i2];
            int i3 = 0;
            for (zzayj zzn2 : this.zza) {
                zzaza zzn3 = zzn2.zzn();
                int i4 = zzn3.zzb;
                int i5 = 0;
                while (i5 < i4) {
                    zzayzArr[i3] = zzn3.zzb(i5);
                    i5++;
                    i3++;
                }
            }
            this.zze = new zzaza(zzayzArr);
            this.zzc.zzf(this);
        }
    }

    public final long zzg() {
        long j = Long.MAX_VALUE;
        for (zzayj zzg2 : this.zzf) {
            long zzg3 = zzg2.zzg();
            if (zzg3 != Long.MIN_VALUE) {
                j = Math.min(j, zzg3);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long zzh() {
        long zzh = this.zza[0].zzh();
        int i = 1;
        while (true) {
            zzayj[] zzayjArr = this.zza;
            if (i >= zzayjArr.length) {
                if (zzh != -9223372036854775807L) {
                    zzayj[] zzayjArr2 = this.zzf;
                    int length = zzayjArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        zzayj zzayj = zzayjArr2[i2];
                        if (zzayj == this.zza[0] || zzayj.zzi(zzh) == zzh) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzh;
            } else if (zzayjArr[i].zzh() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    public final long zzi(long j) {
        long zzi = this.zzf[0].zzi(j);
        int i = 1;
        while (true) {
            zzayj[] zzayjArr = this.zzf;
            if (i >= zzayjArr.length) {
                return zzi;
            }
            if (zzayjArr[i].zzi(zzi) == zzi) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    public final zzaza zzn() {
        return this.zze;
    }

    public final void zzq(long j) {
        for (zzayj zzq : this.zzf) {
            zzq.zzq(j);
        }
    }

    public final void zzs() throws IOException {
        for (zzayj zzs : this.zza) {
            zzs.zzs();
        }
    }

    public final void zzw(zzayi zzayi, long j) {
        this.zzc = zzayi;
        this.zzd = r0;
        for (zzayj zzw : this.zza) {
            zzw.zzw(this, j);
        }
    }
}
