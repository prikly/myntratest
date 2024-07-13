package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzauw {
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    private final MediaCodec.CryptoInfo zzg;
    private final zzauv zzh;

    public zzauw() {
        zzauv zzauv = null;
        this.zzg = zzbay.zza >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.zzh = zzbay.zza >= 24 ? new zzauv(this.zzg, (zzauu) null) : zzauv;
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.zzg;
    }

    public final void zzb(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.zzf = i;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = 1;
        if (zzbay.zza >= 16) {
            this.zzg.numSubSamples = this.zzf;
            this.zzg.numBytesOfClearData = this.zzd;
            this.zzg.numBytesOfEncryptedData = this.zze;
            this.zzg.key = this.zzb;
            this.zzg.iv = this.zza;
            this.zzg.mode = this.zzc;
            if (zzbay.zza >= 24) {
                zzauv.zza(this.zzh, 0, 0);
            }
        }
    }
}
