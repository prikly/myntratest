package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

public class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final long f15714a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: e  reason: collision with root package name */
    private final AtomicLong f15715e = new AtomicLong();

    /* renamed from: f  reason: collision with root package name */
    private final f f15716f;

    /* renamed from: g  reason: collision with root package name */
    private final v f15717g;

    g(f fVar, n nVar) {
        super("PersistentPostbackQueueSaveTask", nVar);
        this.f15717g = nVar.D();
        this.f15716f = fVar;
    }

    private void a(List<h> list) {
        JSONArray jSONArray = new JSONArray();
        for (h n : list) {
            try {
                jSONArray.put(n.n());
            } catch (Throwable th) {
                if (v.a()) {
                    this.f15717g.b("PersistentPostbackQueueSaveTask", "Unable to serialize postback request to JSON.", th);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pb", jSONArray);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
            r ae = this.f15418b.ae();
            ae.a((InputStream) byteArrayInputStream, ae.a("persistent_postback_cache.json", this.f15418b.P()));
            if (v.a()) {
                this.f15717g.b("PersistentPostbackQueueSaveTask", "Wrote updated postback queue to disk.");
            }
        } catch (Throwable th2) {
            if (v.a()) {
                this.f15717g.b("PersistentPostbackQueueSaveTask", "Failed to persist postbacks", th2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<h> a(int i) {
        ArrayList<h> arrayList = new ArrayList<>();
        try {
            r ae = this.f15418b.ae();
            if (ae.b("persistent_postback_cache.json", this.f15418b.P())) {
                String a2 = ae.a(ae.a("persistent_postback_cache.json", this.f15418b.P()));
                if (StringUtils.isValidString(a2)) {
                    JSONArray jSONArray = new JSONObject(a2).getJSONArray("pb");
                    if (v.a()) {
                        v vVar = this.f15717g;
                        vVar.b("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s).");
                    }
                    arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
                    int intValue = ((Integer) this.f15418b.a(b.cQ)).intValue();
                    for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                        h hVar = new h(jSONArray.getJSONObject(i2), this.f15418b);
                        if (hVar.k() < intValue) {
                            arrayList.add(hVar);
                        } else if (v.a()) {
                            v vVar2 = this.f15717g;
                            vVar2.b("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + hVar);
                        }
                    }
                    if (v.a()) {
                        v vVar3 = this.f15717g;
                        vVar3.b("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
                    }
                }
            }
        } catch (Throwable th) {
            if (v.a()) {
                this.f15717g.b("PersistentPostbackQueueSaveTask", "Failed to deserialize postback queue", th);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f15715e.set(System.currentTimeMillis());
        this.f15418b.V().a((a) this, o.a.POSTBACKS, f15714a);
    }

    public void run() {
        if (this.f15716f.a() > this.f15715e.get()) {
            a(this.f15716f.b());
        }
        a();
    }
}
