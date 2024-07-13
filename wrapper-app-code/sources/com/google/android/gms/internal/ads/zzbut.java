package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbut {
    static final zzbb zza = new zzbur();
    static final zzbb zzb = new zzbus();
    private final zzbuf zzc;

    public zzbut(Context context, zzchu zzchu, String str, zzfoy zzfoy) {
        this.zzc = new zzbuf(context, zzchu, str, zza, zzb, zzfoy);
    }

    public final zzbuj zza(String str, zzbum zzbum, zzbul zzbul) {
        return new zzbux(this.zzc, str, zzbum, zzbul);
    }

    public final zzbvc zzb() {
        return new zzbvc(this.zzc);
    }
}
