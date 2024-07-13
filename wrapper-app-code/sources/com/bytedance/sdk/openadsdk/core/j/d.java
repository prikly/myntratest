package com.bytedance.sdk.openadsdk.core.j;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.j.b.a;
import com.bytedance.sdk.openadsdk.core.j.b.b;
import com.bytedance.sdk.openadsdk.core.j.b.c;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VideoTrackers */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public List<c> f1341a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<c> f1342b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<c> f1343c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<c> f1344d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public List<c> f1345e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public List<c> f1346f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public List<c> f1347g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public List<c> f1348h = new ArrayList();
    public List<c> i = new ArrayList();
    public List<c> j = new ArrayList();
    public List<b> k = new ArrayList();
    public List<a> l = new ArrayList();
    private a m;
    private final AtomicBoolean n = new AtomicBoolean(false);
    private long o;
    private n p;
    private boolean q;
    private boolean r;
    private boolean s;
    private String t;

    public d(a aVar) {
        this.m = aVar;
    }

    public void a(com.bytedance.sdk.openadsdk.core.j.a.a aVar) {
        a(-1, this.f1341a, aVar);
    }

    public void a(long j2) {
        if (this.n.compareAndSet(false, true)) {
            a(j2, this.f1342b, (com.bytedance.sdk.openadsdk.core.j.a.a) null);
        }
    }

    public void b(long j2) {
        a(j2, this.f1343c, (com.bytedance.sdk.openadsdk.core.j.a.a) null);
    }

    public void c(long j2) {
        a(j2, this.f1344d, (com.bytedance.sdk.openadsdk.core.j.a.a) null);
    }

    public void d(long j2) {
        a(j2, this.f1345e, (com.bytedance.sdk.openadsdk.core.j.a.a) null);
    }

    public void e(long j2) {
        a(j2, this.f1346f, (com.bytedance.sdk.openadsdk.core.j.a.a) null);
    }

    public void f(long j2) {
        a(j2, this.f1347g, (com.bytedance.sdk.openadsdk.core.j.a.a) null);
    }

    public void g(long j2) {
        a(j2, this.f1348h, (com.bytedance.sdk.openadsdk.core.j.a.a) null);
    }

    public void h(long j2) {
        a(j2, this.i, (com.bytedance.sdk.openadsdk.core.j.a.a) null);
    }

    public void i(long j2) {
        a(j2, this.j, (com.bytedance.sdk.openadsdk.core.j.a.a) null);
    }

    public void a(long j2, long j3) {
        if (System.currentTimeMillis() - this.o >= 1000 && j2 >= 0 && j3 > 0) {
            this.o = System.currentTimeMillis();
            float f2 = ((float) j2) / ((float) j3);
            a(j2, a(j2, f2), (com.bytedance.sdk.openadsdk.core.j.a.a) null);
            if (f2 >= 0.25f && !this.q) {
                b("firstQuartile");
                this.q = true;
            } else if (f2 >= 0.5f && !this.r) {
                b("midpoint");
                this.r = true;
            } else if (f2 >= 0.75f && !this.s) {
                b("thirdQuartile");
                this.s = true;
            }
        }
    }

    private void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", str);
            e.b(m.a(), this.p, this.t, "vast_play_track", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void a(long j2, List<c> list, com.bytedance.sdk.openadsdk.core.j.a.a aVar) {
        a aVar2 = this.m;
        c.b(list, aVar, j2, aVar2 != null ? aVar2.g() : null);
    }

    public List<c> a(long j2, float f2) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            b bVar = this.k.get(i2);
            if (bVar.a(f2)) {
                arrayList.add(bVar);
            }
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            a aVar = this.l.get(i3);
            if (aVar.a(j2)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public void a(List<c> list) {
        this.f1342b.addAll(list);
    }

    public void b(List<c> list) {
        this.f1343c.addAll(list);
    }

    public void c(List<c> list) {
        this.f1344d.addAll(list);
    }

    public void d(List<c> list) {
        this.f1345e.addAll(list);
    }

    public void e(List<c> list) {
        this.f1346f.addAll(list);
    }

    public void f(List<c> list) {
        this.f1347g.addAll(list);
    }

    public void g(List<c> list) {
        this.f1348h.addAll(list);
    }

    public void h(List<b> list) {
        this.k.addAll(list);
        Collections.sort(this.k);
    }

    public void i(List<a> list) {
        this.l.addAll(list);
        Collections.sort(this.l);
    }

    public void j(List<c> list) {
        this.f1341a.addAll(list);
    }

    public void k(List<c> list) {
        this.i.addAll(list);
    }

    public void l(List<c> list) {
        this.j.addAll(list);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", c.b(this.f1341a));
        jSONObject.put("impressionTrackers", c.b(this.f1342b));
        jSONObject.put("pauseTrackers", c.b(this.f1343c));
        jSONObject.put("resumeTrackers", c.b(this.f1344d));
        jSONObject.put("completeTrackers", c.b(this.f1345e));
        jSONObject.put("closeTrackers", c.b(this.f1346f));
        jSONObject.put("skipTrackers", c.b(this.f1347g));
        jSONObject.put("clickTrackers", c.b(this.f1348h));
        jSONObject.put("muteTrackers", c.b(this.i));
        jSONObject.put("unMuteTrackers", c.b(this.j));
        jSONObject.put("fractionalTrackers", b());
        jSONObject.put("absoluteTrackers", c());
        return jSONObject;
    }

    private JSONArray b() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (b b2 : this.k) {
            jSONArray.put(b2.b());
        }
        return jSONArray;
    }

    private JSONArray c() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (a a2 : this.l) {
            jSONArray.put(a2.a());
        }
        return jSONArray;
    }

    public void a(JSONObject jSONObject) {
        j(c.a(jSONObject.optJSONArray("errorTrackers")));
        a(c.a(jSONObject.optJSONArray("impressionTrackers")));
        b(c.a(jSONObject.optJSONArray("pauseTrackers"), true));
        c(c.a(jSONObject.optJSONArray("resumeTrackers"), true));
        d(c.a(jSONObject.optJSONArray("completeTrackers")));
        e(c.a(jSONObject.optJSONArray("closeTrackers")));
        f(c.a(jSONObject.optJSONArray("skipTrackers")));
        g(c.a(jSONObject.optJSONArray("clickTrackers")));
        k(c.a(jSONObject.optJSONArray("muteTrackers"), true));
        l(c.a(jSONObject.optJSONArray("unMuteTrackers"), true));
        h(c.b(jSONObject.optJSONArray("fractionalTrackers")));
        i(c.c(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void a(n nVar) {
        this.p = nVar;
    }

    public void a(String str) {
        this.t = str;
    }

    public void a(String str, long j2) {
        if (!TextUtils.isEmpty(str) && j2 >= 0) {
            i((List<a>) Collections.singletonList(new a.C0006a(str, j2).a()));
        }
    }

    public void a(String str, float f2) {
        if (!TextUtils.isEmpty(str) && f2 >= 0.0f) {
            h((List<b>) Collections.singletonList(new b.a(str, f2).a()));
        }
    }

    public void a(d dVar) {
        j(dVar.f1341a);
        a(dVar.f1342b);
        b(dVar.f1343c);
        c(dVar.f1344d);
        d(dVar.f1345e);
        e(dVar.f1346f);
        f(dVar.f1347g);
        g(dVar.f1348h);
        k(dVar.i);
        l(dVar.j);
        h(dVar.k);
        i(dVar.l);
    }
}
