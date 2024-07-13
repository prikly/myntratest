package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzcys {
    private final zzdal zza;
    private final View zzb;
    private final zzfim zzc;
    private final zzcno zzd;

    public zzcys(View view, zzcno zzcno, zzdal zzdal, zzfim zzfim) {
        this.zzb = view;
        this.zzd = zzcno;
        this.zza = zzdal;
        this.zzc = zzfim;
    }

    public static final zzdlu zzf(Context context, zzchu zzchu, zzfil zzfil, zzfjg zzfjg) {
        return new zzdlu(new zzcyq(context, zzchu, zzfil, zzfjg), zzcib.zzf);
    }

    public static final Set zzg(zzdac zzdac) {
        return Collections.singleton(new zzdlu(zzdac, zzcib.zzf));
    }

    public static final zzdlu zzh(zzdaa zzdaa) {
        return new zzdlu(zzdaa, zzcib.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcno zzb() {
        return this.zzd;
    }

    public final zzdal zzc() {
        return this.zza;
    }

    public zzdfz zzd(Set set) {
        return new zzdfz(set);
    }

    public final zzfim zze() {
        return this.zzc;
    }
}
