package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzcak extends zzcae {
    final /* synthetic */ List zza;

    zzcak(zzcan zzcan, List list) {
        this.zza = list;
    }

    public final void zze(String str) {
        zzcho.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    public final void zzf(List list) {
        zzcho.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
