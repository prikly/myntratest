package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeep extends zzeer {
    public zzeep(Context context) {
        this.zzf = new zzcbb(context, zzt.zzt().zzb(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzg(this.zze, new zzeeq(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzefg(1));
                } catch (Throwable th) {
                    zzt.zzo().zzu(th, "RemoteAdRequestClientTask.onConnected");
                    this.zza.zze(new zzefg(1));
                }
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zze.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzefg(1));
    }
}
