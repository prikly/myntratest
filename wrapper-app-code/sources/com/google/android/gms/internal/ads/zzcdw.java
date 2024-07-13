package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcdw {
    public static final zzcdk zza(Context context, String str, zzbvt zzbvt) {
        try {
            IBinder zze = ((zzcdo) zzchs.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzcdv.zza)).zze(ObjectWrapper.wrap(context), str, zzbvt, 224400000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzcdk ? (zzcdk) queryLocalInterface : new zzcdi(zze);
        } catch (RemoteException | zzchr e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
