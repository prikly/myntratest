package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdvb implements Callable {
    /* access modifiers changed from: private */
    public final zza zza;
    /* access modifiers changed from: private */
    public final zzcoa zzb;
    /* access modifiers changed from: private */
    public final Context zzc;
    /* access modifiers changed from: private */
    public final zzdzh zzd;
    /* access modifiers changed from: private */
    public final zzfnt zze;
    /* access modifiers changed from: private */
    public final zzekc zzf;
    /* access modifiers changed from: private */
    public final Executor zzg;
    /* access modifiers changed from: private */
    public final zzapj zzh;
    /* access modifiers changed from: private */
    public final zzchu zzi;
    /* access modifiers changed from: private */
    public final zzfpo zzj;

    public zzdvb(Context context, Executor executor, zzapj zzapj, zzchu zzchu, zza zza2, zzcoa zzcoa, zzekc zzekc, zzfpo zzfpo, zzdzh zzdzh, zzfnt zzfnt) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzapj;
        this.zzi = zzchu;
        this.zza = zza2;
        this.zzb = zzcoa;
        this.zzf = zzekc;
        this.zzj = zzfpo;
        this.zzd = zzdzh;
        this.zze = zzfnt;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdve zzdve = new zzdve(this);
        zzdve.zzh();
        return zzdve;
    }
}
