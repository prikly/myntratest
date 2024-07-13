package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzehb implements Callable {
    public final /* synthetic */ zzgfb zza;
    public final /* synthetic */ zzgfb zzb;
    public final /* synthetic */ zzgfb zzc;

    public /* synthetic */ zzehb(zzgfb zzgfb, zzgfb zzgfb2, zzgfb zzgfb3) {
        this.zza = zzgfb;
        this.zzb = zzgfb2;
        this.zzc = zzgfb3;
    }

    public final Object call() {
        return new zzehl((zzehz) this.zza.get(), (JSONObject) this.zzb.get(), (zzcce) this.zzc.get());
    }
}
