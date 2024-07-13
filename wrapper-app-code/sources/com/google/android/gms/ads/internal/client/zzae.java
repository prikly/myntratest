package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzchs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzae extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvt zzb;

    zzae(zzaw zzaw, Context context, zzbvt zzbvt) {
        this.zza = context;
        this.zzb = zzbvt;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) throws RemoteException {
        return zzce.zzp(ObjectWrapper.wrap(this.zza), this.zzb, 224400000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzcgi) zzchs.zzb(this.zza, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", zzad.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, 224400000);
        } catch (RemoteException | zzchr | NullPointerException unused) {
            return null;
        }
    }
}
