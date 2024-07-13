package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeet extends zzeer {
    zzeet(Context context) {
        this.zzf = new zzcbb(context, zzt.zzt().zzb(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzeeq(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzefg(1));
                } catch (Throwable th) {
                    zzt.zzo().zzu(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zze(new zzefg(1));
                }
            }
        }
    }
}
