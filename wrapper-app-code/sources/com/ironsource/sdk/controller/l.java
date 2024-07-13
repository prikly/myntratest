package com.ironsource.sdk.controller;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.h.b;
import com.ironsource.sdk.h.c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

final class l {

    /* renamed from: a  reason: collision with root package name */
    String f9214a;

    /* renamed from: b  reason: collision with root package name */
    b f9215b;

    l(String str, b bVar) {
        this.f9214a = str;
        this.f9215b = bVar;
    }

    static c a(JSONObject jSONObject, String str) {
        if (!jSONObject.has("filePath") || !jSONObject.has("fileName")) {
            throw new Exception("Missing params for file");
        }
        String string = jSONObject.getString("filePath");
        return new c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString("fileName"));
    }

    static JSONObject a(n nVar, long j) {
        try {
            return nVar.a().put(IronSourceConstants.EVENTS_RESULT, j);
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    static JSONObject a(n nVar, String str) {
        try {
            return nVar.a().put("errMsg", str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    static JSONObject a(n nVar, JSONObject jSONObject) {
        try {
            return nVar.a().put(IronSourceConstants.EVENTS_RESULT, jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    static c b(JSONObject jSONObject, String str) {
        if (jSONObject.has("folderPath")) {
            return new c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString("folderPath")));
        }
        throw new Exception("Missing params for folder");
    }
}
