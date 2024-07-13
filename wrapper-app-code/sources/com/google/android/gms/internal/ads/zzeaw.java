package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeaw implements zzeag {
    /* access modifiers changed from: private */
    public final long zza;
    /* access modifiers changed from: private */
    public final zzeal zzb;
    private final zzfic zzc;

    zzeaw(long j, Context context, zzeal zzeal, zzcpj zzcpj, String str) {
        this.zza = j;
        this.zzb = zzeal;
        zzfie zzv = zzcpj.zzv();
        zzv.zzb(context);
        zzv.zza(str);
        this.zzc = zzv.zzc().zza();
    }

    public final void zza() {
    }

    public final void zzb(zzl zzl) {
        try {
            this.zzc.zzf(zzl, new zzeau(this));
        } catch (RemoteException e2) {
            zze.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzc() {
        try {
            this.zzc.zzk(new zzeav(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e2) {
            zze.zzl("#007 Could not call remote method.", e2);
        }
    }
}
