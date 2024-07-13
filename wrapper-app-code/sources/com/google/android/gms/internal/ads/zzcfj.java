package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcfj implements zzcfs {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcfj(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    public final void zza(zzcpf zzcpf) {
        Context context = this.zza;
        zzcpf.zzs(ObjectWrapper.wrap(context), this.zzb, context.getPackageName());
    }
}
