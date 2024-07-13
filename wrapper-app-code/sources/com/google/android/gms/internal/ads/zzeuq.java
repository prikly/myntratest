package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeuq implements zzgdy {
    public static final /* synthetic */ zzeuq zza = new zzeuq();

    private /* synthetic */ zzeuq() {
    }

    public final zzgfb zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzger.zzi(new zzeut((String) null, -1));
        }
        return zzger.zzi(new zzeut(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
