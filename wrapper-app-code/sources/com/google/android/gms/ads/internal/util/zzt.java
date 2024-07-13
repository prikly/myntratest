package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzcno;
import com.google.android.gms.internal.ads.zzcnv;
import com.google.android.gms.internal.ads.zzcos;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzt extends zzaa {
    public zzt() {
        super((zzz) null);
    }

    public final int zza() {
        return 16974374;
    }

    public final CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzs.zzB()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zze.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    public final zzcnv zzd(zzcno zzcno, zzbew zzbew, boolean z) {
        return new zzcos(zzcno, zzbew, z);
    }
}
