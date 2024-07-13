package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfkm implements zzdeq {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzchb zzc;

    public zzfkm(Context context, zzchb zzchb) {
        this.zzb = context;
        this.zzc = zzchb;
    }

    public final synchronized void zza(zze zze) {
        if (zze.zza != 3) {
            this.zzc.zzi(this.zza);
        }
    }

    public final Bundle zzb() {
        return this.zzc.zzk(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }
}
