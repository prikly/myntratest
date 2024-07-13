package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.e.g;
import com.applovin.exoplayer2.l.y;
import java.io.EOFException;
import java.io.IOException;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final y f12446a = new y(10);

    public a a(i iVar, g.a aVar) throws IOException {
        a aVar2 = null;
        int i = 0;
        while (true) {
            try {
                iVar.d(this.f12446a.d(), 0, 10);
                this.f12446a.d(0);
                if (this.f12446a.m() != 4801587) {
                    break;
                }
                this.f12446a.e(3);
                int v = this.f12446a.v();
                int i2 = v + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f12446a.d(), 0, bArr, 0, 10);
                    iVar.d(bArr, 10, v);
                    aVar2 = new g(aVar).a(bArr, i2);
                } else {
                    iVar.c(v);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        iVar.a();
        iVar.c(i);
        return aVar2;
    }
}
