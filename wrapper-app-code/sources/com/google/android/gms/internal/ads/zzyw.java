package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzyw {
    public static void zza(long j, zzef zzef, zzaaq[] zzaaqArr) {
        int i;
        while (true) {
            boolean z = true;
            if (zzef.zza() > 1) {
                int zzc = zzc(zzef);
                int zzc2 = zzc(zzef);
                int zzc3 = zzef.zzc() + zzc2;
                if (zzc2 == -1 || zzc2 > zzef.zza()) {
                    zzdw.zze("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzc3 = zzef.zzd();
                } else if (zzc == 4 && zzc2 >= 8) {
                    int zzk = zzef.zzk();
                    int zzo = zzef.zzo();
                    if (zzo == 49) {
                        i = zzef.zze();
                        zzo = 49;
                    } else {
                        i = 0;
                    }
                    int zzk2 = zzef.zzk();
                    if (zzo == 47) {
                        zzef.zzG(1);
                        zzo = 47;
                    }
                    boolean z2 = zzk == 181 && (zzo == 49 || zzo == 47) && zzk2 == 3;
                    if (zzo == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        zzb(j, zzef, zzaaqArr);
                    }
                }
                zzef.zzF(zzc3);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j, zzef zzef, zzaaq[] zzaaqArr) {
        int zzk = zzef.zzk();
        if ((zzk & 64) != 0) {
            zzef.zzG(1);
            int i = (zzk & 31) * 3;
            int zzc = zzef.zzc();
            for (zzaaq zzaaq : zzaaqArr) {
                zzef.zzF(zzc);
                zzaaq.zzq(zzef, i);
                if (j != -9223372036854775807L) {
                    zzaaq.zzs(j, 1, i, 0, (zzaap) null);
                }
            }
        }
    }

    private static int zzc(zzef zzef) {
        int i = 0;
        while (zzef.zza() != 0) {
            int zzk = zzef.zzk();
            i += zzk;
            if (zzk != 255) {
                return i;
            }
        }
        return -1;
    }
}
