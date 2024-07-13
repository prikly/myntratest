package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzdzo {
    protected final String zza = ((String) zzbkt.zzb.zze());
    protected final Map zzb = new HashMap();
    protected final Executor zzc;
    protected final zzcht zzd;
    protected final boolean zze;
    private final zzfod zzf;
    private final boolean zzg;
    private final boolean zzh;

    protected zzdzo(Executor executor, zzcht zzcht, zzfod zzfod) {
        this.zzc = executor;
        this.zzd = zzcht;
        this.zze = ((Boolean) zzba.zzc().zzb(zzbjj.zzbN)).booleanValue();
        this.zzf = zzfod;
        this.zzg = ((Boolean) zzba.zzc().zzb(zzbjj.zzbQ)).booleanValue();
        this.zzh = ((Boolean) zzba.zzc().zzb(zzbjj.zzgw)).booleanValue();
    }

    private final void zza(Map map, boolean z) {
        if (!map.isEmpty()) {
            String zza2 = this.zzf.zza(map);
            zze.zza(zza2);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (!this.zze) {
                return;
            }
            if (z && !this.zzg) {
                return;
            }
            if (!parseBoolean || this.zzh) {
                this.zzc.execute(new zzdzn(this, zza2));
                return;
            }
            return;
        }
        zze.zze("Empty paramMap.");
    }

    /* access modifiers changed from: protected */
    public final String zzb(Map map) {
        return this.zzf.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final void zzd(Map map) {
        zza(map, true);
    }

    public final void zze(Map map) {
        zza(map, false);
    }
}
