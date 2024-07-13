package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdue extends zzbsn implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzblw {
    private View zza;
    private zzdq zzb;
    private zzdqb zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdue(zzdqb zzdqb, zzdqg zzdqg) {
        this.zza = zzdqg.zzf();
        this.zzb = zzdqg.zzj();
        this.zzc = zzdqb;
        if (zzdqg.zzr() != null) {
            zzdqg.zzr().zzao(this);
        }
    }

    private final void zzg() {
        View view;
        zzdqb zzdqb = this.zzc;
        if (zzdqb != null && (view = this.zza) != null) {
            zzdqb.zzx(view, Collections.emptyMap(), Collections.emptyMap(), zzdqb.zzT(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zza);
            }
        }
    }

    private static final void zzi(zzbsr zzbsr, int i) {
        try {
            zzbsr.zze(i);
        } catch (RemoteException e2) {
            zze.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void onGlobalLayout() {
        zzg();
    }

    public final void onScrollChanged() {
        zzg();
    }

    public final zzdq zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        zze.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final zzbmi zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zze.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdqb zzdqb = this.zzc;
        if (zzdqb == null || zzdqb.zzc() == null) {
            return null;
        }
        return zzdqb.zzc().zza();
    }

    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdqb zzdqb = this.zzc;
        if (zzdqb != null) {
            zzdqb.zzaa();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdud(this));
    }

    public final void zzf(IObjectWrapper iObjectWrapper, zzbsr zzbsr) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zze.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbsr, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            zze.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbsr, 0);
        } else if (this.zze) {
            zze.zzg("Instream ad should not be used again.");
            zzi(zzbsr, 1);
        } else {
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            zzt.zzx();
            zzcio.zza(this.zza, this);
            zzt.zzx();
            zzcio.zzb(this.zza, this);
            zzg();
            try {
                zzbsr.zzf();
            } catch (RemoteException e2) {
                zze.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
