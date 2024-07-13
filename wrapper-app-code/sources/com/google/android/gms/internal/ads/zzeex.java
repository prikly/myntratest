package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeex extends zzeer {
    private String zzg;
    private int zzh = 1;

    zzeex(Context context) {
        this.zzf = new zzcbb(context, zzt.zzt().zzb(), this, this);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zze.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzefg(1));
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        this.zzf.zzp().zze(this.zze, new zzeeq(this));
                    } else if (i == 3) {
                        this.zzf.zzp().zzh(this.zzg, new zzeeq(this));
                    } else {
                        this.zza.zze(new zzefg(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzefg(1));
                } catch (Throwable th) {
                    zzt.zzo().zzu(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zze(new zzefg(1));
                }
            }
        }
    }

    public final zzgfb zzb(zzccb zzccb) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                zzgfb zzh2 = zzger.zzh(new zzefg(2));
                return zzh2;
            } else if (this.zzc) {
                zzcig zzcig = this.zza;
                return zzcig;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzccb;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new zzeew(this), zzcib.zzf);
                zzcig zzcig2 = this.zza;
                return zzcig2;
            }
        }
    }

    public final zzgfb zzc(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                zzgfb zzh2 = zzger.zzh(new zzefg(2));
                return zzh2;
            } else if (this.zzc) {
                zzcig zzcig = this.zza;
                return zzcig;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new zzeev(this), zzcib.zzf);
                zzcig zzcig2 = this.zza;
                return zzcig2;
            }
        }
    }
}
