package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzfxt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzn implements zzfxt {
    public final /* synthetic */ zzac zza;
    public final /* synthetic */ Uri zzb;

    public /* synthetic */ zzn(zzac zzac, Uri uri) {
        this.zza = zzac;
        this.zzb = uri;
    }

    public final Object apply(Object obj) {
        return zzac.zzQ(this.zzb, (String) obj);
    }
}
