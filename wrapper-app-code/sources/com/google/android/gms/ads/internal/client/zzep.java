package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzep implements MediaContent {
    private final zzbmi zza;
    private final VideoController zzb = new VideoController();
    private final zzbnf zzc;

    public zzep(zzbmi zzbmi, zzbnf zzbnf) {
        this.zza = zzbmi;
        this.zzc = zzbnf;
    }

    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
            return 0.0f;
        }
    }

    public final float getCurrentTime() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
            return 0.0f;
        }
    }

    public final float getDuration() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
            return 0.0f;
        }
    }

    public final Drawable getMainImage() {
        try {
            IObjectWrapper zzi = this.zza.zzi();
            if (zzi != null) {
                return (Drawable) ObjectWrapper.unwrap(zzi);
            }
            return null;
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zza.zzh() != null) {
                this.zzb.zzb(this.zza.zzh());
            }
        } catch (RemoteException e2) {
            zzcho.zzh("Exception occurred while getting video controller", e2);
        }
        return this.zzb;
    }

    public final boolean hasVideoContent() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
            return false;
        }
    }

    public final void setMainImage(Drawable drawable) {
        try {
            this.zza.zzj(ObjectWrapper.wrap(drawable));
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final zzbnf zza() {
        return this.zzc;
    }

    public final zzbmi zzb() {
        return this.zza;
    }
}
