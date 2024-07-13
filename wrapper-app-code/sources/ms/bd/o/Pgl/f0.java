package ms.bd.o.Pgl;

import android.content.Context;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.Method;
import ms.bd.o.Pgl.pblb;

final class f0 extends pblb.pgla {
    f0() {
    }

    public Object a(int i, long j, String str, Object obj) throws Throwable {
        double d2;
        Context b2 = pgla.a().b();
        try {
            Class<?> cls = Class.forName(new String(pblz.a((String) pblk.a(16777217, 0, 0, "f65904", new byte[]{33, 103, Ascii.DLE, 75, 89, 39, 55, Ascii.DC2, 50, 56, 33, 49, Ascii.DLE, Ascii.EM, 88, 113, 51, 17, 50, 48, 33, 96, Ascii.DC4, 72, 89, 122, 51, Ascii.DC2, 51, 61, 33, 97, 17, Ascii.US, 89, 38, 51, 70, 50, 106, 37, 49, Ascii.DLE, 75, 88, 112, 55, Ascii.DC2, 49, 57, 33, 50, 17, Ascii.SUB, 89, 118, 50, 69, 49, 57, 32, 102, Ascii.DLE, 75, 89, 117, 51, 78, 50, 106, 33, 97}))));
            Object newInstance = cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{b2});
            Method declaredMethod = cls.getDeclaredMethod(new String(pblz.a((String) pblk.a(16777217, 0, 0, "db84f7", new byte[]{35, 55, Ascii.GS, Ascii.NAK, Ascii.SO, 116, 51, Ascii.DC2, 62, 50, 35, 53, Ascii.FS, Ascii.DC2, Ascii.SI, 113, 49, Ascii.DC4, 63, 49, 32, 48, Ascii.GS, 70, Ascii.SO, 119, 49, Ascii.SYN, 62, 54}))), new Class[]{String.class});
            declaredMethod.setAccessible(true);
            Object[] objArr = new Object[1];
            objArr[0] = new String(pblz.a((String) pblk.a(16777217, 0, 0, "fdef88", new byte[]{33, 52, 64, 67, 80, 123, 50, 17, 98, 99, 32, 52, 65, 75, 85, 42, 51, Ascii.SYN, 98, 103, 32, 54, 64, 67, 81, 124, 51, Ascii.FS, 99, 98, 32, 63})));
            d2 = ((Double) declaredMethod.invoke(newInstance, objArr)).doubleValue();
        } catch (Throwable unused) {
            d2 = 0.0d;
        }
        return Integer.toString((int) d2);
    }
}
