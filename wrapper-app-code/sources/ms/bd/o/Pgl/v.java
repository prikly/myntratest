package ms.bd.o.Pgl;

import android.content.Context;
import android.content.Intent;
import ms.bd.o.Pgl.pblb;

final class v extends pblb.pgla {
    v() {
    }

    public Object a(int i, long j, String str, Object obj) throws Throwable {
        Context b2 = pgla.a().b();
        String[] strArr = (String[]) obj;
        if (b2 == null || str == null || strArr == null || strArr.length % 2 != 0) {
            return null;
        }
        Intent intent = new Intent(str);
        intent.setPackage(b2.getPackageName());
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            intent.putExtra(strArr[i2], strArr[i2 + 1]);
        }
        b2.sendBroadcast(intent);
        return null;
    }
}
