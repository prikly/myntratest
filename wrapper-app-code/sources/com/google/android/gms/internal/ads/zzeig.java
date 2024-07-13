package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeig implements zza, zzder, zzdfh, zzdjf {
    private final Context zza;
    private final zzfjv zzb;
    private final zzfix zzc;
    private final zzfil zzd;
    private final zzekc zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) zzba.zzc().zzb(zzbjj.zzgm)).booleanValue();
    private final zzfnt zzh;
    private final String zzi;

    public zzeig(Context context, zzfjv zzfjv, zzfix zzfix, zzfil zzfil, zzekc zzekc, zzfnt zzfnt, String str) {
        this.zza = context;
        this.zzb = zzfjv;
        this.zzc = zzfix;
        this.zzd = zzfil;
        this.zze = zzekc;
        this.zzh = zzfnt;
        this.zzi = str;
    }

    private final zzfns zzf(String str) {
        zzfns zzb2 = zzfns.zzb(str);
        zzb2.zzh(this.zzc, (zzchb) null);
        zzb2.zzf(this.zzd);
        zzb2.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb2.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzak) {
            zzb2.zza("device_connectivity", true != zzt.zzo().zzx(this.zza) ? "offline" : "online");
            zzb2.zza("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            zzb2.zza("offline_ad", "1");
        }
        return zzb2;
    }

    private final void zzg(zzfns zzfns) {
        if (this.zzd.zzak) {
            this.zze.zzd(new zzeke(zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfns), 2));
            return;
        }
        this.zzh.zzb(zzfns);
    }

    private final boolean zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
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
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zzd.zzak) {
            zzg(zzf(Constants.CLICK));
        }
    }

    public final void zza(zze zze2) {
        zze zze3;
        if (this.zzg) {
            int i = zze2.zza;
            String str = zze2.zzb;
            if (zze2.zzc.equals(MobileAds.ERROR_DOMAIN) && (zze3 = zze2.zzd) != null && !zze3.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zze4 = zze2.zzd;
                i = zze4.zza;
                str = zze4.zzb;
            }
            String zza2 = this.zzb.zza(str);
            zzfns zzf2 = zzf("ifts");
            zzf2.zza(IronSourceConstants.EVENTS_ERROR_REASON, "adapter");
            if (i >= 0) {
                zzf2.zza("arec", String.valueOf(i));
            }
            if (zza2 != null) {
                zzf2.zza("areec", zza2);
            }
            this.zzh.zzb(zzf2);
        }
    }

    public final void zzb() {
        if (this.zzg) {
            zzfnt zzfnt = this.zzh;
            zzfns zzf2 = zzf("ifts");
            zzf2.zza(IronSourceConstants.EVENTS_ERROR_REASON, "blocked");
            zzfnt.zzb(zzf2);
        }
    }

    public final void zzc(zzdod zzdod) {
        if (this.zzg) {
            zzfns zzf2 = zzf("ifts");
            zzf2.zza(IronSourceConstants.EVENTS_ERROR_REASON, "exception");
            if (!TextUtils.isEmpty(zzdod.getMessage())) {
                zzf2.zza("msg", zzdod.getMessage());
            }
            this.zzh.zzb(zzf2);
        }
    }

    public final void zzd() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_shown"));
        }
    }

    public final void zze() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_impression"));
        }
    }

    public final void zzl() {
        if (zzh() || this.zzd.zzak) {
            zzg(zzf(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
