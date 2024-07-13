package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcwq implements Runnable {
    public final /* synthetic */ zzcno zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcwq(zzcno zzcno, JSONObject jSONObject) {
        this.zza = zzcno;
        this.zzb = jSONObject;
    }

    public final void run() {
        this.zza.zzl("AFMA_updateActiveView", this.zzb);
    }
}
