package com.appodeal.ads.modules.common.internal.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0004J\u0017\u0010\b\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0004J\u0017\u0010\t\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0004J\u0006\u0010\n\u001a\u00020\u0003¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/ext/JsonObjectBuilder;", "", "", "Lorg/json/JSONObject;", "value", "", "hasObject", "Lorg/json/JSONArray;", "hasArray", "hasValue", "build", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "apd_internal"}, k = 1, mv = {1, 6, 0})
public final class JsonObjectBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f16626a;

    public JsonObjectBuilder() {
        this((JSONObject) null, 1, (DefaultConstructorMarker) null);
    }

    public JsonObjectBuilder(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        this.f16626a = jSONObject;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsonObjectBuilder(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new JSONObject() : jSONObject);
    }

    public final JSONObject build() {
        return this.f16626a;
    }

    public final void hasArray(String str, JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (jSONArray != null) {
            this.f16626a.put(str, jSONArray);
        } else if (this.f16626a.has(str)) {
            this.f16626a.remove(str);
        }
    }

    public final void hasObject(String str, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (jSONObject != null) {
            this.f16626a.put(str, jSONObject);
        } else if (this.f16626a.has(str)) {
            this.f16626a.remove(str);
        }
    }

    public final void hasValue(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(!(obj instanceof JSONObject))) {
            throw new IllegalArgumentException("Use [hasObject] instead".toString());
        } else if (!(!(obj instanceof JSONArray))) {
            throw new IllegalArgumentException("Use [hasArray] instead".toString());
        } else if (obj != null) {
            this.f16626a.put(str, obj);
        } else if (this.f16626a.has(str)) {
            this.f16626a.remove(str);
        }
    }
}
