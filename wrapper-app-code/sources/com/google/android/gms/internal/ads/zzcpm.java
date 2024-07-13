package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcpm {
    private final zzchu zza;
    private final Context zzb;
    private final WeakReference zzc;

    /* synthetic */ zzcpm(zzcpk zzcpk, zzcpl zzcpl) {
        this.zza = zzcpk.zza;
        this.zzb = zzcpk.zzb;
        this.zzc = zzcpk.zzc;
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzb;
    }

    public final zzapj zzb() {
        return new zzapj(new zzi(this.zzb, this.zza));
    }

    /* access modifiers changed from: package-private */
    public final zzbls zzc() {
        return new zzbls(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final zzchu zzd() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final String zze() {
        return zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    /* access modifiers changed from: package-private */
    public final WeakReference zzf() {
        return this.zzc;
    }
}
