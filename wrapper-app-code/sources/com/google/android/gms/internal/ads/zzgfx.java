package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgfx {
    private final InputStream zza;

    private zzgfx(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgfx zzb(byte[] bArr) {
        return new zzgfx(new ByteArrayInputStream(bArr));
    }

    public final zzgtj zza() throws IOException {
        try {
            return zzgtj.zzf(this.zza, zzgxp.zza());
        } finally {
            this.zza.close();
        }
    }
}
