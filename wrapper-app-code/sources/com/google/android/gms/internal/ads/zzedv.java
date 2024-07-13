package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzedv implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;

    public zzedv(zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager((Context) this.zza.zzb()).getPackageInfo(((zzedq) this.zzb).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
