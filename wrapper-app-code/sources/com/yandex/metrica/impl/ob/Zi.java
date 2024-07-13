package com.yandex.metrica.impl.ob;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

class Zi {
    Zi() {
    }

    /* access modifiers changed from: package-private */
    public If.y[] a(JSONArray jSONArray) {
        int i;
        if (jSONArray == null) {
            return new If.y[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                Integer num = null;
                Integer a2 = Tl.a(jSONObject, "type", (Integer) null);
                if (a2 != null) {
                    int intValue = a2.intValue();
                    if (intValue == 0) {
                        i = 0;
                    } else if (intValue == 1) {
                        i = 1;
                    } else if (intValue == 2) {
                        i = 2;
                    } else if (intValue == 3) {
                        i = 3;
                    }
                    num = i;
                }
                String b2 = Tl.b(jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (!(num == null || b2 == null)) {
                    If.y yVar = new If.y();
                    yVar.f4259a = num.intValue();
                    yVar.f4260b = b2;
                    arrayList.add(yVar);
                }
            } catch (Throwable unused) {
            }
        }
        return (If.y[]) arrayList.toArray(new If.y[0]);
    }
}
