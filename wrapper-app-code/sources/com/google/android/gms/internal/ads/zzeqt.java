package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeqt {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdxc zzb;

    public zzeqt(zzdxc zzdxc) {
        this.zzb = zzdxc;
    }

    public final zzbxq zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbxq) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e2) {
            zze.zzh("Couldn't create RTB adapter : ", e2);
        }
    }
}
