package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.b.i;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeti implements zzezl {
    final zzfjg zza;
    private final long zzb;

    public zzeti(zzfjg zzfjg, long j) {
        Preconditions.checkNotNull(zzfjg, "the targeting must not be null");
        this.zza = zzfjg;
        this.zzb = j;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzl zzl = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzl.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i = this.zza.zzo.zza;
        int i2 = i - 1;
        if (i != 0) {
            boolean z = true;
            if (i2 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i2 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            zzfjr.zzf(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzl.zzb)), zzl.zzb != -1);
            zzfjr.zzb(bundle, "extras", zzl.zzc);
            int i3 = zzl.zzd;
            zzfjr.zze(bundle, "cust_gender", i3, i3 != -1);
            zzfjr.zzd(bundle, "kw", zzl.zze);
            int i4 = zzl.zzg;
            zzfjr.zze(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
            if (zzl.zzf) {
                bundle.putBoolean("test_request", true);
            }
            zzfjr.zze(bundle, "d_imp_hdr", 1, zzl.zza >= 2 && zzl.zzh);
            String str = zzl.zzi;
            zzfjr.zzf(bundle, "ppid", str, zzl.zza >= 2 && !TextUtils.isEmpty(str));
            Location location = zzl.zzk;
            if (location != null) {
                float accuracy = location.getAccuracy();
                long time = location.getTime();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", accuracy * 1000.0f);
                bundle2.putLong(i.fC, (long) (latitude * 1.0E7d));
                bundle2.putLong("long", (long) (longitude * 1.0E7d));
                bundle2.putLong("time", time * 1000);
                bundle.putBundle("uule", bundle2);
            }
            zzfjr.zzc(bundle, "url", zzl.zzl);
            zzfjr.zzd(bundle, "neighboring_content_urls", zzl.zzv);
            zzfjr.zzb(bundle, "custom_targeting", zzl.zzn);
            zzfjr.zzd(bundle, "category_exclusions", zzl.zzo);
            zzfjr.zzc(bundle, "request_agent", zzl.zzp);
            zzfjr.zzc(bundle, "request_pkg", zzl.zzq);
            zzfjr.zzg(bundle, "is_designed_for_families", zzl.zzr, zzl.zza >= 7);
            if (zzl.zza >= 8) {
                int i5 = zzl.zzt;
                if (i5 == -1) {
                    z = false;
                }
                zzfjr.zze(bundle, "tag_for_under_age_of_consent", i5, z);
                zzfjr.zzc(bundle, "max_ad_content_rating", zzl.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
