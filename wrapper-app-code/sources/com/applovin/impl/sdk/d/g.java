package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f15405a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Long> f15406b = CollectionUtils.map();

    public g(n nVar) {
        if (nVar != null) {
            this.f15405a = nVar;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    private void e() {
        this.f15405a.V().a((Runnable) new Runnable() {
            public void run() {
                try {
                    g.this.f15405a.a(d.q, g.this.c().toString());
                } catch (Throwable th) {
                    g.this.f15405a.D();
                    if (v.a()) {
                        g.this.f15405a.D().b("GlobalStatsManager", "Unable to save stats", th);
                    }
                }
            }
        });
    }

    public long a(f fVar) {
        return a(fVar, 1);
    }

    /* access modifiers changed from: package-private */
    public long a(f fVar, long j) {
        long longValue;
        synchronized (this.f15406b) {
            Long l = this.f15406b.get(fVar.a());
            if (l == null) {
                l = 0L;
            }
            longValue = l.longValue() + j;
            this.f15406b.put(fVar.a(), Long.valueOf(longValue));
        }
        e();
        return longValue;
    }

    public void a() {
        synchronized (this.f15406b) {
            this.f15406b.clear();
        }
        e();
    }

    public long b(f fVar) {
        long longValue;
        synchronized (this.f15406b) {
            Long l = this.f15406b.get(fVar.a());
            if (l == null) {
                l = 0L;
            }
            longValue = l.longValue();
        }
        return longValue;
    }

    public void b() {
        synchronized (this.f15406b) {
            for (f a2 : f.b()) {
                this.f15406b.remove(a2.a());
            }
            e();
        }
    }

    public void b(f fVar, long j) {
        synchronized (this.f15406b) {
            this.f15406b.put(fVar.a(), Long.valueOf(j));
        }
        e();
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject;
        synchronized (this.f15406b) {
            jSONObject = new JSONObject();
            for (Map.Entry next : this.f15406b.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
        return jSONObject;
    }

    public void c(f fVar) {
        synchronized (this.f15406b) {
            this.f15406b.remove(fVar.a());
        }
        e();
    }

    public void d() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.f15405a.b(d.q, JsonUtils.EMPTY_JSON));
            synchronized (this.f15406b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.f15406b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f15405a.D();
            if (v.a()) {
                this.f15405a.D().b("GlobalStatsManager", "Unable to load stats", th);
            }
        }
    }
}
