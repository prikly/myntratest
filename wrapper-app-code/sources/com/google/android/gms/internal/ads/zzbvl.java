package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final /* synthetic */ class zzbvl implements Runnable {
    public final /* synthetic */ zzbvm zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzbvl(zzbvm zzbvm, Context context, String str) {
        this.zza = zzbvm;
        this.zzb = context;
        this.zzc = str;
    }

    public final void run() {
        Context context = this.zzb;
        String str = this.zzc;
        zzbjj.zzc(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) zzba.zzc().zzb(zzbjj.zzaf)).booleanValue());
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzam)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        try {
            ((zzcpi) zzchs.zzb(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzbvk.zza)).zze(ObjectWrapper.wrap(context), new zzbvj(AppMeasurementSdk.getInstance(context, "FA-Ads", "am", str, bundle)));
        } catch (RemoteException | zzchr | NullPointerException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
    }
}
