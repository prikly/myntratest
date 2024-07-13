package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzct extends zzdu {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzef zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzct(zzef zzef, Bundle bundle) {
        super(zzef, true);
        this.zzb = zzef;
        this.zza = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzb.zzj)).setConsent(this.zza, this.zzh);
    }
}
