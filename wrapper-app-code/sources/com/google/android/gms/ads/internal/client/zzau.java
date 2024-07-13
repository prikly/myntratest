package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbmu;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzchs;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzau extends zzax {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaw zzd;

    zzau(zzaw zzaw, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzaw;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) throws RemoteException {
        return zzce.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbjj.zzc(this.zza.getContext());
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zziS)).booleanValue()) {
            return this.zzd.zzg.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzbmu.zze(((zzbmy) zzchs.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", zzat.zza)).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | zzchr | NullPointerException e2) {
            this.zzd.zzh = zzcat.zza(this.zza.getContext());
            this.zzd.zzh.zzf(e2, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
