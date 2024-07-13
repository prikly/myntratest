package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzchs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzao extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbvt zzc;
    final /* synthetic */ zzaw zzd;

    zzao(zzaw zzaw, Context context, String str, zzbvt zzbvt) {
        this.zzd = zzaw;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbvt;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "native_ad");
        return new zzeu();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) throws RemoteException {
        return zzce.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 224400000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbjj.zzc(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zziS)).booleanValue()) {
            return this.zzd.zzb.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            IBinder zze = ((zzbr) zzchs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzan.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 224400000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
        } catch (RemoteException | zzchr | NullPointerException e2) {
            this.zzd.zzh = zzcat.zza(this.zza);
            this.zzd.zzh.zzf(e2, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
