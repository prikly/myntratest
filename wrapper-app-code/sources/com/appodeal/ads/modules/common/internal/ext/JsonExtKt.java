package com.appodeal.ads.modules.common.internal.ext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0003\u001a\u001e\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"asList", "", "T", "Lorg/json/JSONArray;", "toMap", "", "", "Lorg/json/JSONObject;", "apd_internal"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class JsonExtKt {
    public static final <T> List<T> asList(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int length = jSONArray.length();
        while (i < length) {
            int i2 = i + 1;
            Object opt = jSONArray.opt(i);
            if (opt != null) {
                arrayList.add(opt);
            }
            i = i2;
        }
        return arrayList;
    }

    public static final <T> Map<String, T> toMap(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNullExpressionValue(next, "key");
            linkedHashMap.put(next, jSONObject.opt(next));
        }
        return linkedHashMap;
    }
}
