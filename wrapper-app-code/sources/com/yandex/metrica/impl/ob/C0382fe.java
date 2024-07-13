package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Cf;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.fe  reason: case insensitive filesystem */
public class C0382fe implements ProtobufConverter<C0357ee, Cf.a> {

    /* renamed from: a  reason: collision with root package name */
    private final C0332de f5813a = new C0332de();

    /* renamed from: a */
    public Cf.a fromModel(C0357ee eeVar) {
        Cf.a aVar = new Cf.a();
        if (!TextUtils.isEmpty(eeVar.f5743a)) {
            aVar.f3822a = eeVar.f5743a;
        }
        aVar.f3823b = eeVar.f5744b.toString();
        aVar.f3824c = eeVar.f5745c;
        aVar.f3825d = eeVar.f5746d;
        aVar.f3826e = this.f5813a.fromModel(eeVar.f5747e).intValue();
        return aVar;
    }

    /* renamed from: a */
    public C0357ee toModel(Cf.a aVar) {
        JSONObject jSONObject;
        String str = aVar.f3822a;
        String str2 = aVar.f3823b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0357ee(str, jSONObject, aVar.f3824c, aVar.f3825d, this.f5813a.toModel(Integer.valueOf(aVar.f3826e)));
        }
        jSONObject = new JSONObject();
        return new C0357ee(str, jSONObject, aVar.f3824c, aVar.f3825d, this.f5813a.toModel(Integer.valueOf(aVar.f3826e)));
    }
}
