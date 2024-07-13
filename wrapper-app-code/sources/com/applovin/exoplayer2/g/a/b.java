package com.applovin.exoplayer2.g.a;

import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.d;
import com.applovin.exoplayer2.g.g;
import com.applovin.exoplayer2.l.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class b extends g {
    private static a a(x xVar) {
        xVar.b(12);
        int c2 = (xVar.c() + xVar.c(12)) - 4;
        xVar.b(44);
        xVar.e(xVar.c(12));
        xVar.b(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (xVar.c() >= c2) {
                break;
            }
            xVar.b(48);
            int c3 = xVar.c(8);
            xVar.b(4);
            int c4 = xVar.c() + xVar.c(12);
            String str2 = null;
            while (xVar.c() < c4) {
                int c5 = xVar.c(8);
                int c6 = xVar.c(8);
                int c7 = xVar.c() + c6;
                if (c5 == 2) {
                    int c8 = xVar.c(16);
                    xVar.b(8);
                    if (c8 != 3) {
                    }
                    while (xVar.c() < c7) {
                        str = xVar.a(xVar.c(8), Charsets.US_ASCII);
                        int c9 = xVar.c(8);
                        for (int i = 0; i < c9; i++) {
                            xVar.e(xVar.c(8));
                        }
                    }
                } else if (c5 == 21) {
                    str2 = xVar.a(c6, Charsets.US_ASCII);
                }
                xVar.a(c7 * 8);
            }
            xVar.a(c4 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new a(c3, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new a((List<? extends a.C0122a>) arrayList);
    }

    /* access modifiers changed from: protected */
    public a a(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return a(new x(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
