package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbms;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzchs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzas extends zzax {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzaw zzd;

    zzas(zzaw zzaw, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzaw;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zzc, "native_ad_view_delegate");
        return new zzez();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) throws RemoteException {
        return zzce.zzi(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbjj.zzc(this.zzc);
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zziS)).booleanValue()) {
            return this.zzd.zzd.zza(this.zzc, this.zza, this.zzb);
        }
        try {
            return zzbmo.zzbD(((zzbms) zzchs.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzar.zza)).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 224400000));
        } catch (RemoteException | zzchr | NullPointerException e2) {
            this.zzd.zzh = zzcat.zza(this.zzc);
            this.zzd.zzh.zzf(e2, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
