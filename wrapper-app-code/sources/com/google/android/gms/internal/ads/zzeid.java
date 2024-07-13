package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeid implements zzfmm {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfol zzc;
    private final zzfow zzd;

    public zzeid(String str, zzfow zzfow, zzfol zzfol) {
        this.zzb = str;
        this.zzd = zzfow;
        this.zzc = zzfol;
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzede zzede;
        String str;
        zzeic zzeic = (zzeic) obj;
        int optInt = zzeic.zza.optInt("http_timeout_millis", 60000);
        zzcce zza2 = zzeic.zzb;
        String str2 = "";
        if (zza2.zza() == -2) {
            HashMap hashMap = new HashMap();
            if (zzeic.zzb.zzh() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) zzba.zzc().zzb(zzbjj.zzaI)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = str2;
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = str2;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", this.zzb);
                }
            }
            if (zzeic.zzb.zzi()) {
                zzeie.zza(hashMap, zzeic.zza);
            }
            if (zzeic.zzb != null && !TextUtils.isEmpty(zzeic.zzb.zzd())) {
                str2 = zzeic.zzb.zzd();
            }
            zzfow zzfow = this.zzd;
            zzfol zzfol = this.zzc;
            zzfol.zzf(true);
            zzfow.zza(zzfol);
            return new zzehy(zzeic.zzb.zze(), optInt, hashMap, str2.getBytes(zzfxr.zzc), "", zzeic.zzb.zzi());
        }
        if (zza2.zza() == 1) {
            if (zza2.zzf() != null) {
                str2 = TextUtils.join(", ", zza2.zzf());
                zze.zzg(str2);
            }
            zzede = new zzede(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzede = new zzede(1);
        }
        zzfow zzfow2 = this.zzd;
        zzfol zzfol2 = this.zzc;
        zzfol2.zzg(zzede);
        zzfol2.zzf(false);
        zzfow2.zza(zzfol2);
        throw zzede;
    }
}
