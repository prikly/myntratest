package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzcor extends zzcnv {
    public zzcor(zzcno zzcno, zzbew zzbew, boolean z) {
        super(zzcno, zzbew, z);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zzN(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcno)) {
            zze.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcno zzcno = (zzcno) webView;
        zzcep zzcep = this.zza;
        if (zzcep != null) {
            zzcep.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcno.zzP() != null) {
            zzcno.zzP().zzE();
        }
        if (zzcno.zzQ().zzi()) {
            str2 = (String) zzba.zzc().zzb(zzbjj.zzM);
        } else if (zzcno.zzaC()) {
            str2 = (String) zzba.zzc().zzb(zzbjj.zzL);
        } else {
            str2 = (String) zzba.zzc().zzb(zzbjj.zzK);
        }
        zzt.zzp();
        return zzs.zzu(zzcno.getContext(), zzcno.zzp().zza, str2);
    }
}
