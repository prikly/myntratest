package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfsi implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzftg zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfrz zzf;
    private final long zzg = System.currentTimeMillis();
    private final int zzh;

    public zzfsi(Context context, int i, int i2, String str, String str2, String str3, zzfrz zzfrz) {
        this.zzb = str;
        this.zzh = i2;
        this.zzc = str2;
        this.zzf = zzfrz;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zza = new zzftg(context, this.zze.getLooper(), this, this, 19621000);
        this.zzd = new LinkedBlockingQueue();
        this.zza.checkAvailabilityAndConnect();
    }

    static zzfts zza() {
        return new zzfts((byte[]) null, 1);
    }

    private final void zze(int i, long j, Exception exc) {
        this.zzf.zzc(i, System.currentTimeMillis() - j, exc);
    }

    public final void onConnected(Bundle bundle) {
        zzftl zzd2 = zzd();
        if (zzd2 != null) {
            try {
                zzfts zzf2 = zzd2.zzf(new zzftq(1, this.zzh, this.zzb, this.zzc));
                zze(IronSourceConstants.errorCode_internal, this.zzg, (Exception) null);
                this.zzd.put(zzf2);
            } catch (Throwable th) {
                zzc();
                this.zze.quit();
                throw th;
            }
            zzc();
            this.zze.quit();
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, (Exception) null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            zze(4011, this.zzg, (Exception) null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfts zzb(int i) {
        zzfts zzfts;
        try {
            zzfts = (zzfts) this.zzd.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            zze(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e2);
            zzfts = null;
        }
        zze(AuthApiStatusCodes.AUTH_TOKEN_ERROR, this.zzg, (Exception) null);
        if (zzfts != null) {
            if (zzfts.zzc == 7) {
                zzfrz.zzg(3);
            } else {
                zzfrz.zzg(2);
            }
        }
        return zzfts == null ? zza() : zzfts;
    }

    public final void zzc() {
        zzftg zzftg = this.zza;
        if (zzftg == null) {
            return;
        }
        if (zzftg.isConnected() || this.zza.isConnecting()) {
            this.zza.disconnect();
        }
    }

    /* access modifiers changed from: protected */
    public final zzftl zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
