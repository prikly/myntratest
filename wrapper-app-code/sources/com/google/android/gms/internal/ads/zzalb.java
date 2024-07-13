package com.google.android.gms.internal.ads;

import com.appodeal.ads.adapters.admob.BuildConfig;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzalb {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e2) {
            if (BuildConfig.ADAPTER_VERSION.equals(str) || "-1".equals(str)) {
                zzakq.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            zzakq.zzc(e2, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static zzajn zzb(zzaka zzaka) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        zzaka zzaka2 = zzaka;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzaka2.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long zza = str != null ? zza(str) : 0;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = (String) map.get("Expires");
        long zza2 = str3 != null ? zza(str3) : 0;
        String str4 = (String) map.get("Last-Modified");
        long zza3 = str4 != null ? zza(str4) : 0;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (zza <= 0 || zza2 < zza) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (zza2 - zza);
                j3 = j4;
            }
        }
        zzajn zzajn = new zzajn();
        zzajn.zza = zzaka2.zzb;
        zzajn.zzb = str5;
        zzajn.zzf = j4;
        zzajn.zze = j3;
        zzajn.zzc = zza;
        zzajn.zzd = zza3;
        zzajn.zzg = map;
        zzajn.zzh = zzaka2.zzd;
        return zzajn;
    }

    static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
