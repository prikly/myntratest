package com.applovin.exoplayer2.g;

import com.applovin.exoplayer2.l.a;
import java.nio.ByteBuffer;

public abstract class g implements b {
    public final a a(d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a.b(dVar.f11419b);
        a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.b()) {
            return null;
        }
        return a(dVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public abstract a a(d dVar, ByteBuffer byteBuffer);
}
