package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzeob implements zzekq {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        zzfil zzfil2 = zzfil;
        String optString = zzfil2.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfjg zzfjg = zzfix.zza.zza;
        zzfje zzfje = new zzfje();
        zzfje.zzp(zzfjg);
        zzfje.zzs(optString);
        Bundle zzd = zzd(zzfjg.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfil2.zzw.optString("mad_hac", (String) null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfil2.zzw.optString("adJson", (String) null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfil2.zzE.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfil2.zzE.optString(next, (String) null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        zzl zzl = zzfjg.zzd;
        zzl zzl2 = r5;
        zzl zzl3 = new zzl(zzl.zza, zzl.zzb, zzd2, zzl.zzd, zzl.zze, zzl.zzf, zzl.zzg, zzl.zzh, zzl.zzi, zzl.zzj, zzl.zzk, zzl.zzl, zzd, zzl.zzn, zzl.zzo, zzl.zzp, zzl.zzq, zzl.zzr, zzl.zzs, zzl.zzt, zzl.zzu, zzl.zzv, zzl.zzw, zzl.zzx);
        zzfje.zzE(zzl2);
        zzfjg zzG = zzfje.zzG();
        Bundle bundle = new Bundle();
        zzfix zzfix2 = zzfix;
        zzfio zzfio = zzfix2.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(zzfio.zza));
        bundle2.putInt("refresh_interval", zzfio.zzc);
        bundle2.putString("gws_query_id", zzfio.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfix2.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        zzfil zzfil3 = zzfil;
        bundle3.putString("allocation_id", zzfil3.zzx);
        bundle3.putStringArrayList("click_urls", new ArrayList(zzfil3.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList(zzfil3.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(zzfil3.zzq));
        bundle3.putStringArrayList("fill_urls", new ArrayList(zzfil3.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(zzfil3.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(zzfil3.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(zzfil3.zzj));
        bundle3.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzfil3.zzk);
        bundle3.putString("valid_from_timestamp", zzfil3.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzfil3.zzQ);
        if (zzfil3.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfil3.zzm.zzb);
            bundle4.putString("rb_type", zzfil3.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzG, bundle);
    }

    public final boolean zzb(zzfix zzfix, zzfil zzfil) {
        return !TextUtils.isEmpty(zzfil.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* access modifiers changed from: protected */
    public abstract zzgfb zzc(zzfjg zzfjg, Bundle bundle);
}
