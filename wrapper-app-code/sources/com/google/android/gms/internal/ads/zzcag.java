package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzcag extends zzcgb {
    final /* synthetic */ QueryInfoGenerationCallback zza;

    zzcag(zzcah zzcah, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zza = queryInfoGenerationCallback;
    }

    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new QueryInfo(new zzem(str, bundle, str2)));
    }
}
