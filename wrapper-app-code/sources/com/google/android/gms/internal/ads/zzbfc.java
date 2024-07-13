package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbfc {
    zzasl zza;
    boolean zzb;
    /* access modifiers changed from: private */
    public final ExecutorService zzc = zzchd.zzb;

    public zzbfc() {
    }

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final void zzb(Context context) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzes)).booleanValue()) {
            try {
                this.zza = (zzasl) zzchs.zzb(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbey.zza);
                this.zza.zze(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzb = true;
            } catch (RemoteException | zzchr | NullPointerException unused) {
                zzcho.zze("Cannot dynamite load clearcut");
            }
        }
    }

    public zzbfc(Context context) {
        zzbjj.zzc(context);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjh)).booleanValue()) {
            this.zzc.execute(new zzbex(this, context));
        } else {
            zzb(context);
        }
    }
}
