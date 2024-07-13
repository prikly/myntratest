package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzarz implements PackageManager.OnChecksumsReadyListener {
    public final /* synthetic */ zzgfk zza;

    public /* synthetic */ zzarz(zzgfk zzgfk) {
        this.zza = zzgfk;
    }

    public final void onChecksumsReady(List list) {
        zzgfk zzgfk = this.zza;
        if (list == null) {
            zzgfk.zzd((Object) null);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    zzgfk.zzd(zzaqn.zzc(apkChecksum.getValue()));
                    return;
                }
            }
            zzgfk.zzd((Object) null);
        } catch (Throwable unused) {
            zzgfk.zzd((Object) null);
        }
    }
}
