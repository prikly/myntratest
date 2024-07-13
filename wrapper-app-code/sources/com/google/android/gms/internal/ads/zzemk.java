package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzemk implements zzdoe {
    public final /* synthetic */ zzcig zza;

    public /* synthetic */ zzemk(zzcig zzcig) {
        this.zza = zzcig;
    }

    public final void zza(boolean z, Context context, zzdfa zzdfa) {
        zzcig zzcig = this.zza;
        try {
            zzt.zzi();
            zzm.zza(context, (AdOverlayInfoParcel) zzcig.get(), true);
        } catch (Exception unused) {
        }
    }
}
