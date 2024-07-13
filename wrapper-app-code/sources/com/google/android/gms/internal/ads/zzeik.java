package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeik implements zzdlh {
    private boolean zza = false;
    private boolean zzb = false;
    private final String zzc;
    private final zzfnt zzd;
    private final zzg zze;

    public zzeik(String str, zzfnt zzfnt) {
        this.zzc = str;
        this.zzd = zzfnt;
        this.zze = zzt.zzo().zzh();
    }

    private final zzfns zzg(String str) {
        String str2;
        if (this.zze.zzP()) {
            str2 = "";
        } else {
            str2 = this.zzc;
        }
        zzfns zzb2 = zzfns.zzb(str);
        zzb2.zza("tms", Long.toString(zzt.zzB().elapsedRealtime(), 10));
        zzb2.zza(ScarConstants.TOKEN_ID_KEY, str2);
        return zzb2;
    }

    public final void zza(String str) {
        zzfnt zzfnt = this.zzd;
        zzfns zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        zzfnt.zzb(zzg);
    }

    public final void zzb(String str, String str2) {
        zzfnt zzfnt = this.zzd;
        zzfns zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        zzfnt.zzb(zzg);
    }

    public final void zzc(String str) {
        zzfnt zzfnt = this.zzd;
        zzfns zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        zzfnt.zzb(zzg);
    }

    public final void zzd(String str) {
        zzfnt zzfnt = this.zzd;
        zzfns zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzfnt.zzb(zzg);
    }

    public final synchronized void zze() {
        if (!this.zzb) {
            this.zzd.zzb(zzg("init_finished"));
            this.zzb = true;
        }
    }

    public final synchronized void zzf() {
        if (!this.zza) {
            this.zzd.zzb(zzg("init_started"));
            this.zza = true;
        }
    }
}
