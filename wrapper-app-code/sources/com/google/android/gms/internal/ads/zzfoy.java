package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfoy implements Runnable {
    public static Boolean zza;
    private final Context zzb;
    private final zzchu zzc;
    private final zzfpd zzd = zzfpg.zzc();
    private String zze;
    private int zzf;
    private final zzdwz zzg;
    private boolean zzh = false;
    private final zzeib zzi;
    private final zzccn zzj;

    public zzfoy(Context context, zzchu zzchu, zzdwz zzdwz, zzeib zzeib, zzccn zzccn, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzchu;
        this.zzg = zzdwz;
        this.zzi = zzeib;
        this.zzj = zzccn;
    }

    public static synchronized boolean zza() {
        boolean booleanValue;
        synchronized (zzfoy.class) {
            if (zza == null) {
                boolean z = false;
                if (!((Boolean) zzbks.zzb.zze()).booleanValue()) {
                    zza = false;
                } else {
                    if (Math.random() < ((Double) zzbks.zza.zze()).doubleValue()) {
                        z = true;
                    }
                    zza = Boolean.valueOf(z);
                }
            }
            booleanValue = zza.booleanValue();
        }
        return booleanValue;
    }

    private final synchronized void zzc() {
        if (!this.zzh) {
            this.zzh = true;
            if (zza()) {
                zzt.zzp();
                this.zze = zzs.zzo(this.zzb);
                this.zzf = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzb);
                long intValue = (long) ((Integer) zzba.zzc().zzb(zzbjj.zzhP)).intValue();
                zzcib.zzd.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    private final synchronized void zzd() {
        try {
            new zzeia(this.zzb, this.zzc.zza, this.zzj, Binder.getCallingUid(), (byte[]) null).zza(new zzehy((String) zzba.zzc().zzb(zzbjj.zzhO), 60000, new HashMap(), ((zzfpg) this.zzd.zzak()).zzaw(), "application/x-protobuf", false));
            this.zzd.zzc();
        } catch (Exception e2) {
            if (!(e2 instanceof zzede) || ((zzede) e2).zza() != 3) {
                zzt.zzo().zzt(e2, "CuiMonitor.sendCuiPing");
            } else {
                this.zzd.zzc();
            }
        }
    }

    public final synchronized void run() {
        if (zza()) {
            if (this.zzd.zza() != 0) {
                zzd();
            }
        }
    }

    public final synchronized void zzb(zzfop zzfop) {
        if (!this.zzh) {
            zzc();
        }
        if (zza()) {
            if (zzfop != null) {
                if (this.zzd.zza() < ((Integer) zzba.zzc().zzb(zzbjj.zzhQ)).intValue()) {
                    zzfpd zzfpd = this.zzd;
                    zzfpe zza2 = zzfpf.zza();
                    zzfpa zza3 = zzfpb.zza();
                    zza3.zzr(zzfop.zzk());
                    zza3.zzn(zzfop.zzj());
                    zza3.zzf(zzfop.zzb());
                    zza3.zzt(3);
                    zza3.zzl(this.zzc.zza);
                    zza3.zza(this.zze);
                    zza3.zzj(Build.VERSION.RELEASE);
                    zza3.zzo(Build.VERSION.SDK_INT);
                    zza3.zzs(zzfop.zzm());
                    zza3.zzi(zzfop.zza());
                    zza3.zzd((long) this.zzf);
                    zza3.zzq(zzfop.zzl());
                    zza3.zzb(zzfop.zzc());
                    zza3.zze(zzfop.zze());
                    zza3.zzg(zzfop.zzf());
                    zza3.zzh(this.zzg.zzc(zzfop.zzf()));
                    zza3.zzk(zzfop.zzg());
                    zza3.zzc(zzfop.zzd());
                    zza3.zzp(zzfop.zzi());
                    zza3.zzm(zzfop.zzh());
                    zza2.zza(zza3);
                    zzfpd.zzb(zza2);
                }
            }
        }
    }
}
