package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.EOFException;
import java.io.IOException;

public final class g implements x {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f11980a = new byte[4096];

    public /* synthetic */ int a(com.applovin.exoplayer2.k.g gVar, int i, boolean z) throws IOException {
        return x.CC.$default$a(this, gVar, i, z);
    }

    public int a(com.applovin.exoplayer2.k.g gVar, int i, boolean z, int i2) throws IOException {
        int a2 = gVar.a(this.f11980a, 0, Math.min(this.f11980a.length, i));
        if (a2 != -1) {
            return a2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void a(long j, int i, int i2, int i3, x.a aVar) {
    }

    public /* synthetic */ void a(y yVar, int i) {
        x.CC.$default$a(this, yVar, i);
    }

    public void a(y yVar, int i, int i2) {
        yVar.e(i);
    }

    public void a(v vVar) {
    }
}
