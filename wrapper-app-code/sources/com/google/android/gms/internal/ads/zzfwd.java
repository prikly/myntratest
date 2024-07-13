package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfwd extends zzfwv {
    final /* synthetic */ zzfwj zza;
    final /* synthetic */ zzfwm zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfwh zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfwd(zzfwh zzfwh, TaskCompletionSource taskCompletionSource, zzfwj zzfwj, zzfwm zzfwm, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfwh;
        this.zza = zzfwj;
        this.zzb = zzfwm;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.zzfwr, android.os.IInterface] */
    /* access modifiers changed from: protected */
    public final void zza() {
        try {
            ? zze = this.zzd.zza.zze();
            zzfwh zzfwh = this.zzd;
            String zzb2 = zzfwh.zzd;
            zzfwj zzfwj = this.zza;
            String zzb3 = zzfwh.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfwj.zze());
            bundle.putString("adFieldEnifd", zzfwj.zzf());
            bundle.putInt("layoutGravity", zzfwj.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfwj.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzfwj.zzd());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", zzb3);
            if (zzfwj.zzg() != null) {
                bundle.putString("appId", zzfwj.zzg());
            }
            zze.zzf(zzb2, bundle, new zzfwg(this.zzd, this.zzb));
        } catch (RemoteException e2) {
            zzfwh.zzb.zzc(e2, "show overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e2));
        }
    }
}
