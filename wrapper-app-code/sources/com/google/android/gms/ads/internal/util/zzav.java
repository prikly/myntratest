package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzav implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzav(zzaw zzaw, Context context, String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
    }

    public final void run() {
        zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(this.zza);
        zzG.setMessage(this.zzb);
        if (this.zzc) {
            zzG.setTitle(LogConstants.EVENT_ERROR);
        } else {
            zzG.setTitle(LogConstants.EVENT_INFO);
        }
        if (this.zzd) {
            zzG.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzG.setPositiveButton("Learn More", new zzau(this));
            zzG.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzG.create().show();
    }
}
