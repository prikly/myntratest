package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfso implements OnFailureListener {
    public final /* synthetic */ zzfss zza;

    public /* synthetic */ zzfso(zzfss zzfss) {
        this.zza = zzfss;
    }

    public final void onFailure(Exception exc) {
        this.zza.zzf(exc);
    }
}
