package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeuz implements zzezm {
    private final zzgfc zza;
    private final Context zzb;

    public zzeuz(zzgfc zzgfc, Context context) {
        this.zza = zzgfc;
        this.zzb = context;
    }

    public final int zza() {
        return 13;
    }

    public final zzgfb zzb() {
        return this.zza.zzb(new zzeuy(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeva zzc() throws Exception {
        int i;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i2 = -1;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjd)).booleanValue()) {
            i = zzt.zzq().zzj(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
        }
        return new zzeva(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
    }
}
