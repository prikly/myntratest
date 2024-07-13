package ms.bd.o.Pgl;

import com.applovin.exoplayer2.common.base.Ascii;
import ms.bd.o.Pgl.pblb;
import org.json.JSONObject;

public abstract class pblm extends pblb.pgla {

    /* renamed from: a  reason: collision with root package name */
    private static pblm f9711a;

    public static class pgla {

        /* renamed from: a  reason: collision with root package name */
        private long f9712a;

        /* renamed from: b  reason: collision with root package name */
        private long f9713b;

        /* renamed from: c  reason: collision with root package name */
        private String f9714c;

        /* renamed from: d  reason: collision with root package name */
        private String f9715d;

        public void a(String str) {
            this.f9714c = str;
            this.f9715d = null;
            this.f9712a = System.currentTimeMillis();
        }

        public void a(String str, int i) {
            pblm a2 = pblm.a();
            if (a2 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f9712a;
                long j2 = currentTimeMillis - j;
                this.f9713b = j2;
                a2.a(j2, j, this.f9714c, this.f9715d, str, i, (JSONObject) null);
            }
        }

        public void b(String str, int i) {
            pblm a2 = pblm.a();
            if (a2 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f9712a;
                long j2 = currentTimeMillis - j;
                this.f9713b = j2;
                a2.b(j2, j, this.f9714c, this.f9715d, str, i, (JSONObject) null);
            }
        }
    }

    public static synchronized pblm a() {
        pblm pblm;
        synchronized (pblm.class) {
            pblm = f9711a;
        }
        return pblm;
    }

    public static synchronized void a(pblm pblm) {
        synchronized (pblm.class) {
            f9711a = pblm;
        }
    }

    public Object a(int i, int i2, long j, String str, Object obj) throws Throwable {
        if (i != 131073) {
            if (i == 131074) {
                String[] strArr = (String[]) obj;
                if (!(str == null || strArr == null || strArr.length == 0)) {
                    a(str, new JSONObject(strArr[0]), new JSONObject(strArr[1]), new JSONObject(strArr[2]));
                }
            }
            return null;
        } else if (str == null || !a(str)) {
            return null;
        } else {
            return (String) pblk.a(16777217, 0, 0, "15fb7c", new byte[]{Ascii.SI, Ascii.FS});
        }
    }

    public abstract void a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject);

    public abstract void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    public abstract boolean a(String str);

    public abstract void b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject);
}
