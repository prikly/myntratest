package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfbl implements Callable {
    public final /* synthetic */ zzfbm zza;

    public /* synthetic */ zzfbl(zzfbm zzfbm) {
        this.zza = zzfbm;
    }

    public final Object call() {
        return new zzfbn(new JSONObject());
    }
}
