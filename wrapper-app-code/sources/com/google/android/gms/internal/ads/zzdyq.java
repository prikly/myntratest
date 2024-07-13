package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdyq implements zza, zzder, zzdfh, zzdjf {
    private final Context zza;
    private final zzfjv zzb;
    private final zzdzh zzc;
    private final zzfix zzd;
    private final zzfil zze;
    private final zzekc zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) zzba.zzc().zzb(zzbjj.zzgm)).booleanValue();

    public zzdyq(Context context, zzfjv zzfjv, zzdzh zzdzh, zzfix zzfix, zzfil zzfil, zzekc zzekc) {
        this.zza = context;
        this.zzb = zzfjv;
        this.zzc = zzdzh;
        this.zzd = zzfix;
        this.zze = zzfil;
        this.zzf = zzekc;
    }

    private final zzdzg zzf(String str) {
        zzdzg zza2 = this.zzc.zza();
        zza2.zze(this.zzd.zzb.zzb);
        zza2.zzd(this.zze);
        zza2.zzb("action", str);
        boolean z = false;
        if (!this.zze.zzu.isEmpty()) {
            zza2.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzak) {
            zza2.zzb("device_connectivity", true != zzt.zzo().zzx(this.zza) ? "offline" : "online");
            zza2.zzb("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            zza2.zzb("offline_ad", "1");
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgv)).booleanValue()) {
            if (zzf.zze(this.zzd.zza.zza) != 1) {
                z = true;
            }
            zza2.zzb("scar", String.valueOf(z));
            if (z) {
                zzl zzl = this.zzd.zza.zza.zzd;
                zza2.zzc("ragent", zzl.zzp);
                zza2.zzc("rtype", zzf.zza(zzf.zzb(zzl)));
            }
        }
        return zza2;
    }

    private final void zzg(zzdzg zzdzg) {
        if (this.zze.zzak) {
            this.zzf.zzd(new zzeke(zzt.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdzg.zzf(), 2));
            return;
        }
        zzdzg.zzg();
    }

    private final boolean zzh() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
                    String str = (String) zzba.zzc().zzb(zzbjj.zzbm);
                    zzt.zzp();
                    String zzo = zzs.zzo(this.zza);
                    boolean z = false;
                    if (!(str == null || zzo == null)) {
                        try {
                            z = Pattern.matches(str, zzo);
                        } catch (RuntimeException e2) {
                            zzt.zzo().zzu(e2, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzg = Boolean.valueOf(z);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zze.zzak) {
            zzg(zzf(Constants.CLICK));
        }
    }

    public final void zza(zze zze2) {
        zze zze3;
        if (this.zzh) {
            zzdzg zzf2 = zzf("ifts");
            zzf2.zzb(IronSourceConstants.EVENTS_ERROR_REASON, "adapter");
            int i = zze2.zza;
            String str = zze2.zzb;
            if (zze2.zzc.equals(MobileAds.ERROR_DOMAIN) && (zze3 = zze2.zzd) != null && !zze3.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zze4 = zze2.zzd;
                i = zze4.zza;
                str = zze4.zzb;
            }
            if (i >= 0) {
                zzf2.zzb("arec", String.valueOf(i));
            }
            String zza2 = this.zzb.zza(str);
            if (zza2 != null) {
                zzf2.zzb("areec", zza2);
            }
            zzf2.zzg();
        }
    }

    public final void zzb() {
        if (this.zzh) {
            zzdzg zzf2 = zzf("ifts");
            zzf2.zzb(IronSourceConstants.EVENTS_ERROR_REASON, "blocked");
            zzf2.zzg();
        }
    }

    public final void zzc(zzdod zzdod) {
        if (this.zzh) {
            zzdzg zzf2 = zzf("ifts");
            zzf2.zzb(IronSourceConstants.EVENTS_ERROR_REASON, "exception");
            if (!TextUtils.isEmpty(zzdod.getMessage())) {
                zzf2.zzb("msg", zzdod.getMessage());
            }
            zzf2.zzg();
        }
    }

    public final void zzd() {
        if (zzh()) {
            zzf("adapter_shown").zzg();
        }
    }

    public final void zze() {
        if (zzh()) {
            zzf("adapter_impression").zzg();
        }
    }

    public final void zzl() {
        if (zzh() || this.zze.zzak) {
            zzg(zzf(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
