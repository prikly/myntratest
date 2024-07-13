package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbpd implements zzfxt {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzbpd(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        String str = this.zza;
        Throwable th = (Throwable) obj;
        zzbqd zzbqd = zzbqc.zza;
        if (((Boolean) zzbky.zzk.zze()).booleanValue()) {
            zzt.zzo().zzu(th, "prepareClickUrl.attestation2");
        }
        return str;
    }
}
