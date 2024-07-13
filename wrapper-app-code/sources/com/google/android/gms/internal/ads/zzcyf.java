package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcyf extends zzbdp {
    private final zzcye zza;
    private final zzbu zzb;
    private final zzfeh zzc;
    private boolean zzd = false;

    public zzcyf(zzcye zzcye, zzbu zzbu, zzfeh zzfeh) {
        this.zza = zzcye;
        this.zzb = zzbu;
        this.zzc = zzfeh;
    }

    public final zzbu zze() {
        return this.zzb;
    }

    public final zzdn zzf() {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgi)).booleanValue()) {
            return null;
        }
        return this.zza.zzl();
    }

    public final void zzg(boolean z) {
        this.zzd = z;
    }

    public final void zzh(zzdg zzdg) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        zzfeh zzfeh = this.zzc;
        if (zzfeh != null) {
            zzfeh.zzp(zzdg);
        }
    }

    public final void zzi(IObjectWrapper iObjectWrapper, zzbdx zzbdx) {
        try {
            this.zzc.zzt(zzbdx);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbdx, this.zzd);
        } catch (RemoteException e2) {
            zze.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzj(zzbdu zzbdu) {
    }
}
