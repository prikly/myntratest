package ms.bd.o.Pgl;

import android.content.Context;
import ms.bd.o.Pgl.pblb;

final class f extends pblb.pgla {
    f() {
    }

    public Object a(int i, long j, String str, Object obj) throws Throwable {
        Context b2 = pgla.a().b();
        try {
            return b2.getPackageManager().getPackageInfo(b2.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }
}
