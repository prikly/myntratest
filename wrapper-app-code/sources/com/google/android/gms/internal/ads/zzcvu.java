package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcvu implements zzcve {
    private final CookieManager zza;

    public zzcvu(Context context) {
        this.zza = zzt.zzq().zzb(context);
    }

    public final void zza(Map map) {
        if (this.zza != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) zzba.zzc().zzb(zzbjj.zzaH);
                String cookie = this.zza.getCookie(str);
                if (cookie != null) {
                    List zzf = zzfyr.zzc(zzfxq.zzc(';')).zzf(cookie);
                    int i = 0;
                    while (i < zzf.size()) {
                        CookieManager cookieManager = this.zza;
                        Iterator it = zzfyr.zzc(zzfxq.zzc('=')).zzd((String) zzf.get(i)).iterator();
                        if (it == null) {
                            throw null;
                        } else if (it.hasNext()) {
                            cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) zzba.zzc().zzb(zzbjj.zzau))));
                            i++;
                        } else {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (" + 0 + ")");
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get("cookie");
            if (!TextUtils.isEmpty(str2)) {
                this.zza.setCookie((String) zzba.zzc().zzb(zzbjj.zzaH), str2);
            }
        }
    }
}
