package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzdpa implements zzbqd {
    private final WeakReference zza;

    /* synthetic */ zzdpa(zzdpf zzdpf, zzdoz zzdoz) {
        this.zza = new WeakReference(zzdpf);
    }

    public final void zza(Object obj, Map map) {
        zzdpf zzdpf = (zzdpf) this.zza.get();
        if (zzdpf != null && "_ac".equals((String) map.get("eventName"))) {
            zzdpf.zzh.onAdClicked();
            if (((Boolean) zzba.zzc().zzb(zzbjj.zziW)).booleanValue()) {
                zzdpf.zzi.zzq();
                if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    zzdpf.zzi.zzr();
                }
            }
        }
    }
}
