package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeml implements zzekq {
    private final Context zza;
    private final zzdnw zzb;
    private final Executor zzc;
    private final zzfik zzd;

    public zzeml(Context context, Executor executor, zzdnw zzdnw, zzfik zzfik) {
        this.zza = context;
        this.zzb = zzdnw;
        this.zzc = executor;
        this.zzd = zzfik;
    }

    private static String zzd(zzfil zzfil) {
        try {
            return zzfil.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        String zzd2 = zzd(zzfil);
        return zzger.zzn(zzger.zzi((Object) null), new zzemj(this, zzd2 != null ? Uri.parse(zzd2) : null, zzfix, zzfil), this.zzc);
    }

    public final boolean zzb(zzfix zzfix, zzfil zzfil) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbkh.zzg(context) && !TextUtils.isEmpty(zzd(zzfil));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(Uri uri, zzfix zzfix, zzfil zzfil, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            zzc zzc2 = new zzc(build.intent, (zzx) null);
            zzcig zzcig = new zzcig();
            zzdmw zze = this.zzb.zze(new zzdbc(zzfix, zzfil, (String) null), new zzdmz(new zzemk(zzcig), (zzcno) null));
            zzcig.zzd(new AdOverlayInfoParcel(zzc2, (zza) null, zze.zza(), (zzz) null, new zzchu(0, 0, false, false, false), (zzcno) null, (zzdmc) null));
            this.zzd.zza();
            return zzger.zzi(zze.zzg());
        } catch (Throwable th) {
            zze.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
