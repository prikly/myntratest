package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbjy {
    private final List zza = new LinkedList();
    private final Map zzb = new LinkedHashMap();
    private final Object zzc = new Object();

    public zzbjy(boolean z, String str, String str2) {
        this.zzb.put("action", "make_wv");
        this.zzb.put("ad_format", str2);
    }

    public static final zzbjv zzf() {
        return new zzbjv(zzt.zzB().elapsedRealtime(), (String) null, (zzbjv) null);
    }

    public final zzbjx zza() {
        zzbjx zzbjx;
        boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbjj.zzbF)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbjv zzbjv : this.zza) {
                long zza2 = zzbjv.zza();
                String zzc2 = zzbjv.zzc();
                zzbjv zzb2 = zzbjv.zzb();
                if (zzb2 != null && zza2 > 0) {
                    sb.append(zzc2);
                    sb.append('.');
                    sb.append(zza2 - zzb2.zza());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb2.zza()))) {
                            hashMap.put(Long.valueOf(zzb2.zza()), new StringBuilder(zzc2));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb2.zza()));
                            sb2.append('+');
                            sb2.append(zzc2);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(zzt.zzB().currentTimeMillis() + (((Long) entry.getKey()).longValue() - zzt.zzB().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbjx = new zzbjx(sb.toString(), str);
        }
        return zzbjx;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            zzt.zzo().zzf();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbjy zzbjy) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbjo zzf;
        if (!TextUtils.isEmpty(str2) && (zzf = zzt.zzo().zzf()) != null) {
            synchronized (this.zzc) {
                zzbju zza2 = zzf.zza(str);
                Map map = this.zzb;
                map.put(str, zza2.zza((String) map.get(str), str2));
            }
        }
    }

    public final boolean zze(zzbjv zzbjv, long j, String... strArr) {
        synchronized (this.zzc) {
            for (int i = 0; i <= 0; i++) {
                this.zza.add(new zzbjv(j, strArr[i], zzbjv));
            }
        }
        return true;
    }
}
