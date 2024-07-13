package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzhfd;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzn implements zzbkf {
    final /* synthetic */ zzbkh zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    zzn(zzs zzs, zzbkh zzbkh, Context context, Uri uri) {
        this.zza = zzbkh;
        this.zzb = context;
        this.zzc = uri;
    }

    public final void zza() {
        CustomTabsIntent build = new CustomTabsIntent.Builder(this.zza.zza()).build();
        build.intent.setPackage(zzhfd.zza(this.zzb));
        build.launchUrl(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
