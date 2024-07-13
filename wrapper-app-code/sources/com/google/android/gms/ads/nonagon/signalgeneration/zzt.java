package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgdy;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzgfb;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzt implements zzgdy {
    public final /* synthetic */ zzac zza;

    public /* synthetic */ zzt(zzac zzac) {
        this.zza = zzac;
    }

    public final zzgfb zza(Object obj) {
        return zzger.zzm(this.zza.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzn(this.zza, (Uri) obj), this.zza.zzk);
    }
}
