package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdrk implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdve zzd;
    private final Clock zze;
    private zzbof zzf;
    private zzbqd zzg;

    public zzdrk(zzdve zzdve, Clock clock) {
        this.zzd = zzdve;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.zzc = null;
        }
    }

    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.zza == null || this.zzb == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put(OSOutcomeConstants.OUTCOME_ID, this.zza);
                hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzd.zzg("sendMessageToNativeJs", hashMap);
            }
            zzd();
        }
    }

    public final zzbof zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf != null && this.zzb != null) {
            zzd();
            try {
                this.zzf.zze();
            } catch (RemoteException e2) {
                zzcho.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void zzc(zzbof zzbof) {
        this.zzf = zzbof;
        zzbqd zzbqd = this.zzg;
        if (zzbqd != null) {
            this.zzd.zzk("/unconfirmedClick", zzbqd);
        }
        zzdrj zzdrj = new zzdrj(this, zzbof);
        this.zzg = zzdrj;
        this.zzd.zzi("/unconfirmedClick", zzdrj);
    }
}
