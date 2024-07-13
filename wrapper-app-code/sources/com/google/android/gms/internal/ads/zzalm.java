package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzalm extends ThreadLocal {
    zzalm(zzaln zzaln) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
