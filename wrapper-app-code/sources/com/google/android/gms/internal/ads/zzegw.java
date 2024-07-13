package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzegw implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzcig zza = new zzcig();
    protected boolean zzb = false;
    protected boolean zzc = false;
    protected zzcbe zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", new Object[]{Integer.valueOf(connectionResult.getErrorCode())});
        zze.zze(format);
        this.zza.zze(new zzefg(1, format));
    }

    public void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", new Object[]{Integer.valueOf(i)});
        zze.zze(format);
        this.zza.zze(new zzefg(1, format));
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzb() {
        if (this.zzd == null) {
            this.zzd = new zzcbe(this.zze, this.zzf, this, this);
        }
        this.zzd.checkAvailabilityAndConnect();
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzc() {
        this.zzc = true;
        zzcbe zzcbe = this.zzd;
        if (zzcbe != null) {
            if (zzcbe.isConnected() || this.zzd.isConnecting()) {
                this.zzd.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
