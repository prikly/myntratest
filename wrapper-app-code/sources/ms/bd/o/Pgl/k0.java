package ms.bd.o.Pgl;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ms.bd.o.Pgl.l0;
import org.json.JSONArray;

public final class k0 implements l0.pgla {

    /* renamed from: a  reason: collision with root package name */
    private final long f9697a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9698b;

    /* renamed from: c  reason: collision with root package name */
    private final c f9699c;

    k0(c cVar, Context context, long j) {
        if (context != null) {
            this.f9699c = cVar;
            this.f9698b = context.getApplicationContext();
            this.f9697a = j;
            return;
        }
        throw new NullPointerException("context could not be null");
    }

    public Map<String, String> frameSign(String str, int i) {
        if (this.f9697a == -1) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        if (str == null || str.length() == 0) {
            return Collections.emptyMap();
        }
        String[] strArr = (String[]) pblb.a(33554442, i, this.f9697a, str, (Object) null);
        if ((strArr instanceof String[]) && strArr.length % 2 == 0) {
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                String str2 = strArr[i2];
                String str3 = strArr[i2 + 1];
                if (!(str2 == null || str3 == null)) {
                    hashMap.put(str2, str3);
                }
            }
        }
        return hashMap;
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        String[] strArr;
        HashMap hashMap = new HashMap();
        if (!(str == null || str.length() == 0 || (strArr = (String[]) pblb.a(33554438, 0, this.f9697a, str, bArr)) == null || strArr.length % 2 != 0)) {
            for (int i = 0; i < strArr.length; i += 2) {
                String str2 = strArr[i];
                String str3 = strArr[i + 1];
                if (!(str2 == null || str3 == null)) {
                    hashMap.put(str2, str3);
                }
            }
        }
        return hashMap;
    }

    public Map<String, String> getReportRaw(String str, int i, Map<String, String> map) {
        String str2;
        if (this.f9697a != -1) {
            if (map == null || map.size() <= 0) {
                str2 = "";
            } else {
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry next : map.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) next.getKey()) && !TextUtils.isEmpty((CharSequence) next.getValue())) {
                        jSONArray.put(next.getKey());
                        jSONArray.put(next.getValue());
                    }
                }
                str2 = jSONArray.toString();
            }
            int i2 = i;
            Object a2 = pblb.a(33554440, i2, this.f9697a, str, str2);
            if (a2 instanceof Object[]) {
                Object[] objArr = (Object[]) a2;
                if (!(objArr.length < 2 || objArr[0] == null || objArr[1] == null)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(objArr[0].toString(), objArr[1].toString());
                    return hashMap;
                }
            }
        }
        return Collections.emptyMap();
    }

    public String getToken() {
        long j = this.f9697a;
        return j != -1 ? (String) pblb.a(33554439, 0, j, (String) null, (Object) null) : "";
    }

    public void report(String str) {
        if (this.f9697a != -1 && !TextUtils.isEmpty(str)) {
            pblb.a(33554433, 0, this.f9697a, str, this.f9698b);
        }
    }

    public void setBDDeviceID(String str) {
        this.f9699c.f9692d = str;
        long j = this.f9697a;
        if (j != -1) {
            pblb.a(33554437, 0, j, str, this.f9698b);
        }
    }

    public void setCollectMode(int i) {
        long j = this.f9697a;
        if (j != -1) {
            pblb.a(33554441, i, j, (String) null, (Object) null);
        }
    }

    public void setDeviceID(String str) {
        this.f9699c.f9691c = str;
        long j = this.f9697a;
        if (j != -1) {
            pblb.a(33554434, 0, j, str, this.f9698b);
        }
    }

    public void setInstallID(String str) {
        this.f9699c.f9693e = str;
        long j = this.f9697a;
        if (j != -1) {
            pblb.a(33554435, 0, j, str, this.f9698b);
        }
    }

    public void setSessionID(String str) {
        this.f9699c.f9694f = str;
        long j = this.f9697a;
        if (j != -1) {
            pblb.a(33554436, 0, j, str, this.f9698b);
        }
    }
}
