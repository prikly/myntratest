package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchg;
import com.google.android.gms.internal.ads.zzfvb;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzk implements zzchg {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzk(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    public final boolean zza(String str) {
        Context context = this.zza;
        String str2 = this.zzb;
        zzfvb zzfvb = zzs.zza;
        zzt.zzp();
        zzs.zzH(context, str2, str);
        return true;
    }
}
