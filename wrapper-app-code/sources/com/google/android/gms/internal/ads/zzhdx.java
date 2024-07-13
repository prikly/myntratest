package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzhdx extends zzhea implements zzalr {
    zzals zza;
    protected final String zzb = "moov";

    public zzhdx(String str) {
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb(zzheb zzheb, ByteBuffer byteBuffer, long j, zzalo zzalo) throws IOException {
        zzheb.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzheb;
        this.zzf = zzheb.zzb();
        zzheb.zze(zzheb.zzb() + j);
        this.zzg = zzheb.zzb();
        this.zzc = zzalo;
    }

    public final void zzc(zzals zzals) {
        this.zza = zzals;
    }
}
