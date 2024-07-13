package com.yandex.metrica.impl.ob;

import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kk  reason: case insensitive filesystem */
public class C0512kk {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList<JSONObject> f6101a;

    /* renamed from: b  reason: collision with root package name */
    private final C0277b9 f6102b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedList<String> f6103c;

    /* renamed from: d  reason: collision with root package name */
    private final Gk f6104d;

    /* renamed from: e  reason: collision with root package name */
    private int f6105e;

    C0512kk(int i, C0277b9 b9Var) {
        this(i, b9Var, new C0388fk());
    }

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        if (this.f6101a.size() == this.f6105e) {
            JSONObject removeLast = this.f6101a.removeLast();
            this.f6103c.removeLast();
        }
        String jSONObject2 = jSONObject.toString();
        this.f6101a.addFirst(jSONObject);
        this.f6103c.addFirst(jSONObject2);
        if (!this.f6103c.isEmpty()) {
            this.f6102b.a((List<String>) this.f6103c);
        }
    }

    public List<JSONObject> b() {
        return this.f6101a;
    }

    C0512kk(int i, C0277b9 b9Var, Gk gk) {
        this.f6101a = new LinkedList<>();
        this.f6103c = new LinkedList<>();
        this.f6105e = i;
        this.f6102b = b9Var;
        this.f6104d = gk;
        a(b9Var);
    }

    private void a(C0277b9 b9Var) {
        List<String> h2 = b9Var.h();
        for (int max = Math.max(0, h2.size() - this.f6105e); max < h2.size(); max++) {
            String str = h2.get(max);
            try {
                this.f6101a.addLast(new JSONObject(str));
                this.f6103c.addLast(str);
            } catch (Throwable unused) {
            }
        }
    }

    public JSONObject a() {
        return this.f6104d.a(new JSONArray(this.f6101a));
    }
}
