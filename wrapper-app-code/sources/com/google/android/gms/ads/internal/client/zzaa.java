package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbzp;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzchs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzaa extends zzax {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzaw zzb;

    zzaa(zzaw zzaw, Activity activity) {
        this.zzb = zzaw;
        this.zza = activity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "ad_overlay");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) throws RemoteException {
        return zzce.zzm(ObjectWrapper.wrap(this.zza));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbjj.zzc(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zziS)).booleanValue()) {
            return this.zzb.zzf.zza(this.zza);
        }
        try {
            return zzbzp.zzF(((zzbzt) zzchs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", zzz.zza)).zze(ObjectWrapper.wrap(this.zza)));
        } catch (RemoteException | zzchr | NullPointerException e2) {
            this.zzb.zzh = zzcat.zza(this.zza.getApplicationContext());
            this.zzb.zzh.zzf(e2, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
