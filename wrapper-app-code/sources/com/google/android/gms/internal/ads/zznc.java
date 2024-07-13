package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zznc {
    public static final zznc zza = new zznc(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zznc(int i, int i2, int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = zzen.zzV(i3) ? zzen.zzo(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.zzb;
        int i2 = this.zzc;
        int i3 = this.zzd;
        return "AudioFormat[sampleRate=" + i + ", channelCount=" + i2 + ", encoding=" + i3 + "]";
    }
}
