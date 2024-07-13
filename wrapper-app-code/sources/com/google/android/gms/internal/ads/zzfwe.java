package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfwe extends zzfwv {
    final /* synthetic */ zzfvy zza;
    final /* synthetic */ zzfwm zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfwh zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfwe(zzfwh zzfwh, TaskCompletionSource taskCompletionSource, zzfvy zzfvy, zzfwm zzfwm, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfwh;
        this.zza = zzfvy;
        this.zzb = zzfwm;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzfwr, android.os.IInterface] */
    /* access modifiers changed from: protected */
    public final void zza() {
        try {
            ? zze = this.zzd.zza.zze();
            zzfvy zzfvy = this.zza;
            String zzb2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfvy.zzb());
            bundle.putString("callerPackage", zzb2);
            bundle.putString("appId", zzfvy.zza());
            zze.zze(bundle, new zzfwg(this.zzd, this.zzb));
        } catch (RemoteException e2) {
            zzfwh.zzb.zzc(e2, "dismiss overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e2));
        }
    }
}
