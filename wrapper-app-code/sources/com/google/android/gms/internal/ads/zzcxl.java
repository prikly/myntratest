package com.google.android.gms.internal.ads;

import com.appnext.ads.a;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcxl {
    private final zzfnt zza;
    private final zzdzh zzb;
    private final zzfix zzc;

    public zzcxl(zzdzh zzdzh, zzfix zzfix, zzfnt zzfnt) {
        this.zza = zzfnt;
        this.zzb = zzdzh;
        this.zzc = zzfix;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j, int i) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzhK)).booleanValue()) {
            zzfnt zzfnt = this.zza;
            zzfns zzb2 = zzfns.zzb(a.f16107h);
            zzb2.zzg(this.zzc.zzb.zzb);
            zzb2.zza("show_time", String.valueOf(j));
            zzb2.zza("ad_format", "app_open_ad");
            zzb2.zza("acr", zzb(i));
            zzfnt.zzb(zzb2);
            return;
        }
        zzdzg zza2 = this.zzb.zza();
        zza2.zze(this.zzc.zzb.zzb);
        zza2.zzb("action", a.f16107h);
        zza2.zzb("show_time", String.valueOf(j));
        zza2.zzb("ad_format", "app_open_ad");
        zza2.zzb("acr", zzb(i));
        zza2.zzg();
    }
}
