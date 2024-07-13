package ms.bd.o.Pgl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.Method;
import ms.bd.o.Pgl.pblb;

final class w extends pblb.pgla {
    w() {
    }

    /* access modifiers changed from: protected */
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        Context b2 = pgla.a().b();
        if (b2 != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) b2.getSystemService((String) pblk.a(16777217, 0, 0, "6b685f", new byte[]{36, 111, 75, 66, Ascii.SI, 114, 33, 74, 113, 97, 51, 121}));
                Class<?> cls = connectivityManager.getClass();
                Method declaredMethod = cls.getDeclaredMethod((String) pblk.a(16777217, 0, 0, "517402", new byte[]{35, 54, 80, 97, Ascii.FF, 49, 63, 6, 99, 74, 33, 39, 83, 79, Ascii.GS, 46, Ascii.US, Ascii.RS, 96, 107}), new Class[0]);
                declaredMethod.setAccessible(true);
                NetworkInfo networkInfo = (NetworkInfo) declaredMethod.invoke(connectivityManager, new Object[0]);
                if (networkInfo != null) {
                    Method declaredMethod2 = networkInfo.getClass().getDeclaredMethod((String) pblk.a(16777217, 0, 0, "e35ca4", new byte[]{125, 34, 103, 1, 95, 42, 106, 19, 102, 63, 113}), new Class[0]);
                    declaredMethod2.setAccessible(true);
                    return Boolean.valueOf(((Boolean) declaredMethod2.invoke(networkInfo, new Object[0])).booleanValue());
                }
            } catch (Throwable unused) {
            }
        }
        return Boolean.FALSE;
    }
}
