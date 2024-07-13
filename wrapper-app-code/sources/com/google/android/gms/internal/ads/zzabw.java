package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzabw extends zzabv {
    private final zzef zzb = new zzef(zzaag.zza);
    private final zzef zzc = new zzef(4);
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzabw(zzaaq zzaaq) {
        super(zzaaq);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzef zzef) throws zzabu {
        int zzk = zzef.zzk();
        int i = zzk >> 4;
        int i2 = zzk & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzabu("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(zzef zzef, long j) throws zzbu {
        int zzk = zzef.zzk();
        long zzf2 = j + (((long) zzef.zzf()) * 1000);
        if (zzk == 0) {
            if (!this.zze) {
                zzef zzef2 = new zzef(new byte[zzef.zza()]);
                zzef.zzB(zzef2.zzH(), 0, zzef.zza());
                zzyo zza = zzyo.zza(zzef2);
                this.zzd = zza.zzb;
                zzad zzad = new zzad();
                zzad.zzS(MimeTypes.VIDEO_H264);
                zzad.zzx(zza.zzf);
                zzad.zzX(zza.zzc);
                zzad.zzF(zza.zzd);
                zzad.zzP(zza.zze);
                zzad.zzI(zza.zza);
                this.zza.zzk(zzad.zzY());
                this.zze = true;
                return false;
            }
        } else if (zzk == 1 && this.zze) {
            int i = this.zzg == 1 ? 1 : 0;
            if (!this.zzf && i == 0) {
                return false;
            }
            byte[] zzH = this.zzc.zzH();
            zzH[0] = 0;
            zzH[1] = 0;
            zzH[2] = 0;
            int i2 = 4 - this.zzd;
            int i3 = 0;
            while (zzef.zza() > 0) {
                zzef.zzB(this.zzc.zzH(), i2, this.zzd);
                this.zzc.zzF(0);
                int zzn = this.zzc.zzn();
                this.zzb.zzF(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzef, zzn);
                i3 = i3 + 4 + zzn;
            }
            this.zza.zzs(zzf2, i, i3, 0, (zzaap) null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
