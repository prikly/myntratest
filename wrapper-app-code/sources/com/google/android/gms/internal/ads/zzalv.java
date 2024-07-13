package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzalv extends zzhdw {
    ByteBuffer zza;

    public zzalv(String str) {
        super(str);
    }

    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
