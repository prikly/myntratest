package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbyp implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbyq zza;

    zzbyp(zzbyq zzbyq) {
        this.zza = zzbyq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
