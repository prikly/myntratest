package ms.bd.o.Pgl;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.Method;
import ms.bd.o.Pgl.pblb;

final class b0 extends pblb.pgla {
    b0() {
    }

    /* access modifiers changed from: protected */
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        String str2;
        try {
            WifiInfo connectionInfo = ((WifiManager) pgla.a().b().getApplicationContext().getSystemService((String) pblk.a(16777217, 0, 0, "da81a7", new byte[]{98, 106, 77, 76}))).getConnectionInfo();
            Class<?> cls = connectionInfo.getClass();
            Method declaredMethod = cls.getDeclaredMethod(new String(pblz.a((String) pblk.a(16777217, 0, 0, "6211fb", new byte[]{113, 103, Ascii.DC4, Ascii.DLE, Ascii.SO, 33, 97, 74, 55, 49, 115, 97, Ascii.DC4, 17, Ascii.SI, 33, 98, 65, 54, 52, 112, 99, Ascii.NAK, Ascii.SYN}))), new Class[0]);
            declaredMethod.setAccessible(true);
            str2 = Integer.toString(((Integer) declaredMethod.invoke(connectionInfo, new Object[0])).intValue());
        } catch (Throwable unused) {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2.trim();
        }
        return (String) pblk.a(16777217, 0, 0, "dd4a1c", new byte[]{37});
    }
}
