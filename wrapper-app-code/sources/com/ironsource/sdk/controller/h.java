package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.onesignal.outcomes.data.OutcomeEventsTable;
import org.json.JSONException;
import org.json.JSONObject;

final class h {

    /* renamed from: c  reason: collision with root package name */
    private static final String f9198c = h.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private final d f9199a;

    /* renamed from: b  reason: collision with root package name */
    private final t f9200b;

    h(d dVar, t tVar) {
        this.f9199a = dVar;
        this.f9200b = tVar;
    }

    private static String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put(OutcomeEventsTable.COLUMN_NAME_PARAMS, SDKUtils.encodeString(str2));
            jSONObject.put("hash", SDKUtils.encodeString(str3));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public final void messageHandler(String str, String str2, String str3) {
        try {
            String str4 = f9198c;
            Logger.i(str4, "messageHandler(" + str + " " + str3 + ")");
            if (this.f9200b.a(str, str2, str3)) {
                this.f9199a.a(str, str2);
                return;
            }
            d dVar = this.f9199a;
            String a2 = a(str, str2, str3);
            if (dVar.f9111a != null) {
                x.d dVar2 = dVar.f9111a;
                x.this.b(x.a("unauthorizedMessage", a2, (String) null, (String) null));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            String str5 = f9198c;
            Logger.i(str5, "messageHandler failed with exception " + e2.getMessage());
        }
    }
}
