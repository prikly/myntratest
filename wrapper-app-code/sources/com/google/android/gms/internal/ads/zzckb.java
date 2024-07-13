package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzckb implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzcka zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzckb(Context context, zzcka zzcka) {
        this.zza = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.zzb = zzcka;
    }

    public final void onAudioFocusChange(int i) {
        this.zzc = i > 0;
        this.zzb.zzn();
    }

    public final float zza() {
        float f2 = this.zze ? 0.0f : this.zzf;
        if (this.zzc) {
            return f2;
        }
        return 0.0f;
    }

    public final void zzb() {
        this.zzd = true;
        zzf();
    }

    public final void zzc() {
        this.zzd = false;
        zzf();
    }

    public final void zzd(boolean z) {
        this.zze = z;
        zzf();
    }

    public final void zze(float f2) {
        this.zzf = f2;
        zzf();
    }

    private final void zzf() {
        boolean z = false;
        if (!this.zzd || this.zze || this.zzf <= 0.0f) {
            if (this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.zzc = z;
                }
                this.zzb.zzn();
            }
        } else if (!this.zzc) {
            AudioManager audioManager2 = this.zza;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.zzc = z;
            }
            this.zzb.zzn();
        }
    }
}
