package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzbrg;
import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzchs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzai extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvt zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    zzai(zzaw zzaw, Context context, zzbvt zzbvt, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbvt;
        this.zzc = onH5AdsEventListener;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zza() {
        return new zzbrk();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) throws RemoteException {
        return zzce.zzk(ObjectWrapper.wrap(this.zza), this.zzb, 224400000, new zzbqx(this.zzc));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbrg) zzchs.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzah.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, 224400000, new zzbqx(this.zzc));
        } catch (RemoteException | zzchr | NullPointerException unused) {
            return null;
        }
    }
}
