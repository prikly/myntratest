package ms.bd.o.Pgl;

import com.applovin.exoplayer2.common.base.Ascii;

public class z0 {
    static {
        String str = (String) pblk.a(16777217, 0, 0, "1772ea", new byte[]{Ascii.ESC, 105, 5, Ascii.CAN, 103});
    }

    public static String a(String str) {
        return (str == null || str.length() <= 0) ? "" : str.trim().replace('\'', ' ').replace('\"', ' ').replace(13, ' ').replace(10, ' ');
    }
}
