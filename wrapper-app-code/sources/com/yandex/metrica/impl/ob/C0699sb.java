package com.yandex.metrica.impl.ob;

import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.sb  reason: case insensitive filesystem */
public final class C0699sb {

    /* renamed from: a  reason: collision with root package name */
    private final String f6777a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6778b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6779c;

    public C0699sb(JSONObject jSONObject) throws JSONException {
        this.f6777a = jSONObject.getString("name");
        this.f6779c = jSONObject.getBoolean("required");
        this.f6778b = jSONObject.optInt(MediationMetaData.KEY_VERSION, -1);
    }

    public JSONObject a() throws JSONException {
        JSONObject put = new JSONObject().put("name", this.f6777a).put("required", this.f6779c);
        int i = this.f6778b;
        if (i != -1) {
            put.put(MediationMetaData.KEY_VERSION, i);
        }
        return put;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0699sb.class != obj.getClass()) {
            return false;
        }
        C0699sb sbVar = (C0699sb) obj;
        if (this.f6778b != sbVar.f6778b || this.f6779c != sbVar.f6779c) {
            return false;
        }
        String str = this.f6777a;
        String str2 = sbVar.f6777a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6777a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f6778b) * 31) + (this.f6779c ? 1 : 0);
    }

    public C0699sb(String str, int i, boolean z) {
        this.f6777a = str;
        this.f6778b = i;
        this.f6779c = z;
    }
}
