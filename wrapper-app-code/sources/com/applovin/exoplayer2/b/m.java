package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.a;
import java.nio.ByteBuffer;

final class m extends l {

    /* renamed from: d  reason: collision with root package name */
    private int[] f11272d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f11273e;

    m() {
    }

    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) a.b(this.f11273e);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a2 = a(((limit - position) / this.f11265b.f11232e) * this.f11266c.f11232e);
        while (position < limit) {
            for (int i : iArr) {
                a2.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f11265b.f11232e;
        }
        byteBuffer.position(limit);
        a2.flip();
    }

    public void a(int[] iArr) {
        this.f11272d = iArr;
    }

    public f.a b(f.a aVar) throws f.b {
        int[] iArr = this.f11272d;
        if (iArr == null) {
            return f.a.f11228a;
        }
        if (aVar.f11231d == 2) {
            boolean z = aVar.f11230c != iArr.length;
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 < aVar.f11230c) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new f.b(aVar);
                }
            }
            return z ? new f.a(aVar.f11229b, iArr.length, 2) : f.a.f11228a;
        }
        throw new f.b(aVar);
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.f11273e = this.f11272d;
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.f11273e = null;
        this.f11272d = null;
    }
}
