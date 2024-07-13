package com.appodeal.ads;

import com.appodeal.ads.api.Stats;
import com.appodeal.ads.l;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.networking.binders.b;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.waterfall_filter.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public abstract class r<AdObjectType extends l> {
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public JSONObject G;
    public r<AdObjectType> H;
    public final a I = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f17077a = new ArrayList(0);

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f17078b = new ArrayList(0);

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f17079c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArrayList f17080d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArrayList f17081e = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArrayList f17082f = new CopyOnWriteArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final CopyOnWriteArrayList f17083g = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    public boolean f17084h;
    public boolean i;
    public String j;
    public Long k = null;
    public b.a.C0189a l;
    public long m = 0;
    public long n = 0;
    public long o = 0;
    public final AtomicLong p = new AtomicLong(0);
    public final HashMap q = new HashMap();
    public final String r = UUID.randomUUID().toString();
    public AdObjectType s;
    public double t;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;

    public class a extends t<AdObjectType> {
    }

    public r(s sVar) {
        if (sVar != null) {
            this.f17084h = sVar.b();
            this.i = sVar.c();
        }
    }

    public final int a() {
        return this.f17078b.size() + this.f17077a.size();
    }

    public final JSONObject a(int i2) {
        if (i2 < this.f17077a.size()) {
            return (JSONObject) this.f17077a.get(i2);
        }
        return null;
    }

    public final JSONObject a(int i2, boolean z2, boolean z3) {
        JSONObject jSONObject;
        ArrayList arrayList;
        if (!z2 || this.f17078b.size() <= i2) {
            if (this.f17077a.size() > i2) {
                jSONObject = (JSONObject) this.f17077a.get(i2);
                if (!this.i) {
                    arrayList = this.f17077a;
                }
            } else {
                jSONObject = null;
            }
            if (z3 && !this.i) {
                this.f17077a.clear();
                this.f17078b.clear();
            }
            return jSONObject;
        }
        jSONObject = (JSONObject) this.f17078b.get(i2);
        if (!this.i) {
            arrayList = this.f17078b;
        }
        this.f17077a.clear();
        this.f17078b.clear();
        return jSONObject;
        arrayList.remove(i2);
        this.f17077a.clear();
        this.f17078b.clear();
        return jSONObject;
    }

    public void a(Stats.Builder builder) {
    }

    public final void a(d0 d0Var) {
        this.f17083g.add(d0Var);
    }

    public final void a(AdObjectType adobjecttype) {
        this.f17081e.add(adobjecttype);
    }

    public final void a(l lVar, String str, Object obj) {
        if (str != null && obj != null) {
            str = "(" + obj + ") " + str;
        } else if (str == null) {
            str = "(network not provided any appropriate text or code)";
        }
        a(lVar, str);
    }

    public final void a(b.a.C0189a aVar) {
        this.l = aVar;
    }

    public final void a(Long l2) {
        this.k = l2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r5 == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.w
            if (r0 != 0) goto L_0x0015
            if (r5 == 0) goto L_0x0015
            java.util.concurrent.atomic.AtomicLong r6 = r4.p
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            r6.compareAndSet(r2, r0)
            r6 = 0
        L_0x0012:
            r4.x = r6
            goto L_0x001a
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            if (r5 != 0) goto L_0x001a
            goto L_0x0012
        L_0x001a:
            r4.w = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.r.a(boolean, boolean):void");
    }

    public final boolean a(AdObjectType adobjecttype, g gVar, AdType adType) {
        try {
            if (!adobjecttype.f()) {
                return true;
            }
            int i2 = 0;
            boolean z2 = true;
            while (i2 < adobjecttype.f16572e.size()) {
                String str = (String) adobjecttype.f16572e.get(i2);
                if (!this.q.containsKey(str)) {
                    return true;
                }
                l lVar = (l) this.q.get(str);
                if (lVar == null || gVar.a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), adType, lVar.f16570c.getEcpm())) {
                    i2++;
                    z2 = false;
                } else {
                    String id = lVar.f16570c.getId();
                    try {
                        Iterator it = this.q.values().iterator();
                        while (it.hasNext()) {
                            if (((l) it.next()).f16570c.getId().equals(id)) {
                                it.remove();
                            }
                        }
                    } catch (Exception e2) {
                        Log.log(e2);
                    }
                    return true;
                }
            }
            return z2;
        } catch (Exception e3) {
            Log.log(e3);
            return true;
        }
    }

    public final void b(d0 d0Var) {
        this.f17083g.remove(d0Var);
    }

    public final void b(AdObjectType adobjecttype) {
        if (adobjecttype != null && !this.f17079c.contains(adobjecttype)) {
            this.f17079c.add(adobjecttype);
        }
    }

    public final void b(String str) {
        this.j = str;
    }

    public final boolean b() {
        return !this.f17084h && ((!this.u && !u()) || this.C);
    }

    public final void c() {
        if (this.B) {
            this.f17077a.clear();
            this.f17078b.clear();
            this.f17081e.clear();
            this.f17079c.clear();
            this.f17080d.clear();
            this.f17083g.clear();
            this.f17082f.clear();
            this.E = true;
            AdObjectType adobjecttype = this.s;
            if (adobjecttype != null) {
                adobjecttype.k();
                this.s = null;
                this.I.f17412a = null;
                this.u = false;
                this.v = false;
            }
            try {
                Iterator it = this.q.values().iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    if (lVar != null) {
                        lVar.k();
                    }
                    it.remove();
                }
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
    }

    public final void c(AdObjectType adobjecttype) {
        if (!this.f17080d.contains(adobjecttype)) {
            this.f17080d.add(adobjecttype);
        }
    }

    public final b.a.C0189a d() {
        return this.l;
    }

    public final void d(l lVar) {
        if (lVar != null) {
            Iterator it = this.f17079c.iterator();
            while (it.hasNext()) {
                l lVar2 = (l) it.next();
                if (lVar2.f16570c.getId().equals(lVar.f16570c.getId())) {
                    this.f17079c.remove(lVar2);
                    return;
                }
            }
            this.f17083g.remove(lVar);
        }
    }

    public final long e() {
        return this.n;
    }

    public abstract void e(AdObjectType adobjecttype);

    public final long f() {
        return this.o;
    }

    public final String g() {
        return this.r;
    }

    public final AdObjectType h() {
        return this.s;
    }

    public final HashMap i() {
        return this.q;
    }

    public final List<JSONObject> j() {
        return this.f17078b;
    }

    public final List<JSONObject> k() {
        return this.f17077a;
    }

    public final Long l() {
        return this.k;
    }

    public final long m() {
        return this.m;
    }

    public abstract AdType n();

    public final String o() {
        return this.j;
    }

    public final boolean p() {
        return this.u;
    }

    public final boolean q() {
        return this.f17084h;
    }

    public final boolean r() {
        return this.F;
    }

    public final boolean s() {
        return this.z;
    }

    public final boolean t() {
        return this.i;
    }

    public final boolean u() {
        return this.w && System.currentTimeMillis() - this.p.get() <= 120000;
    }

    public final boolean v() {
        return !this.C && !this.u && this.v;
    }

    public final Stats.Builder w() {
        Stats.Builder newBuilder = Stats.newBuilder();
        newBuilder.setStart(this.p.get());
        newBuilder.setSuccessful(this.u || this.v);
        newBuilder.setCompleted(this.x);
        long j2 = 0;
        Iterator it = this.f17083g.iterator();
        while (it.hasNext()) {
            f5 f5Var = (f5) it.next();
            if (f5Var.getRequestResult() == null) {
                LoadingError loadingError = LoadingError.Canceled;
                if (f5Var.getRequestResult() == null) {
                    f5Var.a(loadingError != null ? loadingError.getRequestResult() : e0.Exception);
                    f5Var.a(System.currentTimeMillis());
                }
            }
            newBuilder.addAdUnit(f5Var.a());
            j2 = Math.max(j2, f5Var.c());
        }
        newBuilder.setFinish(j2);
        a(newBuilder);
        return newBuilder;
    }

    public final Long x() {
        Long l2 = this.k;
        return Long.valueOf(l2 == null ? -1 : l2.longValue());
    }

    public final void y() {
        this.C = false;
        this.B = false;
        this.v = false;
        this.u = false;
        this.y = false;
        this.A = false;
        this.D = false;
        this.z = false;
    }

    public final void z() {
        a(true, false);
    }

    public final void a(com.appodeal.ads.waterfall_filter.a aVar) {
        d dVar = aVar.f17628e;
        this.f17077a = dVar.f17636b;
        this.f17078b = dVar.f17635a;
    }

    public final AdObjectType a(String str) {
        if (str == null || !this.q.containsKey(str)) {
            return this.s;
        }
        return (l) this.q.get(str);
    }

    public final void a(l lVar, String str) {
        if (lVar != null && lVar.getRequestResult() != e0.TimeOutReached && !this.F && !this.C) {
            Log.log(n().getDisplayName(), LogConstants.EVENT_NETWORK_ERROR, String.format("%s - %s", new Object[]{n5.a(lVar.getStatus()), str}));
        }
    }

    public final void a(JSONObject jSONObject) {
        this.G = jSONObject;
        if (jSONObject != null) {
            this.f17077a.add(jSONObject);
        }
    }
}
