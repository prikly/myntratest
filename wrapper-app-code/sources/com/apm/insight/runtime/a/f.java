package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.b;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.a;
import com.apm.insight.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f10831a;

    /* renamed from: b  reason: collision with root package name */
    private Context f10832b;

    /* renamed from: c  reason: collision with root package name */
    private Map<CrashType, c> f10833c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private b f10834d;

    /* renamed from: e  reason: collision with root package name */
    private d f10835e;

    /* renamed from: com.apm.insight.runtime.a.f$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10836a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.apm.insight.CrashType[] r0 = com.apm.insight.CrashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10836a = r0
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10836a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10836a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10836a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.ANR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10836a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.DART     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10836a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.CUSTOM_JAVA     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f10836a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.BLOCK     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f10836a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.ENSURE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.a.f.AnonymousClass1.<clinit>():void");
        }
    }

    private f(Context context) {
        this.f10832b = context;
        try {
            this.f10834d = b.d();
            this.f10835e = new d(this.f10832b);
        } catch (Throwable th) {
            b.a().a("NPTH_CATCH", th);
        }
    }

    private c a(CrashType crashType) {
        c cVar = this.f10833c.get(crashType);
        if (cVar != null) {
            return cVar;
        }
        switch (AnonymousClass1.f10836a[crashType.ordinal()]) {
            case 1:
                cVar = new j(this.f10832b, this.f10834d, this.f10835e);
                break;
            case 2:
                cVar = new k(this.f10832b, this.f10834d, this.f10835e);
                break;
            case 3:
                cVar = new l(this.f10832b, this.f10834d, this.f10835e);
                break;
            case 4:
                cVar = new a(this.f10832b, this.f10834d, this.f10835e);
                break;
            case 5:
                cVar = new h(this.f10832b, this.f10834d, this.f10835e);
                break;
            case 6:
                cVar = new g(this.f10832b, this.f10834d, this.f10835e);
                break;
            case 7:
                cVar = new e(this.f10832b, this.f10834d, this.f10835e);
                break;
            case 8:
                cVar = new i(this.f10832b, this.f10834d, this.f10835e);
                break;
        }
        if (cVar != null) {
            this.f10833c.put(crashType, cVar);
        }
        return cVar;
    }

    public static f a() {
        if (f10831a == null) {
            Context g2 = h.g();
            if (g2 != null) {
                f10831a = new f(g2);
            } else {
                throw new IllegalArgumentException("NpthBus not init");
            }
        }
        return f10831a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = a(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.apm.insight.entity.a a(com.apm.insight.CrashType r3, com.apm.insight.entity.a r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return r4
        L_0x0003:
            com.apm.insight.runtime.a.c r3 = r2.a(r3)
            if (r3 == 0) goto L_0x0010
            r0 = 0
            r1 = 0
            com.apm.insight.entity.a r3 = r3.a(r4, r0, r1)
            return r3
        L_0x0010:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.a.f.a(com.apm.insight.CrashType, com.apm.insight.entity.a):com.apm.insight.entity.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = a(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.apm.insight.entity.a a(com.apm.insight.CrashType r1, com.apm.insight.entity.a r2, com.apm.insight.runtime.a.c.a r3, boolean r4) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            com.apm.insight.runtime.a.c r1 = r0.a(r1)
            if (r1 == 0) goto L_0x000e
            com.apm.insight.entity.a r1 = r1.a(r2, r3, r4)
            return r1
        L_0x000e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.a.f.a(com.apm.insight.CrashType, com.apm.insight.entity.a, com.apm.insight.runtime.a.c$a, boolean):com.apm.insight.entity.a");
    }

    public a a(List<a> list, JSONArray jSONArray) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        a aVar = new a();
        JSONArray jSONArray2 = new JSONArray();
        for (a h2 : list) {
            jSONArray2.put(h2.h());
        }
        aVar.a("data", (Object) jSONArray2);
        aVar.a("all_data", (Object) jSONArray);
        Header a2 = Header.a(this.f10832b);
        Header.a(a2);
        a2.c();
        a2.d();
        a2.e();
        Header.b(a2);
        aVar.a(a2);
        return aVar;
    }
}
