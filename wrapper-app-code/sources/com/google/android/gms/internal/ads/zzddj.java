package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzas;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzddj implements zzfxt {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzchu zzb;
    public final /* synthetic */ zzfjg zzc;

    public /* synthetic */ zzddj(Context context, zzchu zzchu, zzfjg zzfjg) {
        this.zza = context;
        this.zzb = zzchu;
        this.zzc = zzfjg;
    }

    public final Object apply(Object obj) {
        Context context = this.zza;
        zzchu zzchu = this.zzb;
        zzfjg zzfjg = this.zzc;
        zzfil zzfil = (zzfil) obj;
        zzas zzas = new zzas(context);
        zzas.zzp(zzfil.zzC);
        zzas.zzq(zzfil.zzD.toString());
        zzas.zzo(zzchu.zza);
        zzas.zzn(zzfjg.zzf);
        return zzas;
    }
}
