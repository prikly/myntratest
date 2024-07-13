package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcns implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcep zza;
    final /* synthetic */ zzcnv zzb;

    zzcns(zzcnv zzcnv, zzcep zzcep) {
        this.zzb = zzcnv;
        this.zza = zzcep;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzR(view, this.zza, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
