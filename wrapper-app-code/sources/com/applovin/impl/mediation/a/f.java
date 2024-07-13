package com.applovin.impl.mediation.a;

import android.os.Bundle;
import com.applovin.impl.sdk.c.a;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f14444a;

    /* renamed from: b  reason: collision with root package name */
    protected final n f14445b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f14446c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f14447d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f14448e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Object f14449f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private String f14450g;

    /* renamed from: h  reason: collision with root package name */
    private String f14451h;

    public f(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        } else if (jSONObject != null) {
            this.f14445b = nVar;
            this.f14444a = jSONObject2;
            this.f14446c = jSONObject;
            this.f14447d = map;
        } else {
            throw new IllegalArgumentException("No ad object specified");
        }
    }

    private int a() {
        return b("mute_state", a("mute_state", ((Integer) this.f14445b.a(a.L)).intValue()));
    }

    public JSONObject P() {
        JSONObject jSONObject;
        synchronized (this.f14449f) {
            jSONObject = this.f14444a;
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public JSONObject Q() {
        JSONObject jSONObject;
        synchronized (this.f14448e) {
            jSONObject = this.f14446c;
        }
        return jSONObject;
    }

    public String R() {
        return b("class", (String) null);
    }

    public String S() {
        return b("name", (String) null);
    }

    public String T() {
        return S().split("_")[0];
    }

    public boolean U() {
        return b("is_testing", (Boolean) false).booleanValue();
    }

    public Boolean V() {
        String str = this.f14445b.q().getExtraParameters().get(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT);
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT) ? b(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, (Boolean) false) : a(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, (Boolean) null);
    }

    public Boolean W() {
        String str = this.f14445b.q().getExtraParameters().get(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER);
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER) ? b(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, (Boolean) false) : a(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, (Boolean) null);
    }

    public Boolean X() {
        String str = this.f14445b.q().getExtraParameters().get(AppLovinSdkExtraParameterKey.DO_NOT_SELL);
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c(AppLovinSdkExtraParameterKey.DO_NOT_SELL) ? b(AppLovinSdkExtraParameterKey.DO_NOT_SELL, (Boolean) false) : a(AppLovinSdkExtraParameterKey.DO_NOT_SELL, (Boolean) null);
    }

    public String Y() {
        return c("consent_string") ? b("consent_string", (String) null) : a("consent_string", (String) null);
    }

    public boolean Z() {
        return b("run_on_ui_thread", (Boolean) true).booleanValue();
    }

    /* access modifiers changed from: protected */
    public float a(String str, float f2) {
        float f3;
        synchronized (this.f14448e) {
            f3 = JsonUtils.getFloat(this.f14446c, str, f2);
        }
        return f3;
    }

    /* access modifiers changed from: protected */
    public int a(String str, int i) {
        int i2;
        synchronized (this.f14449f) {
            i2 = JsonUtils.getInt(this.f14444a, str, i);
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public long a(String str, long j) {
        long j2;
        synchronized (this.f14449f) {
            j2 = JsonUtils.getLong(this.f14444a, str, j);
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f14449f) {
            bool2 = JsonUtils.getBoolean(this.f14444a, str, bool);
        }
        return bool2;
    }

    /* access modifiers changed from: protected */
    public String a(String str, String str2) {
        String string;
        synchronized (this.f14449f) {
            string = JsonUtils.getString(this.f14444a, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f14449f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f14444a, str, jSONArray);
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f14448e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f14446c, str, jSONObject);
        }
        return jSONObject2;
    }

    /* access modifiers changed from: protected */
    public void a(String str, Object obj) {
        synchronized (this.f14448e) {
            JsonUtils.putObject(this.f14446c, str, obj);
        }
    }

    public Map<String, Object> aa() {
        return this.f14447d;
    }

    public Bundle ab() {
        Bundle bundle = d("server_parameters") instanceof JSONObject ? JsonUtils.toBundle(a("server_parameters", (JSONObject) null)) : new Bundle();
        int a2 = a();
        if (a2 != -1) {
            bundle.putBoolean("is_muted", a2 == 2 ? this.f14445b.q().isMuted() : a2 == 0);
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_AMOUNT)) {
            bundle.putLong(AppLovinEventParameters.REVENUE_AMOUNT, a(AppLovinEventParameters.REVENUE_AMOUNT, 0));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", a("currency", ""));
        }
        return bundle;
    }

    public Bundle ac() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), ab());
    }

    public long ad() {
        return b("adapter_timeout_ms", ((Long) this.f14445b.a(a.k)).longValue());
    }

    public long ae() {
        return b("init_completion_delay_ms", -1);
    }

    public long af() {
        return b("auto_init_delay_ms", 0);
    }

    public String ag() {
        return this.f14451h;
    }

    /* access modifiers changed from: protected */
    public int b(String str, int i) {
        int i2;
        synchronized (this.f14448e) {
            i2 = JsonUtils.getInt(this.f14446c, str, i);
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public long b(String str, long j) {
        long j2;
        synchronized (this.f14448e) {
            j2 = JsonUtils.getLong(this.f14446c, str, j);
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f14448e) {
            bool2 = JsonUtils.getBoolean(this.f14446c, str, bool);
        }
        return bool2;
    }

    /* access modifiers changed from: protected */
    public String b(String str, String str2) {
        String string;
        synchronized (this.f14448e) {
            string = JsonUtils.getString(this.f14446c, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f14448e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f14446c, str, jSONArray);
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    public void c(String str, int i) {
        synchronized (this.f14448e) {
            JsonUtils.putInt(this.f14446c, str, i);
        }
    }

    /* access modifiers changed from: protected */
    public void c(String str, long j) {
        synchronized (this.f14448e) {
            JsonUtils.putLong(this.f14446c, str, j);
        }
    }

    /* access modifiers changed from: protected */
    public void c(String str, String str2) {
        synchronized (this.f14448e) {
            JsonUtils.putString(this.f14446c, str, str2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean c(String str) {
        boolean has;
        synchronized (this.f14448e) {
            has = this.f14446c.has(str);
        }
        return has;
    }

    /* access modifiers changed from: protected */
    public Object d(String str) {
        Object opt;
        synchronized (this.f14448e) {
            opt = this.f14446c.opt(str);
        }
        return opt;
    }

    public void e(String str) {
        this.f14450g = str;
    }

    public void f(String str) {
        this.f14451h = str;
    }

    public List<String> g(String str) {
        if (str != null) {
            List optList = JsonUtils.optList(a(str, new JSONArray()), Collections.EMPTY_LIST);
            List optList2 = JsonUtils.optList(b(str, new JSONArray()), Collections.EMPTY_LIST);
            ArrayList arrayList = new ArrayList(optList.size() + optList2.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public String getAdUnitId() {
        return a("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f14450g;
    }

    public String h(String str) {
        String b2 = b(str, "");
        return StringUtils.isValidString(b2) ? b2 : a(str, "");
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + R() + "', adapterName='" + S() + "', isTesting=" + U() + '}';
    }
}
