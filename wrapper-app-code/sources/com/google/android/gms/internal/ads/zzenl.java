package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzenl implements Callable {
    public final /* synthetic */ zzenq zza;
    public final /* synthetic */ zzgfb zzb;
    public final /* synthetic */ zzgfb zzc;
    public final /* synthetic */ zzfix zzd;
    public final /* synthetic */ zzfil zze;
    public final /* synthetic */ JSONObject zzf;

    public /* synthetic */ zzenl(zzenq zzenq, zzgfb zzgfb, zzgfb zzgfb2, zzfix zzfix, zzfil zzfil, JSONObject jSONObject) {
        this.zza = zzenq;
        this.zzb = zzgfb;
        this.zzc = zzgfb2;
        this.zzd = zzfix;
        this.zze = zzfil;
        this.zzf = jSONObject;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
