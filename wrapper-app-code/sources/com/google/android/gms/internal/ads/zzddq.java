package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzddq implements zzdfi, zzdgb {
    private final Context zza;
    private final zzfil zzb;
    private final zzbzv zzc;

    public zzddq(Context context, zzfil zzfil, zzbzv zzbzv, byte[] bArr) {
        this.zza = context;
        this.zzb = zzfil;
        this.zzc = zzbzv;
    }

    public final void zzbr(Context context) {
    }

    public final void zzbt(Context context) {
    }

    public final void zzbu(Context context) {
    }

    public final void zzn() {
        zzbzw zzbzw = this.zzb.zzae;
        if (zzbzw != null && zzbzw.zza) {
            ArrayList arrayList = new ArrayList();
            if (!this.zzb.zzae.zzb.isEmpty()) {
                arrayList.add(this.zzb.zzae.zzb);
            }
        }
    }
}
