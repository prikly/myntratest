package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Tl;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class Ri {

    /* renamed from: a  reason: collision with root package name */
    private final U9 f4893a;

    Ri() {
        this(new U9());
    }

    /* access modifiers changed from: package-private */
    public void a(Ui ui, Tl.a aVar) {
        If.p pVar = new If.p();
        JSONObject optJSONObject = aVar.optJSONObject("sdk_list");
        if (optJSONObject != null) {
            Long a2 = Tl.a(optJSONObject, "min_collecting_interval_seconds", (Long) null);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            pVar.f4222a = Tl.a(a2, timeUnit, pVar.f4222a);
            pVar.f4223b = Tl.a(Tl.a(optJSONObject, "min_first_collecting_delay_seconds", (Long) null), timeUnit, pVar.f4223b);
            pVar.f4224c = Tl.a(Tl.a(optJSONObject, "min_collecting_delay_after_launch_seconds", (Long) null), timeUnit, pVar.f4224c);
            pVar.f4225d = Tl.a(Tl.a(optJSONObject, "min_request_retry_interval_seconds", (Long) null), timeUnit, pVar.f4225d);
        }
        ui.a(this.f4893a.toModel(pVar));
    }

    Ri(U9 u9) {
        this.f4893a = u9;
    }
}
