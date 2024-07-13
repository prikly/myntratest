package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcnx implements zzgdx {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzapj zzb;
    public final /* synthetic */ zzchu zzc;
    public final /* synthetic */ zza zzd;
    public final /* synthetic */ String zze;

    public /* synthetic */ zzcnx(Context context, zzapj zzapj, zzchu zzchu, zza zza2, String str) {
        this.zza = context;
        this.zzb = zzapj;
        this.zzc = zzchu;
        this.zzd = zza2;
        this.zze = str;
    }

    public final zzgfb zza() {
        Context context = this.zza;
        zzapj zzapj = this.zzb;
        zzchu zzchu = this.zzc;
        zza zza2 = this.zzd;
        String str = this.zze;
        zzt.zzz();
        zzcno zza3 = zzcoa.zza(context, zzcpd.zza(), "", false, false, zzapj, (zzbki) null, zzchu, (zzbjy) null, (zzl) null, zza2, zzbew.zza(), (zzfil) null, (zzfio) null);
        zzcif zza4 = zzcif.zza(zza3);
        zza3.zzP().zzA(new zzcny(zza4));
        zza3.loadUrl(str);
        return zza4;
    }
}
