package ms.bd.o.Pgl;

import android.content.Context;
import ms.bd.o.Pgl.pblb;

final class e extends pblb.pgla {
    e() {
    }

    public Object a(int i, long j, String str, Object obj) throws Throwable {
        int i2;
        Context b2 = pgla.a().b();
        try {
            i2 = b2.getPackageManager().getPackageInfo(b2.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            i2 = -1;
        }
        return Integer.valueOf(i2);
    }
}
