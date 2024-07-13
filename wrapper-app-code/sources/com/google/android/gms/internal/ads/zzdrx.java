package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdrx implements zzbqd {
    public final /* synthetic */ zzdsa zza;
    public final /* synthetic */ WindowManager zzb;
    public final /* synthetic */ View zzc;

    public /* synthetic */ zzdrx(zzdsa zzdsa, WindowManager windowManager, View view) {
        this.zza = zzdsa;
        this.zzb = windowManager;
        this.zzc = view;
    }

    public final void zza(Object obj, Map map) {
        this.zza.zzc(this.zzb, this.zzc, (zzcno) obj, map);
    }
}
