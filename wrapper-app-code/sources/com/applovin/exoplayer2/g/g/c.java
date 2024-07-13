package com.applovin.exoplayer2.g.g;

import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.d;
import com.applovin.exoplayer2.g.g;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.nio.ByteBuffer;

public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private final y f12685a = new y();

    /* renamed from: b  reason: collision with root package name */
    private final x f12686b = new x();

    /* renamed from: c  reason: collision with root package name */
    private ag f12687c;

    /* access modifiers changed from: protected */
    public a a(d dVar, ByteBuffer byteBuffer) {
        if (this.f12687c == null || dVar.f12602f != this.f12687c.c()) {
            ag agVar = new ag(dVar.f11421d);
            this.f12687c = agVar;
            agVar.c(dVar.f11421d - dVar.f12602f);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f12685a.a(array, limit);
        this.f12686b.a(array, limit);
        this.f12686b.b(39);
        long c2 = (((long) this.f12686b.c(1)) << 32) | ((long) this.f12686b.c(32));
        this.f12686b.b(20);
        int c3 = this.f12686b.c(12);
        int c4 = this.f12686b.c(8);
        a.C0122a aVar = null;
        this.f12685a.e(14);
        if (c4 == 0) {
            aVar = new e();
        } else if (c4 == 255) {
            aVar = a.a(this.f12685a, c3, c2);
        } else if (c4 == 4) {
            aVar = f.a(this.f12685a);
        } else if (c4 == 5) {
            aVar = d.a(this.f12685a, c2, this.f12687c);
        } else if (c4 == 6) {
            aVar = g.a(this.f12685a, c2, this.f12687c);
        }
        if (aVar == null) {
            return new a(new a.C0122a[0]);
        }
        return new a(aVar);
    }
}
