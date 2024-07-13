package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdry implements zzbqd {
    public final /* synthetic */ zzdsa zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ WindowManager zzc;

    public /* synthetic */ zzdry(zzdsa zzdsa, View view, WindowManager windowManager) {
        this.zza = zzdsa;
        this.zzb = view;
        this.zzc = windowManager;
    }

    public final void zza(Object obj, Map map) {
        this.zza.zze(this.zzb, this.zzc, (zzcno) obj, map);
    }
}
