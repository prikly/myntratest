package com.ironsource.sdk.c;

import com.google.android.gms.plus.PlusShare;
import com.ironsource.sdk.a;
import com.onesignal.outcomes.data.OutcomeEventsTable;
import io.bidmachine.utils.IabUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9061a = d.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static d f9062c = null;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, e> f9063b = Collections.synchronizedMap(new HashMap());

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f9062c == null) {
                f9062c = new d();
            }
            dVar = f9062c;
        }
        return dVar;
    }

    public static String a(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has(OutcomeEventsTable.COLUMN_NAME_PARAMS)) ? "" : new JSONObject(jSONObject.getString(OutcomeEventsTable.COLUMN_NAME_PARAMS)).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public static boolean b(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean("shouldCreateContainer");
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static a d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("adSize"));
            String obj = jSONObject2.get(IabUtils.KEY_HEIGHT).toString();
            String obj2 = jSONObject2.get(IabUtils.KEY_WIDTH).toString();
            return new a(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get(PlusShare.KEY_CALL_TO_ACTION_LABEL).toString());
        } catch (Exception unused) {
            return new a();
        }
    }

    public final e a(String str) {
        if (str.isEmpty() || !this.f9063b.containsKey(str)) {
            return null;
        }
        return this.f9063b.get(str);
    }

    public a c(JSONObject jSONObject) {
        a aVar = new a();
        try {
            return d(jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
            return aVar;
        }
    }
}
