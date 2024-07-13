package com.applovin.impl.mediation.b;

import android.content.Context;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.mediation.a.h;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private static JSONObject f14558a;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f14559e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final MaxAdFormat f14560f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Object> f14561g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Context f14562h;
    private final a i;

    public interface a {
        void a(JSONArray jSONArray);
    }

    /* renamed from: com.applovin.impl.mediation.b.b$b  reason: collision with other inner class name */
    private static class C0143b implements g.a, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final a f14566a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f14567b;

        /* renamed from: c  reason: collision with root package name */
        private int f14568c;

        /* renamed from: d  reason: collision with root package name */
        private final AtomicBoolean f14569d;

        /* renamed from: e  reason: collision with root package name */
        private final Collection<g> f14570e;

        /* renamed from: f  reason: collision with root package name */
        private final n f14571f;

        /* renamed from: g  reason: collision with root package name */
        private final v f14572g;

        private C0143b(int i, a aVar, n nVar) {
            this.f14568c = i;
            this.f14566a = aVar;
            this.f14571f = nVar;
            this.f14572g = nVar.D();
            this.f14567b = new Object();
            this.f14570e = new ArrayList(i);
            this.f14569d = new AtomicBoolean();
        }

        /* access modifiers changed from: private */
        public void a() {
            ArrayList<g> arrayList;
            String str;
            String d2;
            synchronized (this.f14567b) {
                arrayList = new ArrayList<>(this.f14570e);
            }
            JSONArray jSONArray = new JSONArray();
            for (g gVar : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    h a2 = gVar.a();
                    jSONObject.put("name", a2.S());
                    jSONObject.put("class", a2.R());
                    jSONObject.put("adapter_version", gVar.c());
                    jSONObject.put("sdk_version", gVar.b());
                    JSONObject jSONObject2 = new JSONObject();
                    if (StringUtils.isValidString(gVar.e())) {
                        str = "error_message";
                        d2 = gVar.e();
                    } else {
                        str = "signal";
                        d2 = gVar.d();
                    }
                    jSONObject2.put(str, d2);
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (v.a()) {
                        v vVar = this.f14572g;
                        vVar.b("TaskCollectSignals", "Collected signal from " + a2);
                    }
                } catch (JSONException e2) {
                    if (v.a()) {
                        this.f14572g.b("TaskCollectSignals", "Failed to create signal data", e2);
                    }
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            a aVar = this.f14566a;
            if (aVar != null) {
                aVar.a(jSONArray);
            }
        }

        public void a(g gVar) {
            boolean z;
            synchronized (this.f14567b) {
                this.f14570e.add(gVar);
                int i = this.f14568c - 1;
                this.f14568c = i;
                z = i < 1;
            }
            if (z && this.f14569d.compareAndSet(false, true)) {
                if (!Utils.isMainThread() || !((Boolean) this.f14571f.a(com.applovin.impl.sdk.c.b.fp)).booleanValue()) {
                    a();
                } else {
                    this.f14571f.V().a((com.applovin.impl.sdk.e.a) new z(this.f14571f, new Runnable() {
                        public void run() {
                            C0143b.this.a();
                        }
                    }), o.a.MEDIATION_MAIN);
                }
            }
        }

        public void run() {
            if (this.f14569d.compareAndSet(false, true)) {
                a();
            }
        }
    }

    public b(MaxAdFormat maxAdFormat, Map<String, Object> map, Context context, n nVar, a aVar) {
        super("TaskCollectSignals", nVar);
        this.f14560f = maxAdFormat;
        this.f14561g = map;
        this.f14562h = context;
        this.i = aVar;
    }

    private void a(final h hVar, final g.a aVar) {
        if (hVar.Z()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    b.this.f15418b.H().collectSignal(b.this.f14560f, hVar, b.this.f14562h, aVar);
                }
            });
        } else {
            this.f15418b.H().collectSignal(this.f14560f, hVar, this.f14562h, aVar);
        }
    }

    private void a(String str, Throwable th) {
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str2 = this.f15419c;
            vVar2.b(str2, "No signals collected: " + str, th);
        }
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(new JSONArray());
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        C0143b bVar = new C0143b(jSONArray.length(), this.i, this.f15418b);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            a(new h(this.f14561g, jSONArray.getJSONObject(i2), jSONObject, this.f15418b), (g.a) bVar);
        }
        this.f15418b.V().a((com.applovin.impl.sdk.e.a) new z(this.f15418b, bVar), o.a.MAIN, ((Long) this.f15418b.a(com.applovin.impl.sdk.c.a.j)).longValue());
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f14559e) {
            f14558a = jSONObject;
        }
    }

    public void run() {
        String str;
        JSONArray jSONArray;
        try {
            if (((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.ff)).booleanValue()) {
                synchronized (f14559e) {
                    jSONArray = JsonUtils.getJSONArray(f14558a, "signal_providers", (JSONArray) null);
                }
                if (jSONArray != null) {
                    if (jSONArray.length() > 0) {
                        a(jSONArray, f14558a);
                        return;
                    }
                }
                v vVar = this.f15420d;
                if (v.a()) {
                    this.f15420d.d(this.f15419c, "Unable to find cached signal providers, falling back to old logic.");
                }
            }
            JSONObject jSONObject = new JSONObject((String) this.f15418b.b(d.x, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", (JSONArray) null);
            if (jSONArray2 != null) {
                if (jSONArray2.length() != 0) {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (JSONException e2) {
            th = e2;
            str = "Failed to parse signals JSON";
            a(str, th);
        } catch (InterruptedException e3) {
            th = e3;
            str = "Failed to wait for signals";
            a(str, th);
        } catch (Throwable th) {
            th = th;
            str = "Failed to collect signals";
            a(str, th);
        }
    }
}
