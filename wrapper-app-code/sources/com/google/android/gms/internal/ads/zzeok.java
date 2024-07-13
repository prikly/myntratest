package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeok {
    private final zzfjv zza;
    private final zzdwz zzb;
    private final zzdzh zzc;
    private final zzfnt zzd;

    public zzeok(zzfjv zzfjv, zzdwz zzdwz, zzdzh zzdzh, zzfnt zzfnt) {
        this.zza = zzfjv;
        this.zzb = zzdwz;
        this.zzc = zzdzh;
        this.zzd = zzfnt;
    }

    public final void zza(zzfio zzfio, zzfil zzfil, int i, zzeku zzeku, long j) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzhK)).booleanValue()) {
            zzfns zzb2 = zzfns.zzb("adapter_status");
            zzb2.zzg(zzfio);
            zzb2.zzf(zzfil);
            zzb2.zza("adapter_l", String.valueOf(j));
            zzb2.zza("sc", Integer.toString(i));
            if (zzeku != null) {
                zzb2.zza("arec", Integer.toString(zzeku.zzb().zza));
                String zza2 = this.zza.zza(zzeku.getMessage());
                if (zza2 != null) {
                    zzb2.zza("areec", zza2);
                }
            }
            zzdwy zzb3 = this.zzb.zzb(zzfil.zzu);
            if (zzb3 != null) {
                zzb2.zza("ancn", zzb3.zza);
                zzbye zzbye = zzb3.zzb;
                if (zzbye != null) {
                    zzb2.zza("adapter_v", zzbye.toString());
                }
                zzbye zzbye2 = zzb3.zzc;
                if (zzbye2 != null) {
                    zzb2.zza("adapter_sv", zzbye2.toString());
                }
            }
            this.zzd.zzb(zzb2);
            return;
        }
        zzdzg zza3 = this.zzc.zza();
        zza3.zze(zzfio);
        zza3.zzd(zzfil);
        zza3.zzb("action", "adapter_status");
        zza3.zzb("adapter_l", String.valueOf(j));
        zza3.zzb("sc", Integer.toString(i));
        if (zzeku != null) {
            zza3.zzb("arec", Integer.toString(zzeku.zzb().zza));
            String zza4 = this.zza.zza(zzeku.getMessage());
            if (zza4 != null) {
                zza3.zzb("areec", zza4);
            }
        }
        zzdwy zzb4 = this.zzb.zzb(zzfil.zzu);
        if (zzb4 != null) {
            zza3.zzb("ancn", zzb4.zza);
            zzbye zzbye3 = zzb4.zzb;
            if (zzbye3 != null) {
                zza3.zzb("adapter_v", zzbye3.toString());
            }
            zzbye zzbye4 = zzb4.zzc;
            if (zzbye4 != null) {
                zza3.zzb("adapter_sv", zzbye4.toString());
            }
        }
        zza3.zzg();
    }
}
