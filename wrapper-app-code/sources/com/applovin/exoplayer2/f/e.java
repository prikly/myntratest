package com.applovin.exoplayer2.f;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private long f12526a;

    /* renamed from: b  reason: collision with root package name */
    private long f12527b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12528c;

    e() {
    }

    private long a(long j) {
        return this.f12526a + Math.max(0, ((this.f12527b - 529) * 1000000) / j);
    }

    public long a(v vVar) {
        return a((long) vVar.z);
    }

    public long a(v vVar, g gVar) {
        if (this.f12527b == 0) {
            this.f12526a = gVar.f11421d;
        }
        if (this.f12528c) {
            return gVar.f11421d;
        }
        ByteBuffer byteBuffer = (ByteBuffer) a.b(gVar.f11419b);
        byte b2 = 0;
        for (int i = 0; i < 4; i++) {
            b2 = (b2 << 8) | (byteBuffer.get(i) & 255);
        }
        int b3 = r.b(b2);
        if (b3 == -1) {
            this.f12528c = true;
            this.f12527b = 0;
            this.f12526a = gVar.f11421d;
            q.c("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gVar.f11421d;
        }
        long a2 = a((long) vVar.z);
        this.f12527b += (long) b3;
        return a2;
    }

    public void a() {
        this.f12526a = 0;
        this.f12527b = 0;
        this.f12528c = false;
    }
}
