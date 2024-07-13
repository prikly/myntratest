package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzgen;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaa implements zzgen {
    final /* synthetic */ zzac zza;

    zzaa(zzac zzac) {
        this.zza = zzac;
    }

    public final void zza(Throwable th) {
        zzt.zzo().zzu(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzac zzac = this.zza;
        zzf.zzc(zzac.zzr, zzac.zzj, "sgf", new Pair("sgf_reason", th.getMessage()));
        zze.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    public final /* synthetic */ void zzb(Object obj) {
        zzao zzao = (zzao) obj;
        zze.zze("Initialized webview successfully for SDKCore.");
    }
}
