package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbyk implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbyl zza;

    zzbyk(zzbyl zzbyl) {
        this.zza = zzbyl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
