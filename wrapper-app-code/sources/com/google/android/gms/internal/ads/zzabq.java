package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzabq extends zzabv {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzabq(zzaaq zzaaq) {
        super(zzaaq);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzef zzef) throws zzabu {
        if (!this.zzc) {
            int zzk = zzef.zzk();
            int i = zzk >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzk >> 2) & 3];
                zzad zzad = new zzad();
                zzad.zzS("audio/mpeg");
                zzad.zzw(1);
                zzad.zzT(i2);
                this.zza.zzk(zzad.zzY());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzad zzad2 = new zzad();
                zzad2.zzS(str);
                zzad2.zzw(1);
                zzad2.zzT(8000);
                this.zza.zzk(zzad2.zzY());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzabu("Audio format not supported: " + i);
            }
            this.zzc = true;
        } else {
            zzef.zzG(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(zzef zzef, long j) throws zzbu {
        if (this.zze == 2) {
            int zza = zzef.zza();
            this.zza.zzq(zzef, zza);
            this.zza.zzs(j, 1, zza, 0, (zzaap) null);
            return true;
        }
        int zzk = zzef.zzk();
        if (zzk == 0 && !this.zzd) {
            int zza2 = zzef.zza();
            byte[] bArr = new byte[zza2];
            zzef.zzB(bArr, 0, zza2);
            zzyg zza3 = zzyh.zza(bArr);
            zzad zzad = new zzad();
            zzad.zzS("audio/mp4a-latm");
            zzad.zzx(zza3.zzc);
            zzad.zzw(zza3.zzb);
            zzad.zzT(zza3.zza);
            zzad.zzI(Collections.singletonList(bArr));
            this.zza.zzk(zzad.zzY());
            this.zzd = true;
            return false;
        } else if (this.zze == 10 && zzk != 1) {
            return false;
        } else {
            int zza4 = zzef.zza();
            this.zza.zzq(zzef, zza4);
            this.zza.zzs(j, 1, zza4, 0, (zzaap) null);
            return true;
        }
    }
}
