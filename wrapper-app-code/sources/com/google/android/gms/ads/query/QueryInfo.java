package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzcah;
import com.google.android.gms.internal.ads.zzchd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public class QueryInfo {
    private final zzem zza;

    public QueryInfo(zzem zzem) {
        this.zza = zzem;
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzdx zzdx;
        zzbjj.zzc(context);
        if (((Boolean) zzbkx.zzk.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzjn)).booleanValue()) {
                zzchd.zzb.execute(new zza(context, adFormat, adRequest, queryInfoGenerationCallback));
                return;
            }
        }
        if (adRequest == null) {
            zzdx = null;
        } else {
            zzdx = adRequest.zza();
        }
        new zzcah(context, adFormat, zzdx).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    public String getRequestId() {
        return this.zza.zzd();
    }

    public final zzem zza() {
        return this.zza;
    }
}
