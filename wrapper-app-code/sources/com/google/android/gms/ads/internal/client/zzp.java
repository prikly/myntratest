package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzchh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzp {
    public static final zzp zza = new zzp();

    protected zzp() {
    }

    public final zzl zza(Context context, zzdx zzdx) {
        List list;
        Context context2;
        zzc zzc;
        String str;
        zzdx zzdx2 = zzdx;
        Date zzo = zzdx.zzo();
        long time = zzo != null ? zzo.getTime() : -1;
        String zzl = zzdx.zzl();
        int zza2 = zzdx.zza();
        Set zzr = zzdx.zzr();
        if (!zzr.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(zzr));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean zzt = zzdx2.zzt(context2);
        Bundle zzf = zzdx2.zzf(AdMobAdapter.class);
        AdInfo zzi = zzdx.zzi();
        if (zzi != null) {
            QueryInfo queryInfo = zzi.getQueryInfo();
            zzc = new zzc(zzdx.zzi().getAdString(), queryInfo != null ? queryInfo.zza().zzc() : "");
        } else {
            zzc = null;
        }
        String zzm = zzdx.zzm();
        SearchAdRequest zzj = zzdx.zzj();
        zzfh zzfh = zzj != null ? new zzfh(zzj) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzay.zzb();
            str = zzchh.zzr(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzs = zzdx.zzs();
        RequestConfiguration zzc2 = zzej.zzf().zzc();
        return new zzl(8, time, zzf, zza2, list, zzt, Math.max(zzdx.zzc(), zzc2.getTagForChildDirectedTreatment()), false, zzm, zzfh, (Location) null, zzl, zzdx.zzg(), zzdx.zze(), Collections.unmodifiableList(new ArrayList(zzdx.zzq())), zzdx.zzn(), str, zzs, zzc, Math.max(-1, zzc2.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(new String[]{null, zzc2.getMaxAdContentRating()}), zzo.zza), zzdx.zzp(), zzdx.zzb(), zzdx.zzk());
    }
}
