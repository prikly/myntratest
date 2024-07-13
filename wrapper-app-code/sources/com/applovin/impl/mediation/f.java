package com.applovin.impl.mediation;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, g> f14943a = Collections.synchronizedMap(CollectionUtils.map(16));

    /* renamed from: b  reason: collision with root package name */
    private final n f14944b;

    /* renamed from: c  reason: collision with root package name */
    private final v f14945c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f14946d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Class<? extends MaxAdapter>> f14947e = CollectionUtils.map();

    /* renamed from: f  reason: collision with root package name */
    private final Set<String> f14948f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final Object f14949g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final Set<a> f14950h = new HashSet();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f14951a;

        /* renamed from: b  reason: collision with root package name */
        private final String f14952b;

        /* renamed from: c  reason: collision with root package name */
        private final MaxAdFormat f14953c;

        /* renamed from: d  reason: collision with root package name */
        private final JSONObject f14954d;

        a(String str, String str2, com.applovin.impl.mediation.a.a aVar, n nVar) {
            this.f14951a = str;
            this.f14952b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f14954d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(this.f14954d, "operation", str2);
            if (aVar != null) {
                this.f14953c = aVar.getFormat();
                if (aVar.getFormat() != null) {
                    JsonUtils.putString(this.f14954d, "format", aVar.getFormat().getLabel());
                    return;
                }
                return;
            }
            this.f14953c = null;
        }

        /* access modifiers changed from: package-private */
        public JSONObject a() {
            return this.f14954d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f14951a.equals(aVar.f14951a) || !this.f14952b.equals(aVar.f14952b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f14953c;
            MaxAdFormat maxAdFormat2 = aVar.f14953c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int hashCode = ((this.f14951a.hashCode() * 31) + this.f14952b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f14953c;
            return hashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f14951a + '\'' + ", operationTag='" + this.f14952b + '\'' + ", format=" + this.f14953c + '}';
        }
    }

    public f(n nVar) {
        if (nVar != null) {
            this.f14944b = nVar;
            this.f14945c = nVar.D();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    private g a(com.applovin.impl.mediation.a.f fVar, Class<? extends MaxAdapter> cls, boolean z) {
        try {
            return new g(fVar, (MediationAdapterBase) cls.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{this.f14944b.ab()}), z, this.f14944b);
        } catch (Throwable th) {
            v.c("MediationAdapterManager", "Failed to load adapter: " + fVar, th);
            return null;
        }
    }

    private Class<? extends MaxAdapter> a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            v.i("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public g a(com.applovin.impl.mediation.a.f fVar) {
        return a(fVar, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0114, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.impl.mediation.g a(com.applovin.impl.mediation.a.f r10, boolean r11) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0118
            java.lang.String r0 = r10.S()
            java.lang.String r1 = r10.R()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r2 == 0) goto L_0x0035
            boolean r10 = com.applovin.impl.sdk.v.a()
            if (r10 == 0) goto L_0x0034
            com.applovin.impl.sdk.v r10 = r9.f14945c
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "No adapter name provided for "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", not loading the adapter "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.e(r11, r0)
        L_0x0034:
            return r3
        L_0x0035:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x005f
            boolean r10 = com.applovin.impl.sdk.v.a()
            if (r10 == 0) goto L_0x005e
            com.applovin.impl.sdk.v r10 = r9.f14945c
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to find default className for '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "'"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.e(r11, r0)
        L_0x005e:
            return r3
        L_0x005f:
            if (r11 == 0) goto L_0x006c
            java.util.Map<java.lang.String, com.applovin.impl.mediation.g> r2 = r9.f14943a
            java.lang.Object r2 = r2.get(r1)
            com.applovin.impl.mediation.g r2 = (com.applovin.impl.mediation.g) r2
            if (r2 == 0) goto L_0x006c
            return r2
        L_0x006c:
            java.lang.Object r2 = r9.f14946d
            monitor-enter(r2)
            java.util.Set<java.lang.String> r4 = r9.f14948f     // Catch:{ all -> 0x0115 }
            boolean r4 = r4.contains(r1)     // Catch:{ all -> 0x0115 }
            if (r4 != 0) goto L_0x00f0
            java.util.Map<java.lang.String, java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>> r4 = r9.f14947e     // Catch:{ all -> 0x0115 }
            boolean r4 = r4.containsKey(r1)     // Catch:{ all -> 0x0115 }
            if (r4 == 0) goto L_0x0088
            java.util.Map<java.lang.String, java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>> r4 = r9.f14947e     // Catch:{ all -> 0x0115 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0115 }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x0115 }
            goto L_0x0095
        L_0x0088:
            java.lang.Class r4 = r9.a((java.lang.String) r1)     // Catch:{ all -> 0x0115 }
            if (r4 != 0) goto L_0x0095
            java.util.Set<java.lang.String> r10 = r9.f14948f     // Catch:{ all -> 0x0115 }
            r10.add(r1)     // Catch:{ all -> 0x0115 }
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x0095:
            com.applovin.impl.mediation.g r5 = r9.a((com.applovin.impl.mediation.a.f) r10, (java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>) r4, (boolean) r11)     // Catch:{ all -> 0x0115 }
            if (r5 == 0) goto L_0x00cb
            boolean r3 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0115 }
            if (r3 == 0) goto L_0x00b9
            com.applovin.impl.sdk.v r3 = r9.f14945c     // Catch:{ all -> 0x0115 }
            java.lang.String r6 = "MediationAdapterManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r7.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r8 = "Loaded "
            r7.append(r8)     // Catch:{ all -> 0x0115 }
            r7.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0115 }
            r3.b(r6, r0)     // Catch:{ all -> 0x0115 }
        L_0x00b9:
            java.util.Map<java.lang.String, java.lang.Class<? extends com.applovin.mediation.adapter.MaxAdapter>> r0 = r9.f14947e     // Catch:{ all -> 0x0115 }
            r0.put(r1, r4)     // Catch:{ all -> 0x0115 }
            if (r11 == 0) goto L_0x00c9
            java.util.Map<java.lang.String, com.applovin.impl.mediation.g> r11 = r9.f14943a     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = r10.R()     // Catch:{ all -> 0x0115 }
            r11.put(r10, r5)     // Catch:{ all -> 0x0115 }
        L_0x00c9:
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r5
        L_0x00cb:
            boolean r10 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0115 }
            if (r10 == 0) goto L_0x00e9
            com.applovin.impl.sdk.v r10 = r9.f14945c     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r4.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = "Failed to load "
            r4.append(r5)     // Catch:{ all -> 0x0115 }
            r4.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0115 }
            r10.e(r11, r0)     // Catch:{ all -> 0x0115 }
        L_0x00e9:
            java.util.Set<java.lang.String> r10 = r9.f14948f     // Catch:{ all -> 0x0115 }
            r10.add(r1)     // Catch:{ all -> 0x0115 }
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x00f0:
            boolean r10 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0115 }
            if (r10 == 0) goto L_0x0113
            com.applovin.impl.sdk.v r10 = r9.f14945c     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r1.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r4 = "Not attempting to load "
            r1.append(r4)     // Catch:{ all -> 0x0115 }
            r1.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = " due to prior errors"
            r1.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0115 }
            r10.b(r11, r0)     // Catch:{ all -> 0x0115 }
        L_0x0113:
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x0115:
            r10 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            throw r10
        L_0x0118:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "No adapter spec specified"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.f.a(com.applovin.impl.mediation.a.f, boolean):com.applovin.impl.mediation.g");
    }

    public Collection<String> a() {
        Set unmodifiableSet;
        synchronized (this.f14946d) {
            HashSet hashSet = new HashSet(this.f14947e.size());
            for (Class<? extends MaxAdapter> name : this.f14947e.values()) {
                hashSet.add(name.getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    public void a(String str, String str2, com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f14949g) {
            this.f14944b.D();
            if (v.a()) {
                v D = this.f14944b.D();
                D.e("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f14950h.add(new a(str, str2, aVar, this.f14944b));
        }
    }

    public Collection<String> b() {
        Set<T> unmodifiableSet;
        synchronized (this.f14946d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f14948f);
        }
        return unmodifiableSet;
    }

    public Collection<JSONObject> c() {
        ArrayList arrayList;
        synchronized (this.f14949g) {
            arrayList = new ArrayList(this.f14950h.size());
            for (a a2 : this.f14950h) {
                arrayList.add(a2.a());
            }
        }
        return arrayList;
    }
}
