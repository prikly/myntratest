package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeha implements Callable {
    public final /* synthetic */ zzgfb zza;
    public final /* synthetic */ zzgfb zzb;

    public /* synthetic */ zzeha(zzgfb zzgfb, zzgfb zzgfb2) {
        this.zza = zzgfb;
        this.zzb = zzgfb2;
    }

    public final Object call() {
        return new zzeic((JSONObject) this.zza.get(), (zzcce) this.zzb.get());
    }
}
