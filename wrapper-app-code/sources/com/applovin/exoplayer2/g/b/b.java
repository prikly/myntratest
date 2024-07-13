package com.applovin.exoplayer2.g.b;

import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.d;
import com.applovin.exoplayer2.g.g;
import com.applovin.exoplayer2.l.y;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class b extends g {
    /* access modifiers changed from: protected */
    public a a(d dVar, ByteBuffer byteBuffer) {
        return new a(a(new y(byteBuffer.array(), byteBuffer.limit())));
    }

    public a a(y yVar) {
        return new a((String) com.applovin.exoplayer2.l.a.b(yVar.B()), (String) com.applovin.exoplayer2.l.a.b(yVar.B()), yVar.s(), yVar.s(), Arrays.copyOfRange(yVar.d(), yVar.c(), yVar.b()));
    }
}
