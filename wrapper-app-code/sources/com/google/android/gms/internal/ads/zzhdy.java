package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzhdy extends zzhdw implements zzalr {
    private int zza;

    protected zzhdy(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzalq.zzc(byteBuffer.get());
        zzalq.zzd(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
