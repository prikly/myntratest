package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzedo implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;

    public zzedo(zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        CookieManager zzb2 = zzt.zzq().zzb((Context) this.zzb.zzb());
        zzfnd zzfnd = zzfnd.WEBVIEW_COOKIE;
        return zzfmt.zza(new zzedl(zzb2), zzfnd, (zzfnj) this.zza.zzb()).zzi(1, TimeUnit.SECONDS).zzc(Exception.class, new zzfmw(zzedm.zza)).zza();
    }
}
