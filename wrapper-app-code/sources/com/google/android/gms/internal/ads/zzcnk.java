package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcnk implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult zza;

    zzcnk(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.cancel();
    }
}
