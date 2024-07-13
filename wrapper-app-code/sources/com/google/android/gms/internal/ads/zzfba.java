package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfba implements zzgdy {
    public static final /* synthetic */ zzfba zza = new zzfba();

    private /* synthetic */ zzfba() {
    }

    public final zzgfb zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzger.zzi(new zzfbd((String) null, -1));
        }
        return zzger.zzi(new zzfbd(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
