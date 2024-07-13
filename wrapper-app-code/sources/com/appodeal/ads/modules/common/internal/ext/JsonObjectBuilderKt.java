package com.appodeal.ads.modules.common.internal.ext;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\u0007\u001a\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\u000b"}, d2 = {"jsonArray", "Lorg/json/JSONArray;", "method", "Lkotlin/Function1;", "Lcom/appodeal/ads/modules/common/internal/ext/JsonArrayBuilder;", "", "Lkotlin/ExtensionFunctionType;", "jsonObject", "Lorg/json/JSONObject;", "Lcom/appodeal/ads/modules/common/internal/ext/JsonObjectBuilder;", "putTo", "apd_internal"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class JsonObjectBuilderKt {
    public static final JSONArray jsonArray(Function1<? super JsonArrayBuilder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "method");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        function1.invoke(jsonArrayBuilder);
        return jsonArrayBuilder.build();
    }

    public static final JSONObject jsonObject(Function1<? super JsonObjectBuilder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "method");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder((JSONObject) null, 1, (DefaultConstructorMarker) null);
        function1.invoke(jsonObjectBuilder);
        return jsonObjectBuilder.build();
    }

    public static final JSONObject jsonObject(JSONObject jSONObject, Function1<? super JsonObjectBuilder, Unit> function1) {
        Intrinsics.checkNotNullParameter(jSONObject, "putTo");
        Intrinsics.checkNotNullParameter(function1, "method");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder(jSONObject);
        function1.invoke(jsonObjectBuilder);
        return jsonObjectBuilder.build();
    }
}
