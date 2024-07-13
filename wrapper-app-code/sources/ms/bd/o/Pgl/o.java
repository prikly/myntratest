package ms.bd.o.Pgl;

import android.telephony.TelephonyManager;
import com.applovin.exoplayer2.common.base.Ascii;
import ms.bd.o.Pgl.pblb;

final class o extends pblb.pgla {
    o() {
    }

    public Object a(int i, long j, String str, Object obj) throws Throwable {
        Boolean bool = Boolean.FALSE;
        TelephonyManager telephonyManager = (TelephonyManager) pgla.a().b().getApplicationContext().getSystemService((String) pblk.a(16777217, 0, 0, "9f4f2e", new byte[]{56, 108, 72, Ascii.FS, 8}));
        return (telephonyManager == null || telephonyManager.getSimState() != 5) ? bool : Boolean.TRUE;
    }
}
