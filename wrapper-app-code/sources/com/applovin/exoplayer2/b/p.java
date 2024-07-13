package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;

final class p extends l {

    /* renamed from: d  reason: collision with root package name */
    private static final int f11311d = Float.floatToIntBits(Float.NaN);

    p() {
    }

    private static void a(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == f11311d) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f11265b.f11231d;
        if (i2 == 536870912) {
            byteBuffer2 = a((i / 3) * 4);
            while (position < limit) {
                a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 2) & 255) << Ascii.CAN), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = a(i);
            while (position < limit) {
                a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 3) & 255) << Ascii.CAN), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public f.a b(f.a aVar) throws f.b {
        int i = aVar.f11231d;
        if (ai.e(i)) {
            return i != 4 ? new f.a(aVar.f11229b, aVar.f11230c, 4) : f.a.f11228a;
        }
        throw new f.b(aVar);
    }
}
