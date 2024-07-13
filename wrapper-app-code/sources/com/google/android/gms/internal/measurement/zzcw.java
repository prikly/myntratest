package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzcw extends zzdu {
    final /* synthetic */ long zza;
    final /* synthetic */ zzef zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcw(zzef zzef, long j) {
        super(zzef, true);
        this.zzb = zzef;
        this.zza = j;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzb.zzj)).setSessionTimeoutDuration(this.zza);
    }
}
