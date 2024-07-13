package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzcal extends zzcae {
    final /* synthetic */ List zza;

    zzcal(zzcan zzcan, List list) {
        this.zza = list;
    }

    public final void zze(String str) {
        zzcho.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    public final void zzf(List list) {
        zzcho.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
