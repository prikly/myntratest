package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeuw implements zzezm {
    private static final Object zza = new Object();
    private final String zzb;
    private final String zzc;
    private final zzdce zzd;
    private final zzfkm zze;
    private final zzfjg zzf;
    private final zzg zzg = zzt.zzo().zzh();
    private final zzdzc zzh;

    public zzeuw(String str, String str2, zzdce zzdce, zzfkm zzfkm, zzfjg zzfjg, zzdzc zzdzc) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzdce;
        this.zze = zzfkm;
        this.zzf = zzfjg;
        this.zzh = zzdzc;
    }

    public final int zza() {
        return 12;
    }

    public final zzgfb zzb() {
        Bundle bundle = new Bundle();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgT)).booleanValue()) {
            this.zzh.zza().put("seq_num", this.zzb);
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzeZ)).booleanValue()) {
            this.zzd.zzg(this.zzf.zzd);
            bundle.putAll(this.zze.zzb());
        }
        return zzger.zzi(new zzeuv(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzeZ)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzeY)).booleanValue()) {
                synchronized (zza) {
                    this.zzd.zzg(this.zzf.zzd);
                    bundle2.putBundle("quality_signals", this.zze.zzb());
                }
            } else {
                this.zzd.zzg(this.zzf.zzd);
                bundle2.putBundle("quality_signals", this.zze.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzb);
        if (!this.zzg.zzP()) {
            bundle2.putString("session_id", this.zzc);
        }
    }
}
