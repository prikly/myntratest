package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzko implements zzla {
    final /* synthetic */ zzkt zza;

    zzko(zzkt zzkt) {
        this.zza = zzkt;
    }

    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            zzkt zzkt = this.zza;
            if (zzkt.zzn != null) {
                zzkt.zzn.zzay().zzd().zzb("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.zza.zzaz().zzp(new zzkn(this, str, "_err", bundle));
    }
}
