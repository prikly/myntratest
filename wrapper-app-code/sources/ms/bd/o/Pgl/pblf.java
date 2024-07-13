package ms.bd.o.Pgl;

import com.applovin.exoplayer2.common.base.Ascii;
import ms.bd.o.Pgl.pblb;

final class pblf extends pblb.pgla {
    pblf() {
    }

    public Object a(int i, long j, String str, Object obj) throws Throwable {
        boolean z;
        try {
            z = pblj.b(pgla.a().b(), str, obj.toString());
        } catch (Throwable unused) {
            String str2 = (String) pblk.a(16777217, 0, 0, "9c0de9", new byte[]{47, 96, 69});
            z = false;
        }
        if (z) {
            return (String) pblk.a(16777217, 0, 0, "b967ac", new byte[]{92, Ascii.DLE});
        }
        return null;
    }
}
