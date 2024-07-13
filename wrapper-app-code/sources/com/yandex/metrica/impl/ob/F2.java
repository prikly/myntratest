package com.yandex.metrica.impl.ob;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

public class F2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3984a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3985b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3986c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3987d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f3988e;

    public F2(String str, String str2, boolean z, int i, Long l) {
        this.f3984a = str;
        this.f3985b = str2;
        this.f3986c = z;
        this.f3987d = i;
        this.f3988e = l;
    }

    public static JSONArray a(Collection<F2> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (F2 next : collection) {
                next.getClass();
                JSONObject jSONObject = null;
                try {
                    jSONObject = new JSONObject().put("mac", next.f3984a).put("ssid", next.f3985b).put("signal_strength", next.f3987d).put("is_connected", next.f3986c).put("last_visible_offset_seconds", next.f3988e);
                } catch (Throwable unused) {
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }
}
