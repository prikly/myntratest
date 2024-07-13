package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzkj {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Handler zzb;
    private final zzkf zzc;
    private final AudioManager zzd;
    private zzki zze;
    private int zzf = 3;
    private int zzg;
    private boolean zzh;

    public zzkj(Context context, Handler handler, zzkf zzkf) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = handler;
        this.zzc = zzkf;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        zzdd.zzb(audioManager);
        this.zzd = audioManager;
        this.zzg = zzg(audioManager, 3);
        this.zzh = zzi(this.zzd, this.zzf);
        zzki zzki = new zzki(this, (zzkh) null);
        try {
            zzen.zzA(this.zza, zzki, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.zze = zzki;
        } catch (RuntimeException e2) {
            zzdw.zzf("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    private static int zzg(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e2) {
            zzdw.zzf("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e2);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* access modifiers changed from: private */
    public final void zzh() {
        int zzg2 = zzg(this.zzd, this.zzf);
        boolean zzi = zzi(this.zzd, this.zzf);
        if (this.zzg != zzg2 || this.zzh != zzi) {
            this.zzg = zzg2;
            this.zzh = zzi;
            zzdt zzz = ((zzio) this.zzc).zza.zzl;
            zzz.zzd(30, new zzij(zzg2, zzi));
            zzz.zzc();
        }
    }

    private static boolean zzi(AudioManager audioManager, int i) {
        if (zzen.zza >= 23) {
            return audioManager.isStreamMute(i);
        }
        return zzg(audioManager, i) == 0;
    }

    public final int zza() {
        return this.zzd.getStreamMaxVolume(this.zzf);
    }

    public final int zzb() {
        if (zzen.zza >= 28) {
            return this.zzd.getStreamMinVolume(this.zzf);
        }
        return 0;
    }

    public final void zze() {
        zzki zzki = this.zze;
        if (zzki != null) {
            try {
                this.zza.unregisterReceiver(zzki);
            } catch (RuntimeException e2) {
                zzdw.zzf("StreamVolumeManager", "Error unregistering stream volume receiver", e2);
            }
            this.zze = null;
        }
    }

    public final void zzf(int i) {
        if (this.zzf != 3) {
            this.zzf = 3;
            zzh();
            zzio zzio = (zzio) this.zzc;
            zzt zzy = zzis.zzal(zzio.zza.zzz);
            if (!zzy.equals(zzio.zza.zzac)) {
                zzio.zza.zzac = zzy;
                zzdt zzz = zzio.zza.zzl;
                zzz.zzd(29, new zzik(zzy));
                zzz.zzc();
            }
        }
    }
}
