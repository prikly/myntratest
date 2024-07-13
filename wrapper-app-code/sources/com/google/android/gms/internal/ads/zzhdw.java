package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzhdw implements zzalr {
    private static final zzheh zza = zzheh.zzb(zzhdw.class);
    protected final String zzb;
    boolean zzc;
    boolean zzd;
    long zze;
    long zzf = -1;
    zzheb zzg;
    private zzals zzh;
    private ByteBuffer zzi;
    private ByteBuffer zzj = null;

    protected zzhdw(String str) {
        this.zzb = str;
        this.zzd = true;
        this.zzc = true;
    }

    private final synchronized void zzd() {
        if (!this.zzd) {
            try {
                zzheh zzheh = zza;
                String str = this.zzb;
                zzheh.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzi = this.zzg.zzd(this.zze, this.zzf);
                this.zzd = true;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb(zzheb zzheb, ByteBuffer byteBuffer, long j, zzalo zzalo) throws IOException {
        this.zze = zzheb.zzb();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzheb;
        zzheb.zze(zzheb.zzb() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    public final void zzc(zzals zzals) {
        this.zzh = zzals;
    }

    /* access modifiers changed from: protected */
    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzheh zzheh = zza;
        String str = this.zzb;
        zzheh.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
