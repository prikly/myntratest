package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfah implements zzezm {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcgo zzd;

    public zzfah(zzcgo zzcgo, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.zzd = zzcgo;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    public final int zza() {
        return 41;
    }

    public final zzgfb zzb() {
        return zzger.zzg(zzger.zzm(zzger.zzi(this.zzb), zzfaf.zza, this.zza), Throwable.class, new zzfag(this), this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(Throwable th) throws Exception {
        return zzger.zzi(new zzfai(this.zzb));
    }
}
