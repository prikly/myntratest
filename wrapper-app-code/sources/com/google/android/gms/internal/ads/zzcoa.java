package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcoa {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzcno, java.lang.Object] */
    public static final zzcno zza(Context context, zzcpd zzcpd, String str, boolean z, boolean z2, zzapj zzapj, zzbki zzbki, zzchu zzchu, zzbjy zzbjy, zzl zzl, zza zza, zzbew zzbew, zzfil zzfil, zzfio zzfio) throws zzcnz {
        StrictMode.ThreadPolicy threadPolicy;
        zzbjj.zzc(context);
        try {
            zzcnw zzcnw = new zzcnw(context, zzcpd, str, z, z2, zzapj, zzbki, zzchu, (zzbjy) null, zzl, zza, zzbew, zzfil, zzfio);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ? zza2 = zzcnw.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza2;
        } catch (Throwable th) {
            throw new zzcnz("Webview initialization failed.", th);
        }
    }
}
