package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0754ui;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Tl;
import org.json.JSONObject;

public class Wi {

    /* renamed from: a  reason: collision with root package name */
    private static final If.u f5266a = new If.u();

    public C0754ui a(Tl.a aVar, String str) {
        C0754ui.a aVar2;
        JSONObject optJSONObject = aVar.optJSONObject(str);
        C0754ui.a aVar3 = null;
        if (optJSONObject == null) {
            return null;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("cell");
        if (optJSONObject2 != null) {
            If.u uVar = f5266a;
            aVar2 = new C0754ui.a(optJSONObject2.optInt("refresh_event_count", uVar.f4238a), optJSONObject2.optLong("refresh_period_seconds", uVar.f4239b));
        } else {
            aVar2 = null;
        }
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("wifi");
        if (optJSONObject3 != null) {
            If.u uVar2 = f5266a;
            aVar3 = new C0754ui.a(optJSONObject3.optInt("refresh_event_count", uVar2.f4238a), optJSONObject3.optLong("refresh_period_seconds", uVar2.f4239b));
        }
        return new C0754ui(aVar2, aVar3);
    }
}
