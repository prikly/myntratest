package com.applovin.impl.mediation.debugger.b.c;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.List;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f14702a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14703b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14704c;

    a(JSONObject jSONObject, n nVar) {
        this.f14702a = JsonUtils.getString(jSONObject, "name", "");
        this.f14703b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", (List) null);
        this.f14704c = list != null ? Utils.checkClassesExistence(list) : Utils.checkClassExistence(JsonUtils.getString(jSONObject, "existence_class", ""));
    }

    public static boolean a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || Utils.compare(str2, str) != 1) {
            return str3 == null || Utils.compare(str3, str) != -1;
        }
        return false;
    }

    public String a() {
        return this.f14702a;
    }

    public String b() {
        return this.f14703b;
    }

    public boolean c() {
        return this.f14704c;
    }
}
