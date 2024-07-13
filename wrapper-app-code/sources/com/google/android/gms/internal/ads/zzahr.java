package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzahr implements zzahd {
    private final zzef zza;
    private final zzaac zzb;
    private final String zzc;
    private zzaaq zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzahr() {
        this((String) null);
    }

    public final void zza(zzef zzef) {
        zzdd.zzb(this.zzd);
        while (zzef.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                byte[] zzH = zzef.zzH();
                int zzc2 = zzef.zzc();
                int zzd2 = zzef.zzd();
                while (true) {
                    if (zzc2 >= zzd2) {
                        zzef.zzF(zzd2);
                        break;
                    }
                    byte b2 = zzH[zzc2];
                    boolean z = (b2 & 255) == 255;
                    boolean z2 = this.zzi && (b2 & 224) == 224;
                    this.zzi = z;
                    if (z2) {
                        zzef.zzF(zzc2 + 1);
                        this.zzi = false;
                        this.zza.zzH()[1] = zzH[zzc2];
                        this.zzg = 2;
                        this.zzf = 1;
                        break;
                    }
                    zzc2++;
                }
            } else if (i != 1) {
                int min = Math.min(zzef.zza(), this.zzk - this.zzg);
                this.zzd.zzq(zzef, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 >= i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zzd.zzs(j, 1, i3, 0, (zzaap) null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int min2 = Math.min(zzef.zza(), 4 - this.zzg);
                zzef.zzB(this.zza.zzH(), this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 >= 4) {
                    this.zza.zzF(0);
                    if (!this.zzb.zza(this.zza.zze())) {
                        this.zzg = 0;
                        this.zzf = 1;
                    } else {
                        zzaac zzaac = this.zzb;
                        this.zzk = zzaac.zzc;
                        if (!this.zzh) {
                            this.zzj = (((long) zzaac.zzg) * 1000000) / ((long) zzaac.zzd);
                            zzad zzad = new zzad();
                            zzad.zzH(this.zze);
                            zzad.zzS(this.zzb.zzb);
                            zzad.zzL(4096);
                            zzad.zzw(this.zzb.zze);
                            zzad.zzT(this.zzb.zzd);
                            zzad.zzK(this.zzc);
                            this.zzd.zzk(zzad.zzY());
                            this.zzh = true;
                        }
                        this.zza.zzF(0);
                        this.zzd.zzq(this.zza, 4);
                        this.zzf = 2;
                    }
                }
            }
        }
    }

    public final void zzb(zzzm zzzm, zzaip zzaip) {
        zzaip.zzc();
        this.zze = zzaip.zzb();
        this.zzd = zzzm.zzv(zzaip.zza(), 1);
    }

    public final void zzc() {
    }

    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzahr(String str) {
        this.zzf = 0;
        zzef zzef = new zzef(4);
        this.zza = zzef;
        zzef.zzH()[0] = -1;
        this.zzb = new zzaac();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
