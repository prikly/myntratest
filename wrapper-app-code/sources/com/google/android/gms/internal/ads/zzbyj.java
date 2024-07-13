package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbyj implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbyl zza;

    zzbyj(zzbyl zzbyl) {
        this.zza = zzbyl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent zzb = this.zza.zzb();
        zzt.zzp();
        zzs.zzQ(this.zza.zzb, zzb);
    }
}
