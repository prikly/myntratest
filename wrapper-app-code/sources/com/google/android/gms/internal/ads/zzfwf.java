package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfwf extends zzfwv {
    final /* synthetic */ zzfwo zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfwm zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfwh zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfwf(zzfwh zzfwh, TaskCompletionSource taskCompletionSource, zzfwo zzfwo, int i, zzfwm zzfwm, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzfwh;
        this.zza = zzfwo;
        this.zzb = i;
        this.zzc = zzfwm;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzfwr, android.os.IInterface] */
    /* access modifiers changed from: protected */
    public final void zza() {
        try {
            ? zze2 = this.zze.zza.zze();
            zzfwo zzfwo = this.zza;
            String zzb2 = this.zze.zzd;
            int i = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfwo.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", zzb2);
            bundle.putString("appId", zzfwo.zza());
            zze2.zzg(bundle, new zzfwg(this.zze, this.zzc));
        } catch (RemoteException e2) {
            zzfwh.zzb.zzc(e2, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.zzb), this.zze.zzd);
            this.zzd.trySetException(new RuntimeException(e2));
        }
    }
}
