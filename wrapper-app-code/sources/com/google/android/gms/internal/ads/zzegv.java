package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzegv extends zzcbt {
    final /* synthetic */ zzegw zza;

    protected zzegv(zzegw zzegw) {
        this.zza = zzegw;
    }

    public final void zze(zzaz zzaz) {
        this.zza.zza.zze(zzaz.zza());
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
