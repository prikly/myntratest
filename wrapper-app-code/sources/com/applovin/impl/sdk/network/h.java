package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private String f15718a;

    /* renamed from: b  reason: collision with root package name */
    private String f15719b;

    /* renamed from: c  reason: collision with root package name */
    private String f15720c;

    /* renamed from: d  reason: collision with root package name */
    private String f15721d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f15722e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f15723f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f15724g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15725h;
    private boolean i;
    private boolean j;
    private String k;
    private int l;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f15726a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f15727b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f15728c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f15729d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Map<String, String> f15730e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f15731f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Map<String, Object> f15732g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public boolean f15733h;
        /* access modifiers changed from: private */
        public boolean i;
        /* access modifiers changed from: private */
        public boolean j;

        public a a(String str) {
            this.f15726a = str;
            return this;
        }

        public a a(Map<String, String> map) {
            this.f15730e = map;
            return this;
        }

        public a a(boolean z) {
            this.f15733h = z;
            return this;
        }

        public h a() {
            return new h(this);
        }

        public a b(String str) {
            this.f15727b = str;
            return this;
        }

        public a b(Map<String, String> map) {
            this.f15731f = map;
            return this;
        }

        public a b(boolean z) {
            this.i = z;
            return this;
        }

        public a c(String str) {
            this.f15728c = str;
            return this;
        }

        public a c(Map<String, Object> map) {
            this.f15732g = map;
            return this;
        }

        public a c(boolean z) {
            this.j = z;
            return this;
        }

        public a d(String str) {
            this.f15729d = str;
            return this;
        }
    }

    private h(a aVar) {
        this.f15718a = UUID.randomUUID().toString();
        this.f15719b = aVar.f15727b;
        this.f15720c = aVar.f15728c;
        this.f15721d = aVar.f15729d;
        this.f15722e = aVar.f15730e;
        this.f15723f = aVar.f15731f;
        this.f15724g = aVar.f15732g;
        this.f15725h = aVar.f15733h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.f15726a;
        this.l = 0;
    }

    h(JSONObject jSONObject, n nVar) throws Exception {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        JsonUtils.getString(jSONObject, "httpMethod", "");
        String string3 = jSONObject.getString("targetUrl");
        String string4 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i2 = jSONObject.getInt("attemptNumber");
        Map<String, String> synchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : CollectionUtils.map();
        Map<String, String> synchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : CollectionUtils.map();
        Map<String, Object> synchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : CollectionUtils.map();
        this.f15718a = string;
        this.k = string2;
        this.f15720c = string3;
        this.f15721d = string4;
        this.f15722e = synchronizedMap;
        this.f15723f = synchronizedMap2;
        this.f15724g = synchronizedMap3;
        this.f15725h = jSONObject.optBoolean("isEncodingEnabled", false);
        this.i = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.j = jSONObject.optBoolean("shouldFireInWebView", false);
        this.l = i2;
    }

    public static a o() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f15719b;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f15720c;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f15721d;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> d() {
        return this.f15722e;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> e() {
        return this.f15723f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f15718a.equals(((h) obj).f15718a);
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> f() {
        return this.f15724g;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.f15725h;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.i;
    }

    public int hashCode() {
        return this.f15718a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public String j() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.l++;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        Map<String, String> map = CollectionUtils.map(this.f15722e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f15722e = map;
    }

    /* access modifiers changed from: package-private */
    public JSONObject n() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f15718a);
        jSONObject.put("communicatorRequestId", this.k);
        jSONObject.put("httpMethod", this.f15719b);
        jSONObject.put("targetUrl", this.f15720c);
        jSONObject.put("backupUrl", this.f15721d);
        jSONObject.put("isEncodingEnabled", this.f15725h);
        jSONObject.put("gzipBodyEncoding", this.i);
        jSONObject.put("attemptNumber", this.l);
        if (this.f15722e != null) {
            jSONObject.put("parameters", new JSONObject(this.f15722e));
        }
        if (this.f15723f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f15723f));
        }
        if (this.f15724g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f15724g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f15718a + '\'' + ", communicatorRequestId='" + this.k + '\'' + ", httpMethod='" + this.f15719b + '\'' + ", targetUrl='" + this.f15720c + '\'' + ", backupUrl='" + this.f15721d + '\'' + ", attemptNumber=" + this.l + ", isEncodingEnabled=" + this.f15725h + ", isGzipBodyEncoding=" + this.i + '}';
    }
}
