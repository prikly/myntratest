package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzchs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzaq extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaw zzb;

    zzaq(zzaw zzaw, Context context) {
        this.zzb = zzaw;
        this.zza = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "mobile_ads_settings");
        return new zzey();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) throws RemoteException {
        return zzce.zzg(ObjectWrapper.wrap(this.zza), 224400000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbjj.zzc(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zziS)).booleanValue()) {
            return this.zzb.zzc.zza(this.zza);
        }
        try {
            IBinder zze = ((zzcp) zzchs.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzap.zza)).zze(ObjectWrapper.wrap(this.zza), 224400000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(zze);
        } catch (RemoteException | zzchr | NullPointerException e2) {
            this.zzb.zzh = zzcat.zza(this.zza);
            this.zzb.zzh.zzf(e2, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
