package ms.bd.o.Pgl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Map;
import ms.bd.o.Pgl.pblb;
import org.json.JSONException;
import org.json.JSONObject;

final class pblh extends pblb.pgla {
    pblh() {
    }

    public Object a(int i, long j, String str, Object obj) throws Throwable {
        String str2;
        Context b2 = pgla.a().b();
        ApplicationInfo applicationInfo = b2.getPackageManager().getApplicationInfo(b2.getPackageName(), 0);
        String str3 = applicationInfo.sourceDir;
        if (str3 == null) {
            str3 = applicationInfo.publicSourceDir;
        }
        Map<Integer, String> a2 = pbly.a(str3);
        String str4 = "";
        String str5 = (a2 == null || !a2.containsKey(1903654775)) ? str4 : a2.get(1903654775);
        if (str5 != null && str5.length() > 0) {
            JSONObject jSONObject = new JSONObject(str5);
            try {
                str2 = jSONObject.getString((String) pblk.a(16777217, 0, 0, "3421e0", new byte[]{47, 51, 85, 68, 101, 50, 61, Ascii.DLE, 109, 102, Ascii.GS, 53, 73, 68, 84, 41, 53, Ascii.EM}));
            } catch (JSONException unused) {
                str2 = str4;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append((String) pblk.a(16777217, 0, 0, "1546a2", new byte[]{123}));
            try {
                str4 = jSONObject.getString((String) pblk.a(16777217, 0, 0, "6e2369", new byte[]{53, 98, 77, 66, 8, 61, 48, 123, 97, 118, 46, 107, 69}));
            } catch (JSONException unused2) {
            }
            sb.append(str4);
            str4 = sb.toString();
        }
        return str4.length() == 0 ? (String) pblk.a(16777217, 0, 0, "1a3a77", new byte[]{Ascii.SO, 108, 78, Ascii.DLE}) : str4;
    }
}