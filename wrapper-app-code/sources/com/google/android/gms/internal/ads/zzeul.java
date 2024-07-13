package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeul implements zzfxt {
    public static final /* synthetic */ zzeul zza = new zzeul();

    private /* synthetic */ zzeul() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzeum(arrayList);
    }
}
