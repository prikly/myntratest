package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbng implements NativeCustomTemplateAd {
    private final zzbnf zza;
    private final MediaView zzb;
    private final VideoController zzc = new VideoController();
    private NativeCustomTemplateAd.DisplayOpenMeasurement zzd;

    public zzbng(zzbnf zzbnf) {
        Context context;
        this.zza = zzbnf;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbnf.zzh());
        } catch (RemoteException | NullPointerException e2) {
            zzcho.zzh("", e2);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.zza.zzr(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e3) {
                zzcho.zzh("", e3);
            }
        }
        this.zzb = mediaView;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
            return null;
        }
    }

    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzd == null && this.zza.zzq()) {
                this.zzd = new zzbmf(this.zza);
            }
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
        return this.zzd;
    }

    public final NativeAd.Image getImage(String str) {
        try {
            zzbml zzg = this.zza.zzg(str);
            if (zzg != null) {
                return new zzbmm(zzg);
            }
            return null;
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            zzdq zze = this.zza.zze();
            if (zze != null) {
                this.zzc.zzb(zze);
            }
        } catch (RemoteException e2) {
            zzcho.zzh("Exception occurred while getting video controller", e2);
        }
        return this.zzc;
    }

    public final MediaView getVideoMediaView() {
        return this.zzb;
    }

    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final zzbnf zza() {
        return this.zza;
    }
}
