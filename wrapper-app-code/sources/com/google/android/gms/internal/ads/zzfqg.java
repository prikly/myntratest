package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfqg extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final zzfqe zzc;
    private float zzd;
    private final zzfqo zze;

    public zzfqg(Handler handler, Context context, zzfqe zzfqe, zzfqo zzfqo, byte[] bArr) {
        super(handler);
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.zzc = zzfqe;
        this.zze = zzfqo;
    }

    private final float zzc() {
        int streamVolume = this.zzb.getStreamVolume(3);
        int streamMaxVolume = this.zzb.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f2 = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    private final void zzd() {
        this.zze.zzd(this.zzd);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float zzc2 = zzc();
        if (zzc2 != this.zzd) {
            this.zzd = zzc2;
            zzd();
        }
    }

    public final void zza() {
        this.zzd = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}
