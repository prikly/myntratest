package com.google.android.gms.internal.ads;

import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final /* synthetic */ class zzfus implements zzfuv {
    public final /* synthetic */ URL zza;

    public /* synthetic */ zzfus(URL url) {
        this.zza = url;
    }

    public final URLConnection zza() {
        return this.zza.openConnection();
    }
}
