package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.mediation.a.f;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final n f14936a;

    /* renamed from: b  reason: collision with root package name */
    private final v f14937b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f14938c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final JSONArray f14939d = new JSONArray();

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashMap<String, Integer> f14940e = new LinkedHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final Object f14941f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private List<f> f14942g;

    public e(n nVar) {
        this.f14936a = nVar;
        this.f14937b = nVar.D();
    }

    private List<f> a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new f(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.f14936a));
        }
        return arrayList;
    }

    public void a(Activity activity) {
        if (this.f14938c.compareAndSet(false, true)) {
            String str = (String) this.f14936a.a(d.y);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<f> a2 = a(JsonUtils.getJSONArray(jSONObject, this.f14936a.N().a() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f14942g = a2;
                    this.f14936a.V().a((a) new com.applovin.impl.mediation.b.a(a2, activity, this.f14936a));
                } catch (JSONException e2) {
                    if (v.a()) {
                        this.f14937b.b("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(f fVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z;
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            synchronized (this.f14941f) {
                z = !a(fVar);
                if (z) {
                    this.f14940e.put(fVar.R(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", fVar.R());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f14939d.put(jSONObject);
                }
            }
            if (z) {
                this.f14936a.a(fVar);
                this.f14936a.H().processAdapterInitializationPostback(fVar, j, initializationStatus, str);
                this.f14936a.aj().a(initializationStatus, fVar.R());
            }
        }
    }

    public void a(f fVar, Activity activity) {
        a(fVar, activity, (Runnable) null);
    }

    public void a(f fVar, Activity activity, Runnable runnable) {
        List<f> list;
        if (this.f14936a.N().a() && (list = this.f14942g) != null) {
            Iterator<f> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                f next = it.next();
                if (next.R().equals(fVar.R())) {
                    fVar = next;
                    break;
                }
            }
        }
        if (fVar != null) {
            g a2 = this.f14936a.F().a(fVar);
            if (a2 != null) {
                if (v.a()) {
                    v vVar = this.f14937b;
                    vVar.c("MediationAdapterInitializationManager", "Initializing adapter " + fVar);
                }
                a2.a((MaxAdapterInitializationParameters) MaxAdapterParametersImpl.a(fVar), activity, runnable);
            } else if (runnable != null) {
                runnable.run();
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f14941f) {
            this.f14940e.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f14936a.aj().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }

    public boolean a() {
        return this.f14938c.get();
    }

    /* access modifiers changed from: package-private */
    public boolean a(f fVar) {
        boolean containsKey;
        synchronized (this.f14941f) {
            containsKey = this.f14940e.containsKey(fVar.R());
        }
        return containsKey;
    }

    public LinkedHashMap<String, Integer> b() {
        LinkedHashMap<String, Integer> linkedHashMap;
        synchronized (this.f14941f) {
            linkedHashMap = this.f14940e;
        }
        return linkedHashMap;
    }

    public JSONArray c() {
        JSONArray jSONArray;
        synchronized (this.f14941f) {
            jSONArray = this.f14939d;
        }
        return jSONArray;
    }
}
