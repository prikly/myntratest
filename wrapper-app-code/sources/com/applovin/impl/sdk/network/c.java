package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private String f15652a;

    /* renamed from: b  reason: collision with root package name */
    private String f15653b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f15654c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f15655d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f15656e;

    /* renamed from: f  reason: collision with root package name */
    private String f15657f;

    /* renamed from: g  reason: collision with root package name */
    private final T f15658g;

    /* renamed from: h  reason: collision with root package name */
    private final int f15659h;
    private int i;
    private final int j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        String f15660a;

        /* renamed from: b  reason: collision with root package name */
        String f15661b;

        /* renamed from: c  reason: collision with root package name */
        String f15662c;

        /* renamed from: d  reason: collision with root package name */
        Map<String, String> f15663d;

        /* renamed from: e  reason: collision with root package name */
        Map<String, String> f15664e;

        /* renamed from: f  reason: collision with root package name */
        JSONObject f15665f;

        /* renamed from: g  reason: collision with root package name */
        T f15666g;

        /* renamed from: h  reason: collision with root package name */
        int f15667h = 1;
        int i;
        int j;
        boolean k;
        boolean l;
        boolean m;
        boolean n;

        public a(n nVar) {
            this.i = ((Integer) nVar.a(b.cV)).intValue();
            this.j = ((Integer) nVar.a(b.cU)).intValue();
            this.l = ((Boolean) nVar.a(b.cT)).booleanValue();
            this.m = ((Boolean) nVar.a(b.eA)).booleanValue();
            this.n = ((Boolean) nVar.a(b.eF)).booleanValue();
            this.f15663d = CollectionUtils.map();
        }

        public a<T> a(int i2) {
            this.f15667h = i2;
            return this;
        }

        public a<T> a(T t) {
            this.f15666g = t;
            return this;
        }

        public a<T> a(String str) {
            this.f15661b = str;
            return this;
        }

        public a<T> a(Map<String, String> map) {
            this.f15663d = map;
            return this;
        }

        public a<T> a(JSONObject jSONObject) {
            this.f15665f = jSONObject;
            return this;
        }

        public a<T> a(boolean z) {
            this.k = z;
            return this;
        }

        public c<T> a() {
            return new c<>(this);
        }

        public a<T> b(int i2) {
            this.i = i2;
            return this;
        }

        public a<T> b(String str) {
            this.f15660a = str;
            return this;
        }

        public a<T> b(Map<String, String> map) {
            this.f15664e = map;
            return this;
        }

        public a<T> b(boolean z) {
            this.l = z;
            return this;
        }

        public a<T> c(int i2) {
            this.j = i2;
            return this;
        }

        public a<T> c(String str) {
            this.f15662c = str;
            return this;
        }

        public a<T> c(boolean z) {
            this.m = z;
            return this;
        }

        public a<T> d(boolean z) {
            this.n = z;
            return this;
        }
    }

    protected c(a<T> aVar) {
        this.f15652a = aVar.f15661b;
        this.f15653b = aVar.f15660a;
        this.f15654c = aVar.f15663d;
        this.f15655d = aVar.f15664e;
        this.f15656e = aVar.f15665f;
        this.f15657f = aVar.f15662c;
        this.f15658g = aVar.f15666g;
        this.f15659h = aVar.f15667h;
        this.i = aVar.f15667h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
        this.o = aVar.n;
    }

    public static <T> a<T> a(n nVar) {
        return new a<>(nVar);
    }

    public String a() {
        return this.f15652a;
    }

    public void a(int i2) {
        this.i = i2;
    }

    public void a(String str) {
        this.f15652a = str;
    }

    public String b() {
        return this.f15653b;
    }

    public void b(String str) {
        this.f15653b = str;
    }

    public Map<String, String> c() {
        return this.f15654c;
    }

    public Map<String, String> d() {
        return this.f15655d;
    }

    public JSONObject e() {
        return this.f15656e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.f15652a;
        if (str == null ? cVar.f15652a != null : !str.equals(cVar.f15652a)) {
            return false;
        }
        Map<String, String> map = this.f15654c;
        if (map == null ? cVar.f15654c != null : !map.equals(cVar.f15654c)) {
            return false;
        }
        Map<String, String> map2 = this.f15655d;
        if (map2 == null ? cVar.f15655d != null : !map2.equals(cVar.f15655d)) {
            return false;
        }
        String str2 = this.f15657f;
        if (str2 == null ? cVar.f15657f != null : !str2.equals(cVar.f15657f)) {
            return false;
        }
        String str3 = this.f15653b;
        if (str3 == null ? cVar.f15653b != null : !str3.equals(cVar.f15653b)) {
            return false;
        }
        JSONObject jSONObject = this.f15656e;
        if (jSONObject == null ? cVar.f15656e != null : !jSONObject.equals(cVar.f15656e)) {
            return false;
        }
        T t = this.f15658g;
        if (t == null ? cVar.f15658g == null : t.equals(cVar.f15658g)) {
            return this.f15659h == cVar.f15659h && this.i == cVar.i && this.j == cVar.j && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o;
        }
        return false;
    }

    public String f() {
        return this.f15657f;
    }

    public T g() {
        return this.f15658g;
    }

    public int h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f15652a;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15657f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15653b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        T t = this.f15658g;
        if (t != null) {
            i2 = t.hashCode();
        }
        int i3 = ((((((((((((((((hashCode4 + i2) * 31) + this.f15659h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0);
        Map<String, String> map = this.f15654c;
        if (map != null) {
            i3 = (i3 * 31) + map.hashCode();
        }
        Map<String, String> map2 = this.f15655d;
        if (map2 != null) {
            i3 = (i3 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f15656e;
        if (jSONObject == null) {
            return i3;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (i3 * 31) + new String(charArray).hashCode();
    }

    public int i() {
        return this.f15659h - this.i;
    }

    public int j() {
        return this.j;
    }

    public int k() {
        return this.k;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.m;
    }

    public boolean n() {
        return this.n;
    }

    public boolean o() {
        return this.o;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f15652a + ", backupEndpoint=" + this.f15657f + ", httpMethod=" + this.f15653b + ", httpHeaders=" + this.f15655d + ", body=" + this.f15656e + ", emptyResponse=" + this.f15658g + ", initialRetryAttempts=" + this.f15659h + ", retryAttemptsLeft=" + this.i + ", timeoutMillis=" + this.j + ", retryDelayMillis=" + this.k + ", exponentialRetries=" + this.l + ", retryOnAllErrors=" + this.m + ", encodingEnabled=" + this.n + ", gzipBodyEncoding=" + this.o + '}';
    }
}
