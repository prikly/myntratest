package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbep extends PushbackInputStream {
    final /* synthetic */ zzbeq zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbep(zzbeq zzbeq, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzbeq;
    }

    public final synchronized void close() throws IOException {
        zzbes.zze(this.zza.zzc);
        super.close();
    }
}
