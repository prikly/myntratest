package com.applovin.impl.mediation.debugger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.mediation.debugger.b.a.a;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.c.c;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.onesignal.OneSignalDbContract;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class b implements b.c<JSONObject> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<MaxDebuggerActivity> f14662a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f14663b = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final n f14664c;

    /* renamed from: d  reason: collision with root package name */
    private final v f14665d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f14666e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final com.applovin.impl.mediation.debugger.ui.b.b f14667f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.debugger.b.c.b> f14668g = CollectionUtils.map();

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f14669h = new AtomicBoolean();
    private boolean i;
    private int j = 2;
    private boolean k;
    private Map<String, List<?>> l;
    private final a m;

    public b(n nVar) {
        this.f14664c = nVar;
        this.f14665d = nVar.D();
        this.f14666e = nVar.P();
        com.applovin.impl.mediation.debugger.ui.b.b bVar = new com.applovin.impl.mediation.debugger.ui.b.b(this.f14666e);
        this.f14667f = bVar;
        this.m = new a(nVar, bVar);
    }

    private com.applovin.impl.mediation.debugger.b.b.b a(JSONObject jSONObject) {
        return new com.applovin.impl.mediation.debugger.b.b.b(JsonUtils.getString(jSONObject, "required_app_ads_txt_entry", ""));
    }

    private List<a> a(List<a> list, n nVar) {
        List<String> initializationAdUnitIds = nVar.q().getInitializationAdUnitIds();
        if (initializationAdUnitIds == null || initializationAdUnitIds.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(initializationAdUnitIds.size());
        for (a next : list) {
            if (initializationAdUnitIds.contains(next.a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.b.c.b> a(JSONObject jSONObject, n nVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                com.applovin.impl.mediation.debugger.b.c.b bVar = new com.applovin.impl.mediation.debugger.b.c.b(jSONObject2, nVar);
                arrayList.add(bVar);
                this.f14668g.put(bVar.m(), bVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List<a> a(JSONObject jSONObject, List<com.applovin.impl.mediation.debugger.b.c.b> list, n nVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new a(jSONObject2, this.f14668g, nVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private void a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        boolean z;
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            com.applovin.impl.mediation.debugger.b.c.b next = it.next();
            if (next.e() && next.a() == b.a.INVALID_INTEGRATION) {
                z = true;
                break;
            }
        }
        if (z) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    Activity ar = b.this.f14664c.ar();
                    if (ar == null || ar.isFinishing()) {
                        v.i("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
                    } else {
                        new AlertDialog.Builder(ar).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                b.this.c();
                            }
                        }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
                    }
                }
            }, TimeUnit.SECONDS.toMillis(2));
        }
    }

    private void f() {
        this.f14664c.ai().a(new com.applovin.impl.sdk.utils.a() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxDebuggerActivity) {
                    v.f("AppLovinSdk", "Started mediation debugger");
                    if (!b.this.g() || b.f14662a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = b.f14662a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(b.this.f14667f, b.this.f14664c.ai());
                    }
                    b.f14663b.set(false);
                }
            }

            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    v.f("AppLovinSdk", "Mediation debugger destroyed");
                    WeakReference unused = b.f14662a = null;
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean g() {
        WeakReference<MaxDebuggerActivity> weakReference = f14662a;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public List<?> a(String str) {
        Map<String, List<?>> map = this.l;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.l.get(str);
    }

    public void a() {
        if (this.f14669h.compareAndSet(false, true)) {
            this.f14664c.V().a((com.applovin.impl.sdk.e.a) new c(this, this.f14664c), o.a.MEDIATION_MAIN);
        }
    }

    public void a(int i2, String str, JSONObject jSONObject) {
        if (v.a()) {
            v vVar = this.f14665d;
            vVar.e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i2);
        }
        v.i("AppLovinSdk", "Unable to show mediation debugger.");
        this.f14667f.a((List<com.applovin.impl.mediation.debugger.b.c.b>) null, (List<a>) null, (List<a>) null, (com.applovin.impl.mediation.debugger.b.b.b) null, (String) null, (String) null, (String) null, this.f14664c);
        this.f14669h.set(false);
    }

    public void a(Map<String, List<?>> map) {
        this.l = map;
        a();
        if (g() || !f14663b.compareAndSet(false, true)) {
            v.i("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        if (!this.k) {
            f();
            this.k = true;
        }
        Intent intent = new Intent(this.f14666e, MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        v.f("AppLovinSdk", "Starting mediation debugger...");
        this.f14666e.startActivity(intent);
    }

    public void a(JSONObject jSONObject, int i2) {
        List<com.applovin.impl.mediation.debugger.b.c.b> a2 = a(jSONObject, this.f14664c);
        List<a> a3 = a(jSONObject, a2, this.f14664c);
        List<a> a4 = a(a3, this.f14664c);
        com.applovin.impl.mediation.debugger.b.b.b a5 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        List<com.applovin.impl.mediation.debugger.b.c.b> list = a2;
        com.applovin.impl.mediation.debugger.b.b.b bVar = a5;
        this.f14667f.a(list, a3, a4, bVar, JsonUtils.getString(jSONObject2, "title", (String) null), JsonUtils.getString(jSONObject2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, (String) null), JsonUtils.getString(jSONObject, "account_id", (String) null), this.f14664c);
        if (a5.e()) {
            this.m.a();
        }
        if (b()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    b.this.c();
                }
            }, TimeUnit.SECONDS.toMillis((long) this.j));
        } else {
            a(a2);
        }
    }

    public void a(boolean z, int i2) {
        this.i = z;
        this.j = i2;
    }

    public boolean b() {
        return this.i;
    }

    public void c() {
        a((Map<String, List<?>>) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f14667f + "}";
    }
}
