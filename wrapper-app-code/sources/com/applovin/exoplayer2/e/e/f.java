package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.e.i;
import java.io.IOException;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final long[] f11944a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11945b = new byte[8];

    /* renamed from: c  reason: collision with root package name */
    private int f11946c;

    /* renamed from: d  reason: collision with root package name */
    private int f11947d;

    public static int a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = f11944a;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f11944a[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public long a(i iVar, boolean z, boolean z2, int i) throws IOException {
        if (this.f11946c == 0) {
            if (!iVar.a(this.f11945b, 0, 1, z)) {
                return -1;
            }
            int a2 = a(this.f11945b[0] & 255);
            this.f11947d = a2;
            if (a2 != -1) {
                this.f11946c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f11947d;
        if (i2 > i) {
            this.f11946c = 0;
            return -2;
        }
        if (i2 != 1) {
            iVar.b(this.f11945b, 1, i2 - 1);
        }
        this.f11946c = 0;
        return a(this.f11945b, this.f11947d, z2);
    }

    public void a() {
        this.f11946c = 0;
        this.f11947d = 0;
    }

    public int b() {
        return this.f11947d;
    }
}
