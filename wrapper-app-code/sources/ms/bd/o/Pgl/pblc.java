package ms.bd.o.Pgl;

import android.content.Context;
import ms.bd.o.Pgl.pblb;

final class pblc extends pblb.pgla {
    pblc() {
    }

    public Object a(int i, long j, String str, Object obj) throws Throwable {
        try {
            Context b2 = pgla.a().b();
            return b2.getPackageManager().getPackageInfo(b2.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            String str2 = (String) pblk.a(16777217, 0, 0, "b2bafb", new byte[]{122, 57});
            return "";
        }
    }
}
