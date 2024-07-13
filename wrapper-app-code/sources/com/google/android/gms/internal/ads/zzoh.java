package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzoh {
    public final zzaf zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzne[] zzi;

    public zzoh(zzaf zzaf, int i, int i2, int i3, int i4, int i5, int i6, int i7, zzne[] zzneArr) {
        this.zza = zzaf;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzneArr;
    }

    public final long zza(long j) {
        return (j * 1000000) / ((long) this.zze);
    }

    public final AudioTrack zzb(boolean z, zzk zzk, int i) throws zzns {
        AudioTrack audioTrack;
        try {
            if (zzen.zza >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(zzk.zza().zza).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build()).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i).setOffloadedPlayback(this.zzc == 1).build();
            } else if (zzen.zza >= 21) {
                audioTrack = new AudioTrack(zzk.zza().zza, new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build(), this.zzh, 1, i);
            } else {
                int i2 = zzk.zzc;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzns(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new zzns(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e2);
        }
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
