package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzchs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzac extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvt zzb;

    zzac(zzaw zzaw, Context context, zzbvt zzbvt) {
        this.zza = context;
        this.zzb = zzbvt;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "out_of_context_tester");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) throws RemoteException {
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbjj.zzc(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zziu)).booleanValue()) {
            return zzce.zzh(wrap, this.zzb, 224400000);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbjj.zzc(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zziu)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdk) zzchs.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", zzab.zza)).zze(wrap, this.zzb, 224400000);
        } catch (RemoteException | zzchr | NullPointerException e2) {
            zzcat.zza(this.zza).zzf(e2, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
