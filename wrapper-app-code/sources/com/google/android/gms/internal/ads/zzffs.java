package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzffs implements zzfxt {
    final /* synthetic */ zzffw zza;

    zzffs(zzffw zzffw) {
        this.zza = zzffw;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcho.zzh("", (zzefg) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzffw zzffw = this.zza;
        zzffw.zzd = new zzffv((zzccb) null, zzffw.zze(), (zzffu) null);
        return this.zza.zzd;
    }
}
