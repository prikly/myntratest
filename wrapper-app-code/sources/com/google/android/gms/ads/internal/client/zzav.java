package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzcdw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzav extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbvt zzc;
    final /* synthetic */ zzaw zzd;

    zzav(zzaw zzaw, Context context, String str, zzbvt zzbvt) {
        this.zzd = zzaw;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbvt;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "rewarded");
        return new zzfc();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) throws RemoteException {
        return zzce.zzo(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 224400000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return zzcdw.zza(this.zza, this.zzb, this.zzc);
    }
}
