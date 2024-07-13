package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbls {
    private final Context zza;

    public zzbls(Context context) {
        this.zza = context;
    }

    public final void zza(zzcba zzcba) {
        try {
            ((zzblt) zzchs.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzblr.zza)).zze(zzcba);
        } catch (zzchr e2) {
            zzcho.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        } catch (RemoteException e3) {
            zzcho.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e3.getMessage())));
        }
    }
}
