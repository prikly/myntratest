package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbpb implements zzfxt {
    public static final /* synthetic */ zzbpb zza = new zzbpb();

    private /* synthetic */ zzbpb() {
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbqd zzbqd = zzbqc.zza;
        if (!((Boolean) zzbky.zzk.zze()).booleanValue()) {
            return "failure_click_attok";
        }
        zzt.zzo().zzu(th, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}
