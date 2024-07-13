package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.b9  reason: case insensitive filesystem */
public class C0277b9 extends C0327d9 {
    static final Rd A = new Rd(IronSourceConstants.TYPE_GAID, (String) null);
    static final Rd B = new Rd("HOAID", (String) null);
    static final Rd C = new Rd("YANDEX_ADV_ID", (String) null);
    static final Rd D = new Rd("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", (String) null);
    static final Rd E = new Rd("SCREEN_INFO", (String) null);
    static final Rd F = new Rd("SCREEN_SIZE_CHECKED_BY_DEPRECATED", (String) null);
    static final Rd G = new Rd("FEATURES", (String) null);
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    static final Rd f5521c = new Rd(IronSourceConstants.TYPE_UUID, (String) null);

    /* renamed from: d  reason: collision with root package name */
    static final Rd f5522d = new Rd("UUID_RESULT", (String) null);
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    static final Rd f5523e = new Rd("DEVICE_ID", (String) null);

    /* renamed from: f  reason: collision with root package name */
    static final Rd f5524f = new Rd("DEVICE_ID_RESULT", (String) null);
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    static final Rd f5525g = new Rd("DEVICE_ID_HASH", (String) null);

    /* renamed from: h  reason: collision with root package name */
    static final Rd f5526h = new Rd("DEVICE_ID_HASH_RESULT", (String) null);
    @Deprecated
    static final Rd i = new Rd("AD_URL_GET", (String) null);
    static final Rd j = new Rd("AD_URL_GET_RESULT", (String) null);
    @Deprecated
    static final Rd k = new Rd("AD_URL_REPORT", (String) null);
    static final Rd l = new Rd("AD_URL_REPORT_RESULT", (String) null);
    static final Rd m = new Rd("CUSTOM_HOSTS", (String) null);
    static final Rd n = new Rd("SERVER_TIME_OFFSET", (String) null);
    @Deprecated
    static final Rd o = new Rd("CLIDS", (String) null);
    static final Rd p = new Rd("RESPONSE_CLIDS_RESULT", (String) null);
    static final Rd q = new Rd("CUSTOM_SDK_HOSTS", (String) null);
    static final Rd r = new Rd("CLIENT_CLIDS", (String) null);
    static final Rd s = new Rd("DEFERRED_DEEP_LINK_WAS_CHECKED", (String) null);
    static final Rd t = new Rd("API_LEVEL", (String) null);
    static final Rd u = new Rd("ADS_REQUESTED_CONTEXT", (String) null);
    static final Rd v = new Rd("CONTEXT_HISTORY", (String) null);
    static final Rd w = new Rd("ACCESS_CONFIG", (String) null);
    static final Rd x = new Rd("DIAGNOSTICS_CONFIGS_HOLDER", (String) null);
    static final Rd y = new Rd("NEXT_STARTUP_TIME", (String) null);
    static final Rd z = new Rd("LAST_UI_CONTEXT_ID", (String) null);

    static {
        new Rd("DEPRECATED_NATIVE_CRASHES_CHECKED", (String) null);
    }

    public C0277b9(S7 s7) {
        super(s7);
    }

    public C0277b9 a(W0 w0) {
        return a(j.a(), w0);
    }

    public boolean b(boolean z2) {
        return a(D.a(), z2);
    }

    public C0277b9 c(W0 w0) {
        return a(q.a(), w0);
    }

    public long d(long j2) {
        return a(n.b(), j2);
    }

    public C0277b9 e(W0 w0) {
        return a(f5524f.a(), w0);
    }

    public W0 f() {
        return i(j.a());
    }

    public W0 g() {
        return i(l.a());
    }

    @Deprecated
    public String h(String str) {
        return a(k.a(), (String) null);
    }

    public List<String> i() {
        String a2 = a(m.a(), (String) null);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return Tl.c(a2);
    }

    public W0 j() {
        return i(q.a());
    }

    public W0 k() {
        return i(f5526h.a());
    }

    public W0 l() {
        return i(f5524f.a());
    }

    @Deprecated
    public String m(String str) {
        return a(f5525g.a(), (String) null);
    }

    public Xh n() {
        String a2 = a(G.a(), (String) null);
        try {
            if (!TextUtils.isEmpty(a2)) {
                JSONObject jSONObject = new JSONObject(a2);
                return new Xh(Tl.a(jSONObject, "libSslEnabled", (Boolean) null), U0.a(Tl.b(jSONObject, "STATUS")), Tl.b(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new Xh((Boolean) null, U0.UNKNOWN, (String) null);
    }

    public W0 o() {
        return i(A.a());
    }

    public W0 p() {
        return i(B.a());
    }

    @Deprecated
    public C0277b9 q(String str) {
        return (C0277b9) b(o.a(), str);
    }

    public W0 r() {
        return i(p.a());
    }

    @Deprecated
    public C0277b9 s(String str) {
        return (C0277b9) b(f5523e.a(), str);
    }

    @Deprecated
    public C0277b9 t(String str) {
        return (C0277b9) b(f5521c.a(), str);
    }

    public W0 u() {
        return i(f5522d.a());
    }

    public W0 v() {
        return i(C.a());
    }

    public boolean w() {
        return a(s.a(), false);
    }

    public boolean x() {
        return a(F.a(), false);
    }

    public C0277b9 y() {
        return (C0277b9) b(s.a(), true);
    }

    public void z() {
        b(F.a(), true);
    }

    public C0277b9 a(Xh xh) {
        String a2 = G.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", xh.b()).put("STATUS", xh.c().a()).putOpt("ERROR_EXPLANATION", xh.a());
        } catch (Throwable unused) {
        }
        return (C0277b9) b(a2, jSONObject.toString());
    }

    public long b(long j2) {
        return a(t.a(), j2);
    }

    public C0277b9 c(boolean z2) {
        return (C0277b9) b(u.a(), z2);
    }

    public C0277b9 d(W0 w0) {
        return a(f5526h.a(), w0);
    }

    public C0277b9 e(long j2) {
        return (C0277b9) b(t.a(), j2);
    }

    public C0277b9 f(W0 w0) {
        return a(A.a(), w0);
    }

    @Deprecated
    public String g(String str) {
        return a(i.a(), (String) null);
    }

    public C0277b9 h(W0 w0) {
        return a(p.a(), w0);
    }

    @Deprecated
    public String j(String str) {
        return a(o.a(), (String) null);
    }

    public String k(String str) {
        return a(r.a(), (String) null);
    }

    @Deprecated
    public String l(String str) {
        return a(f5523e.a(), (String) null);
    }

    public C0674ra m() {
        C0674ra raVar = null;
        try {
            String a2 = a(x.a(), (String) null);
            if (a2 != null) {
                raVar = Tl.a(new JSONObject(a2));
            }
        } catch (Throwable unused) {
        }
        return raVar == null ? new C0674ra() : raVar;
    }

    @Deprecated
    public C0277b9 o(String str) {
        return (C0277b9) b(i.a(), str);
    }

    @Deprecated
    public C0277b9 p(String str) {
        return (C0277b9) b(k.a(), str);
    }

    public long q() {
        return a(y.a(), 0);
    }

    public C0277b9 r(String str) {
        return (C0277b9) b(r.a(), str);
    }

    public C0295c2 s() {
        return Tl.f(e(E.a()));
    }

    public C0389fl t() {
        try {
            String a2 = a(w.a(), (String) null);
            if (a2 != null) {
                return Tl.c(new JSONObject(a2));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C0277b9 b(W0 w0) {
        return a(l.a(), w0);
    }

    public long c(long j2) {
        return a(z.a(), j2);
    }

    public C0277b9 d(boolean z2) {
        return (C0277b9) b(D.a(), z2);
    }

    public C0277b9 f(long j2) {
        return (C0277b9) b(z.a(), j2);
    }

    public C0277b9 g(W0 w0) {
        return a(B.a(), w0);
    }

    public C0277b9 h(long j2) {
        return (C0277b9) b(n.a(), j2);
    }

    public C0277b9 i(W0 w0) {
        return a(f5522d.a(), w0);
    }

    public C0277b9 j(W0 w0) {
        return a(C.a(), w0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.ob.W0 i(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r6 = r5.a((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0028 }
            if (r6 == 0) goto L_0x0028
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            r1.<init>(r6)     // Catch:{ all -> 0x0028 }
            com.yandex.metrica.impl.ob.W0 r6 = new com.yandex.metrica.impl.ob.W0     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "ID"
            java.lang.String r2 = com.yandex.metrica.impl.ob.Tl.b((org.json.JSONObject) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "STATUS"
            java.lang.String r3 = com.yandex.metrica.impl.ob.Tl.b((org.json.JSONObject) r1, (java.lang.String) r3)     // Catch:{ all -> 0x0028 }
            com.yandex.metrica.impl.ob.U0 r3 = com.yandex.metrica.impl.ob.U0.a(r3)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "ERROR_EXPLANATION"
            java.lang.String r1 = com.yandex.metrica.impl.ob.Tl.b((org.json.JSONObject) r1, (java.lang.String) r4)     // Catch:{ all -> 0x0028 }
            r6.<init>(r2, r3, r1)     // Catch:{ all -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            r6 = r0
        L_0x0029:
            if (r6 != 0) goto L_0x0034
            com.yandex.metrica.impl.ob.W0 r6 = new com.yandex.metrica.impl.ob.W0
            com.yandex.metrica.impl.ob.U0 r1 = com.yandex.metrica.impl.ob.U0.UNKNOWN
            java.lang.String r2 = "no identifier in preferences"
            r6.<init>(r0, r1, r2)
        L_0x0034:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0277b9.i(java.lang.String):com.yandex.metrica.impl.ob.W0");
    }

    public C0277b9 b(List<String> list) {
        return (C0277b9) b(m.a(), Tl.c(list));
    }

    public C0277b9 g(long j2) {
        return (C0277b9) b(y.a(), j2);
    }

    public List<String> h() {
        LinkedList linkedList = new LinkedList();
        List<String> a2 = a(v.a(), (List<String>) linkedList);
        return a2 == null ? linkedList : a2;
    }

    @Deprecated
    public String n(String str) {
        return a(f5521c.a(), (String) null);
    }

    public boolean a(boolean z2) {
        return a(u.a(), z2);
    }

    public C0277b9 a(List<String> list) {
        return (C0277b9) b(v.a(), list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.ob.C0277b9 a(com.yandex.metrica.impl.ob.C0389fl r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000b
            org.json.JSONObject r2 = com.yandex.metrica.impl.ob.Tl.a((com.yandex.metrica.impl.ob.C0389fl) r2)     // Catch:{ all -> 0x000b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r2 == 0) goto L_0x0017
            com.yandex.metrica.impl.ob.Rd r0 = w
            java.lang.String r0 = r0.a()
            r1.b((java.lang.String) r0, (java.lang.String) r2)
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0277b9.a(com.yandex.metrica.impl.ob.fl):com.yandex.metrica.impl.ob.b9");
    }

    public C0277b9 a(C0674ra raVar) {
        return (C0277b9) b(x.a(), Tl.a(raVar).toString());
    }

    public void a(C0295c2 c2Var) {
        b(E.a(), Tl.a(c2Var));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:1|2|3|4|5|6|7|8|9|10|11|12|13|(1:17)|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.ob.C0277b9 a(java.lang.String r5, com.yandex.metrica.impl.ob.W0 r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x0027
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0027 }
            r0.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = "ID"
            java.lang.String r2 = r6.f5240a     // Catch:{ all -> 0x0022 }
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = "STATUS"
            com.yandex.metrica.impl.ob.U0 r3 = r6.f5241b     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = r3.a()     // Catch:{ all -> 0x0022 }
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = "ERROR_EXPLANATION"
            java.lang.String r6 = r6.f5242c     // Catch:{ all -> 0x0022 }
            r1.put(r2, r6)     // Catch:{ all -> 0x0022 }
        L_0x0022:
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            if (r6 == 0) goto L_0x002d
            r4.b((java.lang.String) r5, (java.lang.String) r6)
        L_0x002d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0277b9.a(java.lang.String, com.yandex.metrica.impl.ob.W0):com.yandex.metrica.impl.ob.b9");
    }
}
