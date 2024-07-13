package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcxb implements Runnable {
    public final /* synthetic */ zzcxc zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcxb(zzcxc zzcxc, JSONObject jSONObject) {
        this.zza = zzcxc;
        this.zzb = jSONObject;
    }

    public final void run() {
        this.zza.zzd(this.zzb);
    }
}
