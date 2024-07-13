package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzalp extends zzhea implements Closeable {
    private static final zzheh zza = zzheh.zzb(zzalp.class);

    public zzalp(zzheb zzheb, zzalo zzalo) throws IOException {
        zzf(zzheb, zzheb.zzc(), zzalo);
    }

    public final void close() throws IOException {
    }

    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
