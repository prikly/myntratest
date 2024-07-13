package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.Arrays;

public interface x {

    /* renamed from: com.applovin.exoplayer2.e.x$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$a(x xVar, g gVar, int i, boolean z) throws IOException {
            return xVar.a(gVar, i, z, 0);
        }

        public static void $default$a(x xVar, y yVar, int i) {
            xVar.a(yVar, i, 0);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12459a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f12460b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12461c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12462d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.f12459a = i;
            this.f12460b = bArr;
            this.f12461c = i2;
            this.f12462d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12459a == aVar.f12459a && this.f12461c == aVar.f12461c && this.f12462d == aVar.f12462d && Arrays.equals(this.f12460b, aVar.f12460b);
        }

        public int hashCode() {
            return (((((this.f12459a * 31) + Arrays.hashCode(this.f12460b)) * 31) + this.f12461c) * 31) + this.f12462d;
        }
    }

    int a(g gVar, int i, boolean z) throws IOException;

    int a(g gVar, int i, boolean z, int i2) throws IOException;

    void a(long j, int i, int i2, int i3, a aVar);

    void a(y yVar, int i);

    void a(y yVar, int i, int i2);

    void a(v vVar);
}
