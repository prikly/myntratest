package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbos extends zzbnv {
    /* access modifiers changed from: private */
    public final OnAdManagerAdViewLoadedListener zza;

    public zzbos(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    public final void zze(zzbu zzbu, IObjectWrapper iObjectWrapper) {
        if (zzbu != null && iObjectWrapper != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzbu.zzi() instanceof zzg) {
                    zzg zzg = (zzg) zzbu.zzi();
                    adManagerAdView.setAdListener(zzg != null ? zzg.zzb() : null);
                }
            } catch (RemoteException e2) {
                zzcho.zzh("", e2);
            }
            try {
                if (zzbu.zzj() instanceof zzbcl) {
                    zzbcl zzbcl = (zzbcl) zzbu.zzj();
                    if (zzbcl != null) {
                        appEventListener = zzbcl.zzb();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e3) {
                zzcho.zzh("", e3);
            }
            zzchh.zza.post(new zzbor(this, adManagerAdView, zzbu));
        }
    }
}
