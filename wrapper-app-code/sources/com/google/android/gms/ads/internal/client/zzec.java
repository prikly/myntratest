package com.google.android.gms.ads.internal.client;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final /* synthetic */ class zzec implements Runnable {
    public final /* synthetic */ zzej zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzec(zzej zzej, Context context, String str) {
        this.zza = zzej;
        this.zzb = context;
    }

    public final void run() {
        this.zza.zzo(this.zzb, (String) null);
    }
}
