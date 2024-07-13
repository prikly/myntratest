package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.appodeal.advertising.AdvertisingInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzjo extends zzkh {
    public final zzes zza;
    public final zzes zzb;
    public final zzes zzc;
    public final zzes zzd;
    public final zzes zze;
    private final Map zzg = new HashMap();

    zzjo(zzkt zzkt) {
        super(zzkt);
        zzew zzm = this.zzt.zzm();
        zzm.getClass();
        this.zza = new zzes(zzm, "last_delete_stale", 0);
        zzew zzm2 = this.zzt.zzm();
        zzm2.getClass();
        this.zzb = new zzes(zzm2, "backoff", 0);
        zzew zzm3 = this.zzt.zzm();
        zzm3.getClass();
        this.zzc = new zzes(zzm3, "last_upload", 0);
        zzew zzm4 = this.zzt.zzm();
        zzm4.getClass();
        this.zzd = new zzes(zzm4, "last_upload_attempt", 0);
        zzew zzm5 = this.zzt.zzm();
        zzm5.getClass();
        this.zze = new zzes(zzm5, "midnight_offset", 0);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final Pair zza(String str) {
        zzjn zzjn;
        zzg();
        long elapsedRealtime = this.zzt.zzav().elapsedRealtime();
        zzjn zzjn2 = (zzjn) this.zzg.get(str);
        if (zzjn2 != null && elapsedRealtime < zzjn2.zzc) {
            return new Pair(zzjn2.zza, Boolean.valueOf(zzjn2.zzb));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long zzi = elapsedRealtime + this.zzt.zzf().zzi(str, zzdu.zza);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzau());
            if (advertisingIdInfo == null) {
                return new Pair("", false);
            }
            String id = advertisingIdInfo.getId();
            if (id != null) {
                zzjn = new zzjn(id, advertisingIdInfo.isLimitAdTrackingEnabled(), zzi);
            } else {
                zzjn = new zzjn("", advertisingIdInfo.isLimitAdTrackingEnabled(), zzi);
            }
            this.zzg.put(str, zzjn);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(zzjn.zza, Boolean.valueOf(zzjn.zzb));
        } catch (Exception e2) {
            this.zzt.zzay().zzc().zzb("Unable to get advertising id", e2);
            zzjn = new zzjn("", false, zzi);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzb() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Pair zzd(String str, zzai zzai) {
        if (zzai.zzi(zzah.AD_STORAGE)) {
            return zza(str);
        }
        return new Pair("", false);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final String zzf(String str, boolean z) {
        zzg();
        String str2 = z ? (String) zza(str).first : AdvertisingInfo.defaultAdvertisingId;
        MessageDigest zzF = zzlb.zzF();
        if (zzF == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, zzF.digest(str2.getBytes()))});
    }
}
