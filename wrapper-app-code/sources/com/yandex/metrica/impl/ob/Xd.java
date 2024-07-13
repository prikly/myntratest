package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.text.TextUtils;
import org.json.JSONObject;

public final class Xd implements W<C0357ee> {
    public Object invoke(Object obj) {
        ContentValues contentValues = (ContentValues) obj;
        String asString = contentValues.getAsString("tracking_id");
        if (TextUtils.isEmpty(asString)) {
            C0420h2.b("Tracking id is empty", new Object[0]);
            return null;
        }
        try {
            String asString2 = contentValues.getAsString("additional_params");
            if (TextUtils.isEmpty(asString2)) {
                C0420h2.b("No additional params", new Object[0]);
                return null;
            }
            JSONObject jSONObject = new JSONObject(asString2);
            if (jSONObject.length() == 0) {
                C0420h2.b("Additional params are empty", new Object[0]);
                return null;
            }
            C0420h2.a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
            return new C0357ee(asString, jSONObject, true, false, C0736u0.RETAIL);
        } catch (Throwable th) {
            C0420h2.a(th, "Could not parse additional parameters", new Object[0]);
            return null;
        }
    }
}
