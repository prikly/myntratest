package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzali extends ByteArrayOutputStream {
    private final zzakv zza;

    public zzali(zzakv zzakv, int i) {
        this.zza = zzakv;
        this.buf = zzakv.zzb(Math.max(i, 256));
    }

    private final void zza(int i) {
        if (this.count + i > this.buf.length) {
            zzakv zzakv = this.zza;
            int i2 = this.count + i;
            byte[] zzb = zzakv.zzb(i2 + i2);
            System.arraycopy(this.buf, 0, zzb, 0, this.count);
            this.zza.zza(this.buf);
            this.buf = zzb;
        }
    }

    public final void close() throws IOException {
        this.zza.zza(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zza(this.buf);
    }

    public final synchronized void write(int i) {
        zza(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        zza(i2);
        super.write(bArr, i, i2);
    }
}
