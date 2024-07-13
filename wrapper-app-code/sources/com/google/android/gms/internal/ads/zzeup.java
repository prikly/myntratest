package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeup implements zzfxt {
    public static final /* synthetic */ zzeup zza = new zzeup();

    private /* synthetic */ zzeup() {
    }

    public final Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzeut(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
