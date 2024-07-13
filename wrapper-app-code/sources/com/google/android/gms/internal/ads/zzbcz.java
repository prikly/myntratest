package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbcz implements Comparator {
    zzbcz(zzbdb zzbdb) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbdf zzbdf = (zzbdf) obj;
        zzbdf zzbdf2 = (zzbdf) obj2;
        int i = zzbdf.zzc - zzbdf2.zzc;
        if (i != 0) {
            return i;
        }
        return (zzbdf.zza > zzbdf2.zza ? 1 : (zzbdf.zza == zzbdf2.zza ? 0 : -1));
    }
}
