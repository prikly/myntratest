package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfow implements Runnable {
    private final List zza = new ArrayList();
    private final zzfoy zzb;
    private String zzc;
    private String zzd;
    private zzfiw zze;
    private zze zzf;
    private Future zzg;
    private int zzh = 2;

    zzfow(zzfoy zzfoy) {
        this.zzb = zzfoy;
    }

    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfow zza(zzfol zzfol) {
        if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfol.zzi();
            list.add(zzfol);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcib.zzd.schedule(this, (long) ((Integer) zzba.zzc().zzb(zzbjj.zzhR)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfow zzb(String str) {
        if (((Boolean) zzbks.zzc.zze()).booleanValue() && zzfov.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfow zzc(zze zze2) {
        if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
            this.zzf = zze2;
        }
        return this;
    }

    public final synchronized zzfow zzd(ArrayList arrayList) {
        if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner")) {
                if (!arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial")) {
                        if (!arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                            if (!arrayList.contains("native")) {
                                if (!arrayList.contains(AdFormat.NATIVE.name())) {
                                    if (!arrayList.contains("rewarded")) {
                                        if (!arrayList.contains(AdFormat.REWARDED.name())) {
                                            if (arrayList.contains("app_open_ad")) {
                                                this.zzh = 7;
                                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                                this.zzh = 6;
                                            }
                                        }
                                    }
                                    this.zzh = 5;
                                }
                            }
                            this.zzh = 8;
                        }
                    }
                    this.zzh = 4;
                }
            }
            this.zzh = 3;
        }
        return this;
    }

    public final synchronized zzfow zze(String str) {
        if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfow zzf(zzfiw zzfiw) {
        if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
            this.zze = zzfiw;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfol zzfol : this.zza) {
                int i = this.zzh;
                if (i != 2) {
                    zzfol.zzm(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfol.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfol.zzk()) {
                    zzfol.zzd(this.zzd);
                }
                zzfiw zzfiw = this.zze;
                if (zzfiw != null) {
                    zzfol.zzb(zzfiw);
                } else {
                    zze zze2 = this.zzf;
                    if (zze2 != null) {
                        zzfol.zza(zze2);
                    }
                }
                this.zzb.zzb(zzfol.zzl());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfow zzh(int i) {
        if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
            this.zzh = i;
        }
        return this;
    }
}
