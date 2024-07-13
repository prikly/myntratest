package com.bytedance.sdk.component.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.a.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PermissionConfig */
class v {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<b>> f18277a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final LruCache<String, c> f18278b;

    /* renamed from: c  reason: collision with root package name */
    private final k.a f18279c;

    /* renamed from: d  reason: collision with root package name */
    private final String f18280d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f18281e = false;

    /* compiled from: PermissionConfig */
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        x f18288a = x.PUBLIC;

        /* renamed from: b  reason: collision with root package name */
        Set<String> f18289b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        Set<String> f18290c = new HashSet();

        c() {
        }
    }

    v(String str, int i, k.a aVar, final Executor executor, JSONObject jSONObject) {
        this.f18280d = str;
        if (i <= 0) {
            this.f18278b = new LruCache<>(16);
        } else {
            this.f18278b = new LruCache<>(i);
        }
        this.f18279c = aVar;
        if (jSONObject == null) {
            aVar.a(d(str), (k.a.C0224a) new k.a.C0224a() {
            });
        } else {
            a(jSONObject);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        b(jSONObject);
        this.f18279c.a(d(this.f18280d), jSONObject.toString());
    }

    /* access modifiers changed from: package-private */
    public c a(String str, Set<String> set) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String builder = new Uri.Builder().scheme(scheme).authority(authority).path(parse.getPath()).toString();
        c cVar = new c();
        if (authority == null || authority.isEmpty()) {
            cVar.f18288a = x.PUBLIC;
            return cVar;
        }
        for (String next : set) {
            if (!authority.equals(next)) {
                if (authority.endsWith("." + next)) {
                }
            }
            cVar.f18288a = x.PRIVATE;
            return cVar;
        }
        c cVar2 = this.f18278b.get(builder);
        if (cVar2 != null) {
            return cVar2;
        }
        return a(builder);
    }

    private void b(JSONObject jSONObject) {
        this.f18277a.clear();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(AppLovinEventTypes.USER_VIEWED_CONTENT);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject2.getJSONArray(next);
                LinkedList linkedList = new LinkedList();
                this.f18277a.put(next, linkedList);
                for (int i = 0; i < jSONArray.length(); i++) {
                    linkedList.add(c(jSONArray.getJSONObject(i)));
                }
            }
        } catch (JSONException e2) {
            i.b("Parse configurations failed, response: " + jSONObject.toString(), e2);
        }
        this.f18281e = true;
    }

    private c a(String str) throws a {
        c cVar = new c();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String b2 = b(authority);
        if (TextUtils.isEmpty(scheme) || TextUtils.isEmpty(authority) || b2 == null) {
            cVar.f18288a = x.PUBLIC;
            return cVar;
        }
        List<b> c2 = c(b2);
        if (c2 == null) {
            return cVar;
        }
        for (b next : c2) {
            if (next.f18284a.matcher(str).find()) {
                if (next.f18285b.compareTo(cVar.f18288a) >= 0) {
                    cVar.f18288a = next.f18285b;
                }
                cVar.f18289b.addAll(next.f18286c);
                cVar.f18290c.addAll(next.f18287d);
            }
        }
        this.f18278b.put(str, cVar);
        return cVar;
    }

    /* compiled from: PermissionConfig */
    static class a extends IllegalStateException {
        a(String str) {
            super(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r1 = r4.split("[.]");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "[.]"
            java.lang.String[] r1 = r4.split(r1)
            int r2 = r1.length
            r3 = 2
            if (r2 >= r3) goto L_0x000f
            return r0
        L_0x000f:
            if (r2 != r3) goto L_0x0012
            return r4
        L_0x0012:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r0 = r2 + -2
            r0 = r1[r0]
            r4.append(r0)
            java.lang.String r0 = "."
            r4.append(r0)
            int r2 = r2 + -1
            r0 = r1[r2]
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.a.v.b(java.lang.String):java.lang.String");
    }

    private List<b> c(String str) throws a {
        if (this.f18281e) {
            return this.f18277a.get(str);
        }
        throw new a("Permission config is outdated!");
    }

    private static b c(JSONObject jSONObject) throws JSONException {
        b bVar = new b();
        bVar.f18284a = Pattern.compile(jSONObject.getString("pattern"));
        bVar.f18285b = x.a(jSONObject.getString("group"));
        bVar.f18286c = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("included_methods");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                bVar.f18286c.add(optJSONArray.getString(i));
            }
        }
        bVar.f18287d = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("excluded_methods");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                bVar.f18287d.add(optJSONArray2.getString(i2));
            }
        }
        return bVar;
    }

    private static String d(String str) {
        return "com.bytedance.ies.web.jsbridge2.PermissionConfig." + str;
    }

    /* compiled from: PermissionConfig */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        Pattern f18284a;

        /* renamed from: b  reason: collision with root package name */
        x f18285b;

        /* renamed from: c  reason: collision with root package name */
        List<String> f18286c;

        /* renamed from: d  reason: collision with root package name */
        List<String> f18287d;

        private b() {
        }
    }
}
