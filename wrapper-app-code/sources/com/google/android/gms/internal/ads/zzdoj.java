package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdoj implements zzden, zzdll {
    private final zzcfb zza;
    private final Context zzb;
    private final zzcft zzc;
    private final View zzd;
    private String zze;
    private final zzbfg zzf;

    public zzdoj(zzcfb zzcfb, Context context, zzcft zzcft, View view, zzbfg zzbfg) {
        this.zza = zzcfb;
        this.zzb = context;
        this.zzc = zzcft;
        this.zzd = view;
        this.zzf = zzbfg;
    }

    public final void zzbw() {
    }

    public final void zzbx() {
    }

    public final void zzf() {
    }

    public final void zzg() {
        if (this.zzf != zzbfg.APP_OPEN) {
            String zzd2 = this.zzc.zzd(this.zzb);
            this.zze = zzd2;
            this.zze = String.valueOf(zzd2).concat(this.zzf == zzbfg.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    public final void zzj() {
        this.zza.zzb(false);
    }

    public final void zzm() {
    }

    public final void zzo() {
        View view = this.zzd;
        if (!(view == null || this.zze == null)) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    public final void zzp(zzccr zzccr, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzcft zzcft = this.zzc;
                Context context = this.zzb;
                zzcft.zzo(context, zzcft.zza(context), this.zza.zza(), zzccr.zzc(), zzccr.zzb());
            } catch (RemoteException e2) {
                zze.zzk("Remote Exception to get reward item.", e2);
            }
        }
    }
}
