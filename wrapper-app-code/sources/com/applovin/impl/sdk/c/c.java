package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    protected final n f15347a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f15348b;

    /* renamed from: c  reason: collision with root package name */
    protected final SharedPreferences f15349c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f15350d = CollectionUtils.map();

    /* renamed from: e  reason: collision with root package name */
    private final Object f15351e = new Object();

    public c(n nVar) {
        this.f15347a = nVar;
        Context P = nVar.P();
        this.f15348b = P;
        this.f15349c = P.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(b.class.getName());
            Class.forName(a.class.getName());
        } catch (Throwable unused) {
        }
        b();
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    private String e() {
        return "com.applovin.sdk." + Utils.shortenKey(this.f15347a.C()) + ".";
    }

    public <T> b<T> a(String str, b<T> bVar) {
        synchronized (this.f15351e) {
            for (b<T> next : b.c()) {
                if (next.a().equals(str)) {
                    return next;
                }
            }
            return bVar;
        }
    }

    public <T> T a(b<T> bVar) {
        if (bVar != null) {
            synchronized (this.f15351e) {
                Object obj = this.f15350d.get(bVar.a());
                if (obj == null) {
                    T b2 = bVar.b();
                    return b2;
                }
                T a2 = bVar.a(obj);
                return a2;
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    public void a() {
        String e2 = e();
        synchronized (this.f15351e) {
            SharedPreferences.Editor edit = this.f15349c.edit();
            for (b next : b.c()) {
                Object obj = this.f15350d.get(next.a());
                if (obj != null) {
                    this.f15347a.a(e2 + next.a(), obj, edit);
                }
            }
            edit.apply();
        }
    }

    public <T> void a(b<?> bVar, Object obj) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        } else if (obj != null) {
            synchronized (this.f15351e) {
                this.f15350d.put(bVar.a(), obj);
            }
        } else {
            throw new IllegalArgumentException("No new value specified");
        }
    }

    public void a(JSONObject jSONObject) {
        String str;
        String str2;
        synchronized (this.f15351e) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        b<Boolean> a2 = a(next, (b) null);
                        if (a2 != null) {
                            Object a3 = a(next, jSONObject, a2.b());
                            this.f15350d.put(a2.a(), a3);
                            if (a2 == b.eC) {
                                this.f15350d.put(b.eD.a(), Long.valueOf(System.currentTimeMillis()));
                            } else if (a2 == b.at) {
                                try {
                                    CollectionUtils.setShouldUseArrayMap(b.at.a(a3).booleanValue());
                                } catch (Throwable unused) {
                                    v.i("SettingsManager", "Failed to update \"uam\" setting for static contexts");
                                }
                            }
                        }
                    } catch (JSONException e2) {
                        th = e2;
                        str = "SettingsManager";
                        str2 = "Unable to parse JSON settingsValues array";
                    } catch (Throwable th) {
                        th = th;
                        str = "SettingsManager";
                        str2 = "Unable to convert setting object ";
                    }
                }
            }
        }
        return;
        v.c(str, str2, th);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.applovin.impl.sdk.c.b<java.lang.String>, com.applovin.impl.sdk.c.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> b(com.applovin.impl.sdk.c.b<java.lang.String> r1) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r1 = com.applovin.impl.sdk.utils.CollectionUtils.explode(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.c.c.b(com.applovin.impl.sdk.c.b):java.util.List");
    }

    public void b() {
        String e2 = e();
        synchronized (this.f15351e) {
            for (b next : b.c()) {
                try {
                    String a2 = next.a();
                    Object a3 = this.f15347a.a(e2 + a2, null, next.b().getClass(), this.f15349c);
                    if (a3 != null) {
                        this.f15350d.put(next.a(), a3);
                    }
                } catch (Exception e3) {
                    v.c("SettingsManager", "Unable to load \"" + next.a() + "\"", e3);
                }
            }
        }
    }

    public List<MaxAdFormat> c(b<String> bVar) {
        ArrayList arrayList = new ArrayList(6);
        for (String formatFromString : b(bVar)) {
            arrayList.add(MaxAdFormat.formatFromString(formatFromString));
        }
        return arrayList;
    }

    public void c() {
        synchronized (this.f15351e) {
            this.f15350d.clear();
        }
        this.f15347a.a(this.f15349c);
    }

    public boolean d() {
        return this.f15347a.q().isVerboseLoggingEnabled() || ((Boolean) a(b.ae)).booleanValue();
    }
}
