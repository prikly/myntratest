package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.IParamsCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.mi  reason: case insensitive filesystem */
public class C0560mi {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f6285a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, W0> f6286b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f6287c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f6288d;

    /* renamed from: e  reason: collision with root package name */
    private long f6289e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6290f;

    /* renamed from: g  reason: collision with root package name */
    private C0389fl f6291g;

    /* renamed from: h  reason: collision with root package name */
    private C0674ra f6292h;
    private long i;
    private final List<C0414gl> j;
    private final C0277b9 k;
    private final Rh l;
    private final Th m;
    private final Wh n;

    public C0560mi(Context context, C0277b9 b9Var) {
        this(b9Var, new Nh(), new Rh(), C0362ej.a(context).a(context, new C0437hj(b9Var)), new Th(), new Wh(), new Vh());
    }

    private void b(String str, W0 w0) {
        if (!a(w0)) {
            this.f6286b.put(str, w0);
        }
    }

    private void h() {
        this.k.i(this.f6286b.get("yandex_mobile_metrica_uuid")).e(this.f6286b.get("yandex_mobile_metrica_device_id")).d(this.f6286b.get("appmetrica_device_id_hash")).a(this.f6286b.get("yandex_mobile_metrica_get_ad_url")).b(this.f6286b.get("yandex_mobile_metrica_report_ad_url")).h(this.f6289e).h(this.f6286b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)).r(Tl.c(this.f6288d)).a(this.f6291g).a(this.f6292h).f(this.f6286b.get("yandex_mobile_metrica_google_adv_id")).g(this.f6286b.get("yandex_mobile_metrica_huawei_oaid")).j(this.f6286b.get("yandex_mobile_metrica_yandex_adv_id")).d(this.f6290f).c(this.m.a()).g(this.i).a(this.n.a()).d();
    }

    public void a(Map<String, String> map) {
        if (!A2.b((Map) map) && !A2.a((Object) map, (Object) this.f6288d)) {
            this.f6288d = new HashMap(map);
            this.f6290f = true;
            h();
        }
    }

    /* access modifiers changed from: package-private */
    public String c() {
        W0 w0 = this.f6286b.get("yandex_mobile_metrica_device_id");
        if (w0 == null) {
            return null;
        }
        return w0.f5240a;
    }

    public C0674ra d() {
        return this.f6292h;
    }

    /* access modifiers changed from: package-private */
    public long e() {
        return this.f6289e;
    }

    public C0389fl f() {
        return this.f6291g;
    }

    /* access modifiers changed from: package-private */
    public String g() {
        W0 w0 = this.f6286b.get("yandex_mobile_metrica_uuid");
        if (w0 == null) {
            return null;
        }
        return w0.f5240a;
    }

    private boolean b(W0 w0) {
        return w0 == null || TextUtils.isEmpty(w0.f5240a);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean b(List<String> list) {
        boolean z;
        boolean z2;
        z = true;
        boolean z3 = !a(C0585ni.a((Collection<String>) list));
        Iterator<String> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (this.f6285a.contains(it.next())) {
                z2 = true;
                break;
            }
        }
        boolean a2 = C0585ni.a(this.i);
        C0389fl flVar = this.f6291g;
        boolean z4 = !(flVar != null && flVar.a());
        if (!z3 && !z2 && !a2 && !this.f6290f && !z4) {
            z = false;
        }
        return z;
    }

    C0560mi(C0277b9 b9Var, Nh nh, Rh rh, C0337dj djVar, Th th, Wh wh, Vh vh) {
        HashSet hashSet = new HashSet();
        this.f6285a = hashSet;
        this.f6286b = new HashMap();
        this.j = new ArrayList();
        hashSet.add("yandex_mobile_metrica_google_adv_id");
        hashSet.add("yandex_mobile_metrica_huawei_oaid");
        hashSet.add("yandex_mobile_metrica_yandex_adv_id");
        this.k = b9Var;
        this.l = rh;
        this.m = th;
        this.n = wh;
        a("yandex_mobile_metrica_uuid", djVar.a());
        a("yandex_mobile_metrica_device_id", b9Var.l());
        a("appmetrica_device_id_hash", b9Var.k());
        a("yandex_mobile_metrica_get_ad_url", b9Var.f());
        a("yandex_mobile_metrica_report_ad_url", b9Var.g());
        b(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, b9Var.r());
        a("yandex_mobile_metrica_google_adv_id", b9Var.o());
        a("yandex_mobile_metrica_huawei_oaid", b9Var.p());
        a("yandex_mobile_metrica_yandex_adv_id", b9Var.v());
        th.a(b9Var.j());
        wh.a(b9Var.n());
        this.f6287c = b9Var.i();
        Map<String, String> map = null;
        String k2 = b9Var.k((String) null);
        this.f6288d = k2 != null ? Tl.a(k2) : map;
        this.f6290f = b9Var.b(true);
        this.f6289e = b9Var.d(0);
        this.f6291g = b9Var.t();
        this.f6292h = b9Var.m();
        this.i = b9Var.q();
        h();
    }

    public boolean a() {
        W0 w0 = this.f6286b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        if (!a(w0) && w0.f5240a.isEmpty()) {
            return A2.b((Map) this.f6288d);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public List<String> b() {
        return this.f6287c;
    }

    private void a(String str, W0 w0) {
        if (!b(w0)) {
            this.f6286b.put(str, w0);
        }
    }

    private boolean a(W0 w0) {
        return w0 == null || w0.f5240a == null;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(List<String> list, Map<String, W0> map) {
        for (String next : list) {
            W0 w0 = this.f6286b.get(next);
            if (w0 != null) {
                map.put(next, w0);
            }
        }
        this.m.a(list, map);
        this.n.a(list, map);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(java.util.Collection<java.lang.String> r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x006b }
        L_0x0005:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x006b }
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.W0> r1 = r4.f6286b     // Catch:{ all -> 0x006b }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006b }
            com.yandex.metrica.impl.ob.W0 r1 = (com.yandex.metrica.impl.ob.W0) r1     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0027
            com.yandex.metrica.impl.ob.Th r1 = r4.m     // Catch:{ all -> 0x006b }
            java.util.Map r1 = r1.b()     // Catch:{ all -> 0x006b }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006b }
            com.yandex.metrica.impl.ob.W0 r1 = (com.yandex.metrica.impl.ob.W0) r1     // Catch:{ all -> 0x006b }
        L_0x0027:
            if (r1 != 0) goto L_0x002f
            com.yandex.metrica.impl.ob.Wh r1 = r4.n     // Catch:{ all -> 0x006b }
            com.yandex.metrica.impl.ob.W0 r1 = r1.a((java.lang.String) r0)     // Catch:{ all -> 0x006b }
        L_0x002f:
            java.lang.String r2 = "yandex_mobile_metrica_clids"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x006b }
            r3 = 0
            if (r2 == 0) goto L_0x0054
            boolean r0 = r4.f6290f     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0052
            boolean r0 = r4.a((com.yandex.metrica.impl.ob.W0) r1)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = r1.f5240a     // Catch:{ all -> 0x006b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0005
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f6288d     // Catch:{ all -> 0x006b }
            boolean r0 = com.yandex.metrica.impl.ob.A2.b((java.util.Map) r0)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0005
        L_0x0052:
            monitor-exit(r4)
            return r3
        L_0x0054:
            java.lang.String r2 = "yandex_mobile_metrica_lib_ssl_enabled"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0005
            monitor-exit(r4)
            return r3
        L_0x0060:
            boolean r0 = r4.b((com.yandex.metrica.impl.ob.W0) r1)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0005
            monitor-exit(r4)
            return r3
        L_0x0068:
            r5 = 1
            monitor-exit(r4)
            return r5
        L_0x006b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0560mi.a(java.util.Collection):boolean");
    }

    /* access modifiers changed from: package-private */
    public void a(Bundle bundle) {
        HashMap<String, String> hashMap;
        boolean z;
        L l2 = new L(bundle);
        W0 o = l2.o();
        if (b(this.f6286b.get("yandex_mobile_metrica_uuid")) && !b(o) && !b(o)) {
            this.f6286b.put("yandex_mobile_metrica_uuid", o);
        }
        W0 c2 = l2.c();
        if (!b(c2)) {
            this.f6286b.put("yandex_mobile_metrica_device_id", c2);
        }
        W0 d2 = l2.d();
        if (!b(d2)) {
            this.f6286b.put("appmetrica_device_id_hash", d2);
        }
        this.f6286b.put("yandex_mobile_metrica_google_adv_id", l2.g());
        this.f6286b.put("yandex_mobile_metrica_huawei_oaid", l2.i());
        this.f6286b.put("yandex_mobile_metrica_yandex_adv_id", l2.p());
        this.m.a(l2.b());
        this.n.a(l2.f());
        W0 h2 = l2.h();
        if (!a(h2)) {
            this.f6286b.put("yandex_mobile_metrica_get_ad_url", h2);
        }
        W0 k2 = l2.k();
        if (!a(k2)) {
            this.f6286b.put("yandex_mobile_metrica_report_ad_url", k2);
        }
        this.f6289e = l2.m();
        Rh rh = this.l;
        Map<String, String> map = this.f6288d;
        String str = l2.a().f5240a;
        if (str == null) {
            hashMap = null;
        } else if (str.isEmpty()) {
            hashMap = new HashMap<>();
        } else {
            hashMap = Tl.d(str);
        }
        rh.getClass();
        if (A2.b((Map) map)) {
            z = A2.b((Map) hashMap);
        } else {
            z = map.equals(hashMap);
        }
        if (z) {
            this.f6286b.put(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, l2.l());
            this.f6290f = false;
        }
        C0389fl n2 = l2.n();
        if (n2 != null && n2.a()) {
            this.f6291g = n2;
            for (C0414gl a2 : this.j) {
                a2.a(this.f6291g);
            }
        }
        this.f6292h = l2.e();
        this.i = l2.j();
        h();
    }

    public synchronized void a(C0414gl glVar) {
        this.j.add(glVar);
    }

    /* access modifiers changed from: package-private */
    public void a(List<String> list) {
        this.f6287c = list;
        this.k.b(list);
    }
}
