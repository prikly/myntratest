package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import com.yandex.metrica.impl.ob.C0368f0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.hi  reason: case insensitive filesystem */
public class C0436hi implements Q0, C0485ji {
    static final Map<C0411gi, IParamsCallback.Reason> j = Collections.unmodifiableMap(new a());

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f5932a;

    /* renamed from: b  reason: collision with root package name */
    private final T1 f5933b;

    /* renamed from: c  reason: collision with root package name */
    private final C0560mi f5934c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f5935d;

    /* renamed from: e  reason: collision with root package name */
    private C0315cm f5936e;

    /* renamed from: f  reason: collision with root package name */
    private final C0368f0.a f5937f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f5938g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Yh, List<String>> f5939h;
    private Map<String, String> i;

    /* renamed from: com.yandex.metrica.impl.ob.hi$a */
    class a extends HashMap<C0411gi, IParamsCallback.Reason> {
        a() {
            put(C0411gi.UNKNOWN, IParamsCallback.Reason.UNKNOWN);
            put(C0411gi.NETWORK, IParamsCallback.Reason.NETWORK);
            put(C0411gi.PARSE, IParamsCallback.Reason.INVALID_RESPONSE);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.hi$b */
    class b implements C0368f0.a {
        b(C0436hi hiVar) {
        }

        public void a(int i, Bundle bundle) {
        }
    }

    public C0436hi(Context context, T1 t1, C0277b9 b9Var, Handler handler) {
        this(t1, new C0560mi(context, b9Var), handler);
    }

    private void f() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry next : this.f5939h.entrySet()) {
            List list = (List) next.getValue();
            if (this.f5934c.a((Collection<String>) list)) {
                weakHashMap.put(next.getKey(), list);
            }
        }
        for (Map.Entry key : weakHashMap.entrySet()) {
            Yh yh = (Yh) key.getKey();
            if (yh != null) {
                a(yh, new Bundle());
            }
        }
        weakHashMap.clear();
    }

    public long a() {
        return this.f5934c.e();
    }

    public String b() {
        return this.f5934c.c();
    }

    public C0674ra c() {
        return this.f5934c.d();
    }

    public C0389fl d() {
        return this.f5934c.f();
    }

    public String e() {
        return this.f5934c.g();
    }

    public void g() {
        boolean b2;
        synchronized (this.f5938g) {
            C0560mi miVar = this.f5934c;
            synchronized (miVar) {
                b2 = miVar.b((List<String>) Arrays.asList(new String[]{IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"}));
            }
            if (b2) {
                Map<String, String> map = this.i;
                this.f5933b.a(this.f5932a, (ResultReceiver) new C0368f0(this.f5935d, this.f5937f), map);
            }
        }
    }

    C0436hi(T1 t1, C0560mi miVar, Handler handler) {
        this.f5932a = Arrays.asList(new String[]{"yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS});
        this.f5938g = new Object();
        this.f5939h = new WeakHashMap();
        this.f5933b = t1;
        this.f5934c = miVar;
        this.f5935d = handler;
        this.f5937f = new b(this);
    }

    public void a(IIdentifierCallback iIdentifierCallback, List<String> list, Map<String, String> map) {
        Qh qh = new Qh(iIdentifierCallback);
        synchronized (this.f5938g) {
            this.f5934c.a(map);
            if (this.f5939h.isEmpty()) {
                this.f5933b.g();
            }
            this.f5939h.put(qh, list);
            if (this.f5934c.b(list)) {
                this.f5933b.a(list, (ResultReceiver) new C0368f0(this.f5935d, new C0460ii(this, qh)), map);
            } else {
                a((Yh) qh, new Bundle());
            }
        }
    }

    public void b(String str) {
        synchronized (this.f5938g) {
            this.f5933b.b(str);
        }
    }

    public void a(Bundle bundle, Yh yh) {
        synchronized (this.f5938g) {
            this.f5934c.a(bundle);
            f();
            f();
            if (yh != null) {
                a(yh, bundle);
            }
        }
    }

    public void a(C0315cm cmVar) {
        this.f5936e = cmVar;
    }

    public void a(List<String> list) {
        synchronized (this.f5938g) {
            List<String> b2 = this.f5934c.b();
            if (A2.b((Collection) list)) {
                if (!A2.b((Collection) b2)) {
                    this.f5934c.a((List<String>) null);
                    this.f5933b.a((List<String>) null);
                }
            } else if (!A2.a((Object) list, (Object) b2)) {
                this.f5934c.a(list);
                this.f5933b.a(list);
            } else {
                this.f5933b.a(b2);
            }
        }
    }

    public void a(Map<String, String> map) {
        if (!A2.b((Map) map)) {
            synchronized (this.f5938g) {
                Map<String, String> i2 = Tl.i(map);
                this.i = i2;
                this.f5933b.a(i2);
                this.f5934c.a(i2);
            }
        }
    }

    public void a(String str) {
        synchronized (this.f5938g) {
            this.f5933b.a(str);
        }
    }

    public void a(C0414gl glVar) {
        this.f5934c.a(glVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.yandex.metrica.impl.ob.Yh r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r0 = r6.f5939h
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x0099
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r0 = r6.f5939h
            java.lang.Object r0 = r0.get(r7)
            java.util.List r0 = (java.util.List) r0
            com.yandex.metrica.impl.ob.mi r1 = r6.f5934c
            boolean r1 = r1.a((java.util.Collection<java.lang.String>) r0)
            r2 = 0
            if (r1 == 0) goto L_0x002a
            if (r0 != 0) goto L_0x001c
            goto L_0x0026
        L_0x001c:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.yandex.metrica.impl.ob.mi r8 = r6.f5934c
            r8.a((java.util.List<java.lang.String>) r0, (java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.W0>) r2)
        L_0x0026:
            r7.onReceive(r2)
            goto L_0x0087
        L_0x002a:
            java.lang.String r1 = "startup_error_key_code"
            boolean r3 = r8.containsKey(r1)
            r4 = 1
            if (r3 == 0) goto L_0x0045
            int r8 = r8.getInt(r1)
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.ob.C0411gi.UNKNOWN
            if (r8 == r4) goto L_0x0042
            r3 = 2
            if (r8 == r3) goto L_0x003f
            goto L_0x0046
        L_0x003f:
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.ob.C0411gi.PARSE
            goto L_0x0046
        L_0x0042:
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.ob.C0411gi.NETWORK
            goto L_0x0046
        L_0x0045:
            r1 = r2
        L_0x0046:
            if (r1 != 0) goto L_0x0065
            com.yandex.metrica.impl.ob.mi r8 = r6.f5934c
            boolean r8 = r8.a()
            if (r8 != 0) goto L_0x0063
            com.yandex.metrica.impl.ob.cm r8 = r6.f5936e
            if (r8 == 0) goto L_0x0060
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.i
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "Clids error. Passed clids: %s, and clids from server are empty."
            r8.fw(r4, r3)
        L_0x0060:
            com.yandex.metrica.IParamsCallback$Reason r8 = com.yandex.metrica.IParamsCallback.Reason.INCONSISTENT_CLIDS
            goto L_0x0066
        L_0x0063:
            com.yandex.metrica.impl.ob.gi r1 = com.yandex.metrica.impl.ob.C0411gi.UNKNOWN
        L_0x0065:
            r8 = r2
        L_0x0066:
            if (r8 != 0) goto L_0x0077
            java.util.Map<com.yandex.metrica.impl.ob.gi, com.yandex.metrica.IParamsCallback$Reason> r8 = j
            com.yandex.metrica.IParamsCallback$Reason r3 = com.yandex.metrica.IParamsCallback.Reason.UNKNOWN
            java.lang.Object r8 = r8.get(r1)
            if (r8 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r3 = r8
        L_0x0074:
            r8 = r3
            com.yandex.metrica.IParamsCallback$Reason r8 = (com.yandex.metrica.IParamsCallback.Reason) r8
        L_0x0077:
            if (r0 != 0) goto L_0x007a
            goto L_0x0084
        L_0x007a:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.yandex.metrica.impl.ob.mi r1 = r6.f5934c
            r1.a((java.util.List<java.lang.String>) r0, (java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.W0>) r2)
        L_0x0084:
            r7.a(r8, r2)
        L_0x0087:
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r8 = r6.f5939h
            r8.remove(r7)
            java.util.Map<com.yandex.metrica.impl.ob.Yh, java.util.List<java.lang.String>> r7 = r6.f5939h
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0099
            com.yandex.metrica.impl.ob.T1 r7 = r6.f5933b
            r7.f()
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0436hi.a(com.yandex.metrica.impl.ob.Yh, android.os.Bundle):void");
    }
}
